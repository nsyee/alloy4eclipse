package fr.univartois.cril.alloyplugin.console;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;

import edu.mit.csail.sdg.alloy4.Err;

public class Console {	

	/**
	 * Returns a AlloyMessageConsole from the Eclipse console view.
	 * Create one if not found.
	 */	

	public static AlloyMessageConsole findConsole(String consoleId,String filename){
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (consoleId.equals(existing[i].getName()))
				return (AlloyMessageConsole) existing[i];
		//no console found, so create a new one
		AlloyMessageConsole myConsole = new AlloyMessageConsole(consoleId);				
		conMan.addConsoles(new IConsole[]{myConsole});		
		return myConsole;
	}


	public static AlloyMessageConsole findAlloyConsole(String filename){
		return findConsole(getAlloyConsoleId(filename),filename);

	}
	public static AlloyMessageConsole findAlloyErrorConsole(String filename){
		AlloyMessageConsole amc=findConsole(getAlloyErrorConsoleId(filename),filename);		
		return amc;

	}	

	/**
	 * Print a Err exception in the console with Hyperlink if needed.
	 */
	public static void printErr(Err e) {
		AlloyMessageConsole amc=findAlloyErrorConsole("");
		amc.clear();
		amc.addErrListener(e);
		amc.reveal();
		amc.print(e.getMessage(),new Color(null,255 ,0,0),SWT.DEFAULT);		
	}
	/**
	 * Returns the Console Id of an Alloy model file.	
	 */
	private static String getAlloyConsoleId(String filename) {		
		return "[Alloy Console] "+filename;
	}
	/**
	 * Returns the Parser Console Id of an Alloy file.
	 * 
	 */
	private static String getAlloyErrorConsoleId(String filename) {		
		return "[Alloy Error Console]";
	}

	/**
	 * Reveals the default Eclipse Console View and display the given console.
	 */

	protected static void revealConsoleView(AlloyMessageConsole console) {
		IWorkbenchPage page=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();			    
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view;
		try {
			view = (IConsoleView) page.showView(id);
			view.setPinned(false);						
			view.display(console);
			console.activate();

		} catch (PartInitException e) {

			e.printStackTrace();
		}
	}

}