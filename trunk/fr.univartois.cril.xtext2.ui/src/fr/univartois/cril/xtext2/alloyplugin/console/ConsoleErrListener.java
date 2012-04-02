package fr.univartois.cril.xtext2.alloyplugin.console;

import org.eclipse.ui.console.IPatternMatchListener;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pos;

/**
 * Console listener used by AlloyMessageConsole in case of Err exception.
 * @author temporaire
 *
 */
public class ConsoleErrListener implements IPatternMatchListener {
	private Err error;
	private AlloyMessageConsole console;
	
	
	public ConsoleErrListener(Err e){		
		this.error=e;
	}
	
	
	
	public int getCompilerFlags(){
		return 0;
	}

	
	
	public String getLineQualifier() {
		return null;
	}

	
	
	/**
	 * Add an escape symbol ("\") before each ("\") found in the path.	  
	 */
	private String escapeForwardSlash(String path) {
		StringBuffer buffer = new StringBuffer(path);
		int index = buffer.indexOf("\\"); 
		while (index >= 0) {
			buffer.insert(index, '\\');
			index = buffer.indexOf("\\", index+2); 
		}
		return buffer.toString();
	}

	
	
	public String getPattern() {		
		return escapeForwardSlash(getFileName());		
	}

	
	
	/**
	 * Returns filename from Err.	 
	 */
	private String getFileName() {		
		if (error!=null && error.pos!=Pos.UNKNOWN && (error.pos.filename.length()>0))
			return error.pos.filename;		
		return "";
	}

	
	
	/**
	 * Returns a line number from Err.	 
	 */
	private int getLine(){
		if (error!=null && error.pos!=Pos.UNKNOWN)
			return error.pos.y;
		else return -1;
	}

	

	public void connect(TextConsole console) {			
		this.console=(AlloyMessageConsole) console;
	}

	
	
	public void disconnect() {	
	}

	
	
	public void matchFound(PatternMatchEvent event) {
		
//		console.addFileLink(getFileName(),event.getOffset()+event.getLength()+4,getFileName().length(),getLine());	
		console.addFileLink(getFileName(),event.getOffset(),event.getLength(),getLine());
	}
}
