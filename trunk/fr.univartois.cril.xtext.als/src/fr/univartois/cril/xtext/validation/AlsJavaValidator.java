package fr.univartois.cril.xtext.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Expectation;
import fr.univartois.cril.xtext.als.Paragraph;
import fr.univartois.cril.xtext.als.Predicate;
import fr.univartois.cril.xtext.als.PredicateName;
import fr.univartois.cril.xtext.als.PropertyName;
import fr.univartois.cril.xtext.als.Signature;
import fr.univartois.cril.xtext.als.SignatureName;
import fr.univartois.cril.xtext.als.Specification;
 

public class AlsJavaValidator extends AbstractAlsJavaValidator {

//	@Check
//	public void checkTypeNameStartsWithCapital(Type type) {
//		if (!Character.isUpperCase(type.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.TYPE__NAME);
//		}
//	}
	
	@Check
	public void checkTypeNameStartsWithCapital(Expectation exp) {
		if (!(exp.getValue()==0)&&!(exp.getValue()==1)) {
			error("expectation must be 0 or 1", AlsPackage.EXPECTATION__VALUE);
		}
	}
	
	@Check
	public void checkUniqueSigName(SignatureName sig){
		Specification specification ;
		EObject object = EcoreUtil.getRootContainer(sig);
		if(!(object instanceof Specification)) return;
		specification = (Specification)object;
		
		for(Paragraph paragraph : specification.getParagraph()){
			if(paragraph == null) continue;
			if(paragraph instanceof Signature){
				Signature signature =(Signature) paragraph;
				for(SignatureName s : signature.getSignatureName() ){
					if(s == null || s ==sig) continue;
					if(s.getName().equals(sig.getName())){
						error("Duplicate name : "+ sig.getName(), AlsPackage.SIGNATURE__SIGNATURE_NAME);
						return ;
					}
				}
			}
		}
		
	}
	
	@Check
	public void checkUniquePredName(PredicateName pred){
		Specification specification ;
		EObject object = EcoreUtil.getRootContainer(pred);
		if(!(object instanceof Specification)) return;
		specification = (Specification)object;
		
		for(Paragraph paragraph : specification.getParagraph()){
			if(paragraph == null) continue;
			if(paragraph instanceof Predicate){
				Predicate predicate =(Predicate) paragraph;
				PredicateName p = predicate.getPredicateName();
				if(p == null || p ==pred) continue;
				if(p.getName().equals(pred.getName())){
					error("Duplicate name : "+ pred.getName(), AlsPackage.PREDICATE__PREDICATE_NAME);
					return ;
				}
			}
		}
	}

}
