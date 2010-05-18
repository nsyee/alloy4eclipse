package fr.univartois.cril.xtext.validation;

import org.eclipse.xtext.validation.Check;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Expectation;
 

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

}
