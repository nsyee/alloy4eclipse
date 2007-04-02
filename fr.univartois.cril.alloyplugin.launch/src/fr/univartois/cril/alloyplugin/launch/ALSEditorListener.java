package fr.univartois.cril.alloyplugin.launch;



import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.core.ui.IAlloyEditorListener;
import fr.univartois.cril.alloyplugin.launch.ui.CommandsView;
/**
 * This class is a AlsEditor listener.
 */
public class ALSEditorListener implements IAlloyEditorListener {

	
	public void fileSetFocus(IALSFile file) {
		
		CommandsView.setCurrent(file);		
	}
	
	public void fileClosed(IALSFile file) {		
		
		
		if(CommandsView.getCurrent()==file)
		{
			
			CommandsView.setCurrent(null);// refreshCommands();
		}
	}

	public void fileOpened(IALSFile file) {
	
		AlloyLaunching.launchParser(file);
		
	}

	

}
