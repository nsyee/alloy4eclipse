package fr.univartois.cril.alloyplugin.core;

import java.util.Hashtable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import fr.univartois.cril.alloyplugin.api.IALSFactory;
import fr.univartois.cril.alloyplugin.api.IALSFile;

/**
 * This class provide a method to get an IALSFile from a resource. It's ensure
 * that differents clients for a resource use the same object.
 * 
 */

public class ALSFileFactory implements IALSFactory {
    private Hashtable<IResource, IALSFile> map = new Hashtable<IResource, IALSFile>();

    private ALSFileFactory() {
        
    }
    
    public IALSFile getIALSFile(IPath resourceLocation) {
    	return new ExternalALSFile(resourceLocation);
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see fr.univartois.cril.alloyplugin.api.IALSFactory#getIALSFile(org.eclipse.core.resources.IResource)
     */
    public IALSFile getIALSFile(IResource resource) {
        if (resource instanceof IFile && resource.getName().endsWith(".als")) {

            IALSFile file = map.get(resource);
            if (file == null && resource.exists()) {

                file = new ALSFile(resource);
                map.put(resource, file);
                AlloyLaunching.instance().launchParser(file);
                /*
                 * try { resource.touch(null); } catch (CoreException e) { //
                 * TODO Auto-generated catch block e.printStackTrace(); }
                 */
            }

            return file;
        }

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see fr.univartois.cril.alloyplugin.api.IALSFactory#remove(org.eclipse.core.resources.IResource)
     */
    public void remove(IResource Resource) {
        map.remove(Resource);
    }

    private static ALSFileFactory instance;

    public static synchronized ALSFileFactory instance() {
        if (instance == null) {
            instance = new ALSFileFactory();
        }
        return instance;
    }
    
    public IALSFile getALSFile(IPath resourceLocation) {
    	return instance().getIALSFile(resourceLocation);
    }
    
    /**
     * Return the ALSFile associated with the resource.
     * */

    public IALSFile getALSFile(IResource resource) {
        return instance().getIALSFile(resource);
    }
}
