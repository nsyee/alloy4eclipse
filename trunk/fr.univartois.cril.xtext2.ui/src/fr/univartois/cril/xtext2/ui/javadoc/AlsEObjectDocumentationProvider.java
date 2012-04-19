package fr.univartois.cril.xtext2.ui.javadoc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import fr.univartois.cril.xtext2.als.SignatureName;

public class AlsEObjectDocumentationProvider implements IEObjectDocumentationProvider {
	
	    public String getDocumentation(EObject o) {
	    	System.out.println("Bonjour"+o) ;	    	
	        if (o instanceof SignatureName) {
	            return "This is a nice Greeting with nice <b>markup</b> in the <i>documentation</i>";
	        }
	        return null;
	    }
	    
}

