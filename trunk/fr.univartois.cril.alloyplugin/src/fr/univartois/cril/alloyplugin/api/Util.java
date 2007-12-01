package fr.univartois.cril.alloyplugin.api;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import fr.univartois.cril.alloyplugin.AlloyPlugin;


public class Util {

    public static final String ALLOYPROBLEM = "fr.univartois.cril.alloyplugin.AlloyProblem";
    
	/**
	 * Try to get the absolute path of the resource. 
	 * Returns the file location or null;
	 * @param resource 
	 */

	public static String getFileLocation(IResource resource){		
		assert(resource!=null);
		IPath loc = resource.getLocation();
		if(loc!=null)
			return loc.toOSString();
		return null;
	}
	/**
	 * Get a file from a absolute location. (I think) 
	 */
	public static IFile getFileForLocation(String filename){
		return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filename));
	}

	/**
	 * Get the url.
	 * */
	public static URL getUrl(String localPathKey){	
		URL url = null;
		try {
			url = new URL(AlloyPlugin.getDefault().getBundle().getEntry("/"),
					localPathKey);
		} catch (MalformedURLException e) {
		}
		return url;
	}
}
