package fr.univartois.cril.alloyplugin.core.ui;

import java.util.HashMap;

import org.eclipse.core.resources.IResource;



public class ALSFileFactory {
	static HashMap <IResource,ALSFile>map=new HashMap<IResource,ALSFile>();
	public static ALSFile getALSFile(IResource resource) {
		ALSFile file = map.get(resource);
		if (file==null)
		{
			file=new ALSFile(resource);
			
			map.put(resource,file);
			
		}
		return file;
	}
	public void remove(IResource Resource){
		map.remove(Resource);		
	}

}
