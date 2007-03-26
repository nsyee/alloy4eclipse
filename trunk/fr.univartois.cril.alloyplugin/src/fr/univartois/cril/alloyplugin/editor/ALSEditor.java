package fr.univartois.cril.alloyplugin.editor;


import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import fr.univartois.cril.alloyplugin.AlloyPlugin;

/**
 * Class for Alloy editor. 
 */

public class ALSEditor extends /*Abstract*/TextEditor {
	private AlloyContentOutlinePage fOutlinePage=null;
	AlloySolutionViewer asv;
	private ALSFile file;
	
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
		//file=new ALSFile(getResource());		
		AlloyPlugin.getDefault().fireFileLoaded(getALSFile());		
		

	}
	public void setFocus() {
		super.setFocus();
		AlloyPlugin.getDefault().fireSetFocus(getALSFile());	
	}
	public void close(boolean save) {
		super.close(save);		
		AlloyPlugin.getDefault().fireFileClosed(getALSFile());
	}
	public void dispose() {
		super.dispose();		
		AlloyPlugin.getDefault().fireFileClosed(getALSFile());
	}
	/**
	 * Used for contentoutline (not implement yet)
	 * */

	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required)) {	
			if (fOutlinePage == null) {
				fOutlinePage= new AlloyContentOutlinePage(getDocumentProvider(), this);
				if (asv==null) asv=new AlloySolutionViewer();
				if (getEditorInput() != null)
					fOutlinePage.setInput(getEditorInput());
			}
			return asv;
		}
		
		
		return super.getAdapter(required);
		
	}
	/**
	 * Extends editorSaved() for launching Alloy parser.
	 * */
	public void editorSaved(){		
		super.editorSaved();		
		//launchParser();
		AlloyPlugin.getDefault().fireFileSaved(getALSFile());
	}

	/**
	 * Try to return an IResource from IEditorInput.
	 * Returns null if no such object can be found.  
	 */
	private IResource getResource(IEditorInput input) {		
		IResource ir=(IResource)input.getAdapter(IResource.class);		
		return ir;		
	}
	
	/**
	 * Return an ALSFile from the editor.
	 *   
	 */
	private ALSFile getALSFile() {
		if (file==null)file=new ALSFile(getResource(getEditorInput()));
		else file.setResource(getResource(getEditorInput()));
		return file;
	}
}
