package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.core.resources.IResource;

public class LaunchShortcut implements ILaunchShortcut {
	/**launch from selection*/
	public void launch(ISelection selection, String mode) {
		StructuredSelection sel;

		if (selection instanceof StructuredSelection)
		{   
			sel=(StructuredSelection)selection;
			launch(getResource(sel));
		}
	}
	
	/**launch from editor*/
	public void launch(IEditorPart editor, String mode) {		
		//IWorkbenchPage page
		launch(getResource(editor));
	}
	
	/**
	 * Launch the Alloy compiler for a given file. 
	 */
	private void launch(IResource res) {
		//AlloyLaunching.execAllCommandsfromAFile(res);			
	}
	

	
	/**
	 * Try to return an IResource object from a IEditorPart. Returns null if no such object can be found.  
	 */
	private IResource getResource(IEditorPart editor) {		
		return (IResource)editor.getEditorInput().getAdapter(IResource.class);
	}

	
	
	/**
	 * Try to return an IResource object from a StructuredSelection. Returns null if no such object can be found.	  
	 */
	private IResource getResource(StructuredSelection sel) {		
		return (IResource) ((IAdaptable)sel.getFirstElement()).getAdapter(IResource.class);
	}
}
