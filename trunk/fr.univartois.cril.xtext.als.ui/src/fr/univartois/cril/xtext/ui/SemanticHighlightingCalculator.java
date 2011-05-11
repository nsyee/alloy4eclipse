package fr.univartois.cril.xtext.ui;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import fr.univartois.cril.xtext.als.AlsPackage;
import fr.univartois.cril.xtext.als.CheckCommand;
import fr.univartois.cril.xtext.als.Expression;
import fr.univartois.cril.xtext.als.Ref;
import fr.univartois.cril.xtext.als.ReferencesName;
import fr.univartois.cril.xtext.als.ReferencesSig;
import fr.univartois.cril.xtext.als.RunCommand;
import fr.univartois.cril.xtext.als.Signature;
import fr.univartois.cril.xtext.als.Typescope;

public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {
	// static int compteur = 0;
	// static int compteur2 = 0;
	private Collection<String> collection;

	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {

		Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
		collection = getUsedSimpleTypes(resource);

		while (iter.hasNext()) {
			EObject current = iter.next();
			if (current instanceof Expression) {
				treatment(current, ((Expression) current).getNameRef(),
						acceptor, AlsPackage.Literals.EXPRESSION__NAME_REF
								.getName());
			}
			if (current instanceof Ref) {
				treatment(current, ((Ref) current).getNameRef(), acceptor,
						AlsPackage.Literals.REF__NAME_REF.getName());
			}

			if (current instanceof CheckCommand) {
				simpleTreatment(current, acceptor,
						AlsPackage.Literals.CHECK_COMMAND__NAME.getName(),
						HighlightingConfiguration.assertionName);
			}
			if (current instanceof ReferencesSig) {
				simpleTreatment(current, acceptor,
						AlsPackage.Literals.REFERENCES_SIG__NAME_REF.getName(),
						HighlightingConfiguration.signatureName);
			}
			if (current instanceof Typescope) {
				treatment(current, ((Typescope) current).getName(), acceptor,
						AlsPackage.Literals.TYPESCOPE__NAME.getName());
			}
			if (current instanceof RunCommand) {
				
				simpleTreatment(current, acceptor,
						AlsPackage.Literals.RUN_COMMAND__NAME.getName(),
						HighlightingConfiguration.predicateName);
			}
			if (current instanceof Signature) {
				simpleTreatment(
						current,
						acceptor,
						AlsPackage.Literals.SIGNATURE__SIGNATURE_NAME.getName(),
						HighlightingConfiguration.signatureName);
			}

		}
	}

	private boolean nodeExists(Collection<String> c, String s) {
		for (String current : c) {
			if (s.equals(current))
				return true;
		}
		return false;
	}

	private Collection<String> getUsedSimpleTypes(XtextResource resource) {
		
		Collection<String> result = new HashSet<String>();
		Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
		// compteur2 = 0;
		while (iter.hasNext()) {
			EObject current = iter.next();
			if (current instanceof Expression) {
				if (((Expression) current).getNameRef() != null) {

					if (((Expression) current).getNameRef().getName() != null) {
//						System.out.println(((Expression) current).getNameRef()
//								.getName());
						result.add(((Expression) current).getNameRef()
								.getName());
					}
				}
			}
			if (current instanceof RunCommand) {
				if (((RunCommand) current).getName() != null) {

					if (((RunCommand) current).getName().getName() != null) {
						//System.out.println(((RunCommand) current).getName2()
							//	.getName());
						result.add(((RunCommand) current).getName().getName());
					}
				}
			}
			if (current instanceof CheckCommand) {
				if (((CheckCommand) current).getName() != null) {

					if (((CheckCommand) current).getName().getName() != null) {
						//System.out.println(((CheckCommand) current).getName()
						//		.getName());
						result
								.add(((CheckCommand) current).getName()
										.getName());
					}
				}
			}
			if (current instanceof Typescope) {
				if (((Typescope) current).getName() != null) {

					if (((Typescope) current).getName().getName() != null) {
						//System.out.println(((Typescope) current).getName()
						//		.getName());
						result.add(((Typescope) current).getName().getName());
					}
				}
			}
			if (current instanceof ReferencesSig) {
				if (((ReferencesSig) current).getNameRef() != null) {

					if (((ReferencesSig) current).getNameRef().getName() != null) {
						//System.out.println(((ReferencesSig) current)
						//		.getNameRef().getName());
						result.add(((ReferencesSig) current).getNameRef()
								.getName());
					}
				}
			}
			if (current instanceof Ref) {
				if (((Ref) current).getNameRef() != null) {

					if (((Ref) current).getNameRef().getName() != null) {
						//System.out.println(((Ref) current).getNameRef()
						//		.getName());
						result.add(((Ref) current).getNameRef().getName());
					}
				}
			}
		}
		return result;
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
			return findNode(feature, node);
		}
		return null;
	}

	private AbstractNode findNode(String feature, CompositeNode node) {
		if (node != null) {
			// System.out.println("message CompositNode node : " +
			// node.getChildren());
			for (AbstractNode child : node.getChildren()) {
				if (child instanceof LeafNode) {
					if (feature.equals(((LeafNode) child).getFeature())
							|| nodeExists(collection, ((LeafNode) child)
									.getText())) {

						return child;
					}

				}

				if (child instanceof CompositeNode) {
					// System.out.println("message CompositNode : " +
					// ((CompositeNode)child).getChildren());
					AbstractNode aux = findNode(feature, (CompositeNode) child);
					// System.out.println("DEBUG : " + ((CompositeNode)
					// child).getChildren() + " " + (++compteur));
					if (aux != null) {

						return (LeafNode) aux;
					}
				}

			}
		}
		return null;
	}

	public AbstractNode findFirstFeatureNode(EObject semantic, String feature) {
		return null;

	}

	private void simpleTreatment(EObject current,
			IHighlightedPositionAcceptor acceptor, String string, String style) {
		AbstractNode node = this.getFirstFeatureNode(current, string);
		highlightNode(node, style, acceptor);
	}

	private void treatment(EObject current, ReferencesName refname,
			IHighlightedPositionAcceptor acceptor, String string) {
		if (refname != null) {
			if (refname.eContainingFeature() != null) {
				if (refname.eContainingFeature().getName().equals(
						"signatureName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node,
							HighlightingConfiguration.signatureName, acceptor);
				}
				if (refname.eContainingFeature().getName().equals(
						"predicateName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node,
							HighlightingConfiguration.predicateName, acceptor);
				}
				if (refname.eContainingFeature().getName().equals("factName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node, HighlightingConfiguration.factName,
							acceptor);
				}
				if (refname.eContainingFeature().getName().equals(
						"functionName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node, HighlightingConfiguration.functionName,
							acceptor);
				}

				if (refname.eContainingFeature().getName().equals(
						"propertyName")
						|| refname.eContainingFeature().getName().equals(
								"VariableName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node, HighlightingConfiguration.propertyName,
							acceptor);
				}
				if (refname.eContainingFeature().getName().equals("enumName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node, HighlightingConfiguration.enumName,
							acceptor);
				}
				if (refname.eContainingFeature().getName().equals(
						"enumPropertyName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node,
							HighlightingConfiguration.enumPropertyName,
							acceptor);
				}
			} else {
				// System.out.println("{");
				// System.out.println("RETURN NULL");
				// System.out.println(current.eContainer());
				// System.out.println("}");
				AbstractNode node = this.getFirstFeatureNode(current, string);
				highlightNode(node, HighlightingConfiguration.referenceName,
						acceptor);
			}
		}
	}
}
