package fr.univartois.cril.alloyplugin.editor;



import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;

/**
 * Class for Alloy editor. 
 */

public class ALSEditor extends TextEditor {
	

	private AlloyContentOutlinePage fOutlinePage=null;
	//AlloySolutionViewer asv;
	
	
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


	/**
	 * Used for contentoutline (not implement yet)
	 * */

	public Object getAdapter(Class required) {
		//log.info("Adapter for "+required+" required");
		if (IContentOutlinePage.class.equals(required)) {	
			
			if (fOutlinePage == null) {
			
				fOutlinePage= new AlloyContentOutlinePage(this);
			}
			
			return fOutlinePage;
		}
		return super.getAdapter(required);		
	}

	/**
	 * Try to return an IResource from IEditorInput.
	 * Returns null if no such object can be found.  
	 */
	public IResource getResource(IEditorInput input) {				
		IResource ir=(IResource)input.getAdapter(IResource.class);		
		return ir;		
	}
	
	/**
	 * Return an IALSFile from the editor.
	 *   
	 */
	protected IALSFile getALSFile() {
		return AlloyPlugin.getDefault().getALSFile(getResource(getEditorInput()));		
	}


	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {		
		super.doSetInput(input);
		if(fOutlinePage!=null) fOutlinePage.setViewerInput();
	}
}
