package fr.univartois.cril.alloyplugin.core.ui;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.core.ALSFile;

/**
 * This class provide a method to get an ALSFile from a resource.
 */

public class ALSFileFactory {
	static HashMap <IResource,ALSFile>map=new HashMap<IResource,ALSFile>();

	/**
	 * Get the als file associated with this resource or null if this kind of resource can't be associated with an ALSFile. 
	 */
	public static ALSFile getALSFile(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {
			System.out.println("factory");
			ALSFile file = map.get(resource);
			if (file==null&&resource.exists())
			{
				file=new ALSFile(resource);
				System.out.println("create alsfile:"+file);
				map.put(resource,file);
			}
			System.out.println("get alsfile:"+file);
			return file;
		}
		System.out.println("ici0000");
		return null;
	}
	protected void remove(IResource Resource){
		map.remove(Resource);		
	}

}