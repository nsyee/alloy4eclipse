package fr.univartois.cril.xtext.alloyplugin.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;
import org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;

import fr.univartois.cril.xtext.alloyplugin.core.RenameAlsInfo;
import fr.univartois.cril.xtext.alloyplugin.core.RenameAlsProcessor;
import fr.univartois.cril.xtext.alloyplugin.core.RenameAlsRefactoring;

/**
 * 
 * @author desruelles lionel
 * 
 */

public class RenameAls implements IEditorActionDelegate {

	private static final String EXT_ALS = "als"; //$NON-NLS-1$

	private ISelection selection;
	private IEditorPart targetEditor;
	private boolean onWordFile;

	private RenameAlsInfo info = new RenameAlsInfo();

	public void setActiveEditor(final IAction action,
			final IEditorPart targetEditor) {
		this.targetEditor = targetEditor;
		onWordFile = false;
		IFile file = getFile();
		if (file != null && EXT_ALS.equals(file.getFileExtension())) {
			onWordFile = true;
		}
	}

	public void run(final IAction action) {
		if (!onWordFile) {
			refuse();
		} else {
			if (selection != null && selection instanceof ITextSelection) {
				applySelection((ITextSelection) selection);
				if (saveAll()) {
					openWizard();
				}
			}
		}
	}

	public void selectionChanged(final IAction action,
			final ISelection selection) {
		this.selection = selection;
	}

	private void applySelection(final ITextSelection textSelection) {
		info.setOldName(textSelection.getText());
		info.setNewName(textSelection.getText());
		info.setOffset(textSelection.getOffset());
		info.setSourceFile(getFile());
	}

	private void refuse() {
		String title = "Rename Alloy";
		String message = "This refactoring is only available on Alloy files.";
		MessageDialog.openInformation(getShell(), title, message);
	}

	private static boolean saveAll() {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		return IDE.saveAllEditors(new IResource[] { workspaceRoot }, false);
	}

	private void openWizard() {
		RefactoringProcessor processor = new RenameAlsProcessor(info);
		RenameAlsRefactoring ref = new RenameAlsRefactoring(processor);
		RenameAlsWizard wizard = new RenameAlsWizard(ref, info);
		RefactoringWizardOpenOperation op = new RefactoringWizardOpenOperation(
				wizard);
		try {
			String titleForFailedChecks = ""; //$NON-NLS-1$
			op.run(getShell(), titleForFailedChecks);
		} catch (final InterruptedException irex) {
		}
	}

	private Shell getShell() {
		Shell result = null;
		if (targetEditor != null) {
			result = targetEditor.getSite().getShell();
		} else {
			result = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getShell();
		}
		return result;
	}

	private final IFile getFile() {
		IFile result = null;
		if (targetEditor instanceof ITextEditor) {
			ITextEditor editor = (ITextEditor) targetEditor;
			IEditorInput input = editor.getEditorInput();
			if (input instanceof IFileEditorInput) {
				result = ((IFileEditorInput) input).getFile();
			}
		}
		return result;
	}

}
