package fr.univartois.cril.xtext.alloyplugin.launch.ui;



import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import fr.univartois.cril.xtext.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext.alloyplugin.api.IALSFileListener;

/**
 * Content provider for commands view.
 */

public class CommandsContentProvider2 implements IStructuredContentProvider, IALSFileListener {


	private static final IALSCommand[] EMPTY_COMMANDS =new IALSCommand[0];

	private Viewer viewer;



	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		viewer=v;
		if (oldInput!=null){
			IALSFile file=(IALSFile)oldInput;
			file.removeListener(this);
		}
		if (newInput!=null){
			IALSFile file=(IALSFile)newInput;
			file.addListener(this);
		}

	}			
	public void dispose() {


	}


	/*
	 * This method is used by viewer to get elements to display.
	 * Returns all the commands for the current als file.
	 * If current als file is null return a empty array.
	 * this update the content description of commands view.
	 */
	public Object[] getElements(Object inputElement) {		
		//
		IALSFile currentALSFile=(IALSFile) inputElement;
		// System.out.println("content:"+currentALSFile);
		if (currentALSFile==null) {			
			return EMPTY_COMMANDS;
		}
		
		List<IALSCommand> exec_cmds_list =currentALSFile.getCommand();
		
		Object[] exec_cmds=exec_cmds_list.toArray();
		// System.out.println("taille:"+exec_cmds.length);

		return exec_cmds;
	}


	public void changed(IALSFile file) {
		// System.out.println("refresh");
		Display display = PlatformUI.getWorkbench().getDisplay();		
		if (display!=null)
			display.asyncExec(
					new Runnable() {
						public void run(){
							viewer.refresh();					
						}
					});


	}


}