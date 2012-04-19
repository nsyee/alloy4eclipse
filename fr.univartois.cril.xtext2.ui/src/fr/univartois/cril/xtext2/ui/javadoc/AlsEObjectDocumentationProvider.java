package fr.univartois.cril.xtext2.ui.javadoc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import fr.univartois.cril.xtext2.als.Signature;

public class AlsEObjectDocumentationProvider implements IEObjectDocumentationProvider {
	
	    @Override
	    public String getDocumentation(EObject o) {
	    	System.out.println("Bonjour") ;	    	
	        if (o instanceof Signature) {
	            return "This is a nice Greeting with nice <b>markup</b> in the <i>documentation</i>";
	        }
	        return null;
	    }
	    
}

