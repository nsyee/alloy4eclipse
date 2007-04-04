package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4.Pair;
import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ui.IALSFact;

public class Fact implements IALSFact {

	public static final Image icon =AlloyPlugin.getDefault().getImage(AlloyPlugin.FACT_ICON_ID);

	private Pair<String,Expr> fact;

	public Fact(Pair<String,Expr> expr) {
	this.fact=expr;	
	}
	public String toString(){		
		return fact.toString();
	}
	public Image getIcon() {
		return icon;
	}
	public int getLine() {
		return fact.b.pos.y;
	}
}