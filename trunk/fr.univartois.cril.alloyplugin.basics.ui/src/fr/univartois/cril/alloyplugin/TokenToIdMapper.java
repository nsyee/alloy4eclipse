package fr.univartois.cril.alloyplugin;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

public class TokenToIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	private static final Pattern QUOTED = Pattern.compile(
			"(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);
	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (PUNCTUATION.matcher(tokenName).matches()) {
			return DefaultLexicalHighlightingConfiguration.PUNCTUATION_ID;
		}
		if (QUOTED.matcher(tokenName).matches()) {

			if ("'seq/Int'".equals(tokenName) || "'Int'".equals(tokenName)
					|| "'iden'".equals(tokenName) || "'univ'".equals(tokenName)
					|| "'sum'".equals(tokenName) || "'or'".equals(tokenName)
					|| "'set'".equals(tokenName) || "'in'".equals(tokenName)
					|| "'no'".equals(tokenName)) {
				return SemanticHighlightingConfiguration.opName;
			}
			if ("'lone'".equals(tokenName) || "'none'".equals(tokenName)
					|| "'all'".equals(tokenName) || "'some'".equals(tokenName)
					|| "'one'".equals(tokenName)) {
				return SemanticHighlightingConfiguration.quantifier;
			}
			return DefaultLexicalHighlightingConfiguration.KEYWORD_ID;
		}
		if ("RULE_STRING".equals(tokenName)) {
			return DefaultLexicalHighlightingConfiguration.STRING_ID;
		}
		if ("RULE_INT".equals(tokenName)) {
			return DefaultLexicalHighlightingConfiguration.NUMBER_ID;
		}
		if ("RULE_ML_COMMENT".equals(tokenName)
				| "RULE_SL_COMMENT".equals(tokenName)) {
			return DefaultLexicalHighlightingConfiguration.COMMENT_ID;
		}
		return DefaultLexicalHighlightingConfiguration.DEFAULT_ID;
	}
}
