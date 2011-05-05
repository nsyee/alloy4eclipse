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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NEGATIVE_INTEGER", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'exactly'", "'private'", "'as'", "'fun'", "'pred'", "':'", "'run'", "'check'", "'for'", "'but'", "'expect'", "'int'", "'seq'", "'='", "'sig'", "'{'", "','", "'}'", "'abstract'", "'lone'", "'one'", "'some'", "'extends'", "'in'", "'+'", "'!'", "'not'", "'=>'", "'implies'", "'else'", "'let'", "'none'", "'iden'", "'univ'", "'Int'", "'seq/Int'", "'('", "')'", "'@'", "'this'", "'/'", "'disj'", "'all'", "'sum'", "'||'", "'or'", "'&&'", "'and'", "'&'", "'<=>'", "'iff'", "'-'", "'++'", "'<:'", "':>'", "'<<'", "'>>'", "'>>>'", "'set'", "'#'", "'~'", "'*'", "'^'", "'no'", "'<'", "'>'", "'=<'", "'<='", "'>='", "'->'", "'|'", "'open'", "'fact'", "'assert'", "'enum'", "'.'", "'['", "']'"
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
            ruleMemo = new HashMap[293+1];
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

                    if ( (LA2_2==84) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==84) ) {
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

                if ( (LA3_0==RULE_ID||LA3_0==14||(LA3_0>=16 && LA3_0<=17)||(LA3_0>=19 && LA3_0<=20)||LA3_0==27||(LA3_0>=31 && LA3_0<=34)||LA3_0==43||(LA3_0>=85 && LA3_0<=87)) ) {
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:624:1: ruleParagraph returns [EObject current=null] : (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        EObject this_FactDecl_0 = null;

        EObject this_AssertDecl_1 = null;

        EObject this_FunDecl_2 = null;

        EObject this_PredDecl_3 = null;

        EObject this_RunDecl_4 = null;

        EObject this_FunDeclWParam_5 = null;

        EObject this_CheckDecl_6 = null;

        EObject this_EnumDecl_7 = null;

        EObject this_LetOutDecl_8 = null;

        EObject this_SigDecl_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:629:6: ( (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:630:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:630:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl )
            int alt13=10;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:696:2: this_FunDeclWParam_5= ruleFunDeclWParam
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFunDeclWParamParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunDeclWParam_in_ruleParagraph987);
                    this_FunDeclWParam_5=ruleFunDeclWParam();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FunDeclWParam_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:709:2: this_CheckDecl_6= ruleCheckDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getCheckDeclParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckDecl_in_ruleParagraph1017);
                    this_CheckDecl_6=ruleCheckDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CheckDecl_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:722:2: this_EnumDecl_7= ruleEnumDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getEnumDeclParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleParagraph1047);
                    this_EnumDecl_7=ruleEnumDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumDecl_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:735:2: this_LetOutDecl_8= ruleLetOutDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getLetOutDeclParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetOutDecl_in_ruleParagraph1077);
                    this_LetOutDecl_8=ruleLetOutDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LetOutDecl_8; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:748:2: this_SigDecl_9= ruleSigDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getSigDeclParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigDecl_in_ruleParagraph1107);
                    this_SigDecl_9=ruleSigDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SigDecl_9; 
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:767:1: entryRuleFactDecl returns [EObject current=null] : iv_ruleFactDecl= ruleFactDecl EOF ;
    public final EObject entryRuleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:768:2: (iv_ruleFactDecl= ruleFactDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:769:2: iv_ruleFactDecl= ruleFactDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactDecl_in_entryRuleFactDecl1142);
            iv_ruleFactDecl=ruleFactDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactDecl1152); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:776:1: ruleFactDecl returns [EObject current=null] : ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_factName_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:781:6: ( ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:782:1: ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:782:1: ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:782:2: ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:782:2: ( (lv_factName_0_0= ruleFactName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:783:1: (lv_factName_0_0= ruleFactName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:783:1: (lv_factName_0_0= ruleFactName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:784:3: lv_factName_0_0= ruleFactName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getFactNameFactNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFactName_in_ruleFactDecl1198);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:806:2: ( (lv_block_1_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:807:1: (lv_block_1_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:807:1: (lv_block_1_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:808:3: lv_block_1_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFactDecl1219);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:838:1: entryRuleAssertDecl returns [EObject current=null] : iv_ruleAssertDecl= ruleAssertDecl EOF ;
    public final EObject entryRuleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:839:2: (iv_ruleAssertDecl= ruleAssertDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:840:2: iv_ruleAssertDecl= ruleAssertDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1255);
            iv_ruleAssertDecl=ruleAssertDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertDecl1265); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:847:1: ruleAssertDecl returns [EObject current=null] : ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_assertionName_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:852:6: ( ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:853:1: ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:853:1: ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:853:2: ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:853:2: ( (lv_assertionName_0_0= ruleAssertionName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:854:1: (lv_assertionName_0_0= ruleAssertionName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:854:1: (lv_assertionName_0_0= ruleAssertionName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:855:3: lv_assertionName_0_0= ruleAssertionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getAssertionNameAssertionNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionName_in_ruleAssertDecl1311);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:877:2: ( (lv_block_1_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:878:1: (lv_block_1_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:878:1: (lv_block_1_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:879:3: lv_block_1_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleAssertDecl1332);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:909:1: entryRuleFunDecl returns [EObject current=null] : iv_ruleFunDecl= ruleFunDecl EOF ;
    public final EObject entryRuleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:910:2: (iv_ruleFunDecl= ruleFunDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:911:2: iv_ruleFunDecl= ruleFunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunDecl_in_entryRuleFunDecl1368);
            iv_ruleFunDecl=ruleFunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunDecl1378); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:918:1: ruleFunDecl returns [EObject current=null] : ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:923:6: ( ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:924:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:924:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:924:2: ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) ) ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:924:2: ( 'private' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:924:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleFunDecl1414); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunDecl1426); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunDeclAccess().getFunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:932:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:932:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:932:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:933:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:933:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:934:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleFunDecl1448);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:956:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:957:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:957:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:958:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleFunDecl1469);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:980:4: ( (lv_functionName_4_0= ruleFunctionName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:981:1: (lv_functionName_4_0= ruleFunctionName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:981:1: (lv_functionName_4_0= ruleFunctionName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:982:3: lv_functionName_4_0= ruleFunctionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getFunctionNameFunctionNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionName_in_ruleFunDecl1492);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1004:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==89) ) {
                alt20=1;
            }
            else if ( (LA20_0==49) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1004:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1004:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1004:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1004:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1004:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1005:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1005:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1006:3: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleFunDecl1515);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1028:2: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID||LA17_0==14||LA17_0==52||LA17_0==54) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1028:3: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1028:3: ( (lv_decl_6_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1029:1: (lv_decl_6_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1029:1: (lv_decl_6_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1030:3: lv_decl_6_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1537);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1052:2: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==29) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1052:3: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1052:3: ( (lv_comma_7_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1053:1: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1053:1: (lv_comma_7_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1054:3: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleFunDecl1559);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1076:2: ( (lv_decl_8_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1077:1: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1077:1: (lv_decl_8_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1078:3: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1580);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1100:6: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1101:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1101:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1102:3: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleFunDecl1605);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1125:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1125:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1125:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1125:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1126:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1126:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1127:3: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleFunDecl1634);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1149:2: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID||LA19_0==14||LA19_0==52||LA19_0==54) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1149:3: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1149:3: ( (lv_decl_11_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1150:1: (lv_decl_11_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1150:1: (lv_decl_11_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1151:3: lv_decl_11_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1656);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1173:2: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==29) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1173:3: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1173:3: ( (lv_comma_12_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1174:1: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1174:1: (lv_comma_12_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1175:3: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleFunDecl1678);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1197:2: ( (lv_decl_13_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1198:1: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1198:1: (lv_decl_13_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1199:3: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1699);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1221:6: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1222:1: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1222:1: (lv_rightP_14_0= ruleRightParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1223:3: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightParenthesis_in_ruleFunDecl1724);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1245:4: ( (lv_colon_15_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1246:1: (lv_colon_15_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1246:1: (lv_colon_15_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1247:3: lv_colon_15_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getColonColonParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleFunDecl1747);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1269:2: ( (lv_expr_16_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1270:1: (lv_expr_16_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1270:1: (lv_expr_16_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1271:3: lv_expr_16_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunDecl1768);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1293:2: ( (lv_block_17_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1294:1: (lv_block_17_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1294:1: (lv_block_17_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1295:3: lv_block_17_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getBlockBlockParserRuleCall_7_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFunDecl1789);
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


    // $ANTLR start entryRuleFunDeclWParam
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1325:1: entryRuleFunDeclWParam returns [EObject current=null] : iv_ruleFunDeclWParam= ruleFunDeclWParam EOF ;
    public final EObject entryRuleFunDeclWParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDeclWParam = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1326:2: (iv_ruleFunDeclWParam= ruleFunDeclWParam EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1327:2: iv_ruleFunDeclWParam= ruleFunDeclWParam EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunDeclWParamRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunDeclWParam_in_entryRuleFunDeclWParam1825);
            iv_ruleFunDeclWParam=ruleFunDeclWParam();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunDeclWParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunDeclWParam1835); if (failed) return current;

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
    // $ANTLR end entryRuleFunDeclWParam


    // $ANTLR start ruleFunDeclWParam
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1334:1: ruleFunDeclWParam returns [EObject current=null] : ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionNamewParam_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) ) ) ;
    public final EObject ruleFunDeclWParam() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_2_0 = null;

        EObject lv_dot_3_0 = null;

        EObject lv_functionNamewParam_4_0 = null;

        EObject lv_colon_5_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_block_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1339:6: ( ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionNamewParam_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1340:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionNamewParam_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1340:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionNamewParam_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1340:2: ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionNamewParam_4_0= ruleFunctionNamewParam ) ) ( (lv_colon_5_0= ruleColon ) ) ( (lv_expr_6_0= ruleExpression ) ) ( (lv_block_7_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1340:2: ( 'private' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1340:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleFunDeclWParam1871); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclWParamAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunDeclWParam1883); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunDeclWParamAccess().getFunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1348:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1348:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1348:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1349:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1349:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1350:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclWParamAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleFunDeclWParam1905);
                    lv_ref_2_0=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclWParamRule().getType().getClassifier());
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1372:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1373:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1373:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1374:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclWParamAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleFunDeclWParam1926);
                    lv_dot_3_0=ruleDot();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclWParamRule().getType().getClassifier());
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1396:4: ( (lv_functionNamewParam_4_0= ruleFunctionNamewParam ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1397:1: (lv_functionNamewParam_4_0= ruleFunctionNamewParam )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1397:1: (lv_functionNamewParam_4_0= ruleFunctionNamewParam )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1398:3: lv_functionNamewParam_4_0= ruleFunctionNamewParam
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclWParamAccess().getFunctionNamewParamFunctionNamewParamParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionNamewParam_in_ruleFunDeclWParam1949);
            lv_functionNamewParam_4_0=ruleFunctionNamewParam();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclWParamRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"functionNamewParam",
              	        		lv_functionNamewParam_4_0, 
              	        		"FunctionNamewParam", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1420:2: ( (lv_colon_5_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1421:1: (lv_colon_5_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1421:1: (lv_colon_5_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1422:3: lv_colon_5_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclWParamAccess().getColonColonParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleFunDeclWParam1970);
            lv_colon_5_0=ruleColon();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclWParamRule().getType().getClassifier());
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1444:2: ( (lv_expr_6_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1445:1: (lv_expr_6_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1445:1: (lv_expr_6_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1446:3: lv_expr_6_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclWParamAccess().getExprExpressionParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunDeclWParam1991);
            lv_expr_6_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclWParamRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expr",
              	        		lv_expr_6_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1468:2: ( (lv_block_7_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1469:1: (lv_block_7_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1469:1: (lv_block_7_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1470:3: lv_block_7_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclWParamAccess().getBlockBlockParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFunDeclWParam2012);
            lv_block_7_0=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclWParamRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"block",
              	        		lv_block_7_0, 
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
    // $ANTLR end ruleFunDeclWParam


    // $ANTLR start entryRulePredDecl
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1500:1: entryRulePredDecl returns [EObject current=null] : iv_rulePredDecl= rulePredDecl EOF ;
    public final EObject entryRulePredDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1501:2: (iv_rulePredDecl= rulePredDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1502:2: iv_rulePredDecl= rulePredDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredDecl_in_entryRulePredDecl2048);
            iv_rulePredDecl=rulePredDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredDecl2058); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1509:1: rulePredDecl returns [EObject current=null] : ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1514:6: ( ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1515:1: ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1515:1: ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1515:2: ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1515:2: ( 'private' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1515:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_rulePredDecl2094); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_rulePredDecl2106); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPredDeclAccess().getPredKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1523:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==88) ) {
                    alt24=1;
                }
            }
            else if ( ((LA24_0>=46 && LA24_0<=48)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1523:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1523:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1524:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1524:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1525:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_rulePredDecl2128);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1547:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1548:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1548:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1549:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_rulePredDecl2149);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1571:4: ( (lv_predicateName_4_0= rulePredicateName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1572:1: (lv_predicateName_4_0= rulePredicateName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1572:1: (lv_predicateName_4_0= rulePredicateName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1573:3: lv_predicateName_4_0= rulePredicateName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getPredicateNamePredicateNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePredicateName_in_rulePredDecl2172);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1595:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==89) ) {
                alt29=1;
            }
            else if ( (LA29_0==49) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1595:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1595:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1595:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1595:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1596:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1596:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1597:3: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_rulePredDecl2195);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1619:2: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID||LA26_0==14||LA26_0==52||LA26_0==54) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1619:3: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1619:3: ( (lv_decl_6_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1620:1: (lv_decl_6_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1620:1: (lv_decl_6_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1621:3: lv_decl_6_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2217);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1643:2: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==29) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1643:3: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1643:3: ( (lv_comma_7_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1644:1: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1644:1: (lv_comma_7_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1645:3: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_rulePredDecl2239);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1667:2: ( (lv_decl_8_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1668:1: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1668:1: (lv_decl_8_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1669:3: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2260);
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
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1691:6: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1692:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1692:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1693:3: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_rulePredDecl2285);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1716:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1716:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1716:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1716:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1717:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1717:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1718:3: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftParenthesis_in_rulePredDecl2314);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1740:2: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID||LA28_0==14||LA28_0==52||LA28_0==54) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1740:3: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1740:3: ( (lv_decl_11_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1741:1: (lv_decl_11_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1741:1: (lv_decl_11_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1742:3: lv_decl_11_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2336);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1764:2: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==29) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1764:3: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1764:3: ( (lv_comma_12_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1765:1: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1765:1: (lv_comma_12_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1766:3: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_rulePredDecl2358);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1788:2: ( (lv_decl_13_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1789:1: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1789:1: (lv_decl_13_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1790:3: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2379);
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
                            	    break loop27;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1812:6: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1813:1: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1813:1: (lv_rightP_14_0= ruleRightParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1814:3: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightParenthesis_in_rulePredDecl2404);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1836:5: ( (lv_block_15_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1837:1: (lv_block_15_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1837:1: (lv_block_15_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1838:3: lv_block_15_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getBlockBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_rulePredDecl2428);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1868:1: entryRuleRunDecl returns [EObject current=null] : iv_ruleRunDecl= ruleRunDecl EOF ;
    public final EObject entryRuleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1869:2: (iv_ruleRunDecl= ruleRunDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1870:2: iv_ruleRunDecl= ruleRunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRunDecl_in_entryRuleRunDecl2464);
            iv_ruleRunDecl=ruleRunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRunDecl2474); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1877:1: ruleRunDecl returns [EObject current=null] : ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_runName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1882:6: ( ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1883:1: ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1883:1: ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1883:2: ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1883:2: ( ( (lv_runName_0_0= ruleAlias ) ) ':' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1883:3: ( (lv_runName_0_0= ruleAlias ) ) ':'
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1883:3: ( (lv_runName_0_0= ruleAlias ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1884:1: (lv_runName_0_0= ruleAlias )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1884:1: (lv_runName_0_0= ruleAlias )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1885:3: lv_runName_0_0= ruleAlias
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getRunNameAliasParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleRunDecl2521);
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

                    match(input,18,FOLLOW_18_in_ruleRunDecl2531); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRunDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleRunDecl2543); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRunDeclAccess().getRunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1915:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
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
                    new NoViableAltException("1915:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1915:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1915:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1916:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1916:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1917:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRunDecl2566); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRunDeclAccess().getName2ReferencesNameCrossReference_2_0_0(), "name2"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1933:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1933:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1934:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1934:1: (lv_block_4_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1935:3: lv_block_4_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getBlockBlockParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleRunDecl2593);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1957:3: ( (lv_scope_5_0= ruleScope ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1958:1: (lv_scope_5_0= ruleScope )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1958:1: (lv_scope_5_0= ruleScope )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1959:3: lv_scope_5_0= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleRunDecl2615);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1989:1: entryRuleCheckDecl returns [EObject current=null] : iv_ruleCheckDecl= ruleCheckDecl EOF ;
    public final EObject entryRuleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1990:2: (iv_ruleCheckDecl= ruleCheckDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1991:2: iv_ruleCheckDecl= ruleCheckDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCheckDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2651);
            iv_ruleCheckDecl=ruleCheckDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCheckDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckDecl2661); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1998:1: ruleCheckDecl returns [EObject current=null] : ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_checkName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2003:6: ( ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2004:1: ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2004:1: ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2004:2: ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2004:2: ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2004:3: ( (lv_checkName_0_0= ruleAlias ) ) ':'
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2004:3: ( (lv_checkName_0_0= ruleAlias ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2005:1: (lv_checkName_0_0= ruleAlias )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2005:1: (lv_checkName_0_0= ruleAlias )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2006:3: lv_checkName_0_0= ruleAlias
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getCheckNameAliasParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleCheckDecl2708);
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

                    match(input,18,FOLLOW_18_in_ruleCheckDecl2718); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCheckDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleCheckDecl2730); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCheckDeclAccess().getCheckKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2036:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            else if ( (LA33_0==28) ) {
                alt33=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2036:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2036:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2036:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2037:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2037:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2038:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckDecl2753); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCheckDeclAccess().getNameAssertionNameCrossReference_2_0_0(), "name"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2054:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2054:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2055:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2055:1: (lv_block_4_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2056:3: lv_block_4_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getBlockBlockParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleCheckDecl2780);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2078:3: ( (lv_scope_5_0= ruleScope ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2079:1: (lv_scope_5_0= ruleScope )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2079:1: (lv_scope_5_0= ruleScope )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2080:3: lv_scope_5_0= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleCheckDecl2802);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2110:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2111:2: (iv_ruleScope= ruleScope EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2112:2: iv_ruleScope= ruleScope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScope_in_entryRuleScope2838);
            iv_ruleScope=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScope2848); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2119:1: ruleScope returns [EObject current=null] : ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2124:6: ( ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2125:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2125:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            int alt40=4;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        alt40=2;
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
                    case 85:
                    case 86:
                    case 87:
                        {
                        alt40=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA40_7 = input.LA(4);

                        if ( (LA40_7==EOF||LA40_7==RULE_ID||LA40_7==14||(LA40_7>=16 && LA40_7<=17)||(LA40_7>=19 && LA40_7<=20)||LA40_7==23||LA40_7==27||LA40_7==29||(LA40_7>=31 && LA40_7<=34)||LA40_7==43||(LA40_7>=85 && LA40_7<=87)) ) {
                            alt40=3;
                        }
                        else if ( (LA40_7==18||LA40_7==53) ) {
                            alt40=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2125:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 40, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                    case 25:
                        {
                        alt40=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2125:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 40, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA40_1==13) ) {
                    alt40=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2125:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==EOF||LA40_0==RULE_ID||LA40_0==14||(LA40_0>=16 && LA40_0<=17)||(LA40_0>=19 && LA40_0<=20)||LA40_0==23||LA40_0==27||(LA40_0>=31 && LA40_0<=34)||LA40_0==43||(LA40_0>=85 && LA40_0<=87)) ) {
                alt40=4;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2125:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2125:2: ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2125:2: ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2125:3: () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2125:3: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2126:2: 
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

                    match(input,21,FOLLOW_21_in_ruleScope2896); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_0_1(), null); 
                          
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2905); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_0_2(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2147:1: ( (lv_expect_3_0= ruleExpectation ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==23) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2148:1: (lv_expect_3_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2148:1: (lv_expect_3_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2149:3: lv_expect_3_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_0_3_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2925);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2172:6: ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2172:6: ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2172:7: () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2172:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2173:2: 
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

                    match(input,21,FOLLOW_21_in_ruleScope2956); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_1_1(), null); 
                          
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2965); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_1_2(), null); 
                          
                    }
                    match(input,22,FOLLOW_22_in_ruleScope2974); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getButKeyword_1_3(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2198:1: ( (lv_typescope_8_0= ruleTypescope ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2199:1: (lv_typescope_8_0= ruleTypescope )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2199:1: (lv_typescope_8_0= ruleTypescope )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2200:3: lv_typescope_8_0= ruleTypescope
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2995);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2222:2: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==29) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2222:3: ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2222:3: ( (lv_comma_9_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2223:1: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2223:1: (lv_comma_9_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2224:3: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_1_5_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleScope3017);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2246:2: ( (lv_typescope_10_0= ruleTypescope ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2247:1: (lv_typescope_10_0= ruleTypescope )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2247:1: (lv_typescope_10_0= ruleTypescope )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2248:3: lv_typescope_10_0= ruleTypescope
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope3038);
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
                    	    break loop35;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2270:4: ( (lv_expect_11_0= ruleExpectation ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==23) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2271:1: (lv_expect_11_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2271:1: (lv_expect_11_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2272:3: lv_expect_11_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_1_6_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope3061);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2295:6: ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2295:6: ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2295:7: () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2295:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2296:2: 
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

                    match(input,21,FOLLOW_21_in_ruleScope3092); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_2_1(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2313:1: ( (lv_typescope_14_0= ruleTypescope ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2314:1: (lv_typescope_14_0= ruleTypescope )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2314:1: (lv_typescope_14_0= ruleTypescope )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2315:3: lv_typescope_14_0= ruleTypescope
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope3113);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2337:2: ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==29) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2337:3: ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2337:3: ( (lv_comma_15_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2338:1: (lv_comma_15_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2338:1: (lv_comma_15_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2339:3: lv_comma_15_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_2_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleScope3135);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2361:2: ( (lv_typescope_16_0= ruleTypescope ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2362:1: (lv_typescope_16_0= ruleTypescope )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2362:1: (lv_typescope_16_0= ruleTypescope )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2363:3: lv_typescope_16_0= ruleTypescope
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope3156);
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
                    	    break loop37;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2385:4: ( (lv_expect_17_0= ruleExpectation ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==23) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2386:1: (lv_expect_17_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2386:1: (lv_expect_17_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2387:3: lv_expect_17_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_2_4_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope3179);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2410:6: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2410:6: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2410:7: () ( (lv_expect_19_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2410:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2411:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2424:2: ( (lv_expect_19_0= ruleExpectation ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==23) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2425:1: (lv_expect_19_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2425:1: (lv_expect_19_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2426:3: lv_expect_19_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_3_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope3221);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2456:1: entryRuleExpectation returns [EObject current=null] : iv_ruleExpectation= ruleExpectation EOF ;
    public final EObject entryRuleExpectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectation = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2457:2: (iv_ruleExpectation= ruleExpectation EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2458:2: iv_ruleExpectation= ruleExpectation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpectationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpectation_in_entryRuleExpectation3259);
            iv_ruleExpectation=ruleExpectation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpectation3269); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2465:1: ruleExpectation returns [EObject current=null] : ( 'expect' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleExpectation() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2470:6: ( ( 'expect' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2471:1: ( 'expect' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2471:1: ( 'expect' ( (lv_value_1_0= RULE_INT ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2471:3: 'expect' ( (lv_value_1_0= RULE_INT ) )
            {
            match(input,23,FOLLOW_23_in_ruleExpectation3304); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExpectationAccess().getExpectKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2475:1: ( (lv_value_1_0= RULE_INT ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2476:1: (lv_value_1_0= RULE_INT )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2476:1: (lv_value_1_0= RULE_INT )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2477:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpectation3321); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2507:1: entryRuleTypescope returns [EObject current=null] : iv_ruleTypescope= ruleTypescope EOF ;
    public final EObject entryRuleTypescope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypescope = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2508:2: (iv_ruleTypescope= ruleTypescope EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2509:2: iv_ruleTypescope= ruleTypescope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypescopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypescope_in_entryRuleTypescope3362);
            iv_ruleTypescope=ruleTypescope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypescope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypescope3372); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2516:1: ruleTypescope returns [EObject current=null] : ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) ) ;
    public final EObject ruleTypescope() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2521:6: ( ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2522:1: ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2522:1: ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2522:2: () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2522:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2523:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2536:2: ( 'exactly' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2536:4: 'exactly'
                    {
                    match(input,13,FOLLOW_13_in_ruleTypescope3420); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypescopeAccess().getExactlyKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTypescope3431); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getTypescopeAccess().getINTTerminalRuleCall_2(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2544:1: ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=24 && LA43_0<=25)) ) {
                alt43=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2544:1: ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2544:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2544:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2545:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2545:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2546:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypescope3453); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTypescopeAccess().getNameReferencesNameCrossReference_3_0_0(), "name"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2562:6: ( 'int' | 'seq' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2562:6: ( 'int' | 'seq' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==24) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==25) ) {
                        alt42=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2562:6: ( 'int' | 'seq' )", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2562:8: 'int'
                            {
                            match(input,24,FOLLOW_24_in_ruleTypescope3470); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypescopeAccess().getIntKeyword_3_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2567:7: 'seq'
                            {
                            match(input,25,FOLLOW_25_in_ruleTypescope3486); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2579:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2580:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2581:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3524);
            iv_ruleEnumDecl=ruleEnumDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl3534); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2588:1: ruleEnumDecl returns [EObject current=null] : ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2593:6: ( ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2594:1: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2594:1: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2594:2: ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2594:2: ( (lv_enumName_0_0= ruleEnumName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2595:1: (lv_enumName_0_0= ruleEnumName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2595:1: (lv_enumName_0_0= ruleEnumName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2596:3: lv_enumName_0_0= ruleEnumName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getEnumNameEnumNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumName_in_ruleEnumDecl3580);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2618:2: ( (lv_leftC_1_0= ruleLeftCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2619:1: (lv_leftC_1_0= ruleLeftCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2619:1: (lv_leftC_1_0= ruleLeftCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2620:3: lv_leftC_1_0= ruleLeftCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getLeftCLeftCurlyBracketParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleEnumDecl3601);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2642:2: ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2643:1: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2643:1: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2644:3: lv_propertyEnum_2_0= ruleEnumPropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3622);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2666:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==29) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2666:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2666:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2667:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2667:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2668:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleEnumDecl3644);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2690:2: ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2691:1: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2691:1: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2692:3: lv_propertyEnum_4_0= ruleEnumPropertyName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3665);
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
            	    break loop44;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2714:4: ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2715:1: (lv_rightC_5_0= ruleRightCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2715:1: (lv_rightC_5_0= ruleRightCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2716:3: lv_rightC_5_0= ruleRightCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getRightCRightCurlyBracketParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleEnumDecl3688);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2746:1: entryRuleLetOutDecl returns [EObject current=null] : iv_ruleLetOutDecl= ruleLetOutDecl EOF ;
    public final EObject entryRuleLetOutDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetOutDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2747:2: (iv_ruleLetOutDecl= ruleLetOutDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2748:2: iv_ruleLetOutDecl= ruleLetOutDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetOutDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetOutDecl_in_entryRuleLetOutDecl3724);
            iv_ruleLetOutDecl=ruleLetOutDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetOutDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetOutDecl3734); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2755:1: ruleLetOutDecl returns [EObject current=null] : ( ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2760:6: ( ( ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2761:1: ( ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2761:1: ( ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2761:2: ( (lv_letName_0_0= ruleLetName ) ) ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )? ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2761:2: ( (lv_letName_0_0= ruleLetName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2762:1: (lv_letName_0_0= ruleLetName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2762:1: (lv_letName_0_0= ruleLetName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2763:3: lv_letName_0_0= ruleLetName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getLetNameLetNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLetName_in_ruleLetOutDecl3780);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2785:2: ( ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==89) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2785:3: ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )? ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2785:3: ( (lv_leftS_1_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2786:1: (lv_leftS_1_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2786:1: (lv_leftS_1_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2787:3: lv_leftS_1_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleLetOutDecl3802);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2809:2: ( ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID||LA46_0==43||LA46_0==52||LA46_0==85||LA46_0==87) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2809:3: ( (lv_nameRef_2_0= ruleReferencesName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2809:3: ( (lv_nameRef_2_0= ruleReferencesName ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2810:1: (lv_nameRef_2_0= ruleReferencesName )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2810:1: (lv_nameRef_2_0= ruleReferencesName )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2811:3: lv_nameRef_2_0= ruleReferencesName
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getNameRefReferencesNameParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleReferencesName_in_ruleLetOutDecl3824);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2833:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==29) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2833:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_nameRef_4_0= ruleReferencesName ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2833:3: ( (lv_comma_3_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2834:1: (lv_comma_3_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2834:1: (lv_comma_3_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2835:3: lv_comma_3_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getCommaCommaParserRuleCall_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleLetOutDecl3846);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2857:2: ( (lv_nameRef_4_0= ruleReferencesName ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2858:1: (lv_nameRef_4_0= ruleReferencesName )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2858:1: (lv_nameRef_4_0= ruleReferencesName )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2859:3: lv_nameRef_4_0= ruleReferencesName
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getNameRefReferencesNameParserRuleCall_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleReferencesName_in_ruleLetOutDecl3867);
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
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2881:6: ( (lv_rightS_5_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2882:1: (lv_rightS_5_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2882:1: (lv_rightS_5_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2883:3: lv_rightS_5_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleLetOutDecl3892);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2905:4: ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==28) ) {
                alt48=1;
            }
            else if ( (LA48_0==26) ) {
                alt48=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2905:4: ( ( (lv_block_6_0= ruleBlock ) ) | ( '=' ( (lv_exprName_8_0= ruleExpression ) ) ) )", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2905:5: ( (lv_block_6_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2905:5: ( (lv_block_6_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2906:1: (lv_block_6_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2906:1: (lv_block_6_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2907:3: lv_block_6_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getBlockBlockParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleLetOutDecl3916);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2930:6: ( '=' ( (lv_exprName_8_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2930:6: ( '=' ( (lv_exprName_8_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2930:8: '=' ( (lv_exprName_8_0= ruleExpression ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleLetOutDecl3933); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getLetOutDeclAccess().getEqualsSignKeyword_2_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2934:1: ( (lv_exprName_8_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2935:1: (lv_exprName_8_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2935:1: (lv_exprName_8_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2936:3: lv_exprName_8_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getLetOutDeclAccess().getExprNameExpressionParserRuleCall_2_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLetOutDecl3954);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2966:1: entryRuleSigDecl returns [EObject current=null] : iv_ruleSigDecl= ruleSigDecl EOF ;
    public final EObject entryRuleSigDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2967:2: (iv_ruleSigDecl= ruleSigDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2968:2: iv_ruleSigDecl= ruleSigDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigDecl_in_entryRuleSigDecl3992);
            iv_ruleSigDecl=ruleSigDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigDecl4002); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2975:1: ruleSigDecl returns [EObject current=null] : ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2980:6: ( ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2981:1: ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2981:1: ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2981:2: (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2981:2: (this_SigQual_0= ruleSigQual )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==14||(LA49_0>=31 && LA49_0<=34)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2982:2: this_SigQual_0= ruleSigQual
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigQualParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigQual_in_ruleSigDecl4053);
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

            match(input,27,FOLLOW_27_in_ruleSigDecl4064); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getSigKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2997:1: ( (lv_signatureName_2_0= ruleSignatureName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2998:1: (lv_signatureName_2_0= ruleSignatureName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2998:1: (lv_signatureName_2_0= ruleSignatureName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2999:3: lv_signatureName_2_0= ruleSignatureName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignatureName_in_ruleSigDecl4085);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3021:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==29) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3021:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3021:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3022:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3022:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3023:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleSigDecl4107);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3045:2: ( (lv_signatureName_4_0= ruleSignatureName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3046:1: (lv_signatureName_4_0= ruleSignatureName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3046:1: (lv_signatureName_4_0= ruleSignatureName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3047:3: lv_signatureName_4_0= ruleSignatureName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignatureName_in_ruleSigDecl4128);
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
            	    break loop50;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3069:4: ( (lv_sigExt_5_0= ruleSigExt ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=35 && LA51_0<=36)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3070:1: (lv_sigExt_5_0= ruleSigExt )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3070:1: (lv_sigExt_5_0= ruleSigExt )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3071:3: lv_sigExt_5_0= ruleSigExt
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigExtSigExtParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSigExt_in_ruleSigDecl4151);
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

            match(input,28,FOLLOW_28_in_ruleSigDecl4162); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getLeftCurlyBracketKeyword_5(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3097:1: ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==14||LA53_0==52||LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3097:2: ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3097:2: ( (lv_decl_7_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3098:1: (lv_decl_7_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3098:1: (lv_decl_7_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3099:3: lv_decl_7_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl4184);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3121:2: ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==29) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3121:3: ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3121:3: ( (lv_comma2_8_0= ',' ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3122:1: (lv_comma2_8_0= ',' )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3122:1: (lv_comma2_8_0= ',' )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3123:3: lv_comma2_8_0= ','
                    	    {
                    	    lv_comma2_8_0=(Token)input.LT(1);
                    	    match(input,29,FOLLOW_29_in_ruleSigDecl4203); if (failed) return current;
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3142:2: ( (lv_decl_9_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3143:1: (lv_decl_9_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3143:1: (lv_decl_9_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3144:3: lv_decl_9_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl4237);
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,30,FOLLOW_30_in_ruleSigDecl4251); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getRightCurlyBracketKeyword_7(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3170:1: ( (lv_block_11_0= ruleBlock ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3171:1: (lv_block_11_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3171:1: (lv_block_11_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3172:3: lv_block_11_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getBlockBlockParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleSigDecl4272);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3202:1: entryRuleSigQual returns [EObject current=null] : iv_ruleSigQual= ruleSigQual EOF ;
    public final EObject entryRuleSigQual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigQual = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3203:2: (iv_ruleSigQual= ruleSigQual EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3204:2: iv_ruleSigQual= ruleSigQual EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigQualRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigQual_in_entryRuleSigQual4309);
            iv_ruleSigQual=ruleSigQual();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigQual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigQual4319); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3211:1: ruleSigQual returns [EObject current=null] : ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* ) ;
    public final EObject ruleSigQual() throws RecognitionException {
        EObject current = null;

        Token lv_sigq_0_1=null;
        Token lv_sigq_0_2=null;
        Token lv_sigq_0_3=null;
        Token lv_sigq_0_4=null;
        Token lv_sigq_0_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3216:6: ( ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3217:1: ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3217:1: ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3217:2: ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3217:2: ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3218:1: ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3218:1: ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3219:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3219:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )
            int alt55=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt55=1;
                }
                break;
            case 32:
                {
                alt55=2;
                }
                break;
            case 33:
                {
                alt55=3;
                }
                break;
            case 34:
                {
                alt55=4;
                }
                break;
            case 14:
                {
                alt55=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3219:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3220:3: lv_sigq_0_1= 'abstract'
                    {
                    lv_sigq_0_1=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSigQual4364); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3238:8: lv_sigq_0_2= 'lone'
                    {
                    lv_sigq_0_2=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSigQual4393); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3256:8: lv_sigq_0_3= 'one'
                    {
                    lv_sigq_0_3=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleSigQual4422); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3274:8: lv_sigq_0_4= 'some'
                    {
                    lv_sigq_0_4=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleSigQual4451); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3292:8: lv_sigq_0_5= 'private'
                    {
                    lv_sigq_0_5=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleSigQual4480); if (failed) return current;
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3313:2: ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )*
            loop56:
            do {
                int alt56=6;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt56=1;
                    }
                    break;
                case 32:
                    {
                    alt56=2;
                    }
                    break;
                case 33:
                    {
                    alt56=3;
                    }
                    break;
                case 34:
                    {
                    alt56=4;
                    }
                    break;
                case 14:
                    {
                    alt56=5;
                    }
                    break;

                }

                switch (alt56) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3313:4: 'abstract'
            	    {
            	    match(input,31,FOLLOW_31_in_ruleSigQual4507); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getAbstractKeyword_1_0(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3318:7: 'lone'
            	    {
            	    match(input,32,FOLLOW_32_in_ruleSigQual4523); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getLoneKeyword_1_1(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3323:7: 'one'
            	    {
            	    match(input,33,FOLLOW_33_in_ruleSigQual4539); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getOneKeyword_1_2(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3328:7: 'some'
            	    {
            	    match(input,34,FOLLOW_34_in_ruleSigQual4555); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getSomeKeyword_1_3(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3333:7: 'private'
            	    {
            	    match(input,14,FOLLOW_14_in_ruleSigQual4571); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getPrivateKeyword_1_4(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3345:1: entryRuleSigExt returns [EObject current=null] : iv_ruleSigExt= ruleSigExt EOF ;
    public final EObject entryRuleSigExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExt = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3346:2: (iv_ruleSigExt= ruleSigExt EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3347:2: iv_ruleSigExt= ruleSigExt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigExtRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigExt_in_entryRuleSigExt4609);
            iv_ruleSigExt=ruleSigExt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigExt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExt4619); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3354:1: ruleSigExt returns [EObject current=null] : ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) ;
    public final EObject ruleSigExt() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;

        EObject lv_ref_3_0 = null;

        EObject lv_ref2_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3359:6: ( ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3360:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3360:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==35) ) {
                alt58=1;
            }
            else if ( (LA58_0==36) ) {
                alt58=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3360:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3360:2: ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3360:2: ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3360:4: 'extends' ( (lv_ref_1_0= ruleReferencesSig ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleSigExt4655); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getExtendsKeyword_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3364:1: ( (lv_ref_1_0= ruleReferencesSig ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3365:1: (lv_ref_1_0= ruleReferencesSig )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3365:1: (lv_ref_1_0= ruleReferencesSig )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3366:3: lv_ref_1_0= ruleReferencesSig
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4676);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3389:6: ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3389:6: ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3389:8: 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    {
                    match(input,36,FOLLOW_36_in_ruleSigExt4694); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getInKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3393:1: ( (lv_ref_3_0= ruleReferencesSig ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3394:1: (lv_ref_3_0= ruleReferencesSig )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3394:1: (lv_ref_3_0= ruleReferencesSig )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3395:3: lv_ref_3_0= ruleReferencesSig
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4715);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3417:2: ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==37) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3417:4: '+' ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    {
                    	    match(input,37,FOLLOW_37_in_ruleSigExt4726); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getSigExtAccess().getPlusSignKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3421:1: ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3422:1: (lv_ref2_5_0= ruleReferencesSig )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3422:1: (lv_ref2_5_0= ruleReferencesSig )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3423:3: lv_ref2_5_0= ruleReferencesSig
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRef2ReferencesSigParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4747);
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
                    	    break loop57;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3453:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3454:2: (iv_ruleExpression= ruleExpression EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3455:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4786);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4796); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3462:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3467:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3468:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3468:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3469:2: this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression4846);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:1: ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )*
            loop64:
            do {
                int alt64=6;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA64_2 = input.LA(2);

                    if ( (synpred78()) ) {
                        alt64=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA64_3 = input.LA(2);

                    if ( (synpred78()) ) {
                        alt64=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA64_4 = input.LA(2);

                    if ( (synpred78()) ) {
                        alt64=2;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA64_5 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA64_6 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA64_7 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA64_8 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA64_9 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA64_10 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA64_11 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA64_12 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 64:
                    {
                    int LA64_13 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 65:
                    {
                    int LA64_14 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 66:
                    {
                    int LA64_15 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 67:
                    {
                    int LA64_16 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 88:
                    {
                    int LA64_17 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA64_18 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 69:
                    {
                    int LA64_19 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 70:
                    {
                    int LA64_20 = input.LA(2);

                    if ( (synpred77()) ) {
                        alt64=1;
                    }


                    }
                    break;
                case 71:
                    {
                    int LA64_21 = input.LA(2);

                    if ( (synpred78()) ) {
                        alt64=2;
                    }


                    }
                    break;
                case 82:
                    {
                    int LA64_22 = input.LA(2);

                    if ( (synpred78()) ) {
                        alt64=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA64_23 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA64_24 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA64_25 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA64_26 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 77:
                    {
                    int LA64_27 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA64_28 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 79:
                    {
                    int LA64_29 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 80:
                    {
                    int LA64_30 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 81:
                    {
                    int LA64_31 = input.LA(2);

                    if ( (synpred81()) ) {
                        alt64=3;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA64_32 = input.LA(2);

                    if ( (synpred84()) ) {
                        alt64=4;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA64_33 = input.LA(2);

                    if ( (synpred84()) ) {
                        alt64=4;
                    }


                    }
                    break;
                case 89:
                    {
                    int LA64_34 = input.LA(2);

                    if ( (synpred87()) ) {
                        alt64=5;
                    }


                    }
                    break;

                }

                switch (alt64) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:2: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:2: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:3: ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:3: ( (lv_binOp_1_0= ruleBinOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:1: (lv_binOp_1_0= ruleBinOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:1: (lv_binOp_1_0= ruleBinOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3482:3: lv_binOp_1_0= ruleBinOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinOp_in_ruleExpression4868);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3504:2: ( (lv_expr_2_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3505:1: (lv_expr_2_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3505:1: (lv_expr_2_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3506:3: lv_expr_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4889);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:6: ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:6: ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:7: ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:7: ( (lv_arrowOp_3_0= ruleArrowOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3530:1: (lv_arrowOp_3_0= ruleArrowOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3530:1: (lv_arrowOp_3_0= ruleArrowOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3531:3: lv_arrowOp_3_0= ruleArrowOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrowOp_in_ruleExpression4918);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3553:2: ( (lv_expr_4_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3554:1: (lv_expr_4_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3554:1: (lv_expr_4_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3555:3: lv_expr_4_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4939);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:6: ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:6: ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:7: ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:7: ( '!' | 'not' )?
            	    int alt59=3;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==38) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==39) ) {
            	        alt59=2;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:9: '!'
            	            {
            	            match(input,38,FOLLOW_38_in_ruleExpression4958); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getExclamationMarkKeyword_1_2_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3583:7: 'not'
            	            {
            	            match(input,39,FOLLOW_39_in_ruleExpression4974); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getNotKeyword_1_2_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3587:3: ( (lv_cmp_7_0= ruleCompareOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3588:1: (lv_cmp_7_0= ruleCompareOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3588:1: (lv_cmp_7_0= ruleCompareOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3589:3: lv_cmp_7_0= ruleCompareOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOp_in_ruleExpression4997);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3611:2: ( (lv_expr_8_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3612:1: (lv_expr_8_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3612:1: (lv_expr_8_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3613:3: lv_expr_8_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression5018);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:6: ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:6: ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:7: ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )?
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:7: ( '=>' | 'implies' )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==40) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==41) ) {
            	        alt60=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("3636:7: ( '=>' | 'implies' )", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:9: '=>'
            	            {
            	            match(input,40,FOLLOW_40_in_ruleExpression5037); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3641:7: 'implies'
            	            {
            	            match(input,41,FOLLOW_41_in_ruleExpression5053); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3645:2: ( (lv_expr_11_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3646:1: (lv_expr_11_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3646:1: (lv_expr_11_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3647:3: lv_expr_11_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression5075);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3669:2: ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==42) ) {
            	        int LA61_1 = input.LA(2);

            	        if ( (synpred83()) ) {
            	            alt61=1;
            	        }
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3669:4: 'else' ( (lv_expr_13_0= ruleExpression ) )
            	            {
            	            match(input,42,FOLLOW_42_in_ruleExpression5086); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getElseKeyword_1_3_2_0(), null); 
            	                  
            	            }
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3673:1: ( (lv_expr_13_0= ruleExpression ) )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3674:1: (lv_expr_13_0= ruleExpression )
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3674:1: (lv_expr_13_0= ruleExpression )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3675:3: lv_expr_13_0= ruleExpression
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleExpression5107);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:6: ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:6: ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:7: ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:7: ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3699:1: (lv_left_14_0= ruleLeftSquareBracketKeyword )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3699:1: (lv_left_14_0= ruleLeftSquareBracketKeyword )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3700:3: lv_left_14_0= ruleLeftSquareBracketKeyword
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_4_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleExpression5138);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3722:2: ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( ((LA63_0>=RULE_INT && LA63_0<=RULE_NEGATIVE_INTEGER)||(LA63_0>=16 && LA63_0<=17)||(LA63_0>=24 && LA63_0<=25)||LA63_0==28||(LA63_0>=32 && LA63_0<=34)||(LA63_0>=38 && LA63_0<=39)||(LA63_0>=43 && LA63_0<=49)||(LA63_0>=51 && LA63_0<=52)||(LA63_0>=55 && LA63_0<=56)||(LA63_0>=71 && LA63_0<=76)) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3722:3: ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )*
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3722:3: ( (lv_expr_15_0= ruleExpression ) )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3723:1: (lv_expr_15_0= ruleExpression )
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3723:1: (lv_expr_15_0= ruleExpression )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3724:3: lv_expr_15_0= ruleExpression
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleExpression5160);
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

            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3746:2: ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==29) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3746:3: ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3746:3: ( (lv_comma_16_0= ruleComma ) )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3747:1: (lv_comma_16_0= ruleComma )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3747:1: (lv_comma_16_0= ruleComma )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3748:3: lv_comma_16_0= ruleComma
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleComma_in_ruleExpression5182);
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

            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3770:2: ( (lv_expr_17_0= ruleExpression ) )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3771:1: (lv_expr_17_0= ruleExpression )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3771:1: (lv_expr_17_0= ruleExpression )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3772:3: lv_expr_17_0= ruleExpression
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression5203);
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
            	            	    break loop62;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3794:6: ( (lv_right_18_0= ruleRightSquareBracketKeyword ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3795:1: (lv_right_18_0= ruleRightSquareBracketKeyword )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3795:1: (lv_right_18_0= ruleRightSquareBracketKeyword )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3796:3: lv_right_18_0= ruleRightSquareBracketKeyword
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleExpression5228);
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
            	    break loop64;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3826:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3827:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3828:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression5267);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression5277); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3835:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_let_1_0=null;
        Token lv_none_27_0=null;
        Token lv_iden_29_0=null;
        Token lv_univ_31_0=null;
        Token lv_int_33_0=null;
        Token lv_int_34_0=null;
        Token lv_seq_36_0=null;
        Token lv_parO_38_0=null;
        Token lv_parF_40_0=null;
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

        EObject lv_expr_39_0 = null;

        EObject lv_asname_43_0 = null;

        EObject lv_block_51_0 = null;

        EObject lv_leftCurlyBracket_53_0 = null;

        EObject lv_decl_54_0 = null;

        EObject lv_comma_55_0 = null;

        EObject lv_decl_56_0 = null;

        EObject lv_blockOrBar_57_0 = null;

        EObject lv_rightCurlyBracket_58_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3840:6: ( ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )
            int alt74=16;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt74=1;
                }
                break;
            case 55:
            case 56:
                {
                alt74=2;
                }
                break;
            case 25:
            case 38:
            case 39:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt74=3;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 76:
                {
                alt74=4;
                }
                break;
            case RULE_INT:
                {
                alt74=5;
                }
                break;
            case RULE_NEGATIVE_INTEGER:
                {
                alt74=6;
                }
                break;
            case 44:
                {
                alt74=7;
                }
                break;
            case 45:
                {
                alt74=8;
                }
                break;
            case 46:
                {
                alt74=9;
                }
                break;
            case 24:
                {
                alt74=10;
                }
                break;
            case 47:
                {
                alt74=11;
                }
                break;
            case 48:
                {
                alt74=12;
                }
                break;
            case 49:
                {
                alt74=13;
                }
                break;
            case RULE_ID:
            case 16:
            case 17:
            case 51:
            case 52:
                {
                alt74=14;
                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case 14:
                case 54:
                    {
                    alt74=16;
                    }
                    break;
                case 52:
                    {
                    switch ( input.LA(3) ) {
                    case 53:
                        {
                        int LA74_20 = input.LA(4);

                        if ( (LA74_20==RULE_ID) ) {
                            int LA74_21 = input.LA(5);

                            if ( (LA74_21==18||LA74_21==29||LA74_21==53) ) {
                                alt74=16;
                            }
                            else if ( ((LA74_21>=RULE_INT && LA74_21<=RULE_NEGATIVE_INTEGER)||(LA74_21>=16 && LA74_21<=17)||(LA74_21>=24 && LA74_21<=26)||LA74_21==28||LA74_21==30||(LA74_21>=32 && LA74_21<=34)||(LA74_21>=36 && LA74_21<=41)||(LA74_21>=43 && LA74_21<=49)||(LA74_21>=51 && LA74_21<=52)||(LA74_21>=55 && LA74_21<=82)||(LA74_21>=88 && LA74_21<=89)) ) {
                                alt74=15;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )", 74, 21, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA74_20==52) ) {
                            alt74=15;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )", 74, 20, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                    case RULE_ID:
                    case RULE_NEGATIVE_INTEGER:
                    case 16:
                    case 17:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 30:
                    case 32:
                    case 33:
                    case 34:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 51:
                    case 52:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                        {
                        alt74=15;
                        }
                        break;
                    case 18:
                    case 29:
                        {
                        alt74=16;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )", 74, 17, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case 53:
                        {
                        int LA74_20 = input.LA(4);

                        if ( (LA74_20==RULE_ID) ) {
                            int LA74_21 = input.LA(5);

                            if ( (LA74_21==18||LA74_21==29||LA74_21==53) ) {
                                alt74=16;
                            }
                            else if ( ((LA74_21>=RULE_INT && LA74_21<=RULE_NEGATIVE_INTEGER)||(LA74_21>=16 && LA74_21<=17)||(LA74_21>=24 && LA74_21<=26)||LA74_21==28||LA74_21==30||(LA74_21>=32 && LA74_21<=34)||(LA74_21>=36 && LA74_21<=41)||(LA74_21>=43 && LA74_21<=49)||(LA74_21>=51 && LA74_21<=52)||(LA74_21>=55 && LA74_21<=82)||(LA74_21>=88 && LA74_21<=89)) ) {
                                alt74=15;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )", 74, 21, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA74_20==52) ) {
                            alt74=15;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )", 74, 20, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 18:
                    case 29:
                        {
                        alt74=16;
                        }
                        break;
                    case RULE_INT:
                    case RULE_ID:
                    case RULE_NEGATIVE_INTEGER:
                    case 16:
                    case 17:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 30:
                    case 32:
                    case 33:
                    case 34:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 51:
                    case 52:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                        {
                        alt74=15;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )", 74, 18, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_INT:
                case RULE_NEGATIVE_INTEGER:
                case 16:
                case 17:
                case 24:
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
                case 55:
                case 56:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                    {
                    alt74=15;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )", 74, 15, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3841:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'int' ) ) ) | ( (lv_int_34_0= 'Int' ) ) | ( () ( (lv_seq_36_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) ) | ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_51_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) ) )", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3841:2: ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3841:2: ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3841:3: () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3841:3: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3842:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3855:2: ( (lv_let_1_0= 'let' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3856:1: (lv_let_1_0= 'let' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3856:1: (lv_let_1_0= 'let' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3857:3: lv_let_1_0= 'let'
                    {
                    lv_let_1_0=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleTerminalExpression5333); if (failed) return current;
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3876:2: ( (lv_letdecl_2_0= ruleLetDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3877:1: (lv_letdecl_2_0= ruleLetDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3877:1: (lv_letdecl_2_0= ruleLetDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3878:3: lv_letdecl_2_0= ruleLetDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpression5367);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3900:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==29) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3900:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3900:3: ( (lv_comma_3_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3901:1: (lv_comma_3_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3901:1: (lv_comma_3_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3902:3: lv_comma_3_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_0_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5389);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3924:2: ( (lv_letdecl_4_0= ruleLetDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3925:1: (lv_letdecl_4_0= ruleLetDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3925:1: (lv_letdecl_4_0= ruleLetDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3926:3: lv_letdecl_4_0= ruleLetDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpression5410);
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
                    	    break loop65;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3948:4: ( (lv_blockOrBar_5_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3949:1: (lv_blockOrBar_5_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3949:1: (lv_blockOrBar_5_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3950:3: lv_blockOrBar_5_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_0_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5433);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3973:6: ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3973:6: ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3973:7: () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3973:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3974:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3987:2: ( (lv_quant_7_0= ruleQuant ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3988:1: (lv_quant_7_0= ruleQuant )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3988:1: (lv_quant_7_0= ruleQuant )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3989:3: lv_quant_7_0= ruleQuant
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getQuantQuantParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQuant_in_ruleTerminalExpression5474);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4011:2: ( (lv_decl_8_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4012:1: (lv_decl_8_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4012:1: (lv_decl_8_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4013:3: lv_decl_8_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5495);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4035:2: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==29) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4035:3: ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4035:3: ( (lv_comma_9_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4036:1: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4036:1: (lv_comma_9_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4037:3: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_1_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5517);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4059:2: ( (lv_decl_10_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4060:1: (lv_decl_10_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4060:1: (lv_decl_10_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4061:3: lv_decl_10_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5538);
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
                    	    break loop66;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4083:4: ( (lv_blockOrBar_11_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4084:1: (lv_blockOrBar_11_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4084:1: (lv_blockOrBar_11_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4085:3: lv_blockOrBar_11_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5561);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4108:6: ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4108:6: ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4108:7: () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4108:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4109:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4122:2: ( (lv_unOp_13_0= ruleUnOp ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4123:1: (lv_unOp_13_0= ruleUnOp )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4123:1: (lv_unOp_13_0= ruleUnOp )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4124:3: lv_unOp_13_0= ruleUnOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getUnOpUnOpParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnOp_in_ruleTerminalExpression5602);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4146:2: ( (lv_expr_14_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4147:1: (lv_expr_14_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4147:1: (lv_expr_14_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4148:3: lv_expr_14_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5623);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4171:6: ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4171:6: ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4171:7: () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4171:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4172:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4185:2: ( (lv_common_16_0= ruleCommonQuantUnOp ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4186:1: (lv_common_16_0= ruleCommonQuantUnOp )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4186:1: (lv_common_16_0= ruleCommonQuantUnOp )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4187:3: lv_common_16_0= ruleCommonQuantUnOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommonCommonQuantUnOpParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommonQuantUnOp_in_ruleTerminalExpression5664);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )
                    int alt68=2;
                    switch ( input.LA(1) ) {
                    case 14:
                    case 54:
                        {
                        alt68=1;
                        }
                        break;
                    case 52:
                        {
                        int LA68_3 = input.LA(2);

                        if ( (synpred94()) ) {
                            alt68=1;
                        }
                        else if ( (true) ) {
                            alt68=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("4209:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 68, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA68_4 = input.LA(2);

                        if ( (synpred94()) ) {
                            alt68=1;
                        }
                        else if ( (true) ) {
                            alt68=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("4209:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 68, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                    case RULE_NEGATIVE_INTEGER:
                    case 16:
                    case 17:
                    case 24:
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
                    case 55:
                    case 56:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                        {
                        alt68=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4209:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:3: ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:3: ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:4: ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:4: ( (lv_decl_17_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4210:1: (lv_decl_17_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4210:1: (lv_decl_17_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4211:3: lv_decl_17_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5687);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4233:2: ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==29) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4233:3: ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4233:3: ( (lv_comma_18_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4234:1: (lv_comma_18_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4234:1: (lv_comma_18_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4235:3: lv_comma_18_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_3_2_0_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5709);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4257:2: ( (lv_decl_19_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4258:1: (lv_decl_19_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4258:1: (lv_decl_19_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4259:3: lv_decl_19_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5730);
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
                            	    break loop67;
                                }
                            } while (true);

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4281:4: ( (lv_blockOrBar_20_0= ruleBlockOrBar ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4282:1: (lv_blockOrBar_20_0= ruleBlockOrBar )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4282:1: (lv_blockOrBar_20_0= ruleBlockOrBar )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4283:3: lv_blockOrBar_20_0= ruleBlockOrBar
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_3_2_0_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5753);
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4306:6: ( (lv_expr_21_0= ruleExpression ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4306:6: ( (lv_expr_21_0= ruleExpression ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4307:1: (lv_expr_21_0= ruleExpression )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4307:1: (lv_expr_21_0= ruleExpression )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4308:3: lv_expr_21_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_3_2_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5781);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4331:6: ( () RULE_INT )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4331:6: ( () RULE_INT )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4331:7: () RULE_INT
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4331:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4332:2: 
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

                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression5811); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_4_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4350:6: ( () RULE_NEGATIVE_INTEGER )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4350:6: ( () RULE_NEGATIVE_INTEGER )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4350:7: () RULE_NEGATIVE_INTEGER
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4350:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4351:2: 
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

                    match(input,RULE_NEGATIVE_INTEGER,FOLLOW_RULE_NEGATIVE_INTEGER_in_ruleTerminalExpression5839); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getNEGATIVE_INTEGERTerminalRuleCall_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4369:6: ( () ( (lv_none_27_0= 'none' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4369:6: ( () ( (lv_none_27_0= 'none' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4369:7: () ( (lv_none_27_0= 'none' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4369:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4370:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4383:2: ( (lv_none_27_0= 'none' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4384:1: (lv_none_27_0= 'none' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4384:1: (lv_none_27_0= 'none' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4385:3: lv_none_27_0= 'none'
                    {
                    lv_none_27_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleTerminalExpression5876); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4405:6: ( () ( (lv_iden_29_0= 'iden' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4405:6: ( () ( (lv_iden_29_0= 'iden' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4405:7: () ( (lv_iden_29_0= 'iden' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4405:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4406:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4419:2: ( (lv_iden_29_0= 'iden' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4420:1: (lv_iden_29_0= 'iden' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4420:1: (lv_iden_29_0= 'iden' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4421:3: lv_iden_29_0= 'iden'
                    {
                    lv_iden_29_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleTerminalExpression5927); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:6: ( () ( (lv_univ_31_0= 'univ' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:6: ( () ( (lv_univ_31_0= 'univ' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:7: () ( (lv_univ_31_0= 'univ' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4442:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4455:2: ( (lv_univ_31_0= 'univ' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4456:1: (lv_univ_31_0= 'univ' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4456:1: (lv_univ_31_0= 'univ' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4457:3: lv_univ_31_0= 'univ'
                    {
                    lv_univ_31_0=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleTerminalExpression5978); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4477:6: ( () ( (lv_int_33_0= 'int' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4477:6: ( () ( (lv_int_33_0= 'int' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4477:7: () ( (lv_int_33_0= 'int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4477:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4478:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4491:2: ( (lv_int_33_0= 'int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4492:1: (lv_int_33_0= 'int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4492:1: (lv_int_33_0= 'int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4493:3: lv_int_33_0= 'int'
                    {
                    lv_int_33_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleTerminalExpression6029); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getIntIntKeyword_9_1_0(), "int"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "int", lv_int_33_0, "int", lastConsumedNode);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4513:6: ( (lv_int_34_0= 'Int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4513:6: ( (lv_int_34_0= 'Int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4514:1: (lv_int_34_0= 'Int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4514:1: (lv_int_34_0= 'Int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4515:3: lv_int_34_0= 'Int'
                    {
                    lv_int_34_0=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleTerminalExpression6067); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getIntIntKeyword_10_0(), "int"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "int", lv_int_34_0, "Int", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4535:6: ( () ( (lv_seq_36_0= 'seq/Int' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4535:6: ( () ( (lv_seq_36_0= 'seq/Int' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4535:7: () ( (lv_seq_36_0= 'seq/Int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4535:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4536:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4549:2: ( (lv_seq_36_0= 'seq/Int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4550:1: (lv_seq_36_0= 'seq/Int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4550:1: (lv_seq_36_0= 'seq/Int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4551:3: lv_seq_36_0= 'seq/Int'
                    {
                    lv_seq_36_0=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleTerminalExpression6117); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getSeqSeqIntKeyword_11_1_0(), "seq"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "seq", lv_seq_36_0, "seq/Int", lastConsumedNode);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4571:6: ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4571:6: ( () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4571:7: () ( (lv_parO_38_0= '(' ) ) ( (lv_expr_39_0= ruleExpression ) ) ( (lv_parF_40_0= ')' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4571:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4572:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4585:2: ( (lv_parO_38_0= '(' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4586:1: (lv_parO_38_0= '(' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4586:1: (lv_parO_38_0= '(' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4587:3: lv_parO_38_0= '('
                    {
                    lv_parO_38_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleTerminalExpression6168); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getParOLeftParenthesisKeyword_12_1_0(), "parO"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "parO", lv_parO_38_0, "(", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4606:2: ( (lv_expr_39_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4607:1: (lv_expr_39_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4607:1: (lv_expr_39_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4608:3: lv_expr_39_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_12_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression6202);
                    lv_expr_39_0=ruleExpression();
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
                      	        		lv_expr_39_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4630:2: ( (lv_parF_40_0= ')' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4631:1: (lv_parF_40_0= ')' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4631:1: (lv_parF_40_0= ')' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4632:3: lv_parF_40_0= ')'
                    {
                    lv_parF_40_0=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleTerminalExpression6220); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getParFRightParenthesisKeyword_12_3_0(), "parF"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "parF", lv_parF_40_0, ")", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4652:6: ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4652:6: ( () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4652:7: () ( '@' )? ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )? ( ( ( RULE_ID ) ) | 'this' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4652:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4653:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4666:2: ( '@' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==51) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4666:4: '@'
                            {
                            match(input,51,FOLLOW_51_in_ruleTerminalExpression6264); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExpressionAccess().getCommercialAtKeyword_13_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4670:3: ( ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/' )?
                    int alt71=2;
                    switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA71_1 = input.LA(2);

                            if ( (LA71_1==53) ) {
                                alt71=1;
                            }
                            }
                            break;
                        case 16:
                        case 17:
                            {
                            alt71=1;
                            }
                            break;
                        case 52:
                            {
                            int LA71_3 = input.LA(2);

                            if ( (LA71_3==53) ) {
                                alt71=1;
                            }
                            }
                            break;
                    }

                    switch (alt71) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4670:4: ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' ) '/'
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4670:4: ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' )
                            int alt70=4;
                            switch ( input.LA(1) ) {
                            case RULE_ID:
                                {
                                alt70=1;
                                }
                                break;
                            case 16:
                                {
                                alt70=2;
                                }
                                break;
                            case 17:
                                {
                                alt70=3;
                                }
                                break;
                            case 52:
                                {
                                alt70=4;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("4670:4: ( ( (lv_asname_43_0= ruleAsName ) ) | 'fun' | 'pred' | 'this' )", 70, 0, input);

                                throw nvae;
                            }

                            switch (alt70) {
                                case 1 :
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4670:5: ( (lv_asname_43_0= ruleAsName ) )
                                    {
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4670:5: ( (lv_asname_43_0= ruleAsName ) )
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4671:1: (lv_asname_43_0= ruleAsName )
                                    {
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4671:1: (lv_asname_43_0= ruleAsName )
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4672:3: lv_asname_43_0= ruleAsName
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getAsnameAsNameParserRuleCall_13_2_0_0_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleAsName_in_ruleTerminalExpression6289);
                                    lv_asname_43_0=ruleAsName();
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
                                      	       			"asname",
                                      	        		lv_asname_43_0, 
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
                                case 2 :
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4695:7: 'fun'
                                    {
                                    match(input,16,FOLLOW_16_in_ruleTerminalExpression6305); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getFunKeyword_13_2_0_1(), null); 
                                          
                                    }

                                    }
                                    break;
                                case 3 :
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4700:7: 'pred'
                                    {
                                    match(input,17,FOLLOW_17_in_ruleTerminalExpression6321); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getPredKeyword_13_2_0_2(), null); 
                                          
                                    }

                                    }
                                    break;
                                case 4 :
                                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4705:7: 'this'
                                    {
                                    match(input,52,FOLLOW_52_in_ruleTerminalExpression6337); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getTerminalExpressionAccess().getThisKeyword_13_2_0_3(), null); 
                                          
                                    }

                                    }
                                    break;

                            }

                            match(input,53,FOLLOW_53_in_ruleTerminalExpression6348); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExpressionAccess().getSolidusKeyword_13_2_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4713:3: ( ( ( RULE_ID ) ) | 'this' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==RULE_ID) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==52) ) {
                        alt72=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4713:3: ( ( ( RULE_ID ) ) | 'this' )", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4713:4: ( ( RULE_ID ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4713:4: ( ( RULE_ID ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4714:1: ( RULE_ID )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4714:1: ( RULE_ID )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4715:3: RULE_ID
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
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression6373); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getTerminalExpressionAccess().getNameRefReferencesNameCrossReference_13_3_0_0(), "nameRef"); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4731:7: 'this'
                            {
                            match(input,52,FOLLOW_52_in_ruleTerminalExpression6389); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExpressionAccess().getThisKeyword_13_3_1(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 15 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4736:6: ( () ( (lv_block_51_0= ruleBlock ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4736:6: ( () ( (lv_block_51_0= ruleBlock ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4736:7: () ( (lv_block_51_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4736:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4737:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4750:2: ( (lv_block_51_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4751:1: (lv_block_51_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4751:1: (lv_block_51_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4752:3: lv_block_51_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockBlockParserRuleCall_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleTerminalExpression6431);
                    lv_block_51_0=ruleBlock();
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
                      	        		lv_block_51_0, 
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
                case 16 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4775:6: ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4775:6: ( () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4775:7: () ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) ) ( (lv_decl_54_0= ruleDecl ) ) ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )* ( (lv_blockOrBar_57_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4775:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4776:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTerminalExpressionAccess().getExpressionAction_15_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionAction_15_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4789:2: ( (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4790:1: (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4790:1: (lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4791:3: lv_leftCurlyBracket_53_0= ruleLeftCurlyBracket
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLeftCurlyBracketLeftCurlyBracketParserRuleCall_15_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleTerminalExpression6472);
                    lv_leftCurlyBracket_53_0=ruleLeftCurlyBracket();
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
                      	        		lv_leftCurlyBracket_53_0, 
                      	        		"LeftCurlyBracket", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4813:2: ( (lv_decl_54_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4814:1: (lv_decl_54_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4814:1: (lv_decl_54_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4815:3: lv_decl_54_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_15_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression6493);
                    lv_decl_54_0=ruleDecl();
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
                      	        		lv_decl_54_0, 
                      	        		"Decl", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4837:2: ( ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==29) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4837:3: ( (lv_comma_55_0= ruleComma ) ) ( (lv_decl_56_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4837:3: ( (lv_comma_55_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4838:1: (lv_comma_55_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4838:1: (lv_comma_55_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4839:3: lv_comma_55_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_15_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression6515);
                    	    lv_comma_55_0=ruleComma();
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
                    	      	        		lv_comma_55_0, 
                    	      	        		"Comma", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4861:2: ( (lv_decl_56_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4862:1: (lv_decl_56_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4862:1: (lv_decl_56_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4863:3: lv_decl_56_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_15_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression6536);
                    	    lv_decl_56_0=ruleDecl();
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
                    	      	        		lv_decl_56_0, 
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
                    	    break loop73;
                        }
                    } while (true);

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4885:4: ( (lv_blockOrBar_57_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4886:1: (lv_blockOrBar_57_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4886:1: (lv_blockOrBar_57_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4887:3: lv_blockOrBar_57_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_15_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression6559);
                    lv_blockOrBar_57_0=ruleBlockOrBar();
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
                      	        		lv_blockOrBar_57_0, 
                      	        		"BlockOrBar", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4909:2: ( (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4910:1: (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4910:1: (lv_rightCurlyBracket_58_0= ruleRightCurlyBracket )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4911:3: lv_rightCurlyBracket_58_0= ruleRightCurlyBracket
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getRightCurlyBracketRightCurlyBracketParserRuleCall_15_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleTerminalExpression6580);
                    lv_rightCurlyBracket_58_0=ruleRightCurlyBracket();
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
                      	        		lv_rightCurlyBracket_58_0, 
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4941:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4942:2: (iv_ruleDecl= ruleDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4943:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl6617);
            iv_ruleDecl=ruleDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl6627); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4950:1: ruleDecl returns [EObject current=null] : ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyName_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_propertyName_4_0 = null;

        EObject lv_colon_5_0 = null;

        EObject lv_expr_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4955:6: ( ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4956:1: ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4956:1: ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4956:2: ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4956:2: ( 'private' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==14) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4956:4: 'private'
                    {
                    match(input,14,FOLLOW_14_in_ruleDecl6663); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4960:3: ( 'disj' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==54) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4960:5: 'disj'
                    {
                    match(input,54,FOLLOW_54_in_ruleDecl6676); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4964:3: ( (lv_propertyName_2_0= rulePropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4965:1: (lv_propertyName_2_0= rulePropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4965:1: (lv_propertyName_2_0= rulePropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4966:3: lv_propertyName_2_0= rulePropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleDecl6699);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4988:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==29) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4988:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4988:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4989:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4989:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4990:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleDecl6721);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5012:2: ( (lv_propertyName_4_0= rulePropertyName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5013:1: (lv_propertyName_4_0= rulePropertyName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5013:1: (lv_propertyName_4_0= rulePropertyName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5014:3: lv_propertyName_4_0= rulePropertyName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyName_in_ruleDecl6742);
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
            	    break loop77;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5036:4: ( (lv_colon_5_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5037:1: (lv_colon_5_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5037:1: (lv_colon_5_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5038:3: lv_colon_5_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getColonColonParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleDecl6765);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5060:2: ( 'disj' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==54) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5060:4: 'disj'
                    {
                    match(input,54,FOLLOW_54_in_ruleDecl6776); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_5(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5064:3: ( (lv_expr_7_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5065:1: (lv_expr_7_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5065:1: (lv_expr_7_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5066:3: lv_expr_7_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDecl6799);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5096:1: entryRuleLetDecl returns [EObject current=null] : iv_ruleLetDecl= ruleLetDecl EOF ;
    public final EObject entryRuleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5097:2: (iv_ruleLetDecl= ruleLetDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5098:2: iv_ruleLetDecl= ruleLetDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetDecl_in_entryRuleLetDecl6835);
            iv_ruleLetDecl=ruleLetDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDecl6845); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5105:1: ruleLetDecl returns [EObject current=null] : ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_nameExpression_0_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5110:6: ( ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5111:1: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5111:1: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5111:2: ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5111:2: ( (lv_nameExpression_0_0= rulePropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5112:1: (lv_nameExpression_0_0= rulePropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5112:1: (lv_nameExpression_0_0= rulePropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5113:3: lv_nameExpression_0_0= rulePropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getNameExpressionPropertyNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleLetDecl6891);
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

            match(input,26,FOLLOW_26_in_ruleLetDecl6901); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetDeclAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5139:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5140:1: (lv_expr_2_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5140:1: (lv_expr_2_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5141:3: lv_expr_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getExprExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetDecl6922);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5171:1: entryRuleQuant returns [String current=null] : iv_ruleQuant= ruleQuant EOF ;
    public final String entryRuleQuant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuant = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5172:2: (iv_ruleQuant= ruleQuant EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5173:2: iv_ruleQuant= ruleQuant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQuantRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQuant_in_entryRuleQuant6959);
            iv_ruleQuant=ruleQuant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQuant.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuant6970); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5180:1: ruleQuant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'all' | kw= 'sum' ) ;
    public final AntlrDatatypeRuleToken ruleQuant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5185:6: ( (kw= 'all' | kw= 'sum' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5186:1: (kw= 'all' | kw= 'sum' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5186:1: (kw= 'all' | kw= 'sum' )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==55) ) {
                alt79=1;
            }
            else if ( (LA79_0==56) ) {
                alt79=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5186:1: (kw= 'all' | kw= 'sum' )", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5187:2: kw= 'all'
                    {
                    kw=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleQuant7008); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getQuantAccess().getAllKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5194:2: kw= 'sum'
                    {
                    kw=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_ruleQuant7027); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5207:1: entryRuleBinOp returns [EObject current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final EObject entryRuleBinOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5208:2: (iv_ruleBinOp= ruleBinOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5209:2: iv_ruleBinOp= ruleBinOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBinOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBinOp_in_entryRuleBinOp7067);
            iv_ruleBinOp=ruleBinOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBinOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinOp7077); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5216:1: ruleBinOp returns [EObject current=null] : ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) ) ;
    public final EObject ruleBinOp() throws RecognitionException {
        EObject current = null;

        EObject lv_dot_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5221:6: ( ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5222:1: ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5222:1: ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5222:2: () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5222:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5223:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5236:2: ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )
            int alt80=16;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt80=1;
                }
                break;
            case 58:
                {
                alt80=2;
                }
                break;
            case 59:
                {
                alt80=3;
                }
                break;
            case 60:
                {
                alt80=4;
                }
                break;
            case 61:
                {
                alt80=5;
                }
                break;
            case 62:
                {
                alt80=6;
                }
                break;
            case 63:
                {
                alt80=7;
                }
                break;
            case 37:
                {
                alt80=8;
                }
                break;
            case 64:
                {
                alt80=9;
                }
                break;
            case 65:
                {
                alt80=10;
                }
                break;
            case 66:
                {
                alt80=11;
                }
                break;
            case 67:
                {
                alt80=12;
                }
                break;
            case 88:
                {
                alt80=13;
                }
                break;
            case 68:
                {
                alt80=14;
                }
                break;
            case 69:
                {
                alt80=15;
                }
                break;
            case 70:
                {
                alt80=16;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5236:2: ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5236:4: '||'
                    {
                    match(input,57,FOLLOW_57_in_ruleBinOp7125); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5241:7: 'or'
                    {
                    match(input,58,FOLLOW_58_in_ruleBinOp7141); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getOrKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5246:7: '&&'
                    {
                    match(input,59,FOLLOW_59_in_ruleBinOp7157); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAmpersandAmpersandKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5251:7: 'and'
                    {
                    match(input,60,FOLLOW_60_in_ruleBinOp7173); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAndKeyword_1_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5256:7: '&'
                    {
                    match(input,61,FOLLOW_61_in_ruleBinOp7189); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAmpersandKeyword_1_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5261:7: '<=>'
                    {
                    match(input,62,FOLLOW_62_in_ruleBinOp7205); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5266:7: 'iff'
                    {
                    match(input,63,FOLLOW_63_in_ruleBinOp7221); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getIffKeyword_1_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5271:7: '+'
                    {
                    match(input,37,FOLLOW_37_in_ruleBinOp7237); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getPlusSignKeyword_1_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5276:7: '-'
                    {
                    match(input,64,FOLLOW_64_in_ruleBinOp7253); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getHyphenMinusKeyword_1_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5281:7: '++'
                    {
                    match(input,65,FOLLOW_65_in_ruleBinOp7269); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getPlusSignPlusSignKeyword_1_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5286:7: '<:'
                    {
                    match(input,66,FOLLOW_66_in_ruleBinOp7285); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignColonKeyword_1_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5291:7: ':>'
                    {
                    match(input,67,FOLLOW_67_in_ruleBinOp7301); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getColonGreaterThanSignKeyword_1_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5296:6: ( (lv_dot_13_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5296:6: ( (lv_dot_13_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5297:1: (lv_dot_13_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5297:1: (lv_dot_13_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5298:3: lv_dot_13_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBinOpAccess().getDotDotParserRuleCall_1_12_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleBinOp7328);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5321:7: '<<'
                    {
                    match(input,68,FOLLOW_68_in_ruleBinOp7344); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignLessThanSignKeyword_1_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5326:7: '>>'
                    {
                    match(input,69,FOLLOW_69_in_ruleBinOp7360); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignKeyword_1_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5331:7: '>>>'
                    {
                    match(input,70,FOLLOW_70_in_ruleBinOp7376); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5343:1: entryRuleUnOp returns [EObject current=null] : iv_ruleUnOp= ruleUnOp EOF ;
    public final EObject entryRuleUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5344:2: (iv_ruleUnOp= ruleUnOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5345:2: iv_ruleUnOp= ruleUnOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnOp_in_entryRuleUnOp7413);
            iv_ruleUnOp=ruleUnOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOp7423); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5352:1: ruleUnOp returns [EObject current=null] : ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) ) ;
    public final EObject ruleUnOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_4_1=null;
        Token lv_op_4_2=null;
        Token lv_op_4_3=null;
        Token lv_op_4_4=null;
        Token lv_op_4_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5357:6: ( ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5358:1: ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5358:1: ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5358:2: () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5358:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5359:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5372:2: ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt82=1;
                }
                break;
            case 71:
                {
                alt82=2;
                }
                break;
            case 25:
                {
                alt82=3;
                }
                break;
            case 38:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt82=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5372:2: ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5372:4: 'not'
                    {
                    match(input,39,FOLLOW_39_in_ruleUnOp7471); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getNotKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5377:7: 'set'
                    {
                    match(input,71,FOLLOW_71_in_ruleUnOp7487); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getSetKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5382:7: 'seq'
                    {
                    match(input,25,FOLLOW_25_in_ruleUnOp7503); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getSeqKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5387:6: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5387:6: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5388:1: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5388:1: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5389:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5389:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )
                    int alt81=5;
                    switch ( input.LA(1) ) {
                    case 38:
                        {
                        alt81=1;
                        }
                        break;
                    case 72:
                        {
                        alt81=2;
                        }
                        break;
                    case 73:
                        {
                        alt81=3;
                        }
                        break;
                    case 74:
                        {
                        alt81=4;
                        }
                        break;
                    case 75:
                        {
                        alt81=5;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("5389:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )", 81, 0, input);

                        throw nvae;
                    }

                    switch (alt81) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5390:3: lv_op_4_1= '!'
                            {
                            lv_op_4_1=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_ruleUnOp7529); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5408:8: lv_op_4_2= '#'
                            {
                            lv_op_4_2=(Token)input.LT(1);
                            match(input,72,FOLLOW_72_in_ruleUnOp7558); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5426:8: lv_op_4_3= '~'
                            {
                            lv_op_4_3=(Token)input.LT(1);
                            match(input,73,FOLLOW_73_in_ruleUnOp7587); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5444:8: lv_op_4_4= '*'
                            {
                            lv_op_4_4=(Token)input.LT(1);
                            match(input,74,FOLLOW_74_in_ruleUnOp7616); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5462:8: lv_op_4_5= '^'
                            {
                            lv_op_4_5=(Token)input.LT(1);
                            match(input,75,FOLLOW_75_in_ruleUnOp7645); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5491:1: entryRuleCommonQuantUnOp returns [EObject current=null] : iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF ;
    public final EObject entryRuleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonQuantUnOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5492:2: (iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5493:2: iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommonQuantUnOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommonQuantUnOp_in_entryRuleCommonQuantUnOp7698);
            iv_ruleCommonQuantUnOp=ruleCommonQuantUnOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommonQuantUnOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonQuantUnOp7708); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5500:1: ruleCommonQuantUnOp returns [EObject current=null] : ( () ( 'no' | 'some' | 'lone' | 'one' ) ) ;
    public final EObject ruleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5505:6: ( ( () ( 'no' | 'some' | 'lone' | 'one' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5506:1: ( () ( 'no' | 'some' | 'lone' | 'one' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5506:1: ( () ( 'no' | 'some' | 'lone' | 'one' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5506:2: () ( 'no' | 'some' | 'lone' | 'one' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5506:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5507:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5520:2: ( 'no' | 'some' | 'lone' | 'one' )
            int alt83=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt83=1;
                }
                break;
            case 34:
                {
                alt83=2;
                }
                break;
            case 32:
                {
                alt83=3;
                }
                break;
            case 33:
                {
                alt83=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5520:2: ( 'no' | 'some' | 'lone' | 'one' )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5520:4: 'no'
                    {
                    match(input,76,FOLLOW_76_in_ruleCommonQuantUnOp7756); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getNoKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5525:7: 'some'
                    {
                    match(input,34,FOLLOW_34_in_ruleCommonQuantUnOp7772); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getSomeKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5530:7: 'lone'
                    {
                    match(input,32,FOLLOW_32_in_ruleCommonQuantUnOp7788); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getLoneKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5535:7: 'one'
                    {
                    match(input,33,FOLLOW_33_in_ruleCommonQuantUnOp7804); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5547:1: entryRuleCompareOp returns [String current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final String entryRuleCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5548:2: (iv_ruleCompareOp= ruleCompareOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5549:2: iv_ruleCompareOp= ruleCompareOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOp_in_entryRuleCompareOp7842);
            iv_ruleCompareOp=ruleCompareOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOp7853); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5556:1: ruleCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5561:6: ( (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5562:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5562:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            int alt84=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt84=1;
                }
                break;
            case 36:
                {
                alt84=2;
                }
                break;
            case 77:
                {
                alt84=3;
                }
                break;
            case 78:
                {
                alt84=4;
                }
                break;
            case 79:
                {
                alt84=5;
                }
                break;
            case 80:
                {
                alt84=6;
                }
                break;
            case 81:
                {
                alt84=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5562:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5563:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleCompareOp7891); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getEqualsSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5570:2: kw= 'in'
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleCompareOp7910); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getInKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5577:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleCompareOp7929); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getLessThanSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5584:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleCompareOp7948); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getGreaterThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5591:2: kw= '=<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleCompareOp7967); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getEqualsSignLessThanSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5598:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleCompareOp7986); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getLessThanSignEqualsSignKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5605:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_ruleCompareOp8005); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5618:1: entryRuleArrowOp returns [EObject current=null] : iv_ruleArrowOp= ruleArrowOp EOF ;
    public final EObject entryRuleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5619:2: (iv_ruleArrowOp= ruleArrowOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5620:2: iv_ruleArrowOp= ruleArrowOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrowOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArrowOp_in_entryRuleArrowOp8045);
            iv_ruleArrowOp=ruleArrowOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrowOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowOp8055); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5627:1: ruleArrowOp returns [EObject current=null] : ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) ) ;
    public final EObject ruleArrowOp() throws RecognitionException {
        EObject current = null;

        Token lv_arrow_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5632:6: ( ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5633:1: ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5633:1: ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5633:2: ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5633:2: ( 'some' | 'one' | 'lone' | 'set' )?
            int alt85=5;
            switch ( input.LA(1) ) {
                case 34:
                    {
                    alt85=1;
                    }
                    break;
                case 33:
                    {
                    alt85=2;
                    }
                    break;
                case 32:
                    {
                    alt85=3;
                    }
                    break;
                case 71:
                    {
                    alt85=4;
                    }
                    break;
            }

            switch (alt85) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5633:4: 'some'
                    {
                    match(input,34,FOLLOW_34_in_ruleArrowOp8091); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSomeKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5638:7: 'one'
                    {
                    match(input,33,FOLLOW_33_in_ruleArrowOp8107); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getOneKeyword_0_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5643:7: 'lone'
                    {
                    match(input,32,FOLLOW_32_in_ruleArrowOp8123); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getLoneKeyword_0_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5648:7: 'set'
                    {
                    match(input,71,FOLLOW_71_in_ruleArrowOp8139); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSetKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5652:3: ( (lv_arrow_4_0= '->' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5653:1: (lv_arrow_4_0= '->' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5653:1: (lv_arrow_4_0= '->' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5654:3: lv_arrow_4_0= '->'
            {
            lv_arrow_4_0=(Token)input.LT(1);
            match(input,82,FOLLOW_82_in_ruleArrowOp8159); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5681:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5682:2: (iv_ruleBlock= ruleBlock EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5683:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock8208);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock8218); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5690:1: ruleBlock returns [EObject current=null] : ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_leftC_0_0 = null;

        EObject lv_expr_1_0 = null;

        EObject lv_rightC_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5695:6: ( ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5696:1: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5696:1: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5696:2: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5696:2: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5697:1: (lv_leftC_0_0= ruleLeftCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5697:1: (lv_leftC_0_0= ruleLeftCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5698:3: lv_leftC_0_0= ruleLeftCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getLeftCLeftCurlyBracketParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleBlock8264);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5720:2: ( (lv_expr_1_0= ruleExpression ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=RULE_INT && LA86_0<=RULE_NEGATIVE_INTEGER)||(LA86_0>=16 && LA86_0<=17)||(LA86_0>=24 && LA86_0<=25)||LA86_0==28||(LA86_0>=32 && LA86_0<=34)||(LA86_0>=38 && LA86_0<=39)||(LA86_0>=43 && LA86_0<=49)||(LA86_0>=51 && LA86_0<=52)||(LA86_0>=55 && LA86_0<=56)||(LA86_0>=71 && LA86_0<=76)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5721:1: (lv_expr_1_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5721:1: (lv_expr_1_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5722:3: lv_expr_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getExprExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBlock8285);
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
            	    break loop86;
                }
            } while (true);

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5744:3: ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5745:1: (lv_rightC_2_0= ruleRightCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5745:1: (lv_rightC_2_0= ruleRightCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5746:3: lv_rightC_2_0= ruleRightCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getRightCRightCurlyBracketParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleBlock8307);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5776:1: entryRuleBlockOrBar returns [EObject current=null] : iv_ruleBlockOrBar= ruleBlockOrBar EOF ;
    public final EObject entryRuleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockOrBar = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5777:2: (iv_ruleBlockOrBar= ruleBlockOrBar EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5778:2: iv_ruleBlockOrBar= ruleBlockOrBar EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockOrBarRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar8343);
            iv_ruleBlockOrBar=ruleBlockOrBar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockOrBar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockOrBar8353); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5785:1: ruleBlockOrBar returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5790:6: ( ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5791:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5791:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==28) ) {
                alt87=1;
            }
            else if ( (LA87_0==83) ) {
                alt87=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5791:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5791:2: ( (lv_block_0_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5791:2: ( (lv_block_0_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5792:1: (lv_block_0_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5792:1: (lv_block_0_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5793:3: lv_block_0_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getBlockBlockParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleBlockOrBar8399);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5816:6: ( '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5816:6: ( '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5816:8: '|' ( (lv_expr_2_0= ruleExpression ) )
                    {
                    match(input,83,FOLLOW_83_in_ruleBlockOrBar8416); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockOrBarAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5820:1: ( (lv_expr_2_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5821:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5821:1: (lv_expr_2_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5822:3: lv_expr_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getExprExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBlockOrBar8437);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5852:1: entryRuleOpenName returns [EObject current=null] : iv_ruleOpenName= ruleOpenName EOF ;
    public final EObject entryRuleOpenName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5853:2: (iv_ruleOpenName= ruleOpenName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5854:2: iv_ruleOpenName= ruleOpenName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOpenNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOpenName_in_entryRuleOpenName8474);
            iv_ruleOpenName=ruleOpenName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOpenName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenName8484); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5861:1: ruleOpenName returns [EObject current=null] : ( 'open' ( (lv_importURI_1_0= ruleName ) ) ) ;
    public final EObject ruleOpenName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importURI_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5866:6: ( ( 'open' ( (lv_importURI_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5867:1: ( 'open' ( (lv_importURI_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5867:1: ( 'open' ( (lv_importURI_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5867:3: 'open' ( (lv_importURI_1_0= ruleName ) )
            {
            match(input,84,FOLLOW_84_in_ruleOpenName8519); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOpenNameAccess().getOpenKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5871:1: ( (lv_importURI_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5872:1: (lv_importURI_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5872:1: (lv_importURI_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5873:3: lv_importURI_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOpenNameAccess().getImportURINameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleOpenName8540);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5903:1: entryRuleFactName returns [EObject current=null] : iv_ruleFactName= ruleFactName EOF ;
    public final EObject entryRuleFactName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5904:2: (iv_ruleFactName= ruleFactName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5905:2: iv_ruleFactName= ruleFactName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactName_in_entryRuleFactName8576);
            iv_ruleFactName=ruleFactName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactName8586); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5912:1: ruleFactName returns [EObject current=null] : ( () 'fact' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleFactName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5917:6: ( ( () 'fact' ( (lv_name_2_0= ruleName ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5918:1: ( () 'fact' ( (lv_name_2_0= ruleName ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5918:1: ( () 'fact' ( (lv_name_2_0= ruleName ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5918:2: () 'fact' ( (lv_name_2_0= ruleName ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5918:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5919:2: 
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

            match(input,85,FOLLOW_85_in_ruleFactName8633); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFactNameAccess().getFactKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5936:1: ( (lv_name_2_0= ruleName ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID||LA88_0==52) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5937:1: (lv_name_2_0= ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5937:1: (lv_name_2_0= ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5938:3: lv_name_2_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFactNameAccess().getNameNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleFactName8654);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5968:1: entryRuleAssertionName returns [EObject current=null] : iv_ruleAssertionName= ruleAssertionName EOF ;
    public final EObject entryRuleAssertionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5969:2: (iv_ruleAssertionName= ruleAssertionName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5970:2: iv_ruleAssertionName= ruleAssertionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertionName_in_entryRuleAssertionName8691);
            iv_ruleAssertionName=ruleAssertionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertionName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionName8701); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5977:1: ruleAssertionName returns [EObject current=null] : ( () 'assert' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleAssertionName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5982:6: ( ( () 'assert' ( (lv_name_2_0= ruleName ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5983:1: ( () 'assert' ( (lv_name_2_0= ruleName ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5983:1: ( () 'assert' ( (lv_name_2_0= ruleName ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5983:2: () 'assert' ( (lv_name_2_0= ruleName ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5983:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5984:2: 
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

            match(input,86,FOLLOW_86_in_ruleAssertionName8748); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssertionNameAccess().getAssertKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6001:1: ( (lv_name_2_0= ruleName ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID||LA89_0==52) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6002:1: (lv_name_2_0= ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6002:1: (lv_name_2_0= ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6003:3: lv_name_2_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssertionNameAccess().getNameNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleAssertionName8769);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6033:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6034:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6035:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName8806);
            iv_ruleFunctionName=ruleFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunctionName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName8816); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6042:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6047:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6048:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6048:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6049:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6049:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6050:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunctionNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleFunctionName8861);
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


    // $ANTLR start entryRuleFunctionNamewParam
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6080:1: entryRuleFunctionNamewParam returns [EObject current=null] : iv_ruleFunctionNamewParam= ruleFunctionNamewParam EOF ;
    public final EObject entryRuleFunctionNamewParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionNamewParam = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6081:2: (iv_ruleFunctionNamewParam= ruleFunctionNamewParam EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6082:2: iv_ruleFunctionNamewParam= ruleFunctionNamewParam EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionNamewParamRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunctionNamewParam_in_entryRuleFunctionNamewParam8896);
            iv_ruleFunctionNamewParam=ruleFunctionNamewParam();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunctionNamewParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionNamewParam8906); if (failed) return current;

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
    // $ANTLR end entryRuleFunctionNamewParam


    // $ANTLR start ruleFunctionNamewParam
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6089:1: ruleFunctionNamewParam returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleFunctionNamewParam() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6094:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6095:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6095:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6096:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6096:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6097:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunctionNamewParamAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleFunctionNamewParam8951);
            lv_name_0_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunctionNamewParamRule().getType().getClassifier());
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
    // $ANTLR end ruleFunctionNamewParam


    // $ANTLR start entryRulePredicateName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6127:1: entryRulePredicateName returns [EObject current=null] : iv_rulePredicateName= rulePredicateName EOF ;
    public final EObject entryRulePredicateName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6128:2: (iv_rulePredicateName= rulePredicateName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6129:2: iv_rulePredicateName= rulePredicateName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredicateNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredicateName_in_entryRulePredicateName8986);
            iv_rulePredicateName=rulePredicateName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredicateName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateName8996); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6136:1: rulePredicateName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePredicateName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6141:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6142:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6142:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6143:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6143:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6144:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredicateNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePredicateName9041);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6174:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6175:2: (iv_ruleAlias= ruleAlias EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6176:2: iv_ruleAlias= ruleAlias EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAliasRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias9076);
            iv_ruleAlias=ruleAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias9086); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6183:1: ruleAlias returns [EObject current=null] : ( (lv_name_0_0= ruleNameAlias ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6188:6: ( ( (lv_name_0_0= ruleNameAlias ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6189:1: ( (lv_name_0_0= ruleNameAlias ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6189:1: ( (lv_name_0_0= ruleNameAlias ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6190:1: (lv_name_0_0= ruleNameAlias )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6190:1: (lv_name_0_0= ruleNameAlias )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6191:3: lv_name_0_0= ruleNameAlias
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAliasAccess().getNameNameAliasParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNameAlias_in_ruleAlias9131);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6221:1: entryRuleEnumName returns [EObject current=null] : iv_ruleEnumName= ruleEnumName EOF ;
    public final EObject entryRuleEnumName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6222:2: (iv_ruleEnumName= ruleEnumName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6223:2: iv_ruleEnumName= ruleEnumName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumName_in_entryRuleEnumName9166);
            iv_ruleEnumName=ruleEnumName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumName9176); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6230:1: ruleEnumName returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleEnumName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6235:6: ( ( 'enum' ( (lv_name_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6236:1: ( 'enum' ( (lv_name_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6236:1: ( 'enum' ( (lv_name_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6236:3: 'enum' ( (lv_name_1_0= ruleName ) )
            {
            match(input,87,FOLLOW_87_in_ruleEnumName9211); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumNameAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6240:1: ( (lv_name_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6241:1: (lv_name_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6241:1: (lv_name_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6242:3: lv_name_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumNameAccess().getNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumName9232);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6272:1: entryRuleEnumPropertyName returns [EObject current=null] : iv_ruleEnumPropertyName= ruleEnumPropertyName EOF ;
    public final EObject entryRuleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumPropertyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6273:2: (iv_ruleEnumPropertyName= ruleEnumPropertyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6274:2: iv_ruleEnumPropertyName= ruleEnumPropertyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumPropertyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumPropertyName_in_entryRuleEnumPropertyName9268);
            iv_ruleEnumPropertyName=ruleEnumPropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumPropertyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumPropertyName9278); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6281:1: ruleEnumPropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6286:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6287:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6287:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6288:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6288:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6289:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumPropertyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumPropertyName9323);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6319:1: entryRuleLetName returns [EObject current=null] : iv_ruleLetName= ruleLetName EOF ;
    public final EObject entryRuleLetName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6320:2: (iv_ruleLetName= ruleLetName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6321:2: iv_ruleLetName= ruleLetName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetName_in_entryRuleLetName9358);
            iv_ruleLetName=ruleLetName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetName9368); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6328:1: ruleLetName returns [EObject current=null] : ( 'let' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleLetName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6333:6: ( ( 'let' ( (lv_name_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6334:1: ( 'let' ( (lv_name_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6334:1: ( 'let' ( (lv_name_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6334:3: 'let' ( (lv_name_1_0= ruleName ) )
            {
            match(input,43,FOLLOW_43_in_ruleLetName9403); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetNameAccess().getLetKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6338:1: ( (lv_name_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6339:1: (lv_name_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6339:1: (lv_name_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6340:3: lv_name_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetNameAccess().getNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleLetName9424);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6370:1: entryRuleSignatureName returns [EObject current=null] : iv_ruleSignatureName= ruleSignatureName EOF ;
    public final EObject entryRuleSignatureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignatureName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6371:2: (iv_ruleSignatureName= ruleSignatureName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6372:2: iv_ruleSignatureName= ruleSignatureName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignatureNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignatureName_in_entryRuleSignatureName9460);
            iv_ruleSignatureName=ruleSignatureName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignatureName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignatureName9470); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6379:1: ruleSignatureName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleSignatureName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6384:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6385:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6385:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6386:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6386:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6387:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignatureNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleSignatureName9515);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6417:1: entryRulePropertyName returns [EObject current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final EObject entryRulePropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6418:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6419:2: iv_rulePropertyName= rulePropertyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName9550);
            iv_rulePropertyName=rulePropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName9560); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6426:1: rulePropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePropertyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6431:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6432:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6432:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6433:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6433:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6434:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePropertyName9605);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6464:1: entryRuleExactlyName returns [EObject current=null] : iv_ruleExactlyName= ruleExactlyName EOF ;
    public final EObject entryRuleExactlyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactlyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6465:2: (iv_ruleExactlyName= ruleExactlyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6466:2: iv_ruleExactlyName= ruleExactlyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExactlyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExactlyName_in_entryRuleExactlyName9640);
            iv_ruleExactlyName=ruleExactlyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExactlyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExactlyName9650); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6473:1: ruleExactlyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleExactlyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6478:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6479:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6479:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6480:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6480:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6481:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExactlyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleExactlyName9695);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6511:1: entryRuleAsName returns [EObject current=null] : iv_ruleAsName= ruleAsName EOF ;
    public final EObject entryRuleAsName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6512:2: (iv_ruleAsName= ruleAsName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6513:2: iv_ruleAsName= ruleAsName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAsNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAsName_in_entryRuleAsName9730);
            iv_ruleAsName=ruleAsName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAsName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsName9740); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6520:1: ruleAsName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAsName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6525:6: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6526:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6526:1: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6527:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6527:1: (lv_name_0_0= RULE_ID )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6528:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAsName9781); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getAsNameAccess().getNameIDTerminalRuleCall_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAsNameRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
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
    // $ANTLR end ruleAsName


    // $ANTLR start entryRuleNameAlias
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6558:1: entryRuleNameAlias returns [String current=null] : iv_ruleNameAlias= ruleNameAlias EOF ;
    public final String entryRuleNameAlias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameAlias = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6559:2: (iv_ruleNameAlias= ruleNameAlias EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6560:2: iv_ruleNameAlias= ruleNameAlias EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameAliasRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNameAlias_in_entryRuleNameAlias9822);
            iv_ruleNameAlias=ruleNameAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNameAlias.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameAlias9833); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6567:1: ruleNameAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNameAlias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6572:6: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6573:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6573:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6573:6: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameAlias9873); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6580:1: (kw= '/' this_ID_2= RULE_ID )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==53) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6581:2: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,53,FOLLOW_53_in_ruleNameAlias9892); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getNameAliasAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameAlias9907); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop90;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6601:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6602:2: (iv_ruleName= ruleName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6603:2: iv_ruleName= ruleName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName9955);
            iv_ruleName=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName9966); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6610:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6615:6: ( ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6616:1: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6616:1: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6616:2: (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6616:2: (kw= 'this' | this_ID_1= RULE_ID )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==52) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_ID) ) {
                alt91=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6616:2: (kw= 'this' | this_ID_1= RULE_ID )", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6617:2: kw= 'this'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleName10005); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNameAccess().getThisKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6623:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName10026); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNameAccess().getIDTerminalRuleCall_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6630:2: (kw= '/' this_ID_3= RULE_ID )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==53) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6631:2: kw= '/' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,53,FOLLOW_53_in_ruleName10046); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getNameAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_3=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName10061); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop92;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6651:1: entryRuleReferencesName returns [EObject current=null] : iv_ruleReferencesName= ruleReferencesName EOF ;
    public final EObject entryRuleReferencesName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6652:2: (iv_ruleReferencesName= ruleReferencesName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6653:2: iv_ruleReferencesName= ruleReferencesName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferencesNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReferencesName_in_entryRuleReferencesName10108);
            iv_ruleReferencesName=ruleReferencesName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReferencesName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencesName10118); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6660:1: ruleReferencesName returns [EObject current=null] : (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName ) ;
    public final EObject ruleReferencesName() throws RecognitionException {
        EObject current = null;

        EObject this_FactName_0 = null;

        EObject this_FunctionName_1 = null;

        EObject this_FunctionNamewParam_2 = null;

        EObject this_EnumName_3 = null;

        EObject this_EnumPropertyName_4 = null;

        EObject this_SignatureName_5 = null;

        EObject this_PropertyName_6 = null;

        EObject this_ExactlyName_7 = null;

        EObject this_LetName_8 = null;

        EObject this_PredicateName_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6665:6: ( (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6666:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6666:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName )
            int alt93=10;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt93=1;
                }
                break;
            case 52:
                {
                int LA93_2 = input.LA(2);

                if ( (synpred162()) ) {
                    alt93=2;
                }
                else if ( (synpred163()) ) {
                    alt93=3;
                }
                else if ( (synpred165()) ) {
                    alt93=5;
                }
                else if ( (synpred166()) ) {
                    alt93=6;
                }
                else if ( (synpred167()) ) {
                    alt93=7;
                }
                else if ( (synpred168()) ) {
                    alt93=8;
                }
                else if ( (true) ) {
                    alt93=10;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6666:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName )", 93, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA93_3 = input.LA(2);

                if ( (synpred162()) ) {
                    alt93=2;
                }
                else if ( (synpred163()) ) {
                    alt93=3;
                }
                else if ( (synpred165()) ) {
                    alt93=5;
                }
                else if ( (synpred166()) ) {
                    alt93=6;
                }
                else if ( (synpred167()) ) {
                    alt93=7;
                }
                else if ( (synpred168()) ) {
                    alt93=8;
                }
                else if ( (true) ) {
                    alt93=10;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("6666:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName )", 93, 3, input);

                    throw nvae;
                }
                }
                break;
            case 87:
                {
                alt93=4;
                }
                break;
            case 43:
                {
                alt93=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6666:1: (this_FactName_0= ruleFactName | this_FunctionName_1= ruleFunctionName | this_FunctionNamewParam_2= ruleFunctionNamewParam | this_EnumName_3= ruleEnumName | this_EnumPropertyName_4= ruleEnumPropertyName | this_SignatureName_5= ruleSignatureName | this_PropertyName_6= rulePropertyName | this_ExactlyName_7= ruleExactlyName | this_LetName_8= ruleLetName | this_PredicateName_9= rulePredicateName )", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6667:2: this_FactName_0= ruleFactName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getFactNameParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFactName_in_ruleReferencesName10168);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6680:2: this_FunctionName_1= ruleFunctionName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getFunctionNameParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionName_in_ruleReferencesName10198);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6693:2: this_FunctionNamewParam_2= ruleFunctionNamewParam
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getFunctionNamewParamParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionNamewParam_in_ruleReferencesName10228);
                    this_FunctionNamewParam_2=ruleFunctionNamewParam();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FunctionNamewParam_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6706:2: this_EnumName_3= ruleEnumName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getEnumNameParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumName_in_ruleReferencesName10258);
                    this_EnumName_3=ruleEnumName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumName_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6719:2: this_EnumPropertyName_4= ruleEnumPropertyName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getEnumPropertyNameParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleReferencesName10288);
                    this_EnumPropertyName_4=ruleEnumPropertyName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_EnumPropertyName_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6732:2: this_SignatureName_5= ruleSignatureName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getSignatureNameParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignatureName_in_ruleReferencesName10318);
                    this_SignatureName_5=ruleSignatureName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SignatureName_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6745:2: this_PropertyName_6= rulePropertyName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getPropertyNameParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyName_in_ruleReferencesName10348);
                    this_PropertyName_6=rulePropertyName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PropertyName_6; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6758:2: this_ExactlyName_7= ruleExactlyName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getExactlyNameParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExactlyName_in_ruleReferencesName10378);
                    this_ExactlyName_7=ruleExactlyName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ExactlyName_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6771:2: this_LetName_8= ruleLetName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getLetNameParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetName_in_ruleReferencesName10408);
                    this_LetName_8=ruleLetName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LetName_8; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6784:2: this_PredicateName_9= rulePredicateName
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getReferencesNameAccess().getPredicateNameParserRuleCall_9(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePredicateName_in_ruleReferencesName10438);
                    this_PredicateName_9=rulePredicateName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PredicateName_9; 
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6803:1: entryRuleReferencesSig returns [EObject current=null] : iv_ruleReferencesSig= ruleReferencesSig EOF ;
    public final EObject entryRuleReferencesSig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesSig = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6804:2: (iv_ruleReferencesSig= ruleReferencesSig EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6805:2: iv_ruleReferencesSig= ruleReferencesSig EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferencesSigRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReferencesSig_in_entryRuleReferencesSig10473);
            iv_ruleReferencesSig=ruleReferencesSig();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReferencesSig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencesSig10483); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6812:1: ruleReferencesSig returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) ;
    public final EObject ruleReferencesSig() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6817:6: ( ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6818:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6818:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6818:2: () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6818:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6819:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6832:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            int alt94=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt94=1;
                }
                break;
            case 46:
                {
                alt94=2;
                }
                break;
            case 47:
                {
                alt94=3;
                }
                break;
            case 48:
                {
                alt94=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6832:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6832:3: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6832:3: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6833:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6833:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6834:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferencesSig10543); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getReferencesSigAccess().getNameRefSignatureNameCrossReference_1_0_0(), "nameRef"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6850:7: 'univ'
                    {
                    match(input,46,FOLLOW_46_in_ruleReferencesSig10559); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getUnivKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6855:7: 'Int'
                    {
                    match(input,47,FOLLOW_47_in_ruleReferencesSig10575); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getIntKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6860:7: 'seq/Int'
                    {
                    match(input,48,FOLLOW_48_in_ruleReferencesSig10591); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6872:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6873:2: (iv_ruleRef= ruleRef EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6874:2: iv_ruleRef= ruleRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef10628);
            iv_ruleRef=ruleRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef10638); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6881:1: ruleRef returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6886:6: ( ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6887:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6887:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6887:2: () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6887:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6888:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6901:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            int alt95=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt95=1;
                }
                break;
            case 46:
                {
                alt95=2;
                }
                break;
            case 47:
                {
                alt95=3;
                }
                break;
            case 48:
                {
                alt95=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6901:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6901:3: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6901:3: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6902:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6902:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6903:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef10698); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRefAccess().getNameRefReferencesNameCrossReference_1_0_0(), "nameRef"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6919:7: 'univ'
                    {
                    match(input,46,FOLLOW_46_in_ruleRef10714); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getUnivKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6924:7: 'Int'
                    {
                    match(input,47,FOLLOW_47_in_ruleRef10730); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getIntKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6929:7: 'seq/Int'
                    {
                    match(input,48,FOLLOW_48_in_ruleRef10746); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6941:1: entryRuleLeftCurlyBracket returns [EObject current=null] : iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF ;
    public final EObject entryRuleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftCurlyBracket = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6942:2: (iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6943:2: iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftCurlyBracketRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_entryRuleLeftCurlyBracket10783);
            iv_ruleLeftCurlyBracket=ruleLeftCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftCurlyBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftCurlyBracket10793); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6950:1: ruleLeftCurlyBracket returns [EObject current=null] : ( (lv_leftCurlyBracket_0_0= '{' ) ) ;
    public final EObject ruleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_leftCurlyBracket_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6955:6: ( ( (lv_leftCurlyBracket_0_0= '{' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6956:1: ( (lv_leftCurlyBracket_0_0= '{' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6956:1: ( (lv_leftCurlyBracket_0_0= '{' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6957:1: (lv_leftCurlyBracket_0_0= '{' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6957:1: (lv_leftCurlyBracket_0_0= '{' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6958:3: lv_leftCurlyBracket_0_0= '{'
            {
            lv_leftCurlyBracket_0_0=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleLeftCurlyBracket10835); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6985:1: entryRuleRightCurlyBracket returns [EObject current=null] : iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF ;
    public final EObject entryRuleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightCurlyBracket = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6986:2: (iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6987:2: iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightCurlyBracketRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_entryRuleRightCurlyBracket10883);
            iv_ruleRightCurlyBracket=ruleRightCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightCurlyBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightCurlyBracket10893); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6994:1: ruleRightCurlyBracket returns [EObject current=null] : ( (lv_rightCurlyBracket_0_0= '}' ) ) ;
    public final EObject ruleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_rightCurlyBracket_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6999:6: ( ( (lv_rightCurlyBracket_0_0= '}' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7000:1: ( (lv_rightCurlyBracket_0_0= '}' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7000:1: ( (lv_rightCurlyBracket_0_0= '}' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7001:1: (lv_rightCurlyBracket_0_0= '}' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7001:1: (lv_rightCurlyBracket_0_0= '}' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7002:3: lv_rightCurlyBracket_0_0= '}'
            {
            lv_rightCurlyBracket_0_0=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleRightCurlyBracket10935); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7029:1: entryRuleDot returns [EObject current=null] : iv_ruleDot= ruleDot EOF ;
    public final EObject entryRuleDot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDot = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7030:2: (iv_ruleDot= ruleDot EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7031:2: iv_ruleDot= ruleDot EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDotRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDot_in_entryRuleDot10983);
            iv_ruleDot=ruleDot();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDot10993); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7038:1: ruleDot returns [EObject current=null] : ( (lv_dot_0_0= '.' ) ) ;
    public final EObject ruleDot() throws RecognitionException {
        EObject current = null;

        Token lv_dot_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7043:6: ( ( (lv_dot_0_0= '.' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7044:1: ( (lv_dot_0_0= '.' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7044:1: ( (lv_dot_0_0= '.' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7045:1: (lv_dot_0_0= '.' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7045:1: (lv_dot_0_0= '.' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7046:3: lv_dot_0_0= '.'
            {
            lv_dot_0_0=(Token)input.LT(1);
            match(input,88,FOLLOW_88_in_ruleDot11035); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7073:1: entryRuleComma returns [EObject current=null] : iv_ruleComma= ruleComma EOF ;
    public final EObject entryRuleComma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComma = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7074:2: (iv_ruleComma= ruleComma EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7075:2: iv_ruleComma= ruleComma EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommaRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleComma_in_entryRuleComma11083);
            iv_ruleComma=ruleComma();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComma; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComma11093); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7082:1: ruleComma returns [EObject current=null] : ( (lv_comma_0_0= ',' ) ) ;
    public final EObject ruleComma() throws RecognitionException {
        EObject current = null;

        Token lv_comma_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7087:6: ( ( (lv_comma_0_0= ',' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7088:1: ( (lv_comma_0_0= ',' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7088:1: ( (lv_comma_0_0= ',' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7089:1: (lv_comma_0_0= ',' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7089:1: (lv_comma_0_0= ',' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7090:3: lv_comma_0_0= ','
            {
            lv_comma_0_0=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_ruleComma11135); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7117:1: entryRuleColon returns [EObject current=null] : iv_ruleColon= ruleColon EOF ;
    public final EObject entryRuleColon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColon = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7118:2: (iv_ruleColon= ruleColon EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7119:2: iv_ruleColon= ruleColon EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getColonRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleColon_in_entryRuleColon11183);
            iv_ruleColon=ruleColon();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleColon; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColon11193); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7126:1: ruleColon returns [EObject current=null] : ( (lv_colon_0_0= ':' ) ) ;
    public final EObject ruleColon() throws RecognitionException {
        EObject current = null;

        Token lv_colon_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7131:6: ( ( (lv_colon_0_0= ':' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7132:1: ( (lv_colon_0_0= ':' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7132:1: ( (lv_colon_0_0= ':' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7133:1: (lv_colon_0_0= ':' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7133:1: (lv_colon_0_0= ':' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7134:3: lv_colon_0_0= ':'
            {
            lv_colon_0_0=(Token)input.LT(1);
            match(input,18,FOLLOW_18_in_ruleColon11235); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7161:1: entryRuleLeftParenthesis returns [EObject current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final EObject entryRuleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftParenthesis = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7162:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7163:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftParenthesisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11283);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftParenthesis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis11293); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7170:1: ruleLeftParenthesis returns [EObject current=null] : ( (lv_leftParenthesis_0_0= '(' ) ) ;
    public final EObject ruleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_leftParenthesis_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7175:6: ( ( (lv_leftParenthesis_0_0= '(' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7176:1: ( (lv_leftParenthesis_0_0= '(' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7176:1: ( (lv_leftParenthesis_0_0= '(' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7177:1: (lv_leftParenthesis_0_0= '(' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7177:1: (lv_leftParenthesis_0_0= '(' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7178:3: lv_leftParenthesis_0_0= '('
            {
            lv_leftParenthesis_0_0=(Token)input.LT(1);
            match(input,49,FOLLOW_49_in_ruleLeftParenthesis11335); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7205:1: entryRuleRightParenthesis returns [EObject current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final EObject entryRuleRightParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightParenthesis = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7206:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7207:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightParenthesisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11383);
            iv_ruleRightParenthesis=ruleRightParenthesis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightParenthesis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis11393); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7214:1: ruleRightParenthesis returns [EObject current=null] : ( (lv_rightParenthesis_0_0= ')' ) ) ;
    public final EObject ruleRightParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_rightParenthesis_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7219:6: ( ( (lv_rightParenthesis_0_0= ')' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7220:1: ( (lv_rightParenthesis_0_0= ')' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7220:1: ( (lv_rightParenthesis_0_0= ')' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7221:1: (lv_rightParenthesis_0_0= ')' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7221:1: (lv_rightParenthesis_0_0= ')' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7222:3: lv_rightParenthesis_0_0= ')'
            {
            lv_rightParenthesis_0_0=(Token)input.LT(1);
            match(input,50,FOLLOW_50_in_ruleRightParenthesis11435); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7249:1: entryRuleLeftSquareBracketKeyword returns [EObject current=null] : iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF ;
    public final EObject entryRuleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSquareBracketKeyword = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7250:2: (iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7251:2: iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftSquareBracketKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_entryRuleLeftSquareBracketKeyword11483);
            iv_ruleLeftSquareBracketKeyword=ruleLeftSquareBracketKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftSquareBracketKeyword11493); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7258:1: ruleLeftSquareBracketKeyword returns [EObject current=null] : ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) ;
    public final EObject ruleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_leftSquareBracketKeyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7263:6: ( ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7264:1: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7264:1: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7265:1: (lv_leftSquareBracketKeyword_0_0= '[' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7265:1: (lv_leftSquareBracketKeyword_0_0= '[' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7266:3: lv_leftSquareBracketKeyword_0_0= '['
            {
            lv_leftSquareBracketKeyword_0_0=(Token)input.LT(1);
            match(input,89,FOLLOW_89_in_ruleLeftSquareBracketKeyword11535); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7293:1: entryRuleRightSquareBracketKeyword returns [EObject current=null] : iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF ;
    public final EObject entryRuleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSquareBracketKeyword = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7294:2: (iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7295:2: iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightSquareBracketKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_entryRuleRightSquareBracketKeyword11583);
            iv_ruleRightSquareBracketKeyword=ruleRightSquareBracketKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightSquareBracketKeyword11593); if (failed) return current;

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7302:1: ruleRightSquareBracketKeyword returns [EObject current=null] : ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) ;
    public final EObject ruleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_rightSquareBracketKeyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7307:6: ( ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7308:1: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7308:1: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7309:1: (lv_rightSquareBracketKeyword_0_0= ']' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7309:1: (lv_rightSquareBracketKeyword_0_0= ']' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:7310:3: lv_rightSquareBracketKeyword_0_0= ']'
            {
            lv_rightSquareBracketKeyword_0_0=(Token)input.LT(1);
            match(input,90,FOLLOW_90_in_ruleRightSquareBracketKeyword11635); if (failed) return current;
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

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:2: ( ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:2: ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:2: ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:3: ( ( ruleBinOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3480:3: ( ( ruleBinOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:1: ( ruleBinOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3481:1: ( ruleBinOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3482:3: ruleBinOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBinOp_in_synpred774868);
        ruleBinOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3504:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3505:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3505:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3506:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred774889);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred78
    public final void synpred78_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:6: ( ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:6: ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:6: ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:7: ( ( ruleArrowOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3529:7: ( ( ruleArrowOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3530:1: ( ruleArrowOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3530:1: ( ruleArrowOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3531:3: ruleArrowOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleArrowOp_in_synpred784918);
        ruleArrowOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3553:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3554:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3554:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3555:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred784939);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred78

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:6: ( ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:6: ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:6: ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:7: ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3578:7: ( '!' | 'not' )?
        int alt123=2;
        int LA123_0 = input.LA(1);

        if ( ((LA123_0>=38 && LA123_0<=39)) ) {
            alt123=1;
        }
        switch (alt123) {
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
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred814956);    throw mse;
                }


                }
                break;

        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3587:3: ( ( ruleCompareOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3588:1: ( ruleCompareOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3588:1: ( ruleCompareOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3589:3: ruleCompareOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareOp_in_synpred814997);
        ruleCompareOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3611:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3612:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3612:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3613:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred815018);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred81

    // $ANTLR start synpred83
    public final void synpred83_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3669:4: ( 'else' ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3669:4: 'else' ( ( ruleExpression ) )
        {
        match(input,42,FOLLOW_42_in_synpred835086); if (failed) return ;
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3673:1: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3674:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3674:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3675:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred835107);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred83

    // $ANTLR start synpred84
    public final void synpred84_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:6: ( ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:6: ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:6: ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3636:7: ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )?
        {
        if ( (input.LA(1)>=40 && input.LA(1)<=41) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred845035);    throw mse;
        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3645:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3646:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3646:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3647:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred845075);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3669:2: ( 'else' ( ( ruleExpression ) ) )?
        int alt124=2;
        int LA124_0 = input.LA(1);

        if ( (LA124_0==42) ) {
            alt124=1;
        }
        switch (alt124) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3669:4: 'else' ( ( ruleExpression ) )
                {
                match(input,42,FOLLOW_42_in_synpred845086); if (failed) return ;
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3673:1: ( ( ruleExpression ) )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3674:1: ( ruleExpression )
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3674:1: ( ruleExpression )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3675:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred845107);
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
    // $ANTLR end synpred84

    // $ANTLR start synpred87
    public final void synpred87_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:6: ( ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:6: ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:6: ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:7: ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:7: ( ( ruleLeftSquareBracketKeyword ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3699:1: ( ruleLeftSquareBracketKeyword )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3699:1: ( ruleLeftSquareBracketKeyword )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3700:3: ruleLeftSquareBracketKeyword
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_4_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_synpred875138);
        ruleLeftSquareBracketKeyword();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3722:2: ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )?
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( ((LA127_0>=RULE_INT && LA127_0<=RULE_NEGATIVE_INTEGER)||(LA127_0>=16 && LA127_0<=17)||(LA127_0>=24 && LA127_0<=25)||LA127_0==28||(LA127_0>=32 && LA127_0<=34)||(LA127_0>=38 && LA127_0<=39)||(LA127_0>=43 && LA127_0<=49)||(LA127_0>=51 && LA127_0<=52)||(LA127_0>=55 && LA127_0<=56)||(LA127_0>=71 && LA127_0<=76)) ) {
            alt127=1;
        }
        switch (alt127) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3722:3: ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )*
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3722:3: ( ( ruleExpression ) )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3723:1: ( ruleExpression )
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3723:1: ( ruleExpression )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3724:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred875160);
                ruleExpression();
                _fsp--;
                if (failed) return ;

                }


                }

                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3746:2: ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )*
                loop126:
                do {
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==29) ) {
                        alt126=1;
                    }


                    switch (alt126) {
                	case 1 :
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3746:3: ( ( ruleComma ) ) ( ( ruleExpression ) )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3746:3: ( ( ruleComma ) )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3747:1: ( ruleComma )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3747:1: ( ruleComma )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3748:3: ruleComma
                	    {
                	    if ( backtracking==0 ) {
                	       
                	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0(), currentNode); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleComma_in_synpred875182);
                	    ruleComma();
                	    _fsp--;
                	    if (failed) return ;

                	    }


                	    }

                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3770:2: ( ( ruleExpression ) )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3771:1: ( ruleExpression )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3771:1: ( ruleExpression )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3772:3: ruleExpression
                	    {
                	    if ( backtracking==0 ) {
                	       
                	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0(), currentNode); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred875203);
                	    ruleExpression();
                	    _fsp--;
                	    if (failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop126;
                    }
                } while (true);


                }
                break;

        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3794:6: ( ( ruleRightSquareBracketKeyword ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3795:1: ( ruleRightSquareBracketKeyword )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3795:1: ( ruleRightSquareBracketKeyword )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3796:3: ruleRightSquareBracketKeyword
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_synpred875228);
        ruleRightSquareBracketKeyword();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred87

    // $ANTLR start synpred94
    public final void synpred94_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:3: ( ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:3: ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:3: ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:4: ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4209:4: ( ( ruleDecl ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4210:1: ( ruleDecl )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4210:1: ( ruleDecl )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4211:3: ruleDecl
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleDecl_in_synpred945687);
        ruleDecl();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4233:2: ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )*
        loop130:
        do {
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==29) ) {
                alt130=1;
            }


            switch (alt130) {
        	case 1 :
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4233:3: ( ( ruleComma ) ) ( ( ruleDecl ) )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4233:3: ( ( ruleComma ) )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4234:1: ( ruleComma )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4234:1: ( ruleComma )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4235:3: ruleComma
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_3_2_0_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleComma_in_synpred945709);
        	    ruleComma();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4257:2: ( ( ruleDecl ) )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4258:1: ( ruleDecl )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4258:1: ( ruleDecl )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4259:3: ruleDecl
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleDecl_in_synpred945730);
        	    ruleDecl();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop130;
            }
        } while (true);

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4281:4: ( ( ruleBlockOrBar ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4282:1: ( ruleBlockOrBar )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4282:1: ( ruleBlockOrBar )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4283:3: ruleBlockOrBar
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_3_2_0_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBlockOrBar_in_synpred945753);
        ruleBlockOrBar();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred94

    // $ANTLR start synpred162
    public final void synpred162_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6680:2: ( ruleFunctionName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6680:2: ruleFunctionName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleFunctionName_in_synpred16210198);
        ruleFunctionName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred162

    // $ANTLR start synpred163
    public final void synpred163_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6693:2: ( ruleFunctionNamewParam )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6693:2: ruleFunctionNamewParam
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleFunctionNamewParam_in_synpred16310228);
        ruleFunctionNamewParam();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred163

    // $ANTLR start synpred165
    public final void synpred165_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6719:2: ( ruleEnumPropertyName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6719:2: ruleEnumPropertyName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleEnumPropertyName_in_synpred16510288);
        ruleEnumPropertyName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred165

    // $ANTLR start synpred166
    public final void synpred166_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6732:2: ( ruleSignatureName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6732:2: ruleSignatureName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSignatureName_in_synpred16610318);
        ruleSignatureName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred166

    // $ANTLR start synpred167
    public final void synpred167_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6745:2: ( rulePropertyName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6745:2: rulePropertyName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePropertyName_in_synpred16710348);
        rulePropertyName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred167

    // $ANTLR start synpred168
    public final void synpred168_fragment() throws RecognitionException {   
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6758:2: ( ruleExactlyName )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6758:2: ruleExactlyName
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleExactlyName_in_synpred16810378);
        ruleExactlyName();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred168

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
    public final boolean synpred94() {
        backtracking++;
        int start = input.mark();
        try {
            synpred94_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred83() {
        backtracking++;
        int start = input.mark();
        try {
            synpred83_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred84() {
        backtracking++;
        int start = input.mark();
        try {
            synpred84_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred78() {
        backtracking++;
        int start = input.mark();
        try {
            synpred78_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred87() {
        backtracking++;
        int start = input.mark();
        try {
            synpred87_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred77() {
        backtracking++;
        int start = input.mark();
        try {
            synpred77_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred165() {
        backtracking++;
        int start = input.mark();
        try {
            synpred165_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred163() {
        backtracking++;
        int start = input.mark();
        try {
            synpred163_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred162() {
        backtracking++;
        int start = input.mark();
        try {
            synpred162_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred168() {
        backtracking++;
        int start = input.mark();
        try {
            synpred168_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred167() {
        backtracking++;
        int start = input.mark();
        try {
            synpred167_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred166() {
        backtracking++;
        int start = input.mark();
        try {
            synpred166_fragment(); // can never throw exception
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
        "\32\uffff";
    static final String DFA13_eofS =
        "\32\uffff";
    static final String DFA13_minS =
        "\1\5\2\uffff\1\16\1\5\1\uffff\1\22\5\uffff\1\22\3\130\1\22\1\5\1"+
        "\23\1\5\1\uffff\1\5\1\uffff\3\22";
    static final String DFA13_maxS =
        "\1\127\2\uffff\1\42\1\64\1\uffff\1\65\5\uffff\1\131\3\130\1\131"+
        "\1\5\1\24\1\5\1\uffff\1\64\1\uffff\1\65\2\131";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\4\1\uffff\1\5\1\7\1\10\1\11\1\12\10\uffff"+
        "\1\3\1\uffff\1\6\3\uffff";
    static final String DFA13_specialS =
        "\32\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\6\10\uffff\1\3\1\uffff\1\4\1\5\1\uffff\1\7\1\10\6\uffff\1"+
            "\13\3\uffff\4\13\10\uffff\1\12\51\uffff\1\1\1\2\1\11",
            "",
            "",
            "\1\13\1\uffff\1\4\1\5\11\uffff\1\13\3\uffff\4\13",
            "\1\14\50\uffff\1\15\1\16\1\17\3\uffff\1\20",
            "",
            "\1\22\42\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\26\36\uffff\1\24\3\uffff\1\23\42\uffff\1\25\1\24",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\26\36\uffff\1\24\3\uffff\1\23\43\uffff\1\24",
            "\1\27",
            "\1\7\1\10",
            "\1\30",
            "",
            "\1\31\56\uffff\1\20",
            "",
            "\1\22\42\uffff\1\21",
            "\1\26\36\uffff\1\24\3\uffff\1\23\43\uffff\1\24",
            "\1\26\36\uffff\1\24\3\uffff\1\23\43\uffff\1\24"
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
            return "630:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_FunDeclWParam_5= ruleFunDeclWParam | this_CheckDecl_6= ruleCheckDecl | this_EnumDecl_7= ruleEnumDecl | this_LetOutDecl_8= ruleLetOutDecl | this_SigDecl_9= ruleSigDecl )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecification91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSpecification137 = new BitSet(new long[]{0x00000807881B4022L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleOpen_in_ruleSpecification159 = new BitSet(new long[]{0x00000807881B4022L,0x0000000000F00000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleSpecification181 = new BitSet(new long[]{0x00000807881B4022L,0x0000000000E00000L});
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
    public static final BitSet FOLLOW_14_in_ruleOpen573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleOpenName_in_ruleOpen596 = new BitSet(new long[]{0x0000000000008002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleOpen618 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen639 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleOpen661 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen682 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleOpen705 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOpen718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAsName_in_ruleOpen739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_ruleParagraph837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_ruleParagraph867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_ruleParagraph897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_ruleParagraph927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_ruleParagraph957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDeclWParam_in_ruleParagraph987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_ruleParagraph1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleParagraph1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetOutDecl_in_ruleParagraph1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_ruleParagraph1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_entryRuleFactDecl1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactDecl1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_ruleFactDecl1198 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFactDecl1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertDecl1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionName_in_ruleAssertDecl1311 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAssertDecl1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_entryRuleFunDecl1368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunDecl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunDecl1414 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunDecl1426 = new BitSet(new long[]{0x0011C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleFunDecl1448 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_ruleFunDecl1469 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunDecl1492 = new BitSet(new long[]{0x0002000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleFunDecl1515 = new BitSet(new long[]{0x0050000000004020L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1537 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleFunDecl1559 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1580 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleFunDecl1605 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleFunDecl1634 = new BitSet(new long[]{0x0054000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1656 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleFunDecl1678 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1699 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleFunDecl1724 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleFunDecl1747 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunDecl1768 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFunDecl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDeclWParam_in_entryRuleFunDeclWParam1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunDeclWParam1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunDeclWParam1871 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunDeclWParam1883 = new BitSet(new long[]{0x0011C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleFunDeclWParam1905 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_ruleFunDeclWParam1926 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleFunctionNamewParam_in_ruleFunDeclWParam1949 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleFunDeclWParam1970 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunDeclWParam1991 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFunDeclWParam2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_entryRulePredDecl2048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredDecl2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePredDecl2094 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePredDecl2106 = new BitSet(new long[]{0x0011C00000000020L});
    public static final BitSet FOLLOW_ruleRef_in_rulePredDecl2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_rulePredDecl2149 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_rulePredicateName_in_rulePredDecl2172 = new BitSet(new long[]{0x0002000010000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_rulePredDecl2195 = new BitSet(new long[]{0x0050000000004020L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2217 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_rulePredDecl2239 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2260 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_rulePredDecl2285 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_rulePredDecl2314 = new BitSet(new long[]{0x0054000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2336 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_ruleComma_in_rulePredDecl2358 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2379 = new BitSet(new long[]{0x0004000020000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_rulePredDecl2404 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePredDecl2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_entryRuleRunDecl2464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunDecl2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleRunDecl2521 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRunDecl2531 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRunDecl2543 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRunDecl2566 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleRunDecl2593 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleRunDecl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckDecl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleCheckDecl2708 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCheckDecl2718 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCheckDecl2730 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckDecl2753 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCheckDecl2780 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleCheckDecl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_entryRuleScope2838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScope2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope2896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2905 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope2956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2965 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleScope2974 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2995 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleScope3017 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope3038 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleScope3092 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope3113 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleScope3135 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope3156 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpectation_in_entryRuleExpectation3259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpectation3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleExpectation3304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpectation3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypescope_in_entryRuleTypescope3362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypescope3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypescope3420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTypescope3431 = new BitSet(new long[]{0x0000000003000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypescope3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTypescope3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTypescope3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_ruleEnumDecl3580 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleEnumDecl3601 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3622 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleEnumDecl3644 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3665 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleEnumDecl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetOutDecl_in_entryRuleLetOutDecl3724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetOutDecl3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetName_in_ruleLetOutDecl3780 = new BitSet(new long[]{0x0000000014000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleLetOutDecl3802 = new BitSet(new long[]{0x0010080000000020L,0x0000000004A00000L});
    public static final BitSet FOLLOW_ruleReferencesName_in_ruleLetOutDecl3824 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleLetOutDecl3846 = new BitSet(new long[]{0x0010080000000020L,0x0000000000A00000L});
    public static final BitSet FOLLOW_ruleReferencesName_in_ruleLetOutDecl3867 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleLetOutDecl3892 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleLetOutDecl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLetOutDecl3933 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetOutDecl3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_entryRuleSigDecl3992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigDecl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_ruleSigDecl4053 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSigDecl4064 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleSigDecl4085 = new BitSet(new long[]{0x0000001830000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleSigDecl4107 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleSigDecl4128 = new BitSet(new long[]{0x0000001830000000L});
    public static final BitSet FOLLOW_ruleSigExt_in_ruleSigDecl4151 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSigDecl4162 = new BitSet(new long[]{0x0050000040004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl4184 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleSigDecl4203 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl4237 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_30_in_ruleSigDecl4251 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSigDecl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_entryRuleSigQual4309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigQual4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSigQual4364 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_32_in_ruleSigQual4393 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_33_in_ruleSigQual4422 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_34_in_ruleSigQual4451 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_14_in_ruleSigQual4480 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_31_in_ruleSigQual4507 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_32_in_ruleSigQual4523 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_33_in_ruleSigQual4539 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_34_in_ruleSigQual4555 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_14_in_ruleSigQual4571 = new BitSet(new long[]{0x0000000780004002L});
    public static final BitSet FOLLOW_ruleSigExt_in_entryRuleSigExt4609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExt4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSigExt4655 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSigExt4694 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4715 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleSigExt4726 = new BitSet(new long[]{0x0001C00000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4747 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression4846 = new BitSet(new long[]{0xFE0003F704000002L,0x000000000307E0FFL});
    public static final BitSet FOLLOW_ruleBinOp_in_ruleExpression4868 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4889 = new BitSet(new long[]{0xFE0003F704000002L,0x000000000307E0FFL});
    public static final BitSet FOLLOW_ruleArrowOp_in_ruleExpression4918 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4939 = new BitSet(new long[]{0xFE0003F704000002L,0x000000000307E0FFL});
    public static final BitSet FOLLOW_38_in_ruleExpression4958 = new BitSet(new long[]{0x0000001004000000L,0x000000000003E000L});
    public static final BitSet FOLLOW_39_in_ruleExpression4974 = new BitSet(new long[]{0x0000001004000000L,0x000000000003E000L});
    public static final BitSet FOLLOW_ruleCompareOp_in_ruleExpression4997 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression5018 = new BitSet(new long[]{0xFE0003F704000002L,0x000000000307E0FFL});
    public static final BitSet FOLLOW_40_in_ruleExpression5037 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_41_in_ruleExpression5053 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression5075 = new BitSet(new long[]{0xFE0007F704000002L,0x000000000307E0FFL});
    public static final BitSet FOLLOW_42_in_ruleExpression5086 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression5107 = new BitSet(new long[]{0xFE0003F704000002L,0x000000000307E0FFL});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleExpression5138 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000004001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression5160 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleExpression5182 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression5203 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleExpression5228 = new BitSet(new long[]{0xFE0003F704000002L,0x000000000307E0FFL});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression5267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTerminalExpression5333 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpression5367 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5389 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpression5410 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuant_in_ruleTerminalExpression5474 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5495 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5517 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5538 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOp_in_ruleTerminalExpression5602 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonQuantUnOp_in_ruleTerminalExpression5664 = new BitSet(new long[]{0x01DBF8C713034070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5687 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5709 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5730 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATIVE_INTEGER_in_ruleTerminalExpression5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTerminalExpression5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTerminalExpression5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTerminalExpression5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTerminalExpression6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTerminalExpression6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTerminalExpression6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTerminalExpression6168 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression6202 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTerminalExpression6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTerminalExpression6264 = new BitSet(new long[]{0x0010000000030020L});
    public static final BitSet FOLLOW_ruleAsName_in_ruleTerminalExpression6289 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_16_in_ruleTerminalExpression6305 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_17_in_ruleTerminalExpression6321 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52_in_ruleTerminalExpression6337 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleTerminalExpression6348 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleTerminalExpression6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleTerminalExpression6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleTerminalExpression6472 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression6493 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression6515 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression6536 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression6559 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleTerminalExpression6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl6617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDecl6663 = new BitSet(new long[]{0x0050000000000020L});
    public static final BitSet FOLLOW_54_in_ruleDecl6676 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleDecl6699 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleDecl6721 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleDecl6742 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleDecl6765 = new BitSet(new long[]{0x01DBF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_54_in_ruleDecl6776 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDecl6799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDecl_in_entryRuleLetDecl6835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDecl6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleLetDecl6891 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLetDecl6901 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetDecl6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuant_in_entryRuleQuant6959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuant6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQuant7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleQuant7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_entryRuleBinOp7067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinOp7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBinOp7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBinOp7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBinOp7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBinOp7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBinOp7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBinOp7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBinOp7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBinOp7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleBinOp7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBinOp7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBinOp7285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBinOp7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_ruleBinOp7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBinOp7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBinOp7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBinOp7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOp_in_entryRuleUnOp7413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOp7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleUnOp7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleUnOp7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnOp7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUnOp7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleUnOp7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUnOp7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleUnOp7616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleUnOp7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonQuantUnOp_in_entryRuleCommonQuantUnOp7698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonQuantUnOp7708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCommonQuantUnOp7756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCommonQuantUnOp7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCommonQuantUnOp7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCommonQuantUnOp7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOp_in_entryRuleCompareOp7842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOp7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompareOp7891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCompareOp7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCompareOp7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleCompareOp7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleCompareOp7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleCompareOp7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleCompareOp8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_entryRuleArrowOp8045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowOp8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleArrowOp8091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_33_in_ruleArrowOp8107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_32_in_ruleArrowOp8123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_71_in_ruleArrowOp8139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleArrowOp8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock8208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleBlock8264 = new BitSet(new long[]{0x019BF8C753030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlock8285 = new BitSet(new long[]{0x019BF8C753030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleBlock8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar8343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOrBar8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockOrBar8399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleBlockOrBar8416 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlockOrBar8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenName_in_entryRuleOpenName8474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenName8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOpenName8519 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleOpenName8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_entryRuleFactName8576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactName8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleFactName8633 = new BitSet(new long[]{0x0010000000000022L});
    public static final BitSet FOLLOW_ruleName_in_ruleFactName8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionName_in_entryRuleAssertionName8691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionName8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAssertionName8748 = new BitSet(new long[]{0x0010000000000022L});
    public static final BitSet FOLLOW_ruleName_in_ruleAssertionName8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName8806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleFunctionName8861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionNamewParam_in_entryRuleFunctionNamewParam8896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionNamewParam8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleFunctionNamewParam8951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateName_in_entryRulePredicateName8986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateName8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePredicateName9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias9076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias9086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameAlias_in_ruleAlias9131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_entryRuleEnumName9166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumName9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleEnumName9211 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumName9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_entryRuleEnumPropertyName9268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumPropertyName9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumPropertyName9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetName_in_entryRuleLetName9358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetName9368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLetName9403 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleLetName9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignatureName_in_entryRuleSignatureName9460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignatureName9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleSignatureName9515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName9550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName9560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyName9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExactlyName_in_entryRuleExactlyName9640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExactlyName9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleExactlyName9695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsName_in_entryRuleAsName9730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsName9740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAsName9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameAlias_in_entryRuleNameAlias9822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameAlias9833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameAlias9873 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNameAlias9892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameAlias9907 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName9955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName9966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleName10005 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName10026 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleName10046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName10061 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleReferencesName_in_entryRuleReferencesName10108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencesName10118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_ruleReferencesName10168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleReferencesName10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionNamewParam_in_ruleReferencesName10228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_ruleReferencesName10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleReferencesName10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleReferencesName10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleReferencesName10348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExactlyName_in_ruleReferencesName10378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetName_in_ruleReferencesName10408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateName_in_ruleReferencesName10438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_entryRuleReferencesSig10473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencesSig10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferencesSig10543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReferencesSig10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleReferencesSig10575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleReferencesSig10591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef10628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef10638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef10698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRef10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRef10730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRef10746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_entryRuleLeftCurlyBracket10783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftCurlyBracket10793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLeftCurlyBracket10835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_entryRuleRightCurlyBracket10883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightCurlyBracket10893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRightCurlyBracket10935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_entryRuleDot10983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDot10993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDot11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_entryRuleComma11083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComma11093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleComma11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_entryRuleColon11183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColon11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleColon11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis11293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLeftParenthesis11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleRightParenthesis11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_entryRuleLeftSquareBracketKeyword11483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftSquareBracketKeyword11493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLeftSquareBracketKeyword11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_entryRuleRightSquareBracketKeyword11583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightSquareBracketKeyword11593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRightSquareBracketKeyword11635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_synpred774868 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred774889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_synpred784918 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred784939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred814956 = new BitSet(new long[]{0x0000001004000000L,0x000000000003E000L});
    public static final BitSet FOLLOW_ruleCompareOp_in_synpred814997 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred815018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred835086 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred835107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred845035 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred845075 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_synpred845086 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred845107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_synpred875138 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000004001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred875160 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_synpred875182 = new BitSet(new long[]{0x019BF8C713030070L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred875203 = new BitSet(new long[]{0x0000000020000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_synpred875228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_synpred945687 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleComma_in_synpred945709 = new BitSet(new long[]{0x0050000000004020L});
    public static final BitSet FOLLOW_ruleDecl_in_synpred945730 = new BitSet(new long[]{0x0000000030000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_synpred945753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_synpred16210198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionNamewParam_in_synpred16310228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_synpred16510288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignatureName_in_synpred16610318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_synpred16710348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExactlyName_in_synpred16810378 = new BitSet(new long[]{0x0000000000000002L});

}