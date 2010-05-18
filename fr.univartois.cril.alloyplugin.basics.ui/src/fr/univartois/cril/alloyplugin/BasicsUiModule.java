/*
 * generated by Xtext
 */
package fr.univartois.cril.alloyplugin;

import org.eclipse.xtext.ui.common.editor.outline.actions.IContentOutlineNodeAdapterFactory;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

import fr.univartois.cril.alloyplugin.outline.BasicsOutlineNodeAdapterFactory;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BasicsUiModule extends
		fr.univartois.cril.alloyplugin.AbstractBasicsUiModule {
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SemanticHighlightingCalculator.class;
	}

	public Class<? extends ISemanticHighlightingConfiguration> bindISemanticHighlightingConfiguration() {
		return SemanticHighlightingConfiguration.class;
	}

	public Class<? extends DefaultAntlrTokenToAttributeIdMapper> bindDefaultAntlrTokenToAttributeIdMapper() {
		return TokenToIdMapper.class;
	}
	
	public Class<? extends IContentOutlineNodeAdapterFactory> bindIContentOutlineAdapterFactory() {
		return BasicsOutlineNodeAdapterFactory.class;
	}
}
