package fr.univartois.cril.xtext2.ui.documentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import fr.univartois.cril.xtext2.als.EnumDecl;
import fr.univartois.cril.xtext2.als.EnumName;
import fr.univartois.cril.xtext2.als.Fact;
import fr.univartois.cril.xtext2.als.FactName;
import fr.univartois.cril.xtext2.als.Function;
import fr.univartois.cril.xtext2.als.FunctionName;
import fr.univartois.cril.xtext2.als.Let;
import fr.univartois.cril.xtext2.als.LetName;
import fr.univartois.cril.xtext2.als.Predicate;
import fr.univartois.cril.xtext2.als.PredicateName;
import fr.univartois.cril.xtext2.als.Signature;
import fr.univartois.cril.xtext2.als.SignatureName;

public class AlsEObjectDocumentationProvider implements IEObjectDocumentationProvider {
	
	    public String getDocumentation(EObject o) {
	    	if (o instanceof EnumName){
	    		EnumDecl enu = (EnumDecl) o.eContainer() ;
	    		if(!enu.getDocumentation().isEmpty())
	    			return enu.getDocumentation().get(0).toString() ;
	    	}
	        if (o instanceof FactName){
	        	Fact fact = (Fact) o.eContainer() ;
	    		if(!fact.getDocumentation().isEmpty())
	    			return fact.getDocumentation().get(0).toString() ;
	        }
	        if (o instanceof FunctionName){
	        	Function fun = (Function) o.eContainer() ;
	    		if(!fun.getDocumentation().isEmpty())
	    			return fun.getDocumentation().get(0).toString() ;
	        }
	        if (o instanceof LetName){ 
	        	Let let = (Let) o.eContainer() ;
	    		if(!let.getDocumentation().isEmpty())
	    			return let.getDocumentation().get(0).toString() ;
	        }
	        if (o instanceof PredicateName) {
	    		Predicate pred = (Predicate) o.eContainer() ;
	    		if(!pred.getDocumentation().isEmpty())
	    			return pred.getDocumentation().get(0).toString() ;
	        }
	        if (o instanceof SignatureName) {
	    		Signature sig = (Signature) o.eContainer() ;
	    		
	    		if(!sig.getDocumentation().isEmpty())
	    			return sig.getDocumentation().get(0).toString() ;
	        }
	        
	        return null;
	    }
	    
}

