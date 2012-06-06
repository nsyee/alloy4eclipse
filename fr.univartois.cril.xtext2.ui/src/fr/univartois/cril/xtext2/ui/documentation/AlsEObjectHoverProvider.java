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
    		return "Enumeration <b>" + ((EnumName)o).getName() + "</b>";
        if (o instanceof FactName) 
            return "Fact <b>" + ((FactName)o).getName() + "</b>";
        if (o instanceof FunctionName)
    		return "Function <b>" + ((FunctionName)o).getName() + "</b>";
        if (o instanceof FunctionNamewParam)
    		return "Function <b>" + ((FunctionNamewParam)o).getName() + "</b>";
        if (o instanceof LetName) 
            return "Let <b>" + ((LetName)o).getName() + "</b>";
        if (o instanceof PredicateName) 
            return "Predicate <b>" + ((PredicateName)o).getName() + "</b>";
        if (o instanceof SignatureName)
    		return "Signature <b>" + ((SignatureName)o).getName() + "</b>";
        if (o instanceof AsName)
    		return "Alias for <b>" + ((Open)((AsName)o).eContainer()).getOpenName().getImportURI() + "</b>";
        return super.getFirstLine(o);
    }
}

