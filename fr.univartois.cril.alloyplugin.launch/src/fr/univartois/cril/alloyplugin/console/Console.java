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
	
	public static AlloyMessageConsole findAlloyConsole(String fileLocation) {
		String consoleId=getConsoleId(fileLocation);
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (consoleId.equals(existing[i].getName()))
				return (AlloyMessageConsole) existing[i];
		//no console found, so create a new one
		AlloyMessageConsole myConsole = new AlloyMessageConsole(consoleId,fileLocation);
		IPatternMatchListener listener =  new ConsoleListener();
		myConsole.addPatternMatchListener(listener);		
		conMan.addConsoles(new IConsole[]{myConsole});		
		return myConsole;
	}
	
	/** add a link**/
	public static void addFileLink(MessageConsole myConsole,String filelocation,int offset,int lenght,int line){		
		
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
	 * Print a message to an Alloy spec console.
	 * @param message
	 * @param ConsoleId
	 */
	public static void printToConsole(String message,String filelocation){	  
		MessageConsole myConsole = findAlloyConsole(filelocation);
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(message);
	}
	/**
	 * Print a message to an Alloy spec console with a specific color.
	 * @param message
	 * @param ConsoleId
	 */
	public static void printToConsoleColor(String message,String filelocation,Color c,int style){	  
		MessageConsole myConsole = findAlloyConsole(filelocation);
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
	public static void printToConsoleErr(String message,String filelocation){		
		printToConsoleColor(message,filelocation,new Color(null,255 ,0,0),SWT.DEFAULT);		
	}
	public static void printToConsoleBold(String message,String filelocation){		
		printToConsoleColor(message,filelocation,new Color(null,0,0,0),SWT.BOLD);		
	}
	
	public static void clearConsole(String filelocation){	  
		//MessageConsole myConsole = findConsole(getConsoleId(filelocation));
		//myConsole.clearConsole();
	}
	/**
	 * Returns the Console Id of an Alloy file.
	 * @param ConsoleId
	 * @return
	 */
	private static String getConsoleId(String ConsoleId) {		
		return "[Alloy Console] "+ConsoleId;
	}
	
	/**
	 * Reveals the default Eclipse Console View.
	 * @param page
	 * @param ConsoleId
	 */
	
	public static void revealConsoleView(String filelocation) {
		IWorkbenchPage page=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IConsole myConsole = findAlloyConsole(filelocation);	    
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view;
		try {
			view = (IConsoleView) page.showView(id);
			view.display(myConsole);			
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
