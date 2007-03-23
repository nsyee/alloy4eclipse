package fr.univartois.cril.alloyplugin;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class ProjectNature implements IProjectNature {

	public static final String NATURE_ID = "fr.univartois.cril.alloyplugin.AlloyProjectNature" ;
	
	public void configure() throws CoreException {
		//TODO implements projectnature
		System.out.println("nature");

	}

	public void deconfigure() throws CoreException {
		

	}

	public IProject getProject() {
		
		return null;
	}

	public void setProject(IProject project) {
		
		System.out.println("ICI");
	}

}
