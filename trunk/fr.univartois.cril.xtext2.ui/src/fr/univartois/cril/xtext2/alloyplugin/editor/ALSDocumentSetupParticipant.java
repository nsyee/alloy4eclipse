package fr.univartois.cril.xtext2.alloyplugin.editor;

import org.eclipse.core.filebuffers.IDocumentSetupParticipant;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;

import fr.univartois.cril.xtext2.ui.activator.AlsActivator;


/**
 * Classe participant à l'initialisation du document. 
 * 
 */

public class ALSDocumentSetupParticipant implements
		IDocumentSetupParticipant {

	/**
	 * Set the DocumentPartitioner for Alloy documents.
	 * @param document Document to setup.
	 * @see org.eclipse.core.filebuffers.IDocumentSetupParticipant#setup(org.eclipse.jface.text.IDocument)
	 */
	public void setup(IDocument document) {
			if (document instanceof IDocumentExtension3) {	// Notion de partitionnements multiples
				IDocumentExtension3 extension3= (IDocumentExtension3) document;
				// Crée le partitioner
				IDocumentPartitioner partitioner= new FastPartitioner(ALSPartitionScanner.instance(), ALSPartitionScanner.ALS_PARTITION_TYPES);
				// Attache le partitioner au document.
				extension3.setDocumentPartitioner(AlsActivator.ALS_PARTITIONING, partitioner);
				// Attache le document au partitioner.
				partitioner.connect(document);
			}
	}

}
