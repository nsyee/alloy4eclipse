package fr.univartois.cril.xtext.alloyplugin.core;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.IConditionChecker;
import org.eclipse.ltk.core.refactoring.participants.ValidateEditChecker;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;

import fr.univartois.cril.xtext.ui.activator.AlsActivator;

/**
 * 
 * @author lionel desruelles
 * 
 */

public class RenameAlsDelegate {
	private static final String EXT_ALS = "als"; //$NON-NLS-1$

	private final RenameAlsInfo info;

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
		IContainer rootContainer = null;
		if (info.isAllProjects()) {
			rootContainer = ResourcesPlugin.getWorkspace().getRoot();
		} else if (info.isUpdateBundle()) {
			rootContainer = info.getSourceFile().getProject();
		}
		if (rootContainer != null) {
			search(rootContainer, result);
		} else {
			handleFile(info.getSourceFile(), result);
		}
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
			pm.worked(10);
			if (info.isUpdateBundle()) {
				rootChange.addAll(createChangesForBundle());
			} else
				rootChange.add(createRenameChange());
			pm.worked(90);
		} finally {
			pm.done();
		}
	}

	private Change createRenameChange() {

		IFile file = info.getSourceFile();
		TextFileChange result = new TextFileChange(file.getName(), file);
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

	private boolean isToRefactor(final IFile file) {
		return EXT_ALS.equals(file.getFileExtension());
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
			from = candidateIndex + info.getOldName().length(); // + 1;
			candidateIndex = content.indexOf(info.getOldName(), from);
		}
		if (notFound) {
			String msg = "Could not find "+info.getOldName()+" in file"
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
			String pluginId = AlsActivator.getPluginId();
			IStatus status = new Status(IStatus.ERROR, pluginId, 0, msg, ex);
			AlsActivator.getDefault().getLog().log(status);
		}
		return result;
	}

	private boolean isKeyOccurrence(final String content,
			final int candidateIndex) {
		int index = candidateIndex + info.getOldName().length();
		return (!Character.isJavaIdentifierPart(content
				.charAt(candidateIndex - 1)))
				&& (!Character.isJavaIdentifierPart(content.charAt(index)));
	}

}
