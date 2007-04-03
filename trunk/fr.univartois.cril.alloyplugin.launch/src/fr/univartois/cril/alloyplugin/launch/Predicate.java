package fr.univartois.cril.alloyplugin.launch;

import edu.mit.csail.sdg.alloy4compiler.ast.Func;
import fr.univartois.cril.alloyplugin.core.ui.IALSPredicate;

public class Predicate implements IALSPredicate {
	
	private Func func;

	public Predicate(Func func) {
		this.func=func;
	}

	public String toString(){
		return func.toString();
	}
}
