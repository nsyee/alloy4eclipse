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
import fr.univartois.cril.alloyplugin.basics.CheckCommand;
import fr.univartois.cril.alloyplugin.basics.Expression;
import fr.univartois.cril.alloyplugin.basics.Ref;
import fr.univartois.cril.alloyplugin.basics.ReferencesSig;
import fr.univartois.cril.alloyplugin.basics.RunCommand;
import fr.univartois.cril.alloyplugin.basics.Typescope;

public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {
	static int i = 0;

	// Dummy-Highlighting
	// of each block of 10 characters the last 5 are to be highlighted
	// this is not semantic but very briefly illustrates what kind of
	// information is processed
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
		while (iter.hasNext()) {
			EObject current = iter.next();

			if (current instanceof Expression) {
				if (((Expression) current).getNameRef() != null) {
					if (((Expression) current).getNameRef().eContainingFeature() != null) {
						if (((Expression) current).getNameRef().eContainingFeature().getName().equals("signatureName")) {
							System.out.println(((Expression) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.EXPRESSION__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.signatureName,acceptor);
						}
						if (((Expression) current).getNameRef().eContainingFeature().getName().equals("predicateName")) {
							System.out.println(((Expression) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.EXPRESSION__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.predicateName,acceptor);
						}
						if (((Expression) current).getNameRef().eContainingFeature().getName().equals("factName")) {
							System.out.println(((Expression) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.EXPRESSION__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.factName,acceptor);
						}
						if (((Expression) current).getNameRef().eContainingFeature().getName().equals("functionName")) {
							System.out.println(((Expression) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.EXPRESSION__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.functionName,acceptor);
						}
								
						if (((Expression) current).getNameRef().eContainingFeature().getName().equals("propertyName")) {
							System.out.println(((Expression) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.EXPRESSION__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.proprityName,acceptor);
						}
						if (((Expression) current).getNameRef().eContainingFeature().getName().equals("enumName")) {
							System.out.println(((Expression) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.EXPRESSION__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.enumName,acceptor);
						}
						if (((Expression) current).getNameRef().eContainingFeature().getName().equals("enumPropertyName")) {
							System.out.println(((Expression) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.EXPRESSION__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.enumPropertyName,acceptor);
						}
					}
					else{
						System.out.println("RETURN NULL");
						AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.EXPRESSION__NAME_REF.getName());
						highlightNode(node,SemanticHighlightingConfiguration.referenceName,acceptor);
					}
				}

			}
			if (current instanceof Ref) {
				// System.out.println(BasicsPackage.Literals.REF__NAME_REF.getName());
				
				if (((Ref) current).getNameRef() != null) {
					if (((Ref) current).getNameRef().eContainingFeature() != null) {
						if (((Ref) current).getNameRef().eContainingFeature().getName().equals("signatureName")) {
							System.out.println(((Ref) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REF__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.signatureName,acceptor);
						}
						if (((Ref) current).getNameRef().eContainingFeature().getName().equals("predicateName")) {
							System.out.println(((Ref) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REF__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.predicateName,acceptor);
						}
						if (((Ref) current).getNameRef().eContainingFeature().getName().equals("factName")) {
							System.out.println(((Ref) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REF__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.factName,acceptor);
						}
						if (((Ref) current).getNameRef().eContainingFeature().getName().equals("functionName")) {
							System.out.println(((Ref) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REF__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.functionName,acceptor);
						}
								
						if (((Ref) current).getNameRef().eContainingFeature().getName().equals("propertyName")) {
							System.out.println(((Ref) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REF__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.proprityName,acceptor);
						}
						if (((Ref) current).getNameRef().eContainingFeature().getName().equals("enumName")) {
							System.out.println(((Ref) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REF__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.enumName,acceptor);
						}
						if (((Ref) current).getNameRef().eContainingFeature().getName().equals("enumPropertyName")) {
							System.out.println(((Ref) current).getNameRef().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REF__NAME_REF.getName());
							highlightNode(node,SemanticHighlightingConfiguration.enumPropertyName,acceptor);
						}
					}
					else{
						System.out.println("RETURN NULL");
						AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REF__NAME_REF.getName());
						highlightNode(node,SemanticHighlightingConfiguration.referenceName,acceptor);
					}
				}


			}
			if (current instanceof CheckCommand) {
				// System.out.println(BasicsPackage.Literals.CHECK_COMMAND__NAME.getName());
				AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.CHECK_COMMAND__NAME.getName());
				highlightNode(node,SemanticHighlightingConfiguration.assertionName,acceptor);
			}
			if (current instanceof ReferencesSig) {
				// System.out.println(BasicsPackage.Literals.REFERENCES_SIG__NAME_REF.getName());
				AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.REFERENCES_SIG__NAME_REF.getName());
				highlightNode(node,SemanticHighlightingConfiguration.signatureName,acceptor);
			}
			if (current instanceof Typescope) {
				if (((Typescope) current).getName() != null) {
					if (((Typescope) current).getName().eContainingFeature() != null) {
						if (((Typescope) current).getName().eContainingFeature().getName().equals("signatureName")) {
							System.out.println(((Typescope) current).getName().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.TYPESCOPE__NAME.getName());
							highlightNode(node,SemanticHighlightingConfiguration.signatureName,acceptor);
						}
						if (((Typescope) current).getName().eContainingFeature().getName().equals("predicateName")) {
							System.out.println(((Typescope) current).getName().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.TYPESCOPE__NAME.getName());
							highlightNode(node,SemanticHighlightingConfiguration.predicateName,acceptor);
						}
						if (((Typescope) current).getName().eContainingFeature().getName().equals("factName")) {
							System.out.println(((Typescope) current).getName().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.TYPESCOPE__NAME.getName());
							highlightNode(node,SemanticHighlightingConfiguration.factName,acceptor);
						}
						if (((Typescope) current).getName().eContainingFeature().getName().equals("functionName")) {
							System.out.println(((Typescope) current).getName().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.TYPESCOPE__NAME.getName());
							highlightNode(node,SemanticHighlightingConfiguration.functionName,acceptor);
						}
								
						if (((Typescope) current).getName().eContainingFeature().getName().equals("propertyName")) {
							System.out.println(((Typescope) current).getName().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.TYPESCOPE__NAME.getName());
							highlightNode(node,SemanticHighlightingConfiguration.proprityName,acceptor);
						}
						if (((Typescope) current).getName().eContainingFeature().getName().equals("enumName")) {
							System.out.println(((Typescope) current).getName().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.TYPESCOPE__NAME.getName());
							highlightNode(node,SemanticHighlightingConfiguration.enumName,acceptor);
						}
						if (((Typescope) current).getName().eContainingFeature().getName().equals("enumPropertyName")) {
							System.out.println(((Typescope) current).getName().eContainingFeature().getName());
							AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.TYPESCOPE__NAME.getName());
							highlightNode(node,SemanticHighlightingConfiguration.enumPropertyName,acceptor);
						}
					}
					else{
						System.out.println("RETURN NULL");
						AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.TYPESCOPE__NAME.getName());
						highlightNode(node,SemanticHighlightingConfiguration.referenceName,acceptor);
					}
				}


				// System.out.println(BasicsPackage.Literals.TYPESCOPE__NAME.getName());
			}
			if (current instanceof RunCommand) {
				// System.out.println(BasicsPackage.Literals.RUN_COMMAND__NAME2.getName());
				AbstractNode node = this.getFirstFeatureNode(current,BasicsPackage.Literals.RUN_COMMAND__NAME2.getName());
				highlightNode(node,SemanticHighlightingConfiguration.predicateName,acceptor);
			}
			/*
			 * if (current instanceof ReferencesName) {
			 * System.out.println(BasicsPackage
			 * .Literals.REFERENCES_NAME.getName()); AbstractNode node =
			 * this.getFirstFeatureNode(current,
			 * BasicsPackage.Literals.REFERENCES_NAME.getName());
			 * highlightNode(node,
			 * SemanticHighlightingConfiguration.referenceName,acceptor); }
			 */
			/*
			 * if (current instanceof NameBis) { if (current.eContainer()
			 * instanceof SignatureNameImpl) { //System.out.println("3iw");
			 * 
			 * AbstractNode node = this.getFirstFeatureNode( (NameBis) current,
			 * BasicsPackage.Literals.NAME_BIS__DE.getName());
			 * highlightNode(node,
			 * SemanticHighlightingConfiguration.signatureName, acceptor);
			 * 
			 * }
			 * 
			 * }
			 */
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
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
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
					if (child instanceof LeafNode) {
						if (feature.equals(((LeafNode) child).getFeature())) {
							return child;
						}
					}
				}
			}
		}
		return null;
	}

}
