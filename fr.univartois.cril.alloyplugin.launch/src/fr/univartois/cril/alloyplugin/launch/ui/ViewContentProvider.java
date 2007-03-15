package fr.univartois.cril.alloyplugin.launch.ui;


import java.util.HashMap;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.launch.util.Util;
//import fr.univartois.cril.alloyplugin.launch.util.Util;
/**
 * Content provider for commands view.
 * */
public class ViewContentProvider implements IStructuredContentProvider {
	ExecutableCommand[] elements={};
	HashMap<IResource, ExecutableCommand[]> map=new HashMap<IResource, ExecutableCommand[]>();
	IResource current=null;
	public ViewContentProvider(){
		//TODO fusionner avec l'editorListener?		
		map.put(current, elements);
	}		
	//TODO uses this
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		//System.out.println("v:"+v);
		//System.out.println("oldInput:"+oldInput);
		//System.out.println("newInput:"+newInput);
	}			
	public void dispose() {
//		TODO implement this method
	}

	/**
	 * Add a resource to the content provider.
	 * If the AlloyCommandView is open, it call getCommandFromFile(resource)
	 * and stores its commands.
	 * If no, it associate a null value to the resource.
	 */
	public void addElements(ExecutableCommand[] exec_cmds,IResource resource){		
		putElement(resource,exec_cmds);		
	}

	private Object[] putElement(IResource resource, ExecutableCommand[] elements) {
		return map.put(resource, elements);		
	}

	/**
	 * Remove a resource and its commands from map. 
	 */
	//TODO implement this method
	public void removeElements(IResource resource){}
	
	/**
	 * This method from IStructuredContentProvider is used by the viewer which this content provider is associed.
	 * Returns all the commands for the current resource.
	 */
	public Object[] getElements(Object parent) {		
		ExecutableCommand[] exec_cmds = map.get(current);			
		//if (exec_cmds==null) return new ExecutableCommand[0];
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
	};
}