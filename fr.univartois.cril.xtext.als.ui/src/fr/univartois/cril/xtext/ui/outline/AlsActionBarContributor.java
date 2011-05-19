package fr.univartois.cril.xtext.ui.outline;


import org.eclipse.jface.action.Action;
import org.eclipse.xtext.ui.editor.outline.XtextContentOutlinePage;
import org.eclipse.xtext.ui.editor.outline.actions.DeclarativeActionBarContributor;

public class AlsActionBarContributor extends DeclarativeActionBarContributor {

	
	
	public Action addFilterParserRulesToolbarAction(XtextContentOutlinePage page) {
		
		page.setLinkingEnabled(true);
		return new FilterFooAction(page);
	}

}
