package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.util.ALSTextAttributeProvider;


;/**
 *  
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
	 * Met en place la coloration syntaxique. Attribute one damager and one repairers for each partition type.
	 * @param sourceViewer SourceViewer pour lequel on configure le reconciler.
	 * @return the reconciler.
	 * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer)
	 */
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		ALSTextAttributeProvider provider= AlloyPlugin.getDefault().getTextAttributeProvider();
		PresentationReconciler reconciler= new PresentationReconciler();
		reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		
		// Crée le damager/repairer pour le code
		DefaultDamagerRepairer ddr = new DefaultDamagerRepairer(AlloyPlugin.getDefault().getALSCodeScanner());
		reconciler.setDamager(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(ddr, IDocument.DEFAULT_CONTENT_TYPE);

		// Crée le damager/repairer pour les commentaires
		ddr= new DefaultDamagerRepairer(
				new SingleTokenScanner(provider.getAttribute(ALSTextAttributeProvider.COMMENT_ATTRIBUTE))
									);
		reconciler.setDamager(ddr, ALSPartitionScanner.ALS_COMMENT);
		reconciler.setRepairer(ddr, ALSPartitionScanner.ALS_COMMENT);
	
		return reconciler;
	}

    @Override
    public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
        return new DefaultAnnotationHover();
    }
    
}
