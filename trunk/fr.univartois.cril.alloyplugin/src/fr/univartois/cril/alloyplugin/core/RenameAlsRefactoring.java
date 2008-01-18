package fr.univartois.cril.alloyplugin.core;

import org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;

public class RenameAlsRefactoring extends ProcessorBasedRefactoring {
	private final RefactoringProcessor processor;

	public RenameAlsRefactoring(final RefactoringProcessor processor) {
		super(processor);
		this.processor = processor;
	}

	public RefactoringProcessor getProcessor() {
		return processor;
	}
}
