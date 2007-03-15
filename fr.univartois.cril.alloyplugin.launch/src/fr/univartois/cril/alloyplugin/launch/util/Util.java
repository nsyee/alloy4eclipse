package fr.univartois.cril.alloyplugin.launch.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;

public class Util {

	/**
	 * Try to get the location of the resource. 
	 * Returns the file location or null;
	 * @param resource 
	 */
	//TODO move in a static util class?
	public static String getFileLocation(IResource resource){		
		if(resource!=null)
			return resource.getLocation().toOSString();
		else
			return null;
	}
	
	public static IFile getFileForLocation(String filename){
	return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filename));
	}
}
