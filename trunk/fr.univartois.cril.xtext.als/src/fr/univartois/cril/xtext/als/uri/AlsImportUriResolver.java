package fr.univartois.cril.xtext.als.uri;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

public class AlsImportUriResolver extends ImportUriResolver {

	@Override
	public String resolve(EObject object) {
		
		if (super.resolve(object) != null) {
			
			String location = "platform:/resource/"
				+ object.eResource()
				.getURI()
				.segment(1)
		+ "/" + super.resolve(object) + ".als";
			
			return location;
		}
		return null;
	}
}
