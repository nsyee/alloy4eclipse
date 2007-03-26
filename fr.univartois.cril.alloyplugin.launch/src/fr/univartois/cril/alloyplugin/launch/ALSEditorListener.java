package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.launch.ui.AlloyCommandView;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
/**
 * This class listens AlsEditor. 
 * Used with extension: [fr.univartois.cril.alloyplugin.launch.EditorListener].
 */
public class ALSEditorListener implements IAlloyEditorListener {


	public void fileLoaded(IResource resource) {
		System.out.println("load:"+resource.hashCode()+":"+resource.getName());
		parseCommandsFor(resource);

	}

	public void fileSaved(IResource resource) {
		System.out.println("save:"+resource.hashCode()+":"+resource.getName());
		parseCommandsFor(resource);

	}
	public void fileSetFocus(IResource resource) {
			System.out.println("focus:"+resource.hashCode()+":"+resource.getName());
			
		displayCommandsFor(resource);


	}

	public void fileChanged(IResource resource) {


	}
	public void fileClosed(IResource resource) {
		System.out.println("close:"+resource.hashCode()+":"+resource.getName());
		AlloyCommandView.removeCommandsFromDisplay(resource);		
	}

	/**
	 * Displays all the commands of an als file. 
	 */
	private void displayCommandsFor(IResource resource){
		if (!resource.exists())return;
		//if(AlloyCommandView.haveCommandsFor(resource))
		AlloyCommandView.refreshCommands(resource);
		//else
		//parseCommandsFor(resource);
	}
	/**
	 * Launch Alloy parser for an als file. 
	 */
	private void parseCommandsFor(IResource resource){
		if (!resource.exists())return;		
		AlloyCommandView.addCommands(resource);
		

	}

}
