package fr.univartois.cril.alloyplugin.launch.ui;


import java.util.HashMap;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
/**
 * Content provider for commands view.
 * */
public class ViewContentProvider implements IStructuredContentProvider {
	ExecutableCommand[] elements={};
	HashMap<String, ExecutableCommand[]> map=new HashMap<String, ExecutableCommand[]>();
	String currentId=null;
	public ViewContentProvider(){
		//TODO fusionner avec l'editorListener?		
		map.put(currentId, elements);
	}		
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		//System.out.println("v:"+v);
		//System.out.println("oldInput:"+oldInput);
		//System.out.println("newInput:"+newInput);
	}			
	public void dispose() {

	}
	public void setElements(String filename,ExecutableCommand []elements){		
		map.put(filename, elements);
	}
	public Object[] getElements(Object parent) {		
		return map.get(currentId);					
	}
	public void setCurrentId(String id){
		if(map.containsKey(id))
			currentId=id;
	};
}