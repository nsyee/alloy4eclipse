package fr.univartois.cril.xtext.navigation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.eclipse.xtext.util.TextLocation;

import com.google.inject.Inject;
import com.google.inject.Provider;

import fr.univartois.cril.xtext.als.OpenName;

public class AlsHyperlinkHelper extends HyperlinkHelper {
	@Inject
	private Provider<XtextHyperlink> hyperlinkProvider;

	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset,
			IHyperlinkAcceptor acceptor) {
		super.createHyperlinksByOffset(resource, offset, acceptor);

		TextLocation loc = new TextLocation();
		EObject eObject = EObjectAtOffsetHelper.resolveElementAt(resource,
				offset, loc);
		if (eObject instanceof OpenName) {

			String tmp = ((OpenName) eObject).getImportURI();

			XtextHyperlink hyperlink = hyperlinkProvider.get();
			hyperlink.setHyperlinkRegion(new Region(0, 0));
			hyperlink.setHyperlinkText("Open included file");
			URI importUri = URI
					.createURI("platform:/resource/A4 models library/" + tmp
							+ ".als");
			hyperlink.setURI(importUri);
			acceptor.accept(hyperlink);

		}
	}

}
