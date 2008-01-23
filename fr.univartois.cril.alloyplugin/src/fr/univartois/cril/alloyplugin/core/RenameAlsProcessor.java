package fr.univartois.cril.alloyplugin.core;

import org.eclipse.core.runtime.*;
import org.eclipse.ltk.core.refactoring.*;
import org.eclipse.ltk.core.refactoring.participants.*;


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
