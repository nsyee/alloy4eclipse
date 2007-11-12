/*
 * Created on 12 nov. 07
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package fr.univartois.cril.alloyplugin.editor;

import java.util.List;

import org.eclipse.swt.graphics.Image;

import fr.univartois.cril.alloyplugin.core.ui.IALSTreeDecorated;
import fr.univartois.cril.alloyplugin.core.ui.Iconable;

class RootContent implements Iconable {
    private final String label;
    private final Image icon;
    
    private List<? extends IALSTreeDecorated> children;
    
    RootContent(String label, Image icon) {
        this.label = label;
        this.icon = icon;
    }

    public void setChildren(List<? extends IALSTreeDecorated> children) {
        this.children = children;
    }
    
    public boolean hasChildren() {
        if (children==null)
            return false;
        return !children.isEmpty();
    }
    
    public Object [] children () {
        if (children==null) {
            return new Object[0];
        }            
        return children.toArray();
    }
    
    /* (non-Javadoc)
     * @see fr.univartois.cril.alloyplugin.editor.Iconable#getIcon()
     */
    public Image getIcon() {
        return icon;
    }
    
    @Override 
    public String toString() {
        return label;
    }
}