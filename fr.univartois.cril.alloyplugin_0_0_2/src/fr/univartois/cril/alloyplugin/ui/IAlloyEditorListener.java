package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.core.resources.IResource;

public interface IAlloyEditorListener {
	/**
	 * when an als file is loaded. 
	 */
	public void fileLoaded(IResource resource);
	/**
	 * when an als file is saved. 
	 */
	public void fileSaved(IResource resource);
	/**
	 * when an als file change (not supported). 
	 */
	public void fileChanged(IResource resource);
	/**
	 * when an als file is closed. 
	 */
	public void fileClosed(IResource resource);
	/**
	 * when an als file has focus. 
	 */
	public void fileSetFocus(IResource resource);
}
