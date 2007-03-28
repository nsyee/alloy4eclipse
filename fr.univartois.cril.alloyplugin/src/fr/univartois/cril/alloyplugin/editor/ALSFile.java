package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
/**
 * This class is used for have an access to IResource from ALS editor.  
 */
public class ALSFile implements IALSFile {

	private IResource resource;
	public ALSFile(IResource resource) {
		setResource(resource);
	}
	public IResource getResource() {
		return resource;
	}
	protected void setResource(IResource resource){
		this.resource=resource;
	}
	public void setWorld(Object world) {
		// TODO Auto-generated method stub
		
	}
	public void setCommand(IALSCommand[] cmd) {
		// TODO Auto-generated method stub
		
	}
}
