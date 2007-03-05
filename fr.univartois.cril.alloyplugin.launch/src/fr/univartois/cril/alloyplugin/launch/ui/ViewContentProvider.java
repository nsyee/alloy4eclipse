package fr.univartois.cril.alloyplugin.launch.ui;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;

public class ViewContentProvider implements IStructuredContentProvider {
	ExecutableCommand[] elements={};
	public ViewContentProvider(){
		//TODO faire un constructeur avec un editorinput	
		//et senregistrer en tant que listenr sur lui.
	}		
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {

	}			
	public void dispose() {
		System.out.println("dispose");
	}
	public void setElements(ExecutableCommand []elements){
		this.elements=elements;				
	}
	public ExecutableCommand[] getElements(Object parent) {		
		return elements;					
	}

}