package fr.univartois.cril.xtext2.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;

import fr.univartois.cril.xtext2.als.Alias;
import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.Assertion;
import fr.univartois.cril.xtext2.als.AssertionName;
import fr.univartois.cril.xtext2.als.CheckCommand;
import fr.univartois.cril.xtext2.als.EnumDecl;
import fr.univartois.cril.xtext2.als.EnumName;
import fr.univartois.cril.xtext2.als.Expectation;
import fr.univartois.cril.xtext2.als.Fact;
import fr.univartois.cril.xtext2.als.FactName;
import fr.univartois.cril.xtext2.als.Function;
import fr.univartois.cril.xtext2.als.Paragraph;
import fr.univartois.cril.xtext2.als.Param;
import fr.univartois.cril.xtext2.als.Predicate;
import fr.univartois.cril.xtext2.als.PredicateName;
import fr.univartois.cril.xtext2.als.ReferencesName;
import fr.univartois.cril.xtext2.als.RunCommand;
import fr.univartois.cril.xtext2.als.Signature;
import fr.univartois.cril.xtext2.als.SignatureName;
import fr.univartois.cril.xtext2.als.Specification;

public class AlsJavaValidator extends AbstractAlsJavaValidator {

	@Check
	public void checkTypeNameStartsWithCapital(Expectation exp) {
		if (!(exp.getValue() == 0) && !(exp.getValue() == 1)) {
			error("expectation must be 0 or 1",
					AlsPackage.Literals.EXPECTATION__VALUE);
		}
	}

	@Check
	public void checkUniqueFactName(FactName fact) {
		Specification specification;
		EObject object = EcoreUtil.getRootContainer(fact);
		if (!(object instanceof Specification))
			return;
		specification = (Specification) object;

		for (Paragraph paragraph : specification.getParagraph()) {
			if (paragraph == null)
				continue;
			if (paragraph instanceof Fact) {
				Fact factDecl = (Fact) paragraph;
				FactName f = factDecl.getName();
				if (f == null || f == fact)
					continue;
				if (f.getName().equals(fact.getName())) {
					error("Duplicate name : " + fact.getName(),
							AlsPackage.Literals.REFERENCES_NAME__NAME);
					return;
				}
			}
		}
	}

	@Check
	public void checkUniqueAssertName(AssertionName assertD) {
		Specification specification;
		EObject object = EcoreUtil.getRootContainer(assertD);
		if (!(object instanceof Specification))
			return;
		specification = (Specification) object;

		for (Paragraph paragraph : specification.getParagraph()) {
			if (paragraph == null)
				continue;
			if (paragraph instanceof Assertion) {
				Assertion assertion = (Assertion) paragraph;
				AssertionName a = assertion.getName();
				if (a == null || a == assertD)
					continue;
				if (a.getName().equals(assertD.getName())) {
					error("Duplicate name : " + assertD.getName(),
							AlsPackage.Literals.ASSERTION_NAME__NAME);
					return;
				}
			}
		}
	}
	
	@Check
	public void checkUniqueFunction(Function function) {
		// TODO compare also signature, same name different signature
		// authorized.
		Specification specification;
		EObject object = EcoreUtil.getRootContainer(function);
		if (!(object instanceof Specification))return;
		specification = (Specification) object;

		for (Paragraph paragraph : specification.getParagraph()) {
			if (paragraph == null)continue;
			if (paragraph instanceof Function) {
				Function fun = (Function) paragraph;
				ReferencesName f = fun.getName();
				EList<Param> param = fun.getParam();

				if (f == null || f == function.getName() || function.eContainer() != specification)continue;
				if (f.getName().equals(function.getName().getName())&& (param == null || param.size() == function.getParam().size())) {
					error("Duplicate name : " + function.getName().getName(),AlsPackage.Literals.FUNCTION__NAME);
					return;
				}
			}
		}
	}

	@Check
	public void checkUniquePred(Predicate pred) {
		Specification specification;
		EObject object = EcoreUtil.getRootContainer(pred);
		if (!(object instanceof Specification))
			return;
		specification = (Specification) object;

		for (Paragraph paragraph : specification.getParagraph()) {
			if (paragraph == null)
				continue;
			if (paragraph instanceof Predicate) {
				Predicate predicate = (Predicate) paragraph;
				PredicateName p = predicate.getName();
				EList<Param> param = predicate.getParam();
				
				if (p == null || p == pred.getName() || pred.eContainer() != specification )continue;
				if (p.getName().equals(pred.getName().getName()) && (param == null || param.size() == pred.getParam().size())){
					error("Duplicate name : " + pred.getName().getName(), AlsPackage.Literals.PREDICATE__NAME);
					return;
				}
			}
		}
	}

	@Check
	public void checkUniqueAliasName(Alias alias) {
		Specification specification;
		EObject object = EcoreUtil.getRootContainer(alias);
		if (!(object instanceof Specification))
			return;
		specification = (Specification) object;

		for (Paragraph paragraph : specification.getParagraph()) {
			if (paragraph == null)
				continue;
			if (paragraph instanceof RunCommand) {
				RunCommand run = (RunCommand) paragraph;
				Alias a = run.getRunName();
				if (a == null || a == alias)
					continue;
				if (a.getName().equals(alias.getName())) {
					error("Duplicate name : " + alias.getName(),
							AlsPackage.Literals.RUN_COMMAND__RUN_NAME);
					return;
				}
			} else if (paragraph instanceof CheckCommand) {
				CheckCommand check = (CheckCommand) paragraph;
				Alias c = check.getCheckName();
				if (c == null || c == alias)
					continue;
				if (c.getName().equals(alias.getName())) {
					error("Duplicate name : " + alias.getName(),
							AlsPackage.Literals.CHECK_COMMAND__CHECK_NAME);
					return;
				}
			}
		}
	}

	@Check
	public void checkUniqueEnumName(EnumName enumD) {
		Specification specification;
		EObject object = EcoreUtil.getRootContainer(enumD);
		if (!(object instanceof Specification))
			return;
		specification = (Specification) object;

		for (Paragraph paragraph : specification.getParagraph()) {
			if (paragraph == null)
				continue;
			if (paragraph instanceof EnumDecl) {
				EnumDecl enumDecl = (EnumDecl) paragraph;
				EnumName e = enumDecl.getEnumName();
				if (e == null || e == enumD)
					continue;
				if (e.getName().equals(enumD.getName())) {
					error("Duplicate name : " + enumD.getName(),
							AlsPackage.Literals.REFERENCES_NAME__NAME);
					return;
				}
			}
		}
	}

	@Check
	public void checkUniqueSigName(SignatureName sig) {
		Specification specification;
		EObject object = EcoreUtil.getRootContainer(sig);
		if (!(object instanceof Specification))
			return;
		specification = (Specification) object;

		for (Paragraph paragraph : specification.getParagraph()) {
			if (paragraph == null)
				continue;
			if (paragraph instanceof Signature) {
				Signature signature = (Signature) paragraph;
				for (SignatureName s : signature.getSignatureName()) {
					if (s == null || s == sig)
						continue;
					if (s.getName().equals(sig.getName())) {
						error("Duplicate name : " + sig.getName(),
								AlsPackage.Literals.REFERENCES_NAME__NAME);
						return;
					}
				}
			}
		}

	}

}
