package fr.univartois.cril.alloyplugin.launch;

import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import fr.univartois.cril.alloyplugin.core.ui.IALSFact;

public class Fact implements IALSFact {

	private Expr expr;

	public Fact(Expr expr) {
	this.expr=expr;	
	}
	public String toString(){		
		return "fact";//expr.toString();
	}
}
