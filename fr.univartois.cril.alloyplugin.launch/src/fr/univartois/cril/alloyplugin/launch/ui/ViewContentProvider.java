package fr.univartois.cril.alloyplugin.launch.ui;


import java.util.HashMap;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
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
	public void addElements(IResource resource){
		AlloyCommandView view = AlloyCommandView.getDefault();
		ExecutableCommand[] elements=null;
		System.out.print("ajoute");
		if (view!=null) elements=getCommandFromFile(resource);
		System.out.println(elements);
		putElement(resource,elements);
		
	}

	private Object[] putElement(IResource resource, ExecutableCommand[] elements) {
		return map.put(resource, elements);		
	}
	//TODO implement this method
	public void removeElements(IResource resource){}
	/**
	 * Try to get the location of the resource. 
	 * Returns the file location or null;
	 * @param resource 
	 */
	//TODO move in a static util class?
	private static String getFileLocation(IResource resource){		
		if(resource!=null)
			return resource.getLocation().toString();
		else
			return null;
	}
	/**
	 * This method from IStructuredContentProvider is used by the viewer which this content provider is associed.
	 * Returns all the commands for the current resource.
	 */
	public Object[] getElements(Object parent) {		
		ExecutableCommand[] exec_cmds = map.get(current);
		System.out.println("get"+exec_cmds);
		if (exec_cmds==null) 
			{exec_cmds=getCommandFromFile(current);
			putElement(current,exec_cmds);
			return exec_cmds;}
			
		return exec_cmds;
	}
	/**
	 * Launch the Alloy parser to get commands from the resource.
	 */
	private ExecutableCommand[] getCommandFromFile(IResource resource) {
		System.out.println("launch:"+getFileLocation(resource));
		return AlloyLaunching.launchParser(getFileLocation(resource));		
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