package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import fr.univartois.cril.alloyplugin.core.ui.IALSFact;

public class Fact implements IALSFact {

	public static final Image icon = Activator.getDefault().getImage(Activator.FACT_ICON_ID);

	private Expr expr;

	public Fact(Expr expr) {
	this.expr=expr;	
	}
	public String toString(){		
		return expr.toString();
	}
	public Image getIcon() {
		return icon;
	}
}
