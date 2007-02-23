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
	/**launch from selection*/
	public void launch(ISelection selection, String mode) {

		StructuredSelection sel;

		if (selection instanceof StructuredSelection)
		{   
			sel=(StructuredSelection)selection;
			Console.revealConsoleView(getFileLocation(getResource(sel)));
			launch(getFileLocation(getResource(sel)));

		}
	}
	/**launch from editor*/
	public void launch(IEditorPart editor, String mode) {		

		//IWorkbenchPage page
		launch(getFileLocation(getResource(editor)));
	}

	/**
	 * Launch the Alloy compiler for a given file. 
	 */
	private void launch(String fileLocation) {
		Console.revealConsoleView(fileLocation);
		try {			
			LaunchCompiler.command(fileLocation);			
		} catch (Err e) {
			Console.findAlloyConsole(fileLocation).setErr(e);
			Console.printToConsoleErr(e.getMessage(), fileLocation);			
		}		
	}
	/**
	 * parse a file (can be used by external package).	  
	 */

	public static void launchParser(String filename) {
		Console.revealConsoleView(filename);	
		Console.clearConsole(filename);
		try {
			LaunchCompiler.localParser(filename, false);
		} catch (Err e) {
			Console.printToConsoleBold("=========== Parsing \""+filename+"\" =============",filename);
			Console.findAlloyConsole(filename).setErr(e);
			Console.printToConsoleErr(e.getMessage(), filename);
			return;
		}

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
