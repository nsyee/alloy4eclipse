package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.launch.ui.AlloyCommandView;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
/**
 * This class listens AlsEditor. 
 * TODO used for extension: [fr.univartois.cril.alloyplugin.launch.EditorListener].
 */
public class EditorListener implements IAlloyEditorListener {


	public void fileLoaded(IResource resource) {
		parseCommandsFor(resource);
		
	}
	
	public void fileSaved(IResource resource) {
		parseCommandsFor(resource);
		
	}
	public void fileSetFocus(IResource resource) {
		
		displayCommandsFor(resource);
	}

	public void fileChanged(IResource resource) {
		
		
	}
	public void fileClosed(IResource resource) {		
		AlloyCommandView.removeCommandsFromDisplay(resource);		
	}
	
	/**
	 * Displays all the commands of an als file. 
	 */
	private void displayCommandsFor(IResource resource){		
		AlloyCommandView.displayCommands(resource);		
	}
	/**
	 * Launch Alloy parser for an als file. 
	 */
	private void parseCommandsFor(IResource resource){
		ExecutableCommand[] exec_cmds = AlloyLaunching.launchParser(resource);
		AlloyCommandView.addCommandsToDisplay(resource,exec_cmds);
		AlloyCommandView.refreshCommands();
		
	}
	
}
