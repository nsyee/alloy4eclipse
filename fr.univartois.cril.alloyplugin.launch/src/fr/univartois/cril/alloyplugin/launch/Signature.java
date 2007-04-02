package fr.univartois.cril.alloyplugin.launch;

import edu.mit.csail.sdg.alloy4compiler.ast.Sig;
import fr.univartois.cril.alloyplugin.core.ui.IALSSignature;

public class Signature implements IALSSignature {

	private Sig sig;
	public Signature(Sig sig) {
		this.sig=sig;

	}
	public String toString(){
		return "signature";
	}
}
