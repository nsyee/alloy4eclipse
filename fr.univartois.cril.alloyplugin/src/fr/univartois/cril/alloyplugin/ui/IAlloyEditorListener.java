package fr.univartois.cril.alloyplugin.ui;
/**
 * This interface is provided for use with the extension point defined in this plugin. 
 * It's a listener for als files opened in ALS editor.
 */
public interface IAlloyEditorListener {
	/**
	 * when an als file is loaded. 
	 */
	public void fileLoaded(IALSFile file);
	/**
	 * when an als file is saved. 
	 */
	public void fileSaved(IALSFile file);
	/**
	 * when an als file change (not supported). 
	 */
	public void fileChanged(IALSFile file);
	/**
	 * when an als file is closed. 
	 */
	public void fileClosed(IALSFile file);
	/**
	 * when an als file has focus. 
	 */
	public void fileSetFocus(IALSFile file);
}
