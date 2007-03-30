package fr.univartois.cril.alloyplugin.launch.ui;


import java.util.HashMap;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;

/**
 * Content provider for commands view. It stores ExecutableCommand[] associated with resource.
 * When Alloy Command view ask for elements (getElements()), the provider returns ExecutableCommand
 * associated with the current Resource.
 */

public class ViewContentProvider implements IStructuredContentProvider {
	
	
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
		
	}			
	public void dispose() {
//		TODO dispose the hasMap(?)

	}

	/**
	 * Add a als file to the content provider and its commands.	  
	 */
	private void addCommands(IALSFile file){		
		//putElement(resource,exec_cmds);		
		assert(file!=null);//null is reserved for no resource
		assert(file.getCommand()!=null);
		map.put(file, file.getCommand());		
		
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

	/**
	 * This method is used by viewer to get elements to display.
	 * Returns all the commands for the current als file.
	 * If current als file is null return a empty array.
	 * this update the content description of commands view.
	 */
	public IALSCommand[] getElements(Object parent) {
		//
		IALSFile currentALSFile=AlloyCommandView.getCurrent();
		if (currentALSFile==null) {			
			return new ExecutableCommand[0];
		}
		IALSCommand[] exec_cmds =getCommands(currentALSFile);
		if (exec_cmds==null)				
				{
					addCommandsFrom(currentALSFile);
					return currentALSFile.getCommand();
					}
		
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
	 * add an ALS file to the provider.
	 * */
	public  void addCommandsFrom(IALSFile file) {
		
		AlloyLaunching.launchParser(file);
		addCommands(file);		
		//return exec_cmds;

	}
	

}