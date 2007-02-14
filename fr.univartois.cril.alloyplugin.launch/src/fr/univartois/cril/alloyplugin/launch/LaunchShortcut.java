package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;


import org.eclipse.core.resources.IResource;
import edu.mit.csail.sdg.alloy4.Err;
import fr.univartois.cril.alloyplugin.console.Console;

public class LaunchShortcut implements ILaunchShortcut {

	public void launch(ISelection selection, String mode) {

		StructuredSelection sel;
		if (selection instanceof StructuredSelection)
		{   
			sel=(StructuredSelection)selection;
			launch(getFileLocation(getResource(sel)));			
		}
	}

	public void launch(IEditorPart editor, String mode) {		
		Console.revealConsoleView(editor.getSite().getPage(),getFileLocation(getResource(editor)));
		//IWorkbenchPage page
		launch(getFileLocation(getResource(editor)));

	}
	/**
	 * Launch the Alloy compiler for a given file. 
	 */
	private void launch(String fileLocation) {		
		try {			
			LaunchCompiler.command(fileLocation);
		} catch (Err e) {Console.printToConsole(e.getMessage(), fileLocation);}		
	}
	/**
	 * Try to return an IResource object from a IEditorPart. Returns null if no such object can be found.  
	 */
	private IResource getResource(IEditorPart editor) {		
		IResource ir=(IResource)editor.getEditorInput().getAdapter(IResource.class);
		return ir;
	}

	/**
	 * Try to return an IResource object from a StructuredSelection. Returns null if no such object can be found.	  
	 */
	private IResource getResource(StructuredSelection sel) {		
		IResource ir=(IResource) ((IAdaptable)sel.getFirstElement()).getAdapter(IResource.class);
		return ir;
	}
	/**
	 * Returns a portable String of the IResource file location. 
	 * @param ir
	 * @return
	 */
	private String getFileLocation(IResource ir) {
		IPath ip=ir.getLocation();
		return ip.toPortableString();		
	}
}
