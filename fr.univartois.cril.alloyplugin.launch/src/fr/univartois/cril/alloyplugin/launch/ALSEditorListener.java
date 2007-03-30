package fr.univartois.cril.alloyplugin.launch;



import fr.univartois.cril.alloyplugin.launch.ui.AlloyCommandView;
import fr.univartois.cril.alloyplugin.launch.ui.CommandsProvider;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
/**
 * This class is a AlsEditor listener.
 */
public class ALSEditorListener implements IAlloyEditorListener {

	
	public void fileSetFocus(IALSFile file) {
		System.out.println("focus:"+file);
		AlloyCommandView.setCurrent(file);		
	}
	
	public void fileClosed(IALSFile file) {		
		//ViewContentProvider.getContentProvider().removeElements(file);
		System.out.println("set Input00:"+file);
		if(AlloyCommandView.getCurrent()==file)
		{
			System.out.println("set Input0:"+file);
			AlloyCommandView.setCurrent(null);// refreshCommands();
		}
	}

	public void fileOpened(IALSFile file) {
		System.out.println("opened:"+file);
		AlloyLaunching.launchParser(file);
		
	}

	

}
