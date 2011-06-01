package fr.univartois.cril.xtext.als.uri;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

public class AlsImportUriResolver extends ImportUriResolver {

	@Override
	public String resolve(EObject object) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		if (super.resolve(object) != null) {
			IProject myProject = root.getProject(object.eResource().getURI()
					.segment(1));
		
			if (myProject.getFile("/" + super.resolve(object) + ".als").exists()) {
				String location = "platform:/resource/"
						+ object.eResource().getURI().segment(1) + "/"
						+ super.resolve(object) + ".als";
				
				return location;
			}
			String location = "platform:/resource/"
				+ "Sample Models" + "/"
				+ super.resolve(object) + ".als";
			
			return location;
			
		}
		return null;
	}
}
