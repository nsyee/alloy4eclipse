package fr.univartois.cril.alloyplugin.core;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.*;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.ltk.core.refactoring.*;
import org.eclipse.ltk.core.refactoring.participants.*;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;

import fr.univartois.cril.alloyplugin.AlloyPlugin;

/**
 * 
 * @author desruelles lionel
 * 
 */

public class RenameAlsDelegate {
	private static final String EXT_ALS = "als"; //$NON-NLS-1$

	private final RenameAlsInfo info;
	// word file with the key to rename -> offset of the key
	private final Map<IFile, Collection<Integer>> alsFiles;

	RenameAlsDelegate(final RenameAlsInfo info) {
		this.info = info;
		alsFiles = new HashMap<IFile, Collection<Integer>>();
	}

	RefactoringStatus checkInitialConditions() {
		RefactoringStatus result = new RefactoringStatus();
		IFile sourceFile = info.getSourceFile();
		if (sourceFile == null || !sourceFile.exists()) {
			result.addFatalError("No source file could be determined.");
		} else if (info.getSourceFile().isReadOnly()) {
			result.addFatalError("File is read-only.");
		} else if (isEmpty(info.getOldName())) {
			result.addFatalError("The selected text is empty.");
		}
		return result;
	}

	RefactoringStatus checkFinalConditions(final IProgressMonitor pm,
			final CheckConditionsContext ctxt) {
		RefactoringStatus result = new RefactoringStatus();
		pm.beginTask("Checking", 100);
		// do something long-running here: traverse the entire project (or even
		// workspace) to look for all *.als files with the same bundle
		// base name
		IContainer rootContainer;
		if (info.isAllProjects()) {
			rootContainer = ResourcesPlugin.getWorkspace().getRoot();
		} else {
			rootContainer = info.getSourceFile().getProject();
		}
		search(rootContainer, result);
		pm.worked(50);

		if (ctxt != null) {
			IFile[] files = new IFile[alsFiles.size()];
			alsFiles.keySet().toArray(files);
			IConditionChecker checker = ctxt
					.getChecker(ValidateEditChecker.class);
			ValidateEditChecker editChecker = (ValidateEditChecker) checker;
			editChecker.addFiles(files);
		}
		pm.done();
		return result;
	}

	void createChange(final IProgressMonitor pm,
			final CompositeChange rootChange) {
		try {
			pm.beginTask("Collecting changes", 100);
			// the word which was directly selected by the user
			rootChange.add(createRenameChange());
			pm.worked(10);
			// all files in the same bundle
			if (info.isUpdateBundle()) {
				rootChange.addAll(createChangesForBundle());
			}
			pm.worked(90);
		} finally {
			pm.done();
		}
	}

	private Change createRenameChange() {
		// create a change object for the file that contains the word the
		// user has selected to rename
		IFile file = info.getSourceFile();
		TextFileChange result = new TextFileChange(file.getName(), file);
		// a file change contains a tree of edits, first add the root of them
		MultiTextEdit fileChangeRootEdit = new MultiTextEdit();
		result.setEdit(fileChangeRootEdit);

		Collection<Integer> col = getKeyOffsets(file);
		for (Integer offSet : col) {
			ReplaceEdit edit = new ReplaceEdit(offSet, info.getOldName()
					.length(), info.getNewName());
			fileChangeRootEdit.addChild(edit);
		}
		return result;
	}

	private Change[] createChangesForBundle() {
		List<TextFileChange> result = new ArrayList<TextFileChange>();
		Iterator<IFile> it = alsFiles.keySet().iterator();
		while (it.hasNext()) {
			IFile file = it.next();

			TextFileChange tfc = new TextFileChange(file.getName(), file);
			MultiTextEdit fileChangeRootEdit = new MultiTextEdit();
			tfc.setEdit(fileChangeRootEdit);

			// edit object for the text replacement in the file, this is the
			// only
			// child
			Collection<Integer> col = getKeyOffsets(file);
			for (Integer offSet : col) {
				ReplaceEdit edit = new ReplaceEdit(offSet, info.getOldName()
						.length(), info.getNewName());
				fileChangeRootEdit.addChild(edit);
			}
			result.add(tfc);
		}
		return result.toArray(new Change[result.size()]);
	}

