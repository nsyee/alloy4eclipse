package fr.univartois.cril.xtext2.alloyplugin.core;


import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import fr.univartois.cril.xtext2.alloyplugin.api.Util;
/**
 * This class represents an als file.  
 * This plugin implements IALSFile.
 *  
 */

public class ALSFile extends AbstractALSFile {

	private IResource resource;
	private IPath resourceLocation;
	private String resourceName;
	
	public ALSFile(IResource resource) {
		org.eclipse.core.runtime.Assert.isNotNull(resource);
		this.resource=resource;
		this.resourceLocation = resource.getLocation();
		this.resourceName = resource.getName();
	}
	
	public boolean isResourceFile() {
		return true;
	}
	
	public IPath getResourceLocation() {
		return resourceLocation;
	}
	
	public IResource getResource() {
		return resource;
	}
	
	public String getFilename() {
		return Util.getFileLocation(resourceLocation);
	}
	
	public String getName() {
		return resourceName;
	}
	
	public String toString(){return getResource().getName()+"@"+hashCode();
		
	}
}
