package fr.univartois.cril.alloyplugin.console;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class Console {
/**
 * Returns a console from the Eclipse console view.
 * Create one if not found.
 */
	private static MessageConsole findConsole(String consoleId) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (consoleId.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(consoleId, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
	/**
	 * Print a message to an Alloy file console.
	 * @param message
	 * @param ConsoleId
	 */
	public static void printToConsole(String message,String filelocation){	  
		MessageConsole myConsole = findConsole(getConsoleId(filelocation));
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println(message);
	}
	public static void printToConsoleErr(String message,String filelocation){	  
		MessageConsole myConsole = findConsole(getConsoleId(filelocation));
		MessageConsoleStream out = myConsole.newMessageStream();
		out.setColor(new Color(null,255 ,0,0));
		out.println(message);
	}
	public static void clearConsole(String filelocation){	  
		MessageConsole myConsole = findConsole(getConsoleId(filelocation));
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
	 * Reveals the Eclipse Console View.
	 * @param page
	 * @param ConsoleId
	 */
	public static void revealConsoleView(IWorkbenchPage page,String filelocation) {	  
		IConsole myConsole = findConsole(getConsoleId(filelocation));	    
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
