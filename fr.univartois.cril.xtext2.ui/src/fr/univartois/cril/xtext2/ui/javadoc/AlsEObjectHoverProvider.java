package fr.univartois.cril.xtext2.ui.javadoc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import fr.univartois.cril.xtext2.als.Signature;

public class AlsEObjectHoverProvider extends DefaultEObjectHoverProvider {
	
    @Override
    protected String getFirstLine(EObject o) {
    	System.out.println("Bonjour") ;
        if (o instanceof Signature) {
            return "Your Signature Name : " + ((Signature)o).getSignatureName();
        }
        return super.getFirstLine(o);
    }
    
}

