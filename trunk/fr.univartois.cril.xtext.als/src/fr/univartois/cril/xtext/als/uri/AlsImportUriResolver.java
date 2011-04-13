package fr.univartois.cril.xtext.als.uri;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

import fr.univartois.cril.xtext.AlsStandaloneSetup;

public class AlsImportUriResolver extends ImportUriResolver {

	@Override
	public String resolve(EObject object) {

		if (super.resolve(object) != null) {
			
			
			return "platform:/resource/"
					+ object.eResource()
							.getURI()
							.segment(
									object.eResource().getURI().segmentCount() - 2)
					+ "/" + super.resolve(object) + ".als";
		}
		return null;
	}
}
