package fr.univartois.cril.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import fr.univartois.cril.xtext.services.AlsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAlsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NEGATIVE_INTEGER", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'exactly'", "'private'", "'as'", "'fun'", "'pred'", "':'", "'run'", "'check'", "'for'", "'but'", "'expect'", "'int'", "'seq'", "'sig'", "'{'", "','", "'}'", "'abstract'", "'lone'", "'one'", "'some'", "'extends'", "'in'", "'+'", "'!'", "'not'", "'=>'", "'implies'", "'else'", "'let'", "'none'", "'iden'", "'univ'", "'Int'", "'seq/Int'", "'('", "')'", "'@'", "'this'", "'disj'", "'='", "'all'", "'sum'", "'||'", "'or'", "'&&'", "'and'", "'&'", "'<=>'", "'iff'", "'-'", "'++'", "'<:'", "':>'", "'<<'", "'>>'", "'>>>'", "'set'", "'#'", "'~'", "'*'", "'^'", "'no'", "'<'", "'>'", "'=<'", "'<='", "'>='", "'->'", "'|'", "'open'", "'fact'", "'assert'", "'enum'", "'/'", "'.'", "'['", "']'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int RULE_WS=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_NEGATIVE_INTEGER=6;
    public static final int RULE_ML_COMMENT=9;

        public InternalAlsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[259+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private AlsGrammarAccess grammarAccess;
     	
        public InternalAlsParser(TokenStream input, IAstFactory factory, AlsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Specification";	
       	}
       	
       	@Override
       	protected AlsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleSpecification
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:83:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:84:2: (iv_ruleSpecification= ruleSpecification EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:85:2: iv_ruleSpecification= ruleSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecification_in_entryRuleSpecification81);
            iv_ruleSpecification=ruleSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecification91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSpecification


    // $ANTLR start ruleSpecification
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:92:1: ruleSpecification returns [EObject current=null] : ( ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )* ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_module_0_0 = null;

        EObject lv_open_1_0 = null;

        EObject lv_paragraph_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:97:6: ( ( ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:98:1: ( ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:98:1: ( ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:98:2: ( (lv_module_0_0= ruleModule ) )? ( (lv_open_1_0= ruleOpen ) )* ( (lv_paragraph_2_0= ruleParagraph ) )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:98:2: ( (lv_module_0_0= ruleModule ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:99:1: (lv_module_0_0= ruleModule )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:99:1: (lv_module_0_0= ruleModule )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:100:3: lv_module_0_0= ruleModule
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getModuleModuleParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModule_in_ruleSpecification137);
                    lv_module_0_0=ruleModule();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"module",
                      	        		lv_module_0_0, 
                      	        		"Module", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:122:3: ( (lv_open_1_0= ruleOpen ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==83) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==83) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:123:1: (lv_open_1_0= ruleOpen )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:123:1: (lv_open_1_0= ruleOpen )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:124:3: lv_open_1_0= ruleOpen
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getOpenOpenParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpen_in_ruleSpecification159);
            	    lv_open_1_0=ruleOpen();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"open",
            	      	        		lv_open_1_0, 
            	      	        		"Open", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:146:3: ( (lv_paragraph_2_0= ruleParagraph ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==14||(LA3_0>=16 && LA3_0<=17)||(LA3_0>=19 && LA3_0<=20)||LA3_0==26||(LA3_0>=30 && LA3_0<=33)||(LA3_0>=84 && LA3_0<=86)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:147:1: (lv_paragraph_2_0= ruleParagraph )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:147:1: (lv_paragraph_2_0= ruleParagraph )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:148:3: lv_paragraph_2_0= ruleParagraph
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getParagraphParagraphParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParagraph_in_ruleSpecification181);
            	    lv_paragraph_2_0=ruleParagraph();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"paragraph",
            	      	        		lv_paragraph_2_0, 
            	      	        		"Paragraph", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSpecification


    // $ANTLR start entryRuleModule
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:178:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:179:2: (iv_ruleModule= ruleModule EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:180:2: iv_ruleModule= ruleModule EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule218);
            iv_ruleModule=ruleModule();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule228); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:187:1: ruleModule returns [EObject current=null] : ( 'module' ( (lv_importedNamespace_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )* ( (lv_right_8_0= ruleRightSquareBracketKeyword ) ) )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_exactly_3_0=null;
        Token lv_exactly_6_0=null;
        Token lv_number_7_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_name_4_0 = null;

        EObject lv_comma_5_0 = null;

        EObject lv_right_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:192:6: ( ( 'module' ( (lv_importedNamespace_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )* ( (lv_right_8_0= ruleRightSquareBracketKeyword ) ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:1: ( 'module' ( (lv_importedNamespace_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )* ( (lv_right_8_0= ruleRightSquareBracketKeyword ) ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:1: ( 'module' ( (lv_importedNamespace_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )* ( (lv_right_8_0= ruleRightSquareBracketKeyword ) ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:3: 'module' ( (lv_importedNamespace_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )* ( (lv_right_8_0= ruleRightSquareBracketKeyword ) ) )?
            {
            match(input,12,FOLLOW_12_in_ruleModule263); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:197:1: ( (lv_importedNamespace_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:198:1: (lv_importedNamespace_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:198:1: (lv_importedNamespace_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:199:3: lv_importedNamespace_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getImportedNamespaceNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleModule284);
            lv_importedNamespace_1_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importedNamespace",
              	        		lv_importedNamespace_1_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:221:2: ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )* ( (lv_right_8_0= ruleRightSquareBracketKeyword ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==89) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:221:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )* ( (lv_right_8_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:221:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:222:1: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:222:1: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:223:3: lv_left_2_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getLeftLeftSquareBracketKeywordParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleModule306);
                    lv_left_2_0=ruleLeftSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"left",
                      	        		lv_left_2_0, 
                      	        		"LeftSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:245:2: ( (lv_exactly_3_0= 'exactly' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:246:1: (lv_exactly_3_0= 'exactly' )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:246:1: (lv_exactly_3_0= 'exactly' )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:247:3: lv_exactly_3_0= 'exactly'
                            {
                            lv_exactly_3_0=(Token)input.LT(1);
                            match(input,13,FOLLOW_13_in_ruleModule324); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getModuleAccess().getExactlyExactlyKeyword_2_1_0(), "exactly"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		add(current, "exactly", lv_exactly_3_0, "exactly", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:266:3: ( (lv_name_4_0= ruleExactlyName ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:267:1: (lv_name_4_0= ruleExactlyName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:267:1: (lv_name_4_0= ruleExactlyName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:268:3: lv_name_4_0= ruleExactlyName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getNameExactlyNameParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExactlyName_in_ruleModule359);
                    lv_name_4_0=ruleExactlyName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_4_0, 
                      	        		"ExactlyName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:290:2: ( ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==28) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:290:3: ( (lv_comma_5_0= ruleComma ) ) ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:290:3: ( (lv_comma_5_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:291:1: (lv_comma_5_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:291:1: (lv_comma_5_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:292:3: lv_comma_5_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getCommaCommaParserRuleCall_2_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleModule381);
                    	    lv_comma_5_0=ruleComma();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"comma",
                    	      	        		lv_comma_5_0, 
                    	      	        		"Comma", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:314:2: ( (lv_exactly_6_0= 'exactly' ) )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==13) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:315:1: (lv_exactly_6_0= 'exactly' )
                    	            {
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:315:1: (lv_exactly_6_0= 'exactly' )
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:316:3: lv_exactly_6_0= 'exactly'
                    	            {
                    	            lv_exactly_6_0=(Token)input.LT(1);
                    	            match(input,13,FOLLOW_13_in_ruleModule399); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getModuleAccess().getExactlyExactlyKeyword_2_3_1_0(), "exactly"); 
                    	                  
                    	            }
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode, current);
                    	              	        }
                    	              	        
                    	              	        try {
                    	              	       		add(current, "exactly", lv_exactly_6_0, "exactly", lastConsumedNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	    
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:335:3: ( (lv_number_7_0= RULE_INT ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:336:1: (lv_number_7_0= RULE_INT )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:336:1: (lv_number_7_0= RULE_INT )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:337:3: lv_number_7_0= RULE_INT
                    	    {
                    	    lv_number_7_0=(Token)input.LT(1);
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleModule430); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      			createLeafNode(grammarAccess.getModuleAccess().getNumberINTTerminalRuleCall_2_3_2_0(), "number"); 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"number",
                    	      	        		lv_number_7_0, 
                    	      	        		"INT", 
                    	      	        		lastConsumedNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:359:4: ( (lv_right_8_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:360:1: (lv_right_8_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:360:1: (lv_right_8_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:361:3: lv_right_8_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getRightRightSquareBracketKeywordParserRuleCall_2_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleModule458);
                    lv_right_8_0=ruleRightSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_8_0, 
                      	        		"RightSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleOpen
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:391:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:392:2: (iv_ruleOpen= ruleOpen EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:393:2: iv_ruleOpen= ruleOpen EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOpenRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOpen_in_entryRuleOpen496);
            iv_ruleOpen=ruleOpen();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOpen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpen506); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOpen


    // $ANTLR start ruleOpen
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:400:1: ruleOpen returns [EObject current=null] : ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )? ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_openName_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_ref_3_0 = null;

        EObject lv_comma_4_0 = null;

        EObject lv_ref_5_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_nameAs_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:405:6: ( ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:406:1: ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:406:1: ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:406:2: ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:406:2: ( 'private' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:406:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleOpen542); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:410:3: ( (lv_openName_1_0= ruleOpenName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:411:1: (lv_openName_1_0= ruleOpenName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:411:1: (lv_openName_1_0= ruleOpenName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:412:3: lv_openName_1_0= ruleOpenName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getOpenNameOpenNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOpenName_in_ruleOpen565);
            lv_openName_1_0=ruleOpenName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"openName",
              	        		lv_openName_1_0, 
              	        		"OpenName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:434:2: ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==89) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:434:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:434:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:435:1: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:435:1: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:436:3: lv_left_2_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getLeftLeftSquareBracketKeywordParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleOpen587);
                    lv_left_2_0=ruleLeftSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"left",
                      	        		lv_left_2_0, 
                      	        		"LeftSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:458:2: ( (lv_ref_3_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:459:1: (lv_ref_3_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:459:1: (lv_ref_3_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:460:3: lv_ref_3_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRefRefParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleOpen608);
                    lv_ref_3_0=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"ref",
                      	        		lv_ref_3_0, 
                      	        		"Ref", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:482:2: ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==28) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:482:3: ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:482:3: ( (lv_comma_4_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:483:1: (lv_comma_4_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:483:1: (lv_comma_4_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:484:3: lv_comma_4_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getCommaCommaParserRuleCall_2_2_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleOpen630);
                    	    lv_comma_4_0=ruleComma();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"comma",
                    	      	        		lv_comma_4_0, 
                    	      	        		"Comma", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:506:2: ( (lv_ref_5_0= ruleRef ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:507:1: (lv_ref_5_0= ruleRef )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:507:1: (lv_ref_5_0= ruleRef )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:508:3: lv_ref_5_0= ruleRef
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRefRefParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRef_in_ruleOpen651);
                    	    lv_ref_5_0=ruleRef();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"ref",
                    	      	        		lv_ref_5_0, 
                    	      	        		"Ref", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:530:4: ( (lv_right_6_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:531:1: (lv_right_6_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:531:1: (lv_right_6_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:532:3: lv_right_6_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRightRightSquareBracketKeywordParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleOpen674);
                    lv_right_6_0=ruleRightSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_6_0, 
                      	        		"RightSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:554:4: ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:554:6: 'as' ( (lv_nameAs_8_0= ruleExactlyName ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleOpen687); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getAsKeyword_3_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:558:1: ( (lv_nameAs_8_0= ruleExactlyName ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:559:1: (lv_nameAs_8_0= ruleExactlyName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:559:1: (lv_nameAs_8_0= ruleExactlyName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:560:3: lv_nameAs_8_0= ruleExactlyName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getNameAsExactlyNameParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExactlyName_in_ruleOpen708);
                    lv_nameAs_8_0=ruleExactlyName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"nameAs",
                      	        		lv_nameAs_8_0, 
                      	        		"ExactlyName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOpen


    // $ANTLR start entryRuleParagraph
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:590:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:591:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:592:2: iv_ruleParagraph= ruleParagraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParagraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph746);
            iv_ruleParagraph=ruleParagraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParagraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph756); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParagraph


    // $ANTLR start ruleParagraph
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:599:1: ruleParagraph returns [EObject current=null] : (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        EObject this_FactDecl_0 = null;

        EObject this_AssertDecl_1 = null;

        EObject this_FunDecl_2 = null;

        EObject this_PredDecl_3 = null;

        EObject this_RunDecl_4 = null;

        EObject this_CheckDecl_5 = null;

        EObject this_EnumDecl_6 = null;

        EObject this_SigDecl_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:604:6: ( (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:605:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:605:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:606:2: this_FactDecl_0= ruleFactDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFactDeclParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFactDecl_in_ruleParagraph806);
                    this_FactDecl_0=ruleFactDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FactDecl_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:619:2: this_AssertDecl_1= ruleAssertDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getAssertDeclParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertDecl_in_ruleParagraph836);
                    this_AssertDecl_1=ruleAssertDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AssertDecl_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:632:2: this_FunDecl_2= ruleFunDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFunDeclParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunDecl_in_ruleParagraph866);
                    this_FunDecl_2=ruleFunDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FunDecl_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:645:2: this_PredDecl_3= rulePredDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getPredDeclParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePredDecl_in_ruleParagraph896);
                    this_PredDecl_3=rulePredDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PredDecl_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:658:2: this_RunDecl_4= ruleRunDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getRunDeclParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRunDecl_in_ruleParagraph926);
                    this_RunDecl_4=ruleRunDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_RunDecl_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:671:2: this_CheckDecl_5= ruleCheckDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getCheckDeclParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckDecl_in_ruleParagraph956);
                    this_CheckDecl_5=ruleCheckDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CheckDecl_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:684:2: this_EnumDecl_6= ruleEnumDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getEnumDeclParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleParagraph986);
                    this_EnumDecl_6=ruleEnumDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumDecl_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:697:2: this_SigDecl_7= ruleSigDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getSigDeclParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigDecl_in_ruleParagraph1016);
                    this_SigDecl_7=ruleSigDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SigDecl_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParagraph


    // $ANTLR start entryRuleFactDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:716:1: entryRuleFactDecl returns [EObject current=null] : iv_ruleFactDecl= ruleFactDecl EOF ;
    public final EObject entryRuleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:717:2: (iv_ruleFactDecl= ruleFactDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:718:2: iv_ruleFactDecl= ruleFactDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactDecl_in_entryRuleFactDecl1051);
            iv_ruleFactDecl=ruleFactDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactDecl1061); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFactDecl


    // $ANTLR start ruleFactDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:725:1: ruleFactDecl returns [EObject current=null] : ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_factName_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:730:6: ( ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:731:1: ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:731:1: ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:731:2: ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:731:2: ( (lv_factName_0_0= ruleFactName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:732:1: (lv_factName_0_0= ruleFactName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:732:1: (lv_factName_0_0= ruleFactName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:733:3: lv_factName_0_0= ruleFactName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getFactNameFactNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFactName_in_ruleFactDecl1107);
            lv_factName_0_0=ruleFactName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFactDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"factName",
              	        		lv_factName_0_0, 
              	        		"FactName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:755:2: ( (lv_block_1_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:756:1: (lv_block_1_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:756:1: (lv_block_1_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:757:3: lv_block_1_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFactDecl1128);
            lv_block_1_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFactDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_1_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFactDecl


    // $ANTLR start entryRuleAssertDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:787:1: entryRuleAssertDecl returns [EObject current=null] : iv_ruleAssertDecl= ruleAssertDecl EOF ;
    public final EObject entryRuleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:788:2: (iv_ruleAssertDecl= ruleAssertDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:789:2: iv_ruleAssertDecl= ruleAssertDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1164);
            iv_ruleAssertDecl=ruleAssertDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertDecl1174); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssertDecl


    // $ANTLR start ruleAssertDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:796:1: ruleAssertDecl returns [EObject current=null] : ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_assertionName_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:801:6: ( ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:802:1: ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:802:1: ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:802:2: ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:802:2: ( (lv_assertionName_0_0= ruleAssertionName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:803:1: (lv_assertionName_0_0= ruleAssertionName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:803:1: (lv_assertionName_0_0= ruleAssertionName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:804:3: lv_assertionName_0_0= ruleAssertionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getAssertionNameAssertionNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionName_in_ruleAssertDecl1220);
            lv_assertionName_0_0=ruleAssertionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssertDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"assertionName",
              	        		lv_assertionName_0_0, 
              	        		"AssertionName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:826:2: ( (lv_block_1_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:827:1: (lv_block_1_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:827:1: (lv_block_1_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:828:3: lv_block_1_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleAssertDecl1241);
            lv_block_1_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssertDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_1_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssertDecl


    // $ANTLR start entryRuleFunDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:858:1: entryRuleFunDecl returns [EObject current=null] : iv_ruleFunDecl= ruleFunDecl EOF ;
    public final EObject entryRuleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:859:2: (iv_ruleFunDecl= ruleFunDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:860:2: iv_ruleFunDecl= ruleFunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunDecl_in_entryRuleFunDecl1277);
            iv_ruleFunDecl=ruleFunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunDecl1287); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunDecl


    // $ANTLR start ruleFunDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:867:1: ruleFunDecl returns [EObject current=null] : ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) ) ;
    public final EObject ruleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_2_0 = null;

        EObject lv_dot_3_0 = null;

        EObject lv_functionName_4_0 = null;

        EObject lv_leftS_5_0 = null;

        EObject lv_decl_6_0 = null;

        EObject lv_comma_7_0 = null;

        EObject lv_decl_8_0 = null;

        EObject lv_rightS_9_0 = null;

        EObject lv_leftP_10_0 = null;

        EObject lv_decl_11_0 = null;

        EObject lv_comma_12_0 = null;

        EObject lv_decl_13_0 = null;

        EObject lv_rightP_14_0 = null;

        EObject lv_colon_15_0 = null;

        EObject lv_expr_16_0 = null;

        EObject lv_block_17_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:872:6: ( ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:873:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:873:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:873:2: ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:873:2: ( 'private' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:873:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleFunDecl1323); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunDecl1335); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunDeclAccess().getFunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:881:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:881:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:881:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:882:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:882:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:883:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleFunDecl1357);
                    lv_ref_2_0=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ref",
                      	        		lv_ref_2_0, 
                      	        		"Ref", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:905:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:906:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:906:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:907:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleFunDecl1378);
                    lv_dot_3_0=ruleDot();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"dot",
                      	        		lv_dot_3_0, 
                      	        		"Dot", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:929:4: ( (lv_functionName_4_0= ruleFunctionName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:930:1: (lv_functionName_4_0= ruleFunctionName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:930:1: (lv_functionName_4_0= ruleFunctionName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:931:3: lv_functionName_4_0= ruleFunctionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getFunctionNameFunctionNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionName_in_ruleFunDecl1401);
            lv_functionName_4_0=ruleFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"functionName",
              	        		lv_functionName_4_0, 
              	        		"FunctionName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:953:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==89) ) {
                alt19=1;
            }
            else if ( (LA19_0==48) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:953:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:953:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:953:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:953:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:954:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:954:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:955:3: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleFunDecl1424);
                    lv_leftS_5_0=ruleLeftSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"leftS",
                      	        		lv_leftS_5_0, 
                      	        		"LeftSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:977:2: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID||LA16_0==14||(LA16_0>=51 && LA16_0<=52)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:977:3: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:977:3: ( (lv_decl_6_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:978:1: (lv_decl_6_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:978:1: (lv_decl_6_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:979:3: lv_decl_6_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1446);
                            lv_decl_6_0=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"decl",
                              	        		lv_decl_6_0, 
                              	        		"Decl", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1001:2: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==28) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1001:3: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1001:3: ( (lv_comma_7_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1002:1: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1002:1: (lv_comma_7_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1003:3: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleFunDecl1468);
                            	    lv_comma_7_0=ruleComma();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"comma",
                            	      	        		lv_comma_7_0, 
                            	      	        		"Comma", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1025:2: ( (lv_decl_8_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1026:1: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1026:1: (lv_decl_8_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1027:3: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1489);
                            	    lv_decl_8_0=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"decl",
                            	      	        		lv_decl_8_0, 
                            	      	        		"Decl", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1049:6: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1050:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1050:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1051:3: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleFunDecl1514);
                    lv_rightS_9_0=ruleRightSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightS",
                      	        		lv_rightS_9_0, 
                      	        		"RightSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1074:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1074:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1074:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1074:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1075:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1075:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1076:3: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleFunDecl1543);
                    lv_leftP_10_0=ruleLeftParenthesis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"leftP",
                      	        		lv_leftP_10_0, 
                      	        		"LeftParenthesis", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1098:2: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==14||(LA18_0>=51 && LA18_0<=52)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1098:3: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1098:3: ( (lv_decl_11_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1099:1: (lv_decl_11_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1099:1: (lv_decl_11_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1100:3: lv_decl_11_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1565);
                            lv_decl_11_0=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"decl",
                              	        		lv_decl_11_0, 
                              	        		"Decl", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1122:2: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==28) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1122:3: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1122:3: ( (lv_comma_12_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1123:1: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1123:1: (lv_comma_12_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1124:3: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleFunDecl1587);
                            	    lv_comma_12_0=ruleComma();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"comma",
                            	      	        		lv_comma_12_0, 
                            	      	        		"Comma", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1146:2: ( (lv_decl_13_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1147:1: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1147:1: (lv_decl_13_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1148:3: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1608);
                            	    lv_decl_13_0=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"decl",
                            	      	        		lv_decl_13_0, 
                            	      	        		"Decl", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1170:6: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1171:1: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1171:1: (lv_rightP_14_0= ruleRightParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1172:3: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightParenthesis_in_ruleFunDecl1633);
                    lv_rightP_14_0=ruleRightParenthesis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightP",
                      	        		lv_rightP_14_0, 
                      	        		"RightParenthesis", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1194:5: ( (lv_colon_15_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1195:1: (lv_colon_15_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1195:1: (lv_colon_15_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1196:3: lv_colon_15_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getColonColonParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleFunDecl1657);
            lv_colon_15_0=ruleColon();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"colon",
              	        		lv_colon_15_0, 
              	        		"Colon", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1218:2: ( (lv_expr_16_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1219:1: (lv_expr_16_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1219:1: (lv_expr_16_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1220:3: lv_expr_16_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunDecl1678);
            lv_expr_16_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expr",
              	        		lv_expr_16_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1242:2: ( (lv_block_17_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1243:1: (lv_block_17_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1243:1: (lv_block_17_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1244:3: lv_block_17_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getBlockBlockParserRuleCall_7_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFunDecl1699);
            lv_block_17_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_17_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunDecl


    // $ANTLR start entryRulePredDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1274:1: entryRulePredDecl returns [EObject current=null] : iv_rulePredDecl= rulePredDecl EOF ;
    public final EObject entryRulePredDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1275:2: (iv_rulePredDecl= rulePredDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1276:2: iv_rulePredDecl= rulePredDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredDecl_in_entryRulePredDecl1735);
            iv_rulePredDecl=rulePredDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredDecl1745); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePredDecl


    // $ANTLR start rulePredDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1283:1: rulePredDecl returns [EObject current=null] : ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) ;
    public final EObject rulePredDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_2_0 = null;

        EObject lv_dot_3_0 = null;

        EObject lv_predicateName_4_0 = null;

        EObject lv_leftS_5_0 = null;

        EObject lv_decl_6_0 = null;

        EObject lv_comma_7_0 = null;

        EObject lv_decl_8_0 = null;

        EObject lv_rightS_9_0 = null;

        EObject lv_leftP_10_0 = null;

        EObject lv_decl_11_0 = null;

        EObject lv_comma_12_0 = null;

        EObject lv_decl_13_0 = null;

        EObject lv_rightP_14_0 = null;

        EObject lv_block_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1288:6: ( ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1289:1: ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1289:1: ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1289:2: ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1289:2: ( 'private' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1289:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_rulePredDecl1781); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_rulePredDecl1793); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPredDeclAccess().getPredKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1297:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1297:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1297:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1298:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1298:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1299:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_rulePredDecl1815);
                    lv_ref_2_0=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ref",
                      	        		lv_ref_2_0, 
                      	        		"Ref", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1321:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1322:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1322:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1323:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_rulePredDecl1836);
                    lv_dot_3_0=ruleDot();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"dot",
                      	        		lv_dot_3_0, 
                      	        		"Dot", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1345:4: ( (lv_predicateName_4_0= rulePredicateName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1346:1: (lv_predicateName_4_0= rulePredicateName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1346:1: (lv_predicateName_4_0= rulePredicateName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1347:3: lv_predicateName_4_0= rulePredicateName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getPredicateNamePredicateNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePredicateName_in_rulePredDecl1859);
            lv_predicateName_4_0=rulePredicateName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"predicateName",
              	        		lv_predicateName_4_0, 
              	        		"PredicateName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1369:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==89) ) {
                alt26=1;
            }
            else if ( (LA26_0==48) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1369:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1369:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1369:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1369:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1370:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1370:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1371:3: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_rulePredDecl1882);
                    lv_leftS_5_0=ruleLeftSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"leftS",
                      	        		lv_leftS_5_0, 
                      	        		"LeftSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1393:2: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID||LA23_0==14||(LA23_0>=51 && LA23_0<=52)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1393:3: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1393:3: ( (lv_decl_6_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1394:1: (lv_decl_6_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1394:1: (lv_decl_6_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1395:3: lv_decl_6_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl1904);
                            lv_decl_6_0=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"decl",
                              	        		lv_decl_6_0, 
                              	        		"Decl", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1417:2: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==28) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1417:3: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1417:3: ( (lv_comma_7_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1418:1: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1418:1: (lv_comma_7_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1419:3: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_rulePredDecl1926);
                            	    lv_comma_7_0=ruleComma();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"comma",
                            	      	        		lv_comma_7_0, 
                            	      	        		"Comma", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1441:2: ( (lv_decl_8_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1442:1: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1442:1: (lv_decl_8_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1443:3: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl1947);
                            	    lv_decl_8_0=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"decl",
                            	      	        		lv_decl_8_0, 
                            	      	        		"Decl", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1465:6: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1466:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1466:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1467:3: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_rulePredDecl1972);
                    lv_rightS_9_0=ruleRightSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightS",
                      	        		lv_rightS_9_0, 
                      	        		"RightSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1490:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1490:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1490:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1490:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1491:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1491:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1492:3: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftParenthesis_in_rulePredDecl2001);
                    lv_leftP_10_0=ruleLeftParenthesis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"leftP",
                      	        		lv_leftP_10_0, 
                      	        		"LeftParenthesis", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1514:2: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID||LA25_0==14||(LA25_0>=51 && LA25_0<=52)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1514:3: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1514:3: ( (lv_decl_11_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1515:1: (lv_decl_11_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1515:1: (lv_decl_11_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1516:3: lv_decl_11_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2023);
                            lv_decl_11_0=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"decl",
                              	        		lv_decl_11_0, 
                              	        		"Decl", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1538:2: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==28) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1538:3: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1538:3: ( (lv_comma_12_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1539:1: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1539:1: (lv_comma_12_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1540:3: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_rulePredDecl2045);
                            	    lv_comma_12_0=ruleComma();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"comma",
                            	      	        		lv_comma_12_0, 
                            	      	        		"Comma", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1562:2: ( (lv_decl_13_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1563:1: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1563:1: (lv_decl_13_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1564:3: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2066);
                            	    lv_decl_13_0=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"decl",
                            	      	        		lv_decl_13_0, 
                            	      	        		"Decl", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1586:6: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1587:1: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1587:1: (lv_rightP_14_0= ruleRightParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1588:3: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightParenthesis_in_rulePredDecl2091);
                    lv_rightP_14_0=ruleRightParenthesis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightP",
                      	        		lv_rightP_14_0, 
                      	        		"RightParenthesis", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1610:5: ( (lv_block_15_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1611:1: (lv_block_15_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1611:1: (lv_block_15_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1612:3: lv_block_15_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getBlockBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_rulePredDecl2115);
            lv_block_15_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_15_0, 
              	        		"Block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePredDecl


    // $ANTLR start entryRuleRunDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1642:1: entryRuleRunDecl returns [EObject current=null] : iv_ruleRunDecl= ruleRunDecl EOF ;
    public final EObject entryRuleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1643:2: (iv_ruleRunDecl= ruleRunDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1644:2: iv_ruleRunDecl= ruleRunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRunDecl_in_entryRuleRunDecl2151);
            iv_ruleRunDecl=ruleRunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRunDecl2161); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRunDecl


    // $ANTLR start ruleRunDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1651:1: ruleRunDecl returns [EObject current=null] : ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_runName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1656:6: ( ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1657:1: ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1657:1: ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1657:2: ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1657:2: ( ( (lv_runName_0_0= ruleAlias ) ) ':' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1657:3: ( (lv_runName_0_0= ruleAlias ) ) ':'
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1657:3: ( (lv_runName_0_0= ruleAlias ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1658:1: (lv_runName_0_0= ruleAlias )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1658:1: (lv_runName_0_0= ruleAlias )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1659:3: lv_runName_0_0= ruleAlias
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getRunNameAliasParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleRunDecl2208);
                    lv_runName_0_0=ruleAlias();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"runName",
                      	        		lv_runName_0_0, 
                      	        		"Alias", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleRunDecl2218); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRunDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleRunDecl2230); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRunDeclAccess().getRunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1689:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==27) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1689:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1689:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1689:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1690:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1690:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1691:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRunDecl2253); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRunDeclAccess().getName2PredicateNameCrossReference_2_0_0(), "name2"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1707:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1707:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1708:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1708:1: (lv_block_4_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1709:3: lv_block_4_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getBlockBlockParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleRunDecl2280);
                    lv_block_4_0=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_4_0, 
                      	        		"Block", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1731:3: ( (lv_scope_5_0= ruleScope ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1732:1: (lv_scope_5_0= ruleScope )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1732:1: (lv_scope_5_0= ruleScope )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1733:3: lv_scope_5_0= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleRunDecl2302);
            lv_scope_5_0=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"scope",
              	        		lv_scope_5_0, 
              	        		"Scope", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRunDecl


    // $ANTLR start entryRuleCheckDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1763:1: entryRuleCheckDecl returns [EObject current=null] : iv_ruleCheckDecl= ruleCheckDecl EOF ;
    public final EObject entryRuleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1764:2: (iv_ruleCheckDecl= ruleCheckDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1765:2: iv_ruleCheckDecl= ruleCheckDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCheckDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2338);
            iv_ruleCheckDecl=ruleCheckDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCheckDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckDecl2348); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCheckDecl


    // $ANTLR start ruleCheckDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1772:1: ruleCheckDecl returns [EObject current=null] : ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_checkName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1777:6: ( ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1778:1: ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1778:1: ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1778:2: ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1778:2: ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1778:3: ( (lv_checkName_0_0= ruleAlias ) ) ':'
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1778:3: ( (lv_checkName_0_0= ruleAlias ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1779:1: (lv_checkName_0_0= ruleAlias )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1779:1: (lv_checkName_0_0= ruleAlias )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1780:3: lv_checkName_0_0= ruleAlias
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getCheckNameAliasParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleCheckDecl2395);
                    lv_checkName_0_0=ruleAlias();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"checkName",
                      	        		lv_checkName_0_0, 
                      	        		"Alias", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleCheckDecl2405); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCheckDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleCheckDecl2417); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCheckDeclAccess().getCheckKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1810:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==27) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1810:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1810:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1810:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1811:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1811:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1812:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckDecl2440); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCheckDeclAccess().getNameAssertionNameCrossReference_2_0_0(), "name"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1828:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1828:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1829:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1829:1: (lv_block_4_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1830:3: lv_block_4_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getBlockBlockParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleCheckDecl2467);
                    lv_block_4_0=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_4_0, 
                      	        		"Block", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1852:3: ( (lv_scope_5_0= ruleScope ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1853:1: (lv_scope_5_0= ruleScope )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1853:1: (lv_scope_5_0= ruleScope )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1854:3: lv_scope_5_0= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleCheckDecl2489);
            lv_scope_5_0=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"scope",
              	        		lv_scope_5_0, 
              	        		"Scope", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCheckDecl


    // $ANTLR start entryRuleScope
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1884:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1885:2: (iv_ruleScope= ruleScope EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1886:2: iv_ruleScope= ruleScope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScope_in_entryRuleScope2525);
            iv_ruleScope=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScope2535); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleScope


    // $ANTLR start ruleScope
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1893:1: ruleScope returns [EObject current=null] : ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        EObject lv_expect_3_0 = null;

        EObject lv_typescope_8_0 = null;

        EObject lv_comma_9_0 = null;

        EObject lv_typescope_10_0 = null;

        EObject lv_expect_11_0 = null;

        EObject lv_typescope_14_0 = null;

        EObject lv_comma_15_0 = null;

        EObject lv_typescope_16_0 = null;

        EObject lv_expect_17_0 = null;

        EObject lv_expect_19_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1898:6: ( ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1899:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1899:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        alt37=2;
                        }
                        break;
                    case EOF:
                    case 14:
                    case 16:
                    case 17:
                    case 19:
                    case 20:
                    case 23:
                    case 26:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 84:
                    case 85:
                    case 86:
                        {
                        alt37=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA37_7 = input.LA(4);

                        if ( (LA37_7==EOF||LA37_7==RULE_ID||LA37_7==14||(LA37_7>=16 && LA37_7<=17)||(LA37_7>=19 && LA37_7<=20)||LA37_7==23||LA37_7==26||LA37_7==28||(LA37_7>=30 && LA37_7<=33)||(LA37_7>=84 && LA37_7<=86)) ) {
                            alt37=3;
                        }
                        else if ( (LA37_7==18||LA37_7==87) ) {
                            alt37=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1899:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 37, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                    case 25:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1899:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 37, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA37_1==13) ) {
                    alt37=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1899:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA37_0==EOF||LA37_0==RULE_ID||LA37_0==14||(LA37_0>=16 && LA37_0<=17)||(LA37_0>=19 && LA37_0<=20)||LA37_0==23||LA37_0==26||(LA37_0>=30 && LA37_0<=33)||(LA37_0>=84 && LA37_0<=86)) ) {
                alt37=4;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1899:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1899:2: ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1899:2: ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1899:3: () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1899:3: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1900:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getScopeAccess().getScopeAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getScopeAccess().getScopeAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,21,FOLLOW_21_in_ruleScope2583); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_0_1(), null); 
                          
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2592); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_0_2(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1921:1: ( (lv_expect_3_0= ruleExpectation ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==23) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1922:1: (lv_expect_3_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1922:1: (lv_expect_3_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1923:3: lv_expect_3_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_0_3_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2612);
                            lv_expect_3_0=ruleExpectation();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"expect",
                              	        		lv_expect_3_0, 
                              	        		"Expectation", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1946:6: ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1946:6: ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1946:7: () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1946:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1947:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getScopeAccess().getScopeAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getScopeAccess().getScopeAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,21,FOLLOW_21_in_ruleScope2643); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_1_1(), null); 
                          
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2652); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_1_2(), null); 
                          
                    }
                    match(input,22,FOLLOW_22_in_ruleScope2661); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getButKeyword_1_3(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1972:1: ( (lv_typescope_8_0= ruleTypescope ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1973:1: (lv_typescope_8_0= ruleTypescope )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1973:1: (lv_typescope_8_0= ruleTypescope )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1974:3: lv_typescope_8_0= ruleTypescope
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2682);
                    lv_typescope_8_0=ruleTypescope();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"typescope",
                      	        		lv_typescope_8_0, 
                      	        		"Typescope", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1996:2: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==28) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1996:3: ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1996:3: ( (lv_comma_9_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1997:1: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1997:1: (lv_comma_9_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1998:3: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_1_5_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleScope2704);
                    	    lv_comma_9_0=ruleComma();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"comma",
                    	      	        		lv_comma_9_0, 
                    	      	        		"Comma", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2020:2: ( (lv_typescope_10_0= ruleTypescope ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2021:1: (lv_typescope_10_0= ruleTypescope )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2021:1: (lv_typescope_10_0= ruleTypescope )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2022:3: lv_typescope_10_0= ruleTypescope
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2725);
                    	    lv_typescope_10_0=ruleTypescope();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"typescope",
                    	      	        		lv_typescope_10_0, 
                    	      	        		"Typescope", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2044:4: ( (lv_expect_11_0= ruleExpectation ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==23) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2045:1: (lv_expect_11_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2045:1: (lv_expect_11_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2046:3: lv_expect_11_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_1_6_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2748);
                            lv_expect_11_0=ruleExpectation();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"expect",
                              	        		lv_expect_11_0, 
                              	        		"Expectation", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2069:6: ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2069:6: ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2069:7: () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2069:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2070:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getScopeAccess().getScopeAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getScopeAccess().getScopeAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,21,FOLLOW_21_in_ruleScope2779); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_2_1(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2087:1: ( (lv_typescope_14_0= ruleTypescope ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2088:1: (lv_typescope_14_0= ruleTypescope )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2088:1: (lv_typescope_14_0= ruleTypescope )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2089:3: lv_typescope_14_0= ruleTypescope
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2800);
                    lv_typescope_14_0=ruleTypescope();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"typescope",
                      	        		lv_typescope_14_0, 
                      	        		"Typescope", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2111:2: ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==28) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2111:3: ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2111:3: ( (lv_comma_15_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2112:1: (lv_comma_15_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2112:1: (lv_comma_15_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2113:3: lv_comma_15_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_2_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleScope2822);
                    	    lv_comma_15_0=ruleComma();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"comma",
                    	      	        		lv_comma_15_0, 
                    	      	        		"Comma", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2135:2: ( (lv_typescope_16_0= ruleTypescope ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2136:1: (lv_typescope_16_0= ruleTypescope )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2136:1: (lv_typescope_16_0= ruleTypescope )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2137:3: lv_typescope_16_0= ruleTypescope
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2843);
                    	    lv_typescope_16_0=ruleTypescope();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"typescope",
                    	      	        		lv_typescope_16_0, 
                    	      	        		"Typescope", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2159:4: ( (lv_expect_17_0= ruleExpectation ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==23) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2160:1: (lv_expect_17_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2160:1: (lv_expect_17_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2161:3: lv_expect_17_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_2_4_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2866);
                            lv_expect_17_0=ruleExpectation();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"expect",
                              	        		lv_expect_17_0, 
                              	        		"Expectation", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2184:6: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2184:6: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2184:7: () ( (lv_expect_19_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2184:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2185:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getScopeAccess().getScopeAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getScopeAccess().getScopeAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2198:2: ( (lv_expect_19_0= ruleExpectation ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==23) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2199:1: (lv_expect_19_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2199:1: (lv_expect_19_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2200:3: lv_expect_19_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_3_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2908);
                            lv_expect_19_0=ruleExpectation();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"expect",
                              	        		lv_expect_19_0, 
                              	        		"Expectation", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleScope


    // $ANTLR start entryRuleExpectation
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2230:1: entryRuleExpectation returns [EObject current=null] : iv_ruleExpectation= ruleExpectation EOF ;
    public final EObject entryRuleExpectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectation = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2231:2: (iv_ruleExpectation= ruleExpectation EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2232:2: iv_ruleExpectation= ruleExpectation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpectationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpectation_in_entryRuleExpectation2946);
            iv_ruleExpectation=ruleExpectation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpectation2956); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpectation


    // $ANTLR start ruleExpectation
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2239:1: ruleExpectation returns [EObject current=null] : ( 'expect' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleExpectation() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2244:6: ( ( 'expect' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2245:1: ( 'expect' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2245:1: ( 'expect' ( (lv_value_1_0= RULE_INT ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2245:3: 'expect' ( (lv_value_1_0= RULE_INT ) )
            {
            match(input,23,FOLLOW_23_in_ruleExpectation2991); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExpectationAccess().getExpectKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2249:1: ( (lv_value_1_0= RULE_INT ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2250:1: (lv_value_1_0= RULE_INT )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2250:1: (lv_value_1_0= RULE_INT )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2251:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpectation3008); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getExpectationAccess().getValueINTTerminalRuleCall_1_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExpectationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_1_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpectation


    // $ANTLR start entryRuleTypescope
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2281:1: entryRuleTypescope returns [EObject current=null] : iv_ruleTypescope= ruleTypescope EOF ;
    public final EObject entryRuleTypescope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypescope = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2282:2: (iv_ruleTypescope= ruleTypescope EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2283:2: iv_ruleTypescope= ruleTypescope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypescopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypescope_in_entryRuleTypescope3049);
            iv_ruleTypescope=ruleTypescope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypescope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypescope3059); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypescope


    // $ANTLR start ruleTypescope
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2290:1: ruleTypescope returns [EObject current=null] : ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) ) ;
    public final EObject ruleTypescope() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2295:6: ( ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2296:1: ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2296:1: ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2296:2: () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2296:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2297:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getTypescopeAccess().getTypescopeAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getTypescopeAccess().getTypescopeAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2310:2: ( 'exactly' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2310:4: 'exactly'
                    {
                    match(input,13,FOLLOW_13_in_ruleTypescope3107); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypescopeAccess().getExactlyKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTypescope3118); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getTypescopeAccess().getINTTerminalRuleCall_2(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2318:1: ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=24 && LA40_0<=25)) ) {
                alt40=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2318:1: ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2318:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2318:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2319:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2319:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2320:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTypescopeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypescope3140); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTypescopeAccess().getNameReferencesNameCrossReference_3_0_0(), "name"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2336:6: ( 'int' | 'seq' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2336:6: ( 'int' | 'seq' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==24) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==25) ) {
                        alt39=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2336:6: ( 'int' | 'seq' )", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2336:8: 'int'
                            {
                            match(input,24,FOLLOW_24_in_ruleTypescope3157); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypescopeAccess().getIntKeyword_3_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2341:7: 'seq'
                            {
                            match(input,25,FOLLOW_25_in_ruleTypescope3173); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypescopeAccess().getSeqKeyword_3_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypescope


    // $ANTLR start entryRuleEnumDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2353:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2354:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2355:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3211);
            iv_ruleEnumDecl=ruleEnumDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl3221); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumDecl


    // $ANTLR start ruleEnumDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2362:1: ruleEnumDecl returns [EObject current=null] : ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) ;
    public final EObject ruleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_enumName_0_0 = null;

        EObject lv_leftC_1_0 = null;

        EObject lv_propertyEnum_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_propertyEnum_4_0 = null;

        EObject lv_rightC_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2367:6: ( ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2368:1: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2368:1: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2368:2: ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2368:2: ( (lv_enumName_0_0= ruleEnumName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2369:1: (lv_enumName_0_0= ruleEnumName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2369:1: (lv_enumName_0_0= ruleEnumName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2370:3: lv_enumName_0_0= ruleEnumName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getEnumNameEnumNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumName_in_ruleEnumDecl3267);
            lv_enumName_0_0=ruleEnumName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"enumName",
              	        		lv_enumName_0_0, 
              	        		"EnumName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2392:2: ( (lv_leftC_1_0= ruleLeftCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2393:1: (lv_leftC_1_0= ruleLeftCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2393:1: (lv_leftC_1_0= ruleLeftCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2394:3: lv_leftC_1_0= ruleLeftCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getLeftCLeftCurlyBracketParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleEnumDecl3288);
            lv_leftC_1_0=ruleLeftCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftC",
              	        		lv_leftC_1_0, 
              	        		"LeftCurlyBracket", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2416:2: ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2417:1: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2417:1: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2418:3: lv_propertyEnum_2_0= ruleEnumPropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3309);
            lv_propertyEnum_2_0=ruleEnumPropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"propertyEnum",
              	        		lv_propertyEnum_2_0, 
              	        		"EnumPropertyName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2440:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2440:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2440:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2441:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2441:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2442:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleEnumDecl3331);
            	    lv_comma_3_0=ruleComma();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"comma",
            	      	        		lv_comma_3_0, 
            	      	        		"Comma", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2464:2: ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2465:1: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2465:1: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2466:3: lv_propertyEnum_4_0= ruleEnumPropertyName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3352);
            	    lv_propertyEnum_4_0=ruleEnumPropertyName();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"propertyEnum",
            	      	        		lv_propertyEnum_4_0, 
            	      	        		"EnumPropertyName", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2488:4: ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2489:1: (lv_rightC_5_0= ruleRightCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2489:1: (lv_rightC_5_0= ruleRightCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2490:3: lv_rightC_5_0= ruleRightCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getRightCRightCurlyBracketParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleEnumDecl3375);
            lv_rightC_5_0=ruleRightCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"rightC",
              	        		lv_rightC_5_0, 
              	        		"RightCurlyBracket", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumDecl


    // $ANTLR start entryRuleSigDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2520:1: entryRuleSigDecl returns [EObject current=null] : iv_ruleSigDecl= ruleSigDecl EOF ;
    public final EObject entryRuleSigDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2521:2: (iv_ruleSigDecl= ruleSigDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2522:2: iv_ruleSigDecl= ruleSigDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigDecl_in_entryRuleSigDecl3411);
            iv_ruleSigDecl=ruleSigDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigDecl3421); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigDecl


    // $ANTLR start ruleSigDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2529:1: ruleSigDecl returns [EObject current=null] : ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? ) ;
    public final EObject ruleSigDecl() throws RecognitionException {
        EObject current = null;

        Token lv_comma2_8_0=null;
        EObject this_SigQual_0 = null;

        EObject lv_signatureName_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_signatureName_4_0 = null;

        EObject lv_sigExt_5_0 = null;

        EObject lv_decl_7_0 = null;

        EObject lv_decl_9_0 = null;

        EObject lv_block_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2534:6: ( ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2535:1: ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2535:1: ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2535:2: (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2535:2: (this_SigQual_0= ruleSigQual )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14||(LA42_0>=30 && LA42_0<=33)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2536:2: this_SigQual_0= ruleSigQual
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigQualParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigQual_in_ruleSigDecl3472);
                    this_SigQual_0=ruleSigQual();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SigQual_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleSigDecl3483); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getSigKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2551:1: ( (lv_signatureName_2_0= ruleSignatureName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2552:1: (lv_signatureName_2_0= ruleSignatureName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2552:1: (lv_signatureName_2_0= ruleSignatureName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2553:3: lv_signatureName_2_0= ruleSignatureName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignatureName_in_ruleSigDecl3504);
            lv_signatureName_2_0=ruleSignatureName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"signatureName",
              	        		lv_signatureName_2_0, 
              	        		"SignatureName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2575:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==28) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2575:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2575:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2576:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2576:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2577:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleSigDecl3526);
            	    lv_comma_3_0=ruleComma();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"comma",
            	      	        		lv_comma_3_0, 
            	      	        		"Comma", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2599:2: ( (lv_signatureName_4_0= ruleSignatureName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2600:1: (lv_signatureName_4_0= ruleSignatureName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2600:1: (lv_signatureName_4_0= ruleSignatureName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2601:3: lv_signatureName_4_0= ruleSignatureName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignatureName_in_ruleSigDecl3547);
            	    lv_signatureName_4_0=ruleSignatureName();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signatureName",
            	      	        		lv_signatureName_4_0, 
            	      	        		"SignatureName", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2623:4: ( (lv_sigExt_5_0= ruleSigExt ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=34 && LA44_0<=35)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2624:1: (lv_sigExt_5_0= ruleSigExt )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2624:1: (lv_sigExt_5_0= ruleSigExt )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2625:3: lv_sigExt_5_0= ruleSigExt
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigExtSigExtParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSigExt_in_ruleSigDecl3570);
                    lv_sigExt_5_0=ruleSigExt();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"sigExt",
                      	        		lv_sigExt_5_0, 
                      	        		"SigExt", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleSigDecl3581); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getLeftCurlyBracketKeyword_5(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2651:1: ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==14||(LA46_0>=51 && LA46_0<=52)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2651:2: ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2651:2: ( (lv_decl_7_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2652:1: (lv_decl_7_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2652:1: (lv_decl_7_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2653:3: lv_decl_7_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl3603);
                    lv_decl_7_0=ruleDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"decl",
                      	        		lv_decl_7_0, 
                      	        		"Decl", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2675:2: ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==28) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2675:3: ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2675:3: ( (lv_comma2_8_0= ',' ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2676:1: (lv_comma2_8_0= ',' )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2676:1: (lv_comma2_8_0= ',' )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2677:3: lv_comma2_8_0= ','
                    	    {
                    	    lv_comma2_8_0=(Token)input.LT(1);
                    	    match(input,28,FOLLOW_28_in_ruleSigDecl3622); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getSigDeclAccess().getComma2CommaKeyword_6_1_0_0(), "comma2"); 
                    	          
                    	    }
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "comma2", lv_comma2_8_0, ",", lastConsumedNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2696:2: ( (lv_decl_9_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2697:1: (lv_decl_9_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2697:1: (lv_decl_9_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2698:3: lv_decl_9_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl3656);
                    	    lv_decl_9_0=ruleDecl();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"decl",
                    	      	        		lv_decl_9_0, 
                    	      	        		"Decl", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,29,FOLLOW_29_in_ruleSigDecl3670); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getRightCurlyBracketKeyword_7(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2724:1: ( (lv_block_11_0= ruleBlock ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2725:1: (lv_block_11_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2725:1: (lv_block_11_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2726:3: lv_block_11_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getBlockBlockParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleSigDecl3691);
                    lv_block_11_0=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_11_0, 
                      	        		"Block", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSigDecl


    // $ANTLR start entryRuleSigQual
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2756:1: entryRuleSigQual returns [EObject current=null] : iv_ruleSigQual= ruleSigQual EOF ;
    public final EObject entryRuleSigQual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigQual = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2757:2: (iv_ruleSigQual= ruleSigQual EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2758:2: iv_ruleSigQual= ruleSigQual EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigQualRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigQual_in_entryRuleSigQual3728);
            iv_ruleSigQual=ruleSigQual();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigQual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigQual3738); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigQual


    // $ANTLR start ruleSigQual
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2765:1: ruleSigQual returns [EObject current=null] : ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* ) ;
    public final EObject ruleSigQual() throws RecognitionException {
        EObject current = null;

        Token lv_sigq_0_1=null;
        Token lv_sigq_0_2=null;
        Token lv_sigq_0_3=null;
        Token lv_sigq_0_4=null;
        Token lv_sigq_0_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2770:6: ( ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2771:1: ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2771:1: ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2771:2: ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2771:2: ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2772:1: ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2772:1: ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2773:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2773:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt48=1;
                }
                break;
            case 31:
                {
                alt48=2;
                }
                break;
            case 32:
                {
                alt48=3;
                }
                break;
            case 33:
                {
                alt48=4;
                }
                break;
            case 14:
                {
                alt48=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2773:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2774:3: lv_sigq_0_1= 'abstract'
                    {
                    lv_sigq_0_1=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleSigQual3783); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigQualAccess().getSigqAbstractKeyword_0_0_0(), "sigq"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigQualRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sigq", lv_sigq_0_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2792:8: lv_sigq_0_2= 'lone'
                    {
                    lv_sigq_0_2=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSigQual3812); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigQualAccess().getSigqLoneKeyword_0_0_1(), "sigq"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigQualRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sigq", lv_sigq_0_2, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2810:8: lv_sigq_0_3= 'one'
                    {
                    lv_sigq_0_3=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSigQual3841); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigQualAccess().getSigqOneKeyword_0_0_2(), "sigq"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigQualRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sigq", lv_sigq_0_3, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2828:8: lv_sigq_0_4= 'some'
                    {
                    lv_sigq_0_4=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSigQual3870); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigQualAccess().getSigqSomeKeyword_0_0_3(), "sigq"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigQualRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sigq", lv_sigq_0_4, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2846:8: lv_sigq_0_5= 'private'
                    {
                    lv_sigq_0_5=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleSigQual3899); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigQualAccess().getSigqPrivateKeyword_0_0_4(), "sigq"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigQualRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sigq", lv_sigq_0_5, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2867:2: ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )*
            loop49:
            do {
                int alt49=6;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt49=1;
                    }
                    break;
                case 31:
                    {
                    alt49=2;
                    }
                    break;
                case 32:
                    {
                    alt49=3;
                    }
                    break;
                case 33:
                    {
                    alt49=4;
                    }
                    break;
                case 14:
                    {
                    alt49=5;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2867:4: 'abstract'
            	    {
            	    match(input,30,FOLLOW_30_in_ruleSigQual3926); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getAbstractKeyword_1_0(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2872:7: 'lone'
            	    {
            	    match(input,31,FOLLOW_31_in_ruleSigQual3942); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getLoneKeyword_1_1(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2877:7: 'one'
            	    {
            	    match(input,32,FOLLOW_32_in_ruleSigQual3958); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getOneKeyword_1_2(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2882:7: 'some'
            	    {
            	    match(input,33,FOLLOW_33_in_ruleSigQual3974); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getSomeKeyword_1_3(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2887:7: 'private'
            	    {
            	    match(input,14,FOLLOW_14_in_ruleSigQual3990); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getPrivateKeyword_1_4(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSigQual


    // $ANTLR start entryRuleSigExt
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2899:1: entryRuleSigExt returns [EObject current=null] : iv_ruleSigExt= ruleSigExt EOF ;
    public final EObject entryRuleSigExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExt = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2900:2: (iv_ruleSigExt= ruleSigExt EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2901:2: iv_ruleSigExt= ruleSigExt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigExtRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigExt_in_entryRuleSigExt4028);
            iv_ruleSigExt=ruleSigExt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigExt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExt4038); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigExt


    // $ANTLR start ruleSigExt
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2908:1: ruleSigExt returns [EObject current=null] : ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) ;
    public final EObject ruleSigExt() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;

        EObject lv_ref_3_0 = null;

        EObject lv_ref2_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2913:6: ( ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2914:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2914:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            else if ( (LA51_0==35) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2914:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2914:2: ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2914:2: ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2914:4: 'extends' ( (lv_ref_1_0= ruleReferencesSig ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleSigExt4074); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getExtendsKeyword_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2918:1: ( (lv_ref_1_0= ruleReferencesSig ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2919:1: (lv_ref_1_0= ruleReferencesSig )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2919:1: (lv_ref_1_0= ruleReferencesSig )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2920:3: lv_ref_1_0= ruleReferencesSig
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4095);
                    lv_ref_1_0=ruleReferencesSig();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigExtRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ref",
                      	        		lv_ref_1_0, 
                      	        		"ReferencesSig", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2943:6: ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2943:6: ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2943:8: 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    {
                    match(input,35,FOLLOW_35_in_ruleSigExt4113); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getInKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2947:1: ( (lv_ref_3_0= ruleReferencesSig ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2948:1: (lv_ref_3_0= ruleReferencesSig )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2948:1: (lv_ref_3_0= ruleReferencesSig )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2949:3: lv_ref_3_0= ruleReferencesSig
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4134);
                    lv_ref_3_0=ruleReferencesSig();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigExtRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"ref",
                      	        		lv_ref_3_0, 
                      	        		"ReferencesSig", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2971:2: ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==36) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2971:4: '+' ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    {
                    	    match(input,36,FOLLOW_36_in_ruleSigExt4145); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getSigExtAccess().getPlusSignKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2975:1: ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2976:1: (lv_ref2_5_0= ruleReferencesSig )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2976:1: (lv_ref2_5_0= ruleReferencesSig )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2977:3: lv_ref2_5_0= ruleReferencesSig
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRef2ReferencesSigParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4166);
                    	    lv_ref2_5_0=ruleReferencesSig();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSigExtRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"ref2",
                    	      	        		lv_ref2_5_0, 
                    	      	        		"ReferencesSig", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSigExt


    // $ANTLR start entryRuleExpression
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3007:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3008:2: (iv_ruleExpression= ruleExpression EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3009:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4205);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4215); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3016:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TerminalExpression_0 = null;

        EObject lv_binOp_1_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_arrowOp_3_0 = null;

        EObject lv_expr_4_0 = null;

        AntlrDatatypeRuleToken lv_cmp_7_0 = null;

        EObject lv_expr_8_0 = null;

        EObject lv_expr_11_0 = null;

        EObject lv_expr_13_0 = null;

        EObject lv_left_14_0 = null;

        EObject lv_expr_15_0 = null;

        EObject lv_comma_16_0 = null;

        EObject lv_expr_17_0 = null;

        EObject lv_right_18_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3021:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3022:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3022:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3023:2: this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression4265);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:1: ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )*
            loop57:
            do {
                int alt57=6;
                switch ( input.LA(1) ) {
                case 56:
                    {
                    int LA57_2 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA57_3 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA57_4 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA57_5 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA57_6 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA57_7 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA57_8 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA57_9 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA57_10 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 64:
                    {
                    int LA57_11 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 65:
                    {
                    int LA57_12 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 66:
                    {
                    int LA57_13 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 88:
                    {
                    int LA57_14 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 67:
                    {
                    int LA57_15 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA57_16 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 69:
                    {
                    int LA57_17 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA57_18 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA57_19 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA57_20 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 70:
                    {
                    int LA57_21 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 81:
                    {
                    int LA57_22 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA57_23 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA57_24 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA57_25 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA57_26 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 76:
                    {
                    int LA57_27 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 77:
                    {
                    int LA57_28 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA57_29 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 79:
                    {
                    int LA57_30 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 80:
                    {
                    int LA57_31 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA57_32 = input.LA(2);

                    if ( (synpred76()) ) {
                        alt57=4;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA57_33 = input.LA(2);

                    if ( (synpred76()) ) {
                        alt57=4;
                    }


                    }
                    break;
                case 89:
                    {
                    int LA57_34 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt57=5;
                    }


                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:2: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:2: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:3: ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:3: ( (lv_binOp_1_0= ruleBinOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3035:1: (lv_binOp_1_0= ruleBinOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3035:1: (lv_binOp_1_0= ruleBinOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3036:3: lv_binOp_1_0= ruleBinOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinOp_in_ruleExpression4287);
            	    lv_binOp_1_0=ruleBinOp();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"binOp",
            	      	        		lv_binOp_1_0, 
            	      	        		"BinOp", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3058:2: ( (lv_expr_2_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3059:1: (lv_expr_2_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3059:1: (lv_expr_2_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3060:3: lv_expr_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4308);
            	    lv_expr_2_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expr",
            	      	        		lv_expr_2_0, 
            	      	        		"Expression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:6: ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:6: ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:7: ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:7: ( (lv_arrowOp_3_0= ruleArrowOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3084:1: (lv_arrowOp_3_0= ruleArrowOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3084:1: (lv_arrowOp_3_0= ruleArrowOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3085:3: lv_arrowOp_3_0= ruleArrowOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrowOp_in_ruleExpression4337);
            	    lv_arrowOp_3_0=ruleArrowOp();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"arrowOp",
            	      	        		lv_arrowOp_3_0, 
            	      	        		"ArrowOp", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3107:2: ( (lv_expr_4_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3108:1: (lv_expr_4_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3108:1: (lv_expr_4_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3109:3: lv_expr_4_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4358);
            	    lv_expr_4_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expr",
            	      	        		lv_expr_4_0, 
            	      	        		"Expression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:6: ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:6: ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:7: ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:7: ( '!' | 'not' )?
            	    int alt52=3;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==37) ) {
            	        alt52=1;
            	    }
            	    else if ( (LA52_0==38) ) {
            	        alt52=2;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:9: '!'
            	            {
            	            match(input,37,FOLLOW_37_in_ruleExpression4377); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getExclamationMarkKeyword_1_2_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3137:7: 'not'
            	            {
            	            match(input,38,FOLLOW_38_in_ruleExpression4393); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getNotKeyword_1_2_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3141:3: ( (lv_cmp_7_0= ruleCompareOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3142:1: (lv_cmp_7_0= ruleCompareOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3142:1: (lv_cmp_7_0= ruleCompareOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3143:3: lv_cmp_7_0= ruleCompareOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOp_in_ruleExpression4416);
            	    lv_cmp_7_0=ruleCompareOp();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"cmp",
            	      	        		lv_cmp_7_0, 
            	      	        		"CompareOp", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3165:2: ( (lv_expr_8_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3166:1: (lv_expr_8_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3166:1: (lv_expr_8_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3167:3: lv_expr_8_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4437);
            	    lv_expr_8_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expr",
            	      	        		lv_expr_8_0, 
            	      	        		"Expression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:6: ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:6: ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:7: ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )?
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:7: ( '=>' | 'implies' )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==39) ) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==40) ) {
            	        alt53=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("3190:7: ( '=>' | 'implies' )", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:9: '=>'
            	            {
            	            match(input,39,FOLLOW_39_in_ruleExpression4456); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3195:7: 'implies'
            	            {
            	            match(input,40,FOLLOW_40_in_ruleExpression4472); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3199:2: ( (lv_expr_11_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3200:1: (lv_expr_11_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3200:1: (lv_expr_11_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3201:3: lv_expr_11_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4494);
            	    lv_expr_11_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expr",
            	      	        		lv_expr_11_0, 
            	      	        		"Expression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:2: ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==41) ) {
            	        int LA54_1 = input.LA(2);

            	        if ( (synpred75()) ) {
            	            alt54=1;
            	        }
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:4: 'else' ( (lv_expr_13_0= ruleExpression ) )
            	            {
            	            match(input,41,FOLLOW_41_in_ruleExpression4505); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getElseKeyword_1_3_2_0(), null); 
            	                  
            	            }
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3227:1: ( (lv_expr_13_0= ruleExpression ) )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3228:1: (lv_expr_13_0= ruleExpression )
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3228:1: (lv_expr_13_0= ruleExpression )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3229:3: lv_expr_13_0= ruleExpression
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleExpression4526);
            	            lv_expr_13_0=ruleExpression();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"expr",
            	              	        		lv_expr_13_0, 
            	              	        		"Expression", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:6: ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:6: ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:7: ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:7: ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3253:1: (lv_left_14_0= ruleLeftSquareBracketKeyword )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3253:1: (lv_left_14_0= ruleLeftSquareBracketKeyword )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3254:3: lv_left_14_0= ruleLeftSquareBracketKeyword
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_4_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleExpression4557);
            	    lv_left_14_0=ruleLeftSquareBracketKeyword();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"left",
            	      	        		lv_left_14_0, 
            	      	        		"LeftSquareBracketKeyword", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3276:2: ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( ((LA56_0>=RULE_INT && LA56_0<=RULE_NEGATIVE_INTEGER)||LA56_0==25||LA56_0==27||(LA56_0>=31 && LA56_0<=33)||(LA56_0>=37 && LA56_0<=38)||(LA56_0>=42 && LA56_0<=48)||(LA56_0>=50 && LA56_0<=51)||(LA56_0>=54 && LA56_0<=55)||(LA56_0>=70 && LA56_0<=75)) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3276:3: ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )*
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3276:3: ( (lv_expr_15_0= ruleExpression ) )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3277:1: (lv_expr_15_0= ruleExpression )
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3277:1: (lv_expr_15_0= ruleExpression )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3278:3: lv_expr_15_0= ruleExpression
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleExpression4579);
            	            lv_expr_15_0=ruleExpression();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"expr",
            	              	        		lv_expr_15_0, 
            	              	        		"Expression", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }


            	            }

            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3300:2: ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==28) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3300:3: ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3300:3: ( (lv_comma_16_0= ruleComma ) )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3301:1: (lv_comma_16_0= ruleComma )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3301:1: (lv_comma_16_0= ruleComma )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3302:3: lv_comma_16_0= ruleComma
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleComma_in_ruleExpression4601);
            	            	    lv_comma_16_0=ruleComma();
            	            	    _fsp--;
            	            	    if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	      	        }
            	            	      	        try {
            	            	      	       		add(
            	            	      	       			current, 
            	            	      	       			"comma",
            	            	      	        		lv_comma_16_0, 
            	            	      	        		"Comma", 
            	            	      	        		currentNode);
            	            	      	        } catch (ValueConverterException vce) {
            	            	      				handleValueConverterException(vce);
            	            	      	        }
            	            	      	        currentNode = currentNode.getParent();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }

            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3324:2: ( (lv_expr_17_0= ruleExpression ) )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3325:1: (lv_expr_17_0= ruleExpression )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3325:1: (lv_expr_17_0= ruleExpression )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3326:3: lv_expr_17_0= ruleExpression
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4622);
            	            	    lv_expr_17_0=ruleExpression();
            	            	    _fsp--;
            	            	    if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	      	        }
            	            	      	        try {
            	            	      	       		add(
            	            	      	       			current, 
            	            	      	       			"expr",
            	            	      	        		lv_expr_17_0, 
            	            	      	        		"Expression", 
            	            	      	        		currentNode);
            	            	      	        } catch (ValueConverterException vce) {
            	            	      				handleValueConverterException(vce);
            	            	      	        }
            	            	      	        currentNode = currentNode.getParent();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop55;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3348:6: ( (lv_right_18_0= ruleRightSquareBracketKeyword ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3349:1: (lv_right_18_0= ruleRightSquareBracketKeyword )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3349:1: (lv_right_18_0= ruleRightSquareBracketKeyword )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3350:3: lv_right_18_0= ruleRightSquareBracketKeyword
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleExpression4647);
            	    lv_right_18_0=ruleRightSquareBracketKeyword();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_18_0, 
            	      	        		"RightSquareBracketKeyword", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleTerminalExpression
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3380:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3381:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3382:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4686);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression4696); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerminalExpression


    // $ANTLR start ruleTerminalExpression
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3389:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_let_1_0=null;
        Token lv_none_27_0=null;
        Token lv_iden_29_0=null;
        Token lv_univ_31_0=null;
        Token lv_int_33_0=null;
        Token lv_seq_35_0=null;
        Token lv_parO_37_0=null;
        Token lv_parF_39_0=null;
        EObject lv_letdecl_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_letdecl_4_0 = null;

        EObject lv_blockOrBar_5_0 = null;

        AntlrDatatypeRuleToken lv_quant_7_0 = null;

        EObject lv_decl_8_0 = null;

        EObject lv_comma_9_0 = null;

        EObject lv_decl_10_0 = null;

        EObject lv_blockOrBar_11_0 = null;

        EObject lv_unOp_13_0 = null;

        EObject lv_expr_14_0 = null;

        EObject lv_common_16_0 = null;

        EObject lv_decl_17_0 = null;

        EObject lv_comma_18_0 = null;

        EObject lv_decl_19_0 = null;

        EObject lv_blockOrBar_20_0 = null;

        EObject lv_expr_21_0 = null;

        EObject lv_expr_38_0 = null;

        EObject lv_block_45_0 = null;

        EObject lv_leftCurlyBracket_47_0 = null;

        EObject lv_decl_48_0 = null;

        EObject lv_comma_49_0 = null;

        EObject lv_decl_50_0 = null;

        EObject lv_blockOrBar_51_0 = null;

        EObject lv_rightCurlyBracket_52_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3394:6: ( ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3395:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3395:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )
            int alt65=15;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt65=1;
                }
                break;
            case 54:
            case 55:
                {
                alt65=2;
                }
                break;
            case 25:
            case 37:
            case 38:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt65=3;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 75:
                {
                alt65=4;
                }
                break;
            case RULE_INT:
                {
                alt65=5;
                }
                break;
            case RULE_NEGATIVE_INTEGER:
                {
                alt65=6;
                }
                break;
            case 43:
                {
                alt65=7;
                }
                break;
            case 44:
                {
                alt65=8;
                }
                break;
            case 45:
                {
                alt65=9;
                }
                break;
            case 46:
                {
                alt65=10;
                }
                break;
            case 47:
                {
                alt65=11;
                }
                break;
            case 48:
                {
                alt65=12;
                }
                break;
            case RULE_ID:
            case 50:
            case 51:
                {
                alt65=13;
                }
                break;
            case 27:
                {
                switch ( input.LA(2) ) {
                case RULE_INT:
                case RULE_NEGATIVE_INTEGER:
                case 25:
                case 27:
                case 29:
                case 31:
                case 32:
                case 33:
                case 37:
                case 38:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 50:
                case 54:
                case 55:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    {
                    alt65=14;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA65_16 = input.LA(3);

                    if ( ((LA65_16>=RULE_INT && LA65_16<=RULE_NEGATIVE_INTEGER)||LA65_16==25||LA65_16==27||LA65_16==29||(LA65_16>=31 && LA65_16<=33)||(LA65_16>=35 && LA65_16<=40)||(LA65_16>=42 && LA65_16<=48)||(LA65_16>=50 && LA65_16<=51)||(LA65_16>=53 && LA65_16<=81)||(LA65_16>=88 && LA65_16<=89)) ) {
                        alt65=14;
                    }
                    else if ( (LA65_16==18||LA65_16==28||LA65_16==87) ) {
                        alt65=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3395:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 65, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 51:
                    {
                    int LA65_17 = input.LA(3);

                    if ( (LA65_17==18||LA65_17==28||LA65_17==87) ) {
                        alt65=15;
                    }
                    else if ( ((LA65_17>=RULE_INT && LA65_17<=RULE_NEGATIVE_INTEGER)||LA65_17==25||LA65_17==27||LA65_17==29||(LA65_17>=31 && LA65_17<=33)||(LA65_17>=35 && LA65_17<=40)||(LA65_17>=42 && LA65_17<=48)||(LA65_17>=50 && LA65_17<=51)||(LA65_17>=53 && LA65_17<=81)||(LA65_17>=88 && LA65_17<=89)) ) {
                        alt65=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3395:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 65, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                case 52:
                    {
                    alt65=15;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3395:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 65, 14, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3395:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3395:2: ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3395:2: ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3395:3: () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3395:3: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3396:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3409:2: ( (lv_let_1_0= 'let' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3410:1: (lv_let_1_0= 'let' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3410:1: (lv_let_1_0= 'let' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3411:3: lv_let_1_0= 'let'
                    {
                    lv_let_1_0=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleTerminalExpression4752); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getLetLetKeyword_0_1_0(), "let"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "let", lv_let_1_0, "let", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3430:2: ( (lv_letdecl_2_0= ruleLetDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3431:1: (lv_letdecl_2_0= ruleLetDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3431:1: (lv_letdecl_2_0= ruleLetDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3432:3: lv_letdecl_2_0= ruleLetDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpression4786);
                    lv_letdecl_2_0=ruleLetDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"letdecl",
                      	        		lv_letdecl_2_0, 
                      	        		"LetDecl", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3454:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==28) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3454:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3454:3: ( (lv_comma_3_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3455:1: (lv_comma_3_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3455:1: (lv_comma_3_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3456:3: lv_comma_3_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_0_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression4808);
                    	    lv_comma_3_0=ruleComma();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"comma",
                    	      	        		lv_comma_3_0, 
                    	      	        		"Comma", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3478:2: ( (lv_letdecl_4_0= ruleLetDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3479:1: (lv_letdecl_4_0= ruleLetDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3479:1: (lv_letdecl_4_0= ruleLetDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:3: lv_letdecl_4_0= ruleLetDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpression4829);
                    	    lv_letdecl_4_0=ruleLetDecl();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"letdecl",
                    	      	        		lv_letdecl_4_0, 
                    	      	        		"LetDecl", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3502:4: ( (lv_blockOrBar_5_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3503:1: (lv_blockOrBar_5_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3503:1: (lv_blockOrBar_5_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3504:3: lv_blockOrBar_5_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_0_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression4852);
                    lv_blockOrBar_5_0=ruleBlockOrBar();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"blockOrBar",
                      	        		lv_blockOrBar_5_0, 
                      	        		"BlockOrBar", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3527:6: ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3527:6: ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3527:7: () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3527:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3528:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3541:2: ( (lv_quant_7_0= ruleQuant ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3542:1: (lv_quant_7_0= ruleQuant )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3542:1: (lv_quant_7_0= ruleQuant )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3543:3: lv_quant_7_0= ruleQuant
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getQuantQuantParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQuant_in_ruleTerminalExpression4893);
                    lv_quant_7_0=ruleQuant();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"quant",
                      	        		lv_quant_7_0, 
                      	        		"Quant", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3565:2: ( (lv_decl_8_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3566:1: (lv_decl_8_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3566:1: (lv_decl_8_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3567:3: lv_decl_8_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression4914);
                    lv_decl_8_0=ruleDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"decl",
                      	        		lv_decl_8_0, 
                      	        		"Decl", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3589:2: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==28) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3589:3: ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3589:3: ( (lv_comma_9_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3590:1: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3590:1: (lv_comma_9_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3591:3: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_1_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression4936);
                    	    lv_comma_9_0=ruleComma();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"comma",
                    	      	        		lv_comma_9_0, 
                    	      	        		"Comma", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3613:2: ( (lv_decl_10_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3614:1: (lv_decl_10_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3614:1: (lv_decl_10_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3615:3: lv_decl_10_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression4957);
                    	    lv_decl_10_0=ruleDecl();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"decl",
                    	      	        		lv_decl_10_0, 
                    	      	        		"Decl", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3637:4: ( (lv_blockOrBar_11_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3638:1: (lv_blockOrBar_11_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3638:1: (lv_blockOrBar_11_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3639:3: lv_blockOrBar_11_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression4980);
                    lv_blockOrBar_11_0=ruleBlockOrBar();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"blockOrBar",
                      	        		lv_blockOrBar_11_0, 
                      	        		"BlockOrBar", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3662:6: ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3662:6: ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3662:7: () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3662:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3663:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3676:2: ( (lv_unOp_13_0= ruleUnOp ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3677:1: (lv_unOp_13_0= ruleUnOp )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3677:1: (lv_unOp_13_0= ruleUnOp )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3678:3: lv_unOp_13_0= ruleUnOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getUnOpUnOpParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnOp_in_ruleTerminalExpression5021);
                    lv_unOp_13_0=ruleUnOp();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"unOp",
                      	        		lv_unOp_13_0, 
                      	        		"UnOp", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3700:2: ( (lv_expr_14_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3701:1: (lv_expr_14_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3701:1: (lv_expr_14_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3702:3: lv_expr_14_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5042);
                    lv_expr_14_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_14_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3725:6: ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3725:6: ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3725:7: () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3725:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3726:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3739:2: ( (lv_common_16_0= ruleCommonQuantUnOp ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3740:1: (lv_common_16_0= ruleCommonQuantUnOp )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3740:1: (lv_common_16_0= ruleCommonQuantUnOp )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3741:3: lv_common_16_0= ruleCommonQuantUnOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommonCommonQuantUnOpParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommonQuantUnOp_in_ruleTerminalExpression5083);
                    lv_common_16_0=ruleCommonQuantUnOp();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"common",
                      	        		lv_common_16_0, 
                      	        		"CommonQuantUnOp", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )
                    int alt61=2;
                    switch ( input.LA(1) ) {
                    case 14:
                    case 52:
                        {
                        alt61=1;
                        }
                        break;
                    case 51:
                        {
                        int LA61_3 = input.LA(2);

                        if ( (synpred86()) ) {
                            alt61=1;
                        }
                        else if ( (true) ) {
                            alt61=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3763:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 61, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA61_4 = input.LA(2);

                        if ( (synpred86()) ) {
                            alt61=1;
                        }
                        else if ( (true) ) {
                            alt61=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3763:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 61, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                    case RULE_NEGATIVE_INTEGER:
                    case 25:
                    case 27:
                    case 31:
                    case 32:
                    case 33:
                    case 37:
                    case 38:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 50:
                    case 54:
                    case 55:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                        {
                        alt61=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3763:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:3: ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:3: ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:4: ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:4: ( (lv_decl_17_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3764:1: (lv_decl_17_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3764:1: (lv_decl_17_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3765:3: lv_decl_17_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5106);
                            lv_decl_17_0=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"decl",
                              	        		lv_decl_17_0, 
                              	        		"Decl", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3787:2: ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==28) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3787:3: ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3787:3: ( (lv_comma_18_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3788:1: (lv_comma_18_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3788:1: (lv_comma_18_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3789:3: lv_comma_18_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_3_2_0_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5128);
                            	    lv_comma_18_0=ruleComma();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"comma",
                            	      	        		lv_comma_18_0, 
                            	      	        		"Comma", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3811:2: ( (lv_decl_19_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3812:1: (lv_decl_19_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3812:1: (lv_decl_19_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3813:3: lv_decl_19_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5149);
                            	    lv_decl_19_0=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"decl",
                            	      	        		lv_decl_19_0, 
                            	      	        		"Decl", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3835:4: ( (lv_blockOrBar_20_0= ruleBlockOrBar ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3836:1: (lv_blockOrBar_20_0= ruleBlockOrBar )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3836:1: (lv_blockOrBar_20_0= ruleBlockOrBar )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3837:3: lv_blockOrBar_20_0= ruleBlockOrBar
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_3_2_0_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5172);
                            lv_blockOrBar_20_0=ruleBlockOrBar();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"blockOrBar",
                              	        		lv_blockOrBar_20_0, 
                              	        		"BlockOrBar", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3860:6: ( (lv_expr_21_0= ruleExpression ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3860:6: ( (lv_expr_21_0= ruleExpression ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3861:1: (lv_expr_21_0= ruleExpression )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3861:1: (lv_expr_21_0= ruleExpression )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3862:3: lv_expr_21_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_3_2_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5200);
                            lv_expr_21_0=ruleExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"expr",
                              	        		lv_expr_21_0, 
                              	        		"Expression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3885:6: ( () RULE_INT )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3885:6: ( () RULE_INT )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3885:7: () RULE_INT
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3885:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3886:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression5230); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_4_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3904:6: ( () RULE_NEGATIVE_INTEGER )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3904:6: ( () RULE_NEGATIVE_INTEGER )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3904:7: () RULE_NEGATIVE_INTEGER
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3904:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3905:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_5_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_5_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_NEGATIVE_INTEGER,FOLLOW_RULE_NEGATIVE_INTEGER_in_ruleTerminalExpression5258); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getNEGATIVE_INTEGERTerminalRuleCall_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3923:6: ( () ( (lv_none_27_0= 'none' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3923:6: ( () ( (lv_none_27_0= 'none' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3923:7: () ( (lv_none_27_0= 'none' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3923:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3924:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_6_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_6_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3937:2: ( (lv_none_27_0= 'none' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3938:1: (lv_none_27_0= 'none' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3938:1: (lv_none_27_0= 'none' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3939:3: lv_none_27_0= 'none'
                    {
                    lv_none_27_0=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleTerminalExpression5295); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getNoneNoneKeyword_6_1_0(), "none"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "none", lv_none_27_0, "none", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3959:6: ( () ( (lv_iden_29_0= 'iden' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3959:6: ( () ( (lv_iden_29_0= 'iden' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3959:7: () ( (lv_iden_29_0= 'iden' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3959:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3960:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_7_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_7_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3973:2: ( (lv_iden_29_0= 'iden' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3974:1: (lv_iden_29_0= 'iden' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3974:1: (lv_iden_29_0= 'iden' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3975:3: lv_iden_29_0= 'iden'
                    {
                    lv_iden_29_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleTerminalExpression5346); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getIdenIdenKeyword_7_1_0(), "iden"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "iden", lv_iden_29_0, "iden", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3995:6: ( () ( (lv_univ_31_0= 'univ' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3995:6: ( () ( (lv_univ_31_0= 'univ' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3995:7: () ( (lv_univ_31_0= 'univ' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3995:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3996:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_8_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_8_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4009:2: ( (lv_univ_31_0= 'univ' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4010:1: (lv_univ_31_0= 'univ' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4010:1: (lv_univ_31_0= 'univ' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4011:3: lv_univ_31_0= 'univ'
                    {
                    lv_univ_31_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleTerminalExpression5397); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getUnivUnivKeyword_8_1_0(), "univ"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "univ", lv_univ_31_0, "univ", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4031:6: ( () ( (lv_int_33_0= 'Int' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4031:6: ( () ( (lv_int_33_0= 'Int' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4031:7: () ( (lv_int_33_0= 'Int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4031:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4032:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_9_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_9_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4045:2: ( (lv_int_33_0= 'Int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4046:1: (lv_int_33_0= 'Int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4046:1: (lv_int_33_0= 'Int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4047:3: lv_int_33_0= 'Int'
                    {
                    lv_int_33_0=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleTerminalExpression5448); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getIntIntKeyword_9_1_0(), "int"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "int", lv_int_33_0, "Int", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4067:6: ( () ( (lv_seq_35_0= 'seq/Int' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4067:6: ( () ( (lv_seq_35_0= 'seq/Int' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4067:7: () ( (lv_seq_35_0= 'seq/Int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4067:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4068:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_10_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_10_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4081:2: ( (lv_seq_35_0= 'seq/Int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4082:1: (lv_seq_35_0= 'seq/Int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4082:1: (lv_seq_35_0= 'seq/Int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4083:3: lv_seq_35_0= 'seq/Int'
                    {
                    lv_seq_35_0=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleTerminalExpression5499); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getSeqSeqIntKeyword_10_1_0(), "seq"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "seq", lv_seq_35_0, "seq/Int", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4103:6: ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4103:6: ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4103:7: () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4103:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4104:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_11_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_11_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4117:2: ( (lv_parO_37_0= '(' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4118:1: (lv_parO_37_0= '(' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4118:1: (lv_parO_37_0= '(' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4119:3: lv_parO_37_0= '('
                    {
                    lv_parO_37_0=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleTerminalExpression5550); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getParOLeftParenthesisKeyword_11_1_0(), "parO"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "parO", lv_parO_37_0, "(", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4138:2: ( (lv_expr_38_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4139:1: (lv_expr_38_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4139:1: (lv_expr_38_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4140:3: lv_expr_38_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5584);
                    lv_expr_38_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_38_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4162:2: ( (lv_parF_39_0= ')' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4163:1: (lv_parF_39_0= ')' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4163:1: (lv_parF_39_0= ')' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4164:3: lv_parF_39_0= ')'
                    {
                    lv_parF_39_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleTerminalExpression5602); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getParFRightParenthesisKeyword_11_3_0(), "parF"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "parF", lv_parF_39_0, ")", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4184:6: ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4184:6: ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4184:7: () ( '@' )? ( ( ( RULE_ID ) ) | 'this' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4184:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4185:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_12_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_12_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4198:2: ( '@' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==50) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4198:4: '@'
                            {
                            match(input,50,FOLLOW_50_in_ruleTerminalExpression5646); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExpressionAccess().getCommercialAtKeyword_12_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4202:3: ( ( ( RULE_ID ) ) | 'this' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==51) ) {
                        alt63=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4202:3: ( ( ( RULE_ID ) ) | 'this' )", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4202:4: ( ( RULE_ID ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4202:4: ( ( RULE_ID ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4203:1: ( RULE_ID )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4203:1: ( RULE_ID )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4204:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression5671); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getTerminalExpressionAccess().getNameRefReferencesNameCrossReference_12_2_0_0(), "nameRef"); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4220:7: 'this'
                            {
                            match(input,51,FOLLOW_51_in_ruleTerminalExpression5687); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExpressionAccess().getThisKeyword_12_2_1(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4225:6: ( () ( (lv_block_45_0= ruleBlock ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4225:6: ( () ( (lv_block_45_0= ruleBlock ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4225:7: () ( (lv_block_45_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4225:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4226:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_13_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_13_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4239:2: ( (lv_block_45_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4240:1: (lv_block_45_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4240:1: (lv_block_45_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4241:3: lv_block_45_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockBlockParserRuleCall_13_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleTerminalExpression5729);
                    lv_block_45_0=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_45_0, 
                      	        		"Block", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4264:6: ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4264:6: ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4264:7: () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4264:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4265:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_14_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_14_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4278:2: ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4279:1: (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4279:1: (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4280:3: lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLeftCurlyBracketLeftCurlyBracketParserRuleCall_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleTerminalExpression5770);
                    lv_leftCurlyBracket_47_0=ruleLeftCurlyBracket();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"leftCurlyBracket",
                      	        		lv_leftCurlyBracket_47_0, 
                      	        		"LeftCurlyBracket", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4302:2: ( (lv_decl_48_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4303:1: (lv_decl_48_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4303:1: (lv_decl_48_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4304:3: lv_decl_48_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_14_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5791);
                    lv_decl_48_0=ruleDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"decl",
                      	        		lv_decl_48_0, 
                      	        		"Decl", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4326:2: ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==28) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4326:3: ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4326:3: ( (lv_comma_49_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4327:1: (lv_comma_49_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4327:1: (lv_comma_49_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4328:3: lv_comma_49_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_14_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5813);
                    	    lv_comma_49_0=ruleComma();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"comma",
                    	      	        		lv_comma_49_0, 
                    	      	        		"Comma", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4350:2: ( (lv_decl_50_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4351:1: (lv_decl_50_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4351:1: (lv_decl_50_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4352:3: lv_decl_50_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_14_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5834);
                    	    lv_decl_50_0=ruleDecl();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"decl",
                    	      	        		lv_decl_50_0, 
                    	      	        		"Decl", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4374:4: ( (lv_blockOrBar_51_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4375:1: (lv_blockOrBar_51_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4375:1: (lv_blockOrBar_51_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4376:3: lv_blockOrBar_51_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_14_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5857);
                    lv_blockOrBar_51_0=ruleBlockOrBar();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"blockOrBar",
                      	        		lv_blockOrBar_51_0, 
                      	        		"BlockOrBar", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4398:2: ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4399:1: (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4399:1: (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4400:3: lv_rightCurlyBracket_52_0= ruleRightCurlyBracket
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getRightCurlyBracketRightCurlyBracketParserRuleCall_14_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleTerminalExpression5878);
                    lv_rightCurlyBracket_52_0=ruleRightCurlyBracket();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightCurlyBracket",
                      	        		lv_rightCurlyBracket_52_0, 
                      	        		"RightCurlyBracket", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTerminalExpression


    // $ANTLR start entryRuleDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4430:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4431:2: (iv_ruleDecl= ruleDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4432:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl5915);
            iv_ruleDecl=ruleDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl5925); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDecl


    // $ANTLR start ruleDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4439:1: ruleDecl returns [EObject current=null] : ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyName_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_propertyName_4_0 = null;

        EObject lv_colon_5_0 = null;

        EObject lv_expr_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4444:6: ( ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4445:1: ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4445:1: ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4445:2: ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4445:2: ( 'private' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==14) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4445:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleDecl5961); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4449:3: ( 'disj' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==52) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4449:5: 'disj'
                    {
                    match(input,52,FOLLOW_52_in_ruleDecl5974); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4453:3: ( (lv_propertyName_2_0= rulePropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4454:1: (lv_propertyName_2_0= rulePropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4454:1: (lv_propertyName_2_0= rulePropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4455:3: lv_propertyName_2_0= rulePropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleDecl5997);
            lv_propertyName_2_0=rulePropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"propertyName",
              	        		lv_propertyName_2_0, 
              	        		"PropertyName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4477:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==28) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4477:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4477:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4478:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4478:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4479:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleDecl6019);
            	    lv_comma_3_0=ruleComma();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"comma",
            	      	        		lv_comma_3_0, 
            	      	        		"Comma", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4501:2: ( (lv_propertyName_4_0= rulePropertyName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4502:1: (lv_propertyName_4_0= rulePropertyName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4502:1: (lv_propertyName_4_0= rulePropertyName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4503:3: lv_propertyName_4_0= rulePropertyName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyName_in_ruleDecl6040);
            	    lv_propertyName_4_0=rulePropertyName();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"propertyName",
            	      	        		lv_propertyName_4_0, 
            	      	        		"PropertyName", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4525:4: ( (lv_colon_5_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4526:1: (lv_colon_5_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4526:1: (lv_colon_5_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4527:3: lv_colon_5_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getColonColonParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleDecl6063);
            lv_colon_5_0=ruleColon();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"colon",
              	        		lv_colon_5_0, 
              	        		"Colon", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4549:2: ( 'disj' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==52) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4549:4: 'disj'
                    {
                    match(input,52,FOLLOW_52_in_ruleDecl6074); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_5(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4553:3: ( (lv_expr_7_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4554:1: (lv_expr_7_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4554:1: (lv_expr_7_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4555:3: lv_expr_7_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDecl6097);
            lv_expr_7_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expr",
              	        		lv_expr_7_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDecl


    // $ANTLR start entryRuleLetDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4585:1: entryRuleLetDecl returns [EObject current=null] : iv_ruleLetDecl= ruleLetDecl EOF ;
    public final EObject entryRuleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4586:2: (iv_ruleLetDecl= ruleLetDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4587:2: iv_ruleLetDecl= ruleLetDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetDecl_in_entryRuleLetDecl6133);
            iv_ruleLetDecl=ruleLetDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDecl6143); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLetDecl


    // $ANTLR start ruleLetDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4594:1: ruleLetDecl returns [EObject current=null] : ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_nameExpression_0_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4599:6: ( ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4600:1: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4600:1: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4600:2: ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4600:2: ( (lv_nameExpression_0_0= rulePropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4601:1: (lv_nameExpression_0_0= rulePropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4601:1: (lv_nameExpression_0_0= rulePropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4602:3: lv_nameExpression_0_0= rulePropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getNameExpressionPropertyNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleLetDecl6189);
            lv_nameExpression_0_0=rulePropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"nameExpression",
              	        		lv_nameExpression_0_0, 
              	        		"PropertyName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,53,FOLLOW_53_in_ruleLetDecl6199); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetDeclAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4628:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4629:1: (lv_expr_2_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4629:1: (lv_expr_2_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4630:3: lv_expr_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getExprExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetDecl6220);
            lv_expr_2_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expr",
              	        		lv_expr_2_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLetDecl


    // $ANTLR start entryRuleQuant
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4660:1: entryRuleQuant returns [String current=null] : iv_ruleQuant= ruleQuant EOF ;
    public final String entryRuleQuant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuant = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4661:2: (iv_ruleQuant= ruleQuant EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4662:2: iv_ruleQuant= ruleQuant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQuantRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQuant_in_entryRuleQuant6257);
            iv_ruleQuant=ruleQuant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQuant.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuant6268); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQuant


    // $ANTLR start ruleQuant
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4669:1: ruleQuant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'all' | kw= 'sum' ) ;
    public final AntlrDatatypeRuleToken ruleQuant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4674:6: ( (kw= 'all' | kw= 'sum' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4675:1: (kw= 'all' | kw= 'sum' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4675:1: (kw= 'all' | kw= 'sum' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==54) ) {
                alt70=1;
            }
            else if ( (LA70_0==55) ) {
                alt70=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4675:1: (kw= 'all' | kw= 'sum' )", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4676:2: kw= 'all'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleQuant6306); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getQuantAccess().getAllKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4683:2: kw= 'sum'
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleQuant6325); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getQuantAccess().getSumKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQuant


    // $ANTLR start entryRuleBinOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4696:1: entryRuleBinOp returns [EObject current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final EObject entryRuleBinOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4697:2: (iv_ruleBinOp= ruleBinOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4698:2: iv_ruleBinOp= ruleBinOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBinOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBinOp_in_entryRuleBinOp6365);
            iv_ruleBinOp=ruleBinOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBinOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinOp6375); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBinOp


    // $ANTLR start ruleBinOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4705:1: ruleBinOp returns [EObject current=null] : ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) ) ;
    public final EObject ruleBinOp() throws RecognitionException {
        EObject current = null;

        EObject lv_dot_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4710:6: ( ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4711:1: ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4711:1: ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4711:2: () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4711:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4712:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBinOpAccess().getBinOpAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBinOpAccess().getBinOpAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4725:2: ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )
            int alt71=16;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt71=1;
                }
                break;
            case 57:
                {
                alt71=2;
                }
                break;
            case 58:
                {
                alt71=3;
                }
                break;
            case 59:
                {
                alt71=4;
                }
                break;
            case 60:
                {
                alt71=5;
                }
                break;
            case 61:
                {
                alt71=6;
                }
                break;
            case 62:
                {
                alt71=7;
                }
                break;
            case 36:
                {
                alt71=8;
                }
                break;
            case 63:
                {
                alt71=9;
                }
                break;
            case 64:
                {
                alt71=10;
                }
                break;
            case 65:
                {
                alt71=11;
                }
                break;
            case 66:
                {
                alt71=12;
                }
                break;
            case 88:
                {
                alt71=13;
                }
                break;
            case 67:
                {
                alt71=14;
                }
                break;
            case 68:
                {
                alt71=15;
                }
                break;
            case 69:
                {
                alt71=16;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4725:2: ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4725:4: '||'
                    {
                    match(input,56,FOLLOW_56_in_ruleBinOp6423); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4730:7: 'or'
                    {
                    match(input,57,FOLLOW_57_in_ruleBinOp6439); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getOrKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4735:7: '&&'
                    {
                    match(input,58,FOLLOW_58_in_ruleBinOp6455); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAmpersandAmpersandKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4740:7: 'and'
                    {
                    match(input,59,FOLLOW_59_in_ruleBinOp6471); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAndKeyword_1_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4745:7: '&'
                    {
                    match(input,60,FOLLOW_60_in_ruleBinOp6487); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAmpersandKeyword_1_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4750:7: '<=>'
                    {
                    match(input,61,FOLLOW_61_in_ruleBinOp6503); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4755:7: 'iff'
                    {
                    match(input,62,FOLLOW_62_in_ruleBinOp6519); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getIffKeyword_1_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4760:7: '+'
                    {
                    match(input,36,FOLLOW_36_in_ruleBinOp6535); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getPlusSignKeyword_1_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4765:7: '-'
                    {
                    match(input,63,FOLLOW_63_in_ruleBinOp6551); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getHyphenMinusKeyword_1_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4770:7: '++'
                    {
                    match(input,64,FOLLOW_64_in_ruleBinOp6567); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getPlusSignPlusSignKeyword_1_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4775:7: '<:'
                    {
                    match(input,65,FOLLOW_65_in_ruleBinOp6583); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignColonKeyword_1_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4780:7: ':>'
                    {
                    match(input,66,FOLLOW_66_in_ruleBinOp6599); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getColonGreaterThanSignKeyword_1_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4785:6: ( (lv_dot_13_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4785:6: ( (lv_dot_13_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4786:1: (lv_dot_13_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4786:1: (lv_dot_13_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4787:3: lv_dot_13_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBinOpAccess().getDotDotParserRuleCall_1_12_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleBinOp6626);
                    lv_dot_13_0=ruleDot();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBinOpRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"dot",
                      	        		lv_dot_13_0, 
                      	        		"Dot", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4810:7: '<<'
                    {
                    match(input,67,FOLLOW_67_in_ruleBinOp6642); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignLessThanSignKeyword_1_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4815:7: '>>'
                    {
                    match(input,68,FOLLOW_68_in_ruleBinOp6658); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignKeyword_1_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4820:7: '>>>'
                    {
                    match(input,69,FOLLOW_69_in_ruleBinOp6674); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_15(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBinOp


    // $ANTLR start entryRuleUnOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4832:1: entryRuleUnOp returns [EObject current=null] : iv_ruleUnOp= ruleUnOp EOF ;
    public final EObject entryRuleUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4833:2: (iv_ruleUnOp= ruleUnOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4834:2: iv_ruleUnOp= ruleUnOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnOp_in_entryRuleUnOp6711);
            iv_ruleUnOp=ruleUnOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOp6721); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnOp


    // $ANTLR start ruleUnOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4841:1: ruleUnOp returns [EObject current=null] : ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) ) ;
    public final EObject ruleUnOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_4_1=null;
        Token lv_op_4_2=null;
        Token lv_op_4_3=null;
        Token lv_op_4_4=null;
        Token lv_op_4_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4846:6: ( ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4847:1: ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4847:1: ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4847:2: () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4847:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4848:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getUnOpAccess().getUnOpAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getUnOpAccess().getUnOpAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4861:2: ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt73=1;
                }
                break;
            case 70:
                {
                alt73=2;
                }
                break;
            case 25:
                {
                alt73=3;
                }
                break;
            case 37:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt73=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4861:2: ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4861:4: 'not'
                    {
                    match(input,38,FOLLOW_38_in_ruleUnOp6769); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getNotKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4866:7: 'set'
                    {
                    match(input,70,FOLLOW_70_in_ruleUnOp6785); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getSetKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4871:7: 'seq'
                    {
                    match(input,25,FOLLOW_25_in_ruleUnOp6801); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getSeqKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4876:6: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4876:6: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4877:1: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4877:1: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4878:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4878:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )
                    int alt72=5;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt72=1;
                        }
                        break;
                    case 71:
                        {
                        alt72=2;
                        }
                        break;
                    case 72:
                        {
                        alt72=3;
                        }
                        break;
                    case 73:
                        {
                        alt72=4;
                        }
                        break;
                    case 74:
                        {
                        alt72=5;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4878:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )", 72, 0, input);

                        throw nvae;
                    }

                    switch (alt72) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4879:3: lv_op_4_1= '!'
                            {
                            lv_op_4_1=(Token)input.LT(1);
                            match(input,37,FOLLOW_37_in_ruleUnOp6827); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnOpAccess().getOpExclamationMarkKeyword_1_3_0_0(), "op"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getUnOpRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "op", lv_op_4_1, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4897:8: lv_op_4_2= '#'
                            {
                            lv_op_4_2=(Token)input.LT(1);
                            match(input,71,FOLLOW_71_in_ruleUnOp6856); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnOpAccess().getOpNumberSignKeyword_1_3_0_1(), "op"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getUnOpRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "op", lv_op_4_2, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4915:8: lv_op_4_3= '~'
                            {
                            lv_op_4_3=(Token)input.LT(1);
                            match(input,72,FOLLOW_72_in_ruleUnOp6885); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnOpAccess().getOpTildeKeyword_1_3_0_2(), "op"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getUnOpRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "op", lv_op_4_3, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4933:8: lv_op_4_4= '*'
                            {
                            lv_op_4_4=(Token)input.LT(1);
                            match(input,73,FOLLOW_73_in_ruleUnOp6914); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnOpAccess().getOpAsteriskKeyword_1_3_0_3(), "op"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getUnOpRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "op", lv_op_4_4, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4951:8: lv_op_4_5= '^'
                            {
                            lv_op_4_5=(Token)input.LT(1);
                            match(input,74,FOLLOW_74_in_ruleUnOp6943); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnOpAccess().getOpCircumflexAccentKeyword_1_3_0_4(), "op"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getUnOpRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "op", lv_op_4_5, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUnOp


    // $ANTLR start entryRuleCommonQuantUnOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4980:1: entryRuleCommonQuantUnOp returns [EObject current=null] : iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF ;
    public final EObject entryRuleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonQuantUnOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4981:2: (iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4982:2: iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommonQuantUnOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommonQuantUnOp_in_entryRuleCommonQuantUnOp6996);
            iv_ruleCommonQuantUnOp=ruleCommonQuantUnOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommonQuantUnOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonQuantUnOp7006); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCommonQuantUnOp


    // $ANTLR start ruleCommonQuantUnOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4989:1: ruleCommonQuantUnOp returns [EObject current=null] : ( () ( 'no' | 'some' | 'lone' | 'one' ) ) ;
    public final EObject ruleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4994:6: ( ( () ( 'no' | 'some' | 'lone' | 'one' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4995:1: ( () ( 'no' | 'some' | 'lone' | 'one' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4995:1: ( () ( 'no' | 'some' | 'lone' | 'one' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4995:2: () ( 'no' | 'some' | 'lone' | 'one' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4995:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4996:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getCommonQuantUnOpAccess().getCommonQuantUnOpAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getCommonQuantUnOpAccess().getCommonQuantUnOpAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5009:2: ( 'no' | 'some' | 'lone' | 'one' )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt74=1;
                }
                break;
            case 33:
                {
                alt74=2;
                }
                break;
            case 31:
                {
                alt74=3;
                }
                break;
            case 32:
                {
                alt74=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5009:2: ( 'no' | 'some' | 'lone' | 'one' )", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5009:4: 'no'
                    {
                    match(input,75,FOLLOW_75_in_ruleCommonQuantUnOp7054); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getNoKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5014:7: 'some'
                    {
                    match(input,33,FOLLOW_33_in_ruleCommonQuantUnOp7070); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getSomeKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5019:7: 'lone'
                    {
                    match(input,31,FOLLOW_31_in_ruleCommonQuantUnOp7086); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getLoneKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5024:7: 'one'
                    {
                    match(input,32,FOLLOW_32_in_ruleCommonQuantUnOp7102); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getOneKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCommonQuantUnOp


    // $ANTLR start entryRuleCompareOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5036:1: entryRuleCompareOp returns [String current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final String entryRuleCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5037:2: (iv_ruleCompareOp= ruleCompareOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5038:2: iv_ruleCompareOp= ruleCompareOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOp_in_entryRuleCompareOp7140);
            iv_ruleCompareOp=ruleCompareOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOp7151); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompareOp


    // $ANTLR start ruleCompareOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5045:1: ruleCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5050:6: ( (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5051:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5051:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            int alt75=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt75=1;
                }
                break;
            case 35:
                {
                alt75=2;
                }
                break;
            case 76:
                {
                alt75=3;
                }
                break;
            case 77:
                {
                alt75=4;
                }
                break;
            case 78:
                {
                alt75=5;
                }
                break;
            case 79:
                {
                alt75=6;
                }
                break;
            case 80:
                {
                alt75=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5051:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5052:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleCompareOp7189); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getEqualsSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5059:2: kw= 'in'
                    {
                    kw=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleCompareOp7208); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getInKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5066:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_ruleCompareOp7227); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getLessThanSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5073:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleCompareOp7246); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getGreaterThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5080:2: kw= '=<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleCompareOp7265); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getEqualsSignLessThanSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5087:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleCompareOp7284); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getLessThanSignEqualsSignKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5094:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleCompareOp7303); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getGreaterThanSignEqualsSignKeyword_6(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompareOp


    // $ANTLR start entryRuleArrowOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5107:1: entryRuleArrowOp returns [EObject current=null] : iv_ruleArrowOp= ruleArrowOp EOF ;
    public final EObject entryRuleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5108:2: (iv_ruleArrowOp= ruleArrowOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5109:2: iv_ruleArrowOp= ruleArrowOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrowOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArrowOp_in_entryRuleArrowOp7343);
            iv_ruleArrowOp=ruleArrowOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrowOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowOp7353); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleArrowOp


    // $ANTLR start ruleArrowOp
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5116:1: ruleArrowOp returns [EObject current=null] : ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) ) ;
    public final EObject ruleArrowOp() throws RecognitionException {
        EObject current = null;

        Token lv_arrow_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5121:6: ( ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5122:1: ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5122:1: ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5122:2: ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5122:2: ( 'some' | 'one' | 'lone' | 'set' )?
            int alt76=5;
            switch ( input.LA(1) ) {
                case 33:
                    {
                    alt76=1;
                    }
                    break;
                case 32:
                    {
                    alt76=2;
                    }
                    break;
                case 31:
                    {
                    alt76=3;
                    }
                    break;
                case 70:
                    {
                    alt76=4;
                    }
                    break;
            }

            switch (alt76) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5122:4: 'some'
                    {
                    match(input,33,FOLLOW_33_in_ruleArrowOp7389); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSomeKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5127:7: 'one'
                    {
                    match(input,32,FOLLOW_32_in_ruleArrowOp7405); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getOneKeyword_0_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5132:7: 'lone'
                    {
                    match(input,31,FOLLOW_31_in_ruleArrowOp7421); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getLoneKeyword_0_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5137:7: 'set'
                    {
                    match(input,70,FOLLOW_70_in_ruleArrowOp7437); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSetKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5141:3: ( (lv_arrow_4_0= '->' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5142:1: (lv_arrow_4_0= '->' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5142:1: (lv_arrow_4_0= '->' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5143:3: lv_arrow_4_0= '->'
            {
            lv_arrow_4_0=(Token)input.LT(1);
            match(input,81,FOLLOW_81_in_ruleArrowOp7457); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArrowOpAccess().getArrowHyphenMinusGreaterThanSignKeyword_1_0(), "arrow"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getArrowOpRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "arrow", lv_arrow_4_0, "->", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArrowOp


    // $ANTLR start entryRuleBlock
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5170:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5171:2: (iv_ruleBlock= ruleBlock EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5172:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock7506);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock7516); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5179:1: ruleBlock returns [EObject current=null] : ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_leftC_0_0 = null;

        EObject lv_expr_1_0 = null;

        EObject lv_rightC_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5184:6: ( ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5185:1: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5185:1: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5185:2: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5185:2: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5186:1: (lv_leftC_0_0= ruleLeftCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5186:1: (lv_leftC_0_0= ruleLeftCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5187:3: lv_leftC_0_0= ruleLeftCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getLeftCLeftCurlyBracketParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleBlock7562);
            lv_leftC_0_0=ruleLeftCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"leftC",
              	        		lv_leftC_0_0, 
              	        		"LeftCurlyBracket", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5209:2: ( (lv_expr_1_0= ruleExpression ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=RULE_INT && LA77_0<=RULE_NEGATIVE_INTEGER)||LA77_0==25||LA77_0==27||(LA77_0>=31 && LA77_0<=33)||(LA77_0>=37 && LA77_0<=38)||(LA77_0>=42 && LA77_0<=48)||(LA77_0>=50 && LA77_0<=51)||(LA77_0>=54 && LA77_0<=55)||(LA77_0>=70 && LA77_0<=75)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5210:1: (lv_expr_1_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5210:1: (lv_expr_1_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5211:3: lv_expr_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getExprExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBlock7583);
            	    lv_expr_1_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expr",
            	      	        		lv_expr_1_0, 
            	      	        		"Expression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5233:3: ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5234:1: (lv_rightC_2_0= ruleRightCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5234:1: (lv_rightC_2_0= ruleRightCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5235:3: lv_rightC_2_0= ruleRightCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getRightCRightCurlyBracketParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleBlock7605);
            lv_rightC_2_0=ruleRightCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"rightC",
              	        		lv_rightC_2_0, 
              	        		"RightCurlyBracket", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleBlockOrBar
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5265:1: entryRuleBlockOrBar returns [EObject current=null] : iv_ruleBlockOrBar= ruleBlockOrBar EOF ;
    public final EObject entryRuleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockOrBar = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5266:2: (iv_ruleBlockOrBar= ruleBlockOrBar EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5267:2: iv_ruleBlockOrBar= ruleBlockOrBar EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockOrBarRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar7641);
            iv_ruleBlockOrBar=ruleBlockOrBar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockOrBar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockOrBar7651); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlockOrBar


    // $ANTLR start ruleBlockOrBar
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5274:1: ruleBlockOrBar returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5279:6: ( ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5280:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5280:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==27) ) {
                alt78=1;
            }
            else if ( (LA78_0==82) ) {
                alt78=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5280:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5280:2: ( (lv_block_0_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5280:2: ( (lv_block_0_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5281:1: (lv_block_0_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5281:1: (lv_block_0_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5282:3: lv_block_0_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getBlockBlockParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleBlockOrBar7697);
                    lv_block_0_0=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBlockOrBarRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_0_0, 
                      	        		"Block", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5305:6: ( '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5305:6: ( '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5305:8: '|' ( (lv_expr_2_0= ruleExpression ) )
                    {
                    match(input,82,FOLLOW_82_in_ruleBlockOrBar7714); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockOrBarAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5309:1: ( (lv_expr_2_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5310:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5310:1: (lv_expr_2_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5311:3: lv_expr_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getExprExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBlockOrBar7735);
                    lv_expr_2_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBlockOrBarRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expr",
                      	        		lv_expr_2_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBlockOrBar


    // $ANTLR start entryRuleOpenName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5341:1: entryRuleOpenName returns [EObject current=null] : iv_ruleOpenName= ruleOpenName EOF ;
    public final EObject entryRuleOpenName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5342:2: (iv_ruleOpenName= ruleOpenName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5343:2: iv_ruleOpenName= ruleOpenName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOpenNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOpenName_in_entryRuleOpenName7772);
            iv_ruleOpenName=ruleOpenName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOpenName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenName7782); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOpenName


    // $ANTLR start ruleOpenName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5350:1: ruleOpenName returns [EObject current=null] : ( 'open' ( (lv_importedNamespace_1_0= ruleName ) ) ) ;
    public final EObject ruleOpenName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5355:6: ( ( 'open' ( (lv_importedNamespace_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5356:1: ( 'open' ( (lv_importedNamespace_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5356:1: ( 'open' ( (lv_importedNamespace_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5356:3: 'open' ( (lv_importedNamespace_1_0= ruleName ) )
            {
            match(input,83,FOLLOW_83_in_ruleOpenName7817); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOpenNameAccess().getOpenKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5360:1: ( (lv_importedNamespace_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5361:1: (lv_importedNamespace_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5361:1: (lv_importedNamespace_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5362:3: lv_importedNamespace_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOpenNameAccess().getImportedNamespaceNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleOpenName7838);
            lv_importedNamespace_1_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOpenNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importedNamespace",
              	        		lv_importedNamespace_1_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOpenName


    // $ANTLR start entryRuleFactName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5392:1: entryRuleFactName returns [EObject current=null] : iv_ruleFactName= ruleFactName EOF ;
    public final EObject entryRuleFactName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5393:2: (iv_ruleFactName= ruleFactName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5394:2: iv_ruleFactName= ruleFactName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactName_in_entryRuleFactName7874);
            iv_ruleFactName=ruleFactName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactName7884); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFactName


    // $ANTLR start ruleFactName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5401:1: ruleFactName returns [EObject current=null] : ( () 'fact' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleFactName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5406:6: ( ( () 'fact' ( (lv_name_2_0= ruleName ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5407:1: ( () 'fact' ( (lv_name_2_0= ruleName ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5407:1: ( () 'fact' ( (lv_name_2_0= ruleName ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5407:2: () 'fact' ( (lv_name_2_0= ruleName ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5407:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5408:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getFactNameAccess().getFactNameAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getFactNameAccess().getFactNameAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,84,FOLLOW_84_in_ruleFactName7931); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFactNameAccess().getFactKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5425:1: ( (lv_name_2_0= ruleName ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||LA79_0==51) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5426:1: (lv_name_2_0= ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5426:1: (lv_name_2_0= ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5427:3: lv_name_2_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFactNameAccess().getNameNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleFactName7952);
                    lv_name_2_0=ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFactNameRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_2_0, 
                      	        		"Name", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFactName


    // $ANTLR start entryRuleAssertionName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5457:1: entryRuleAssertionName returns [EObject current=null] : iv_ruleAssertionName= ruleAssertionName EOF ;
    public final EObject entryRuleAssertionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5458:2: (iv_ruleAssertionName= ruleAssertionName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5459:2: iv_ruleAssertionName= ruleAssertionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertionName_in_entryRuleAssertionName7989);
            iv_ruleAssertionName=ruleAssertionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertionName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionName7999); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssertionName


    // $ANTLR start ruleAssertionName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5466:1: ruleAssertionName returns [EObject current=null] : ( () 'assert' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleAssertionName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5471:6: ( ( () 'assert' ( (lv_name_2_0= ruleName ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5472:1: ( () 'assert' ( (lv_name_2_0= ruleName ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5472:1: ( () 'assert' ( (lv_name_2_0= ruleName ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5472:2: () 'assert' ( (lv_name_2_0= ruleName ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5472:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5473:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getAssertionNameAccess().getAssertionNameAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getAssertionNameAccess().getAssertionNameAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,85,FOLLOW_85_in_ruleAssertionName8046); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssertionNameAccess().getAssertKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5490:1: ( (lv_name_2_0= ruleName ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID||LA80_0==51) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5491:1: (lv_name_2_0= ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5491:1: (lv_name_2_0= ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5492:3: lv_name_2_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssertionNameAccess().getNameNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleAssertionName8067);
                    lv_name_2_0=ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssertionNameRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_2_0, 
                      	        		"Name", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssertionName


    // $ANTLR start entryRuleFunctionName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5522:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5523:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5524:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName8104);
            iv_ruleFunctionName=ruleFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunctionName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName8114); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionName


    // $ANTLR start ruleFunctionName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5531:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5536:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5537:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5537:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5538:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5538:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5539:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunctionNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleFunctionName8159);
            lv_name_0_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunctionNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionName


    // $ANTLR start entryRulePredicateName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5569:1: entryRulePredicateName returns [EObject current=null] : iv_rulePredicateName= rulePredicateName EOF ;
    public final EObject entryRulePredicateName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5570:2: (iv_rulePredicateName= rulePredicateName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5571:2: iv_rulePredicateName= rulePredicateName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredicateNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredicateName_in_entryRulePredicateName8194);
            iv_rulePredicateName=rulePredicateName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredicateName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateName8204); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePredicateName


    // $ANTLR start rulePredicateName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5578:1: rulePredicateName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePredicateName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5583:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5584:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5584:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5585:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5585:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5586:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredicateNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePredicateName8249);
            lv_name_0_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPredicateNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePredicateName


    // $ANTLR start entryRuleAlias
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5616:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5617:2: (iv_ruleAlias= ruleAlias EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5618:2: iv_ruleAlias= ruleAlias EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAliasRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias8284);
            iv_ruleAlias=ruleAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias8294); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAlias


    // $ANTLR start ruleAlias
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5625:1: ruleAlias returns [EObject current=null] : ( (lv_name_0_0= ruleNameAlias ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5630:6: ( ( (lv_name_0_0= ruleNameAlias ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5631:1: ( (lv_name_0_0= ruleNameAlias ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5631:1: ( (lv_name_0_0= ruleNameAlias ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5632:1: (lv_name_0_0= ruleNameAlias )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5632:1: (lv_name_0_0= ruleNameAlias )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5633:3: lv_name_0_0= ruleNameAlias
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAliasAccess().getNameNameAliasParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNameAlias_in_ruleAlias8339);
            lv_name_0_0=ruleNameAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAliasRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"NameAlias", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAlias


    // $ANTLR start entryRuleEnumName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5663:1: entryRuleEnumName returns [EObject current=null] : iv_ruleEnumName= ruleEnumName EOF ;
    public final EObject entryRuleEnumName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5664:2: (iv_ruleEnumName= ruleEnumName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5665:2: iv_ruleEnumName= ruleEnumName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumName_in_entryRuleEnumName8374);
            iv_ruleEnumName=ruleEnumName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumName8384); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumName


    // $ANTLR start ruleEnumName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5672:1: ruleEnumName returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleEnumName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5677:6: ( ( 'enum' ( (lv_name_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5678:1: ( 'enum' ( (lv_name_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5678:1: ( 'enum' ( (lv_name_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5678:3: 'enum' ( (lv_name_1_0= ruleName ) )
            {
            match(input,86,FOLLOW_86_in_ruleEnumName8419); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumNameAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5682:1: ( (lv_name_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5683:1: (lv_name_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5683:1: (lv_name_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5684:3: lv_name_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumNameAccess().getNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumName8440);
            lv_name_1_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumName


    // $ANTLR start entryRuleEnumPropertyName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5714:1: entryRuleEnumPropertyName returns [EObject current=null] : iv_ruleEnumPropertyName= ruleEnumPropertyName EOF ;
    public final EObject entryRuleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumPropertyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5715:2: (iv_ruleEnumPropertyName= ruleEnumPropertyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5716:2: iv_ruleEnumPropertyName= ruleEnumPropertyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumPropertyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumPropertyName_in_entryRuleEnumPropertyName8476);
            iv_ruleEnumPropertyName=ruleEnumPropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumPropertyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumPropertyName8486); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumPropertyName


    // $ANTLR start ruleEnumPropertyName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5723:1: ruleEnumPropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5728:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5729:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5729:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5730:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5730:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5731:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumPropertyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumPropertyName8531);
            lv_name_0_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumPropertyNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumPropertyName


    // $ANTLR start entryRuleSignatureName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5761:1: entryRuleSignatureName returns [EObject current=null] : iv_ruleSignatureName= ruleSignatureName EOF ;
    public final EObject entryRuleSignatureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignatureName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5762:2: (iv_ruleSignatureName= ruleSignatureName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5763:2: iv_ruleSignatureName= ruleSignatureName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignatureNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignatureName_in_entryRuleSignatureName8566);
            iv_ruleSignatureName=ruleSignatureName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignatureName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignatureName8576); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignatureName


    // $ANTLR start ruleSignatureName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5770:1: ruleSignatureName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleSignatureName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5775:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5776:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5776:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5777:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5777:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5778:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignatureNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleSignatureName8621);
            lv_name_0_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSignatureNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSignatureName


    // $ANTLR start entryRulePropertyName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5808:1: entryRulePropertyName returns [EObject current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final EObject entryRulePropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5809:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5810:2: iv_rulePropertyName= rulePropertyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName8656);
            iv_rulePropertyName=rulePropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName8666); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePropertyName


    // $ANTLR start rulePropertyName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5817:1: rulePropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePropertyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5822:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5823:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5823:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5824:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5824:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5825:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePropertyName8711);
            lv_name_0_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPropertyNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePropertyName


    // $ANTLR start entryRuleExactlyName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5855:1: entryRuleExactlyName returns [EObject current=null] : iv_ruleExactlyName= ruleExactlyName EOF ;
    public final EObject entryRuleExactlyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactlyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5856:2: (iv_ruleExactlyName= ruleExactlyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5857:2: iv_ruleExactlyName= ruleExactlyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExactlyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExactlyName_in_entryRuleExactlyName8746);
            iv_ruleExactlyName=ruleExactlyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExactlyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExactlyName8756); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExactlyName


    // $ANTLR start ruleExactlyName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5864:1: ruleExactlyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleExactlyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5869:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5870:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5870:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5871:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5871:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5872:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExactlyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleExactlyName8801);
            lv_name_0_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExactlyNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExactlyName


    // $ANTLR start entryRuleNameAlias
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5902:1: entryRuleNameAlias returns [String current=null] : iv_ruleNameAlias= ruleNameAlias EOF ;
    public final String entryRuleNameAlias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameAlias = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5903:2: (iv_ruleNameAlias= ruleNameAlias EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5904:2: iv_ruleNameAlias= ruleNameAlias EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameAliasRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNameAlias_in_entryRuleNameAlias8837);
            iv_ruleNameAlias=ruleNameAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNameAlias.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameAlias8848); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNameAlias


    // $ANTLR start ruleNameAlias
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5911:1: ruleNameAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNameAlias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5916:6: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5917:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5917:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5917:6: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameAlias8888); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5924:1: (kw= '/' this_ID_2= RULE_ID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==87) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5925:2: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,87,FOLLOW_87_in_ruleNameAlias8907); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getNameAliasAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameAlias8922); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNameAlias


    // $ANTLR start entryRuleName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5945:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5946:2: (iv_ruleName= ruleName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5947:2: iv_ruleName= ruleName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName8970);
            iv_ruleName=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName8981); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleName


    // $ANTLR start ruleName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5954:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5959:6: ( ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5960:1: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5960:1: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5960:2: (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5960:2: (kw= 'this' | this_ID_1= RULE_ID )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==51) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_ID) ) {
                alt82=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5960:2: (kw= 'this' | this_ID_1= RULE_ID )", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5961:2: kw= 'this'
                    {
                    kw=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleName9020); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNameAccess().getThisKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5967:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName9041); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNameAccess().getIDTerminalRuleCall_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5974:2: (kw= '/' this_ID_3= RULE_ID )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==87) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5975:2: kw= '/' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,87,FOLLOW_87_in_ruleName9061); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getNameAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_3=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName9076); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleName


    // $ANTLR start entryRuleReferencesSig
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5997:1: entryRuleReferencesSig returns [EObject current=null] : iv_ruleReferencesSig= ruleReferencesSig EOF ;
    public final EObject entryRuleReferencesSig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesSig = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5998:2: (iv_ruleReferencesSig= ruleReferencesSig EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5999:2: iv_ruleReferencesSig= ruleReferencesSig EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferencesSigRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReferencesSig_in_entryRuleReferencesSig9125);
            iv_ruleReferencesSig=ruleReferencesSig();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReferencesSig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencesSig9135); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReferencesSig


    // $ANTLR start ruleReferencesSig
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6006:1: ruleReferencesSig returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) ;
    public final EObject ruleReferencesSig() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6011:6: ( ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6012:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6012:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6012:2: () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6012:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6013:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getReferencesSigAccess().getReferencesSigAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getReferencesSigAccess().getReferencesSigAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6026:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            int alt84=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt84=1;
                }
                break;
            case 45:
                {
                alt84=2;
                }
                break;
            case 46:
                {
                alt84=3;
                }
                break;
            case 47:
                {
                alt84=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6026:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6026:3: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6026:3: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6027:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6027:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6028:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getReferencesSigRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferencesSig9195); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getReferencesSigAccess().getNameRefSignatureNameCrossReference_1_0_0(), "nameRef"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6044:7: 'univ'
                    {
                    match(input,45,FOLLOW_45_in_ruleReferencesSig9211); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getUnivKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6049:7: 'Int'
                    {
                    match(input,46,FOLLOW_46_in_ruleReferencesSig9227); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getIntKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6054:7: 'seq/Int'
                    {
                    match(input,47,FOLLOW_47_in_ruleReferencesSig9243); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getSeqIntKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReferencesSig


    // $ANTLR start entryRuleRef
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6066:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6067:2: (iv_ruleRef= ruleRef EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6068:2: iv_ruleRef= ruleRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef9280);
            iv_ruleRef=ruleRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef9290); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRef


    // $ANTLR start ruleRef
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6075:1: ruleRef returns [EObject current=null] : ( () ( ( ( ruleName ) ) | 'univ' | 'Int' | 'seq/Int' ) ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6080:6: ( ( () ( ( ( ruleName ) ) | 'univ' | 'Int' | 'seq/Int' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6081:1: ( () ( ( ( ruleName ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6081:1: ( () ( ( ( ruleName ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6081:2: () ( ( ( ruleName ) ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6081:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6082:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getRefAccess().getRefAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getRefAccess().getRefAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6095:2: ( ( ( ruleName ) ) | 'univ' | 'Int' | 'seq/Int' )
            int alt85=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 51:
                {
                alt85=1;
                }
                break;
            case 45:
                {
                alt85=2;
                }
                break;
            case 46:
                {
                alt85=3;
                }
                break;
            case 47:
                {
                alt85=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6095:2: ( ( ( ruleName ) ) | 'univ' | 'Int' | 'seq/Int' )", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6095:3: ( ( ruleName ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6095:3: ( ( ruleName ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6096:1: ( ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6096:1: ( ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6097:3: ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRefAccess().getNameRefReferencesNameCrossReference_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleRef9355);
                    ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6115:7: 'univ'
                    {
                    match(input,45,FOLLOW_45_in_ruleRef9371); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getUnivKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6120:7: 'Int'
                    {
                    match(input,46,FOLLOW_46_in_ruleRef9387); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getIntKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6125:7: 'seq/Int'
                    {
                    match(input,47,FOLLOW_47_in_ruleRef9403); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getSeqIntKeyword_1_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRef


    // $ANTLR start entryRuleLeftCurlyBracket
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6137:1: entryRuleLeftCurlyBracket returns [EObject current=null] : iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF ;
    public final EObject entryRuleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftCurlyBracket = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6138:2: (iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6139:2: iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftCurlyBracketRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_entryRuleLeftCurlyBracket9440);
            iv_ruleLeftCurlyBracket=ruleLeftCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftCurlyBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftCurlyBracket9450); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLeftCurlyBracket


    // $ANTLR start ruleLeftCurlyBracket
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6146:1: ruleLeftCurlyBracket returns [EObject current=null] : ( (lv_leftCurlyBracket_0_0= '{' ) ) ;
    public final EObject ruleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_leftCurlyBracket_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6151:6: ( ( (lv_leftCurlyBracket_0_0= '{' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6152:1: ( (lv_leftCurlyBracket_0_0= '{' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6152:1: ( (lv_leftCurlyBracket_0_0= '{' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6153:1: (lv_leftCurlyBracket_0_0= '{' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6153:1: (lv_leftCurlyBracket_0_0= '{' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6154:3: lv_leftCurlyBracket_0_0= '{'
            {
            lv_leftCurlyBracket_0_0=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleLeftCurlyBracket9492); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLeftCurlyBracketAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0(), "leftCurlyBracket"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLeftCurlyBracketRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "leftCurlyBracket", lv_leftCurlyBracket_0_0, "{", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLeftCurlyBracket


    // $ANTLR start entryRuleRightCurlyBracket
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6181:1: entryRuleRightCurlyBracket returns [EObject current=null] : iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF ;
    public final EObject entryRuleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightCurlyBracket = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6182:2: (iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6183:2: iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightCurlyBracketRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_entryRuleRightCurlyBracket9540);
            iv_ruleRightCurlyBracket=ruleRightCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightCurlyBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightCurlyBracket9550); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRightCurlyBracket


    // $ANTLR start ruleRightCurlyBracket
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6190:1: ruleRightCurlyBracket returns [EObject current=null] : ( (lv_rightCurlyBracket_0_0= '}' ) ) ;
    public final EObject ruleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_rightCurlyBracket_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6195:6: ( ( (lv_rightCurlyBracket_0_0= '}' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6196:1: ( (lv_rightCurlyBracket_0_0= '}' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6196:1: ( (lv_rightCurlyBracket_0_0= '}' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6197:1: (lv_rightCurlyBracket_0_0= '}' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6197:1: (lv_rightCurlyBracket_0_0= '}' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6198:3: lv_rightCurlyBracket_0_0= '}'
            {
            lv_rightCurlyBracket_0_0=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_ruleRightCurlyBracket9592); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRightCurlyBracketAccess().getRightCurlyBracketRightCurlyBracketKeyword_0(), "rightCurlyBracket"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRightCurlyBracketRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "rightCurlyBracket", lv_rightCurlyBracket_0_0, "}", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRightCurlyBracket


    // $ANTLR start entryRuleDot
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6225:1: entryRuleDot returns [EObject current=null] : iv_ruleDot= ruleDot EOF ;
    public final EObject entryRuleDot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDot = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6226:2: (iv_ruleDot= ruleDot EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6227:2: iv_ruleDot= ruleDot EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDotRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDot_in_entryRuleDot9640);
            iv_ruleDot=ruleDot();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDot9650); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDot


    // $ANTLR start ruleDot
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6234:1: ruleDot returns [EObject current=null] : ( (lv_dot_0_0= '.' ) ) ;
    public final EObject ruleDot() throws RecognitionException {
        EObject current = null;

        Token lv_dot_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6239:6: ( ( (lv_dot_0_0= '.' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6240:1: ( (lv_dot_0_0= '.' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6240:1: ( (lv_dot_0_0= '.' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6241:1: (lv_dot_0_0= '.' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6241:1: (lv_dot_0_0= '.' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6242:3: lv_dot_0_0= '.'
            {
            lv_dot_0_0=(Token)input.LT(1);
            match(input,88,FOLLOW_88_in_ruleDot9692); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDotAccess().getDotFullStopKeyword_0(), "dot"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDotRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "dot", lv_dot_0_0, ".", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDot


    // $ANTLR start entryRuleComma
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6269:1: entryRuleComma returns [EObject current=null] : iv_ruleComma= ruleComma EOF ;
    public final EObject entryRuleComma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComma = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6270:2: (iv_ruleComma= ruleComma EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6271:2: iv_ruleComma= ruleComma EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommaRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleComma_in_entryRuleComma9740);
            iv_ruleComma=ruleComma();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComma; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComma9750); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComma


    // $ANTLR start ruleComma
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6278:1: ruleComma returns [EObject current=null] : ( (lv_comma_0_0= ',' ) ) ;
    public final EObject ruleComma() throws RecognitionException {
        EObject current = null;

        Token lv_comma_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6283:6: ( ( (lv_comma_0_0= ',' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6284:1: ( (lv_comma_0_0= ',' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6284:1: ( (lv_comma_0_0= ',' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6285:1: (lv_comma_0_0= ',' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6285:1: (lv_comma_0_0= ',' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6286:3: lv_comma_0_0= ','
            {
            lv_comma_0_0=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleComma9792); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCommaAccess().getCommaCommaKeyword_0(), "comma"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCommaRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "comma", lv_comma_0_0, ",", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComma


    // $ANTLR start entryRuleColon
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6313:1: entryRuleColon returns [EObject current=null] : iv_ruleColon= ruleColon EOF ;
    public final EObject entryRuleColon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColon = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6314:2: (iv_ruleColon= ruleColon EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6315:2: iv_ruleColon= ruleColon EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getColonRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleColon_in_entryRuleColon9840);
            iv_ruleColon=ruleColon();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleColon; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColon9850); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleColon


    // $ANTLR start ruleColon
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6322:1: ruleColon returns [EObject current=null] : ( (lv_colon_0_0= ':' ) ) ;
    public final EObject ruleColon() throws RecognitionException {
        EObject current = null;

        Token lv_colon_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6327:6: ( ( (lv_colon_0_0= ':' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6328:1: ( (lv_colon_0_0= ':' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6328:1: ( (lv_colon_0_0= ':' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6329:1: (lv_colon_0_0= ':' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6329:1: (lv_colon_0_0= ':' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6330:3: lv_colon_0_0= ':'
            {
            lv_colon_0_0=(Token)input.LT(1);
            match(input,18,FOLLOW_18_in_ruleColon9892); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getColonAccess().getColonColonKeyword_0(), "colon"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getColonRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "colon", lv_colon_0_0, ":", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleColon


    // $ANTLR start entryRuleLeftParenthesis
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6357:1: entryRuleLeftParenthesis returns [EObject current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final EObject entryRuleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftParenthesis = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6358:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6359:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftParenthesisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis9940);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftParenthesis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis9950); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLeftParenthesis


    // $ANTLR start ruleLeftParenthesis
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6366:1: ruleLeftParenthesis returns [EObject current=null] : ( (lv_leftParenthesis_0_0= '(' ) ) ;
    public final EObject ruleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_leftParenthesis_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6371:6: ( ( (lv_leftParenthesis_0_0= '(' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6372:1: ( (lv_leftParenthesis_0_0= '(' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6372:1: ( (lv_leftParenthesis_0_0= '(' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6373:1: (lv_leftParenthesis_0_0= '(' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6373:1: (lv_leftParenthesis_0_0= '(' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6374:3: lv_leftParenthesis_0_0= '('
            {
            lv_leftParenthesis_0_0=(Token)input.LT(1);
            match(input,48,FOLLOW_48_in_ruleLeftParenthesis9992); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLeftParenthesisAccess().getLeftParenthesisLeftParenthesisKeyword_0(), "leftParenthesis"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLeftParenthesisRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "leftParenthesis", lv_leftParenthesis_0_0, "(", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLeftParenthesis


    // $ANTLR start entryRuleRightParenthesis
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6401:1: entryRuleRightParenthesis returns [EObject current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final EObject entryRuleRightParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightParenthesis = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6402:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6403:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightParenthesisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis10040);
            iv_ruleRightParenthesis=ruleRightParenthesis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightParenthesis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis10050); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRightParenthesis


    // $ANTLR start ruleRightParenthesis
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6410:1: ruleRightParenthesis returns [EObject current=null] : ( (lv_rightParenthesis_0_0= ')' ) ) ;
    public final EObject ruleRightParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_rightParenthesis_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6415:6: ( ( (lv_rightParenthesis_0_0= ')' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6416:1: ( (lv_rightParenthesis_0_0= ')' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6416:1: ( (lv_rightParenthesis_0_0= ')' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6417:1: (lv_rightParenthesis_0_0= ')' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6417:1: (lv_rightParenthesis_0_0= ')' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6418:3: lv_rightParenthesis_0_0= ')'
            {
            lv_rightParenthesis_0_0=(Token)input.LT(1);
            match(input,49,FOLLOW_49_in_ruleRightParenthesis10092); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRightParenthesisAccess().getRightParenthesisRightParenthesisKeyword_0(), "rightParenthesis"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRightParenthesisRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "rightParenthesis", lv_rightParenthesis_0_0, ")", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRightParenthesis


    // $ANTLR start entryRuleLeftSquareBracketKeyword
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6445:1: entryRuleLeftSquareBracketKeyword returns [EObject current=null] : iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF ;
    public final EObject entryRuleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSquareBracketKeyword = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6446:2: (iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6447:2: iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftSquareBracketKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_entryRuleLeftSquareBracketKeyword10140);
            iv_ruleLeftSquareBracketKeyword=ruleLeftSquareBracketKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftSquareBracketKeyword10150); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLeftSquareBracketKeyword


    // $ANTLR start ruleLeftSquareBracketKeyword
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6454:1: ruleLeftSquareBracketKeyword returns [EObject current=null] : ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) ;
    public final EObject ruleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_leftSquareBracketKeyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6459:6: ( ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6460:1: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6460:1: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6461:1: (lv_leftSquareBracketKeyword_0_0= '[' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6461:1: (lv_leftSquareBracketKeyword_0_0= '[' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6462:3: lv_leftSquareBracketKeyword_0_0= '['
            {
            lv_leftSquareBracketKeyword_0_0=(Token)input.LT(1);
            match(input,89,FOLLOW_89_in_ruleLeftSquareBracketKeyword10192); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLeftSquareBracketKeywordAccess().getLeftSquareBracketKeywordLeftSquareBracketKeyword_0(), "leftSquareBracketKeyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLeftSquareBracketKeywordRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "leftSquareBracketKeyword", lv_leftSquareBracketKeyword_0_0, "[", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLeftSquareBracketKeyword


    // $ANTLR start entryRuleRightSquareBracketKeyword
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6489:1: entryRuleRightSquareBracketKeyword returns [EObject current=null] : iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF ;
    public final EObject entryRuleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSquareBracketKeyword = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6490:2: (iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6491:2: iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightSquareBracketKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_entryRuleRightSquareBracketKeyword10240);
            iv_ruleRightSquareBracketKeyword=ruleRightSquareBracketKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightSquareBracketKeyword10250); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRightSquareBracketKeyword


    // $ANTLR start ruleRightSquareBracketKeyword
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6498:1: ruleRightSquareBracketKeyword returns [EObject current=null] : ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) ;
    public final EObject ruleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_rightSquareBracketKeyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6503:6: ( ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6504:1: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6504:1: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6505:1: (lv_rightSquareBracketKeyword_0_0= ']' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6505:1: (lv_rightSquareBracketKeyword_0_0= ']' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6506:3: lv_rightSquareBracketKeyword_0_0= ']'
            {
            lv_rightSquareBracketKeyword_0_0=(Token)input.LT(1);
            match(input,90,FOLLOW_90_in_ruleRightSquareBracketKeyword10292); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRightSquareBracketKeywordAccess().getRightSquareBracketKeywordRightSquareBracketKeyword_0(), "rightSquareBracketKeyword"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRightSquareBracketKeywordRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "rightSquareBracketKeyword", lv_rightSquareBracketKeyword_0_0, "]", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRightSquareBracketKeyword

    // $ANTLR start synpred69
    public final void synpred69_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:2: ( ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:2: ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:2: ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:3: ( ( ruleBinOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3034:3: ( ( ruleBinOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3035:1: ( ruleBinOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3035:1: ( ruleBinOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3036:3: ruleBinOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBinOp_in_synpred694287);
        ruleBinOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3058:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3059:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3059:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3060:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred694308);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred69

    // $ANTLR start synpred70
    public final void synpred70_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:6: ( ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:6: ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:6: ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:7: ( ( ruleArrowOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3083:7: ( ( ruleArrowOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3084:1: ( ruleArrowOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3084:1: ( ruleArrowOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3085:3: ruleArrowOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleArrowOp_in_synpred704337);
        ruleArrowOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3107:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3108:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3108:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3109:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred704358);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred70

    // $ANTLR start synpred73
    public final void synpred73_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:6: ( ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:6: ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:6: ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:7: ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3132:7: ( '!' | 'not' )?
        int alt109=2;
        int LA109_0 = input.LA(1);

        if ( ((LA109_0>=37 && LA109_0<=38)) ) {
            alt109=1;
        }
        switch (alt109) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:
                {
                if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred734375);    throw mse;
                }


                }
                break;

        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3141:3: ( ( ruleCompareOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3142:1: ( ruleCompareOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3142:1: ( ruleCompareOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3143:3: ruleCompareOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareOp_in_synpred734416);
        ruleCompareOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3165:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3166:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3166:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3167:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred734437);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred73

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:4: ( 'else' ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:4: 'else' ( ( ruleExpression ) )
        {
        match(input,41,FOLLOW_41_in_synpred754505); if (failed) return ;
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3227:1: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3228:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3228:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3229:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred754526);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred76
    public final void synpred76_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:6: ( ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:6: ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:6: ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3190:7: ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )?
        {
        if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred764454);    throw mse;
        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3199:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3200:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3200:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3201:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred764494);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:2: ( 'else' ( ( ruleExpression ) ) )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( (LA110_0==41) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:4: 'else' ( ( ruleExpression ) )
                {
                match(input,41,FOLLOW_41_in_synpred764505); if (failed) return ;
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3227:1: ( ( ruleExpression ) )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3228:1: ( ruleExpression )
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3228:1: ( ruleExpression )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3229:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred764526);
                ruleExpression();
                _fsp--;
                if (failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred76

    // $ANTLR start synpred79
    public final void synpred79_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:6: ( ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:6: ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:6: ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:7: ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3252:7: ( ( ruleLeftSquareBracketKeyword ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3253:1: ( ruleLeftSquareBracketKeyword )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3253:1: ( ruleLeftSquareBracketKeyword )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3254:3: ruleLeftSquareBracketKeyword
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_4_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_synpred794557);
        ruleLeftSquareBracketKeyword();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3276:2: ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )?
        int alt113=2;
        int LA113_0 = input.LA(1);

        if ( ((LA113_0>=RULE_INT && LA113_0<=RULE_NEGATIVE_INTEGER)||LA113_0==25||LA113_0==27||(LA113_0>=31 && LA113_0<=33)||(LA113_0>=37 && LA113_0<=38)||(LA113_0>=42 && LA113_0<=48)||(LA113_0>=50 && LA113_0<=51)||(LA113_0>=54 && LA113_0<=55)||(LA113_0>=70 && LA113_0<=75)) ) {
            alt113=1;
        }
        switch (alt113) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3276:3: ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )*
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3276:3: ( ( ruleExpression ) )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3277:1: ( ruleExpression )
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3277:1: ( ruleExpression )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3278:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred794579);
                ruleExpression();
                _fsp--;
                if (failed) return ;

                }


                }

                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3300:2: ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )*
                loop112:
                do {
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==28) ) {
                        alt112=1;
                    }


                    switch (alt112) {
                	case 1 :
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3300:3: ( ( ruleComma ) ) ( ( ruleExpression ) )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3300:3: ( ( ruleComma ) )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3301:1: ( ruleComma )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3301:1: ( ruleComma )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3302:3: ruleComma
                	    {
                	    if ( backtracking==0 ) {
                	       
                	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0(), currentNode); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleComma_in_synpred794601);
                	    ruleComma();
                	    _fsp--;
                	    if (failed) return ;

                	    }


                	    }

                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3324:2: ( ( ruleExpression ) )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3325:1: ( ruleExpression )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3325:1: ( ruleExpression )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3326:3: ruleExpression
                	    {
                	    if ( backtracking==0 ) {
                	       
                	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0(), currentNode); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred794622);
                	    ruleExpression();
                	    _fsp--;
                	    if (failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop112;
                    }
                } while (true);


                }
                break;

        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3348:6: ( ( ruleRightSquareBracketKeyword ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3349:1: ( ruleRightSquareBracketKeyword )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3349:1: ( ruleRightSquareBracketKeyword )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3350:3: ruleRightSquareBracketKeyword
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_synpred794647);
        ruleRightSquareBracketKeyword();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred79

    // $ANTLR start synpred86
    public final void synpred86_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:3: ( ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:3: ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:3: ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:4: ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3763:4: ( ( ruleDecl ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3764:1: ( ruleDecl )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3764:1: ( ruleDecl )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3765:3: ruleDecl
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleDecl_in_synpred865106);
        ruleDecl();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3787:2: ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )*
        loop116:
        do {
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==28) ) {
                alt116=1;
            }


            switch (alt116) {
        	case 1 :
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3787:3: ( ( ruleComma ) ) ( ( ruleDecl ) )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3787:3: ( ( ruleComma ) )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3788:1: ( ruleComma )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3788:1: ( ruleComma )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3789:3: ruleComma
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_3_2_0_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleComma_in_synpred865128);
        	    ruleComma();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3811:2: ( ( ruleDecl ) )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3812:1: ( ruleDecl )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3812:1: ( ruleDecl )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3813:3: ruleDecl
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleDecl_in_synpred865149);
        	    ruleDecl();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop116;
            }
        } while (true);

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3835:4: ( ( ruleBlockOrBar ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3836:1: ( ruleBlockOrBar )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3836:1: ( ruleBlockOrBar )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3837:3: ruleBlockOrBar
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_3_2_0_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBlockOrBar_in_synpred865172);
        ruleBlockOrBar();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred86

    public final boolean synpred70() {
        backtracking++;
        int start = input.mark();
        try {
            synpred70_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred69() {
        backtracking++;
        int start = input.mark();
        try {
            synpred69_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred75() {
        backtracking++;
        int start = input.mark();
        try {
            synpred75_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred86() {
        backtracking++;
        int start = input.mark();
        try {
            synpred86_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred73() {
        backtracking++;
        int start = input.mark();
        try {
            synpred73_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred79() {
        backtracking++;
        int start = input.mark();
        try {
            synpred79_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred76() {
        backtracking++;
        int start = input.mark();
        try {
            synpred76_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\5\2\uffff\1\16\2\uffff\1\22\4\uffff\1\5\1\23\1\22";
    static final String DFA12_maxS =
        "\1\126\2\uffff\1\41\2\uffff\1\127\4\uffff\1\5\1\24\1\127";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10\3\uffff";
    static final String DFA12_specialS =
        "\16\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\10\uffff\1\3\1\uffff\1\4\1\5\1\uffff\1\7\1\10\5\uffff\1"+
            "\12\3\uffff\4\12\62\uffff\1\1\1\2\1\11",
            "",
            "",
            "\1\12\1\uffff\1\4\1\5\10\uffff\1\12\3\uffff\4\12",
            "",
            "",
            "\1\14\104\uffff\1\13",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\7\1\10",
            "\1\14\104\uffff\1\13"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "605:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )";
        }
    }
    static final String DFA14_eotS =
        "\7\uffff";
    static final String DFA14_eofS =
        "\7\uffff";
    static final String DFA14_minS =
        "\1\5\2\22\1\uffff\1\5\1\uffff\1\22";
    static final String DFA14_maxS =
        "\1\63\2\131\1\uffff\1\5\1\uffff\1\131";
    static final String DFA14_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA14_specialS =
        "\7\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\47\uffff\3\3\3\uffff\1\1",
            "\1\5\35\uffff\1\5\46\uffff\1\4\1\3\1\5",
            "\1\5\35\uffff\1\5\46\uffff\1\4\1\3\1\5",
            "",
            "\1\6",
            "",
            "\1\5\35\uffff\1\5\46\uffff\1\4\1\3\1\5"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "881:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?";
        }
    }
    static final String DFA21_eotS =
        "\7\uffff";
    static final String DFA21_eofS =
        "\7\uffff";
    static final String DFA21_minS =
        "\1\5\2\33\1\uffff\1\5\1\uffff\1\33";
    static final String DFA21_maxS =
        "\1\63\2\131\1\uffff\1\5\1\uffff\1\131";
    static final String DFA21_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA21_specialS =
        "\7\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\47\uffff\3\3\3\uffff\1\1",
            "\1\5\24\uffff\1\5\46\uffff\1\4\1\3\1\5",
            "\1\5\24\uffff\1\5\46\uffff\1\4\1\3\1\5",
            "",
            "\1\6",
            "",
            "\1\5\24\uffff\1\5\46\uffff\1\4\1\3\1\5"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1297:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecification91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSpecification137 = new BitSet(new long[]{0x00000003C41B4022L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleOpen_in_ruleSpecification159 = new BitSet(new long[]{0x00000003C41B4022L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleSpecification181 = new BitSet(new long[]{0x00000003C41B4022L,0x0000000000700000L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModule263 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleModule284 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleModule306 = new BitSet(new long[]{0x0008000000002020L});
    public static final BitSet FOLLOW_13_in_ruleModule324 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleExactlyName_in_ruleModule359 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleModule381 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleModule399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleModule430 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleModule458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpen506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpen542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpenName_in_ruleOpen565 = new BitSet(new long[]{0x0000000000008002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleOpen587 = new BitSet(new long[]{0x0008E00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen608 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleOpen630 = new BitSet(new long[]{0x0008E00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen651 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleOpen674 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOpen687 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleExactlyName_in_ruleOpen708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_ruleParagraph806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_ruleParagraph836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_ruleParagraph866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_ruleParagraph896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_ruleParagraph926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_ruleParagraph956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleParagraph986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_ruleParagraph1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_entryRuleFactDecl1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactDecl1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_ruleFactDecl1107 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFactDecl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertDecl1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionName_in_ruleAssertDecl1220 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAssertDecl1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_entryRuleFunDecl1277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunDecl1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunDecl1323 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunDecl1335 = new BitSet(new long[]{0x0008E00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleFunDecl1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_ruleFunDecl1378 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunDecl1401 = new BitSet(new long[]{0x0001000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleFunDecl1424 = new BitSet(new long[]{0x0018000000004020L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1446 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleFunDecl1468 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1489 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleFunDecl1514 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleFunDecl1543 = new BitSet(new long[]{0x001A000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1565 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleFunDecl1587 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1608 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleFunDecl1633 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleFunDecl1657 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunDecl1678 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFunDecl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_entryRulePredDecl1735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredDecl1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePredDecl1781 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePredDecl1793 = new BitSet(new long[]{0x0008E00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_rulePredDecl1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_rulePredDecl1836 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rulePredicateName_in_rulePredDecl1859 = new BitSet(new long[]{0x0001000008000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_rulePredDecl1882 = new BitSet(new long[]{0x0018000000004020L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl1904 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_rulePredDecl1926 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl1947 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_rulePredDecl1972 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_rulePredDecl2001 = new BitSet(new long[]{0x001A000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2023 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_ruleComma_in_rulePredDecl2045 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2066 = new BitSet(new long[]{0x0002000010000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_rulePredDecl2091 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePredDecl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_entryRuleRunDecl2151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunDecl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleRunDecl2208 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRunDecl2218 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRunDecl2230 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRunDecl2253 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleRunDecl2280 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleRunDecl2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckDecl2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleCheckDecl2395 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCheckDecl2405 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCheckDecl2417 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckDecl2440 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCheckDecl2467 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleCheckDecl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_entryRuleScope2525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScope2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope2583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2592 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope2643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2652 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleScope2661 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2682 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleScope2704 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2725 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope2779 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2800 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleScope2822 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2843 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpectation_in_entryRuleExpectation2946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpectation2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleExpectation2991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpectation3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypescope_in_entryRuleTypescope3049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypescope3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypescope3107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTypescope3118 = new BitSet(new long[]{0x0000000003000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypescope3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTypescope3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTypescope3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_ruleEnumDecl3267 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleEnumDecl3288 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3309 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleEnumDecl3331 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3352 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleEnumDecl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_entryRuleSigDecl3411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigDecl3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_ruleSigDecl3472 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSigDecl3483 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleSigDecl3504 = new BitSet(new long[]{0x0000000C18000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleSigDecl3526 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleSigDecl3547 = new BitSet(new long[]{0x0000000C18000000L});
    public static final BitSet FOLLOW_ruleSigExt_in_ruleSigDecl3570 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSigDecl3581 = new BitSet(new long[]{0x0018000020004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl3603 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleSigDecl3622 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl3656 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29_in_ruleSigDecl3670 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSigDecl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_entryRuleSigQual3728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigQual3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSigQual3783 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_31_in_ruleSigQual3812 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_32_in_ruleSigQual3841 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_33_in_ruleSigQual3870 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_14_in_ruleSigQual3899 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_30_in_ruleSigQual3926 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_31_in_ruleSigQual3942 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_32_in_ruleSigQual3958 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_33_in_ruleSigQual3974 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_14_in_ruleSigQual3990 = new BitSet(new long[]{0x00000003C0004002L});
    public static final BitSet FOLLOW_ruleSigExt_in_entryRuleSigExt4028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExt4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSigExt4074 = new BitSet(new long[]{0x0000E00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSigExt4113 = new BitSet(new long[]{0x0000E00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4134 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleSigExt4145 = new BitSet(new long[]{0x0000E00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4166 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression4265 = new BitSet(new long[]{0xFF2001FB80000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_ruleBinOp_in_ruleExpression4287 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4308 = new BitSet(new long[]{0xFF2001FB80000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_ruleArrowOp_in_ruleExpression4337 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4358 = new BitSet(new long[]{0xFF2001FB80000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_37_in_ruleExpression4377 = new BitSet(new long[]{0x0020000800000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_38_in_ruleExpression4393 = new BitSet(new long[]{0x0020000800000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_ruleCompareOp_in_ruleExpression4416 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4437 = new BitSet(new long[]{0xFF2001FB80000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_39_in_ruleExpression4456 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_40_in_ruleExpression4472 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4494 = new BitSet(new long[]{0xFF2003FB80000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_41_in_ruleExpression4505 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4526 = new BitSet(new long[]{0xFF2001FB80000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleExpression4557 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000004000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4579 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleExpression4601 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4622 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleExpression4647 = new BitSet(new long[]{0xFF2001FB80000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTerminalExpression4752 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpression4786 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression4808 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpression4829 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuant_in_ruleTerminalExpression4893 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression4914 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression4936 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression4957 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOp_in_ruleTerminalExpression5021 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonQuantUnOp_in_ruleTerminalExpression5083 = new BitSet(new long[]{0x00DDFC638A004070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5106 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5128 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5149 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATIVE_INTEGER_in_ruleTerminalExpression5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTerminalExpression5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTerminalExpression5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTerminalExpression5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTerminalExpression5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTerminalExpression5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTerminalExpression5550 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5584 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTerminalExpression5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTerminalExpression5646 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTerminalExpression5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleTerminalExpression5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleTerminalExpression5770 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5791 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5813 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5834 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5857 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleTerminalExpression5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl5915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDecl5961 = new BitSet(new long[]{0x0018000000000020L});
    public static final BitSet FOLLOW_52_in_ruleDecl5974 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleDecl5997 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleDecl6019 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleDecl6040 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleDecl6063 = new BitSet(new long[]{0x00DDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_52_in_ruleDecl6074 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDecl6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDecl_in_entryRuleLetDecl6133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDecl6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleLetDecl6189 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleLetDecl6199 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetDecl6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuant_in_entryRuleQuant6257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuant6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleQuant6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQuant6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_entryRuleBinOp6365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinOp6375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBinOp6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBinOp6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBinOp6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBinOp6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBinOp6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBinOp6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBinOp6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBinOp6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBinOp6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleBinOp6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBinOp6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBinOp6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_ruleBinOp6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBinOp6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBinOp6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBinOp6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOp_in_entryRuleUnOp6711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOp6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUnOp6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleUnOp6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnOp6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUnOp6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleUnOp6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleUnOp6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUnOp6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleUnOp6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonQuantUnOp_in_entryRuleCommonQuantUnOp6996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonQuantUnOp7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCommonQuantUnOp7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCommonQuantUnOp7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCommonQuantUnOp7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCommonQuantUnOp7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOp_in_entryRuleCompareOp7140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOp7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCompareOp7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCompareOp7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCompareOp7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCompareOp7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleCompareOp7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleCompareOp7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleCompareOp7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_entryRuleArrowOp7343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowOp7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleArrowOp7389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_32_in_ruleArrowOp7405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_31_in_ruleArrowOp7421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_70_in_ruleArrowOp7437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleArrowOp7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock7506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleBlock7562 = new BitSet(new long[]{0x00CDFC63AA000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlock7583 = new BitSet(new long[]{0x00CDFC63AA000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleBlock7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar7641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOrBar7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockOrBar7697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleBlockOrBar7714 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlockOrBar7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenName_in_entryRuleOpenName7772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenName7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOpenName7817 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleOpenName7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_entryRuleFactName7874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactName7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFactName7931 = new BitSet(new long[]{0x0008000000000022L});
    public static final BitSet FOLLOW_ruleName_in_ruleFactName7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionName_in_entryRuleAssertionName7989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionName7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAssertionName8046 = new BitSet(new long[]{0x0008000000000022L});
    public static final BitSet FOLLOW_ruleName_in_ruleAssertionName8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName8104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleFunctionName8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateName_in_entryRulePredicateName8194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateName8204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePredicateName8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias8284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameAlias_in_ruleAlias8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_entryRuleEnumName8374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumName8384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleEnumName8419 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumName8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_entryRuleEnumPropertyName8476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumPropertyName8486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumPropertyName8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignatureName_in_entryRuleSignatureName8566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignatureName8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleSignatureName8621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName8656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyName8711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExactlyName_in_entryRuleExactlyName8746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExactlyName8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleExactlyName8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameAlias_in_entryRuleNameAlias8837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameAlias8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameAlias8888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleNameAlias8907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameAlias8922 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName8970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleName9020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName9041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleName9061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName9076 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_entryRuleReferencesSig9125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencesSig9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferencesSig9195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReferencesSig9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReferencesSig9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReferencesSig9243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef9280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef9290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleRef9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRef9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRef9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRef9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_entryRuleLeftCurlyBracket9440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftCurlyBracket9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLeftCurlyBracket9492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_entryRuleRightCurlyBracket9540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightCurlyBracket9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRightCurlyBracket9592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_entryRuleDot9640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDot9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDot9692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_entryRuleComma9740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComma9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComma9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_entryRuleColon9840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColon9850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleColon9892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis9940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLeftParenthesis9992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis10040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis10050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRightParenthesis10092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_entryRuleLeftSquareBracketKeyword10140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftSquareBracketKeyword10150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLeftSquareBracketKeyword10192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_entryRuleRightSquareBracketKeyword10240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightSquareBracketKeyword10250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRightSquareBracketKeyword10292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_synpred694287 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred694308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_synpred704337 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred704358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred734375 = new BitSet(new long[]{0x0020000800000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_ruleCompareOp_in_synpred734416 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred734437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred754505 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred754526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred764454 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred764494 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_synpred764505 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred764526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_synpred794557 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000004000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred794579 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_synpred794601 = new BitSet(new long[]{0x00CDFC638A000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred794622 = new BitSet(new long[]{0x0000000010000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_synpred794647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_synpred865106 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_synpred865128 = new BitSet(new long[]{0x0018000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_synpred865149 = new BitSet(new long[]{0x0000000018000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_synpred865172 = new BitSet(new long[]{0x0000000000000002L});

}