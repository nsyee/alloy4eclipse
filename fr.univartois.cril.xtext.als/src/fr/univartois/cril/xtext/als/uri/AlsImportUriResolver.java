package fr.univartois.cril.xtext.als.uri;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;



public class AlsImportUriResolver extends ImportUriResolver {

	
	@Override
	public String resolve(EObject object) {
		
			
		
		 return "platform:/resource/nomPrjoet/models/"+ super.resolve(object)+".als";
	}
	

}
