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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NEGATIVE_INTEGER", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'exactly'", "'private'", "'as'", "'fun'", "'pred'", "':'", "'run'", "'check'", "'for'", "'but'", "'expect'", "'int'", "'seq'", "'='", "'sig'", "'{'", "','", "'}'", "'abstract'", "'lone'", "'one'", "'some'", "'extends'", "'in'", "'+'", "'!'", "'not'", "'=>'", "'implies'", "'else'", "'let'", "'none'", "'iden'", "'univ'", "'Int'", "'seq/Int'", "'('", "')'", "'@'", "'this'", "'disj'", "'all'", "'sum'", "'||'", "'or'", "'&&'", "'and'", "'&'", "'<=>'", "'iff'", "'-'", "'++'", "'<:'", "':>'", "'<<'", "'>>'", "'>>>'", "'set'", "'#'", "'~'", "'*'", "'^'", "'no'", "'<'", "'>'", "'=<'", "'<='", "'>='", "'->'", "'|'", "'open'", "'fact'", "'assert'", "'enum'", "'/'", "'.'", "'['", "']'"
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
            ruleMemo = new HashMap[281+1];
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

                if ( (LA3_0==RULE_ID||LA3_0==14||(LA3_0>=16 && LA3_0<=17)||(LA3_0>=19 && LA3_0<=20)||LA3_0==27||(LA3_0>=31 && LA3_0<=34)||LA3_0==43||(LA3_0>=84 && LA3_0<=86)) ) {
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:187:1: ruleModule returns [EObject current=null] : ( 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_exactly_3_0=null;
        Token lv_exactly_6_0=null;
        Token lv_number_7_0=null;
        AntlrDatatypeRuleToken lv_moduleName_1_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_name_4_0 = null;

        EObject lv_comma_5_0 = null;

        EObject lv_name_8_0 = null;

        EObject lv_right_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:192:6: ( ( 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:1: ( 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:1: ( 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:3: 'module' ( (lv_moduleName_1_0= ruleName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )?
            {
            match(input,12,FOLLOW_12_in_ruleModule263); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:197:1: ( (lv_moduleName_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:198:1: (lv_moduleName_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:198:1: (lv_moduleName_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:199:3: lv_moduleName_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getModuleNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleModule284);
            lv_moduleName_1_0=ruleName();
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
              	       			"moduleName",
              	        		lv_moduleName_1_0, 
              	        		"Name", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:221:2: ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==89) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:221:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_3_0= 'exactly' ) )? ( (lv_name_4_0= ruleExactlyName ) ) ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )* ( (lv_right_9_0= ruleRightSquareBracketKeyword ) )
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
                      	       		add(
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:290:2: ( ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==29) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:290:3: ( (lv_comma_5_0= ruleComma ) ) ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) )
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:314:2: ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==RULE_INT||LA6_0==13) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==RULE_ID||LA6_0==52) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("314:2: ( ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) ) | ( (lv_name_8_0= ruleExactlyName ) ) )", 6, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:314:3: ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )
                    	            {
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:314:3: ( ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) ) )
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:314:4: ( (lv_exactly_6_0= 'exactly' ) )? ( (lv_number_7_0= RULE_INT ) )
                    	            {
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:314:4: ( (lv_exactly_6_0= 'exactly' ) )?
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
                    	                    match(input,13,FOLLOW_13_in_ruleModule401); if (failed) return current;
                    	                    if ( backtracking==0 ) {

                    	                              createLeafNode(grammarAccess.getModuleAccess().getExactlyExactlyKeyword_2_3_1_0_0_0(), "exactly"); 
                    	                          
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
                    	            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleModule432); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	              			createLeafNode(grammarAccess.getModuleAccess().getNumberINTTerminalRuleCall_2_3_1_0_1_0(), "number"); 
                    	              		
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


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:360:6: ( (lv_name_8_0= ruleExactlyName ) )
                    	            {
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:360:6: ( (lv_name_8_0= ruleExactlyName ) )
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:361:1: (lv_name_8_0= ruleExactlyName )
                    	            {
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:361:1: (lv_name_8_0= ruleExactlyName )
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:362:3: lv_name_8_0= ruleExactlyName
                    	            {
                    	            if ( backtracking==0 ) {
                    	               
                    	              	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getNameExactlyNameParserRuleCall_2_3_1_1_0(), currentNode); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleExactlyName_in_ruleModule465);
                    	            lv_name_8_0=ruleExactlyName();
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
                    	              	       			"name",
                    	              	        		lv_name_8_0, 
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
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:384:5: ( (lv_right_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:385:1: (lv_right_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:385:1: (lv_right_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:386:3: lv_right_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getRightRightSquareBracketKeywordParserRuleCall_2_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleModule489);
                    lv_right_9_0=ruleRightSquareBracketKeyword();
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
                      	        		lv_right_9_0, 
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:416:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:417:2: (iv_ruleOpen= ruleOpen EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:418:2: iv_ruleOpen= ruleOpen EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOpenRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOpen_in_entryRuleOpen527);
            iv_ruleOpen=ruleOpen();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOpen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpen537); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:425:1: ruleOpen returns [EObject current=null] : ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleAsName ) ) )? ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:430:6: ( ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleAsName ) ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:431:1: ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleAsName ) ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:431:1: ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleAsName ) ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:431:2: ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleAsName ) ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:431:2: ( 'private' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:431:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleOpen573); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:435:3: ( (lv_openName_1_0= ruleOpenName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:436:1: (lv_openName_1_0= ruleOpenName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:436:1: (lv_openName_1_0= ruleOpenName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:437:3: lv_openName_1_0= ruleOpenName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getOpenNameOpenNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOpenName_in_ruleOpen596);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:459:2: ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==89) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:459:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:459:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:460:1: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:460:1: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:461:3: lv_left_2_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getLeftLeftSquareBracketKeywordParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleOpen618);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:483:2: ( (lv_ref_3_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:484:1: (lv_ref_3_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:484:1: (lv_ref_3_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:485:3: lv_ref_3_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRefRefParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleOpen639);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:507:2: ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==29) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:507:3: ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:507:3: ( (lv_comma_4_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:508:1: (lv_comma_4_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:508:1: (lv_comma_4_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:509:3: lv_comma_4_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getCommaCommaParserRuleCall_2_2_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleOpen661);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:531:2: ( (lv_ref_5_0= ruleRef ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:532:1: (lv_ref_5_0= ruleRef )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:532:1: (lv_ref_5_0= ruleRef )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:533:3: lv_ref_5_0= ruleRef
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRefRefParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRef_in_ruleOpen682);
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
                    	    break loop10;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:555:4: ( (lv_right_6_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:556:1: (lv_right_6_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:556:1: (lv_right_6_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:557:3: lv_right_6_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRightRightSquareBracketKeywordParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleOpen705);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:579:4: ( 'as' ( (lv_nameAs_8_0= ruleAsName ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:579:6: 'as' ( (lv_nameAs_8_0= ruleAsName ) )
                    {
                    match(input,15,FOLLOW_15_in_ruleOpen718); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getAsKeyword_3_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:583:1: ( (lv_nameAs_8_0= ruleAsName ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:584:1: (lv_nameAs_8_0= ruleAsName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:584:1: (lv_nameAs_8_0= ruleAsName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:585:3: lv_nameAs_8_0= ruleAsName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getNameAsAsNameParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAsName_in_ruleOpen739);
                    lv_nameAs_8_0=ruleAsName();
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
                      	        		"AsName", 
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:615:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:616:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:617:2: iv_ruleParagraph= ruleParagraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParagraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph777);
            iv_ruleParagraph=ruleParagraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParagraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph787); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:624:1: ruleParagraph returns [EObject current=null] : (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_LetOutDecl_7= ruleLetOutDecl | this_SigDecl_8= ruleSigDecl ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        EObject this_FactDecl_0 = null;

        EObject this_AssertDecl_1 = null;

        EObject this_FunDecl_2 = null;

        EObject this_PredDecl_3 = null;

        EObject this_RunDecl_4 = null;

        EObject this_CheckDecl_5 = null;

        EObject this_EnumDecl_6 = null;

        EObject this_LetOutDecl_7 = null;

        EObject this_SigDecl_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:629:6: ( (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_LetOutDecl_7= ruleLetOutDecl | this_SigDecl_8= ruleSigDecl ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:630:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_LetOutDecl_7= ruleLetOutDecl | this_SigDecl_8= ruleSigDecl )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:630:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_LetOutDecl_7= ruleLetOutDecl | this_SigDecl_8= ruleSigDecl )
            int alt13=9;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:631:2: this_FactDecl_0= ruleFactDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFactDeclParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFactDecl_in_ruleParagraph837);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:644:2: this_AssertDecl_1= ruleAssertDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getAssertDeclParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertDecl_in_ruleParagraph867);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:657:2: this_FunDecl_2= ruleFunDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFunDeclParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunDecl_in_ruleParagraph897);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:670:2: this_PredDecl_3= rulePredDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getPredDeclParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePredDecl_in_ruleParagraph927);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:683:2: this_RunDecl_4= ruleRunDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getRunDeclParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRunDecl_in_ruleParagraph957);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:696:2: this_CheckDecl_5= ruleCheckDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getCheckDeclParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckDecl_in_ruleParagraph987);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:709:2: this_EnumDecl_6= ruleEnumDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getEnumDeclParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleParagraph1017);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:722:2: this_LetOutDecl_7= ruleLetOutDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getLetOutDeclParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetOutDecl_in_ruleParagraph1047);
                    this_LetOutDecl_7=ruleLetOutDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LetOutDecl_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:735:2: this_SigDecl_8= ruleSigDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getSigDeclParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigDecl_in_ruleParagraph1077);
                    this_SigDecl_8=ruleSigDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SigDecl_8; 
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:754:1: entryRuleFactDecl returns [EObject current=null] : iv_ruleFactDecl= ruleFactDecl EOF ;
    public final EObject entryRuleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:755:2: (iv_ruleFactDecl= ruleFactDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:756:2: iv_ruleFactDecl= ruleFactDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactDecl_in_entryRuleFactDecl1112);
            iv_ruleFactDecl=ruleFactDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactDecl1122); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:763:1: ruleFactDecl returns [EObject current=null] : ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_factName_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:768:6: ( ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:769:1: ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:769:1: ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:769:2: ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:769:2: ( (lv_factName_0_0= ruleFactName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:770:1: (lv_factName_0_0= ruleFactName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:770:1: (lv_factName_0_0= ruleFactName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:771:3: lv_factName_0_0= ruleFactName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getFactNameFactNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFactName_in_ruleFactDecl1168);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:793:2: ( (lv_block_1_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:794:1: (lv_block_1_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:794:1: (lv_block_1_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:795:3: lv_block_1_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFactDecl1189);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:825:1: entryRuleAssertDecl returns [EObject current=null] : iv_ruleAssertDecl= ruleAssertDecl EOF ;
    public final EObject entryRuleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:826:2: (iv_ruleAssertDecl= ruleAssertDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:827:2: iv_ruleAssertDecl= ruleAssertDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1225);
            iv_ruleAssertDecl=ruleAssertDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertDecl1235); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:834:1: ruleAssertDecl returns [EObject current=null] : ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_assertionName_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:839:6: ( ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:840:1: ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:840:1: ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:840:2: ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:840:2: ( (lv_assertionName_0_0= ruleAssertionName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:841:1: (lv_assertionName_0_0= ruleAssertionName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:841:1: (lv_assertionName_0_0= ruleAssertionName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:842:3: lv_assertionName_0_0= ruleAssertionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getAssertionNameAssertionNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionName_in_ruleAssertDecl1281);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:864:2: ( (lv_block_1_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:865:1: (lv_block_1_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:865:1: (lv_block_1_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:866:3: lv_block_1_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleAssertDecl1302);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:896:1: entryRuleFunDecl returns [EObject current=null] : iv_ruleFunDecl= ruleFunDecl EOF ;
    public final EObject entryRuleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:897:2: (iv_ruleFunDecl= ruleFunDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:898:2: iv_ruleFunDecl= ruleFunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunDecl_in_entryRuleFunDecl1338);
            iv_ruleFunDecl=ruleFunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunDecl1348); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:905:1: ruleFunDecl returns [EObject current=null] : ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:910:6: ( ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:911:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:911:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:911:2: ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:911:2: ( 'private' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:911:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleFunDecl1384); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunDecl1396); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunDeclAccess().getFunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:919:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==88) ) {
                    alt15=1;
                }
            }
            else if ( ((LA15_0>=46 && LA15_0<=48)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:919:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:919:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:920:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:920:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:921:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleFunDecl1418);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:943:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:944:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:944:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:945:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleFunDecl1439);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:967:4: ( (lv_functionName_4_0= ruleFunctionName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:968:1: (lv_functionName_4_0= ruleFunctionName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:968:1: (lv_functionName_4_0= ruleFunctionName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:969:3: lv_functionName_4_0= ruleFunctionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getFunctionNameFunctionNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionName_in_ruleFunDecl1462);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:991:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==89) ) {
                alt20=1;
            }
            else if ( (LA20_0==49) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:991:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:991:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:991:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:991:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:992:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:992:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:993:3: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleFunDecl1485);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1015:2: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID||LA17_0==14||(LA17_0>=52 && LA17_0<=53)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1015:3: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1015:3: ( (lv_decl_6_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1016:1: (lv_decl_6_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1016:1: (lv_decl_6_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1017:3: lv_decl_6_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1507);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1039:2: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==29) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1039:3: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1039:3: ( (lv_comma_7_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1040:1: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1040:1: (lv_comma_7_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1041:3: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleFunDecl1529);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1063:2: ( (lv_decl_8_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1064:1: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1064:1: (lv_decl_8_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1065:3: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1550);
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
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1087:6: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1088:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1088:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1089:3: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleFunDecl1575);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1112:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1112:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1112:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1112:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1113:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1113:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1114:3: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleFunDecl1604);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1136:2: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID||LA19_0==14||(LA19_0>=52 && LA19_0<=53)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1136:3: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1136:3: ( (lv_decl_11_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1137:1: (lv_decl_11_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1137:1: (lv_decl_11_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1138:3: lv_decl_11_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1626);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1160:2: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==29) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1160:3: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1160:3: ( (lv_comma_12_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1161:1: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1161:1: (lv_comma_12_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1162:3: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleFunDecl1648);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1184:2: ( (lv_decl_13_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1185:1: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1185:1: (lv_decl_13_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1186:3: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1669);
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
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1208:6: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1209:1: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1209:1: (lv_rightP_14_0= ruleRightParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1210:3: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightParenthesis_in_ruleFunDecl1694);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1232:5: ( (lv_colon_15_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1233:1: (lv_colon_15_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1233:1: (lv_colon_15_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1234:3: lv_colon_15_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getColonColonParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleFunDecl1718);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1256:2: ( (lv_expr_16_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1257:1: (lv_expr_16_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1257:1: (lv_expr_16_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1258:3: lv_expr_16_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunDecl1739);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1280:2: ( (lv_block_17_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1281:1: (lv_block_17_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1281:1: (lv_block_17_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1282:3: lv_block_17_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getBlockBlockParserRuleCall_7_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFunDecl1760);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1312:1: entryRulePredDecl returns [EObject current=null] : iv_rulePredDecl= rulePredDecl EOF ;
    public final EObject entryRulePredDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1313:2: (iv_rulePredDecl= rulePredDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1314:2: iv_rulePredDecl= rulePredDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredDecl_in_entryRulePredDecl1796);
            iv_rulePredDecl=rulePredDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredDecl1806); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1321:1: rulePredDecl returns [EObject current=null] : ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1326:6: ( ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1327:1: ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1327:1: ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1327:2: ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1327:2: ( 'private' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1327:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_rulePredDecl1842); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_rulePredDecl1854); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPredDeclAccess().getPredKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1335:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==88) ) {
                    alt22=1;
                }
            }
            else if ( ((LA22_0>=46 && LA22_0<=48)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1335:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1335:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1336:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1336:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1337:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_rulePredDecl1876);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1359:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1360:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1360:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1361:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_rulePredDecl1897);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1383:4: ( (lv_predicateName_4_0= rulePredicateName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1384:1: (lv_predicateName_4_0= rulePredicateName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1384:1: (lv_predicateName_4_0= rulePredicateName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1385:3: lv_predicateName_4_0= rulePredicateName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getPredicateNamePredicateNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePredicateName_in_rulePredDecl1920);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1407:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==89) ) {
                alt27=1;
            }
            else if ( (LA27_0==49) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1407:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1407:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1407:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1407:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1408:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1408:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1409:3: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_rulePredDecl1943);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1431:2: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID||LA24_0==14||(LA24_0>=52 && LA24_0<=53)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1431:3: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1431:3: ( (lv_decl_6_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1432:1: (lv_decl_6_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1432:1: (lv_decl_6_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1433:3: lv_decl_6_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl1965);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1455:2: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==29) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1455:3: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1455:3: ( (lv_comma_7_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1456:1: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1456:1: (lv_comma_7_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1457:3: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_rulePredDecl1987);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1479:2: ( (lv_decl_8_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1480:1: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1480:1: (lv_decl_8_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1481:3: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2008);
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
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1503:6: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1504:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1504:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1505:3: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_rulePredDecl2033);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1528:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1528:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1528:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1528:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1529:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1529:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1530:3: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftParenthesis_in_rulePredDecl2062);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1552:2: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID||LA26_0==14||(LA26_0>=52 && LA26_0<=53)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1552:3: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1552:3: ( (lv_decl_11_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1553:1: (lv_decl_11_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1553:1: (lv_decl_11_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1554:3: lv_decl_11_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2084);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1576:2: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==29) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1576:3: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1576:3: ( (lv_comma_12_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1577:1: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1577:1: (lv_comma_12_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1578:3: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_rulePredDecl2106);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1600:2: ( (lv_decl_13_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1601:1: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1601:1: (lv_decl_13_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1602:3: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2127);
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
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1624:6: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1625:1: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1625:1: (lv_rightP_14_0= ruleRightParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1626:3: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightParenthesis_in_rulePredDecl2152);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1648:5: ( (lv_block_15_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1649:1: (lv_block_15_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1649:1: (lv_block_15_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1650:3: lv_block_15_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getBlockBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_rulePredDecl2176);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1680:1: entryRuleRunDecl returns [EObject current=null] : iv_ruleRunDecl= ruleRunDecl EOF ;
    public final EObject entryRuleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1681:2: (iv_ruleRunDecl= ruleRunDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1682:2: iv_ruleRunDecl= ruleRunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRunDecl_in_entryRuleRunDecl2212);
            iv_ruleRunDecl=ruleRunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRunDecl2222); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1689:1: ruleRunDecl returns [EObject current=null] : ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_runName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1694:6: ( ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1695:1: ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1695:1: ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1695:2: ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1695:2: ( ( (lv_runName_0_0= ruleAlias ) ) ':' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1695:3: ( (lv_runName_0_0= ruleAlias ) ) ':'
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1695:3: ( (lv_runName_0_0= ruleAlias ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1696:1: (lv_runName_0_0= ruleAlias )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1696:1: (lv_runName_0_0= ruleAlias )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1697:3: lv_runName_0_0= ruleAlias
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getRunNameAliasParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleRunDecl2269);
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

                    match(input,18,FOLLOW_18_in_ruleRunDecl2279); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRunDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleRunDecl2291); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRunDeclAccess().getRunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1727:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==28) ) {
                alt29=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1727:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1727:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1727:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1728:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1728:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1729:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRunDecl2314); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRunDeclAccess().getName2PredicateNameCrossReference_2_0_0(), "name2"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1745:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1745:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1746:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1746:1: (lv_block_4_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1747:3: lv_block_4_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getBlockBlockParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleRunDecl2341);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1769:3: ( (lv_scope_5_0= ruleScope ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1770:1: (lv_scope_5_0= ruleScope )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1770:1: (lv_scope_5_0= ruleScope )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1771:3: lv_scope_5_0= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleRunDecl2363);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1801:1: entryRuleCheckDecl returns [EObject current=null] : iv_ruleCheckDecl= ruleCheckDecl EOF ;
    public final EObject entryRuleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1802:2: (iv_ruleCheckDecl= ruleCheckDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1803:2: iv_ruleCheckDecl= ruleCheckDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCheckDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2399);
            iv_ruleCheckDecl=ruleCheckDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCheckDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckDecl2409); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1810:1: ruleCheckDecl returns [EObject current=null] : ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_checkName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1815:6: ( ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1816:1: ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1816:1: ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1816:2: ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1816:2: ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1816:3: ( (lv_checkName_0_0= ruleAlias ) ) ':'
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1816:3: ( (lv_checkName_0_0= ruleAlias ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1817:1: (lv_checkName_0_0= ruleAlias )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1817:1: (lv_checkName_0_0= ruleAlias )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1818:3: lv_checkName_0_0= ruleAlias
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getCheckNameAliasParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleCheckDecl2456);
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

                    match(input,18,FOLLOW_18_in_ruleCheckDecl2466); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCheckDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleCheckDecl2478); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCheckDeclAccess().getCheckKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1848:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==28) ) {
                alt31=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1848:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1848:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1848:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1849:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1849:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1850:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckDecl2501); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCheckDeclAccess().getNameAssertionNameCrossReference_2_0_0(), "name"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1866:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1866:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1867:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1867:1: (lv_block_4_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1868:3: lv_block_4_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getBlockBlockParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleCheckDecl2528);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1890:3: ( (lv_scope_5_0= ruleScope ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1891:1: (lv_scope_5_0= ruleScope )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1891:1: (lv_scope_5_0= ruleScope )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1892:3: lv_scope_5_0= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleCheckDecl2550);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1922:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1923:2: (iv_ruleScope= ruleScope EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1924:2: iv_ruleScope= ruleScope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScope_in_entryRuleScope2586);
            iv_ruleScope=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScope2596); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1931:1: ruleScope returns [EObject current=null] : ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1936:6: ( ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1937:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1937:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            int alt38=4;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        alt38=2;
                        }
                        break;
                    case EOF:
                    case 14:
                    case 16:
                    case 17:
                    case 19:
                    case 20:
                    case 23:
                    case 27:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 43:
                    case 84:
                    case 85:
                    case 86:
                        {
                        alt38=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA38_7 = input.LA(4);

                        if ( (LA38_7==EOF||LA38_7==RULE_ID||LA38_7==14||(LA38_7>=16 && LA38_7<=17)||(LA38_7>=19 && LA38_7<=20)||LA38_7==23||LA38_7==27||LA38_7==29||(LA38_7>=31 && LA38_7<=34)||LA38_7==43||(LA38_7>=84 && LA38_7<=86)) ) {
                            alt38=3;
                        }
                        else if ( (LA38_7==18||LA38_7==87) ) {
                            alt38=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1937:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 38, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                    case 25:
                        {
                        alt38=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1937:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 38, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA38_1==13) ) {
                    alt38=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1937:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==EOF||LA38_0==RULE_ID||LA38_0==14||(LA38_0>=16 && LA38_0<=17)||(LA38_0>=19 && LA38_0<=20)||LA38_0==23||LA38_0==27||(LA38_0>=31 && LA38_0<=34)||LA38_0==43||(LA38_0>=84 && LA38_0<=86)) ) {
                alt38=4;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1937:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1937:2: ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1937:2: ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1937:3: () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1937:3: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1938:2: 
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

                    match(input,21,FOLLOW_21_in_ruleScope2644); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_0_1(), null); 
                          
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2653); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_0_2(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1959:1: ( (lv_expect_3_0= ruleExpectation ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==23) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1960:1: (lv_expect_3_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1960:1: (lv_expect_3_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1961:3: lv_expect_3_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_0_3_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2673);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1984:6: ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1984:6: ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1984:7: () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1984:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1985:2: 
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

                    match(input,21,FOLLOW_21_in_ruleScope2704); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_1_1(), null); 
                          
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2713); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_1_2(), null); 
                          
                    }
                    match(input,22,FOLLOW_22_in_ruleScope2722); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getButKeyword_1_3(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2010:1: ( (lv_typescope_8_0= ruleTypescope ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2011:1: (lv_typescope_8_0= ruleTypescope )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2011:1: (lv_typescope_8_0= ruleTypescope )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2012:3: lv_typescope_8_0= ruleTypescope
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2743);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2034:2: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==29) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2034:3: ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2034:3: ( (lv_comma_9_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2035:1: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2035:1: (lv_comma_9_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2036:3: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_1_5_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleScope2765);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2058:2: ( (lv_typescope_10_0= ruleTypescope ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2059:1: (lv_typescope_10_0= ruleTypescope )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2059:1: (lv_typescope_10_0= ruleTypescope )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2060:3: lv_typescope_10_0= ruleTypescope
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2786);
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
                    	    break loop33;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2082:4: ( (lv_expect_11_0= ruleExpectation ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==23) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2083:1: (lv_expect_11_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2083:1: (lv_expect_11_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2084:3: lv_expect_11_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_1_6_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2809);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2107:6: ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2107:6: ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2107:7: () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2107:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2108:2: 
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

                    match(input,21,FOLLOW_21_in_ruleScope2840); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_2_1(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2125:1: ( (lv_typescope_14_0= ruleTypescope ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2126:1: (lv_typescope_14_0= ruleTypescope )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2126:1: (lv_typescope_14_0= ruleTypescope )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2127:3: lv_typescope_14_0= ruleTypescope
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2861);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2149:2: ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==29) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2149:3: ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2149:3: ( (lv_comma_15_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2150:1: (lv_comma_15_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2150:1: (lv_comma_15_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2151:3: lv_comma_15_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_2_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleScope2883);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2173:2: ( (lv_typescope_16_0= ruleTypescope ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2174:1: (lv_typescope_16_0= ruleTypescope )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2174:1: (lv_typescope_16_0= ruleTypescope )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2175:3: lv_typescope_16_0= ruleTypescope
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2904);
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
                    	    break loop35;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2197:4: ( (lv_expect_17_0= ruleExpectation ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==23) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2198:1: (lv_expect_17_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2198:1: (lv_expect_17_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2199:3: lv_expect_17_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_2_4_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2927);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2222:6: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2222:6: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2222:7: () ( (lv_expect_19_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2222:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2223:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2236:2: ( (lv_expect_19_0= ruleExpectation ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==23) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2237:1: (lv_expect_19_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2237:1: (lv_expect_19_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2238:3: lv_expect_19_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_3_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2969);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2268:1: entryRuleExpectation returns [EObject current=null] : iv_ruleExpectation= ruleExpectation EOF ;
    public final EObject entryRuleExpectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectation = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2269:2: (iv_ruleExpectation= ruleExpectation EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2270:2: iv_ruleExpectation= ruleExpectation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpectationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpectation_in_entryRuleExpectation3007);
            iv_ruleExpectation=ruleExpectation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpectation3017); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2277:1: ruleExpectation returns [EObject current=null] : ( 'expect' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleExpectation() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2282:6: ( ( 'expect' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2283:1: ( 'expect' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2283:1: ( 'expect' ( (lv_value_1_0= RULE_INT ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2283:3: 'expect' ( (lv_value_1_0= RULE_INT ) )
            {
            match(input,23,FOLLOW_23_in_ruleExpectation3052); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExpectationAccess().getExpectKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2287:1: ( (lv_value_1_0= RULE_INT ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2288:1: (lv_value_1_0= RULE_INT )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2288:1: (lv_value_1_0= RULE_INT )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2289:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpectation3069); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2319:1: entryRuleTypescope returns [EObject current=null] : iv_ruleTypescope= ruleTypescope EOF ;
    public final EObject entryRuleTypescope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypescope = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2320:2: (iv_ruleTypescope= ruleTypescope EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2321:2: iv_ruleTypescope= ruleTypescope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypescopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypescope_in_entryRuleTypescope3110);
            iv_ruleTypescope=ruleTypescope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypescope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypescope3120); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2328:1: ruleTypescope returns [EObject current=null] : ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) ) ;
    public final EObject ruleTypescope() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2333:6: ( ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2334:1: ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2334:1: ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2334:2: () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2334:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2335:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2348:2: ( 'exactly' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2348:4: 'exactly'
                    {
                    match(input,13,FOLLOW_13_in_ruleTypescope3168); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypescopeAccess().getExactlyKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTypescope3179); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getTypescopeAccess().getINTTerminalRuleCall_2(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2356:1: ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=24 && LA41_0<=25)) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2356:1: ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2356:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2356:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2357:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2357:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2358:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypescope3201); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTypescopeAccess().getNameReferencesNameCrossReference_3_0_0(), "name"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2374:6: ( 'int' | 'seq' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2374:6: ( 'int' | 'seq' )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==24) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==25) ) {
                        alt40=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2374:6: ( 'int' | 'seq' )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2374:8: 'int'
                            {
                            match(input,24,FOLLOW_24_in_ruleTypescope3218); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypescopeAccess().getIntKeyword_3_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2379:7: 'seq'
                            {
                            match(input,25,FOLLOW_25_in_ruleTypescope3234); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2391:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2392:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2393:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3272);
            iv_ruleEnumDecl=ruleEnumDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl3282); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2400:1: ruleEnumDecl returns [EObject current=null] : ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2405:6: ( ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2406:1: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2406:1: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2406:2: ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2406:2: ( (lv_enumName_0_0= ruleEnumName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2407:1: (lv_enumName_0_0= ruleEnumName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2407:1: (lv_enumName_0_0= ruleEnumName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2408:3: lv_enumName_0_0= ruleEnumName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getEnumNameEnumNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumName_in_ruleEnumDecl3328);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2430:2: ( (lv_leftC_1_0= ruleLeftCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2431:1: (lv_leftC_1_0= ruleLeftCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2431:1: (lv_leftC_1_0= ruleLeftCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2432:3: lv_leftC_1_0= ruleLeftCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getLeftCLeftCurlyBracketParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleEnumDecl3349);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2454:2: ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2455:1: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2455:1: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2456:3: lv_propertyEnum_2_0= ruleEnumPropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3370);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2478:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==29) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2478:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2478:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2479:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2479:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2480:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleEnumDecl3392);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2502:2: ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2503:1: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2503:1: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2504:3: lv_propertyEnum_4_0= ruleEnumPropertyName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3413);
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
            	    break loop42;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2526:4: ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2527:1: (lv_rightC_5_0= ruleRightCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2527:1: (lv_rightC_5_0= ruleRightCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2528:3: lv_rightC_5_0= ruleRightCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getRightCRightCurlyBracketParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleEnumDecl3436);
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


    // $ANTLR start entryRuleLetOutDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2558:1: entryRuleLetOutDecl returns [EObject current=null] : iv_ruleLetOutDecl= ruleLetOutDecl EOF ;
    public final EObject entryRuleLetOutDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetOutDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2559:2: (iv_ruleLetOutDecl= ruleLetOutDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2560:2: iv_ruleLetOutDecl= ruleLetOutDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetOutDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetOutDecl_in_entryRuleLetOutDecl3472);
            iv_ruleLetOutDecl=ruleLetOutDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetOutDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetOutDecl3482); if (failed) return current;

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
    // $ANTLR end entryRuleLetOutDecl


    // $ANTLR start ruleLetOutDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2567:1: ruleLetOutDecl returns [EObject current=null] : ( ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleLetOutDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_letName_0_0 = null;

        EObject lv_leftS_1_0 = null;

        EObject lv_nameRef_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_nameRef_4_0 = null;

        EObject lv_rightS_5_0 = null;

        EObject lv_block_6_0 = null;

        EObject lv_exprName_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2572:6: ( ( ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2573:1: ( ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2573:1: ( ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2573:2: ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2573:2: ( (lv_letName_0_0= ruleLetName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2574:1: (lv_letName_0_0= ruleLetName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2574:1: (lv_letName_0_0= ruleLetName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2575:3: lv_letName_0_0= ruleLetName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getLetNameLetNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLetName_in_ruleLetOutDecl3528);
            lv_letName_0_0=ruleLetName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetOutDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"letName",
              	        		lv_letName_0_0, 
              	        		"LetName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2597:2: ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==89) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2597:3: ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2597:3: ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2598:1: (lv_leftS_1_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2598:1: (lv_leftS_1_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2599:3: lv_leftS_1_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleLetOutDecl3550);
                    lv_leftS_1_0=ruleLeftSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLetOutDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"leftS",
                      	        		lv_leftS_1_0, 
                      	        		"LeftSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2621:2: ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID||LA44_0==43||LA44_0==52||LA44_0==84||LA44_0==86) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2621:3: ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2621:3: ( (lv_nameRef_2_0= ruleReferencesName ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2622:1: (lv_nameRef_2_0= ruleReferencesName )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2622:1: (lv_nameRef_2_0= ruleReferencesName )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2623:3: lv_nameRef_2_0= ruleReferencesName
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getNameRefReferencesNameParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReferencesName_in_ruleLetOutDecl3572);
                            lv_nameRef_2_0=ruleReferencesName();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getLetOutDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"nameRef",
                              	        		lv_nameRef_2_0, 
                              	        		"ReferencesName", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2645:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==29) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2645:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2645:3: ( (lv_comma_3_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2646:1: (lv_comma_3_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2646:1: (lv_comma_3_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2647:3: lv_comma_3_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getCommaCommaParserRuleCall_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleLetOutDecl3594);
                            	    lv_comma_3_0=ruleComma();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getLetOutDeclRule().getType().getClassifier());
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2669:2: ( (lv_nameRef_4_0= ruleReferencesName ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2670:1: (lv_nameRef_4_0= ruleReferencesName )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2670:1: (lv_nameRef_4_0= ruleReferencesName )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2671:3: lv_nameRef_4_0= ruleReferencesName
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getNameRefReferencesNameParserRuleCall_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleReferencesName_in_ruleLetOutDecl3615);
                            	    lv_nameRef_4_0=ruleReferencesName();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getLetOutDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"nameRef",
                            	      	        		lv_nameRef_4_0, 
                            	      	        		"ReferencesName", 
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


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2693:6: ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2694:1: (lv_rightS_5_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2694:1: (lv_rightS_5_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2695:3: lv_rightS_5_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleLetOutDecl3640);
                    lv_rightS_5_0=ruleRightSquareBracketKeyword();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLetOutDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"rightS",
                      	        		lv_rightS_5_0, 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2717:4: ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==28) ) {
                alt46=1;
            }
            else if ( (LA46_0==26) ) {
                alt46=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2717:4: ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) )", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2717:5: ( (lv_block_6_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2717:5: ( (lv_block_6_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2718:1: (lv_block_6_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2718:1: (lv_block_6_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2719:3: lv_block_6_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getBlockBlockParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleLetOutDecl3664);
                    lv_block_6_0=ruleBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLetOutDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_6_0, 
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2742:6: ( '=' ( (lv_exprName_8_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2742:6: ( '=' ( (lv_exprName_8_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2742:8: '=' ( (lv_exprName_8_0= ruleExpression ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleLetOutDecl3681); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLetOutDeclAccess().getEqualsSignKeyword_2_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2746:1: ( (lv_exprName_8_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2747:1: (lv_exprName_8_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2747:1: (lv_exprName_8_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2748:3: lv_exprName_8_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getExprNameExpressionParserRuleCall_2_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLetOutDecl3702);
                    lv_exprName_8_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getLetOutDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"exprName",
                      	        		lv_exprName_8_0, 
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
    // $ANTLR end ruleLetOutDecl


    // $ANTLR start entryRuleSigDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2778:1: entryRuleSigDecl returns [EObject current=null] : iv_ruleSigDecl= ruleSigDecl EOF ;
    public final EObject entryRuleSigDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2779:2: (iv_ruleSigDecl= ruleSigDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2780:2: iv_ruleSigDecl= ruleSigDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigDecl_in_entryRuleSigDecl3740);
            iv_ruleSigDecl=ruleSigDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigDecl3750); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2787:1: ruleSigDecl returns [EObject current=null] : ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2792:6: ( ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2793:1: ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2793:1: ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2793:2: (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2793:2: (this_SigQual_0= ruleSigQual )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14||(LA47_0>=31 && LA47_0<=34)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2794:2: this_SigQual_0= ruleSigQual
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigQualParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigQual_in_ruleSigDecl3801);
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

            match(input,27,FOLLOW_27_in_ruleSigDecl3812); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getSigKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2809:1: ( (lv_signatureName_2_0= ruleSignatureName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2810:1: (lv_signatureName_2_0= ruleSignatureName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2810:1: (lv_signatureName_2_0= ruleSignatureName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2811:3: lv_signatureName_2_0= ruleSignatureName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignatureName_in_ruleSigDecl3833);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2833:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==29) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2833:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2833:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2834:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2834:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2835:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleSigDecl3855);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2857:2: ( (lv_signatureName_4_0= ruleSignatureName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2858:1: (lv_signatureName_4_0= ruleSignatureName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2858:1: (lv_signatureName_4_0= ruleSignatureName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2859:3: lv_signatureName_4_0= ruleSignatureName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignatureName_in_ruleSigDecl3876);
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
            	    break loop48;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2881:4: ( (lv_sigExt_5_0= ruleSigExt ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=35 && LA49_0<=36)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2882:1: (lv_sigExt_5_0= ruleSigExt )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2882:1: (lv_sigExt_5_0= ruleSigExt )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2883:3: lv_sigExt_5_0= ruleSigExt
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigExtSigExtParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSigExt_in_ruleSigDecl3899);
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

            match(input,28,FOLLOW_28_in_ruleSigDecl3910); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getLeftCurlyBracketKeyword_5(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2909:1: ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==14||(LA51_0>=52 && LA51_0<=53)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2909:2: ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2909:2: ( (lv_decl_7_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2910:1: (lv_decl_7_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2910:1: (lv_decl_7_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2911:3: lv_decl_7_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl3932);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2933:2: ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==29) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2933:3: ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2933:3: ( (lv_comma2_8_0= ',' ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2934:1: (lv_comma2_8_0= ',' )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2934:1: (lv_comma2_8_0= ',' )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2935:3: lv_comma2_8_0= ','
                    	    {
                    	    lv_comma2_8_0=(Token)input.LT(1);
                    	    match(input,29,FOLLOW_29_in_ruleSigDecl3951); if (failed) return current;
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2954:2: ( (lv_decl_9_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2955:1: (lv_decl_9_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2955:1: (lv_decl_9_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2956:3: lv_decl_9_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl3985);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,30,FOLLOW_30_in_ruleSigDecl3999); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getRightCurlyBracketKeyword_7(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2982:1: ( (lv_block_11_0= ruleBlock ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2983:1: (lv_block_11_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2983:1: (lv_block_11_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2984:3: lv_block_11_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getBlockBlockParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleSigDecl4020);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3014:1: entryRuleSigQual returns [EObject current=null] : iv_ruleSigQual= ruleSigQual EOF ;
    public final EObject entryRuleSigQual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigQual = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3015:2: (iv_ruleSigQual= ruleSigQual EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3016:2: iv_ruleSigQual= ruleSigQual EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigQualRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigQual_in_entryRuleSigQual4057);
            iv_ruleSigQual=ruleSigQual();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigQual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigQual4067); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3023:1: ruleSigQual returns [EObject current=null] : ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* ) ;
    public final EObject ruleSigQual() throws RecognitionException {
        EObject current = null;

        Token lv_sigq_0_1=null;
        Token lv_sigq_0_2=null;
        Token lv_sigq_0_3=null;
        Token lv_sigq_0_4=null;
        Token lv_sigq_0_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3028:6: ( ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3029:1: ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3029:1: ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3029:2: ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3029:2: ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:1: ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:1: ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3031:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3031:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt53=1;
                }
                break;
            case 32:
                {
                alt53=2;
                }
                break;
            case 33:
                {
                alt53=3;
                }
                break;
            case 34:
                {
                alt53=4;
                }
                break;
            case 14:
                {
                alt53=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3031:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3032:3: lv_sigq_0_1= 'abstract'
                    {
                    lv_sigq_0_1=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSigQual4112); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3050:8: lv_sigq_0_2= 'lone'
                    {
                    lv_sigq_0_2=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSigQual4141); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3068:8: lv_sigq_0_3= 'one'
                    {
                    lv_sigq_0_3=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSigQual4170); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3086:8: lv_sigq_0_4= 'some'
                    {
                    lv_sigq_0_4=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleSigQual4199); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3104:8: lv_sigq_0_5= 'private'
                    {
                    lv_sigq_0_5=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleSigQual4228); if (failed) return current;
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3125:2: ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )*
            loop54:
            do {
                int alt54=6;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt54=1;
                    }
                    break;
                case 32:
                    {
                    alt54=2;
                    }
                    break;
                case 33:
                    {
                    alt54=3;
                    }
                    break;
                case 34:
                    {
                    alt54=4;
                    }
                    break;
                case 14:
                    {
                    alt54=5;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3125:4: 'abstract'
            	    {
            	    match(input,31,FOLLOW_31_in_ruleSigQual4255); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getAbstractKeyword_1_0(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3130:7: 'lone'
            	    {
            	    match(input,32,FOLLOW_32_in_ruleSigQual4271); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getLoneKeyword_1_1(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3135:7: 'one'
            	    {
            	    match(input,33,FOLLOW_33_in_ruleSigQual4287); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getOneKeyword_1_2(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3140:7: 'some'
            	    {
            	    match(input,34,FOLLOW_34_in_ruleSigQual4303); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getSomeKeyword_1_3(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3145:7: 'private'
            	    {
            	    match(input,14,FOLLOW_14_in_ruleSigQual4319); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getPrivateKeyword_1_4(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3157:1: entryRuleSigExt returns [EObject current=null] : iv_ruleSigExt= ruleSigExt EOF ;
    public final EObject entryRuleSigExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExt = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3158:2: (iv_ruleSigExt= ruleSigExt EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3159:2: iv_ruleSigExt= ruleSigExt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigExtRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigExt_in_entryRuleSigExt4357);
            iv_ruleSigExt=ruleSigExt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigExt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExt4367); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3166:1: ruleSigExt returns [EObject current=null] : ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) ;
    public final EObject ruleSigExt() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;

        EObject lv_ref_3_0 = null;

        EObject lv_ref2_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3171:6: ( ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3172:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3172:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            else if ( (LA56_0==36) ) {
                alt56=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3172:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3172:2: ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3172:2: ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3172:4: 'extends' ( (lv_ref_1_0= ruleReferencesSig ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleSigExt4403); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getExtendsKeyword_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3176:1: ( (lv_ref_1_0= ruleReferencesSig ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3177:1: (lv_ref_1_0= ruleReferencesSig )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3177:1: (lv_ref_1_0= ruleReferencesSig )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3178:3: lv_ref_1_0= ruleReferencesSig
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4424);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3201:6: ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3201:6: ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3201:8: 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    {
                    match(input,36,FOLLOW_36_in_ruleSigExt4442); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getInKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3205:1: ( (lv_ref_3_0= ruleReferencesSig ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3206:1: (lv_ref_3_0= ruleReferencesSig )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3206:1: (lv_ref_3_0= ruleReferencesSig )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3207:3: lv_ref_3_0= ruleReferencesSig
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4463);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3229:2: ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==37) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3229:4: '+' ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    {
                    	    match(input,37,FOLLOW_37_in_ruleSigExt4474); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getSigExtAccess().getPlusSignKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3233:1: ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3234:1: (lv_ref2_5_0= ruleReferencesSig )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3234:1: (lv_ref2_5_0= ruleReferencesSig )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3235:3: lv_ref2_5_0= ruleReferencesSig
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRef2ReferencesSigParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4495);
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
                    	    break loop55;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3265:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3266:2: (iv_ruleExpression= ruleExpression EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3267:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4534);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4544); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3274:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3279:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3280:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3280:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3281:2: this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression4594);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:1: ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )*
            loop62:
            do {
                int alt62=6;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA62_2 = input.LA(2);

                    if ( (synpred76()) ) {
                        alt62=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA62_3 = input.LA(2);

                    if ( (synpred76()) ) {
                        alt62=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA62_4 = input.LA(2);

                    if ( (synpred76()) ) {
                        alt62=2;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA62_5 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA62_6 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA62_7 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA62_8 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA62_9 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA62_10 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA62_11 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA62_12 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA62_13 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 64:
                    {
                    int LA62_14 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 65:
                    {
                    int LA62_15 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 66:
                    {
                    int LA62_16 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 88:
                    {
                    int LA62_17 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 67:
                    {
                    int LA62_18 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA62_19 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 69:
                    {
                    int LA62_20 = input.LA(2);

                    if ( (synpred75()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case 70:
                    {
                    int LA62_21 = input.LA(2);

                    if ( (synpred76()) ) {
                        alt62=2;
                    }


                    }
                    break;
                case 81:
                    {
                    int LA62_22 = input.LA(2);

                    if ( (synpred76()) ) {
                        alt62=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA62_23 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA62_24 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA62_25 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA62_26 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 76:
                    {
                    int LA62_27 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 77:
                    {
                    int LA62_28 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA62_29 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 79:
                    {
                    int LA62_30 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 80:
                    {
                    int LA62_31 = input.LA(2);

                    if ( (synpred79()) ) {
                        alt62=3;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA62_32 = input.LA(2);

                    if ( (synpred82()) ) {
                        alt62=4;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA62_33 = input.LA(2);

                    if ( (synpred82()) ) {
                        alt62=4;
                    }


                    }
                    break;
                case 89:
                    {
                    int LA62_34 = input.LA(2);

                    if ( (synpred85()) ) {
                        alt62=5;
                    }


                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:2: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:2: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:3: ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:3: ( (lv_binOp_1_0= ruleBinOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3293:1: (lv_binOp_1_0= ruleBinOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3293:1: (lv_binOp_1_0= ruleBinOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3294:3: lv_binOp_1_0= ruleBinOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinOp_in_ruleExpression4616);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3316:2: ( (lv_expr_2_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3317:1: (lv_expr_2_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3317:1: (lv_expr_2_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3318:3: lv_expr_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4637);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:6: ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:6: ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:7: ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:7: ( (lv_arrowOp_3_0= ruleArrowOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3342:1: (lv_arrowOp_3_0= ruleArrowOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3342:1: (lv_arrowOp_3_0= ruleArrowOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3343:3: lv_arrowOp_3_0= ruleArrowOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrowOp_in_ruleExpression4666);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3365:2: ( (lv_expr_4_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3366:1: (lv_expr_4_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3366:1: (lv_expr_4_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3367:3: lv_expr_4_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4687);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:6: ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:6: ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:7: ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:7: ( '!' | 'not' )?
            	    int alt57=3;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==38) ) {
            	        alt57=1;
            	    }
            	    else if ( (LA57_0==39) ) {
            	        alt57=2;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:9: '!'
            	            {
            	            match(input,38,FOLLOW_38_in_ruleExpression4706); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getExclamationMarkKeyword_1_2_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3395:7: 'not'
            	            {
            	            match(input,39,FOLLOW_39_in_ruleExpression4722); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getNotKeyword_1_2_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3399:3: ( (lv_cmp_7_0= ruleCompareOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3400:1: (lv_cmp_7_0= ruleCompareOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3400:1: (lv_cmp_7_0= ruleCompareOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3401:3: lv_cmp_7_0= ruleCompareOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOp_in_ruleExpression4745);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3423:2: ( (lv_expr_8_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3424:1: (lv_expr_8_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3424:1: (lv_expr_8_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3425:3: lv_expr_8_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4766);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:6: ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:6: ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:7: ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )?
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:7: ( '=>' | 'implies' )
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==40) ) {
            	        alt58=1;
            	    }
            	    else if ( (LA58_0==41) ) {
            	        alt58=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("3448:7: ( '=>' | 'implies' )", 58, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:9: '=>'
            	            {
            	            match(input,40,FOLLOW_40_in_ruleExpression4785); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3453:7: 'implies'
            	            {
            	            match(input,41,FOLLOW_41_in_ruleExpression4801); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3457:2: ( (lv_expr_11_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3458:1: (lv_expr_11_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3458:1: (lv_expr_11_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3459:3: lv_expr_11_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4823);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:2: ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==42) ) {
            	        int LA59_1 = input.LA(2);

            	        if ( (synpred81()) ) {
            	            alt59=1;
            	        }
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:4: 'else' ( (lv_expr_13_0= ruleExpression ) )
            	            {
            	            match(input,42,FOLLOW_42_in_ruleExpression4834); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getElseKeyword_1_3_2_0(), null); 
            	                  
            	            }
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3485:1: ( (lv_expr_13_0= ruleExpression ) )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3486:1: (lv_expr_13_0= ruleExpression )
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3486:1: (lv_expr_13_0= ruleExpression )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3487:3: lv_expr_13_0= ruleExpression
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleExpression4855);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:6: ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:6: ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:7: ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:7: ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3511:1: (lv_left_14_0= ruleLeftSquareBracketKeyword )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3511:1: (lv_left_14_0= ruleLeftSquareBracketKeyword )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3512:3: lv_left_14_0= ruleLeftSquareBracketKeyword
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_4_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleExpression4886);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3534:2: ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( ((LA61_0>=RULE_INT && LA61_0<=RULE_NEGATIVE_INTEGER)||LA61_0==25||LA61_0==28||(LA61_0>=32 && LA61_0<=34)||(LA61_0>=38 && LA61_0<=39)||(LA61_0>=43 && LA61_0<=49)||(LA61_0>=51 && LA61_0<=52)||(LA61_0>=54 && LA61_0<=55)||(LA61_0>=70 && LA61_0<=75)) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3534:3: ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )*
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3534:3: ( (lv_expr_15_0= ruleExpression ) )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3535:1: (lv_expr_15_0= ruleExpression )
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3535:1: (lv_expr_15_0= ruleExpression )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3536:3: lv_expr_15_0= ruleExpression
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleExpression4908);
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

            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3558:2: ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )*
            	            loop60:
            	            do {
            	                int alt60=2;
            	                int LA60_0 = input.LA(1);

            	                if ( (LA60_0==29) ) {
            	                    alt60=1;
            	                }


            	                switch (alt60) {
            	            	case 1 :
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3558:3: ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3558:3: ( (lv_comma_16_0= ruleComma ) )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3559:1: (lv_comma_16_0= ruleComma )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3559:1: (lv_comma_16_0= ruleComma )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3560:3: lv_comma_16_0= ruleComma
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleComma_in_ruleExpression4930);
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

            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3582:2: ( (lv_expr_17_0= ruleExpression ) )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3583:1: (lv_expr_17_0= ruleExpression )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3583:1: (lv_expr_17_0= ruleExpression )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3584:3: lv_expr_17_0= ruleExpression
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4951);
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
            	            	    break loop60;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3606:6: ( (lv_right_18_0= ruleRightSquareBracketKeyword ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3607:1: (lv_right_18_0= ruleRightSquareBracketKeyword )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3607:1: (lv_right_18_0= ruleRightSquareBracketKeyword )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3608:3: lv_right_18_0= ruleRightSquareBracketKeyword
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleExpression4976);
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
            	    break loop62;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3638:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3639:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3640:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression5015);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression5025); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3647:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3652:6: ( ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3653:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3653:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )
            int alt70=15;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt70=1;
                }
                break;
            case 54:
            case 55:
                {
                alt70=2;
                }
                break;
            case 25:
            case 38:
            case 39:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt70=3;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 75:
                {
                alt70=4;
                }
                break;
            case RULE_INT:
                {
                alt70=5;
                }
                break;
            case RULE_NEGATIVE_INTEGER:
                {
                alt70=6;
                }
                break;
            case 44:
                {
                alt70=7;
                }
                break;
            case 45:
                {
                alt70=8;
                }
                break;
            case 46:
                {
                alt70=9;
                }
                break;
            case 47:
                {
                alt70=10;
                }
                break;
            case 48:
                {
                alt70=11;
                }
                break;
            case 49:
                {
                alt70=12;
                }
                break;
            case RULE_ID:
            case 51:
            case 52:
                {
                alt70=13;
                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case RULE_INT:
                case RULE_NEGATIVE_INTEGER:
                case 25:
                case 28:
                case 30:
                case 32:
                case 33:
                case 34:
                case 38:
                case 39:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 51:
                case 54:
                case 55:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    {
                    alt70=14;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA70_16 = input.LA(3);

                    if ( ((LA70_16>=RULE_INT && LA70_16<=RULE_NEGATIVE_INTEGER)||(LA70_16>=25 && LA70_16<=26)||LA70_16==28||LA70_16==30||(LA70_16>=32 && LA70_16<=34)||(LA70_16>=36 && LA70_16<=41)||(LA70_16>=43 && LA70_16<=49)||(LA70_16>=51 && LA70_16<=52)||(LA70_16>=54 && LA70_16<=81)||(LA70_16>=88 && LA70_16<=89)) ) {
                        alt70=14;
                    }
                    else if ( (LA70_16==18||LA70_16==29||LA70_16==87) ) {
                        alt70=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3653:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 70, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                    {
                    int LA70_17 = input.LA(3);

                    if ( ((LA70_17>=RULE_INT && LA70_17<=RULE_NEGATIVE_INTEGER)||(LA70_17>=25 && LA70_17<=26)||LA70_17==28||LA70_17==30||(LA70_17>=32 && LA70_17<=34)||(LA70_17>=36 && LA70_17<=41)||(LA70_17>=43 && LA70_17<=49)||(LA70_17>=51 && LA70_17<=52)||(LA70_17>=54 && LA70_17<=81)||(LA70_17>=88 && LA70_17<=89)) ) {
                        alt70=14;
                    }
                    else if ( (LA70_17==18||LA70_17==29||LA70_17==87) ) {
                        alt70=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3653:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 70, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                case 53:
                    {
                    alt70=15;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3653:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 70, 14, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3653:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3653:2: ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3653:2: ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3653:3: () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3653:3: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3654:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3667:2: ( (lv_let_1_0= 'let' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3668:1: (lv_let_1_0= 'let' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3668:1: (lv_let_1_0= 'let' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3669:3: lv_let_1_0= 'let'
                    {
                    lv_let_1_0=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleTerminalExpression5081); if (failed) return current;
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3688:2: ( (lv_letdecl_2_0= ruleLetDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3689:1: (lv_letdecl_2_0= ruleLetDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3689:1: (lv_letdecl_2_0= ruleLetDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3690:3: lv_letdecl_2_0= ruleLetDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpression5115);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3712:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==29) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3712:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3712:3: ( (lv_comma_3_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3713:1: (lv_comma_3_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3713:1: (lv_comma_3_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3714:3: lv_comma_3_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_0_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5137);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3736:2: ( (lv_letdecl_4_0= ruleLetDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3737:1: (lv_letdecl_4_0= ruleLetDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3737:1: (lv_letdecl_4_0= ruleLetDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3738:3: lv_letdecl_4_0= ruleLetDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpression5158);
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
                    	    break loop63;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3760:4: ( (lv_blockOrBar_5_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3761:1: (lv_blockOrBar_5_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3761:1: (lv_blockOrBar_5_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3762:3: lv_blockOrBar_5_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_0_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5181);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3785:6: ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3785:6: ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3785:7: () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3785:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3786:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3799:2: ( (lv_quant_7_0= ruleQuant ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3800:1: (lv_quant_7_0= ruleQuant )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3800:1: (lv_quant_7_0= ruleQuant )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3801:3: lv_quant_7_0= ruleQuant
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getQuantQuantParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQuant_in_ruleTerminalExpression5222);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3823:2: ( (lv_decl_8_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3824:1: (lv_decl_8_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3824:1: (lv_decl_8_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3825:3: lv_decl_8_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5243);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3847:2: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==29) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3847:3: ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3847:3: ( (lv_comma_9_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3848:1: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3848:1: (lv_comma_9_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3849:3: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_1_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5265);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3871:2: ( (lv_decl_10_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3872:1: (lv_decl_10_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3872:1: (lv_decl_10_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3873:3: lv_decl_10_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5286);
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
                    	    break loop64;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3895:4: ( (lv_blockOrBar_11_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3896:1: (lv_blockOrBar_11_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3896:1: (lv_blockOrBar_11_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3897:3: lv_blockOrBar_11_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5309);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3920:6: ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3920:6: ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3920:7: () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3920:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3921:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3934:2: ( (lv_unOp_13_0= ruleUnOp ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3935:1: (lv_unOp_13_0= ruleUnOp )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3935:1: (lv_unOp_13_0= ruleUnOp )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3936:3: lv_unOp_13_0= ruleUnOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getUnOpUnOpParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnOp_in_ruleTerminalExpression5350);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3958:2: ( (lv_expr_14_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3959:1: (lv_expr_14_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3959:1: (lv_expr_14_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3960:3: lv_expr_14_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5371);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3983:6: ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3983:6: ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3983:7: () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3983:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3984:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3997:2: ( (lv_common_16_0= ruleCommonQuantUnOp ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3998:1: (lv_common_16_0= ruleCommonQuantUnOp )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3998:1: (lv_common_16_0= ruleCommonQuantUnOp )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3999:3: lv_common_16_0= ruleCommonQuantUnOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommonCommonQuantUnOpParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommonQuantUnOp_in_ruleTerminalExpression5412);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )
                    int alt66=2;
                    switch ( input.LA(1) ) {
                    case 14:
                    case 53:
                        {
                        alt66=1;
                        }
                        break;
                    case 52:
                        {
                        int LA66_3 = input.LA(2);

                        if ( (synpred92()) ) {
                            alt66=1;
                        }
                        else if ( (true) ) {
                            alt66=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("4021:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 66, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA66_4 = input.LA(2);

                        if ( (synpred92()) ) {
                            alt66=1;
                        }
                        else if ( (true) ) {
                            alt66=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("4021:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 66, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                    case RULE_NEGATIVE_INTEGER:
                    case 25:
                    case 28:
                    case 32:
                    case 33:
                    case 34:
                    case 38:
                    case 39:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 51:
                    case 54:
                    case 55:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                        {
                        alt66=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4021:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:3: ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:3: ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:4: ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:4: ( (lv_decl_17_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4022:1: (lv_decl_17_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4022:1: (lv_decl_17_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4023:3: lv_decl_17_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5435);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4045:2: ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==29) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4045:3: ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4045:3: ( (lv_comma_18_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4046:1: (lv_comma_18_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4046:1: (lv_comma_18_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4047:3: lv_comma_18_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_3_2_0_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5457);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4069:2: ( (lv_decl_19_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4070:1: (lv_decl_19_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4070:1: (lv_decl_19_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4071:3: lv_decl_19_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5478);
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
                            	    break loop65;
                                }
                            } while (true);

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4093:4: ( (lv_blockOrBar_20_0= ruleBlockOrBar ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4094:1: (lv_blockOrBar_20_0= ruleBlockOrBar )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4094:1: (lv_blockOrBar_20_0= ruleBlockOrBar )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4095:3: lv_blockOrBar_20_0= ruleBlockOrBar
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_3_2_0_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5501);
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4118:6: ( (lv_expr_21_0= ruleExpression ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4118:6: ( (lv_expr_21_0= ruleExpression ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4119:1: (lv_expr_21_0= ruleExpression )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4119:1: (lv_expr_21_0= ruleExpression )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4120:3: lv_expr_21_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_3_2_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5529);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4143:6: ( () RULE_INT )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4143:6: ( () RULE_INT )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4143:7: () RULE_INT
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4143:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4144:2: 
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

                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression5559); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_4_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4162:6: ( () RULE_NEGATIVE_INTEGER )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4162:6: ( () RULE_NEGATIVE_INTEGER )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4162:7: () RULE_NEGATIVE_INTEGER
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4162:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4163:2: 
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

                    match(input,RULE_NEGATIVE_INTEGER,FOLLOW_RULE_NEGATIVE_INTEGER_in_ruleTerminalExpression5587); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getNEGATIVE_INTEGERTerminalRuleCall_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4181:6: ( () ( (lv_none_27_0= 'none' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4181:6: ( () ( (lv_none_27_0= 'none' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4181:7: () ( (lv_none_27_0= 'none' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4181:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4182:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4195:2: ( (lv_none_27_0= 'none' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4196:1: (lv_none_27_0= 'none' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4196:1: (lv_none_27_0= 'none' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4197:3: lv_none_27_0= 'none'
                    {
                    lv_none_27_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleTerminalExpression5624); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4217:6: ( () ( (lv_iden_29_0= 'iden' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4217:6: ( () ( (lv_iden_29_0= 'iden' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4217:7: () ( (lv_iden_29_0= 'iden' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4217:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4218:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4231:2: ( (lv_iden_29_0= 'iden' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4232:1: (lv_iden_29_0= 'iden' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4232:1: (lv_iden_29_0= 'iden' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4233:3: lv_iden_29_0= 'iden'
                    {
                    lv_iden_29_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleTerminalExpression5675); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4253:6: ( () ( (lv_univ_31_0= 'univ' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4253:6: ( () ( (lv_univ_31_0= 'univ' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4253:7: () ( (lv_univ_31_0= 'univ' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4253:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4254:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4267:2: ( (lv_univ_31_0= 'univ' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4268:1: (lv_univ_31_0= 'univ' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4268:1: (lv_univ_31_0= 'univ' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4269:3: lv_univ_31_0= 'univ'
                    {
                    lv_univ_31_0=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleTerminalExpression5726); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4289:6: ( () ( (lv_int_33_0= 'Int' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4289:6: ( () ( (lv_int_33_0= 'Int' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4289:7: () ( (lv_int_33_0= 'Int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4289:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4290:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4303:2: ( (lv_int_33_0= 'Int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4304:1: (lv_int_33_0= 'Int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4304:1: (lv_int_33_0= 'Int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4305:3: lv_int_33_0= 'Int'
                    {
                    lv_int_33_0=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleTerminalExpression5777); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4325:6: ( () ( (lv_seq_35_0= 'seq/Int' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4325:6: ( () ( (lv_seq_35_0= 'seq/Int' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4325:7: () ( (lv_seq_35_0= 'seq/Int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4325:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4326:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4339:2: ( (lv_seq_35_0= 'seq/Int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4340:1: (lv_seq_35_0= 'seq/Int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4340:1: (lv_seq_35_0= 'seq/Int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4341:3: lv_seq_35_0= 'seq/Int'
                    {
                    lv_seq_35_0=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleTerminalExpression5828); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4361:6: ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4361:6: ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4361:7: () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4361:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4362:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4375:2: ( (lv_parO_37_0= '(' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4376:1: (lv_parO_37_0= '(' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4376:1: (lv_parO_37_0= '(' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4377:3: lv_parO_37_0= '('
                    {
                    lv_parO_37_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleTerminalExpression5879); if (failed) return current;
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4396:2: ( (lv_expr_38_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4397:1: (lv_expr_38_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4397:1: (lv_expr_38_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4398:3: lv_expr_38_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5913);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4420:2: ( (lv_parF_39_0= ')' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4421:1: (lv_parF_39_0= ')' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4421:1: (lv_parF_39_0= ')' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4422:3: lv_parF_39_0= ')'
                    {
                    lv_parF_39_0=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleTerminalExpression5931); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4442:6: ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4442:6: ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4442:7: () ( '@' )? ( ( ( RULE_ID ) ) | 'this' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4442:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4443:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4456:2: ( '@' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==51) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4456:4: '@'
                            {
                            match(input,51,FOLLOW_51_in_ruleTerminalExpression5975); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExpressionAccess().getCommercialAtKeyword_12_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4460:3: ( ( ( RULE_ID ) ) | 'this' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_ID) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==52) ) {
                        alt68=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4460:3: ( ( ( RULE_ID ) ) | 'this' )", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4460:4: ( ( RULE_ID ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4460:4: ( ( RULE_ID ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4461:1: ( RULE_ID )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4461:1: ( RULE_ID )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4462:3: RULE_ID
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
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression6000); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getTerminalExpressionAccess().getNameRefReferencesNameCrossReference_12_2_0_0(), "nameRef"); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4478:7: 'this'
                            {
                            match(input,52,FOLLOW_52_in_ruleTerminalExpression6016); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4483:6: ( () ( (lv_block_45_0= ruleBlock ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4483:6: ( () ( (lv_block_45_0= ruleBlock ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4483:7: () ( (lv_block_45_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4483:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4484:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4497:2: ( (lv_block_45_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4498:1: (lv_block_45_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4498:1: (lv_block_45_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4499:3: lv_block_45_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockBlockParserRuleCall_13_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleTerminalExpression6058);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4522:6: ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4522:6: ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4522:7: () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4522:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4523:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4536:2: ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4537:1: (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4537:1: (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4538:3: lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLeftCurlyBracketLeftCurlyBracketParserRuleCall_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleTerminalExpression6099);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4560:2: ( (lv_decl_48_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4561:1: (lv_decl_48_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4561:1: (lv_decl_48_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4562:3: lv_decl_48_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_14_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression6120);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4584:2: ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==29) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4584:3: ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4584:3: ( (lv_comma_49_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4585:1: (lv_comma_49_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4585:1: (lv_comma_49_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4586:3: lv_comma_49_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_14_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression6142);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4608:2: ( (lv_decl_50_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4609:1: (lv_decl_50_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4609:1: (lv_decl_50_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4610:3: lv_decl_50_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_14_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression6163);
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
                    	    break loop69;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4632:4: ( (lv_blockOrBar_51_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4633:1: (lv_blockOrBar_51_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4633:1: (lv_blockOrBar_51_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4634:3: lv_blockOrBar_51_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_14_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression6186);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4656:2: ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4657:1: (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4657:1: (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4658:3: lv_rightCurlyBracket_52_0= ruleRightCurlyBracket
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getRightCurlyBracketRightCurlyBracketParserRuleCall_14_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleTerminalExpression6207);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4688:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4689:2: (iv_ruleDecl= ruleDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4690:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl6244);
            iv_ruleDecl=ruleDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl6254); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4697:1: ruleDecl returns [EObject current=null] : ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyName_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_propertyName_4_0 = null;

        EObject lv_colon_5_0 = null;

        EObject lv_expr_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4702:6: ( ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4703:1: ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4703:1: ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4703:2: ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4703:2: ( 'private' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==14) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4703:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleDecl6290); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4707:3: ( 'disj' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==53) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4707:5: 'disj'
                    {
                    match(input,53,FOLLOW_53_in_ruleDecl6303); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4711:3: ( (lv_propertyName_2_0= rulePropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4712:1: (lv_propertyName_2_0= rulePropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4712:1: (lv_propertyName_2_0= rulePropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4713:3: lv_propertyName_2_0= rulePropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleDecl6326);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4735:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==29) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4735:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4735:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4736:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4736:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4737:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleDecl6348);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4759:2: ( (lv_propertyName_4_0= rulePropertyName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4760:1: (lv_propertyName_4_0= rulePropertyName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4760:1: (lv_propertyName_4_0= rulePropertyName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4761:3: lv_propertyName_4_0= rulePropertyName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyName_in_ruleDecl6369);
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
            	    break loop73;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4783:4: ( (lv_colon_5_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4784:1: (lv_colon_5_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4784:1: (lv_colon_5_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4785:3: lv_colon_5_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getColonColonParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleDecl6392);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4807:2: ( 'disj' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==53) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4807:4: 'disj'
                    {
                    match(input,53,FOLLOW_53_in_ruleDecl6403); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_5(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4811:3: ( (lv_expr_7_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4812:1: (lv_expr_7_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4812:1: (lv_expr_7_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4813:3: lv_expr_7_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDecl6426);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4843:1: entryRuleLetDecl returns [EObject current=null] : iv_ruleLetDecl= ruleLetDecl EOF ;
    public final EObject entryRuleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4844:2: (iv_ruleLetDecl= ruleLetDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4845:2: iv_ruleLetDecl= ruleLetDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetDecl_in_entryRuleLetDecl6462);
            iv_ruleLetDecl=ruleLetDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDecl6472); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4852:1: ruleLetDecl returns [EObject current=null] : ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_nameExpression_0_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4857:6: ( ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4858:1: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4858:1: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4858:2: ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4858:2: ( (lv_nameExpression_0_0= rulePropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4859:1: (lv_nameExpression_0_0= rulePropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4859:1: (lv_nameExpression_0_0= rulePropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4860:3: lv_nameExpression_0_0= rulePropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getNameExpressionPropertyNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleLetDecl6518);
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

            match(input,26,FOLLOW_26_in_ruleLetDecl6528); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetDeclAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4886:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4887:1: (lv_expr_2_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4887:1: (lv_expr_2_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4888:3: lv_expr_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getExprExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetDecl6549);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4918:1: entryRuleQuant returns [String current=null] : iv_ruleQuant= ruleQuant EOF ;
    public final String entryRuleQuant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuant = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4919:2: (iv_ruleQuant= ruleQuant EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4920:2: iv_ruleQuant= ruleQuant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQuantRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQuant_in_entryRuleQuant6586);
            iv_ruleQuant=ruleQuant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQuant.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuant6597); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4927:1: ruleQuant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'all' | kw= 'sum' ) ;
    public final AntlrDatatypeRuleToken ruleQuant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4932:6: ( (kw= 'all' | kw= 'sum' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4933:1: (kw= 'all' | kw= 'sum' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4933:1: (kw= 'all' | kw= 'sum' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==54) ) {
                alt75=1;
            }
            else if ( (LA75_0==55) ) {
                alt75=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4933:1: (kw= 'all' | kw= 'sum' )", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4934:2: kw= 'all'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleQuant6635); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getQuantAccess().getAllKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4941:2: kw= 'sum'
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleQuant6654); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4954:1: entryRuleBinOp returns [EObject current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final EObject entryRuleBinOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4955:2: (iv_ruleBinOp= ruleBinOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4956:2: iv_ruleBinOp= ruleBinOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBinOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBinOp_in_entryRuleBinOp6694);
            iv_ruleBinOp=ruleBinOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBinOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinOp6704); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4963:1: ruleBinOp returns [EObject current=null] : ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) ) ;
    public final EObject ruleBinOp() throws RecognitionException {
        EObject current = null;

        EObject lv_dot_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4968:6: ( ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4969:1: ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4969:1: ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4969:2: () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4969:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4970:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4983:2: ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )
            int alt76=16;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt76=1;
                }
                break;
            case 57:
                {
                alt76=2;
                }
                break;
            case 58:
                {
                alt76=3;
                }
                break;
            case 59:
                {
                alt76=4;
                }
                break;
            case 60:
                {
                alt76=5;
                }
                break;
            case 61:
                {
                alt76=6;
                }
                break;
            case 62:
                {
                alt76=7;
                }
                break;
            case 37:
                {
                alt76=8;
                }
                break;
            case 63:
                {
                alt76=9;
                }
                break;
            case 64:
                {
                alt76=10;
                }
                break;
            case 65:
                {
                alt76=11;
                }
                break;
            case 66:
                {
                alt76=12;
                }
                break;
            case 88:
                {
                alt76=13;
                }
                break;
            case 67:
                {
                alt76=14;
                }
                break;
            case 68:
                {
                alt76=15;
                }
                break;
            case 69:
                {
                alt76=16;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4983:2: ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4983:4: '||'
                    {
                    match(input,56,FOLLOW_56_in_ruleBinOp6752); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4988:7: 'or'
                    {
                    match(input,57,FOLLOW_57_in_ruleBinOp6768); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getOrKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4993:7: '&&'
                    {
                    match(input,58,FOLLOW_58_in_ruleBinOp6784); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAmpersandAmpersandKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4998:7: 'and'
                    {
                    match(input,59,FOLLOW_59_in_ruleBinOp6800); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAndKeyword_1_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5003:7: '&'
                    {
                    match(input,60,FOLLOW_60_in_ruleBinOp6816); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAmpersandKeyword_1_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5008:7: '<=>'
                    {
                    match(input,61,FOLLOW_61_in_ruleBinOp6832); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5013:7: 'iff'
                    {
                    match(input,62,FOLLOW_62_in_ruleBinOp6848); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getIffKeyword_1_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5018:7: '+'
                    {
                    match(input,37,FOLLOW_37_in_ruleBinOp6864); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getPlusSignKeyword_1_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5023:7: '-'
                    {
                    match(input,63,FOLLOW_63_in_ruleBinOp6880); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getHyphenMinusKeyword_1_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5028:7: '++'
                    {
                    match(input,64,FOLLOW_64_in_ruleBinOp6896); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getPlusSignPlusSignKeyword_1_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5033:7: '<:'
                    {
                    match(input,65,FOLLOW_65_in_ruleBinOp6912); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignColonKeyword_1_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5038:7: ':>'
                    {
                    match(input,66,FOLLOW_66_in_ruleBinOp6928); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getColonGreaterThanSignKeyword_1_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5043:6: ( (lv_dot_13_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5043:6: ( (lv_dot_13_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5044:1: (lv_dot_13_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5044:1: (lv_dot_13_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5045:3: lv_dot_13_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBinOpAccess().getDotDotParserRuleCall_1_12_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleBinOp6955);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5068:7: '<<'
                    {
                    match(input,67,FOLLOW_67_in_ruleBinOp6971); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignLessThanSignKeyword_1_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5073:7: '>>'
                    {
                    match(input,68,FOLLOW_68_in_ruleBinOp6987); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignKeyword_1_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5078:7: '>>>'
                    {
                    match(input,69,FOLLOW_69_in_ruleBinOp7003); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5090:1: entryRuleUnOp returns [EObject current=null] : iv_ruleUnOp= ruleUnOp EOF ;
    public final EObject entryRuleUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5091:2: (iv_ruleUnOp= ruleUnOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5092:2: iv_ruleUnOp= ruleUnOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnOp_in_entryRuleUnOp7040);
            iv_ruleUnOp=ruleUnOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOp7050); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5099:1: ruleUnOp returns [EObject current=null] : ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) ) ;
    public final EObject ruleUnOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_4_1=null;
        Token lv_op_4_2=null;
        Token lv_op_4_3=null;
        Token lv_op_4_4=null;
        Token lv_op_4_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5104:6: ( ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5105:1: ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5105:1: ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5105:2: () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5105:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5106:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5119:2: ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )
            int alt78=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt78=1;
                }
                break;
            case 70:
                {
                alt78=2;
                }
                break;
            case 25:
                {
                alt78=3;
                }
                break;
            case 38:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt78=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5119:2: ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5119:4: 'not'
                    {
                    match(input,39,FOLLOW_39_in_ruleUnOp7098); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getNotKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5124:7: 'set'
                    {
                    match(input,70,FOLLOW_70_in_ruleUnOp7114); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getSetKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5129:7: 'seq'
                    {
                    match(input,25,FOLLOW_25_in_ruleUnOp7130); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getSeqKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5134:6: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5134:6: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5135:1: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5135:1: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5136:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5136:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )
                    int alt77=5;
                    switch ( input.LA(1) ) {
                    case 38:
                        {
                        alt77=1;
                        }
                        break;
                    case 71:
                        {
                        alt77=2;
                        }
                        break;
                    case 72:
                        {
                        alt77=3;
                        }
                        break;
                    case 73:
                        {
                        alt77=4;
                        }
                        break;
                    case 74:
                        {
                        alt77=5;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("5136:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )", 77, 0, input);

                        throw nvae;
                    }

                    switch (alt77) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5137:3: lv_op_4_1= '!'
                            {
                            lv_op_4_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_ruleUnOp7156); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5155:8: lv_op_4_2= '#'
                            {
                            lv_op_4_2=(Token)input.LT(1);
                            match(input,71,FOLLOW_71_in_ruleUnOp7185); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5173:8: lv_op_4_3= '~'
                            {
                            lv_op_4_3=(Token)input.LT(1);
                            match(input,72,FOLLOW_72_in_ruleUnOp7214); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5191:8: lv_op_4_4= '*'
                            {
                            lv_op_4_4=(Token)input.LT(1);
                            match(input,73,FOLLOW_73_in_ruleUnOp7243); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5209:8: lv_op_4_5= '^'
                            {
                            lv_op_4_5=(Token)input.LT(1);
                            match(input,74,FOLLOW_74_in_ruleUnOp7272); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5238:1: entryRuleCommonQuantUnOp returns [EObject current=null] : iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF ;
    public final EObject entryRuleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonQuantUnOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5239:2: (iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5240:2: iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommonQuantUnOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommonQuantUnOp_in_entryRuleCommonQuantUnOp7325);
            iv_ruleCommonQuantUnOp=ruleCommonQuantUnOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommonQuantUnOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonQuantUnOp7335); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5247:1: ruleCommonQuantUnOp returns [EObject current=null] : ( () ( 'no' | 'some' | 'lone' | 'one' ) ) ;
    public final EObject ruleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5252:6: ( ( () ( 'no' | 'some' | 'lone' | 'one' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5253:1: ( () ( 'no' | 'some' | 'lone' | 'one' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5253:1: ( () ( 'no' | 'some' | 'lone' | 'one' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5253:2: () ( 'no' | 'some' | 'lone' | 'one' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5253:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5254:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5267:2: ( 'no' | 'some' | 'lone' | 'one' )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt79=1;
                }
                break;
            case 34:
                {
                alt79=2;
                }
                break;
            case 32:
                {
                alt79=3;
                }
                break;
            case 33:
                {
                alt79=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5267:2: ( 'no' | 'some' | 'lone' | 'one' )", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5267:4: 'no'
                    {
                    match(input,75,FOLLOW_75_in_ruleCommonQuantUnOp7383); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getNoKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5272:7: 'some'
                    {
                    match(input,34,FOLLOW_34_in_ruleCommonQuantUnOp7399); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getSomeKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5277:7: 'lone'
                    {
                    match(input,32,FOLLOW_32_in_ruleCommonQuantUnOp7415); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getLoneKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5282:7: 'one'
                    {
                    match(input,33,FOLLOW_33_in_ruleCommonQuantUnOp7431); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5294:1: entryRuleCompareOp returns [String current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final String entryRuleCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5295:2: (iv_ruleCompareOp= ruleCompareOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5296:2: iv_ruleCompareOp= ruleCompareOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOp_in_entryRuleCompareOp7469);
            iv_ruleCompareOp=ruleCompareOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOp7480); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5303:1: ruleCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5308:6: ( (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5309:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5309:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            int alt80=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt80=1;
                }
                break;
            case 36:
                {
                alt80=2;
                }
                break;
            case 76:
                {
                alt80=3;
                }
                break;
            case 77:
                {
                alt80=4;
                }
                break;
            case 78:
                {
                alt80=5;
                }
                break;
            case 79:
                {
                alt80=6;
                }
                break;
            case 80:
                {
                alt80=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5309:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5310:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleCompareOp7518); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getEqualsSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5317:2: kw= 'in'
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleCompareOp7537); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getInKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5324:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_ruleCompareOp7556); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getLessThanSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5331:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleCompareOp7575); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getGreaterThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5338:2: kw= '=<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleCompareOp7594); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getEqualsSignLessThanSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5345:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleCompareOp7613); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getLessThanSignEqualsSignKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5352:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleCompareOp7632); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5365:1: entryRuleArrowOp returns [EObject current=null] : iv_ruleArrowOp= ruleArrowOp EOF ;
    public final EObject entryRuleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5366:2: (iv_ruleArrowOp= ruleArrowOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5367:2: iv_ruleArrowOp= ruleArrowOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrowOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArrowOp_in_entryRuleArrowOp7672);
            iv_ruleArrowOp=ruleArrowOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrowOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowOp7682); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5374:1: ruleArrowOp returns [EObject current=null] : ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) ) ;
    public final EObject ruleArrowOp() throws RecognitionException {
        EObject current = null;

        Token lv_arrow_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5379:6: ( ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5380:1: ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5380:1: ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5380:2: ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5380:2: ( 'some' | 'one' | 'lone' | 'set' )?
            int alt81=5;
            switch ( input.LA(1) ) {
                case 34:
                    {
                    alt81=1;
                    }
                    break;
                case 33:
                    {
                    alt81=2;
                    }
                    break;
                case 32:
                    {
                    alt81=3;
                    }
                    break;
                case 70:
                    {
                    alt81=4;
                    }
                    break;
            }

            switch (alt81) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5380:4: 'some'
                    {
                    match(input,34,FOLLOW_34_in_ruleArrowOp7718); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSomeKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5385:7: 'one'
                    {
                    match(input,33,FOLLOW_33_in_ruleArrowOp7734); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getOneKeyword_0_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5390:7: 'lone'
                    {
                    match(input,32,FOLLOW_32_in_ruleArrowOp7750); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getLoneKeyword_0_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5395:7: 'set'
                    {
                    match(input,70,FOLLOW_70_in_ruleArrowOp7766); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSetKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5399:3: ( (lv_arrow_4_0= '->' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5400:1: (lv_arrow_4_0= '->' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5400:1: (lv_arrow_4_0= '->' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5401:3: lv_arrow_4_0= '->'
            {
            lv_arrow_4_0=(Token)input.LT(1);
            match(input,81,FOLLOW_81_in_ruleArrowOp7786); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5428:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5429:2: (iv_ruleBlock= ruleBlock EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5430:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock7835);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock7845); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5437:1: ruleBlock returns [EObject current=null] : ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_leftC_0_0 = null;

        EObject lv_expr_1_0 = null;

        EObject lv_rightC_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5442:6: ( ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5443:1: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5443:1: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5443:2: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5443:2: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5444:1: (lv_leftC_0_0= ruleLeftCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5444:1: (lv_leftC_0_0= ruleLeftCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5445:3: lv_leftC_0_0= ruleLeftCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getLeftCLeftCurlyBracketParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleBlock7891);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5467:2: ( (lv_expr_1_0= ruleExpression ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( ((LA82_0>=RULE_INT && LA82_0<=RULE_NEGATIVE_INTEGER)||LA82_0==25||LA82_0==28||(LA82_0>=32 && LA82_0<=34)||(LA82_0>=38 && LA82_0<=39)||(LA82_0>=43 && LA82_0<=49)||(LA82_0>=51 && LA82_0<=52)||(LA82_0>=54 && LA82_0<=55)||(LA82_0>=70 && LA82_0<=75)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5468:1: (lv_expr_1_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5468:1: (lv_expr_1_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5469:3: lv_expr_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getExprExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBlock7912);
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
            	    break loop82;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5491:3: ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5492:1: (lv_rightC_2_0= ruleRightCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5492:1: (lv_rightC_2_0= ruleRightCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5493:3: lv_rightC_2_0= ruleRightCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getRightCRightCurlyBracketParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleBlock7934);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5523:1: entryRuleBlockOrBar returns [EObject current=null] : iv_ruleBlockOrBar= ruleBlockOrBar EOF ;
    public final EObject entryRuleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockOrBar = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5524:2: (iv_ruleBlockOrBar= ruleBlockOrBar EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5525:2: iv_ruleBlockOrBar= ruleBlockOrBar EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockOrBarRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar7970);
            iv_ruleBlockOrBar=ruleBlockOrBar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockOrBar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockOrBar7980); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5532:1: ruleBlockOrBar returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5537:6: ( ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5538:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5538:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==28) ) {
                alt83=1;
            }
            else if ( (LA83_0==82) ) {
                alt83=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5538:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5538:2: ( (lv_block_0_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5538:2: ( (lv_block_0_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5539:1: (lv_block_0_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5539:1: (lv_block_0_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5540:3: lv_block_0_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getBlockBlockParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleBlockOrBar8026);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5563:6: ( '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5563:6: ( '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5563:8: '|' ( (lv_expr_2_0= ruleExpression ) )
                    {
                    match(input,82,FOLLOW_82_in_ruleBlockOrBar8043); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockOrBarAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5567:1: ( (lv_expr_2_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5568:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5568:1: (lv_expr_2_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5569:3: lv_expr_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getExprExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBlockOrBar8064);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5599:1: entryRuleOpenName returns [EObject current=null] : iv_ruleOpenName= ruleOpenName EOF ;
    public final EObject entryRuleOpenName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5600:2: (iv_ruleOpenName= ruleOpenName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5601:2: iv_ruleOpenName= ruleOpenName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOpenNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOpenName_in_entryRuleOpenName8101);
            iv_ruleOpenName=ruleOpenName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOpenName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenName8111); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5608:1: ruleOpenName returns [EObject current=null] : ( 'open' ( (lv_importURI_1_0= ruleName ) ) ) ;
    public final EObject ruleOpenName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importURI_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5613:6: ( ( 'open' ( (lv_importURI_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5614:1: ( 'open' ( (lv_importURI_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5614:1: ( 'open' ( (lv_importURI_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5614:3: 'open' ( (lv_importURI_1_0= ruleName ) )
            {
            match(input,83,FOLLOW_83_in_ruleOpenName8146); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOpenNameAccess().getOpenKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5618:1: ( (lv_importURI_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5619:1: (lv_importURI_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5619:1: (lv_importURI_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5620:3: lv_importURI_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOpenNameAccess().getImportURINameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleOpenName8167);
            lv_importURI_1_0=ruleName();
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
              	       			"importURI",
              	        		lv_importURI_1_0, 
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5650:1: entryRuleFactName returns [EObject current=null] : iv_ruleFactName= ruleFactName EOF ;
    public final EObject entryRuleFactName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5651:2: (iv_ruleFactName= ruleFactName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5652:2: iv_ruleFactName= ruleFactName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactName_in_entryRuleFactName8203);
            iv_ruleFactName=ruleFactName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactName8213); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5659:1: ruleFactName returns [EObject current=null] : ( () 'fact' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleFactName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5664:6: ( ( () 'fact' ( (lv_name_2_0= ruleName ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5665:1: ( () 'fact' ( (lv_name_2_0= ruleName ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5665:1: ( () 'fact' ( (lv_name_2_0= ruleName ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5665:2: () 'fact' ( (lv_name_2_0= ruleName ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5665:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5666:2: 
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

            match(input,84,FOLLOW_84_in_ruleFactName8260); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFactNameAccess().getFactKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5683:1: ( (lv_name_2_0= ruleName ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID||LA84_0==52) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5684:1: (lv_name_2_0= ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5684:1: (lv_name_2_0= ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5685:3: lv_name_2_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFactNameAccess().getNameNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleFactName8281);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5715:1: entryRuleAssertionName returns [EObject current=null] : iv_ruleAssertionName= ruleAssertionName EOF ;
    public final EObject entryRuleAssertionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5716:2: (iv_ruleAssertionName= ruleAssertionName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5717:2: iv_ruleAssertionName= ruleAssertionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertionName_in_entryRuleAssertionName8318);
            iv_ruleAssertionName=ruleAssertionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertionName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionName8328); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5724:1: ruleAssertionName returns [EObject current=null] : ( () 'assert' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleAssertionName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5729:6: ( ( () 'assert' ( (lv_name_2_0= ruleName ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5730:1: ( () 'assert' ( (lv_name_2_0= ruleName ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5730:1: ( () 'assert' ( (lv_name_2_0= ruleName ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5730:2: () 'assert' ( (lv_name_2_0= ruleName ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5730:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5731:2: 
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

            match(input,85,FOLLOW_85_in_ruleAssertionName8375); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssertionNameAccess().getAssertKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5748:1: ( (lv_name_2_0= ruleName ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==52) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5749:1: (lv_name_2_0= ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5749:1: (lv_name_2_0= ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5750:3: lv_name_2_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssertionNameAccess().getNameNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleAssertionName8396);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5780:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5781:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5782:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName8433);
            iv_ruleFunctionName=ruleFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunctionName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName8443); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5789:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5794:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5795:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5795:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5796:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5796:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5797:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunctionNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleFunctionName8488);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5827:1: entryRulePredicateName returns [EObject current=null] : iv_rulePredicateName= rulePredicateName EOF ;
    public final EObject entryRulePredicateName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5828:2: (iv_rulePredicateName= rulePredicateName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5829:2: iv_rulePredicateName= rulePredicateName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredicateNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredicateName_in_entryRulePredicateName8523);
            iv_rulePredicateName=rulePredicateName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredicateName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateName8533); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5836:1: rulePredicateName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePredicateName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5841:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5842:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5842:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5843:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5843:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5844:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredicateNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePredicateName8578);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5874:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5875:2: (iv_ruleAlias= ruleAlias EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5876:2: iv_ruleAlias= ruleAlias EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAliasRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias8613);
            iv_ruleAlias=ruleAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias8623); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5883:1: ruleAlias returns [EObject current=null] : ( (lv_name_0_0= ruleNameAlias ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5888:6: ( ( (lv_name_0_0= ruleNameAlias ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5889:1: ( (lv_name_0_0= ruleNameAlias ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5889:1: ( (lv_name_0_0= ruleNameAlias ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5890:1: (lv_name_0_0= ruleNameAlias )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5890:1: (lv_name_0_0= ruleNameAlias )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5891:3: lv_name_0_0= ruleNameAlias
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAliasAccess().getNameNameAliasParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNameAlias_in_ruleAlias8668);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5921:1: entryRuleEnumName returns [EObject current=null] : iv_ruleEnumName= ruleEnumName EOF ;
    public final EObject entryRuleEnumName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5922:2: (iv_ruleEnumName= ruleEnumName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5923:2: iv_ruleEnumName= ruleEnumName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumName_in_entryRuleEnumName8703);
            iv_ruleEnumName=ruleEnumName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumName8713); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5930:1: ruleEnumName returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleEnumName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5935:6: ( ( 'enum' ( (lv_name_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5936:1: ( 'enum' ( (lv_name_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5936:1: ( 'enum' ( (lv_name_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5936:3: 'enum' ( (lv_name_1_0= ruleName ) )
            {
            match(input,86,FOLLOW_86_in_ruleEnumName8748); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumNameAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5940:1: ( (lv_name_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5941:1: (lv_name_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5941:1: (lv_name_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5942:3: lv_name_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumNameAccess().getNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumName8769);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5972:1: entryRuleEnumPropertyName returns [EObject current=null] : iv_ruleEnumPropertyName= ruleEnumPropertyName EOF ;
    public final EObject entryRuleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumPropertyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5973:2: (iv_ruleEnumPropertyName= ruleEnumPropertyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5974:2: iv_ruleEnumPropertyName= ruleEnumPropertyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumPropertyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumPropertyName_in_entryRuleEnumPropertyName8805);
            iv_ruleEnumPropertyName=ruleEnumPropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumPropertyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumPropertyName8815); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5981:1: ruleEnumPropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5986:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5987:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5987:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5988:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5988:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5989:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumPropertyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumPropertyName8860);
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


    // $ANTLR start entryRuleLetName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6019:1: entryRuleLetName returns [EObject current=null] : iv_ruleLetName= ruleLetName EOF ;
    public final EObject entryRuleLetName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6020:2: (iv_ruleLetName= ruleLetName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6021:2: iv_ruleLetName= ruleLetName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetName_in_entryRuleLetName8895);
            iv_ruleLetName=ruleLetName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetName8905); if (failed) return current;

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
    // $ANTLR end entryRuleLetName


    // $ANTLR start ruleLetName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6028:1: ruleLetName returns [EObject current=null] : ( 'let' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleLetName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6033:6: ( ( 'let' ( (lv_name_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6034:1: ( 'let' ( (lv_name_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6034:1: ( 'let' ( (lv_name_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6034:3: 'let' ( (lv_name_1_0= ruleName ) )
            {
            match(input,43,FOLLOW_43_in_ruleLetName8940); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetNameAccess().getLetKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6038:1: ( (lv_name_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6039:1: (lv_name_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6039:1: (lv_name_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6040:3: lv_name_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetNameAccess().getNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleLetName8961);
            lv_name_1_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetNameRule().getType().getClassifier());
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
    // $ANTLR end ruleLetName


    // $ANTLR start entryRuleSignatureName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6070:1: entryRuleSignatureName returns [EObject current=null] : iv_ruleSignatureName= ruleSignatureName EOF ;
    public final EObject entryRuleSignatureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignatureName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6071:2: (iv_ruleSignatureName= ruleSignatureName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6072:2: iv_ruleSignatureName= ruleSignatureName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignatureNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignatureName_in_entryRuleSignatureName8997);
            iv_ruleSignatureName=ruleSignatureName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignatureName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignatureName9007); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6079:1: ruleSignatureName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleSignatureName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6084:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6085:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6085:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6086:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6086:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6087:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignatureNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleSignatureName9052);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6117:1: entryRulePropertyName returns [EObject current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final EObject entryRulePropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6118:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6119:2: iv_rulePropertyName= rulePropertyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName9087);
            iv_rulePropertyName=rulePropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName9097); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6126:1: rulePropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePropertyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6131:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6132:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6132:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6133:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6133:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6134:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePropertyName9142);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6164:1: entryRuleExactlyName returns [EObject current=null] : iv_ruleExactlyName= ruleExactlyName EOF ;
    public final EObject entryRuleExactlyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactlyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6165:2: (iv_ruleExactlyName= ruleExactlyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6166:2: iv_ruleExactlyName= ruleExactlyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExactlyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExactlyName_in_entryRuleExactlyName9177);
            iv_ruleExactlyName=ruleExactlyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExactlyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExactlyName9187); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6173:1: ruleExactlyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleExactlyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6178:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6179:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6179:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6180:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6180:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6181:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExactlyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleExactlyName9232);
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


    // $ANTLR start entryRuleAsName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6211:1: entryRuleAsName returns [EObject current=null] : iv_ruleAsName= ruleAsName EOF ;
    public final EObject entryRuleAsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6212:2: (iv_ruleAsName= ruleAsName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6213:2: iv_ruleAsName= ruleAsName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAsNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAsName_in_entryRuleAsName9267);
            iv_ruleAsName=ruleAsName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAsName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsName9277); if (failed) return current;

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
    // $ANTLR end entryRuleAsName


    // $ANTLR start ruleAsName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6220:1: ruleAsName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleAsName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6225:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6226:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6226:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6227:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6227:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6228:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAsNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleAsName9322);
            lv_name_0_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAsNameRule().getType().getClassifier());
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
    // $ANTLR end ruleAsName


    // $ANTLR start entryRuleNameAlias
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6258:1: entryRuleNameAlias returns [String current=null] : iv_ruleNameAlias= ruleNameAlias EOF ;
    public final String entryRuleNameAlias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameAlias = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6259:2: (iv_ruleNameAlias= ruleNameAlias EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6260:2: iv_ruleNameAlias= ruleNameAlias EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameAliasRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNameAlias_in_entryRuleNameAlias9358);
            iv_ruleNameAlias=ruleNameAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNameAlias.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameAlias9369); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6267:1: ruleNameAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNameAlias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6272:6: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6273:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6273:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6273:6: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameAlias9409); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6280:1: (kw= '/' this_ID_2= RULE_ID )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==87) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6281:2: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,87,FOLLOW_87_in_ruleNameAlias9428); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getNameAliasAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameAlias9443); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6301:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6302:2: (iv_ruleName= ruleName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6303:2: iv_ruleName= ruleName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName9491);
            iv_ruleName=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName9502); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6310:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6315:6: ( ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6316:1: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6316:1: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6316:2: (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6316:2: (kw= 'this' | this_ID_1= RULE_ID )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==52) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_ID) ) {
                alt87=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6316:2: (kw= 'this' | this_ID_1= RULE_ID )", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6317:2: kw= 'this'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleName9541); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNameAccess().getThisKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6323:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName9562); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNameAccess().getIDTerminalRuleCall_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6330:2: (kw= '/' this_ID_3= RULE_ID )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==87) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6331:2: kw= '/' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,87,FOLLOW_87_in_ruleName9582); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getNameAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_3=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName9597); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop88;
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


    // $ANTLR start entryRuleReferencesName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6351:1: entryRuleReferencesName returns [EObject current=null] : iv_ruleReferencesName= ruleReferencesName EOF ;
    public final EObject entryRuleReferencesName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6352:2: (iv_ruleReferencesName= ruleReferencesName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6353:2: iv_ruleReferencesName= ruleReferencesName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferencesNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReferencesName_in_entryRuleReferencesName9644);
            iv_ruleReferencesName=ruleReferencesName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReferencesName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencesName9654); if (failed) return current;

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
    // $ANTLR end entryRuleReferencesName


    // $ANTLR start ruleReferencesName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6360:1: ruleReferencesName returns [EObject current=null] : (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_EnumName_2= ruleEnumName | this_EnumPropertyName_3= ruleEnumPropertyName | this_SignatureName_4= ruleSignatureName | this_PropertyName_5= rulePropertyName | this_ExactlyName_6= ruleExactlyName | this_LetName_7= ruleLetName | this_PredicateName_8= rulePredicateName ) ;
    public final EObject ruleReferencesName() throws RecognitionException {
        EObject current = null;

        EObject this_FactName_0 = null;

        EObject this_FunctionName_1 = null;

        EObject this_EnumName_2 = null;

        EObject this_EnumPropertyName_3 = null;

        EObject this_SignatureName_4 = null;

        EObject this_PropertyName_5 = null;

        EObject this_ExactlyName_6 = null;

        EObject this_LetName_7 = null;

        EObject this_PredicateName_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6365:6: ( (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_EnumName_2= ruleEnumName | this_EnumPropertyName_3= ruleEnumPropertyName | this_SignatureName_4= ruleSignatureName | this_PropertyName_5= rulePropertyName | this_ExactlyName_6= ruleExactlyName | this_LetName_7= ruleLetName | this_PredicateName_8= rulePredicateName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6366:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_EnumName_2= ruleEnumName | this_EnumPropertyName_3= ruleEnumPropertyName | this_SignatureName_4= ruleSignatureName | this_PropertyName_5= rulePropertyName | this_ExactlyName_6= ruleExactlyName | this_LetName_7= ruleLetName | this_PredicateName_8= rulePredicateName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6366:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_EnumName_2= ruleEnumName | this_EnumPropertyName_3= ruleEnumPropertyName | this_SignatureName_4= ruleSignatureName | this_PropertyName_5= rulePropertyName | this_ExactlyName_6= ruleExactlyName | this_LetName_7= ruleLetName | this_PredicateName_8= rulePredicateName )
            int alt89=9;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt89=1;
                }
                break;
            case 52:
                {
                int LA89_2 = input.LA(2);

                if ( (synpred155()) ) {
                    alt89=2;
                }
                else if ( (synpred157()) ) {
                    alt89=4;
                }
                else if ( (synpred158()) ) {
                    alt89=5;
                }
                else if ( (synpred159()) ) {
                    alt89=6;
                }
                else if ( (synpred160()) ) {
                    alt89=7;
                }
                else if ( (true) ) {
                    alt89=9;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6366:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_EnumName_2= ruleEnumName | this_EnumPropertyName_3= ruleEnumPropertyName | this_SignatureName_4= ruleSignatureName | this_PropertyName_5= rulePropertyName | this_ExactlyName_6= ruleExactlyName | this_LetName_7= ruleLetName | this_PredicateName_8= rulePredicateName )", 89, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA89_3 = input.LA(2);

                if ( (synpred155()) ) {
                    alt89=2;
                }
                else if ( (synpred157()) ) {
                    alt89=4;
                }
                else if ( (synpred158()) ) {
                    alt89=5;
                }
                else if ( (synpred159()) ) {
                    alt89=6;
                }
                else if ( (synpred160()) ) {
                    alt89=7;
                }
                else if ( (true) ) {
                    alt89=9;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6366:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_EnumName_2= ruleEnumName | this_EnumPropertyName_3= ruleEnumPropertyName | this_SignatureName_4= ruleSignatureName | this_PropertyName_5= rulePropertyName | this_ExactlyName_6= ruleExactlyName | this_LetName_7= ruleLetName | this_PredicateName_8= rulePredicateName )", 89, 3, input);

                    throw nvae;
                }
                }
                break;
            case 86:
                {
                alt89=3;
                }
                break;
            case 43:
                {
                alt89=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6366:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_EnumName_2= ruleEnumName | this_EnumPropertyName_3= ruleEnumPropertyName | this_SignatureName_4= ruleSignatureName | this_PropertyName_5= rulePropertyName | this_ExactlyName_6= ruleExactlyName | this_LetName_7= ruleLetName | this_PredicateName_8= rulePredicateName )", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6367:2: this_FactName_0= ruleFactName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getFactNameParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFactName_in_ruleReferencesName9704);
                    this_FactName_0=ruleFactName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FactName_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6380:2: this_FunctionName_1= ruleFunctionName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getFunctionNameParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionName_in_ruleReferencesName9734);
                    this_FunctionName_1=ruleFunctionName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FunctionName_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6393:2: this_EnumName_2= ruleEnumName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getEnumNameParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumName_in_ruleReferencesName9764);
                    this_EnumName_2=ruleEnumName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumName_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6406:2: this_EnumPropertyName_3= ruleEnumPropertyName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getEnumPropertyNameParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleReferencesName9794);
                    this_EnumPropertyName_3=ruleEnumPropertyName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumPropertyName_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6419:2: this_SignatureName_4= ruleSignatureName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getSignatureNameParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignatureName_in_ruleReferencesName9824);
                    this_SignatureName_4=ruleSignatureName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SignatureName_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6432:2: this_PropertyName_5= rulePropertyName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getPropertyNameParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyName_in_ruleReferencesName9854);
                    this_PropertyName_5=rulePropertyName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PropertyName_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6445:2: this_ExactlyName_6= ruleExactlyName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getExactlyNameParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExactlyName_in_ruleReferencesName9884);
                    this_ExactlyName_6=ruleExactlyName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ExactlyName_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6458:2: this_LetName_7= ruleLetName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getLetNameParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetName_in_ruleReferencesName9914);
                    this_LetName_7=ruleLetName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LetName_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6471:2: this_PredicateName_8= rulePredicateName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getPredicateNameParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePredicateName_in_ruleReferencesName9944);
                    this_PredicateName_8=rulePredicateName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PredicateName_8; 
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
    // $ANTLR end ruleReferencesName


    // $ANTLR start entryRuleReferencesSig
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6490:1: entryRuleReferencesSig returns [EObject current=null] : iv_ruleReferencesSig= ruleReferencesSig EOF ;
    public final EObject entryRuleReferencesSig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesSig = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6491:2: (iv_ruleReferencesSig= ruleReferencesSig EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6492:2: iv_ruleReferencesSig= ruleReferencesSig EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferencesSigRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReferencesSig_in_entryRuleReferencesSig9979);
            iv_ruleReferencesSig=ruleReferencesSig();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReferencesSig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencesSig9989); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6499:1: ruleReferencesSig returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) ;
    public final EObject ruleReferencesSig() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6504:6: ( ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6505:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6505:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6505:2: () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6505:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6506:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6519:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            int alt90=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt90=1;
                }
                break;
            case 46:
                {
                alt90=2;
                }
                break;
            case 47:
                {
                alt90=3;
                }
                break;
            case 48:
                {
                alt90=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6519:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6519:3: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6519:3: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6520:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6520:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6521:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferencesSig10049); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getReferencesSigAccess().getNameRefSignatureNameCrossReference_1_0_0(), "nameRef"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6537:7: 'univ'
                    {
                    match(input,46,FOLLOW_46_in_ruleReferencesSig10065); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getUnivKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6542:7: 'Int'
                    {
                    match(input,47,FOLLOW_47_in_ruleReferencesSig10081); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getIntKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6547:7: 'seq/Int'
                    {
                    match(input,48,FOLLOW_48_in_ruleReferencesSig10097); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6559:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6560:2: (iv_ruleRef= ruleRef EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6561:2: iv_ruleRef= ruleRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef10134);
            iv_ruleRef=ruleRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef10144); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6568:1: ruleRef returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6573:6: ( ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6574:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6574:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6574:2: () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6574:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6575:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6588:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            int alt91=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt91=1;
                }
                break;
            case 46:
                {
                alt91=2;
                }
                break;
            case 47:
                {
                alt91=3;
                }
                break;
            case 48:
                {
                alt91=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6588:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6588:3: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6588:3: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6589:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6589:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6590:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef10204); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRefAccess().getNameRefReferencesNameCrossReference_1_0_0(), "nameRef"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6606:7: 'univ'
                    {
                    match(input,46,FOLLOW_46_in_ruleRef10220); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getUnivKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6611:7: 'Int'
                    {
                    match(input,47,FOLLOW_47_in_ruleRef10236); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getIntKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6616:7: 'seq/Int'
                    {
                    match(input,48,FOLLOW_48_in_ruleRef10252); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6628:1: entryRuleLeftCurlyBracket returns [EObject current=null] : iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF ;
    public final EObject entryRuleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftCurlyBracket = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6629:2: (iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6630:2: iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftCurlyBracketRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_entryRuleLeftCurlyBracket10289);
            iv_ruleLeftCurlyBracket=ruleLeftCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftCurlyBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftCurlyBracket10299); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6637:1: ruleLeftCurlyBracket returns [EObject current=null] : ( (lv_leftCurlyBracket_0_0= '{' ) ) ;
    public final EObject ruleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_leftCurlyBracket_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6642:6: ( ( (lv_leftCurlyBracket_0_0= '{' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6643:1: ( (lv_leftCurlyBracket_0_0= '{' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6643:1: ( (lv_leftCurlyBracket_0_0= '{' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6644:1: (lv_leftCurlyBracket_0_0= '{' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6644:1: (lv_leftCurlyBracket_0_0= '{' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6645:3: lv_leftCurlyBracket_0_0= '{'
            {
            lv_leftCurlyBracket_0_0=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleLeftCurlyBracket10341); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6672:1: entryRuleRightCurlyBracket returns [EObject current=null] : iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF ;
    public final EObject entryRuleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightCurlyBracket = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6673:2: (iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6674:2: iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightCurlyBracketRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_entryRuleRightCurlyBracket10389);
            iv_ruleRightCurlyBracket=ruleRightCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightCurlyBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightCurlyBracket10399); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6681:1: ruleRightCurlyBracket returns [EObject current=null] : ( (lv_rightCurlyBracket_0_0= '}' ) ) ;
    public final EObject ruleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_rightCurlyBracket_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6686:6: ( ( (lv_rightCurlyBracket_0_0= '}' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6687:1: ( (lv_rightCurlyBracket_0_0= '}' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6687:1: ( (lv_rightCurlyBracket_0_0= '}' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6688:1: (lv_rightCurlyBracket_0_0= '}' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6688:1: (lv_rightCurlyBracket_0_0= '}' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6689:3: lv_rightCurlyBracket_0_0= '}'
            {
            lv_rightCurlyBracket_0_0=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleRightCurlyBracket10441); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6716:1: entryRuleDot returns [EObject current=null] : iv_ruleDot= ruleDot EOF ;
    public final EObject entryRuleDot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDot = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6717:2: (iv_ruleDot= ruleDot EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6718:2: iv_ruleDot= ruleDot EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDotRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDot_in_entryRuleDot10489);
            iv_ruleDot=ruleDot();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDot10499); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6725:1: ruleDot returns [EObject current=null] : ( (lv_dot_0_0= '.' ) ) ;
    public final EObject ruleDot() throws RecognitionException {
        EObject current = null;

        Token lv_dot_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6730:6: ( ( (lv_dot_0_0= '.' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6731:1: ( (lv_dot_0_0= '.' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6731:1: ( (lv_dot_0_0= '.' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6732:1: (lv_dot_0_0= '.' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6732:1: (lv_dot_0_0= '.' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6733:3: lv_dot_0_0= '.'
            {
            lv_dot_0_0=(Token)input.LT(1);
            match(input,88,FOLLOW_88_in_ruleDot10541); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6760:1: entryRuleComma returns [EObject current=null] : iv_ruleComma= ruleComma EOF ;
    public final EObject entryRuleComma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComma = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6761:2: (iv_ruleComma= ruleComma EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6762:2: iv_ruleComma= ruleComma EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommaRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleComma_in_entryRuleComma10589);
            iv_ruleComma=ruleComma();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComma; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComma10599); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6769:1: ruleComma returns [EObject current=null] : ( (lv_comma_0_0= ',' ) ) ;
    public final EObject ruleComma() throws RecognitionException {
        EObject current = null;

        Token lv_comma_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6774:6: ( ( (lv_comma_0_0= ',' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6775:1: ( (lv_comma_0_0= ',' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6775:1: ( (lv_comma_0_0= ',' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6776:1: (lv_comma_0_0= ',' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6776:1: (lv_comma_0_0= ',' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6777:3: lv_comma_0_0= ','
            {
            lv_comma_0_0=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_ruleComma10641); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6804:1: entryRuleColon returns [EObject current=null] : iv_ruleColon= ruleColon EOF ;
    public final EObject entryRuleColon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColon = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6805:2: (iv_ruleColon= ruleColon EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6806:2: iv_ruleColon= ruleColon EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getColonRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleColon_in_entryRuleColon10689);
            iv_ruleColon=ruleColon();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleColon; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColon10699); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6813:1: ruleColon returns [EObject current=null] : ( (lv_colon_0_0= ':' ) ) ;
    public final EObject ruleColon() throws RecognitionException {
        EObject current = null;

        Token lv_colon_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6818:6: ( ( (lv_colon_0_0= ':' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6819:1: ( (lv_colon_0_0= ':' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6819:1: ( (lv_colon_0_0= ':' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6820:1: (lv_colon_0_0= ':' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6820:1: (lv_colon_0_0= ':' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6821:3: lv_colon_0_0= ':'
            {
            lv_colon_0_0=(Token)input.LT(1);
            match(input,18,FOLLOW_18_in_ruleColon10741); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6848:1: entryRuleLeftParenthesis returns [EObject current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final EObject entryRuleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftParenthesis = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6849:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6850:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftParenthesisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis10789);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftParenthesis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis10799); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6857:1: ruleLeftParenthesis returns [EObject current=null] : ( (lv_leftParenthesis_0_0= '(' ) ) ;
    public final EObject ruleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_leftParenthesis_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6862:6: ( ( (lv_leftParenthesis_0_0= '(' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6863:1: ( (lv_leftParenthesis_0_0= '(' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6863:1: ( (lv_leftParenthesis_0_0= '(' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6864:1: (lv_leftParenthesis_0_0= '(' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6864:1: (lv_leftParenthesis_0_0= '(' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6865:3: lv_leftParenthesis_0_0= '('
            {
            lv_leftParenthesis_0_0=(Token)input.LT(1);
            match(input,49,FOLLOW_49_in_ruleLeftParenthesis10841); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6892:1: entryRuleRightParenthesis returns [EObject current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final EObject entryRuleRightParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightParenthesis = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6893:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6894:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightParenthesisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis10889);
            iv_ruleRightParenthesis=ruleRightParenthesis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightParenthesis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis10899); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6901:1: ruleRightParenthesis returns [EObject current=null] : ( (lv_rightParenthesis_0_0= ')' ) ) ;
    public final EObject ruleRightParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_rightParenthesis_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6906:6: ( ( (lv_rightParenthesis_0_0= ')' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6907:1: ( (lv_rightParenthesis_0_0= ')' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6907:1: ( (lv_rightParenthesis_0_0= ')' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6908:1: (lv_rightParenthesis_0_0= ')' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6908:1: (lv_rightParenthesis_0_0= ')' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6909:3: lv_rightParenthesis_0_0= ')'
            {
            lv_rightParenthesis_0_0=(Token)input.LT(1);
            match(input,50,FOLLOW_50_in_ruleRightParenthesis10941); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6936:1: entryRuleLeftSquareBracketKeyword returns [EObject current=null] : iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF ;
    public final EObject entryRuleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSquareBracketKeyword = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6937:2: (iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6938:2: iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftSquareBracketKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_entryRuleLeftSquareBracketKeyword10989);
            iv_ruleLeftSquareBracketKeyword=ruleLeftSquareBracketKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftSquareBracketKeyword10999); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6945:1: ruleLeftSquareBracketKeyword returns [EObject current=null] : ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) ;
    public final EObject ruleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_leftSquareBracketKeyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6950:6: ( ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6951:1: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6951:1: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6952:1: (lv_leftSquareBracketKeyword_0_0= '[' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6952:1: (lv_leftSquareBracketKeyword_0_0= '[' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6953:3: lv_leftSquareBracketKeyword_0_0= '['
            {
            lv_leftSquareBracketKeyword_0_0=(Token)input.LT(1);
            match(input,89,FOLLOW_89_in_ruleLeftSquareBracketKeyword11041); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6980:1: entryRuleRightSquareBracketKeyword returns [EObject current=null] : iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF ;
    public final EObject entryRuleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSquareBracketKeyword = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6981:2: (iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6982:2: iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightSquareBracketKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_entryRuleRightSquareBracketKeyword11089);
            iv_ruleRightSquareBracketKeyword=ruleRightSquareBracketKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightSquareBracketKeyword11099); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6989:1: ruleRightSquareBracketKeyword returns [EObject current=null] : ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) ;
    public final EObject ruleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_rightSquareBracketKeyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6994:6: ( ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6995:1: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6995:1: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6996:1: (lv_rightSquareBracketKeyword_0_0= ']' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6996:1: (lv_rightSquareBracketKeyword_0_0= ']' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6997:3: lv_rightSquareBracketKeyword_0_0= ']'
            {
            lv_rightSquareBracketKeyword_0_0=(Token)input.LT(1);
            match(input,90,FOLLOW_90_in_ruleRightSquareBracketKeyword11141); if (failed) return current;
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

    // $ANTLR start synpred75
    public final void synpred75_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:2: ( ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:2: ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:2: ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:3: ( ( ruleBinOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:3: ( ( ruleBinOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3293:1: ( ruleBinOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3293:1: ( ruleBinOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3294:3: ruleBinOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBinOp_in_synpred754616);
        ruleBinOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3316:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3317:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3317:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3318:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred754637);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred75

    // $ANTLR start synpred76
    public final void synpred76_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:6: ( ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:6: ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:6: ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:7: ( ( ruleArrowOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3341:7: ( ( ruleArrowOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3342:1: ( ruleArrowOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3342:1: ( ruleArrowOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3343:3: ruleArrowOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleArrowOp_in_synpred764666);
        ruleArrowOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3365:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3366:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3366:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3367:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred764687);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred76

    // $ANTLR start synpred79
    public final void synpred79_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:6: ( ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:6: ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:6: ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:7: ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:7: ( '!' | 'not' )?
        int alt121=2;
        int LA121_0 = input.LA(1);

        if ( ((LA121_0>=38 && LA121_0<=39)) ) {
            alt121=1;
        }
        switch (alt121) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:
                {
                if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred794704);    throw mse;
                }


                }
                break;

        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3399:3: ( ( ruleCompareOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3400:1: ( ruleCompareOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3400:1: ( ruleCompareOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3401:3: ruleCompareOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareOp_in_synpred794745);
        ruleCompareOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3423:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3424:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3424:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3425:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred794766);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred79

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:4: ( 'else' ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:4: 'else' ( ( ruleExpression ) )
        {
        match(input,42,FOLLOW_42_in_synpred814834); if (failed) return ;
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3485:1: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3486:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3486:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3487:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred814855);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred81

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:6: ( ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:6: ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:6: ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3448:7: ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )?
        {
        if ( (input.LA(1)>=40 && input.LA(1)<=41) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred824783);    throw mse;
        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3457:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3458:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3458:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3459:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred824823);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:2: ( 'else' ( ( ruleExpression ) ) )?
        int alt122=2;
        int LA122_0 = input.LA(1);

        if ( (LA122_0==42) ) {
            alt122=1;
        }
        switch (alt122) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:4: 'else' ( ( ruleExpression ) )
                {
                match(input,42,FOLLOW_42_in_synpred824834); if (failed) return ;
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3485:1: ( ( ruleExpression ) )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3486:1: ( ruleExpression )
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3486:1: ( ruleExpression )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3487:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred824855);
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
    // $ANTLR end synpred82

    // $ANTLR start synpred85
    public final void synpred85_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:6: ( ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:6: ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:6: ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:7: ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3510:7: ( ( ruleLeftSquareBracketKeyword ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3511:1: ( ruleLeftSquareBracketKeyword )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3511:1: ( ruleLeftSquareBracketKeyword )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3512:3: ruleLeftSquareBracketKeyword
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_4_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_synpred854886);
        ruleLeftSquareBracketKeyword();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3534:2: ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( ((LA125_0>=RULE_INT && LA125_0<=RULE_NEGATIVE_INTEGER)||LA125_0==25||LA125_0==28||(LA125_0>=32 && LA125_0<=34)||(LA125_0>=38 && LA125_0<=39)||(LA125_0>=43 && LA125_0<=49)||(LA125_0>=51 && LA125_0<=52)||(LA125_0>=54 && LA125_0<=55)||(LA125_0>=70 && LA125_0<=75)) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3534:3: ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )*
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3534:3: ( ( ruleExpression ) )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3535:1: ( ruleExpression )
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3535:1: ( ruleExpression )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3536:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred854908);
                ruleExpression();
                _fsp--;
                if (failed) return ;

                }


                }

                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3558:2: ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )*
                loop124:
                do {
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==29) ) {
                        alt124=1;
                    }


                    switch (alt124) {
                	case 1 :
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3558:3: ( ( ruleComma ) ) ( ( ruleExpression ) )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3558:3: ( ( ruleComma ) )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3559:1: ( ruleComma )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3559:1: ( ruleComma )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3560:3: ruleComma
                	    {
                	    if ( backtracking==0 ) {
                	       
                	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0(), currentNode); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleComma_in_synpred854930);
                	    ruleComma();
                	    _fsp--;
                	    if (failed) return ;

                	    }


                	    }

                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3582:2: ( ( ruleExpression ) )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3583:1: ( ruleExpression )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3583:1: ( ruleExpression )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3584:3: ruleExpression
                	    {
                	    if ( backtracking==0 ) {
                	       
                	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0(), currentNode); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred854951);
                	    ruleExpression();
                	    _fsp--;
                	    if (failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop124;
                    }
                } while (true);


                }
                break;

        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3606:6: ( ( ruleRightSquareBracketKeyword ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3607:1: ( ruleRightSquareBracketKeyword )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3607:1: ( ruleRightSquareBracketKeyword )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3608:3: ruleRightSquareBracketKeyword
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_synpred854976);
        ruleRightSquareBracketKeyword();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred85

    // $ANTLR start synpred92
    public final void synpred92_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:3: ( ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:3: ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:3: ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:4: ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4021:4: ( ( ruleDecl ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4022:1: ( ruleDecl )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4022:1: ( ruleDecl )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4023:3: ruleDecl
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleDecl_in_synpred925435);
        ruleDecl();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4045:2: ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )*
        loop128:
        do {
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==29) ) {
                alt128=1;
            }


            switch (alt128) {
        	case 1 :
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4045:3: ( ( ruleComma ) ) ( ( ruleDecl ) )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4045:3: ( ( ruleComma ) )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4046:1: ( ruleComma )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4046:1: ( ruleComma )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4047:3: ruleComma
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_3_2_0_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleComma_in_synpred925457);
        	    ruleComma();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4069:2: ( ( ruleDecl ) )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4070:1: ( ruleDecl )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4070:1: ( ruleDecl )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4071:3: ruleDecl
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleDecl_in_synpred925478);
        	    ruleDecl();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop128;
            }
        } while (true);

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4093:4: ( ( ruleBlockOrBar ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4094:1: ( ruleBlockOrBar )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4094:1: ( ruleBlockOrBar )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4095:3: ruleBlockOrBar
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_3_2_0_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBlockOrBar_in_synpred925501);
        ruleBlockOrBar();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred92

    // $ANTLR start synpred155
    public final void synpred155_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6380:2: ( ruleFunctionName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6380:2: ruleFunctionName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleFunctionName_in_synpred1559734);
        ruleFunctionName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred155

    // $ANTLR start synpred157
    public final void synpred157_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6406:2: ( ruleEnumPropertyName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6406:2: ruleEnumPropertyName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleEnumPropertyName_in_synpred1579794);
        ruleEnumPropertyName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred157

    // $ANTLR start synpred158
    public final void synpred158_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6419:2: ( ruleSignatureName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6419:2: ruleSignatureName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSignatureName_in_synpred1589824);
        ruleSignatureName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred158

    // $ANTLR start synpred159
    public final void synpred159_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6432:2: ( rulePropertyName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6432:2: rulePropertyName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePropertyName_in_synpred1599854);
        rulePropertyName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred159

    // $ANTLR start synpred160
    public final void synpred160_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6445:2: ( ruleExactlyName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6445:2: ruleExactlyName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleExactlyName_in_synpred1609884);
        ruleExactlyName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred160

    public final boolean synpred81() {
        backtracking++;
        int start = input.mark();
        try {
            synpred81_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred82() {
        backtracking++;
        int start = input.mark();
        try {
            synpred82_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred92() {
        backtracking++;
        int start = input.mark();
        try {
            synpred92_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred160() {
        backtracking++;
        int start = input.mark();
        try {
            synpred160_fragment(); // can never throw exception
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
    public final boolean synpred85() {
        backtracking++;
        int start = input.mark();
        try {
            synpred85_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred159() {
        backtracking++;
        int start = input.mark();
        try {
            synpred159_fragment(); // can never throw exception
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
    public final boolean synpred155() {
        backtracking++;
        int start = input.mark();
        try {
            synpred155_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred158() {
        backtracking++;
        int start = input.mark();
        try {
            synpred158_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred157() {
        backtracking++;
        int start = input.mark();
        try {
            synpred157_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\17\uffff";
    static final String DFA13_eofS =
        "\17\uffff";
    static final String DFA13_minS =
        "\1\5\2\uffff\1\16\2\uffff\1\22\5\uffff\1\5\1\23\1\22";
    static final String DFA13_maxS =
        "\1\126\2\uffff\1\42\2\uffff\1\127\5\uffff\1\5\1\24\1\127";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10\1\11\3"+
        "\uffff";
    static final String DFA13_specialS =
        "\17\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\6\10\uffff\1\3\1\uffff\1\4\1\5\1\uffff\1\7\1\10\6\uffff\1"+
            "\13\3\uffff\4\13\10\uffff\1\12\50\uffff\1\1\1\2\1\11",
            "",
            "",
            "\1\13\1\uffff\1\4\1\5\11\uffff\1\13\3\uffff\4\13",
            "",
            "",
            "\1\15\104\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\7\1\10",
            "\1\15\104\uffff\1\14"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "630:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_LetOutDecl_7= ruleLetOutDecl | this_SigDecl_8= ruleSigDecl )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecification91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSpecification137 = new BitSet(new long[]{0x00000807881B4022L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleOpen_in_ruleSpecification159 = new BitSet(new long[]{0x00000807881B4022L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleSpecification181 = new BitSet(new long[]{0x00000807881B4022L,0x0000000000700000L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModule263 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleModule284 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleModule306 = new BitSet(new long[]{0x0010000000002020L});
    public static final BitSet FOLLOW_13_in_ruleModule324 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleExactlyName_in_ruleModule359 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleModule381 = new BitSet(new long[]{0x0010000000002030L});
    public static final BitSet FOLLOW_13_in_ruleModule401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleModule432 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleExactlyName_in_ruleModule465 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleModule489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpen537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpen573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpenName_in_ruleOpen596 = new BitSet(new long[]{0x0000000000008002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleOpen618 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen639 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleOpen661 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen682 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleOpen705 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOpen718 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleAsName_in_ruleOpen739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_ruleParagraph837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_ruleParagraph867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_ruleParagraph897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_ruleParagraph927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_ruleParagraph957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_ruleParagraph987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleParagraph1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetOutDecl_in_ruleParagraph1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_ruleParagraph1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_entryRuleFactDecl1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactDecl1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_ruleFactDecl1168 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFactDecl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertDecl1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionName_in_ruleAssertDecl1281 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAssertDecl1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_entryRuleFunDecl1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunDecl1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunDecl1384 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunDecl1396 = new BitSet(new long[]{0x0011C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleFunDecl1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_ruleFunDecl1439 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunDecl1462 = new BitSet(new long[]{0x0002000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleFunDecl1485 = new BitSet(new long[]{0x0030000000004020L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1507 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleFunDecl1529 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1550 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleFunDecl1575 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleFunDecl1604 = new BitSet(new long[]{0x0034000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1626 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleFunDecl1648 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1669 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleFunDecl1694 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleFunDecl1718 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunDecl1739 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFunDecl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_entryRulePredDecl1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredDecl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePredDecl1842 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePredDecl1854 = new BitSet(new long[]{0x0011C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_rulePredDecl1876 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_rulePredDecl1897 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_rulePredicateName_in_rulePredDecl1920 = new BitSet(new long[]{0x0002000010000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_rulePredDecl1943 = new BitSet(new long[]{0x0030000000004020L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl1965 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_rulePredDecl1987 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2008 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_rulePredDecl2033 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_rulePredDecl2062 = new BitSet(new long[]{0x0034000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2084 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_ruleComma_in_rulePredDecl2106 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2127 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_rulePredDecl2152 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePredDecl2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_entryRuleRunDecl2212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunDecl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleRunDecl2269 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRunDecl2279 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRunDecl2291 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRunDecl2314 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleRunDecl2341 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleRunDecl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckDecl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleCheckDecl2456 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCheckDecl2466 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCheckDecl2478 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckDecl2501 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCheckDecl2528 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleCheckDecl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_entryRuleScope2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScope2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope2644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2653 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope2704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2713 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleScope2722 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2743 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleScope2765 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2786 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope2840 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2861 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleScope2883 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2904 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpectation_in_entryRuleExpectation3007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpectation3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleExpectation3052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpectation3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypescope_in_entryRuleTypescope3110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypescope3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypescope3168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTypescope3179 = new BitSet(new long[]{0x0000000003000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypescope3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTypescope3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTypescope3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_ruleEnumDecl3328 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleEnumDecl3349 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3370 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleEnumDecl3392 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3413 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleEnumDecl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetOutDecl_in_entryRuleLetOutDecl3472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetOutDecl3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetName_in_ruleLetOutDecl3528 = new BitSet(new long[]{0x0000000014000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleLetOutDecl3550 = new BitSet(new long[]{0x0010080000000020L,0x0000000004500000L});
    public static final BitSet FOLLOW_ruleReferencesName_in_ruleLetOutDecl3572 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleLetOutDecl3594 = new BitSet(new long[]{0x0010080000000020L,0x0000000000500000L});
    public static final BitSet FOLLOW_ruleReferencesName_in_ruleLetOutDecl3615 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleLetOutDecl3640 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleLetOutDecl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLetOutDecl3681 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetOutDecl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_entryRuleSigDecl3740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigDecl3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_ruleSigDecl3801 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSigDecl3812 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleSigDecl3833 = new BitSet(new long[]{0x0000001830000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleSigDecl3855 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleSigDecl3876 = new BitSet(new long[]{0x0000001830000000L});
    public static final BitSet FOLLOW_ruleSigExt_in_ruleSigDecl3899 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSigDecl3910 = new BitSet(new long[]{0x0030000040004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl3932 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleSigDecl3951 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl3985 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleSigDecl3999 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSigDecl4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_entryRuleSigQual4057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigQual4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSigQual4112 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_32_in_ruleSigQual4141 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_33_in_ruleSigQual4170 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_34_in_ruleSigQual4199 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_14_in_ruleSigQual4228 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_31_in_ruleSigQual4255 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_32_in_ruleSigQual4271 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_33_in_ruleSigQual4287 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_34_in_ruleSigQual4303 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_14_in_ruleSigQual4319 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_ruleSigExt_in_entryRuleSigExt4357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExt4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSigExt4403 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSigExt4442 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4463 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleSigExt4474 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4495 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression4594 = new BitSet(new long[]{0xFF0003F704000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_ruleBinOp_in_ruleExpression4616 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4637 = new BitSet(new long[]{0xFF0003F704000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_ruleArrowOp_in_ruleExpression4666 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4687 = new BitSet(new long[]{0xFF0003F704000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_38_in_ruleExpression4706 = new BitSet(new long[]{0x0000001004000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_39_in_ruleExpression4722 = new BitSet(new long[]{0x0000001004000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_ruleCompareOp_in_ruleExpression4745 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4766 = new BitSet(new long[]{0xFF0003F704000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_40_in_ruleExpression4785 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_41_in_ruleExpression4801 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4823 = new BitSet(new long[]{0xFF0007F704000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_42_in_ruleExpression4834 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4855 = new BitSet(new long[]{0xFF0003F704000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleExpression4886 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000004000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4908 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleExpression4930 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4951 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleExpression4976 = new BitSet(new long[]{0xFF0003F704000002L,0x000000000303F07FL});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression5015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTerminalExpression5081 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpression5115 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5137 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpression5158 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuant_in_ruleTerminalExpression5222 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5243 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5265 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5286 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOp_in_ruleTerminalExpression5350 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonQuantUnOp_in_ruleTerminalExpression5412 = new BitSet(new long[]{0x00FBF8C712004070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5435 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5457 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5478 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATIVE_INTEGER_in_ruleTerminalExpression5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTerminalExpression5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTerminalExpression5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTerminalExpression5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTerminalExpression5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTerminalExpression5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTerminalExpression5879 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5913 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTerminalExpression5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTerminalExpression5975 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTerminalExpression6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleTerminalExpression6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleTerminalExpression6099 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression6120 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression6142 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression6163 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression6186 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleTerminalExpression6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl6244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDecl6290 = new BitSet(new long[]{0x0030000000000020L});
    public static final BitSet FOLLOW_53_in_ruleDecl6303 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleDecl6326 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleDecl6348 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleDecl6369 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleDecl6392 = new BitSet(new long[]{0x00FBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_53_in_ruleDecl6403 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDecl6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDecl_in_entryRuleLetDecl6462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDecl6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleLetDecl6518 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLetDecl6528 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetDecl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuant_in_entryRuleQuant6586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuant6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleQuant6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQuant6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_entryRuleBinOp6694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinOp6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBinOp6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBinOp6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBinOp6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBinOp6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBinOp6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBinOp6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBinOp6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBinOp6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBinOp6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleBinOp6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBinOp6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBinOp6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_ruleBinOp6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBinOp6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBinOp6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBinOp7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOp_in_entryRuleUnOp7040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOp7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUnOp7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleUnOp7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnOp7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUnOp7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleUnOp7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleUnOp7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUnOp7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleUnOp7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonQuantUnOp_in_entryRuleCommonQuantUnOp7325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonQuantUnOp7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCommonQuantUnOp7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCommonQuantUnOp7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCommonQuantUnOp7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCommonQuantUnOp7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOp_in_entryRuleCompareOp7469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOp7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompareOp7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCompareOp7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCompareOp7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCompareOp7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleCompareOp7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleCompareOp7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleCompareOp7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_entryRuleArrowOp7672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowOp7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleArrowOp7718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_33_in_ruleArrowOp7734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_32_in_ruleArrowOp7750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_70_in_ruleArrowOp7766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleArrowOp7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock7835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleBlock7891 = new BitSet(new long[]{0x00DBF8C752000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlock7912 = new BitSet(new long[]{0x00DBF8C752000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleBlock7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar7970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOrBar7980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockOrBar8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleBlockOrBar8043 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlockOrBar8064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenName_in_entryRuleOpenName8101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenName8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOpenName8146 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleOpenName8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_entryRuleFactName8203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactName8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFactName8260 = new BitSet(new long[]{0x0010000000000022L});
    public static final BitSet FOLLOW_ruleName_in_ruleFactName8281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionName_in_entryRuleAssertionName8318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionName8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAssertionName8375 = new BitSet(new long[]{0x0010000000000022L});
    public static final BitSet FOLLOW_ruleName_in_ruleAssertionName8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleFunctionName8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateName_in_entryRulePredicateName8523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateName8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePredicateName8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias8613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameAlias_in_ruleAlias8668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_entryRuleEnumName8703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumName8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleEnumName8748 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumName8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_entryRuleEnumPropertyName8805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumPropertyName8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumPropertyName8860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetName_in_entryRuleLetName8895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetName8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLetName8940 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleLetName8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignatureName_in_entryRuleSignatureName8997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignatureName9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleSignatureName9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName9087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyName9142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExactlyName_in_entryRuleExactlyName9177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExactlyName9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleExactlyName9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsName_in_entryRuleAsName9267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsName9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAsName9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameAlias_in_entryRuleNameAlias9358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameAlias9369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameAlias9409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleNameAlias9428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameAlias9443 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName9491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName9502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleName9541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName9562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleName9582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName9597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleReferencesName_in_entryRuleReferencesName9644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencesName9654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_ruleReferencesName9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleReferencesName9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_ruleReferencesName9764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleReferencesName9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleReferencesName9824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleReferencesName9854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExactlyName_in_ruleReferencesName9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetName_in_ruleReferencesName9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateName_in_ruleReferencesName9944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_entryRuleReferencesSig9979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencesSig9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferencesSig10049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReferencesSig10065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReferencesSig10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReferencesSig10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef10134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRef10220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRef10236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRef10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_entryRuleLeftCurlyBracket10289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftCurlyBracket10299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLeftCurlyBracket10341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_entryRuleRightCurlyBracket10389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightCurlyBracket10399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRightCurlyBracket10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_entryRuleDot10489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDot10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDot10541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_entryRuleComma10589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComma10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleComma10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_entryRuleColon10689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColon10699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleColon10741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis10789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis10799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLeftParenthesis10841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis10889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis10899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleRightParenthesis10941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_entryRuleLeftSquareBracketKeyword10989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftSquareBracketKeyword10999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLeftSquareBracketKeyword11041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_entryRuleRightSquareBracketKeyword11089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightSquareBracketKeyword11099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRightSquareBracketKeyword11141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_synpred754616 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred754637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_synpred764666 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred764687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred794704 = new BitSet(new long[]{0x0000001004000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_ruleCompareOp_in_synpred794745 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred794766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred814834 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred814855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred824783 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred824823 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_synpred824834 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred824855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_synpred854886 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000004000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred854908 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_synpred854930 = new BitSet(new long[]{0x00DBF8C712000070L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred854951 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_synpred854976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_synpred925435 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleComma_in_synpred925457 = new BitSet(new long[]{0x0030000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_synpred925478 = new BitSet(new long[]{0x0000000030000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_synpred925501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_synpred1559734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_synpred1579794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignatureName_in_synpred1589824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_synpred1599854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExactlyName_in_synpred1609884 = new BitSet(new long[]{0x0000000000000002L});

}