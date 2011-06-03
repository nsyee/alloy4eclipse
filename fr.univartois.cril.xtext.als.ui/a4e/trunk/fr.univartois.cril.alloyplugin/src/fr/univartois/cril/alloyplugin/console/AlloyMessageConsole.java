package fr.univartois.cril.alloyplugin.console;


import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.ui.console.FileLink;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IPatternMatchListener;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import edu.mit.csail.sdg.alloy4.Err;

/**
 * A MessageConsole with useful methods for infos and Err printing.
 */

public class AlloyMessageConsole extends MessageConsole {
	IPatternMatchListener listener;
	public AlloyMessageConsole(String name) {
		super(name, null);

	}

	/**
	 * Add an listener which matchs the filename from Err in the console,
	 * and transform it in a Hyperlink.
	 * */

	protected void addErrListener(Err e){	
		this.removePatternMatchListener(listener);
		listener =new ConsoleErrListener(e);
		this.addPatternMatchListener(listener);		
	}

	//public void addPatternMatchListener(IPatternMatchListener listener){
	//this.setPatternMatch
	//}


	/**
	 * Print message in the console.
	 */
	protected  void print(final String message,final Color c,final int style){		
		//try to get the display from platform......			
		Display display = PlatformUI.getWorkbench().getDisplay();
		//this.
		if (display!=null)//demande a display d'executer le print (dans un thread graphique)
			display.asyncExec(
					new Runnable() {
						public void run(){
							print2(message,c,style);
						}
					});
		
	}
	
	
	
	protected void print2(String message,Color c,int style){		
		final MessageConsoleStream out = this.newMessageStream();
		out.setColor(c);
		out.setFontStyle(style);
		out.println(message);
		try {
			out.close();
		} catch (IOException e) {
//			 TODO Auto-generated method stub
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * Print message in the console.
	 */
	public void print (final String message) {
		print(message,new Color(null,0,0,0),SWT.DEFAULT);		
	}
	
	
	
	/**
	 * Print message in the console.
	 */
	public void printInfo (String message) {
		print(message,new Color(null,0,0,0),SWT.BOLD);		
	}
	public void printErr(String message) {
		print(message,new Color(null,128,0,0),SWT.DEFAULT);
		
	}

	/** 
	 * Add a Filelink in the console.
	 */
	protected void addFileLink (String filename, int offset, int lenght, int line){		
		if (filename!=null){
			IFile iff = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filename));
			
			if (iff!=null){
				FileLink fl=new FileLink(iff,null, -1, -1,line);

				try {			
					//this.addHyperlink(fl,offset+lenght+4,iff.getLocation().toString().length());
					this.addHyperlink(fl,offset,lenght);
				} catch (BadLocationException e) {
//					 TODO Auto-generated method stub			
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	/**
	 * Clear console content.
	 */
	public void clear() {
		Display display = PlatformUI.getWorkbench().getDisplay();
		//this.
		if (display!=null)//demande a display d'executer le print (dans un thread graphique)
			display.syncExec(
					new Runnable() {
						public void run(){
							AlloyMessageConsole.this.getDocument().set("");
						}
					});
		
		

	}
	
	

	
}
