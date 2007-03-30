package fr.univartois.cril.alloyplugin.editor;


import java.util.logging.Logger;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ALSFile;
import fr.univartois.cril.alloyplugin.core.ui.ALSFileFactory;

/**
 * Class for Alloy editor. 
 */

public class ALSEditor extends TextEditor {
	private static final Logger log = Logger.getLogger("alloy");

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


	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		
		super.init(site, input);
		
		AlloyPlugin.getDefault().fireFileOpen(getALSFile());
	}


	public void setFocus() {
		super.setFocus();
		AlloyPlugin.getDefault().fireSetFocus(getALSFile());	
	}
	
	public void dispose() {
		super.dispose();
		System.out.println("dispose");
		AlloyPlugin.getDefault().fireFileClosed(getALSFile());
	}
	/**
	 * Used for contentoutline (not implement yet)
	 * */

	public Object getAdapter(Class required) {
		//log.info("Adapter for "+required+" required");
		if (IContentOutlinePage.class.equals(required)) {	
			log.info("Providing adapter for IContentOutlinePage");
			if (fOutlinePage == null) {
				log.info("Ours is null, creating a new one");
				fOutlinePage= new AlloyContentOutlinePage(this);
			}
			log.info("Providing my adapter");
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
	 * Return an ALSFile from the editor.
	 *   
	 */
	protected ALSFile getALSFile() {
		return ALSFileFactory.getALSFile(getResource(getEditorInput()));		
	}
}
