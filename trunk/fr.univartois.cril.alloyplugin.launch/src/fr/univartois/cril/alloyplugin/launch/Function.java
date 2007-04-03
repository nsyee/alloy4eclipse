package fr.univartois.cril.alloyplugin.launch;

import edu.mit.csail.sdg.alloy4compiler.ast.Func;
import fr.univartois.cril.alloyplugin.core.ui.IALSFunction;

public class Function implements IALSFunction {
	
	private Func func;

	public Function(Func func) {
		this.func=func;
	}

	public String toString(){
		return func.toString();
	}
}
