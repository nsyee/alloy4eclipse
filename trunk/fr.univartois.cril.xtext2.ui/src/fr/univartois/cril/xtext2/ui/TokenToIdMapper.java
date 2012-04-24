package fr.univartois.cril.xtext2.ui;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

public class TokenToIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	private static final Pattern QUOTED = Pattern.compile(
			"(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);
	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (PUNCTUATION.matcher(tokenName).matches()) {
			return DefaultHighlightingConfiguration.PUNCTUATION_ID;
		}
		if (QUOTED.matcher(tokenName).matches()) {

			if ("'seq/Int'".equals(tokenName) || "'Int'".equals(tokenName)
					|| "'iden'".equals(tokenName) || "'univ'".equals(tokenName)
					|| "'sum'".equals(tokenName) || "'or'".equals(tokenName)
					|| "'set'".equals(tokenName) || "'in'".equals(tokenName)) {
				return HighlightingConfiguration.opName;
			}
			if ("'lone'".equals(tokenName) || "'none'".equals(tokenName)
					|| "'all'".equals(tokenName) || "'some'".equals(tokenName)
					|| "'one'".equals(tokenName) || "'no'".equals(tokenName)) {
				return HighlightingConfiguration.quantifier;
			}
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if ("RULE_STRING".equals(tokenName)) {
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		if ("RULE_INT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		if ("RULE_ML_COMMENT".equals(tokenName)
				| "RULE_SL_COMMENT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}
}
