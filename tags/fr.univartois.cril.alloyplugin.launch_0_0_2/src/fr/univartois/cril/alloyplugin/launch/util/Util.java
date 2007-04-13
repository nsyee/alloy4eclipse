package fr.univartois.cril.alloyplugin.launch.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class Util {

	/**
	 * Try to get the location of the resource. 
	 * Returns the file location or null;
	 * @param resource 
	 */

	public static String getFileLocation(IResource resource){		
		if(resource!=null)
		{
			IPath loc = resource.getLocation();
			if(loc!=null)return loc.toOSString();
			return null;
		}
		else
			return null;
	}
	/**
	 * Get a file from a absolute location. (I think) 
	 */
	public static IFile getFileForLocation(String filename){
		return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filename));
	}
}