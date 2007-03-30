package fr.univartois.cril.alloyplugin.launch;


import fr.univartois.cril.alloyplugin.launch.ui.AlloyCommandView;
import fr.univartois.cril.alloyplugin.launch.ui.ViewContentProvider;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
/**
 * This class is a AlsEditor listener.
 */
public class ALSEditorListener implements IAlloyEditorListener {

	
	public void fileSetFocus(IALSFile file) {
		
		AlloyCommandView.setCurrent(file);
		
	}
	
	public void fileClosed(IALSFile file) {
		
		//ViewContentProvider.getContentProvider().removeElements(file);
		if(AlloyCommandView.getCurrent()==file) AlloyCommandView.setCurrent(null);// refreshCommands();		
	}

	

}
