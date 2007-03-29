package fr.univartois.cril.alloyplugin.launch.ui;


import java.util.HashMap;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;

/**
 * Content provider for commands view. It stores ExecutableCommand[] associated with resource.
 * When Alloy Command view ask for elements (getElements()), the provider returns ExecutableCommand
 * associated with the current Resource.
 */

public class ViewContentProvider implements IStructuredContentProvider {
	/**
	 * the current 
	 */
	IALSFile currentALSFile=null;
	ExecutableCommand[] currentCommands=null;
	HashMap<IALSFile, ExecutableCommand[]> map=new HashMap<IALSFile, ExecutableCommand[]>();
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
		map.put(currentALSFile, currentCommands);
	}		

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		//assert(newInput!=null);
		//(AlloyCommandView) newInput;
		//System.out.println("v:"+v);
		//System.out.println("oldInput:"+oldInput);
		//System.out.println("newInput:"+newInput);
	}			
	public void dispose() {
//		TODO dispose the hasMap(?)

	}

	/**
	 * Add a als file to the content provider and its commands.	  
	 */
	private void addCommands(ExecutableCommand[] exec_cmds,IALSFile file){		
		//putElement(resource,exec_cmds);
		System.out.println("put commands for :"+file.getResource().getName()+" file:"+file);
		assert(file!=null);//null is reserved for no resource
		assert(exec_cmds!=null);
		map.put(file, exec_cmds);
		
		AlloyCommandView.refreshCommands();
	}


	/**
	 * Remove a als file and its commands from provider. 
	 */

	public void removeElements(IALSFile file){
		assert(file!=null);
		ExecutableCommand[] tab = map.remove(file);
		assert(tab!=null);
		if (currentALSFile==file)setCurrent(null);
	}

	/**
	 * This method is used by viewer to get elements to display.
	 * Returns all the commands for the current als file.
	 * If current als file is null return a empty array.
	 * this update the content description of commands view.
	 */
	public ExecutableCommand[] getElements(Object parent) {
		if (currentALSFile==null) {			
			return new ExecutableCommand[0];
		}
		ExecutableCommand[] exec_cmds = map.get(currentALSFile);
		//System.out.println("getElements:"+exec_cmds);
		//assert(exec_cmds!=null);
		if (exec_cmds==null) return new ExecutableCommand[0];
		return exec_cmds;
	}

	/**
	 * Set the current ALS file for displaying its content (commands).
	 * if newFile is null, no content will be displayed.
	 * refresh Commands view.
	 */
	public void setCurrent(IALSFile newFile){
		//
		AlloyCommandView.setViewContentDescription(newFile);

		currentALSFile=newFile;
		if (currentALSFile!=null)
			if(getCommands(currentALSFile)==null){
				{System.out.println("pas trouvé pour "+currentALSFile.getResource().getName()+" file:"+newFile);
				}
				
				//addCommandsFrom(currentALSFile);				
			}
		//


		AlloyCommandView.refreshCommands();
	}


	/**
	 * Return the commands from als file. return null if 
	 * the provider doesn't have the file.
	 * */
	public ExecutableCommand[] getCommands(IALSFile file) {
		return map.get(file);		
	}
	/**
	 * add an ALS file to the provider.
	 * */
	public  ExecutableCommand[] addCommandsFrom(IALSFile file) {
		System.out.println("add commands for :"+file.getResource().getName());
		ExecutableCommand[] exec_cmds = AlloyLaunching.launchParser(file);
		addCommands(exec_cmds, file);
		return exec_cmds;

	}
	public  IALSFile getCurrent(){
		return currentALSFile;
	}

}