package fr.univartois.cril.alloyplugin.console;


import org.eclipse.ui.console.MessageConsole;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pos;

public class AlloyMessageConsole extends MessageConsole {
	String fileLocation;	
	Err e=null;

	public AlloyMessageConsole(String name,String fileLocation) {
		super(name, null);
		this.fileLocation=fileLocation;
	}

	public String getFileLocation(){return fileLocation;}
	/**set an Err exeption*/

	public void setErr(Err e){this.e=e;}
	/** get the line of a syntax execption*/
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

}
