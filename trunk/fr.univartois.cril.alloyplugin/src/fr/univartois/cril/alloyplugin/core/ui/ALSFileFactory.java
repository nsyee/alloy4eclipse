package fr.univartois.cril.alloyplugin.core.ui;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.core.ALSFile;



public class ALSFileFactory {
	static HashMap <IResource,ALSFile>map=new HashMap<IResource,ALSFile>();

	public static ALSFile getALSFile(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {
			ALSFile file = map.get(resource);
			if (file==null&&resource.exists())
			{
				file=new ALSFile(resource);

				map.put(resource,file);

			}
			return file;
		}
		return null;
	}
	protected void remove(IResource Resource){
		map.remove(Resource);		
	}

}
