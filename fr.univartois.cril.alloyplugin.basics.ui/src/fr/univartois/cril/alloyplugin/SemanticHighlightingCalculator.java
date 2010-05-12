package fr.univartois.cril.alloyplugin;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import fr.univartois.cril.alloyplugin.basics.BasicsPackage;
import fr.univartois.cril.alloyplugin.basics.PropertyName;
import fr.univartois.cril.alloyplugin.basics.ReferencesName;
import fr.univartois.cril.alloyplugin.basics.SignatureName;

public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null)
			return;

		Iterator<EObject> allNode = EcoreUtil.getAllContents(resource, true);
		while (allNode.hasNext()) {
			EObject current = allNode.next();
			if (current instanceof SignatureName) {
				AbstractNode nodeName = getFirstFeatureNode(current,
						BasicsPackage.Literals.SIGNATURE_NAME.getName());
				highlightNode(nodeName,
						SemanticHighlightingConfiguration.signatureName,
						acceptor);
			}
			if (current instanceof ReferencesName) {
				AbstractNode nodeName = getFirstFeatureNode(current,
						BasicsPackage.Literals.REFERENCES_NAME__NAME.getName());
				highlightNode(nodeName,
						SemanticHighlightingConfiguration.referenceName,
						acceptor);
			}
			if (current instanceof PropertyName) {

				AbstractNode nodeName = getFirstFeatureNode(current,
						BasicsPackage.Literals.PROPERTY_NAME.getName());
				highlightNode(nodeName,
						SemanticHighlightingConfiguration.proprityName,
						acceptor);
			}
		}
	}

	private void highlightNode(AbstractNode node, String id,
			IHighlightedPositionAcceptor acceptor) {
		if (node == null)
			return;
		if (node instanceof LeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (LeafNode leaf : node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor
							.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}

	public AbstractNode getFirstFeatureNode(EObject semantic, String feature) {
		NodeAdapter adapter = NodeUtil.getNodeAdapter(semantic);
		if (adapter != null) {
			CompositeNode node = adapter.getParserNode();

			if (node != null) {

				for (AbstractNode child : node.getChildren()) {
					// System.out.println("DEBUG3");
					/*
					 * if (child instanceof LeafNode) {
					 * System.out.println("DEBUG4"); if
					 * (feature.equals(((LeafNode) child).getFeature())) {
					 * System.out.println("DEBUG5"); return child;
					 * 
					 * }
					 * 
					 * }
					 */
					return child;
				}
			}
		}
		return null;
	}

}
