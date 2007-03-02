package fr.univartois.cril.alloyplugin.editor;

import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * Class for Alloy editor. 
 */

public class ALSEditor extends TextEditor {
	private AlloyContentOutlinePage fOutlinePage;
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

	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required)) {			
			if (fOutlinePage == null) {
				fOutlinePage= new AlloyContentOutlinePage(getDocumentProvider(), this);
				if (getEditorInput() != null)
					fOutlinePage.setInput(getEditorInput());
			}
			return fOutlinePage;
		}
		return super.getAdapter(required);
	}
	
	public void doSave(IProgressMonitor progressMonitor){
		super.doSave(progressMonitor);
		launchParser();	
		
	}
	public void doSaveAs(){		
		super.doSaveAs();
		launchParser();		
	}
	/**
	 * Launch the Alloy Parser.
	 * */
	private void launchParser(){
		IResource res=getResource();
		if(res!=null)			
			AlloyLaunching.launchParser(res.getLocation().toString());
	}

	/**
	 * Try to return an IResource object from editor. Returns null if no such object can be found.  
	 */
	private IResource getResource() {		
		IResource ir=(IResource)this.getEditorInput().getAdapter(IResource.class);
		return ir;
	}
}
