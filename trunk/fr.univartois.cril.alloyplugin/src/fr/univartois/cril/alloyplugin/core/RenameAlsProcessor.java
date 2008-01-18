package fr.univartois.cril.alloyplugin.core;

import org.eclipse.core.runtime.*;
import org.eclipse.ltk.core.refactoring.*;
import org.eclipse.ltk.core.refactoring.participants.*;

public class RenameAlsProcessor extends RefactoringProcessor {

	private final RenameAlsInfo info;
	private final RenameAlsDelegate delegate;

	public RenameAlsProcessor(final RenameAlsInfo info) {
		this.info = info;
		delegate = new RenameAlsDelegate(info);
	}

	public Object[] getElements() {
		// usually, this would be some element object in the object model on
		// which
		// we work (e.g. a Java element if we were in the Java Model); in this
		// case
		// we have only the name
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
		// This would be the place to load the participants via the
		// ParticipantManager and decide which of them are allowed to
		// participate.
		return new RefactoringParticipant[0];
	}

}
