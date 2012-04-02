/*
* generated by Xtext
*/
package fr.univartois.cril.xtext2.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.univartois.cril.xtext2.services.AlsGrammarAccess;

public class AlsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AlsGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.univartois.cril.xtext2.parser.antlr.internal.InternalAlsParser createParser(XtextTokenStream stream) {
		return new fr.univartois.cril.xtext2.parser.antlr.internal.InternalAlsParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Specification";
	}
	
	public AlsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AlsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
