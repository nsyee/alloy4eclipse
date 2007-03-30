package fr.univartois.cril.alloyplugin.launch.ui;


import java.util.HashMap;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.ui.IALSFileListener;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;

/**
 * Content provider for commands view.
 */

public class ViewContentProvider implements IStructuredContentProvider, IALSFileListener {
	
	
	private static final IALSCommand[] EMPTY_COMMANDS =new IALSCommand[0];
	
	private Viewer viewer;
	
			

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		viewer=v;
		if (newInput==null) return;
		IALSFile file=(IALSFile)newInput;
		file.addListener(this);
	}			
	public void dispose() {
//		TODO dispose the hasMap(?)

	}


	/*
	 * This method is used by viewer to get elements to display.
	 * Returns all the commands for the current als file.
	 * If current als file is null return a empty array.
	 * this update the content description of commands view.
	 */
	public IALSCommand[] getElements(Object inputElement) {		
		//
		IALSFile currentALSFile=(IALSFile) inputElement;
		System.out.println("get elements:"+currentALSFile.getResource());
		if (currentALSFile==null) {			
			return EMPTY_COMMANDS;
		}
		IALSCommand[] exec_cmds =currentALSFile.getCommand();
		
		if (exec_cmds==null)				
				{
			System.out.println("commandes null:"+currentALSFile);
					return EMPTY_COMMANDS;
					}
		System.out.println("nb commands:"+exec_cmds.length);
		
		return exec_cmds;
	}


	public void changed(IALSFile file) {
		System.out.println("refresh");
		viewer.refresh();
		
	}
	

}