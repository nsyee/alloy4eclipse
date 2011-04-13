package fr.univartois.cril.xtext.als.uri;




import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;

import fr.univartois.cril.xtext.als.EnumDecl;
import fr.univartois.cril.xtext.als.EnumName;
import fr.univartois.cril.xtext.als.EnumPropertyName;
import fr.univartois.cril.xtext.als.ExactlyName;
import fr.univartois.cril.xtext.als.Fact;
import fr.univartois.cril.xtext.als.FactName;
import fr.univartois.cril.xtext.als.Function;
import fr.univartois.cril.xtext.als.FunctionName;
import fr.univartois.cril.xtext.als.Predicate;
import fr.univartois.cril.xtext.als.Signature;
import fr.univartois.cril.xtext.als.SignatureName;
import fr.univartois.cril.xtext.als.Specification;
import fr.univartois.cril.xtext.als.impl.SpecificationImpl;

public class AlsQNP extends   DefaultDeclarativeQualifiedNameProvider {

	public String qualifiedName(Specification s) {
		System.out.println("le qualifiedNAme du module : "+s.getModule().getModuleName().getName().replace("/", "."));
		return s.getModule().getModuleName().getName().replace("/", ".");
	}
	public String qualifiedName(Function s) {
		System.out.println("le qualifiedNAme de la fonction: "+getBase(s)+s.getFunctionName().getName().replaceAll("/", "."));
		return getBase(s)+s.getFunctionName().getName().replaceAll("/", ".");
	}
	
	public String qualifiedName(FunctionName s) {
		System.out.println("le qualifiedNAme de la fonctionName: "+getBase(s)+s.getName().replaceAll("/", "."));
		return getBase(s)+s.getName().replaceAll("/", ".");
		
	}
	public String qualifiedName(Fact s) {
		System.out.println("le qualifiedNAme de la Fact: "+getBase(s)+s.getFactName().getName().replaceAll("/", "."));
		return getBase(s)+s.getFactName().getName().replaceAll("/", ".");
	}
	public String qualifiedName(FactName s) {
		System.out.println("le qualifiedNAme de la FaxctName: "+getBase(s)+s.getName().replaceAll("/", "."));
		return getBase(s)+s.getName().replaceAll("/", ".");
		
	}
	public String qualifiedName(EnumName  s) {
		System.out.println("le qualifiedNAme de la Fact: "+getBase(s)+s.getName().replaceAll("/", "."));
		return getBase(s)+s.getName().replaceAll("/", ".");
	}
	public String qualifiedName(EnumDecl s) {
		System.out.println("le qualifiedNAme de la Fact: "+getBase(s)+s.getEnumName().getName().replaceAll("/", "."));
		return getBase(s)+s.getEnumName().getName().replaceAll("/", ".");
	}
	public String qualifiedName(EnumPropertyName s) {
		System.out.println("le qualifiedNAme de la Fact: "+getBase(s)+s.getName().replaceAll("/", "."));
		return getBase(s)+s.getName().replaceAll("/", ".");
	}
	
	/*public String qualifiedName(Signature s) {
		System.out.println("le qualifiedNAme de la Fact: "+getBase(s)+s.getSignatureName().get(0).getName().replaceAll("/", "."));
		return getBase(s)+s.getSignatureName().get(0).getName().replaceAll("/", ".");
	}*/
	public String qualifiedName(SignatureName s) {
		System.out.println("le qualifiedNAme de la Fact: "+getBase(s)+s.getName().replaceAll("/", "."));
		return getBase(s)+s.getName().replaceAll("/", ".");
	}
	public String qualifiedName(Predicate s) {
		System.out.println("le qualifiedNAme de la Fact: "+getBase(s)+s.getPredicateName().getName().replaceAll("/", "."));
		return getBase(s)+s.getPredicateName().getName().replaceAll("/", ".");
	}
	public String qualifiedName(ExactlyName s) {
		System.out.println("le qualifiedNAme de la Fact: "+getBase(s)+s.getName().replaceAll("/", "."));
		return getBase(s)+s.getName().replaceAll("/", ".");
	}

	private String getBase(EObject o) {
		EObject parent =o;
		
		while(parent!=null && parent.getClass()!=SpecificationImpl.class) {
			parent = parent.eContainer();
			
		}
		if (parent==null) {
			System.out.println("NULLLLL");
			return "";
		}
		
		return ((Specification)parent).getModule().getModuleName().getName().replace('/', '.')+".";
		
	/*	String result = o.eResource().getURI().toPlatformString(false);
		result = result.substring(result.indexOf("/",2)+1, result.lastIndexOf("."));
		return result;*/

	}


	

}
