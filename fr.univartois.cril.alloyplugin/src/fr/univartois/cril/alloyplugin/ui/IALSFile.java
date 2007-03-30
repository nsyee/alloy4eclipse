package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.core.resources.IResource;





public interface IALSFile {
/**
 * An interface for .als files. External plugins  which wants
 * manipulate als file can use this interface.
 * This plugin can't evaluate als file content its self ,
 * so the set methods are available for the moment.
 * (The launch plugin use the set methods).
 * */
public IResource getResource();


public IALSCommand[] getCommand();
public IALSFact[] getPredicates();
public IALSFunction[] getFunctions();
public IALSSignature[] getSignatures();
public void setCommand(IALSCommand cmd[]);
public void setFacts(IALSFact[] pred);
public void setFunctions(IALSFunction[] func);
public void setSignatures(IALSSignature[] sig);
public void fireChanged();
public void addListener(IALSFileListener listener);
public void removeListener(IALSFileListener listener);
}