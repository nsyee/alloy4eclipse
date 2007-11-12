package fr.univartois.cril.alloyplugin.core;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4compiler.ast.Sig;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.api.IALSSignature;

public class Signature implements IALSSignature {

	public static final Image icon = AlloyPlugin.getDefault().getImage(AlloyPlugin.SIGNATURE_ICON_ID);

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
	public int getBeginLine() {
		return sig.span().y;
	}
    public int getEndLine() {
        return sig.span().y2;
    }
}
