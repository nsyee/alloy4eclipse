package fr.univartois.cril.alloyplugin.core;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4compiler.ast.Func;
import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.alloyplugin.api.IALSFunction;

public class Function implements IALSFunction {
	
	public static final Image icon =ALSImageRegistry.getImage(ALSImageRegistry.FUNCTION_ICON_ID);

	private Func func;

	public Function(Func func) {
		this.func=func;
	}

	public String toString(){
		return func.toString().substring(9);
	}

	public Image getIcon() {
		return icon;
	}

	public int getBeginLine() {
		return func.pos.y;
	}
    public int getEndLine() {
        return func.pos.y2;
    }

    public String getId() {
        return func.label.substring(5);
    }

    public boolean isPrivate() {
        return func.isPrivate!=null;
    }
}
