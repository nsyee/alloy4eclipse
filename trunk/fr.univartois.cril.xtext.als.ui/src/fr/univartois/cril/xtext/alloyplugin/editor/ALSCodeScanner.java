package fr.univartois.cril.xtext.alloyplugin.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.NumberRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

/**
 * Scanner used for Alloy code. (associated with IDocument.DEFAULT_CONTENT_TYPE
 * partition in ALSSourceViewerConfiguration)
 */
public class ALSCodeScanner extends RuleBasedScanner {

	/** keywords */
	/*
	 * abstract all and as assert but check disj else exactly extends fact for
	 * fun iden if iff implies in Int int let lone module no none not one open
	 * or part pred run set sig some sum then univ
	 */

	/**
	 * Alloy allowed words detector.
	 */
	static class ALSWordDetector implements IWordDetector {

		public boolean isWordPart(char c) {
			return (Character.isJavaIdentifierPart(c));
		}

		public boolean isWordStart(char c) {
			return (Character.isJavaIdentifierStart(c) || c == '\'');
		}
	}

	static class ALSSignatureDetector implements IWordDetector {

		public boolean isWordPart(char c) {
			return Character.isJavaIdentifierPart(c);
		}

		public boolean isWordStart(char c) {
			return Character.isLetter(c) && Character.isUpperCase(c);
		}
	}

	/**
	 * Constructor. Create rules used by color syntax.
	 * 
	 * @param provider
	 *            Classe fournissant les attributs de texte.
	 */
	private ALSCodeScanner(ALSTextAttributeProvider provider) {
		List<IRule> rules = new ArrayList<IRule>(); // Contiendra les régles

		/*
		 * Chaque token contient l'attribut au texte correspondant.
		 */
		IToken keyword = new Token(provider
				.getAttribute(ALSTextAttributeProvider.KEYWORD_ATTRIBUTE));
		IToken quantifier = new Token(provider
				.getAttribute(ALSTextAttributeProvider.QUANTIFIER_ATTRIBUTE));
		IToken command = new Token(provider
				.getAttribute(ALSTextAttributeProvider.COMMAND_ATTRIBUTE));
		IToken directive = new Token(provider
				.getAttribute(ALSTextAttributeProvider.DIRECTIVE_ATTRIBUTE));
		IToken undefined = new Token(provider
				.getAttribute(ALSTextAttributeProvider.DEFAULT_ATTRIBUTE));
		IToken decNumber = new Token(
				provider
						.getAttribute(ALSTextAttributeProvider.DECIMAL_NUMBER_ATTRIBUTE));
		// IToken string = new
		//Token(provider.getAttribute(ALSTextAttributeProvider.STRING_ATTRIBUTE)
		// );
		IToken signature = new Token(provider
				.getAttribute(ALSTextAttributeProvider.SIGNATURE_ATTRIBUTE));
		IToken string = new Token(provider
				.getAttribute(ALSTextAttributeProvider.STRING_ATTRIBUTE));
		rules.add(new SingleLineRule("\"", "\"", string, '\0', true));
		// rules.add(new SingleLineRule("'", "'", string, '\0', true));
		// generic rules for spaces
		rules.add(new WhitespaceRule(new IWhitespaceDetector() {
			public boolean isWhitespace(char c) {
				return Character.isWhitespace(c);
			}
		}));

		rules.add(new WordRule(new ALSSignatureDetector(), signature));

		// Si le mot n'est pas dans la liste, renvoie undefined
		WordRule wr = new WordRule(new ALSWordDetector(), undefined);

		// Ajout des mot clefs
		for (int i = 0; i < AlloySyntaxConstants.keywords.length; ++i) {
			wr.addWord(AlloySyntaxConstants.keywords[i], keyword);
		}
		for (int i = 0; i < AlloySyntaxConstants.quantifiers.length; ++i) {
			wr.addWord(AlloySyntaxConstants.quantifiers[i], quantifier);
		}
		for (int i = 0; i < AlloySyntaxConstants.commands.length; ++i) {
			wr.addWord(AlloySyntaxConstants.commands[i], command);
		}
		for (int i = 0; i < AlloySyntaxConstants.directives.length; ++i) {
			wr.addWord(AlloySyntaxConstants.directives[i], directive);
		}

		rules.add(wr);
		rules.add(new NumberRule(decNumber));// pour les nombres

		IRule[] param = new IRule[rules.size()];
		rules.toArray(param);
		setRules(param);
	}

	private static ALSCodeScanner instance;

	public static synchronized ALSCodeScanner instance() {
		if (instance == null) {
			instance = new ALSCodeScanner(ALSTextAttributeProvider.instance());
		}
		return instance;
	}

}
