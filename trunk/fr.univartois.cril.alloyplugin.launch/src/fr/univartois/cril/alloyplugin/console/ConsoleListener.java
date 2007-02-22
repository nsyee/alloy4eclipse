package fr.univartois.cril.alloyplugin.console;

import org.eclipse.ui.console.IPatternMatchListener;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;

public class ConsoleListener implements IPatternMatchListener {
	private String regExp="Syntax error";
	private AlloyMessageConsole console;
	public ConsoleListener(){
	
	}
	public int getCompilerFlags() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getLineQualifier() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPattern() {
		// TODO Auto-generated method stub
		return regExp;
	}

	public void connect(TextConsole console) {
		// TODO Auto-generated method stub
		System.out.println("connect");
		this.console=(AlloyMessageConsole) console;
	}

	public void disconnect() {
		// TODO Auto-generated method stub

	}

	public void matchFound(PatternMatchEvent event) {				
		Console.addFileLink(console,console.getFileLocation(),event.getOffset(),event.getLength(),console.getLine());	

	}

}
