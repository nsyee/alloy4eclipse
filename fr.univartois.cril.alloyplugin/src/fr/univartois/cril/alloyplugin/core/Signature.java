package fr.univartois.cril.alloyplugin.core;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4compiler.ast.Sig;
import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.alloyplugin.api.IALSSignature;

public class Signature implements IALSSignature {

	public static final Image icon = ALSImageRegistry.getImage(ALSImageRegistry.SIGNATURE_ICON_ID);
	public static final Image icon2 = ALSImageRegistry.getImage(ALSImageRegistry.SIGNATURE_PRIVATE_ICON_ID);

	private Sig sig;
	public Signature(Sig sig) {
		this.sig=sig;

	}
	public String toString(){
		return sig.toString().substring(5);
	}
	public Image getIcon() {
		if (!isPrivate())
		    return icon;
		return icon2;
	}
	public int getBeginLine() {
		return sig.pos.y;
	}
    public int getEndLine() {
        return sig.pos.y2;
    }
    public String getId() {
        return sig.label.substring(5);
    }
    public boolean isPrivate() {
        return sig.isPrivate!=null;
    }
}
