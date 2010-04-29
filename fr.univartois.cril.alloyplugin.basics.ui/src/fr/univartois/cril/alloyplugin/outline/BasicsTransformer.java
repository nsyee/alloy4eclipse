/*
* generated by Xtext
*/
package fr.univartois.cril.alloyplugin.outline;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.common.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import fr.univartois.cril.alloyplugin.basics.Specification;

/**
 * customization of the default outline structure
 * 
 */
public class BasicsTransformer extends AbstractDeclarativeSemanticModelTransformer {
	
	@Override
	protected List<EObject> getChildren(EObject semanticNode) {
		return NO_CHILDREN;
	}

	protected List<EObject> getChildren(Specification semanticNode) {
		List<EObject> list = new ArrayList<EObject>();
		for (EObject eo : super.getChildren(semanticNode)) {
			if (eo!=semanticNode.getModule()) {
				list.add(eo);
			}
		}
		return list;
	}
}
