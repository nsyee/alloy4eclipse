package fr.univartois.cril.alloyplugin.launch;

import fr.univartois.cril.alloyplugin.launch.ui.AlloyCommandView;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;

public class EditorListener implements IAlloyEditorListener {

	public void fileChanged(String fileLocation) {
		System.out.println("coucou!");

	}
	public void fileLoaded(String fileLocation) {
		System.out.println("fileLoaded");
		launchParser(fileLocation);
	}
	public void fileSaved(String fileLocation) {
		launchParser(fileLocation);
		System.out.println("fileSaved");
	}
	public void fileSetFocus(String fileLocation) {
		System.out.println("coucou!");		
		launchParser(fileLocation);
	}
	private void launchParser(String fileLocation){
		
		
		System.out.println("launch");
		AlloyCommandView.setElements(AlloyLaunching.launchParser(fileLocation));		
	}
	public void fileClosed(String fileLocation) {
		// TODO Auto-generated method stub
		
	}
}
