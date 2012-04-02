package fr.univartois.cril.xtext2.alloyplugin.core;


import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import fr.univartois.cril.xtext2.alloyplugin.api.Util;

/**
 * This class represents an als file.  
 * This plugin implements IALSFile.
 *  
 */

public class ExternalALSFile extends AbstractALSFile {

	private IPath resourceLocation;
	private String resourceName;
	
	public ExternalALSFile(IPath resourceLocation) {
		
		org.eclipse.core.runtime.Assert.isNotNull(resourceLocation);
		this.resourceLocation = resourceLocation;
		this.resourceName = resourceLocation.lastSegment();
	}
	
	public boolean isResourceFile() {
		return false;
	}
	
	public IPath getResourceLocation() {
		
		return resourceLocation;
	}
	
	public IResource getResource() {
		
		return null;
	}
	
	public String getFilename() {
		
		return Util.getFileLocation(resourceLocation);
	}
	
	public String getName() {
		
		return resourceName;
	}
	
	public String toString(){
		return getName()+"@"+hashCode();
	}
	
}
