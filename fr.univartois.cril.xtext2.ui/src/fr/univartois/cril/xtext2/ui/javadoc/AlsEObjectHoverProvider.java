package fr.univartois.cril.xtext2.ui.javadoc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import fr.univartois.cril.xtext2.als.SignatureName;

public class AlsEObjectHoverProvider extends DefaultEObjectHoverProvider {
	
    @Override
    protected String getFirstLine(EObject o) {
        if (o instanceof SignatureName) {
            return "Signature " + ((SignatureName)o).getName();
        }
        return super.getFirstLine(o);
    }
    
}

