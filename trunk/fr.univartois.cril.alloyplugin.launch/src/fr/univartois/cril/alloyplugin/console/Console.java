package fr.univartois.cril.alloyplugin.console;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.console.FileLink;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.IPatternMatchListener;
import org.eclipse.ui.console.MessageConsole;


public class Console {
	
	
/**
 * Returns a AlloyMessageConsole from the Eclipse console view.
 * Create one if not found.
 * */	
	
	public static AlloyMessageConsole findConsole(String consoleId,String filename){
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (consoleId.equals(existing[i].getName()))
				return (AlloyMessageConsole) existing[i];
		//no console found, so create a new one
		AlloyMessageConsole myConsole = new AlloyMessageConsole(consoleId,filename);
		IPatternMatchListener listener =  new ConsoleListener();
		myConsole.addPatternMatchListener(listener);		
		conMan.addConsoles(new IConsole[]{myConsole});		
		return myConsole;
	}
	
	
	public static AlloyMessageConsole findAlloyConsole(String filename){
		return findConsole(getAlloyConsoleId(filename),filename);
		
	}
	public static AlloyMessageConsole findAlloyParserConsole(String filename){
		AlloyMessageConsole amc=findConsole(getAlloyParserConsoleId(filename),filename);
		amc.setFileLocation(filename);
		return amc;
		
	}
	
	/** add a link**/
	public static void addFileLink(MessageConsole myConsole,String filelocation,int offset,int lenght,int line){		
		if (filelocation==null) return;
		IFile iff = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filelocation));		

		if(iff==null) return;
		
		FileLink fl=new FileLink(iff,null, -1, -1, line);
		
		try {			
			myConsole.addHyperlink(fl,offset+lenght+4,iff.getLocation().toString().length());
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
	}
	
	/**
	 * Reveals the default Eclipse Console View and display the given console.
	 * @param page
	 * @param ConsoleId
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
	
	
	
	/**
	 * Returns the Console Id of an Alloy file.
	 * @param ConsoleId
	 * @return
	 */
	private static String getAlloyConsoleId(String filename) {		
		return "[Alloy Console] "+filename;
	}
	/**
	 * Returns the Parser Console Id of an Alloy file.
	 * @param ConsoleId
	 * @return
	 */
	private static String getAlloyParserConsoleId(String filename) {		
		return "[Alloy Parser Console]";
	}
	
}
