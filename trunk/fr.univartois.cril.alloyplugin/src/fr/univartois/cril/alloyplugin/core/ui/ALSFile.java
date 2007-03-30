package fr.univartois.cril.alloyplugin.core.ui;

import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
/**
 * This class is used for have an access to IResource from ALS editor.  
 */
public class ALSFile implements IALSFile {

	private IResource resource;
	private IALSCommand[] cmds;
	protected ALSFile(IResource resource) {
		setResource(resource);
	}
	public IResource getResource() {
		return resource;
	}
	protected void setResource(IResource resource){
		this.resource=resource;
	}
	
	public void setCommand(IALSCommand[] cmds) {
		this.cmds=cmds;		
	}
	public IALSCommand[] getCommand() {
		return cmds;	
	}
	public void dispose(){};
}
