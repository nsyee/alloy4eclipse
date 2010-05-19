package fr.univartois.cril.xtext.ui;

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
import fr.univartois.cril.xtext.als.Typescope;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	public void provideHighlightingFor(XtextResource resource,IHighlightedPositionAcceptor acceptor) {
		
		Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
		//getUsedSimpleTypes(resource);
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
						AlsPackage.Literals.REFERENCES_SIG__NAME_REF
								.getName(),
						HighlightingConfiguration.signatureName);
			}
			if (current instanceof Typescope) {
				treatment(current, ((Typescope) current).getName(), acceptor,
						AlsPackage.Literals.TYPESCOPE__NAME.getName());
			}
			if (current instanceof RunCommand) {
				simpleTreatment(current, acceptor,
						AlsPackage.Literals.RUN_COMMAND__NAME2.getName(),
						HighlightingConfiguration.predicateName);
			}

		}
	}

	/*private Collection<String> getUsedSimpleTypes(XtextResource resource) {
		Collection<String> result = new HashSet<String>();
		Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
		while (iter.hasNext()) {
			EObject current = iter.next();
			if (current instanceof Expression) {
				if(((Expression) current).getNameRef()!=null){
					
				    if(((Expression) current).getNameRef().getName()!=null){
				    	System.out.println( ((Expression) current).getNameRef().getName() + " " + i++);	
					    result.add(((Expression) current).getNameRef().getName());
				    }
				}
			}
		}
		return result;
	}*/
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
							HighlightingConfiguration.signatureName,
							acceptor);
				}
				if (refname.eContainingFeature().getName().equals(
						"predicateName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node,
							HighlightingConfiguration.predicateName,
							acceptor);
				}
				if (refname.eContainingFeature().getName().equals("factName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node,
							HighlightingConfiguration.factName,
							acceptor);
				}
				if (refname.eContainingFeature().getName().equals(
						"functionName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node,
							HighlightingConfiguration.functionName,
							acceptor);
				}

				if (refname.eContainingFeature().getName().equals(
						"propertyName")||refname.eContainingFeature().getName().equals(
						"VariableName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node,
							HighlightingConfiguration.propertyName,
							acceptor);
				}
				if (refname.eContainingFeature().getName().equals("enumName")) {
					AbstractNode node = this.getFirstFeatureNode(current,
							string);
					highlightNode(node,
							HighlightingConfiguration.enumName,
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
				System.out.println("{");
				System.out.println("RETURN NULL");
				System.out.println(current.eContainer());
				System.out.println("}");
				AbstractNode node = this.getFirstFeatureNode(current, string);
				highlightNode(node,
						HighlightingConfiguration.referenceName,
						acceptor);
			}
		}
	}
}