	private boolean isEmpty(final String candidate) {
		return candidate == null || candidate.trim().length() == 0;
	}

	// whether the file is a .als file with the same base name as the
	// one we refactor and contains the key that interests us
	private boolean isToRefactor(final IFile file) {
		return EXT_ALS.equals(file.getFileExtension())
				&& file.getName().startsWith(getBundleBaseName());
	}

	private String getBundleBaseName() {
		String result = info.getSourceFile().getName();
		int underscoreIndex = result.indexOf('_');
		if (underscoreIndex != -1) {
			result = result.substring(0, underscoreIndex);
		} else {
			int index = result.indexOf(EXT_ALS) - 1;
			result = result.substring(0, index);
		}
		return result;
	}

	private void search(final IContainer rootContainer,
			final RefactoringStatus status) {
		try {
			IResource[] members = rootContainer.members();
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof IContainer) {
					search((IContainer) members[i], status);
				} else {
					IFile file = (IFile) members[i];
					handleFile(file, status);
				}
			}
		} catch (final CoreException cex) {
			status.addFatalError(cex.getMessage());
		}
	}

	private void handleFile(final IFile file, final RefactoringStatus status) {
		if (isToRefactor(file)) {
			Collection<Integer> keyOffsets = determineKeyOffset(file, status);
			if (keyOffsets.size() > 0) {
				alsFiles.put(file, keyOffsets);
			}
		}
	}

	private Collection<Integer> getKeyOffsets(final IFile file) {
		return alsFiles.get(file);
	}

	// finds the offset of the property key to rename
	// usually, this would be the job of a proper parser;
	// using a primitive brute-force approach here
	private Collection<Integer> determineKeyOffset(final IFile file,
			final RefactoringStatus status) {
		String content = readFileContent(file, status);
		Collection<Integer> col = new ArrayList<Integer>();
		boolean notFound = true;
		int from = 0;
		int candidateIndex = content.indexOf(info.getOldName(), from);
		while (candidateIndex != -1) {
			if (isKeyOccurrence(content, candidateIndex)) {
				col.add(candidateIndex);
				notFound = false;
			}
			from = candidateIndex + info.getOldName().length() + 1;
			candidateIndex = content.indexOf(info.getOldName(), from);
		}
		if (notFound) {
			// still nothing found, we add a warning to the status
			// (we have checked the file contains the property, so that we can't
			// determine it's offset is probably because of the rough way
			// employed
			// here to find it)
			String msg = "Could not find the name in file"
					+ file.getLocation().toOSString();
			status.addWarning(msg);
		}
		return col;
	}

	private String readFileContent(final IFile file,
			final RefactoringStatus refStatus) {
		String result = null;
		try {
			InputStream is = file.getContents();
			byte[] buf = new byte[1024];
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int len = is.read(buf);
			while (len > 0) {
				bos.write(buf, 0, len);
				len = is.read(buf);
			}
			is.close();
			result = new String(bos.toByteArray());
		} catch (Exception ex) {
			String msg = ex.toString();
			refStatus.addFatalError(msg);
			String pluginId = AlloyPlugin.getPluginId();
			IStatus status = new Status(IStatus.ERROR, pluginId, 0, msg, ex);
			AlloyPlugin.getDefault().getLog().log(status);
		}
		return result;
	}

	// we check only that there is a separator before the next line break (this
	// is not sufficient, the whole thing may be in a comment etc. ...)
	private boolean isKeyOccurrence(final String content,
			final int candidateIndex) {
		int index = candidateIndex + info.getOldName().length();
		return !Character.isJavaIdentifierPart(content.charAt(index));
	}

}
