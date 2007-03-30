package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.core.resources.IResource;

public interface IALSFile {
/**
 * An interface for ALS file.
 * */
public IResource getResource();

public void setCommand(IALSCommand cmd[]);


public IALSCommand[] getCommand();

}