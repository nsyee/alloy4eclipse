package fr.univartois.cril.xtext.ui.outline;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;

public class FooOutlineFilter extends ViewerFilter {

	@Override
	public boolean select( Viewer viewer, Object parentElement, Object element) {
	    if ((parentElement != null) 
	            && (parentElement instanceof ContentOutlineNode)) {
	          ContentOutlineNode parentNode = (ContentOutlineNode) parentElement;
	          EClass clazz = parentNode.getClazz();
	          
	        }
	        return true;
	      }


}
