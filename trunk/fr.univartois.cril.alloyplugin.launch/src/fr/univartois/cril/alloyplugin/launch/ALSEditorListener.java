package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.launch.ui.AlloyCommandView;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
/**
 * This class listens AlsEditor. 
 * Used with extension: [fr.univartois.cril.alloyplugin.launch.EditorListener].
 */
public class ALSEditorListener implements IAlloyEditorListener {


	public void fileLoaded(IALSFile file) {
		
		parseCommandsFor(file);

	}

	public void fileSaved(IALSFile file) {
	
		parseCommandsFor(file);

	}
	public void fileSetFocus(IALSFile file) {
		
			
		displayCommandsFor(file);


	}

	public void fileChanged(IALSFile file) {


	}
	public void fileClosed(IALSFile file) {
		
		AlloyCommandView.removeCommandsFromDisplay(file);		
	}

	/**
	 * Displays all the commands of an als file. 
	 */
	private void displayCommandsFor(IALSFile file){
		if (!file.getResource().exists())return;
		
		AlloyCommandView.refreshCommands(file);
		
	}
	/**
	 * Launch Alloy parser for an als file. 
	 */
	private void parseCommandsFor(IALSFile file){
		if (!file.getResource().exists())return;		
		AlloyCommandView.addCommands(file);
		

	}

}
