/*
 * Created on 12 nov. 07
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package fr.univartois.cril.alloyplugin.editor;

import java.util.List;

import org.eclipse.swt.graphics.Image;

import fr.univartois.cril.alloyplugin.api.IALSTreeDecorated;
import fr.univartois.cril.alloyplugin.api.Iconable;
import fr.univartois.cril.alloyplugin.api.NodeWithChildren;

class RootContent<T extends IALSTreeDecorated> implements Iconable, NodeWithChildren {
    private final String label;
    private final Image icon;
    
    private List<T> children;
    
    RootContent(String label, Image icon) {
        this.label = label;
        this.icon = icon;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }
    
    public boolean hasChildren() {
        if (children==null)
            return false;
        return !children.isEmpty();
    }
    
    @SuppressWarnings("unchecked")
    public IALSTreeDecorated [] children () {
        if (children==null) {
            return (T[])new IALSTreeDecorated[0];
        }            
        T [] tab = (T[])new IALSTreeDecorated[children.size()];
        return children.toArray(tab);
    }
    
    public <V> V [] children(V [] t) {
        return children.toArray(t);
    }
    
    /* (non-Javadoc)
     * @see fr.univartois.cril.alloyplugin.editor.Iconable#getIcon()
     */
    public Image getIcon() {
        return icon;
    }
    
    public int size() {
        return children.size();
    }
    
    @Override 
    public String toString() {
        return label;
    }
}