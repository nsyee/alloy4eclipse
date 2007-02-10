package fr.univartois.cril.alloyplugin.editor;


import org.eclipse.ui.editors.text.TextEditor;

/**
 * Classe gérant le comportement de l'éditeur Alloy. 
 */
public class ALSEditor extends TextEditor {
	/**
	 * Method called at editor initialization.
	 * Set the SourceViewer.
	 * @see org.eclipse.ui.editors.text.TextEditor#initializeEditor()
	 */
	protected void initializeEditor() {
		super.initializeEditor();
		// Attache la configuration
		setSourceViewerConfiguration(new ALSSourceViewerConfiguration());
		
		
	}
}
