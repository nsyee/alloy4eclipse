package fr.univartois.cril.alloyplugin.core;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4.SafeList;
import edu.mit.csail.sdg.alloy4compiler.ast.Sig;
import edu.mit.csail.sdg.alloy4compiler.ast.Sig.Field;
import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.alloyplugin.api.IALSSignature;

public class Signature implements IALSSignature {

	public static final Image icon = ALSImageRegistry
			.getImage(ALSImageRegistry.SIGNATURE_ICON_ID);

	private Sig sig;

	public Signature(Sig sig) {
		this.sig = sig;

	}

	public String toString() {
		return sig.toString().substring(5);
	}

	public Image getIcon() {
		return icon;
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
		return sig.isPrivate != null;
	}

	/**
	 * @author romuald druelle
	 */
	public String[] getFieldsName() {
		int i = 0;
		SafeList<Field> members = sig.getFields();
		String[] fields = new String[members.size()];
		String string = null;
		int length = 0;
		for (Sig.Field field : sig.getFields()) {
			string = field.toString();
			int start = 0;
			while (':' != string.charAt(start++))
				;
			start++;
			length = string.length();
			fields[i++] = field.toString().substring(start, length - 1);
		}
		return fields;
	}
}
