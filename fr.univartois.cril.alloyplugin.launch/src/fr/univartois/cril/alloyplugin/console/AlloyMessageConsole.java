package fr.univartois.cril.alloyplugin.console;


import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pos;

public class AlloyMessageConsole extends MessageConsole {
	String fileLocation="";	
	Err e=null;

	public AlloyMessageConsole(String name,String fileLocation) {
		super(name, null);
		this.fileLocation=fileLocation;
	}

	/*public AlloyMessageConsole(String name) {
		super(name, null);		
	}*/

	public String getFileLocation(){return fileLocation;}
	/**set an Err exeption*/

	public void setErr(Err e){this.e=e;}
	public void setFileLocation(String s){this.fileLocation=s;}
	/** get the line of a syntax exception*/
	public int getLine(){
		if (e!=null&&e.pos!=Pos.UNKNOWN)
			return e.pos.y;
		else return -1;
	}
	public String getFileName(){
		if (e!=null&&e.pos!=Pos.UNKNOWN)
			return e.pos.filename;		
		return null;


	}

	public void printErr(Err e) {
		this.setErr(e);
		print(e.getMessage(),new Color(null,255 ,0,0),SWT.DEFAULT);
	}
	private void print(String message,Color c,int style){
		MessageConsoleStream out = this.newMessageStream();
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
	public void print(String message) {
		print(message,new Color(null,0,0,0),SWT.DEFAULT);		
	}
	public void printInfo(String message) {
		print(message,new Color(null,0,0,0),SWT.BOLD);		
	}
	public void clear() {
		this.getDocument().set("");

	}
	public void reveal(){
	Console.revealConsoleView(this);	
	}

}
