package fr.univartois.cril.alloyplugin.ui;

import fr.univartois.cril.alloyplugin.core.ALSFile;

/**
 * This interface is provided for use with the extension point defined in this plugin. 
 * It's a listener for als files opened in ALS editor.
 */
public interface IAlloyEditorListener {
	
	/**
	 * when an als file is closed. 
	 */
	public void fileClosed(IALSFile file);
	/**
	 * when an als file has focus. 
	 */
	public void fileSetFocus(IALSFile file);
	public void fileOpened(IALSFile file);
}
