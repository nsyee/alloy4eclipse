package fr.univartois.cril.alloyplugin.launch;

import fr.univartois.cril.alloyplugin.launch.ui.AlloyCommandView;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;

public class EditorListener implements IAlloyEditorListener {

	public void fileChanged(String fileLocation) {
	}
	public void fileLoaded(String fileLocation) {
		parseCommandsFor(fileLocation);
	}
	public void fileSaved(String fileLocation) {
		parseCommandsFor(fileLocation);

	}
	public void fileSetFocus(String fileLocation) {
		displayCommandsFor(fileLocation);
	}

	public void fileClosed(String fileLocation) {
	}
	/**
	 * Displays all the commands of an als file. 
	 */
	private void displayCommandsFor(String fileLocation){		
		AlloyCommandView.displayCommands(fileLocation);		
	}
	/**
	 * Launch Alloy parser for an als file. 
	 */
	private void parseCommandsFor(String fileLocation){		
		AlloyCommandView.setCommands(AlloyLaunching.launchParser(fileLocation),fileLocation);
		displayCommandsFor(fileLocation);
	}
}
