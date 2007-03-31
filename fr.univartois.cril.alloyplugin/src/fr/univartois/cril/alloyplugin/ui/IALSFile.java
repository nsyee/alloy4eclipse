package fr.univartois.cril.alloyplugin.ui;

import java.util.List;

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


public List<IALSCommand> getCommand();
public List<IALSFact> getPredicates();
public List<IALSFunction> getFunctions();
public List<IALSSignature> getSignatures();
public void setCommand(List<IALSCommand> cmds);
public void setFacts(List<IALSFact> pred);
public void setFunctions(List<IALSFunction> func);
public void setSignatures(List <IALSSignature> sig);
public void fireChanged();
public void addListener(IALSFileListener listener);
public void removeListener(IALSFileListener listener);
}