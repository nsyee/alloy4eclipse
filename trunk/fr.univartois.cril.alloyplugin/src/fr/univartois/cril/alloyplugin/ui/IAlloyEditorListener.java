package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.core.resources.IResource;

public interface IAlloyEditorListener {
public void fileLoaded(IResource resource);	
public void fileSaved(IResource resource);	
public void fileChanged(IResource resource);
public void fileClosed(IResource resource);
public void fileSetFocus(IResource resource);
}
