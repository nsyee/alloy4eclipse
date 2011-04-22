package fr.univartois.cril.xtext.alloyplugin.core;

import org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;

/**
 * 
 * @author lionel desruelles
 *
 */
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
