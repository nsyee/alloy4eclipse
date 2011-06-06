package fr.univartois.cril.xtext.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;

import fr.univartois.cril.xtext.als.Alias;
import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.Assertion;
import fr.univartois.cril.xtext.als.AssertionName;
import fr.univartois.cril.xtext.als.CheckCommand;
import fr.univartois.cril.xtext.als.EnumDecl;
import fr.univartois.cril.xtext.als.EnumName;
import fr.univartois.cril.xtext.als.Expectation;
import fr.univartois.cril.xtext.als.Fact;
import fr.univartois.cril.xtext.als.FactName;
import fr.univartois.cril.xtext.als.Function;
import fr.univartois.cril.xtext.als.FunctionName;
import fr.univartois.cril.xtext.als.Paragraph;
import fr.univartois.cril.xtext.als.Predicate;
import fr.univartois.cril.xtext.als.PredicateName;
import fr.univartois.cril.xtext.als.ReferencesName;
import fr.univartois.cril.xtext.als.RunCommand;
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
	public void checkUniqueFactName(FactName fact){
		Specification specification ;
		EObject object = EcoreUtil.getRootContainer(fact);
		if(!(object instanceof Specification)) return;
		specification = (Specification)object;
		
		for(Paragraph paragraph : specification.getParagraph()){
			if(paragraph == null) continue;
			if(paragraph instanceof Fact){
				Fact factDecl =(Fact) paragraph;
				FactName f = factDecl.getName();
				if(f == null || f ==fact) continue;
				if(f.getName().equals(fact.getName())){
					error("Duplicate name : "+ fact.getName(), AlsPackage.FACT__NAME);
					return ;
				}
			}
		}
	}
	
	@Check
	public void checkUniqueAssertName(AssertionName assertD){
		Specification specification ;
		EObject object = EcoreUtil.getRootContainer(assertD);
		if(!(object instanceof Specification)) return;
		specification = (Specification)object;
		
		for(Paragraph paragraph : specification.getParagraph()){
			if(paragraph == null) continue;
			if(paragraph instanceof Assertion){
				Assertion assertion =(Assertion) paragraph;
				AssertionName a = assertion.getName();
				if(a == null || a ==assertD) continue;
				if(a.getName().equals(assertD.getName())){
					error("Duplicate name : "+ assertD.getName(), AlsPackage.ASSERTION__NAME);
					return ;
				}
			}
		}
	}
	
	@Check
	public void checkUniqueFunctionName(FunctionName function){
		Specification specification ;
		EObject object = EcoreUtil.getRootContainer(function);
		if(!(object instanceof Specification)) return;
		specification = (Specification)object;
		
		for(Paragraph paragraph : specification.getParagraph()){
			if(paragraph == null) continue;
			if(paragraph instanceof Function){
				Function fun =(Function) paragraph;
				ReferencesName f = fun.getName();
				if(f == null || f ==function) continue;
				if(f.getName().equals(function.getName())){
					error("Duplicate name : "+ function.getName(), AlsPackage.FUNCTION__NAME);
					return ;
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
				PredicateName p = predicate.getName();
				if(p == null || p ==pred) continue;
				if(p.getName().equals(pred.getName())){
					error("Duplicate name : "+ pred.getName(), AlsPackage.PREDICATE__NAME);
					return ;
				}
			}
		}
	}
	
	@Check
	public void checkUniqueAliasName(Alias alias){
		Specification specification ;
		EObject object = EcoreUtil.getRootContainer(alias);
		if(!(object instanceof Specification)) return;
		specification = (Specification)object;
		
		for(Paragraph paragraph : specification.getParagraph()){
			if(paragraph == null) continue;
			if(paragraph instanceof RunCommand){
				RunCommand run =(RunCommand) paragraph;
				Alias a = run.getRunName();
				if(a == null || a ==alias) continue;
				if(a.getName().equals(alias.getName())){
					error("Duplicate name : "+ alias.getName(), AlsPackage.RUN_COMMAND__RUN_NAME);
					return ;
				}
			}
			else if(paragraph instanceof CheckCommand){
				CheckCommand check =(CheckCommand) paragraph;
				Alias c = check.getCheckName();
				if(c == null || c ==alias) continue;
				if(c.getName().equals(alias.getName())){
					error("Duplicate name : "+ alias.getName(), AlsPackage.CHECK_COMMAND__CHECK_NAME);
					return ;
				}
			} 
		}
	}
	
	@Check
	public void checkUniqueEnumName(EnumName enumD){
		Specification specification ;
		EObject object = EcoreUtil.getRootContainer(enumD);
		if(!(object instanceof Specification)) return;
		specification = (Specification)object;
		
		for(Paragraph paragraph : specification.getParagraph()){
			if(paragraph == null) continue;
			if(paragraph instanceof EnumDecl){
				EnumDecl enumDecl =(EnumDecl) paragraph;
				EnumName e = enumDecl.getEnumName();
				if(e == null || e ==enumD) continue;
				if(e.getName().equals(enumD.getName())){
					error("Duplicate name : "+ enumD.getName(), AlsPackage.ENUM_DECL__ENUM_NAME);
					return ;
				}
			}
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

}
