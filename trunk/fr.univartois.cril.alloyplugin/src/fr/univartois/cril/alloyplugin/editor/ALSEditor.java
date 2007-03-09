package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.core.resources.IResource;



import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
//

import fr.univartois.cril.alloyplugin.AlloyPlugin;

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
	
	public void init(IEditorSite site,IEditorInput input) throws PartInitException{		
		super.init(site, input);
		AlloyPlugin.getDefault().fireFileLoaded(getFileInputLocation());		
		//TextFileDocumentProvider d=(TextFileDocumentProvider) this.getDocumentProvider();
	//	System.out.println("d:"+d. .getDocument(null));
		
	}
	public void setFocus() {
		super.setFocus();
		AlloyPlugin.getDefault().fireSetFocus(getFileInputLocation());		
	}
/**
 * Used for contentoutline (not implement yet)
 * */
	
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
	/**
	 * Extends editorSaved() for launching Alloy parser.
	 * */
	public void editorSaved(){		
		super.editorSaved();
		
		//launchParser();
		AlloyPlugin.getDefault().fireFileSaved(getFileInputLocation());
	}
	
	
	/**
	 * Try to get the location of the file edited by this editor. 
	 * Returns the file location or null;
	 */
	private String getFileInputLocation(){
		IResource res=getResource();
		if(res!=null)
			return res.getLocation().toString();
		else
			return null;
	}
	/**
	 * Try to return an IResource from editor.
	 * Returns null if no such object can be found.  
	 */
	private IResource getResource() {		
		IResource ir=(IResource)this.getEditorInput().getAdapter(IResource.class);
		return ir;		
	}
}
