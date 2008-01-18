package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

import fr.univartois.cril.alloyplugin.core.RenameAlsInfo;
import fr.univartois.cril.alloyplugin.core.RenameAlsRefactoring;


/**
 * 
 * @author desruelles lionel
 *
 */
public class RenameAlsWizard extends RefactoringWizard {

	private final RenameAlsInfo info;

	public RenameAlsWizard(final RenameAlsRefactoring refactoring,
			final RenameAlsInfo info) {
		super(refactoring, DIALOG_BASED_USER_INTERFACE);
		this.info = info;
	}

	protected void addUserInputPages() {
		setDefaultPageTitle(getRefactoring().getName());
		addPage(new RenameAlsInputPage(info));
	}
}
