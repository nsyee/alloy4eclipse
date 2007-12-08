/*
 * Created on 5 nov. 07
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package fr.univartois.cril.alloyplugin.core;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4.Pair;
import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.alloyplugin.api.IALSAssert;

public class Assert implements IALSAssert {

    public static final Image icon =ALSImageRegistry.getImage(ALSImageRegistry.ASSERT_ICON_ID);

    private Pair<String,Expr> assertion;

    public Assert(Pair<String,Expr> expr) {
    this.assertion=expr; 
    }
    public String toString(){       
        return assertion.toString();
    }
    public Image getIcon() {
        return icon;
    }
    public int getBeginLine() {
        return assertion.b.pos.y;
    }
    public int getEndLine() {
        return assertion.b.pos.y2;
    }

}
