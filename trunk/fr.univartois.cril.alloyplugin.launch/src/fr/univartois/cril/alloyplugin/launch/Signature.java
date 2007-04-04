package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4compiler.ast.Sig;
import fr.univartois.cril.alloyplugin.core.ui.IALSSignature;

public class Signature implements IALSSignature {

	public static final Image icon = Activator.getDefault().getImage(Activator.SIGNATURE_ICON_ID);

	private Sig sig;
	public Signature(Sig sig) {
		this.sig=sig;

	}
	public String toString(){
		return sig.toString();
	}
	public Image getIcon() {
		return icon;
	}
	public int getLine() {
		return sig.pos.y;
	}
}
