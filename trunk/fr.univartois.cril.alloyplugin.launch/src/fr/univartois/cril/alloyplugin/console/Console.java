package fr.univartois.cril.alloyplugin.console;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.console.FileLink;
import org.eclipse.jface.text.BadLocationException;
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
import org.eclipse.ui.console.IPatternMatchListener;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;




public class Console {
	
	
/**
 * Returns a AlloyMessageConsole from the Eclipse console view.
 * Create one if not found.
 * */	
	
	public static AlloyMessageConsole findConsole(String consoleId){
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (consoleId.equals(existing[i].getName()))
				return (AlloyMessageConsole) existing[i];
		//no console found, so create a new one
		AlloyMessageConsole myConsole = new AlloyMessageConsole(consoleId);
		IPatternMatchListener listener =  new ConsoleListener();
		myConsole.addPatternMatchListener(listener);		
		conMan.addConsoles(new IConsole[]{myConsole});		
		return myConsole;
	}
	
	
	public static AlloyMessageConsole findAlloyConsole(String filename){
		return findConsole(getAlloyConsoleId(filename));
		
	}
	public static AlloyMessageConsole findAlloyParserConsole(String filename){
		AlloyMessageConsole amc=findConsole(getAlloyParserConsoleId(filename));
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
	 * Print a message to an Alloy spec console with a specific color.
	 * @param message
	 * @param ConsoleId
	 */
	private static void printToConsoleColor(String message,String consoleID,Color c,int style){	  
		MessageConsole myConsole = findConsole(consoleID);
		MessageConsoleStream out = myConsole.newMessageStream();
		out.setColor(c);
		out.setFontStyle(style);
		out.println(message);
		
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void printToConsoleErr(String message,String fileLocation){		
		printToConsoleColor(message,getAlloyConsoleId(fileLocation),new Color(null,255 ,0,0),SWT.DEFAULT);		
	}
	public static void printToConsoleBold(String message,String fileLocation){		
		printToConsoleColor(message,getAlloyConsoleId(fileLocation),new Color(null,0,0,0),SWT.BOLD);		
	}	
	public static void printToConsole(String message,String fileLocation){	  
		printToConsoleColor(message,getAlloyConsoleId(fileLocation),new Color(null,0,0,0),SWT.DEFAULT);
	}
	
	public static void printToParserConsoleErr(String message,String fileLocation){		
		printToConsoleColor(message,getAlloyParserConsoleId(fileLocation),new Color(null,255 ,0,0),SWT.DEFAULT);		
	}
	public static void printToParserConsoleBold(String message,String fileLocation){		
		printToConsoleColor(message,getAlloyParserConsoleId(fileLocation),new Color(null,0,0,0),SWT.BOLD);		
	}	
	public static void printToParserConsole(String message,String fileLocation){	  
		printToConsoleColor(message,getAlloyParserConsoleId(fileLocation),new Color(null,0,0,0),SWT.DEFAULT);
	}
	/**
	 * Clear Parser Console
	 * @param fileLocation
	 */
	public static void clearParserConsole(String fileLocation){	  
		MessageConsole myConsole = findAlloyParserConsole(fileLocation);
		myConsole.getDocument().set("");
	}
	
	/**
	 * Reveals the default Eclipse Console View.
	 * @param page
	 * @param ConsoleId
	 */
	
	private static void revealConsoleView(String consoleID) {
		IWorkbenchPage page=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IConsole myConsole = findConsole(consoleID);	    
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view;
		try {
			view = (IConsoleView) page.showView(id);
			view.setPinned(false);
			//System.out.println("display");
			view.display(myConsole);			
		} catch (PartInitException e) {
			
			e.printStackTrace();
		}

	}
	public static void revealAlloyConsoleView(String filelocation) {
		revealConsoleView(getAlloyConsoleId(filelocation));		
	}
	public static void revealAlloyParserConsoleView(String filelocation) {
		revealConsoleView(getAlloyParserConsoleId(filelocation));		
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
