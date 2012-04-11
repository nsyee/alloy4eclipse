package fr.univartois.cril.xtext2.navigation;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;


import com.google.inject.Inject;
import com.google.inject.Provider;

import fr.univartois.cril.xtext2.als.AlsPackage;
import fr.univartois.cril.xtext2.als.OpenName;

public class AlsHyperlinkHelper extends HyperlinkHelper {
	@Inject
	private Provider<XtextHyperlink> hyperlinkProvider;
	
	@Inject 
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
		super.createHyperlinksByOffset(resource, offset, acceptor);

		EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		if (eObject instanceof OpenName) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject,
					AlsPackage.Literals.OPEN_NAME__IMPORT_URI);
			if (!nodes.isEmpty()) {
				INode node = nodes.get(0);
				XtextHyperlink hyperlink = hyperlinkProvider.get();
				hyperlink.setHyperlinkRegion(new Region(node.getOffset(), node.getLength()));
				hyperlink.setHyperlinkText("Open included file");
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				IProject myProject = root.getProject(eObject.eResource().getURI().segment(1));
				String location;
				if (myProject.getFile(
						"/" + ((OpenName) eObject).getImportURI() + ".als").exists()) {
					location = "platform:/resource/"
							+ eObject.eResource().getURI().segment(1) + "/"
							+ ((OpenName) eObject).getImportURI() + ".als";

				} else {
					location = "platform:/resource/" + "A4 models library"
							+ "/" + ((OpenName) eObject).getImportURI()
							+ ".als";
				}
				URI importUri = URI.createURI(location);
				hyperlink.setURI(importUri);
				acceptor.accept(hyperlink);
			}
		}
	}

}