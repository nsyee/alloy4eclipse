package fr.univartois.cril.xtext.als.uri;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;


public class AlsImportUriGlobalScopeProvider  extends ImportUriGlobalScopeProvider{

	@Override
	public IScope getScope(EObject context, EReference reference) {
		


		return super.getScope(context, reference);
	}
	
	@Override
	protected LinkedHashSet<URI> getImportedUris(EObject context) {
		LinkedHashSet<URI> tmp=super.getImportedUris(context);
		tmp.add(URI.createURI("platform:/resource/A4 models library/util/integer.als"));
		return tmp;
	}
	
}
