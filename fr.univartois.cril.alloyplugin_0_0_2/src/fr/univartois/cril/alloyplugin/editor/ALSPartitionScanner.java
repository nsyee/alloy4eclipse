package fr.univartois.cril.alloyplugin.editor;


import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * Classe for Alloy files partitioning.
 */
public class ALSPartitionScanner extends RuleBasedPartitionScanner {
	/** Identifiant de la partition commentaire */
	public final static String ALS_COMMENT = "__pos_als_comment";
	/** Tableau des types de partitions possibles */
	public final static String[] ALS_PARTITION_TYPES =
		new String[] {
			ALS_COMMENT,
		};
	
	/**
	 * Constructor. Set the rules. 
	 */
	public ALSPartitionScanner() {
		super();
		
		// Token renvoyé dans le cas d'un commentaire
		IToken alsComment = new Token(ALS_COMMENT);
		

		IPredicateRule[] rules = new IPredicateRule[] {

				new MultiLineRule("/*","*/", alsComment),
				new EndOfLineRule("//", alsComment),
                new EndOfLineRule("--", alsComment)
			};
		// Prend en compte les règles
		setPredicateRules(rules);
	}
}
