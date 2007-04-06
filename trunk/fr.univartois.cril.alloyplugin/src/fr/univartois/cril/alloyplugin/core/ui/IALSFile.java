package fr.univartois.cril.alloyplugin.core.ui;

import java.util.List;

import org.eclipse.core.resources.IResource;


/**
 * Interface for an Alloy file.
 * Others plugins which wants to use Alloy files can use this interface.. 
 * For the moment this plugin can't evaluate als file content its self,
 * so the set methods and fireChanged are provided for the moment.
 * (The launch plugin have a parser and use this interface for update alsfile content).
 * */

public interface IALSFile {

public IResource getResource();

public List<IALSCommand> getCommand();
public List<IALSPredicate> getPredicates();
public List<IALSFact> getFacts();
public List<IALSFunction> getFunctions();
public List<IALSSignature> getSignatures();
public void addListener(IALSFileListener listener);
public void removeListener(IALSFileListener listener);
public IALSCommand getCommand(String commandId);
}