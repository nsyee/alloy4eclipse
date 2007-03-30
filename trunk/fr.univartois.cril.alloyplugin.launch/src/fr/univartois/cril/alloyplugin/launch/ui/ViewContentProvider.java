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
 * Content provider for commands view. It stores ExecutableCommand[] associated with resource.
 * When Alloy Command view ask for elements (getElements()), the provider returns ExecutableCommand
 * associated with the current Resource.
 */

public class ViewContentProvider implements IStructuredContentProvider, IALSFileListener {
	
	
	private static final IALSCommand[] EMPTY_COMMANDS =new IALSCommand[0];
	HashMap<IALSFile, IALSCommand[]> map=new HashMap<IALSFile, IALSCommand[]>();
	/**
	 * the view content provider stores all commands used by commands view.
	 */
	protected  static ViewContentProvider viewContentProvider;
	/**
	 * get contentProvider. 
	 */
	public static ViewContentProvider getContentProvider() {
		if (viewContentProvider==null) viewContentProvider=new ViewContentProvider();
		return viewContentProvider;
	}

	private ViewContentProvider(){		
		//map.put(null,null);
	}		

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		if (newInput==null) return;
		IALSFile file=(IALSFile)newInput;
		file.addListener(this);
	}			
	public void dispose() {
//		TODO dispose the hasMap(?)

	}

	

	/**
	 * Remove a als file and its commands from provider. 
	 */

	public void removeElements(IALSFile file){		
		assert(file!=null);
		map.remove(file);
		assert(file.getCommand()!=null);
		if (AlloyCommandView.getCurrent()==file) AlloyCommandView.setCurrent(null);
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
		System.out.println("icicicici0000:"+inputElement);
		if (currentALSFile==null) {			
			return new ExecutableCommand[0];
		}
		IALSCommand[] exec_cmds =getCommands(currentALSFile);
		if (exec_cmds==null)				
				{
			System.out.println("pas trouve :"+inputElement);
					addCommandsFrom(currentALSFile);
					return currentALSFile.getCommand();
					}
		System.out.println("trouve :"+inputElement);
		
		return exec_cmds;
	}

	

	/**
	 * Return the commands from als file. return null if 
	 * the provider doesn't have the file.
	 * */
	public IALSCommand[] getCommands(IALSFile file) {
		return map.get(file);		
	}
	/**
	 * Add a als file to the content provider and its commands.	  
	 */
	private void addCommands(IALSFile file){		
		//putElement(resource,exec_cmds);		
		assert(file!=null);//null is reserved for no resource
		if(file.getCommand()==null) map.put(file, EMPTY_COMMANDS);
		else
		map.put(file, file.getCommand());		
		
	}

	/**
	 * Add an ALS file to the provider.
	 * */
	public  void addCommandsFrom(IALSFile file) {
		
		AlloyLaunching.launchParser(file);
		addCommands(file);		
		//return exec_cmds;

	}

	public void changed(IALSFile file) {
		System.out.println("je suis un listener");
		
	}
	

}