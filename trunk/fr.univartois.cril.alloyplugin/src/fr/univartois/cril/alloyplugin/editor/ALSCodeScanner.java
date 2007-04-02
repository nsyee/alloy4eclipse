package fr.univartois.cril.alloyplugin.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.NumberRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;

import fr.univartois.cril.alloyplugin.ui.ALSTextAttributeProvider;

/**
 * Scanner used to analyse and color Alloy code.
 * 
 */
public class ALSCodeScanner extends RuleBasedScanner {

	/** keywords */
	/*
	 * abstract all and as assert but check disj else exactly extends fact for
	 * fun iden if iff implies in Int int let lone module no none not one open
	 * or part pred run set sig some sum then univ
	 */
	public static final String[] keywords = { "abstract", "and", "assert",
			"but", "disj", "else", "exactly", "extends", "fact", "fun", "iden",
			"if", "iff", "implies", "in", "Int", "int", "let", "not", "or",
			"part", "pred", "set", "seq", "sig", "sum", "then", "this", "univ" // doute
																				// sur
																				// this
	};

	public static final String[] quantifiers = { "all", "lone", "no", "none",
			"one", "some" };

	/** commands */
	public static final String[] commands = { "run", "check", "for", "expect" };

	/** directives */
	public static final String[] directives = { "module", "open", "as" };

	/**
	 * Alloy allowed words detector.
	 * 
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
	public ALSCodeScanner(ALSTextAttributeProvider provider) {
		List<IRule> rules = new ArrayList<IRule>(); // Contiendra les régles

		/*
		 * Création des tokens. Chaque token contient l'attribut à appliquer
		 * au texte correspondant.
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
		// Token(provider.getAttribute(ALSTextAttributeProvider.STRING_ATTRIBUTE));
		IToken signature = new Token(provider
				.getAttribute(ALSTextAttributeProvider.SIGNATURE_ATTRIBUTE));

		// rules.add(new SingleLineRule("\"", "\"", string, '\0', true));
		// rules.add(new SingleLineRule("'", "'", string, '\0', true));
		// Régle générique pour les espaces
		rules.add(new WhitespaceRule(new IWhitespaceDetector() {
			public boolean isWhitespace(char c) {
				return Character.isWhitespace(c);
			}
		}));

		rules.add(new WordRule(new ALSSignatureDetector(), signature));

		// Si le mot n'est pas dans la liste, renvoie undefined
		WordRule wr = new WordRule(new ALSWordDetector(), undefined);

		// Ajout des mot clefs
		for (int i = 0; i < keywords.length; ++i) {
			wr.addWord(keywords[i], keyword);
		}
		for (int i = 0; i < quantifiers.length; ++i) {
			wr.addWord(quantifiers[i], quantifier);
		}
		for (int i = 0; i < commands.length; ++i) {
			wr.addWord(commands[i], command);
		}
		for (int i = 0; i < directives.length; ++i) {
			wr.addWord(directives[i], directive);
		}

		rules.add(wr);
		rules.add(new NumberRule(decNumber));// pour les nombres

		IRule[] param = new IRule[rules.size()];
		rules.toArray(param);
		setRules(param);
	}
}
