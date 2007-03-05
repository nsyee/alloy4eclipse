package fr.univartois.cril.alloyplugin.ui;

public interface IAlloyEditorListener {
public void fileLoaded(String fileLocation);	
public void fileSaved(String fileLocation);	
public void fileChanged(String fileLocation);
public void fileClosed(String fileLocation);
public void fileSetFocus(String fileLocation);
}
