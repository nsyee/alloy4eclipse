package fr.univartois.cril.xtext.alloyplugin.api;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

/**
 * Interface for an Alloy file. Others plugins which wants to use Alloy files
 * can use this interface.. For the moment this plugin can't evaluate als file
 * content its self, so the set methods and fireChanged are provided for the
 * moment. (The launch plugin have a parser and use this interface for update
 * alsfile content).
 */

public interface IALSFile {

	public boolean isResourceFile();
	
    public IResource getResource();

    public IPath getResourceLocation();
    
    public String getFilename();
    
    public String getName();
    
    public List<IALSCommand> getCommand();

    
    public void addListener(IALSFileListener listener);

    public void removeListener(IALSFileListener listener);

    public IALSCommand getCommand(String commandId);

    public List<IALSTreeDecorated> getAllAlloyObjects();

	public void fireChange();

	
	public void setCommand(List <IALSCommand> cmds);

	
}