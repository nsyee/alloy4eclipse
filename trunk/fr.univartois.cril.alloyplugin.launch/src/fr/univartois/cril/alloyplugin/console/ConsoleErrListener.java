package fr.univartois.cril.alloyplugin.console;

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
	
	private Err e;
	private AlloyMessageConsole console;
	
	
	public ConsoleErrListener(Err e){		
		this.e=e;
	}
	public int getCompilerFlags(){
		// TODO Auto-generated method stub
		return 0;
	}

	public String getLineQualifier() {
		// TODO Auto-generated method stub		
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
		if (e!=null&&e.pos!=Pos.UNKNOWN&&(e.pos.filename.length()>0))
			return e.pos.filename;		
		return "";
	}
	/**
	 * Returns a line number from Err.	 
	 */
	private int getLine(){
		if (e!=null&&e.pos!=Pos.UNKNOWN)
			return e.pos.y;
		else return -1;
	}


	public void connect(TextConsole console) {
		// TODO Auto-generated method stub		
		this.console=(AlloyMessageConsole) console;
	}

	public void disconnect() {
		// TODO Auto-generated method stub
	}

	public void matchFound(PatternMatchEvent event) {
		System.out.println("match");
//		console.addFileLink(getFileName(),event.getOffset()+event.getLength()+4,getFileName().length(),getLine());	
		console.addFileLink(getFileName(),event.getOffset(),event.getLength(),getLine());

	}

}
