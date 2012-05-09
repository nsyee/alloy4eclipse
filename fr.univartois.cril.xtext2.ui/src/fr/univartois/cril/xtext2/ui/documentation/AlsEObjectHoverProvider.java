package fr.univartois.cril.xtext2.ui.documentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import fr.univartois.cril.xtext2.als.AsName;
import fr.univartois.cril.xtext2.als.EnumName;
import fr.univartois.cril.xtext2.als.FactName;
import fr.univartois.cril.xtext2.als.FunctionName;
import fr.univartois.cril.xtext2.als.FunctionNamewParam;
import fr.univartois.cril.xtext2.als.LetName;
import fr.univartois.cril.xtext2.als.Open;
import fr.univartois.cril.xtext2.als.PredicateName;
import fr.univartois.cril.xtext2.als.SignatureName;

public class AlsEObjectHoverProvider extends DefaultEObjectHoverProvider {
	
    @Override
    protected String getFirstLine(EObject o) {
    	if (o instanceof EnumName)
    		return "Enumeration " + ((EnumName)o).getName();
        if (o instanceof FactName) 
            return "Fact " + ((FactName)o).getName();
        if (o instanceof FunctionName)
    		return "Function  " + ((FunctionName)o).getName();
        if (o instanceof FunctionNamewParam)
    		return "Function  " + ((FunctionNamewParam)o).getName();
        if (o instanceof LetName) 
            return "Let " + ((LetName)o).getName();
        if (o instanceof PredicateName) 
            return "Predicate " + ((PredicateName)o).getName();
        if (o instanceof SignatureName)
    		return "Signature " + ((SignatureName)o).getName();
        if (o instanceof AsName)
    		return "Alias for " + ((Open)((AsName)o).eContainer()).getOpenName().getImportURI();
        return super.getFirstLine(o);
    }
}

