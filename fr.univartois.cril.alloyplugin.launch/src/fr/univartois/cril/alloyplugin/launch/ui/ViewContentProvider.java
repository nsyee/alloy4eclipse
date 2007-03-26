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
	/**
	 * the current 
	 */
	IResource currentResource=null;
	ExecutableCommand[] currentCommands=null;
	HashMap<IResource, ExecutableCommand[]> map=new HashMap<IResource, ExecutableCommand[]>();
	
	
	public ViewContentProvider(){		
		map.put(currentResource, currentCommands);
	}		

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		//assert(newInput!=null);
		//view=(AlloyCommandView) newInput;
		//System.out.println("v:"+v);
		//System.out.println("oldInput:"+oldInput);
		//System.out.println("newInput:"+newInput);
	}			
	public void dispose() {
//		TODO dispose the hasMap(?)

	}

	/**
	 * Add a resource to the content provider and its commands.	  
	 */
	public void addElements(ExecutableCommand[] exec_cmds,IResource resource){		
		//putElement(resource,exec_cmds);
		assert(resource!=null);//null is reserved for no resource
		map.put(resource, exec_cmds);
	}


	/**
	 * Remove a resource and its commands from map. 
	 */

	public void removeElements(IResource resource){
		assert(resource!=null);
		ExecutableCommand[] tab = map.remove(resource);
		assert(tab!=null);
		if (currentResource==resource)setCurrent(null);
	}

	/**
	 * This method is used by viewer to get elements to display.
	 * Returns all the commands for the current resource.
	 * If current resource is null return a empty array.
	 * this update the content description of commands view.
	 */
	public ExecutableCommand[] getElements(Object parent) {		

		if (currentResource==null) {
			AlloyCommandView.setViewTitle("No file opened.");
			return new ExecutableCommand[0];
		}
		ExecutableCommand[] exec_cmds = map.get(currentResource);
		//System.out.println("getElements:"+exec_cmds);
		assert(exec_cmds!=null);
		AlloyCommandView.setViewTitle(currentResource.getName());		
		return exec_cmds;
	}

	/**
	 * Set the current resource for displaying its content (commands).
	 * if newResource is null, no content will be displayed.
	 */
	public void setCurrent(IResource newResource){
		//if(map.containsKey(newResource))
		
			currentResource=newResource;			
		
		//else {System.out.println("pas trouvé");}
		//view.setViewTitle(defautTitle);

	}
	/**
	 * 
	 */	  
	public IResource getCurrent() {
		return currentResource;
	}
	
	public ExecutableCommand[] getCurrentCommands() {
		ExecutableCommand[] rrr = map.get(currentResource);
		System.out.println("rrr:"+rrr);
		return rrr;
	};
}