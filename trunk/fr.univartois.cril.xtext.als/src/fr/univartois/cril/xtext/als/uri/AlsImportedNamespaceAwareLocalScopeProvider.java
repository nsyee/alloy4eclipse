package fr.univartois.cril.xtext.als.uri;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;



public class AlsImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	@Override
	protected ImportNormalizer createImportNormalizer(final String name) {
		
		String newName=name.replace('/', '.');
		
		return new ImportNormalizer(new QualifiedName(newName+".*"));
	}


}
