package fr.univartois.cril.alloyplugin.validation;

import org.eclipse.xtext.validation.Check;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.Expectation;
 

public class BasicsJavaValidator extends AbstractBasicsJavaValidator {

	@Check
	public void checkTypeNameStartsWithCapital(Expectation exp) {
		if (!(exp.getValue()==0)&&!(exp.getValue()==1)) {
			error("expectation must be 0 or 1", BasicsPackage.EXPECTATION__VALUE);
		}
	}

}
