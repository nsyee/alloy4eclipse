package fr.univartois.cril.alloyplugin.editor;

import fr.univartois.cril.alloyplugin.launch.LaunchCompiler;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorPart;
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

	public void doSave(IProgressMonitor progressMonitor){
		super.doSave(progressMonitor);
		System.out.println("coucou");
		IResource res=getResource();
		if( res!=null)
			//System.out.println("ok");
			LaunchCompiler.parser(res.getLocation().toString());//	à tester
		else System.out.println("bug");
	}

	/**
	 * Try to return an IResource object from editor. Returns null if no such object can be found.  
	 */
	private IResource getResource() {		
		IResource ir=(IResource)this.getEditorInput().getAdapter(IResource.class);
		return ir;
	}
}
