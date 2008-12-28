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
    public final static String ALS_COMMENT_ANDREW = "__pos_als_comment_andrew";
	/** Tableau des types de partitions possibles */
	final static String[] ALS_PARTITION_TYPES =
		new String[] {
			ALS_COMMENT,ALS_COMMENT_ANDREW
		};
	
	/**
	 * Constructor. Set the rules. 
	 */
	private ALSPartitionScanner() {
		super();
		
		// Token renvoyé dans le cas d'un commentaire
		IToken alsComment = new Token(ALS_COMMENT);
        IToken alsCommentAndrew = new Token(ALS_COMMENT_ANDREW);

		IPredicateRule[] rules = new IPredicateRule[] {

				new MultiLineRule("/*","*/", alsComment),
                new EndOfLineRule("////",alsCommentAndrew),
				new EndOfLineRule("//", alsComment),
                new EndOfLineRule("--", alsComment)
 			};
		// Prend en compte les règles
		setPredicateRules(rules);
	}
	
	   private static ALSPartitionScanner instance;
	    
	    public static synchronized ALSPartitionScanner instance() {
	        if (instance==null) {
	            instance = new ALSPartitionScanner();
	        }
	        return instance;
	    }
}
