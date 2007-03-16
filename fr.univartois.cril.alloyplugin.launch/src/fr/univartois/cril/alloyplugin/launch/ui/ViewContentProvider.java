package fr.univartois.cril.alloyplugin.launch.ui;


import java.util.HashMap;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;


/**
 * Content provider for commands view. It stores ExecutableCommand[] associated with resource.
 * When Alloy Command view ask for elements (getElements()), the provider returns ExecutableCommand
 * associated with the current Resource.
 */

public class ViewContentProvider implements IStructuredContentProvider {
	ExecutableCommand[] elements={};
	HashMap<IResource, ExecutableCommand[]> map=new HashMap<IResource, ExecutableCommand[]>();
	IResource current=null;
	public ViewContentProvider(){		
		map.put(current, elements);
	}		
	//TODO uses this
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		//System.out.println("v:"+v);
		//System.out.println("oldInput:"+oldInput);
		//System.out.println("newInput:"+newInput);
	}			
	public void dispose() {
//		TODO dispose the hasMap?
		
	}

	/**
	 * Add a resource to the content provider and its commands.
	 * 
	 */
	public void addElements(ExecutableCommand[] exec_cmds,IResource resource){		
		//putElement(resource,exec_cmds);
		
		map.put(resource, exec_cmds);
	}

	
	/**
	 * Remove a resource and its commands from map. 
	 */
	//TODO implement this method: when a file is closed in the alloy editor, editor listener
	//should call a method who dispose all commands associated with the  file
	public void removeElements(IResource resource){}

	/**
	 * This method from IStructuredContentProvider is used by the viewer which this content provider is associed.
	 * Returns all the commands for the current resource.
	 */
	public ExecutableCommand[] getElements(Object parent) {		
		ExecutableCommand[] exec_cmds = map.get(current);			
		//if (exec_cmds==null) return new ExecutableCommand[0];
		assert(exec_cmds!=null);		
		return exec_cmds;
	}

	/**
	 * Set the current resource for displaying its content (commands).
	 */
	public void setCurrent(IResource newResource){
		if(map.containsKey(newResource))
			current=newResource;
	}
	/**
	 * I have no idea what this function does...
	 */	  
	public IResource getCurrent() {
		return current;
	}
	public ExecutableCommand[] getCurrentCommands() {
		return getElements(null);		
	};
}