package fr.univartois.cril.xtext2.uri;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

public class AlsImportUriGlobalScopeProvider extends ImportUriGlobalScopeProvider {

	public IScope getScope(Resource context, EReference reference) {
		return super.getScope(context, reference);
	}

	protected LinkedHashSet<URI> getImportedUris(Resource context) {
		LinkedHashSet<URI> tmp = super.getImportedUris(context);
		tmp.add(URI.createURI("platform:/resource/A4 models library/util/integer.als"));
		return tmp;
	}

}