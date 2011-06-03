package fr.univartois.cril.xtext.alloyplugin.api;


/**
 * This interface is provided for use with the listener extension point defined in this plugin. 
 * It's a listener for als files opened in ALS editor.
 * It's a temporary class.
 * It's used for allow Launch plugin to listening opened als files for parsing them.
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
