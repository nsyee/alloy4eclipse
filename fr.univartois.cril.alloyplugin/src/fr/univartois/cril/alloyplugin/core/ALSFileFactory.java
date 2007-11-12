package fr.univartois.cril.alloyplugin.core;


import java.util.Hashtable;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.api.IALSFactory;
import fr.univartois.cril.alloyplugin.api.IALSFile;


/**
 * This class provide a method to get an IALSFile from a resource.
 * It's ensure that differents clients for a resource use the same object.
 * 
 */

public class ALSFileFactory implements IALSFactory {
	private Hashtable <IResource,IALSFile>map=new Hashtable<IResource,IALSFile>();

	/* (non-Javadoc)
	 * @see fr.univartois.cril.alloyplugin.api.IALSFactory#getIALSFile(org.eclipse.core.resources.IResource)
	 */
	public IALSFile getIALSFile(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {
		
			IALSFile file = map.get(resource);
			if (file==null&&resource.exists())
			{   
				
				file=new ALSFile(resource);
				map.put(resource,file);
				AlloyPlugin.getDefault().getParser().launchParser(file);
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
	/* (non-Javadoc)
	 * @see fr.univartois.cril.alloyplugin.api.IALSFactory#remove(org.eclipse.core.resources.IResource)
	 */
	public void remove(IResource Resource){
		map.remove(Resource);		
	}

}
