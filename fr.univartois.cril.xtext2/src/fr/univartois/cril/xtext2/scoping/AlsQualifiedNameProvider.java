package fr.univartois.cril.xtext2.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;

import fr.univartois.cril.xtext2.als.Assertion;
import fr.univartois.cril.xtext2.als.AssertionName;
import fr.univartois.cril.xtext2.als.Fact;
import fr.univartois.cril.xtext2.als.FactName;
import fr.univartois.cril.xtext2.als.Function;
import fr.univartois.cril.xtext2.als.FunctionName;
import fr.univartois.cril.xtext2.als.Let;
import fr.univartois.cril.xtext2.als.Predicate;
import fr.univartois.cril.xtext2.als.PredicateName;
import fr.univartois.cril.xtext2.als.PropertyName;
import fr.univartois.cril.xtext2.als.ReferencesName;
import fr.univartois.cril.xtext2.als.Specification;

public class AlsQualifiedNameProvider extends
                DefaultDeclarativeQualifiedNameProvider {

        public String qualifiedName(Specification s) {
                return s.getModule().getModuleName();
        }
        
        public String qualifiedName(Let l) {
                return l.getName().getName();
        }
        
        public String qualifiedName(Predicate p) {
                return p.getName().getName();
        }
        
        public String qualifiedName(Function f) {
                return f.getName().getName();
        }
        
        public String qualifiedName(Assertion a) {
                return a.getName().getName();
        }
        
        public String qualifiedName(Fact f) {
                return f.getName().getName();
        }

        public String qualifiedName(PredicateName p) {
                return p.getName();
        }
        
        public String qualifiedName(FunctionName f) {
                return f.getName();
        }
        
        public String qualifiedName(AssertionName a) {
                return a.getName();
        }
        
        public String qualifiedName(FactName f) {
                return f.getName();
        }
        
        public String qualifiedName(ReferencesName r) {
                if (!(r instanceof PropertyName)) {
                        return r.getName();                     
                }
                return null;
        }
}