package fr.univartois.cril.xtext.alloyplugin.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;
import org.eclipse.ltk.core.refactoring.participants.SharableParticipants;


/**
 * 
 * @author lionel desruelles
 *
 */
public class RenameAlsProcessor extends RefactoringProcessor {

	private final RenameAlsInfo info;
	private final RenameAlsDelegate delegate;

	public RenameAlsProcessor(final RenameAlsInfo info) {
		this.info = info;
		delegate = new RenameAlsDelegate(info);
	}

	public Object[] getElements() {
		return new Object[] { info.getOldName() };
	}

	public String getIdentifier() {
		return getClass().getName();
	}

	public String getProcessorName() {
		return "name";
	}

	public boolean isApplicable() throws CoreException {
		return true;
	}

	public RefactoringStatus checkInitialConditions(final IProgressMonitor pm) {
		return delegate.checkInitialConditions();
	}

	public RefactoringStatus checkFinalConditions(final IProgressMonitor pm,
			final CheckConditionsContext context) {
		return delegate.checkFinalConditions(pm, context);
	}

	public Change createChange(final IProgressMonitor pm) {
		CompositeChange result = new CompositeChange(getProcessorName());
		delegate.createChange(pm, result);
		return result;
	}

	public RefactoringParticipant[] loadParticipants(
			final RefactoringStatus status,
			final SharableParticipants sharedParticipants) {
		return new RefactoringParticipant[0];
	}

}
