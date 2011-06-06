package fr.univartois.cril.xtext.alloyplugin.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import fr.univartois.cril.xtext.alloyplugin.AlloyPlugin;


;/**
 *  Configure scanner,color syntax,completion assist... 
 */
public class ALSSourceViewerConfiguration extends SourceViewerConfiguration {
	
	/** 
	 * Inner class used for one colored partition (like comment)
	 */
	static class SingleTokenScanner extends BufferedRuleBasedScanner {
		/**
		 * Constructor.
		 * @param attribute The only one textattribute of the partition.
		 */
		public SingleTokenScanner(TextAttribute attribute) {
			setDefaultReturnToken(new Token(attribute));
		}
	}
	
	private ALSEditor editor;
	
	public ALSSourceViewerConfiguration(ALSEditor editor) {
        this.editor = editor;
    }
	
	/**
	 * Return partition type id.
	 * @param sourceViewer
	 * @return partition type id.
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getConfiguredDocumentPartitioning(org.eclipse.jface.text.source.ISourceViewer)
	 */
	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return AlloyPlugin.ALS_PARTITIONING;
	}
	
	/**
	 * Return all the partition types that can be used in the document.
	 * @param sourceViewer SourceViewer pour lequel on renvoie les partitions.
	 * @return an array of all the partition types.
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getConfiguredContentTypes(org.eclipse.jface.text.source.ISourceViewer)
	 */
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
				ALSPartitionScanner.ALS_COMMENT,		// Commentaires
				IDocument.DEFAULT_CONTENT_TYPE			// Contenu par défaut (code)
		};
	}
	
	/**
	 * Syntax colors : Attribute one damager and one repairers for each partition type.
	 * @param sourceViewer 
	 * @return the reconciler.
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer)
	 */
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		ALSTextAttributeProvider provider= ALSTextAttributeProvider.instance();
		PresentationReconciler reconciler= new PresentationReconciler();
		reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		
		// damager/repairer for code
		DefaultDamagerRepairer ddr = new DefaultDamagerRepairer(ALSCodeScanner.instance());
		reconciler.setDamager(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(ddr, IDocument.DEFAULT_CONTENT_TYPE);

		// repairer for comments
		ddr= new DefaultDamagerRepairer(
				new SingleTokenScanner(provider.getAttribute(ALSTextAttributeProvider.COMMENT_ATTRIBUTE))
									);
		reconciler.setDamager(ddr, ALSPartitionScanner.ALS_COMMENT);
		reconciler.setRepairer(ddr, ALSPartitionScanner.ALS_COMMENT);
	
        ddr= new DefaultDamagerRepairer(
                new SingleTokenScanner(provider.getAttribute(ALSTextAttributeProvider.COMMENT_ANDREW_ATTRIBUTE))
                                    );
        reconciler.setDamager(ddr, ALSPartitionScanner.ALS_COMMENT_ANDREW);
        reconciler.setRepairer(ddr, ALSPartitionScanner.ALS_COMMENT_ANDREW);
		return reconciler;
	}

    @Override
    public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
        return new DefaultAnnotationHover();
    }
    
    @Override
    public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
    	ContentAssistant assistant= new ContentAssistant();
    	assistant.setContentAssistProcessor(new ALSCompletionProcessor(editor), IDocument.DEFAULT_CONTENT_TYPE);
    	assistant.enableAutoInsert(true);		
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);   	
    	return assistant;
    }    
}
