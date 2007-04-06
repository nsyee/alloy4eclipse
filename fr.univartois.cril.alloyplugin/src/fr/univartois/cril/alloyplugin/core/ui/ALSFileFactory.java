package fr.univartois.cril.alloyplugin.core.ui;


import java.util.Hashtable;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ALSFile;


/**
 * This class provide a method to get an ALSFile from a resource.
 * It's ensure that differents clients for a resource use the same object.
 * 
 */

public class ALSFileFactory {
	static Hashtable <IResource,ALSFile>map=new Hashtable<IResource,ALSFile>();

	/**
	 * Get the als file associated with this resource or null if this kind of resource can't be associated with an ALSFile.
	 * If the file doesn't exist, it's created and compiled. 
	 */
	public static IALSFile getALSFile(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {
		
			ALSFile file = map.get(resource);
			if (file==null&&resource.exists())
			{   
				
				file=new ALSFile(resource);
				map.put(resource,file);
				AlloyPlugin.getParser().launchParser(file);
				/*try {
					resource.touch(null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/				
			}
		
			return file;
		}
		
		return null;
	}
	protected void remove(IResource Resource){
		map.remove(Resource);		
	}

}
