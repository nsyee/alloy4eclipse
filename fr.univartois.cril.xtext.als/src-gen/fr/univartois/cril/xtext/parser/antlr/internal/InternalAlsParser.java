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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NEGATIVE_INTEGER", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exactly'", "'private'", "'as'", "'fun'", "'pred'", "':'", "'run'", "'check'", "'for'", "'but'", "'expect'", "'int'", "'seq'", "'sig'", "'{'", "','", "'}'", "'abstract'", "'lone'", "'one'", "'some'", "'extends'", "'in'", "'+'", "'!'", "'not'", "'=>'", "'implies'", "'else'", "'let'", "'none'", "'iden'", "'univ'", "'Int'", "'seq/Int'", "'('", "')'", "'@'", "'this'", "'disj'", "'='", "'all'", "'sum'", "'||'", "'or'", "'&&'", "'and'", "'&'", "'<=>'", "'iff'", "'-'", "'++'", "'<:'", "':>'", "'<<'", "'>>'", "'>>>'", "'set'", "'#'", "'~'", "'*'", "'^'", "'no'", "'<'", "'>'", "'=<'", "'<='", "'>='", "'->'", "'|'", "'module'", "'open'", "'fact'", "'assert'", "'enum'", "'/'", "'.'", "'['", "']'"
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
            ruleMemo = new HashMap[261+1];
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

            if ( (LA1_0==82) ) {
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

                if ( (LA2_0==13) ) {
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

                if ( (LA3_0==RULE_ID||LA3_0==13||(LA3_0>=15 && LA3_0<=16)||(LA3_0>=18 && LA3_0<=19)||LA3_0==25||(LA3_0>=29 && LA3_0<=32)||(LA3_0>=84 && LA3_0<=86)) ) {
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:187:1: ruleModule returns [EObject current=null] : ( ( (lv_moduleName_0_0= ruleModuleName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_2_0= 'exactly' ) )? ( (lv_name_3_0= ruleExactlyName ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) ) )* ( (lv_right_7_0= ruleRightSquareBracketKeyword ) ) )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_exactly_2_0=null;
        Token lv_exactly_5_0=null;
        Token lv_number_6_0=null;
        EObject lv_moduleName_0_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_name_3_0 = null;

        EObject lv_comma_4_0 = null;

        EObject lv_right_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:192:6: ( ( ( (lv_moduleName_0_0= ruleModuleName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_2_0= 'exactly' ) )? ( (lv_name_3_0= ruleExactlyName ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) ) )* ( (lv_right_7_0= ruleRightSquareBracketKeyword ) ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:1: ( ( (lv_moduleName_0_0= ruleModuleName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_2_0= 'exactly' ) )? ( (lv_name_3_0= ruleExactlyName ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) ) )* ( (lv_right_7_0= ruleRightSquareBracketKeyword ) ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:1: ( ( (lv_moduleName_0_0= ruleModuleName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_2_0= 'exactly' ) )? ( (lv_name_3_0= ruleExactlyName ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) ) )* ( (lv_right_7_0= ruleRightSquareBracketKeyword ) ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:2: ( (lv_moduleName_0_0= ruleModuleName ) ) ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_2_0= 'exactly' ) )? ( (lv_name_3_0= ruleExactlyName ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) ) )* ( (lv_right_7_0= ruleRightSquareBracketKeyword ) ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:193:2: ( (lv_moduleName_0_0= ruleModuleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:194:1: (lv_moduleName_0_0= ruleModuleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:194:1: (lv_moduleName_0_0= ruleModuleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:195:3: lv_moduleName_0_0= ruleModuleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getModuleNameModuleNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleModuleName_in_ruleModule274);
            lv_moduleName_0_0=ruleModuleName();
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
              	        		lv_moduleName_0_0, 
              	        		"ModuleName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:217:2: ( ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_2_0= 'exactly' ) )? ( (lv_name_3_0= ruleExactlyName ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) ) )* ( (lv_right_7_0= ruleRightSquareBracketKeyword ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==89) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:217:3: ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) ) ( (lv_exactly_2_0= 'exactly' ) )? ( (lv_name_3_0= ruleExactlyName ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) ) )* ( (lv_right_7_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:217:3: ( (lv_left_1_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:218:1: (lv_left_1_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:218:1: (lv_left_1_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:219:3: lv_left_1_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleModule296);
                    lv_left_1_0=ruleLeftSquareBracketKeyword();
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
                      	        		lv_left_1_0, 
                      	        		"LeftSquareBracketKeyword", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:241:2: ( (lv_exactly_2_0= 'exactly' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==12) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:242:1: (lv_exactly_2_0= 'exactly' )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:242:1: (lv_exactly_2_0= 'exactly' )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:243:3: lv_exactly_2_0= 'exactly'
                            {
                            lv_exactly_2_0=(Token)input.LT(1);
                            match(input,12,FOLLOW_12_in_ruleModule314); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getModuleAccess().getExactlyExactlyKeyword_1_1_0(), "exactly"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		add(current, "exactly", lv_exactly_2_0, "exactly", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:262:3: ( (lv_name_3_0= ruleExactlyName ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:263:1: (lv_name_3_0= ruleExactlyName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:263:1: (lv_name_3_0= ruleExactlyName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:264:3: lv_name_3_0= ruleExactlyName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getNameExactlyNameParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExactlyName_in_ruleModule349);
                    lv_name_3_0=ruleExactlyName();
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
                      	        		lv_name_3_0, 
                      	        		"ExactlyName", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:286:2: ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:286:3: ( (lv_comma_4_0= ruleComma ) ) ( (lv_exactly_5_0= 'exactly' ) )? ( (lv_number_6_0= RULE_INT ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:286:3: ( (lv_comma_4_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:287:1: (lv_comma_4_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:287:1: (lv_comma_4_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:288:3: lv_comma_4_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getCommaCommaParserRuleCall_1_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleModule371);
                    	    lv_comma_4_0=ruleComma();
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:310:2: ( (lv_exactly_5_0= 'exactly' ) )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==12) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:311:1: (lv_exactly_5_0= 'exactly' )
                    	            {
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:311:1: (lv_exactly_5_0= 'exactly' )
                    	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:312:3: lv_exactly_5_0= 'exactly'
                    	            {
                    	            lv_exactly_5_0=(Token)input.LT(1);
                    	            match(input,12,FOLLOW_12_in_ruleModule389); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getModuleAccess().getExactlyExactlyKeyword_1_3_1_0(), "exactly"); 
                    	                  
                    	            }
                    	            if ( backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                    	              	            associateNodeWithAstElement(currentNode, current);
                    	              	        }
                    	              	        
                    	              	        try {
                    	              	       		add(current, "exactly", lv_exactly_5_0, "exactly", lastConsumedNode);
                    	              	        } catch (ValueConverterException vce) {
                    	              				handleValueConverterException(vce);
                    	              	        }
                    	              	    
                    	            }

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:331:3: ( (lv_number_6_0= RULE_INT ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:332:1: (lv_number_6_0= RULE_INT )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:332:1: (lv_number_6_0= RULE_INT )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:333:3: lv_number_6_0= RULE_INT
                    	    {
                    	    lv_number_6_0=(Token)input.LT(1);
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleModule420); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      			createLeafNode(grammarAccess.getModuleAccess().getNumberINTTerminalRuleCall_1_3_2_0(), "number"); 
                    	      		
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
                    	      	        		lv_number_6_0, 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:355:4: ( (lv_right_7_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:356:1: (lv_right_7_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:356:1: (lv_right_7_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:357:3: lv_right_7_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleModule448);
                    lv_right_7_0=ruleRightSquareBracketKeyword();
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
                      	        		lv_right_7_0, 
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:387:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:388:2: (iv_ruleOpen= ruleOpen EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:389:2: iv_ruleOpen= ruleOpen EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOpenRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOpen_in_entryRuleOpen486);
            iv_ruleOpen=ruleOpen();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOpen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpen496); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:396:1: ruleOpen returns [EObject current=null] : ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )? ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:401:6: ( ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:402:1: ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:402:1: ( ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:402:2: ( 'private' )? ( (lv_openName_1_0= ruleOpenName ) ) ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )? ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:402:2: ( 'private' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:402:4: 'private'
                    {
                    match(input,13,FOLLOW_13_in_ruleOpen532); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:406:3: ( (lv_openName_1_0= ruleOpenName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:407:1: (lv_openName_1_0= ruleOpenName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:407:1: (lv_openName_1_0= ruleOpenName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:408:3: lv_openName_1_0= ruleOpenName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getOpenNameOpenNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleOpenName_in_ruleOpen555);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:430:2: ( ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==89) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:430:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) ) ( (lv_ref_3_0= ruleRef ) ) ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )* ( (lv_right_6_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:430:3: ( (lv_left_2_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:431:1: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:431:1: (lv_left_2_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:432:3: lv_left_2_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getLeftLeftSquareBracketKeywordParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleOpen577);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:454:2: ( (lv_ref_3_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:455:1: (lv_ref_3_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:455:1: (lv_ref_3_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:456:3: lv_ref_3_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRefRefParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleOpen598);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:478:2: ( ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:478:3: ( (lv_comma_4_0= ruleComma ) ) ( (lv_ref_5_0= ruleRef ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:478:3: ( (lv_comma_4_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:479:1: (lv_comma_4_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:479:1: (lv_comma_4_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:480:3: lv_comma_4_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getCommaCommaParserRuleCall_2_2_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleOpen620);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:502:2: ( (lv_ref_5_0= ruleRef ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:503:1: (lv_ref_5_0= ruleRef )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:503:1: (lv_ref_5_0= ruleRef )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:504:3: lv_ref_5_0= ruleRef
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRefRefParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRef_in_ruleOpen641);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:526:4: ( (lv_right_6_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:527:1: (lv_right_6_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:527:1: (lv_right_6_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:528:3: lv_right_6_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRightRightSquareBracketKeywordParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleOpen664);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:550:4: ( 'as' ( (lv_nameAs_8_0= ruleExactlyName ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:550:6: 'as' ( (lv_nameAs_8_0= ruleExactlyName ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleOpen677); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getAsKeyword_3_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:554:1: ( (lv_nameAs_8_0= ruleExactlyName ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:555:1: (lv_nameAs_8_0= ruleExactlyName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:555:1: (lv_nameAs_8_0= ruleExactlyName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:556:3: lv_nameAs_8_0= ruleExactlyName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getNameAsExactlyNameParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExactlyName_in_ruleOpen698);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:586:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:587:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:588:2: iv_ruleParagraph= ruleParagraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParagraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph736);
            iv_ruleParagraph=ruleParagraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParagraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph746); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:595:1: ruleParagraph returns [EObject current=null] : (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:600:6: ( (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:601:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:601:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:602:2: this_FactDecl_0= ruleFactDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFactDeclParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFactDecl_in_ruleParagraph796);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:615:2: this_AssertDecl_1= ruleAssertDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getAssertDeclParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertDecl_in_ruleParagraph826);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:628:2: this_FunDecl_2= ruleFunDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFunDeclParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunDecl_in_ruleParagraph856);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:641:2: this_PredDecl_3= rulePredDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getPredDeclParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePredDecl_in_ruleParagraph886);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:654:2: this_RunDecl_4= ruleRunDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getRunDeclParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRunDecl_in_ruleParagraph916);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:667:2: this_CheckDecl_5= ruleCheckDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getCheckDeclParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckDecl_in_ruleParagraph946);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:680:2: this_EnumDecl_6= ruleEnumDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getEnumDeclParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleParagraph976);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:693:2: this_SigDecl_7= ruleSigDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getSigDeclParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigDecl_in_ruleParagraph1006);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:712:1: entryRuleFactDecl returns [EObject current=null] : iv_ruleFactDecl= ruleFactDecl EOF ;
    public final EObject entryRuleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:713:2: (iv_ruleFactDecl= ruleFactDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:714:2: iv_ruleFactDecl= ruleFactDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactDecl_in_entryRuleFactDecl1041);
            iv_ruleFactDecl=ruleFactDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactDecl1051); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:721:1: ruleFactDecl returns [EObject current=null] : ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_factName_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:726:6: ( ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:727:1: ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:727:1: ( ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:727:2: ( (lv_factName_0_0= ruleFactName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:727:2: ( (lv_factName_0_0= ruleFactName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:728:1: (lv_factName_0_0= ruleFactName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:728:1: (lv_factName_0_0= ruleFactName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:729:3: lv_factName_0_0= ruleFactName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getFactNameFactNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFactName_in_ruleFactDecl1097);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:751:2: ( (lv_block_1_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:752:1: (lv_block_1_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:752:1: (lv_block_1_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:753:3: lv_block_1_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFactDecl1118);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:783:1: entryRuleAssertDecl returns [EObject current=null] : iv_ruleAssertDecl= ruleAssertDecl EOF ;
    public final EObject entryRuleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:784:2: (iv_ruleAssertDecl= ruleAssertDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:785:2: iv_ruleAssertDecl= ruleAssertDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1154);
            iv_ruleAssertDecl=ruleAssertDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertDecl1164); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:792:1: ruleAssertDecl returns [EObject current=null] : ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_assertionName_0_0 = null;

        EObject lv_block_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:797:6: ( ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:798:1: ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:798:1: ( ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:798:2: ( (lv_assertionName_0_0= ruleAssertionName ) ) ( (lv_block_1_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:798:2: ( (lv_assertionName_0_0= ruleAssertionName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:799:1: (lv_assertionName_0_0= ruleAssertionName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:799:1: (lv_assertionName_0_0= ruleAssertionName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:800:3: lv_assertionName_0_0= ruleAssertionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getAssertionNameAssertionNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionName_in_ruleAssertDecl1210);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:822:2: ( (lv_block_1_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:823:1: (lv_block_1_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:823:1: (lv_block_1_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:824:3: lv_block_1_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getBlockBlockParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleAssertDecl1231);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:854:1: entryRuleFunDecl returns [EObject current=null] : iv_ruleFunDecl= ruleFunDecl EOF ;
    public final EObject entryRuleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:855:2: (iv_ruleFunDecl= ruleFunDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:856:2: iv_ruleFunDecl= ruleFunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunDecl_in_entryRuleFunDecl1267);
            iv_ruleFunDecl=ruleFunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunDecl1277); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:863:1: ruleFunDecl returns [EObject current=null] : ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:868:6: ( ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:869:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:869:1: ( ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:869:2: ( 'private' )? 'fun' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_functionName_4_0= ruleFunctionName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_colon_15_0= ruleColon ) ) ( (lv_expr_16_0= ruleExpression ) ) ( (lv_block_17_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:869:2: ( 'private' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:869:4: 'private'
                    {
                    match(input,13,FOLLOW_13_in_ruleFunDecl1313); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleFunDecl1325); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunDeclAccess().getFunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:877:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==88) ) {
                    alt14=1;
                }
            }
            else if ( ((LA14_0>=44 && LA14_0<=46)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:877:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:877:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:878:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:878:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:879:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleFunDecl1347);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:901:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:902:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:902:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:903:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleFunDecl1368);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:925:4: ( (lv_functionName_4_0= ruleFunctionName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:926:1: (lv_functionName_4_0= ruleFunctionName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:926:1: (lv_functionName_4_0= ruleFunctionName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:927:3: lv_functionName_4_0= ruleFunctionName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getFunctionNameFunctionNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFunctionName_in_ruleFunDecl1391);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:949:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==89) ) {
                alt19=1;
            }
            else if ( (LA19_0==47) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:949:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:949:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:949:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:949:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:950:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:950:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:951:3: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleFunDecl1414);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:973:2: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID||LA16_0==13||(LA16_0>=50 && LA16_0<=51)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:973:3: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:973:3: ( (lv_decl_6_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:974:1: (lv_decl_6_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:974:1: (lv_decl_6_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:975:3: lv_decl_6_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1436);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:997:2: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==27) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:997:3: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:997:3: ( (lv_comma_7_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:998:1: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:998:1: (lv_comma_7_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:999:3: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleFunDecl1458);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1021:2: ( (lv_decl_8_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1022:1: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1022:1: (lv_decl_8_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1023:3: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1479);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1045:6: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1046:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1046:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1047:3: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleFunDecl1504);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1070:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1070:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1070:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1070:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1071:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1071:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1072:3: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleFunDecl1533);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1094:2: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==13||(LA18_0>=50 && LA18_0<=51)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1094:3: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1094:3: ( (lv_decl_11_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1095:1: (lv_decl_11_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1095:1: (lv_decl_11_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1096:3: lv_decl_11_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1555);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1118:2: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==27) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1118:3: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1118:3: ( (lv_comma_12_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1119:1: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1119:1: (lv_comma_12_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1120:3: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleFunDecl1577);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1142:2: ( (lv_decl_13_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1143:1: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1143:1: (lv_decl_13_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1144:3: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1598);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1166:6: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1167:1: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1167:1: (lv_rightP_14_0= ruleRightParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1168:3: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightParenthesis_in_ruleFunDecl1623);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1190:5: ( (lv_colon_15_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1191:1: (lv_colon_15_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1191:1: (lv_colon_15_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1192:3: lv_colon_15_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getColonColonParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleFunDecl1647);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1214:2: ( (lv_expr_16_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1215:1: (lv_expr_16_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1215:1: (lv_expr_16_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1216:3: lv_expr_16_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunDecl1668);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1238:2: ( (lv_block_17_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1239:1: (lv_block_17_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1239:1: (lv_block_17_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1240:3: lv_block_17_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getBlockBlockParserRuleCall_7_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFunDecl1689);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1270:1: entryRulePredDecl returns [EObject current=null] : iv_rulePredDecl= rulePredDecl EOF ;
    public final EObject entryRulePredDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1271:2: (iv_rulePredDecl= rulePredDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1272:2: iv_rulePredDecl= rulePredDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredDecl_in_entryRulePredDecl1725);
            iv_rulePredDecl=rulePredDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredDecl1735); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1279:1: rulePredDecl returns [EObject current=null] : ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1284:6: ( ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1285:1: ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1285:1: ( ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1285:2: ( 'private' )? 'pred' ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )? ( (lv_predicateName_4_0= rulePredicateName ) ) ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )? ( (lv_block_15_0= ruleBlock ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1285:2: ( 'private' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1285:4: 'private'
                    {
                    match(input,13,FOLLOW_13_in_rulePredDecl1771); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_rulePredDecl1783); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPredDeclAccess().getPredKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1293:1: ( ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==88) ) {
                    alt21=1;
                }
            }
            else if ( ((LA21_0>=44 && LA21_0<=46)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1293:2: ( (lv_ref_2_0= ruleRef ) ) ( (lv_dot_3_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1293:2: ( (lv_ref_2_0= ruleRef ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1294:1: (lv_ref_2_0= ruleRef )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1294:1: (lv_ref_2_0= ruleRef )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1295:3: lv_ref_2_0= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_rulePredDecl1805);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1317:2: ( (lv_dot_3_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1318:1: (lv_dot_3_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1318:1: (lv_dot_3_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1319:3: lv_dot_3_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDotDotParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_rulePredDecl1826);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1341:4: ( (lv_predicateName_4_0= rulePredicateName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1342:1: (lv_predicateName_4_0= rulePredicateName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1342:1: (lv_predicateName_4_0= rulePredicateName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1343:3: lv_predicateName_4_0= rulePredicateName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getPredicateNamePredicateNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePredicateName_in_rulePredDecl1849);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1365:2: ( ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) ) | ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==89) ) {
                alt26=1;
            }
            else if ( (LA26_0==47) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1365:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1365:3: ( ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1365:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )? ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1365:4: ( (lv_leftS_5_0= ruleLeftSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1366:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1366:1: (lv_leftS_5_0= ruleLeftSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1367:3: lv_leftS_5_0= ruleLeftSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getLeftSLeftSquareBracketKeywordParserRuleCall_4_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_rulePredDecl1872);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1389:2: ( ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID||LA23_0==13||(LA23_0>=50 && LA23_0<=51)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1389:3: ( (lv_decl_6_0= ruleDecl ) ) ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1389:3: ( (lv_decl_6_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1390:1: (lv_decl_6_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1390:1: (lv_decl_6_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1391:3: lv_decl_6_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl1894);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1413:2: ( ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==27) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1413:3: ( (lv_comma_7_0= ruleComma ) ) ( (lv_decl_8_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1413:3: ( (lv_comma_7_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1414:1: (lv_comma_7_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1414:1: (lv_comma_7_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1415:3: lv_comma_7_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_0_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_rulePredDecl1916);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1437:2: ( (lv_decl_8_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1438:1: (lv_decl_8_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1438:1: (lv_decl_8_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1439:3: lv_decl_8_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl1937);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1461:6: ( (lv_rightS_9_0= ruleRightSquareBracketKeyword ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1462:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1462:1: (lv_rightS_9_0= ruleRightSquareBracketKeyword )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1463:3: lv_rightS_9_0= ruleRightSquareBracketKeyword
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRightSRightSquareBracketKeywordParserRuleCall_4_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_rulePredDecl1962);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1486:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1486:6: ( ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1486:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) ) ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )? ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1486:7: ( (lv_leftP_10_0= ruleLeftParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1487:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1487:1: (lv_leftP_10_0= ruleLeftParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1488:3: lv_leftP_10_0= ruleLeftParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getLeftPLeftParenthesisParserRuleCall_4_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftParenthesis_in_rulePredDecl1991);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1510:2: ( ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID||LA25_0==13||(LA25_0>=50 && LA25_0<=51)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1510:3: ( (lv_decl_11_0= ruleDecl ) ) ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1510:3: ( (lv_decl_11_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1511:1: (lv_decl_11_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1511:1: (lv_decl_11_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1512:3: lv_decl_11_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2013);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1534:2: ( ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==27) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1534:3: ( (lv_comma_12_0= ruleComma ) ) ( (lv_decl_13_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1534:3: ( (lv_comma_12_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1535:1: (lv_comma_12_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1535:1: (lv_comma_12_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1536:3: lv_comma_12_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getCommaCommaParserRuleCall_4_1_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_rulePredDecl2035);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1558:2: ( (lv_decl_13_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1559:1: (lv_decl_13_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1559:1: (lv_decl_13_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1560:3: lv_decl_13_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2056);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1582:6: ( (lv_rightP_14_0= ruleRightParenthesis ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1583:1: (lv_rightP_14_0= ruleRightParenthesis )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1583:1: (lv_rightP_14_0= ruleRightParenthesis )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1584:3: lv_rightP_14_0= ruleRightParenthesis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRightPRightParenthesisParserRuleCall_4_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightParenthesis_in_rulePredDecl2081);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1606:5: ( (lv_block_15_0= ruleBlock ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1607:1: (lv_block_15_0= ruleBlock )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1607:1: (lv_block_15_0= ruleBlock )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1608:3: lv_block_15_0= ruleBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getBlockBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_rulePredDecl2105);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1638:1: entryRuleRunDecl returns [EObject current=null] : iv_ruleRunDecl= ruleRunDecl EOF ;
    public final EObject entryRuleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1639:2: (iv_ruleRunDecl= ruleRunDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1640:2: iv_ruleRunDecl= ruleRunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRunDecl_in_entryRuleRunDecl2141);
            iv_ruleRunDecl=ruleRunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRunDecl2151); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1647:1: ruleRunDecl returns [EObject current=null] : ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_runName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1652:6: ( ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1653:1: ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1653:1: ( ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1653:2: ( ( (lv_runName_0_0= ruleAlias ) ) ':' )? 'run' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1653:2: ( ( (lv_runName_0_0= ruleAlias ) ) ':' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1653:3: ( (lv_runName_0_0= ruleAlias ) ) ':'
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1653:3: ( (lv_runName_0_0= ruleAlias ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1654:1: (lv_runName_0_0= ruleAlias )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1654:1: (lv_runName_0_0= ruleAlias )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1655:3: lv_runName_0_0= ruleAlias
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getRunNameAliasParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleRunDecl2198);
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

                    match(input,17,FOLLOW_17_in_ruleRunDecl2208); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRunDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleRunDecl2220); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRunDeclAccess().getRunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1685:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==26) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1685:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1685:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1685:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1686:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1686:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1687:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRunDecl2243); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRunDeclAccess().getName2PredicateNameCrossReference_2_0_0(), "name2"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1703:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1703:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1704:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1704:1: (lv_block_4_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1705:3: lv_block_4_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getBlockBlockParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleRunDecl2270);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1727:3: ( (lv_scope_5_0= ruleScope ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1728:1: (lv_scope_5_0= ruleScope )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1728:1: (lv_scope_5_0= ruleScope )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1729:3: lv_scope_5_0= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleRunDecl2292);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1759:1: entryRuleCheckDecl returns [EObject current=null] : iv_ruleCheckDecl= ruleCheckDecl EOF ;
    public final EObject entryRuleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1760:2: (iv_ruleCheckDecl= ruleCheckDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1761:2: iv_ruleCheckDecl= ruleCheckDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCheckDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2328);
            iv_ruleCheckDecl=ruleCheckDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCheckDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckDecl2338); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1768:1: ruleCheckDecl returns [EObject current=null] : ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) ;
    public final EObject ruleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_checkName_0_0 = null;

        EObject lv_block_4_0 = null;

        EObject lv_scope_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1773:6: ( ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1774:1: ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1774:1: ( ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1774:2: ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )? 'check' ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) ) ( (lv_scope_5_0= ruleScope ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1774:2: ( ( (lv_checkName_0_0= ruleAlias ) ) ':' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1774:3: ( (lv_checkName_0_0= ruleAlias ) ) ':'
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1774:3: ( (lv_checkName_0_0= ruleAlias ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1775:1: (lv_checkName_0_0= ruleAlias )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1775:1: (lv_checkName_0_0= ruleAlias )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1776:3: lv_checkName_0_0= ruleAlias
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getCheckNameAliasParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleCheckDecl2385);
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

                    match(input,17,FOLLOW_17_in_ruleCheckDecl2395); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCheckDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleCheckDecl2407); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCheckDeclAccess().getCheckKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1806:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==26) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1806:1: ( ( ( RULE_ID ) ) | ( (lv_block_4_0= ruleBlock ) ) )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1806:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1806:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1807:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1807:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1808:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckDecl2430); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCheckDeclAccess().getNameAssertionNameCrossReference_2_0_0(), "name"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1824:6: ( (lv_block_4_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1824:6: ( (lv_block_4_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1825:1: (lv_block_4_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1825:1: (lv_block_4_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1826:3: lv_block_4_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getBlockBlockParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleCheckDecl2457);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1848:3: ( (lv_scope_5_0= ruleScope ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1849:1: (lv_scope_5_0= ruleScope )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1849:1: (lv_scope_5_0= ruleScope )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1850:3: lv_scope_5_0= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleCheckDecl2479);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1880:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1881:2: (iv_ruleScope= ruleScope EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1882:2: iv_ruleScope= ruleScope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScope_in_entryRuleScope2515);
            iv_ruleScope=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScope2525); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1889:1: ruleScope returns [EObject current=null] : ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1894:6: ( ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1895:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1895:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )
            int alt37=4;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_INT) ) {
                    switch ( input.LA(3) ) {
                    case 21:
                        {
                        alt37=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA37_6 = input.LA(4);

                        if ( (LA37_6==17||LA37_6==87) ) {
                            alt37=1;
                        }
                        else if ( (LA37_6==EOF||LA37_6==RULE_ID||LA37_6==13||(LA37_6>=15 && LA37_6<=16)||(LA37_6>=18 && LA37_6<=19)||LA37_6==22||LA37_6==25||LA37_6==27||(LA37_6>=29 && LA37_6<=32)||(LA37_6>=84 && LA37_6<=86)) ) {
                            alt37=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1895:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 37, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 23:
                    case 24:
                        {
                        alt37=3;
                        }
                        break;
                    case EOF:
                    case 13:
                    case 15:
                    case 16:
                    case 18:
                    case 19:
                    case 22:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 84:
                    case 85:
                    case 86:
                        {
                        alt37=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1895:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 37, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA37_1==12) ) {
                    alt37=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1895:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA37_0==EOF||LA37_0==RULE_ID||LA37_0==13||(LA37_0>=15 && LA37_0<=16)||(LA37_0>=18 && LA37_0<=19)||LA37_0==22||LA37_0==25||(LA37_0>=29 && LA37_0<=32)||(LA37_0>=84 && LA37_0<=86)) ) {
                alt37=4;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1895:1: ( ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? ) | ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? ) | ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? ) | ( () ( (lv_expect_19_0= ruleExpectation ) )? ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1895:2: ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1895:2: ( () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1895:3: () 'for' RULE_INT ( (lv_expect_3_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1895:3: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1896:2: 
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

                    match(input,20,FOLLOW_20_in_ruleScope2573); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_0_1(), null); 
                          
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2582); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_0_2(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1917:1: ( (lv_expect_3_0= ruleExpectation ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==22) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1918:1: (lv_expect_3_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1918:1: (lv_expect_3_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1919:3: lv_expect_3_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_0_3_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2602);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1942:6: ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1942:6: ( () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1942:7: () 'for' RULE_INT 'but' ( (lv_typescope_8_0= ruleTypescope ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )* ( (lv_expect_11_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1942:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1943:2: 
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

                    match(input,20,FOLLOW_20_in_ruleScope2633); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_1_1(), null); 
                          
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2642); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_1_2(), null); 
                          
                    }
                    match(input,21,FOLLOW_21_in_ruleScope2651); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getButKeyword_1_3(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1968:1: ( (lv_typescope_8_0= ruleTypescope ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1969:1: (lv_typescope_8_0= ruleTypescope )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1969:1: (lv_typescope_8_0= ruleTypescope )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1970:3: lv_typescope_8_0= ruleTypescope
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2672);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1992:2: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==27) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1992:3: ( (lv_comma_9_0= ruleComma ) ) ( (lv_typescope_10_0= ruleTypescope ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1992:3: ( (lv_comma_9_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1993:1: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1993:1: (lv_comma_9_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:1994:3: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_1_5_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleScope2694);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2016:2: ( (lv_typescope_10_0= ruleTypescope ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2017:1: (lv_typescope_10_0= ruleTypescope )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2017:1: (lv_typescope_10_0= ruleTypescope )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2018:3: lv_typescope_10_0= ruleTypescope
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_1_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2715);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2040:4: ( (lv_expect_11_0= ruleExpectation ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==22) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2041:1: (lv_expect_11_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2041:1: (lv_expect_11_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2042:3: lv_expect_11_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_1_6_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2738);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2065:6: ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2065:6: ( () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2065:7: () 'for' ( (lv_typescope_14_0= ruleTypescope ) ) ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )* ( (lv_expect_17_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2065:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2066:2: 
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

                    match(input,20,FOLLOW_20_in_ruleScope2769); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_2_1(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2083:1: ( (lv_typescope_14_0= ruleTypescope ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2084:1: (lv_typescope_14_0= ruleTypescope )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2084:1: (lv_typescope_14_0= ruleTypescope )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2085:3: lv_typescope_14_0= ruleTypescope
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2790);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2107:2: ( ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2107:3: ( (lv_comma_15_0= ruleComma ) ) ( (lv_typescope_16_0= ruleTypescope ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2107:3: ( (lv_comma_15_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2108:1: (lv_comma_15_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2108:1: (lv_comma_15_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2109:3: lv_comma_15_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getCommaCommaParserRuleCall_2_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleScope2812);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2131:2: ( (lv_typescope_16_0= ruleTypescope ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2132:1: (lv_typescope_16_0= ruleTypescope )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2132:1: (lv_typescope_16_0= ruleTypescope )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2133:3: lv_typescope_16_0= ruleTypescope
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_2_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2833);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2155:4: ( (lv_expect_17_0= ruleExpectation ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==22) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2156:1: (lv_expect_17_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2156:1: (lv_expect_17_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2157:3: lv_expect_17_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_2_4_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2856);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2180:6: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2180:6: ( () ( (lv_expect_19_0= ruleExpectation ) )? )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2180:7: () ( (lv_expect_19_0= ruleExpectation ) )?
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2180:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2181:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2194:2: ( (lv_expect_19_0= ruleExpectation ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==22) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2195:1: (lv_expect_19_0= ruleExpectation )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2195:1: (lv_expect_19_0= ruleExpectation )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2196:3: lv_expect_19_0= ruleExpectation
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getExpectExpectationParserRuleCall_3_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpectation_in_ruleScope2898);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2226:1: entryRuleExpectation returns [EObject current=null] : iv_ruleExpectation= ruleExpectation EOF ;
    public final EObject entryRuleExpectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpectation = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2227:2: (iv_ruleExpectation= ruleExpectation EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2228:2: iv_ruleExpectation= ruleExpectation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpectationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpectation_in_entryRuleExpectation2936);
            iv_ruleExpectation=ruleExpectation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpectation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpectation2946); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2235:1: ruleExpectation returns [EObject current=null] : ( 'expect' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleExpectation() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2240:6: ( ( 'expect' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2241:1: ( 'expect' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2241:1: ( 'expect' ( (lv_value_1_0= RULE_INT ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2241:3: 'expect' ( (lv_value_1_0= RULE_INT ) )
            {
            match(input,22,FOLLOW_22_in_ruleExpectation2981); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExpectationAccess().getExpectKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2245:1: ( (lv_value_1_0= RULE_INT ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2246:1: (lv_value_1_0= RULE_INT )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2246:1: (lv_value_1_0= RULE_INT )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2247:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExpectation2998); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2277:1: entryRuleTypescope returns [EObject current=null] : iv_ruleTypescope= ruleTypescope EOF ;
    public final EObject entryRuleTypescope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypescope = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2278:2: (iv_ruleTypescope= ruleTypescope EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2279:2: iv_ruleTypescope= ruleTypescope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypescopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypescope_in_entryRuleTypescope3039);
            iv_ruleTypescope=ruleTypescope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypescope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypescope3049); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2286:1: ruleTypescope returns [EObject current=null] : ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) ) ;
    public final EObject ruleTypescope() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2291:6: ( ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2292:1: ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2292:1: ( () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2292:2: () ( 'exactly' )? RULE_INT ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2292:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2293:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2306:2: ( 'exactly' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2306:4: 'exactly'
                    {
                    match(input,12,FOLLOW_12_in_ruleTypescope3097); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypescopeAccess().getExactlyKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTypescope3108); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getTypescopeAccess().getINTTerminalRuleCall_2(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2314:1: ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=23 && LA40_0<=24)) ) {
                alt40=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2314:1: ( ( ( RULE_ID ) ) | ( 'int' | 'seq' ) )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2314:2: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2314:2: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2315:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2315:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2316:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypescope3130); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTypescopeAccess().getNameReferencesNameCrossReference_3_0_0(), "name"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2332:6: ( 'int' | 'seq' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2332:6: ( 'int' | 'seq' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==23) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==24) ) {
                        alt39=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2332:6: ( 'int' | 'seq' )", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2332:8: 'int'
                            {
                            match(input,23,FOLLOW_23_in_ruleTypescope3147); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypescopeAccess().getIntKeyword_3_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2337:7: 'seq'
                            {
                            match(input,24,FOLLOW_24_in_ruleTypescope3163); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2349:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2350:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2351:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3201);
            iv_ruleEnumDecl=ruleEnumDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl3211); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2358:1: ruleEnumDecl returns [EObject current=null] : ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2363:6: ( ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2364:1: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2364:1: ( ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2364:2: ( (lv_enumName_0_0= ruleEnumName ) ) ( (lv_leftC_1_0= ruleLeftCurlyBracket ) ) ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )* ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2364:2: ( (lv_enumName_0_0= ruleEnumName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2365:1: (lv_enumName_0_0= ruleEnumName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2365:1: (lv_enumName_0_0= ruleEnumName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2366:3: lv_enumName_0_0= ruleEnumName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getEnumNameEnumNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumName_in_ruleEnumDecl3257);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2388:2: ( (lv_leftC_1_0= ruleLeftCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2389:1: (lv_leftC_1_0= ruleLeftCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2389:1: (lv_leftC_1_0= ruleLeftCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2390:3: lv_leftC_1_0= ruleLeftCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getLeftCLeftCurlyBracketParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleEnumDecl3278);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2412:2: ( (lv_propertyEnum_2_0= ruleEnumPropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2413:1: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2413:1: (lv_propertyEnum_2_0= ruleEnumPropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2414:3: lv_propertyEnum_2_0= ruleEnumPropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3299);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2436:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2436:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2436:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2437:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2437:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2438:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleEnumDecl3321);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2460:2: ( (lv_propertyEnum_4_0= ruleEnumPropertyName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2461:1: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2461:1: (lv_propertyEnum_4_0= ruleEnumPropertyName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2462:3: lv_propertyEnum_4_0= ruleEnumPropertyName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getPropertyEnumEnumPropertyNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3342);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2484:4: ( (lv_rightC_5_0= ruleRightCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2485:1: (lv_rightC_5_0= ruleRightCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2485:1: (lv_rightC_5_0= ruleRightCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2486:3: lv_rightC_5_0= ruleRightCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getRightCRightCurlyBracketParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleEnumDecl3365);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2516:1: entryRuleSigDecl returns [EObject current=null] : iv_ruleSigDecl= ruleSigDecl EOF ;
    public final EObject entryRuleSigDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2517:2: (iv_ruleSigDecl= ruleSigDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2518:2: iv_ruleSigDecl= ruleSigDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigDecl_in_entryRuleSigDecl3401);
            iv_ruleSigDecl=ruleSigDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigDecl3411); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2525:1: ruleSigDecl returns [EObject current=null] : ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2530:6: ( ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2531:1: ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2531:1: ( (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2531:2: (this_SigQual_0= ruleSigQual )? 'sig' ( (lv_signatureName_2_0= ruleSignatureName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )* ( (lv_sigExt_5_0= ruleSigExt ) )? '{' ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )? '}' ( (lv_block_11_0= ruleBlock ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2531:2: (this_SigQual_0= ruleSigQual )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13||(LA42_0>=29 && LA42_0<=32)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2532:2: this_SigQual_0= ruleSigQual
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigQualParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigQual_in_ruleSigDecl3462);
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

            match(input,25,FOLLOW_25_in_ruleSigDecl3473); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getSigKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2547:1: ( (lv_signatureName_2_0= ruleSignatureName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2548:1: (lv_signatureName_2_0= ruleSignatureName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2548:1: (lv_signatureName_2_0= ruleSignatureName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2549:3: lv_signatureName_2_0= ruleSignatureName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignatureName_in_ruleSigDecl3494);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2571:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==27) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2571:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_signatureName_4_0= ruleSignatureName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2571:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2572:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2572:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2573:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleSigDecl3516);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2595:2: ( (lv_signatureName_4_0= ruleSignatureName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2596:1: (lv_signatureName_4_0= ruleSignatureName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2596:1: (lv_signatureName_4_0= ruleSignatureName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2597:3: lv_signatureName_4_0= ruleSignatureName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSignatureNameSignatureNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignatureName_in_ruleSigDecl3537);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2619:4: ( (lv_sigExt_5_0= ruleSigExt ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=33 && LA44_0<=34)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2620:1: (lv_sigExt_5_0= ruleSigExt )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2620:1: (lv_sigExt_5_0= ruleSigExt )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2621:3: lv_sigExt_5_0= ruleSigExt
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigExtSigExtParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSigExt_in_ruleSigDecl3560);
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

            match(input,26,FOLLOW_26_in_ruleSigDecl3571); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getLeftCurlyBracketKeyword_5(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2647:1: ( ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==13||(LA46_0>=50 && LA46_0<=51)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2647:2: ( (lv_decl_7_0= ruleDecl ) ) ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2647:2: ( (lv_decl_7_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2648:1: (lv_decl_7_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2648:1: (lv_decl_7_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2649:3: lv_decl_7_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl3593);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2671:2: ( ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==27) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2671:3: ( (lv_comma2_8_0= ',' ) ) ( (lv_decl_9_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2671:3: ( (lv_comma2_8_0= ',' ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2672:1: (lv_comma2_8_0= ',' )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2672:1: (lv_comma2_8_0= ',' )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2673:3: lv_comma2_8_0= ','
                    	    {
                    	    lv_comma2_8_0=(Token)input.LT(1);
                    	    match(input,27,FOLLOW_27_in_ruleSigDecl3612); if (failed) return current;
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2692:2: ( (lv_decl_9_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2693:1: (lv_decl_9_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2693:1: (lv_decl_9_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2694:3: lv_decl_9_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl3646);
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

            match(input,28,FOLLOW_28_in_ruleSigDecl3660); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getRightCurlyBracketKeyword_7(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2720:1: ( (lv_block_11_0= ruleBlock ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==26) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2721:1: (lv_block_11_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2721:1: (lv_block_11_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2722:3: lv_block_11_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getBlockBlockParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleSigDecl3681);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2752:1: entryRuleSigQual returns [EObject current=null] : iv_ruleSigQual= ruleSigQual EOF ;
    public final EObject entryRuleSigQual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigQual = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2753:2: (iv_ruleSigQual= ruleSigQual EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2754:2: iv_ruleSigQual= ruleSigQual EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigQualRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigQual_in_entryRuleSigQual3718);
            iv_ruleSigQual=ruleSigQual();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigQual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigQual3728); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2761:1: ruleSigQual returns [EObject current=null] : ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* ) ;
    public final EObject ruleSigQual() throws RecognitionException {
        EObject current = null;

        Token lv_sigq_0_1=null;
        Token lv_sigq_0_2=null;
        Token lv_sigq_0_3=null;
        Token lv_sigq_0_4=null;
        Token lv_sigq_0_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2766:6: ( ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2767:1: ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2767:1: ( ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2767:2: ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) ) ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2767:2: ( ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2768:1: ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2768:1: ( (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2769:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2769:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt48=1;
                }
                break;
            case 30:
                {
                alt48=2;
                }
                break;
            case 31:
                {
                alt48=3;
                }
                break;
            case 32:
                {
                alt48=4;
                }
                break;
            case 13:
                {
                alt48=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2769:1: (lv_sigq_0_1= 'abstract' | lv_sigq_0_2= 'lone' | lv_sigq_0_3= 'one' | lv_sigq_0_4= 'some' | lv_sigq_0_5= 'private' )", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2770:3: lv_sigq_0_1= 'abstract'
                    {
                    lv_sigq_0_1=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleSigQual3773); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2788:8: lv_sigq_0_2= 'lone'
                    {
                    lv_sigq_0_2=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleSigQual3802); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2806:8: lv_sigq_0_3= 'one'
                    {
                    lv_sigq_0_3=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleSigQual3831); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2824:8: lv_sigq_0_4= 'some'
                    {
                    lv_sigq_0_4=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleSigQual3860); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2842:8: lv_sigq_0_5= 'private'
                    {
                    lv_sigq_0_5=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleSigQual3889); if (failed) return current;
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2863:2: ( 'abstract' | 'lone' | 'one' | 'some' | 'private' )*
            loop49:
            do {
                int alt49=6;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt49=1;
                    }
                    break;
                case 30:
                    {
                    alt49=2;
                    }
                    break;
                case 31:
                    {
                    alt49=3;
                    }
                    break;
                case 32:
                    {
                    alt49=4;
                    }
                    break;
                case 13:
                    {
                    alt49=5;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2863:4: 'abstract'
            	    {
            	    match(input,29,FOLLOW_29_in_ruleSigQual3916); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getAbstractKeyword_1_0(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2868:7: 'lone'
            	    {
            	    match(input,30,FOLLOW_30_in_ruleSigQual3932); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getLoneKeyword_1_1(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2873:7: 'one'
            	    {
            	    match(input,31,FOLLOW_31_in_ruleSigQual3948); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getOneKeyword_1_2(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2878:7: 'some'
            	    {
            	    match(input,32,FOLLOW_32_in_ruleSigQual3964); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigQualAccess().getSomeKeyword_1_3(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2883:7: 'private'
            	    {
            	    match(input,13,FOLLOW_13_in_ruleSigQual3980); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2895:1: entryRuleSigExt returns [EObject current=null] : iv_ruleSigExt= ruleSigExt EOF ;
    public final EObject entryRuleSigExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExt = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2896:2: (iv_ruleSigExt= ruleSigExt EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2897:2: iv_ruleSigExt= ruleSigExt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigExtRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigExt_in_entryRuleSigExt4018);
            iv_ruleSigExt=ruleSigExt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigExt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExt4028); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2904:1: ruleSigExt returns [EObject current=null] : ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) ;
    public final EObject ruleSigExt() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1_0 = null;

        EObject lv_ref_3_0 = null;

        EObject lv_ref2_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2909:6: ( ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2910:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2910:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==33) ) {
                alt51=1;
            }
            else if ( (LA51_0==34) ) {
                alt51=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2910:1: ( ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) ) | ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* ) )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2910:2: ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2910:2: ( 'extends' ( (lv_ref_1_0= ruleReferencesSig ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2910:4: 'extends' ( (lv_ref_1_0= ruleReferencesSig ) )
                    {
                    match(input,33,FOLLOW_33_in_ruleSigExt4064); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getExtendsKeyword_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2914:1: ( (lv_ref_1_0= ruleReferencesSig ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2915:1: (lv_ref_1_0= ruleReferencesSig )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2915:1: (lv_ref_1_0= ruleReferencesSig )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2916:3: lv_ref_1_0= ruleReferencesSig
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4085);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2939:6: ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2939:6: ( 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )* )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2939:8: 'in' ( (lv_ref_3_0= ruleReferencesSig ) ) ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    {
                    match(input,34,FOLLOW_34_in_ruleSigExt4103); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getInKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2943:1: ( (lv_ref_3_0= ruleReferencesSig ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2944:1: (lv_ref_3_0= ruleReferencesSig )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2944:1: (lv_ref_3_0= ruleReferencesSig )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2945:3: lv_ref_3_0= ruleReferencesSig
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefReferencesSigParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4124);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2967:2: ( '+' ( (lv_ref2_5_0= ruleReferencesSig ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==35) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2967:4: '+' ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    {
                    	    match(input,35,FOLLOW_35_in_ruleSigExt4135); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getSigExtAccess().getPlusSignKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2971:1: ( (lv_ref2_5_0= ruleReferencesSig ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2972:1: (lv_ref2_5_0= ruleReferencesSig )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2972:1: (lv_ref2_5_0= ruleReferencesSig )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:2973:3: lv_ref2_5_0= ruleReferencesSig
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRef2ReferencesSigParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReferencesSig_in_ruleSigExt4156);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3003:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3004:2: (iv_ruleExpression= ruleExpression EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3005:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4195);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4205); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3012:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3017:6: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3018:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3018:1: (this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3019:2: this_TerminalExpression_0= ruleTerminalExpression ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_ruleExpression4255);
            this_TerminalExpression_0=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_TerminalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:1: ( ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) ) | ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) ) | ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) ) | ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? ) | ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) ) )*
            loop57:
            do {
                int alt57=6;
                switch ( input.LA(1) ) {
                case 55:
                    {
                    int LA57_2 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA57_3 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA57_4 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA57_5 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA57_6 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 60:
                    {
                    int LA57_7 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA57_8 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA57_9 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA57_10 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA57_11 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 64:
                    {
                    int LA57_12 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 65:
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
                case 66:
                    {
                    int LA57_15 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 67:
                    {
                    int LA57_16 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA57_17 = input.LA(2);

                    if ( (synpred69()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA57_18 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA57_19 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA57_20 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 69:
                    {
                    int LA57_21 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 80:
                    {
                    int LA57_22 = input.LA(2);

                    if ( (synpred70()) ) {
                        alt57=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA57_23 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA57_24 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 52:
                    {
                    int LA57_25 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA57_26 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 75:
                    {
                    int LA57_27 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 76:
                    {
                    int LA57_28 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 77:
                    {
                    int LA57_29 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA57_30 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 79:
                    {
                    int LA57_31 = input.LA(2);

                    if ( (synpred73()) ) {
                        alt57=3;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA57_32 = input.LA(2);

                    if ( (synpred76()) ) {
                        alt57=4;
                    }


                    }
                    break;
                case 39:
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:2: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:2: ( ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:3: ( (lv_binOp_1_0= ruleBinOp ) ) ( (lv_expr_2_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:3: ( (lv_binOp_1_0= ruleBinOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3031:1: (lv_binOp_1_0= ruleBinOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3031:1: (lv_binOp_1_0= ruleBinOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3032:3: lv_binOp_1_0= ruleBinOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBinOp_in_ruleExpression4277);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3054:2: ( (lv_expr_2_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3055:1: (lv_expr_2_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3055:1: (lv_expr_2_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3056:3: lv_expr_2_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4298);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:6: ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:6: ( ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:7: ( (lv_arrowOp_3_0= ruleArrowOp ) ) ( (lv_expr_4_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:7: ( (lv_arrowOp_3_0= ruleArrowOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3080:1: (lv_arrowOp_3_0= ruleArrowOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3080:1: (lv_arrowOp_3_0= ruleArrowOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3081:3: lv_arrowOp_3_0= ruleArrowOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrowOp_in_ruleExpression4327);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3103:2: ( (lv_expr_4_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3104:1: (lv_expr_4_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3104:1: (lv_expr_4_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3105:3: lv_expr_4_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4348);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:6: ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:6: ( ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:7: ( '!' | 'not' )? ( (lv_cmp_7_0= ruleCompareOp ) ) ( (lv_expr_8_0= ruleExpression ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:7: ( '!' | 'not' )?
            	    int alt52=3;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==36) ) {
            	        alt52=1;
            	    }
            	    else if ( (LA52_0==37) ) {
            	        alt52=2;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:9: '!'
            	            {
            	            match(input,36,FOLLOW_36_in_ruleExpression4367); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getExclamationMarkKeyword_1_2_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3133:7: 'not'
            	            {
            	            match(input,37,FOLLOW_37_in_ruleExpression4383); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getNotKeyword_1_2_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3137:3: ( (lv_cmp_7_0= ruleCompareOp ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3138:1: (lv_cmp_7_0= ruleCompareOp )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3138:1: (lv_cmp_7_0= ruleCompareOp )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3139:3: lv_cmp_7_0= ruleCompareOp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOp_in_ruleExpression4406);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3161:2: ( (lv_expr_8_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3162:1: (lv_expr_8_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3162:1: (lv_expr_8_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3163:3: lv_expr_8_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4427);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:6: ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:6: ( ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )? )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:7: ( '=>' | 'implies' ) ( (lv_expr_11_0= ruleExpression ) ) ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )?
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:7: ( '=>' | 'implies' )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==38) ) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==39) ) {
            	        alt53=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("3186:7: ( '=>' | 'implies' )", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:9: '=>'
            	            {
            	            match(input,38,FOLLOW_38_in_ruleExpression4446); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_3_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3191:7: 'implies'
            	            {
            	            match(input,39,FOLLOW_39_in_ruleExpression4462); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getImpliesKeyword_1_3_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3195:2: ( (lv_expr_11_0= ruleExpression ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3196:1: (lv_expr_11_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3196:1: (lv_expr_11_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3197:3: lv_expr_11_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4484);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3219:2: ( 'else' ( (lv_expr_13_0= ruleExpression ) ) )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==40) ) {
            	        int LA54_1 = input.LA(2);

            	        if ( (synpred75()) ) {
            	            alt54=1;
            	        }
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3219:4: 'else' ( (lv_expr_13_0= ruleExpression ) )
            	            {
            	            match(input,40,FOLLOW_40_in_ruleExpression4495); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getExpressionAccess().getElseKeyword_1_3_2_0(), null); 
            	                  
            	            }
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:1: ( (lv_expr_13_0= ruleExpression ) )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3224:1: (lv_expr_13_0= ruleExpression )
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3224:1: (lv_expr_13_0= ruleExpression )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3225:3: lv_expr_13_0= ruleExpression
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleExpression4516);
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
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:6: ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:6: ( ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:7: ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) ) ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )? ( (lv_right_18_0= ruleRightSquareBracketKeyword ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:7: ( (lv_left_14_0= ruleLeftSquareBracketKeyword ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3249:1: (lv_left_14_0= ruleLeftSquareBracketKeyword )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3249:1: (lv_left_14_0= ruleLeftSquareBracketKeyword )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3250:3: lv_left_14_0= ruleLeftSquareBracketKeyword
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_4_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_ruleExpression4547);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3272:2: ( ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )* )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( ((LA56_0>=RULE_INT && LA56_0<=RULE_NEGATIVE_INTEGER)||LA56_0==24||LA56_0==26||(LA56_0>=30 && LA56_0<=32)||(LA56_0>=36 && LA56_0<=37)||(LA56_0>=41 && LA56_0<=47)||(LA56_0>=49 && LA56_0<=50)||(LA56_0>=53 && LA56_0<=54)||(LA56_0>=69 && LA56_0<=74)) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3272:3: ( (lv_expr_15_0= ruleExpression ) ) ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )*
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3272:3: ( (lv_expr_15_0= ruleExpression ) )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3273:1: (lv_expr_15_0= ruleExpression )
            	            {
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3273:1: (lv_expr_15_0= ruleExpression )
            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3274:3: lv_expr_15_0= ruleExpression
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleExpression4569);
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

            	            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3296:2: ( ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) ) )*
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==27) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3296:3: ( (lv_comma_16_0= ruleComma ) ) ( (lv_expr_17_0= ruleExpression ) )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3296:3: ( (lv_comma_16_0= ruleComma ) )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3297:1: (lv_comma_16_0= ruleComma )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3297:1: (lv_comma_16_0= ruleComma )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3298:3: lv_comma_16_0= ruleComma
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleComma_in_ruleExpression4591);
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

            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3320:2: ( (lv_expr_17_0= ruleExpression ) )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3321:1: (lv_expr_17_0= ruleExpression )
            	            	    {
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3321:1: (lv_expr_17_0= ruleExpression )
            	            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3322:3: lv_expr_17_0= ruleExpression
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4612);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3344:6: ( (lv_right_18_0= ruleRightSquareBracketKeyword ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3345:1: (lv_right_18_0= ruleRightSquareBracketKeyword )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3345:1: (lv_right_18_0= ruleRightSquareBracketKeyword )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3346:3: lv_right_18_0= ruleRightSquareBracketKeyword
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_ruleExpression4637);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3376:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3377:2: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3378:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTerminalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4676);
            iv_ruleTerminalExpression=ruleTerminalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression4686); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3385:1: ruleTerminalExpression returns [EObject current=null] : ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) ) ;
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
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3390:6: ( ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3391:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3391:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )
            int alt65=15;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt65=1;
                }
                break;
            case 53:
            case 54:
                {
                alt65=2;
                }
                break;
            case 24:
            case 36:
            case 37:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt65=3;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 74:
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
            case 42:
                {
                alt65=7;
                }
                break;
            case 43:
                {
                alt65=8;
                }
                break;
            case 44:
                {
                alt65=9;
                }
                break;
            case 45:
                {
                alt65=10;
                }
                break;
            case 46:
                {
                alt65=11;
                }
                break;
            case 47:
                {
                alt65=12;
                }
                break;
            case RULE_ID:
            case 49:
            case 50:
                {
                alt65=13;
                }
                break;
            case 26:
                {
                switch ( input.LA(2) ) {
                case 13:
                case 51:
                    {
                    alt65=15;
                    }
                    break;
                case 50:
                    {
                    int LA65_16 = input.LA(3);

                    if ( (LA65_16==17||LA65_16==27||LA65_16==87) ) {
                        alt65=15;
                    }
                    else if ( ((LA65_16>=RULE_INT && LA65_16<=RULE_NEGATIVE_INTEGER)||LA65_16==24||LA65_16==26||LA65_16==28||(LA65_16>=30 && LA65_16<=32)||(LA65_16>=34 && LA65_16<=39)||(LA65_16>=41 && LA65_16<=47)||(LA65_16>=49 && LA65_16<=50)||(LA65_16>=52 && LA65_16<=80)||(LA65_16>=88 && LA65_16<=89)) ) {
                        alt65=14;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3391:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 65, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA65_17 = input.LA(3);

                    if ( ((LA65_17>=RULE_INT && LA65_17<=RULE_NEGATIVE_INTEGER)||LA65_17==24||LA65_17==26||LA65_17==28||(LA65_17>=30 && LA65_17<=32)||(LA65_17>=34 && LA65_17<=39)||(LA65_17>=41 && LA65_17<=47)||(LA65_17>=49 && LA65_17<=50)||(LA65_17>=52 && LA65_17<=80)||(LA65_17>=88 && LA65_17<=89)) ) {
                        alt65=14;
                    }
                    else if ( (LA65_17==17||LA65_17==27||LA65_17==87) ) {
                        alt65=15;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3391:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 65, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                case RULE_NEGATIVE_INTEGER:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 36:
                case 37:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 49:
                case 53:
                case 54:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                    {
                    alt65=14;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3391:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 65, 14, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3391:1: ( ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) ) | ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) ) | ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) ) | ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) ) | ( () RULE_INT ) | ( () RULE_NEGATIVE_INTEGER ) | ( () ( (lv_none_27_0= 'none' ) ) ) | ( () ( (lv_iden_29_0= 'iden' ) ) ) | ( () ( (lv_univ_31_0= 'univ' ) ) ) | ( () ( (lv_int_33_0= 'Int' ) ) ) | ( () ( (lv_seq_35_0= 'seq/Int' ) ) ) | ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) ) | ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) ) | ( () ( (lv_block_45_0= ruleBlock ) ) ) | ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) ) )", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3391:2: ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3391:2: ( () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3391:3: () ( (lv_let_1_0= 'let' ) ) ( (lv_letdecl_2_0= ruleLetDecl ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )* ( (lv_blockOrBar_5_0= ruleBlockOrBar ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3391:3: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3392:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3405:2: ( (lv_let_1_0= 'let' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3406:1: (lv_let_1_0= 'let' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3406:1: (lv_let_1_0= 'let' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3407:3: lv_let_1_0= 'let'
                    {
                    lv_let_1_0=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleTerminalExpression4742); if (failed) return current;
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3426:2: ( (lv_letdecl_2_0= ruleLetDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3427:1: (lv_letdecl_2_0= ruleLetDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3427:1: (lv_letdecl_2_0= ruleLetDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3428:3: lv_letdecl_2_0= ruleLetDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpression4776);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3450:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==27) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3450:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_letdecl_4_0= ruleLetDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3450:3: ( (lv_comma_3_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3451:1: (lv_comma_3_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3451:1: (lv_comma_3_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3452:3: lv_comma_3_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_0_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression4798);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3474:2: ( (lv_letdecl_4_0= ruleLetDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3475:1: (lv_letdecl_4_0= ruleLetDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3475:1: (lv_letdecl_4_0= ruleLetDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3476:3: lv_letdecl_4_0= ruleLetDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLetdeclLetDeclParserRuleCall_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpression4819);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3498:4: ( (lv_blockOrBar_5_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3499:1: (lv_blockOrBar_5_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3499:1: (lv_blockOrBar_5_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3500:3: lv_blockOrBar_5_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_0_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression4842);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3523:6: ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3523:6: ( () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3523:7: () ( (lv_quant_7_0= ruleQuant ) ) ( (lv_decl_8_0= ruleDecl ) ) ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )* ( (lv_blockOrBar_11_0= ruleBlockOrBar ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3523:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3524:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3537:2: ( (lv_quant_7_0= ruleQuant ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3538:1: (lv_quant_7_0= ruleQuant )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3538:1: (lv_quant_7_0= ruleQuant )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3539:3: lv_quant_7_0= ruleQuant
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getQuantQuantParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQuant_in_ruleTerminalExpression4883);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3561:2: ( (lv_decl_8_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3562:1: (lv_decl_8_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3562:1: (lv_decl_8_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3563:3: lv_decl_8_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression4904);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3585:2: ( ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==27) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3585:3: ( (lv_comma_9_0= ruleComma ) ) ( (lv_decl_10_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3585:3: ( (lv_comma_9_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3586:1: (lv_comma_9_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3586:1: (lv_comma_9_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3587:3: lv_comma_9_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_1_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression4926);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3609:2: ( (lv_decl_10_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3610:1: (lv_decl_10_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3610:1: (lv_decl_10_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3611:3: lv_decl_10_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression4947);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3633:4: ( (lv_blockOrBar_11_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3634:1: (lv_blockOrBar_11_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3634:1: (lv_blockOrBar_11_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3635:3: lv_blockOrBar_11_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_1_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression4970);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3658:6: ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3658:6: ( () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3658:7: () ( (lv_unOp_13_0= ruleUnOp ) ) ( (lv_expr_14_0= ruleExpression ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3658:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3659:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3672:2: ( (lv_unOp_13_0= ruleUnOp ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3673:1: (lv_unOp_13_0= ruleUnOp )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3673:1: (lv_unOp_13_0= ruleUnOp )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3674:3: lv_unOp_13_0= ruleUnOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getUnOpUnOpParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnOp_in_ruleTerminalExpression5011);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3696:2: ( (lv_expr_14_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3697:1: (lv_expr_14_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3697:1: (lv_expr_14_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3698:3: lv_expr_14_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5032);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3721:6: ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3721:6: ( () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3721:7: () ( (lv_common_16_0= ruleCommonQuantUnOp ) ) ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3721:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3722:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3735:2: ( (lv_common_16_0= ruleCommonQuantUnOp ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3736:1: (lv_common_16_0= ruleCommonQuantUnOp )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3736:1: (lv_common_16_0= ruleCommonQuantUnOp )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3737:3: lv_common_16_0= ruleCommonQuantUnOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommonCommonQuantUnOpParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommonQuantUnOp_in_ruleTerminalExpression5073);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )
                    int alt61=2;
                    switch ( input.LA(1) ) {
                    case 13:
                    case 51:
                        {
                        alt61=1;
                        }
                        break;
                    case 50:
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
                                new NoViableAltException("3759:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 61, 3, input);

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
                                new NoViableAltException("3759:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 61, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                    case RULE_NEGATIVE_INTEGER:
                    case 24:
                    case 26:
                    case 30:
                    case 31:
                    case 32:
                    case 36:
                    case 37:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 49:
                    case 53:
                    case 54:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        {
                        alt61=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3759:2: ( ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) ) | ( (lv_expr_21_0= ruleExpression ) ) )", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:3: ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:3: ( ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:4: ( (lv_decl_17_0= ruleDecl ) ) ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )* ( (lv_blockOrBar_20_0= ruleBlockOrBar ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:4: ( (lv_decl_17_0= ruleDecl ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3760:1: (lv_decl_17_0= ruleDecl )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3760:1: (lv_decl_17_0= ruleDecl )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3761:3: lv_decl_17_0= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5096);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3783:2: ( ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==27) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3783:3: ( (lv_comma_18_0= ruleComma ) ) ( (lv_decl_19_0= ruleDecl ) )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3783:3: ( (lv_comma_18_0= ruleComma ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3784:1: (lv_comma_18_0= ruleComma )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3784:1: (lv_comma_18_0= ruleComma )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3785:3: lv_comma_18_0= ruleComma
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_3_2_0_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5118);
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

                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3807:2: ( (lv_decl_19_0= ruleDecl ) )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3808:1: (lv_decl_19_0= ruleDecl )
                            	    {
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3808:1: (lv_decl_19_0= ruleDecl )
                            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3809:3: lv_decl_19_0= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5139);
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

                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3831:4: ( (lv_blockOrBar_20_0= ruleBlockOrBar ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3832:1: (lv_blockOrBar_20_0= ruleBlockOrBar )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3832:1: (lv_blockOrBar_20_0= ruleBlockOrBar )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3833:3: lv_blockOrBar_20_0= ruleBlockOrBar
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_3_2_0_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5162);
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3856:6: ( (lv_expr_21_0= ruleExpression ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3856:6: ( (lv_expr_21_0= ruleExpression ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3857:1: (lv_expr_21_0= ruleExpression )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3857:1: (lv_expr_21_0= ruleExpression )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3858:3: lv_expr_21_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_3_2_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5190);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3881:6: ( () RULE_INT )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3881:6: ( () RULE_INT )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3881:7: () RULE_INT
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3881:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3882:2: 
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

                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpression5220); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getINTTerminalRuleCall_4_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3900:6: ( () RULE_NEGATIVE_INTEGER )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3900:6: ( () RULE_NEGATIVE_INTEGER )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3900:7: () RULE_NEGATIVE_INTEGER
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3900:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3901:2: 
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

                    match(input,RULE_NEGATIVE_INTEGER,FOLLOW_RULE_NEGATIVE_INTEGER_in_ruleTerminalExpression5248); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExpressionAccess().getNEGATIVE_INTEGERTerminalRuleCall_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3919:6: ( () ( (lv_none_27_0= 'none' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3919:6: ( () ( (lv_none_27_0= 'none' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3919:7: () ( (lv_none_27_0= 'none' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3919:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3920:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3933:2: ( (lv_none_27_0= 'none' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3934:1: (lv_none_27_0= 'none' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3934:1: (lv_none_27_0= 'none' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3935:3: lv_none_27_0= 'none'
                    {
                    lv_none_27_0=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleTerminalExpression5285); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3955:6: ( () ( (lv_iden_29_0= 'iden' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3955:6: ( () ( (lv_iden_29_0= 'iden' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3955:7: () ( (lv_iden_29_0= 'iden' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3955:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3956:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3969:2: ( (lv_iden_29_0= 'iden' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3970:1: (lv_iden_29_0= 'iden' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3970:1: (lv_iden_29_0= 'iden' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3971:3: lv_iden_29_0= 'iden'
                    {
                    lv_iden_29_0=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleTerminalExpression5336); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3991:6: ( () ( (lv_univ_31_0= 'univ' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3991:6: ( () ( (lv_univ_31_0= 'univ' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3991:7: () ( (lv_univ_31_0= 'univ' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3991:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3992:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4005:2: ( (lv_univ_31_0= 'univ' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4006:1: (lv_univ_31_0= 'univ' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4006:1: (lv_univ_31_0= 'univ' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4007:3: lv_univ_31_0= 'univ'
                    {
                    lv_univ_31_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleTerminalExpression5387); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4027:6: ( () ( (lv_int_33_0= 'Int' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4027:6: ( () ( (lv_int_33_0= 'Int' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4027:7: () ( (lv_int_33_0= 'Int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4027:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4028:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4041:2: ( (lv_int_33_0= 'Int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4042:1: (lv_int_33_0= 'Int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4042:1: (lv_int_33_0= 'Int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4043:3: lv_int_33_0= 'Int'
                    {
                    lv_int_33_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleTerminalExpression5438); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4063:6: ( () ( (lv_seq_35_0= 'seq/Int' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4063:6: ( () ( (lv_seq_35_0= 'seq/Int' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4063:7: () ( (lv_seq_35_0= 'seq/Int' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4063:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4064:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4077:2: ( (lv_seq_35_0= 'seq/Int' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4078:1: (lv_seq_35_0= 'seq/Int' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4078:1: (lv_seq_35_0= 'seq/Int' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4079:3: lv_seq_35_0= 'seq/Int'
                    {
                    lv_seq_35_0=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleTerminalExpression5489); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4099:6: ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4099:6: ( () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4099:7: () ( (lv_parO_37_0= '(' ) ) ( (lv_expr_38_0= ruleExpression ) ) ( (lv_parF_39_0= ')' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4099:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4100:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4113:2: ( (lv_parO_37_0= '(' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4114:1: (lv_parO_37_0= '(' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4114:1: (lv_parO_37_0= '(' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4115:3: lv_parO_37_0= '('
                    {
                    lv_parO_37_0=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleTerminalExpression5540); if (failed) return current;
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4134:2: ( (lv_expr_38_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4135:1: (lv_expr_38_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4135:1: (lv_expr_38_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4136:3: lv_expr_38_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getExprExpressionParserRuleCall_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpression5574);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4158:2: ( (lv_parF_39_0= ')' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4159:1: (lv_parF_39_0= ')' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4159:1: (lv_parF_39_0= ')' )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4160:3: lv_parF_39_0= ')'
                    {
                    lv_parF_39_0=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleTerminalExpression5592); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4180:6: ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4180:6: ( () ( '@' )? ( ( ( RULE_ID ) ) | 'this' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4180:7: () ( '@' )? ( ( ( RULE_ID ) ) | 'this' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4180:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4181:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4194:2: ( '@' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==49) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4194:4: '@'
                            {
                            match(input,49,FOLLOW_49_in_ruleTerminalExpression5636); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExpressionAccess().getCommercialAtKeyword_12_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4198:3: ( ( ( RULE_ID ) ) | 'this' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_ID) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==50) ) {
                        alt63=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4198:3: ( ( ( RULE_ID ) ) | 'this' )", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4198:4: ( ( RULE_ID ) )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4198:4: ( ( RULE_ID ) )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4199:1: ( RULE_ID )
                            {
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4199:1: ( RULE_ID )
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4200:3: RULE_ID
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
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpression5661); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getTerminalExpressionAccess().getNameRefReferencesNameCrossReference_12_2_0_0(), "nameRef"); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4216:7: 'this'
                            {
                            match(input,50,FOLLOW_50_in_ruleTerminalExpression5677); if (failed) return current;
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4221:6: ( () ( (lv_block_45_0= ruleBlock ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4221:6: ( () ( (lv_block_45_0= ruleBlock ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4221:7: () ( (lv_block_45_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4221:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4222:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4235:2: ( (lv_block_45_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4236:1: (lv_block_45_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4236:1: (lv_block_45_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4237:3: lv_block_45_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockBlockParserRuleCall_13_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleTerminalExpression5719);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4260:6: ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4260:6: ( () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4260:7: () ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) ) ( (lv_decl_48_0= ruleDecl ) ) ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )* ( (lv_blockOrBar_51_0= ruleBlockOrBar ) ) ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4260:7: ()
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4261:2: 
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4274:2: ( (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4275:1: (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4275:1: (lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4276:3: lv_leftCurlyBracket_47_0= ruleLeftCurlyBracket
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getLeftCurlyBracketLeftCurlyBracketParserRuleCall_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleTerminalExpression5760);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4298:2: ( (lv_decl_48_0= ruleDecl ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4299:1: (lv_decl_48_0= ruleDecl )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4299:1: (lv_decl_48_0= ruleDecl )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4300:3: lv_decl_48_0= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_14_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5781);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4322:2: ( ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==27) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4322:3: ( (lv_comma_49_0= ruleComma ) ) ( (lv_decl_50_0= ruleDecl ) )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4322:3: ( (lv_comma_49_0= ruleComma ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4323:1: (lv_comma_49_0= ruleComma )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4323:1: (lv_comma_49_0= ruleComma )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4324:3: lv_comma_49_0= ruleComma
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_14_3_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComma_in_ruleTerminalExpression5803);
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

                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4346:2: ( (lv_decl_50_0= ruleDecl ) )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4347:1: (lv_decl_50_0= ruleDecl )
                    	    {
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4347:1: (lv_decl_50_0= ruleDecl )
                    	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4348:3: lv_decl_50_0= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_14_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpression5824);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4370:4: ( (lv_blockOrBar_51_0= ruleBlockOrBar ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4371:1: (lv_blockOrBar_51_0= ruleBlockOrBar )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4371:1: (lv_blockOrBar_51_0= ruleBlockOrBar )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4372:3: lv_blockOrBar_51_0= ruleBlockOrBar
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_14_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5847);
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

                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4394:2: ( (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4395:1: (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4395:1: (lv_rightCurlyBracket_52_0= ruleRightCurlyBracket )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4396:3: lv_rightCurlyBracket_52_0= ruleRightCurlyBracket
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getRightCurlyBracketRightCurlyBracketParserRuleCall_14_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleTerminalExpression5868);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4426:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4427:2: (iv_ruleDecl= ruleDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4428:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl5905);
            iv_ruleDecl=ruleDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl5915); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4435:1: ruleDecl returns [EObject current=null] : ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyName_2_0 = null;

        EObject lv_comma_3_0 = null;

        EObject lv_propertyName_4_0 = null;

        EObject lv_colon_5_0 = null;

        EObject lv_expr_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4440:6: ( ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:1: ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:1: ( ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:2: ( 'private' )? ( 'disj' )? ( (lv_propertyName_2_0= rulePropertyName ) ) ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )* ( (lv_colon_5_0= ruleColon ) ) ( 'disj' )? ( (lv_expr_7_0= ruleExpression ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:2: ( 'private' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==13) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4441:4: 'private'
                    {
                    match(input,13,FOLLOW_13_in_ruleDecl5951); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4445:3: ( 'disj' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==51) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4445:5: 'disj'
                    {
                    match(input,51,FOLLOW_51_in_ruleDecl5964); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4449:3: ( (lv_propertyName_2_0= rulePropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4450:1: (lv_propertyName_2_0= rulePropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4450:1: (lv_propertyName_2_0= rulePropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4451:3: lv_propertyName_2_0= rulePropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleDecl5987);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4473:2: ( ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==27) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4473:3: ( (lv_comma_3_0= ruleComma ) ) ( (lv_propertyName_4_0= rulePropertyName ) )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4473:3: ( (lv_comma_3_0= ruleComma ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4474:1: (lv_comma_3_0= ruleComma )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4474:1: (lv_comma_3_0= ruleComma )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4475:3: lv_comma_3_0= ruleComma
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getCommaCommaParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComma_in_ruleDecl6009);
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

            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4497:2: ( (lv_propertyName_4_0= rulePropertyName ) )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4498:1: (lv_propertyName_4_0= rulePropertyName )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4498:1: (lv_propertyName_4_0= rulePropertyName )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4499:3: lv_propertyName_4_0= rulePropertyName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getPropertyNamePropertyNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyName_in_ruleDecl6030);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4521:4: ( (lv_colon_5_0= ruleColon ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4522:1: (lv_colon_5_0= ruleColon )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4522:1: (lv_colon_5_0= ruleColon )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4523:3: lv_colon_5_0= ruleColon
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getColonColonParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleColon_in_ruleDecl6053);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4545:2: ( 'disj' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==51) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4545:4: 'disj'
                    {
                    match(input,51,FOLLOW_51_in_ruleDecl6064); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_5(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4549:3: ( (lv_expr_7_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4550:1: (lv_expr_7_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4550:1: (lv_expr_7_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4551:3: lv_expr_7_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDecl6087);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4581:1: entryRuleLetDecl returns [EObject current=null] : iv_ruleLetDecl= ruleLetDecl EOF ;
    public final EObject entryRuleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDecl = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4582:2: (iv_ruleLetDecl= ruleLetDecl EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4583:2: iv_ruleLetDecl= ruleLetDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetDecl_in_entryRuleLetDecl6123);
            iv_ruleLetDecl=ruleLetDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDecl6133); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4590:1: ruleLetDecl returns [EObject current=null] : ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) ) ;
    public final EObject ruleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_nameExpression_0_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4595:6: ( ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4596:1: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4596:1: ( ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4596:2: ( (lv_nameExpression_0_0= rulePropertyName ) ) '=' ( (lv_expr_2_0= ruleExpression ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4596:2: ( (lv_nameExpression_0_0= rulePropertyName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4597:1: (lv_nameExpression_0_0= rulePropertyName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4597:1: (lv_nameExpression_0_0= rulePropertyName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4598:3: lv_nameExpression_0_0= rulePropertyName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getNameExpressionPropertyNameParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyName_in_ruleLetDecl6179);
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

            match(input,52,FOLLOW_52_in_ruleLetDecl6189); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetDeclAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4624:1: ( (lv_expr_2_0= ruleExpression ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4625:1: (lv_expr_2_0= ruleExpression )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4625:1: (lv_expr_2_0= ruleExpression )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4626:3: lv_expr_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getExprExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetDecl6210);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4656:1: entryRuleQuant returns [String current=null] : iv_ruleQuant= ruleQuant EOF ;
    public final String entryRuleQuant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuant = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4657:2: (iv_ruleQuant= ruleQuant EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4658:2: iv_ruleQuant= ruleQuant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQuantRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQuant_in_entryRuleQuant6247);
            iv_ruleQuant=ruleQuant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQuant.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuant6258); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4665:1: ruleQuant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'all' | kw= 'sum' ) ;
    public final AntlrDatatypeRuleToken ruleQuant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4670:6: ( (kw= 'all' | kw= 'sum' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4671:1: (kw= 'all' | kw= 'sum' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4671:1: (kw= 'all' | kw= 'sum' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==53) ) {
                alt70=1;
            }
            else if ( (LA70_0==54) ) {
                alt70=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4671:1: (kw= 'all' | kw= 'sum' )", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4672:2: kw= 'all'
                    {
                    kw=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleQuant6296); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getQuantAccess().getAllKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4679:2: kw= 'sum'
                    {
                    kw=(Token)input.LT(1);
                    match(input,54,FOLLOW_54_in_ruleQuant6315); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4692:1: entryRuleBinOp returns [EObject current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final EObject entryRuleBinOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4693:2: (iv_ruleBinOp= ruleBinOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4694:2: iv_ruleBinOp= ruleBinOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBinOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBinOp_in_entryRuleBinOp6355);
            iv_ruleBinOp=ruleBinOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBinOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinOp6365); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4701:1: ruleBinOp returns [EObject current=null] : ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) ) ;
    public final EObject ruleBinOp() throws RecognitionException {
        EObject current = null;

        EObject lv_dot_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4706:6: ( ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4707:1: ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4707:1: ( () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4707:2: () ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4707:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4708:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4721:2: ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )
            int alt71=16;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt71=1;
                }
                break;
            case 56:
                {
                alt71=2;
                }
                break;
            case 57:
                {
                alt71=3;
                }
                break;
            case 58:
                {
                alt71=4;
                }
                break;
            case 59:
                {
                alt71=5;
                }
                break;
            case 60:
                {
                alt71=6;
                }
                break;
            case 61:
                {
                alt71=7;
                }
                break;
            case 35:
                {
                alt71=8;
                }
                break;
            case 62:
                {
                alt71=9;
                }
                break;
            case 63:
                {
                alt71=10;
                }
                break;
            case 64:
                {
                alt71=11;
                }
                break;
            case 65:
                {
                alt71=12;
                }
                break;
            case 88:
                {
                alt71=13;
                }
                break;
            case 66:
                {
                alt71=14;
                }
                break;
            case 67:
                {
                alt71=15;
                }
                break;
            case 68:
                {
                alt71=16;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4721:2: ( '||' | 'or' | '&&' | 'and' | '&' | '<=>' | 'iff' | '+' | '-' | '++' | '<:' | ':>' | ( (lv_dot_13_0= ruleDot ) ) | '<<' | '>>' | '>>>' )", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4721:4: '||'
                    {
                    match(input,55,FOLLOW_55_in_ruleBinOp6413); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4726:7: 'or'
                    {
                    match(input,56,FOLLOW_56_in_ruleBinOp6429); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getOrKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4731:7: '&&'
                    {
                    match(input,57,FOLLOW_57_in_ruleBinOp6445); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAmpersandAmpersandKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4736:7: 'and'
                    {
                    match(input,58,FOLLOW_58_in_ruleBinOp6461); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAndKeyword_1_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4741:7: '&'
                    {
                    match(input,59,FOLLOW_59_in_ruleBinOp6477); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getAmpersandKeyword_1_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4746:7: '<=>'
                    {
                    match(input,60,FOLLOW_60_in_ruleBinOp6493); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4751:7: 'iff'
                    {
                    match(input,61,FOLLOW_61_in_ruleBinOp6509); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getIffKeyword_1_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4756:7: '+'
                    {
                    match(input,35,FOLLOW_35_in_ruleBinOp6525); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getPlusSignKeyword_1_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4761:7: '-'
                    {
                    match(input,62,FOLLOW_62_in_ruleBinOp6541); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getHyphenMinusKeyword_1_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4766:7: '++'
                    {
                    match(input,63,FOLLOW_63_in_ruleBinOp6557); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getPlusSignPlusSignKeyword_1_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4771:7: '<:'
                    {
                    match(input,64,FOLLOW_64_in_ruleBinOp6573); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignColonKeyword_1_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4776:7: ':>'
                    {
                    match(input,65,FOLLOW_65_in_ruleBinOp6589); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getColonGreaterThanSignKeyword_1_11(), null); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4781:6: ( (lv_dot_13_0= ruleDot ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4781:6: ( (lv_dot_13_0= ruleDot ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4782:1: (lv_dot_13_0= ruleDot )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4782:1: (lv_dot_13_0= ruleDot )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4783:3: lv_dot_13_0= ruleDot
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBinOpAccess().getDotDotParserRuleCall_1_12_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDot_in_ruleBinOp6616);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4806:7: '<<'
                    {
                    match(input,66,FOLLOW_66_in_ruleBinOp6632); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getLessThanSignLessThanSignKeyword_1_13(), null); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4811:7: '>>'
                    {
                    match(input,67,FOLLOW_67_in_ruleBinOp6648); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBinOpAccess().getGreaterThanSignGreaterThanSignKeyword_1_14(), null); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4816:7: '>>>'
                    {
                    match(input,68,FOLLOW_68_in_ruleBinOp6664); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4828:1: entryRuleUnOp returns [EObject current=null] : iv_ruleUnOp= ruleUnOp EOF ;
    public final EObject entryRuleUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4829:2: (iv_ruleUnOp= ruleUnOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4830:2: iv_ruleUnOp= ruleUnOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnOp_in_entryRuleUnOp6701);
            iv_ruleUnOp=ruleUnOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOp6711); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4837:1: ruleUnOp returns [EObject current=null] : ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) ) ;
    public final EObject ruleUnOp() throws RecognitionException {
        EObject current = null;

        Token lv_op_4_1=null;
        Token lv_op_4_2=null;
        Token lv_op_4_3=null;
        Token lv_op_4_4=null;
        Token lv_op_4_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4842:6: ( ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4843:1: ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4843:1: ( () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4843:2: () ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4843:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4844:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4857:2: ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt73=1;
                }
                break;
            case 69:
                {
                alt73=2;
                }
                break;
            case 24:
                {
                alt73=3;
                }
                break;
            case 36:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt73=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4857:2: ( 'not' | 'set' | 'seq' | ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) ) )", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4857:4: 'not'
                    {
                    match(input,37,FOLLOW_37_in_ruleUnOp6759); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getNotKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4862:7: 'set'
                    {
                    match(input,69,FOLLOW_69_in_ruleUnOp6775); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getSetKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4867:7: 'seq'
                    {
                    match(input,24,FOLLOW_24_in_ruleUnOp6791); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnOpAccess().getSeqKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4872:6: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4872:6: ( ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4873:1: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4873:1: ( (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4874:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4874:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )
                    int alt72=5;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt72=1;
                        }
                        break;
                    case 70:
                        {
                        alt72=2;
                        }
                        break;
                    case 71:
                        {
                        alt72=3;
                        }
                        break;
                    case 72:
                        {
                        alt72=4;
                        }
                        break;
                    case 73:
                        {
                        alt72=5;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4874:1: (lv_op_4_1= '!' | lv_op_4_2= '#' | lv_op_4_3= '~' | lv_op_4_4= '*' | lv_op_4_5= '^' )", 72, 0, input);

                        throw nvae;
                    }

                    switch (alt72) {
                        case 1 :
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4875:3: lv_op_4_1= '!'
                            {
                            lv_op_4_1=(Token)input.LT(1);
                            match(input,36,FOLLOW_36_in_ruleUnOp6817); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4893:8: lv_op_4_2= '#'
                            {
                            lv_op_4_2=(Token)input.LT(1);
                            match(input,70,FOLLOW_70_in_ruleUnOp6846); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4911:8: lv_op_4_3= '~'
                            {
                            lv_op_4_3=(Token)input.LT(1);
                            match(input,71,FOLLOW_71_in_ruleUnOp6875); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4929:8: lv_op_4_4= '*'
                            {
                            lv_op_4_4=(Token)input.LT(1);
                            match(input,72,FOLLOW_72_in_ruleUnOp6904); if (failed) return current;
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
                            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4947:8: lv_op_4_5= '^'
                            {
                            lv_op_4_5=(Token)input.LT(1);
                            match(input,73,FOLLOW_73_in_ruleUnOp6933); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4976:1: entryRuleCommonQuantUnOp returns [EObject current=null] : iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF ;
    public final EObject entryRuleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonQuantUnOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4977:2: (iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4978:2: iv_ruleCommonQuantUnOp= ruleCommonQuantUnOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommonQuantUnOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommonQuantUnOp_in_entryRuleCommonQuantUnOp6986);
            iv_ruleCommonQuantUnOp=ruleCommonQuantUnOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommonQuantUnOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonQuantUnOp6996); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4985:1: ruleCommonQuantUnOp returns [EObject current=null] : ( () ( 'no' | 'some' | 'lone' | 'one' ) ) ;
    public final EObject ruleCommonQuantUnOp() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4990:6: ( ( () ( 'no' | 'some' | 'lone' | 'one' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4991:1: ( () ( 'no' | 'some' | 'lone' | 'one' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4991:1: ( () ( 'no' | 'some' | 'lone' | 'one' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4991:2: () ( 'no' | 'some' | 'lone' | 'one' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4991:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:4992:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5005:2: ( 'no' | 'some' | 'lone' | 'one' )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt74=1;
                }
                break;
            case 32:
                {
                alt74=2;
                }
                break;
            case 30:
                {
                alt74=3;
                }
                break;
            case 31:
                {
                alt74=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5005:2: ( 'no' | 'some' | 'lone' | 'one' )", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5005:4: 'no'
                    {
                    match(input,74,FOLLOW_74_in_ruleCommonQuantUnOp7044); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getNoKeyword_1_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5010:7: 'some'
                    {
                    match(input,32,FOLLOW_32_in_ruleCommonQuantUnOp7060); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getSomeKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5015:7: 'lone'
                    {
                    match(input,30,FOLLOW_30_in_ruleCommonQuantUnOp7076); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommonQuantUnOpAccess().getLoneKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5020:7: 'one'
                    {
                    match(input,31,FOLLOW_31_in_ruleCommonQuantUnOp7092); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5032:1: entryRuleCompareOp returns [String current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final String entryRuleCompareOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5033:2: (iv_ruleCompareOp= ruleCompareOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5034:2: iv_ruleCompareOp= ruleCompareOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOp_in_entryRuleCompareOp7130);
            iv_ruleCompareOp=ruleCompareOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOp7141); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5041:1: ruleCompareOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleCompareOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5046:6: ( (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5047:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5047:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )
            int alt75=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt75=1;
                }
                break;
            case 34:
                {
                alt75=2;
                }
                break;
            case 75:
                {
                alt75=3;
                }
                break;
            case 76:
                {
                alt75=4;
                }
                break;
            case 77:
                {
                alt75=5;
                }
                break;
            case 78:
                {
                alt75=6;
                }
                break;
            case 79:
                {
                alt75=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5047:1: (kw= '=' | kw= 'in' | kw= '<' | kw= '>' | kw= '=<' | kw= '<=' | kw= '>=' )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5048:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleCompareOp7179); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getEqualsSignKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5055:2: kw= 'in'
                    {
                    kw=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleCompareOp7198); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getInKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5062:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_ruleCompareOp7217); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getLessThanSignKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5069:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_ruleCompareOp7236); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getGreaterThanSignKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5076:2: kw= '=<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleCompareOp7255); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getEqualsSignLessThanSignKeyword_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5083:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleCompareOp7274); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getCompareOpAccess().getLessThanSignEqualsSignKeyword_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5090:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleCompareOp7293); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5103:1: entryRuleArrowOp returns [EObject current=null] : iv_ruleArrowOp= ruleArrowOp EOF ;
    public final EObject entryRuleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOp = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5104:2: (iv_ruleArrowOp= ruleArrowOp EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5105:2: iv_ruleArrowOp= ruleArrowOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrowOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArrowOp_in_entryRuleArrowOp7333);
            iv_ruleArrowOp=ruleArrowOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrowOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowOp7343); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5112:1: ruleArrowOp returns [EObject current=null] : ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) ) ;
    public final EObject ruleArrowOp() throws RecognitionException {
        EObject current = null;

        Token lv_arrow_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5117:6: ( ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5118:1: ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5118:1: ( ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5118:2: ( 'some' | 'one' | 'lone' | 'set' )? ( (lv_arrow_4_0= '->' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5118:2: ( 'some' | 'one' | 'lone' | 'set' )?
            int alt76=5;
            switch ( input.LA(1) ) {
                case 32:
                    {
                    alt76=1;
                    }
                    break;
                case 31:
                    {
                    alt76=2;
                    }
                    break;
                case 30:
                    {
                    alt76=3;
                    }
                    break;
                case 69:
                    {
                    alt76=4;
                    }
                    break;
            }

            switch (alt76) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5118:4: 'some'
                    {
                    match(input,32,FOLLOW_32_in_ruleArrowOp7379); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSomeKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5123:7: 'one'
                    {
                    match(input,31,FOLLOW_31_in_ruleArrowOp7395); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getOneKeyword_0_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5128:7: 'lone'
                    {
                    match(input,30,FOLLOW_30_in_ruleArrowOp7411); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getLoneKeyword_0_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5133:7: 'set'
                    {
                    match(input,69,FOLLOW_69_in_ruleArrowOp7427); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSetKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5137:3: ( (lv_arrow_4_0= '->' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5138:1: (lv_arrow_4_0= '->' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5138:1: (lv_arrow_4_0= '->' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5139:3: lv_arrow_4_0= '->'
            {
            lv_arrow_4_0=(Token)input.LT(1);
            match(input,80,FOLLOW_80_in_ruleArrowOp7447); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5166:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5167:2: (iv_ruleBlock= ruleBlock EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5168:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock7496);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock7506); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5175:1: ruleBlock returns [EObject current=null] : ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_leftC_0_0 = null;

        EObject lv_expr_1_0 = null;

        EObject lv_rightC_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5180:6: ( ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5181:1: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5181:1: ( ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5181:2: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) ) ( (lv_expr_1_0= ruleExpression ) )* ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5181:2: ( (lv_leftC_0_0= ruleLeftCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5182:1: (lv_leftC_0_0= ruleLeftCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5182:1: (lv_leftC_0_0= ruleLeftCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5183:3: lv_leftC_0_0= ruleLeftCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getLeftCLeftCurlyBracketParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_ruleBlock7552);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5205:2: ( (lv_expr_1_0= ruleExpression ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=RULE_INT && LA77_0<=RULE_NEGATIVE_INTEGER)||LA77_0==24||LA77_0==26||(LA77_0>=30 && LA77_0<=32)||(LA77_0>=36 && LA77_0<=37)||(LA77_0>=41 && LA77_0<=47)||(LA77_0>=49 && LA77_0<=50)||(LA77_0>=53 && LA77_0<=54)||(LA77_0>=69 && LA77_0<=74)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5206:1: (lv_expr_1_0= ruleExpression )
            	    {
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5206:1: (lv_expr_1_0= ruleExpression )
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5207:3: lv_expr_1_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getExprExpressionParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBlock7573);
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5229:3: ( (lv_rightC_2_0= ruleRightCurlyBracket ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5230:1: (lv_rightC_2_0= ruleRightCurlyBracket )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5230:1: (lv_rightC_2_0= ruleRightCurlyBracket )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5231:3: lv_rightC_2_0= ruleRightCurlyBracket
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getRightCRightCurlyBracketParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_ruleBlock7595);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5261:1: entryRuleBlockOrBar returns [EObject current=null] : iv_ruleBlockOrBar= ruleBlockOrBar EOF ;
    public final EObject entryRuleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockOrBar = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5262:2: (iv_ruleBlockOrBar= ruleBlockOrBar EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5263:2: iv_ruleBlockOrBar= ruleBlockOrBar EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockOrBarRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar7631);
            iv_ruleBlockOrBar=ruleBlockOrBar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockOrBar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockOrBar7641); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5270:1: ruleBlockOrBar returns [EObject current=null] : ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) ;
    public final EObject ruleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;

        EObject lv_expr_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5275:6: ( ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5276:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5276:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==26) ) {
                alt78=1;
            }
            else if ( (LA78_0==81) ) {
                alt78=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5276:1: ( ( (lv_block_0_0= ruleBlock ) ) | ( '|' ( (lv_expr_2_0= ruleExpression ) ) ) )", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5276:2: ( (lv_block_0_0= ruleBlock ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5276:2: ( (lv_block_0_0= ruleBlock ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5277:1: (lv_block_0_0= ruleBlock )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5277:1: (lv_block_0_0= ruleBlock )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5278:3: lv_block_0_0= ruleBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getBlockBlockParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleBlockOrBar7687);
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
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5301:6: ( '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5301:6: ( '|' ( (lv_expr_2_0= ruleExpression ) ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5301:8: '|' ( (lv_expr_2_0= ruleExpression ) )
                    {
                    match(input,81,FOLLOW_81_in_ruleBlockOrBar7704); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockOrBarAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5305:1: ( (lv_expr_2_0= ruleExpression ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5306:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5306:1: (lv_expr_2_0= ruleExpression )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5307:3: lv_expr_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getExprExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBlockOrBar7725);
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


    // $ANTLR start entryRuleModuleName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5337:1: entryRuleModuleName returns [EObject current=null] : iv_ruleModuleName= ruleModuleName EOF ;
    public final EObject entryRuleModuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5338:2: (iv_ruleModuleName= ruleModuleName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5339:2: iv_ruleModuleName= ruleModuleName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModuleNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModuleName_in_entryRuleModuleName7762);
            iv_ruleModuleName=ruleModuleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModuleName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleName7772); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleName


    // $ANTLR start ruleModuleName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5346:1: ruleModuleName returns [EObject current=null] : ( 'module' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleModuleName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5351:6: ( ( 'module' ( (lv_name_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5352:1: ( 'module' ( (lv_name_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5352:1: ( 'module' ( (lv_name_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5352:3: 'module' ( (lv_name_1_0= ruleName ) )
            {
            match(input,82,FOLLOW_82_in_ruleModuleName7807); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleNameAccess().getModuleKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5356:1: ( (lv_name_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5357:1: (lv_name_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5357:1: (lv_name_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5358:3: lv_name_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModuleNameAccess().getNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleModuleName7828);
            lv_name_1_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModuleNameRule().getType().getClassifier());
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
    // $ANTLR end ruleModuleName


    // $ANTLR start entryRuleOpenName
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5388:1: entryRuleOpenName returns [EObject current=null] : iv_ruleOpenName= ruleOpenName EOF ;
    public final EObject entryRuleOpenName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5389:2: (iv_ruleOpenName= ruleOpenName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5390:2: iv_ruleOpenName= ruleOpenName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOpenNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOpenName_in_entryRuleOpenName7864);
            iv_ruleOpenName=ruleOpenName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOpenName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenName7874); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5397:1: ruleOpenName returns [EObject current=null] : ( 'open' ( (lv_importURI_1_0= ruleName ) ) ) ;
    public final EObject ruleOpenName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importURI_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5402:6: ( ( 'open' ( (lv_importURI_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5403:1: ( 'open' ( (lv_importURI_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5403:1: ( 'open' ( (lv_importURI_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5403:3: 'open' ( (lv_importURI_1_0= ruleName ) )
            {
            match(input,83,FOLLOW_83_in_ruleOpenName7909); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOpenNameAccess().getOpenKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5407:1: ( (lv_importURI_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5408:1: (lv_importURI_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5408:1: (lv_importURI_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5409:3: lv_importURI_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOpenNameAccess().getImportURINameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleOpenName7930);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5439:1: entryRuleFactName returns [EObject current=null] : iv_ruleFactName= ruleFactName EOF ;
    public final EObject entryRuleFactName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5440:2: (iv_ruleFactName= ruleFactName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5441:2: iv_ruleFactName= ruleFactName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactName_in_entryRuleFactName7966);
            iv_ruleFactName=ruleFactName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactName7976); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5448:1: ruleFactName returns [EObject current=null] : ( () 'fact' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleFactName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5453:6: ( ( () 'fact' ( (lv_name_2_0= ruleName ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5454:1: ( () 'fact' ( (lv_name_2_0= ruleName ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5454:1: ( () 'fact' ( (lv_name_2_0= ruleName ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5454:2: () 'fact' ( (lv_name_2_0= ruleName ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5454:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5455:2: 
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

            match(input,84,FOLLOW_84_in_ruleFactName8023); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFactNameAccess().getFactKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5472:1: ( (lv_name_2_0= ruleName ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||LA79_0==50) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5473:1: (lv_name_2_0= ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5473:1: (lv_name_2_0= ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5474:3: lv_name_2_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFactNameAccess().getNameNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleFactName8044);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5504:1: entryRuleAssertionName returns [EObject current=null] : iv_ruleAssertionName= ruleAssertionName EOF ;
    public final EObject entryRuleAssertionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5505:2: (iv_ruleAssertionName= ruleAssertionName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5506:2: iv_ruleAssertionName= ruleAssertionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertionName_in_entryRuleAssertionName8081);
            iv_ruleAssertionName=ruleAssertionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertionName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertionName8091); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5513:1: ruleAssertionName returns [EObject current=null] : ( () 'assert' ( (lv_name_2_0= ruleName ) )? ) ;
    public final EObject ruleAssertionName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5518:6: ( ( () 'assert' ( (lv_name_2_0= ruleName ) )? ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5519:1: ( () 'assert' ( (lv_name_2_0= ruleName ) )? )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5519:1: ( () 'assert' ( (lv_name_2_0= ruleName ) )? )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5519:2: () 'assert' ( (lv_name_2_0= ruleName ) )?
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5519:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5520:2: 
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

            match(input,85,FOLLOW_85_in_ruleAssertionName8138); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssertionNameAccess().getAssertKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5537:1: ( (lv_name_2_0= ruleName ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID||LA80_0==50) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5538:1: (lv_name_2_0= ruleName )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5538:1: (lv_name_2_0= ruleName )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5539:3: lv_name_2_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssertionNameAccess().getNameNameParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleAssertionName8159);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5569:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5570:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5571:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName8196);
            iv_ruleFunctionName=ruleFunctionName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunctionName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName8206); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5578:1: ruleFunctionName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
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
               
              	        currentNode=createCompositeNode(grammarAccess.getFunctionNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleFunctionName8251);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5616:1: entryRulePredicateName returns [EObject current=null] : iv_rulePredicateName= rulePredicateName EOF ;
    public final EObject entryRulePredicateName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5617:2: (iv_rulePredicateName= rulePredicateName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5618:2: iv_rulePredicateName= rulePredicateName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredicateNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredicateName_in_entryRulePredicateName8286);
            iv_rulePredicateName=rulePredicateName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredicateName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateName8296); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5625:1: rulePredicateName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePredicateName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5630:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5631:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5631:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5632:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5632:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5633:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredicateNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePredicateName8341);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5663:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5664:2: (iv_ruleAlias= ruleAlias EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5665:2: iv_ruleAlias= ruleAlias EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAliasRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias8376);
            iv_ruleAlias=ruleAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias8386); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5672:1: ruleAlias returns [EObject current=null] : ( (lv_name_0_0= ruleNameAlias ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5677:6: ( ( (lv_name_0_0= ruleNameAlias ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5678:1: ( (lv_name_0_0= ruleNameAlias ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5678:1: ( (lv_name_0_0= ruleNameAlias ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5679:1: (lv_name_0_0= ruleNameAlias )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5679:1: (lv_name_0_0= ruleNameAlias )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5680:3: lv_name_0_0= ruleNameAlias
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAliasAccess().getNameNameAliasParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNameAlias_in_ruleAlias8431);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5710:1: entryRuleEnumName returns [EObject current=null] : iv_ruleEnumName= ruleEnumName EOF ;
    public final EObject entryRuleEnumName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5711:2: (iv_ruleEnumName= ruleEnumName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5712:2: iv_ruleEnumName= ruleEnumName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumName_in_entryRuleEnumName8466);
            iv_ruleEnumName=ruleEnumName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumName8476); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5719:1: ruleEnumName returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= ruleName ) ) ) ;
    public final EObject ruleEnumName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5724:6: ( ( 'enum' ( (lv_name_1_0= ruleName ) ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5725:1: ( 'enum' ( (lv_name_1_0= ruleName ) ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5725:1: ( 'enum' ( (lv_name_1_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5725:3: 'enum' ( (lv_name_1_0= ruleName ) )
            {
            match(input,86,FOLLOW_86_in_ruleEnumName8511); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumNameAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5729:1: ( (lv_name_1_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5730:1: (lv_name_1_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5730:1: (lv_name_1_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5731:3: lv_name_1_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumNameAccess().getNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumName8532);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5761:1: entryRuleEnumPropertyName returns [EObject current=null] : iv_ruleEnumPropertyName= ruleEnumPropertyName EOF ;
    public final EObject entryRuleEnumPropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumPropertyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5762:2: (iv_ruleEnumPropertyName= ruleEnumPropertyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5763:2: iv_ruleEnumPropertyName= ruleEnumPropertyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumPropertyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumPropertyName_in_entryRuleEnumPropertyName8568);
            iv_ruleEnumPropertyName=ruleEnumPropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumPropertyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumPropertyName8578); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5770:1: ruleEnumPropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleEnumPropertyName() throws RecognitionException {
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
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumPropertyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumPropertyName8623);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5808:1: entryRuleSignatureName returns [EObject current=null] : iv_ruleSignatureName= ruleSignatureName EOF ;
    public final EObject entryRuleSignatureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignatureName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5809:2: (iv_ruleSignatureName= ruleSignatureName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5810:2: iv_ruleSignatureName= ruleSignatureName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignatureNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignatureName_in_entryRuleSignatureName8658);
            iv_ruleSignatureName=ruleSignatureName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignatureName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignatureName8668); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5817:1: ruleSignatureName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleSignatureName() throws RecognitionException {
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
               
              	        currentNode=createCompositeNode(grammarAccess.getSignatureNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleSignatureName8713);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5855:1: entryRulePropertyName returns [EObject current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final EObject entryRulePropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5856:2: (iv_rulePropertyName= rulePropertyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5857:2: iv_rulePropertyName= rulePropertyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName8748);
            iv_rulePropertyName=rulePropertyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePropertyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName8758); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5864:1: rulePropertyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject rulePropertyName() throws RecognitionException {
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
               
              	        currentNode=createCompositeNode(grammarAccess.getPropertyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePropertyName8803);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5902:1: entryRuleExactlyName returns [EObject current=null] : iv_ruleExactlyName= ruleExactlyName EOF ;
    public final EObject entryRuleExactlyName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactlyName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5903:2: (iv_ruleExactlyName= ruleExactlyName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5904:2: iv_ruleExactlyName= ruleExactlyName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExactlyNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExactlyName_in_entryRuleExactlyName8838);
            iv_ruleExactlyName=ruleExactlyName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExactlyName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExactlyName8848); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5911:1: ruleExactlyName returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleExactlyName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5916:6: ( ( (lv_name_0_0= ruleName ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5917:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5917:1: ( (lv_name_0_0= ruleName ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5918:1: (lv_name_0_0= ruleName )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5918:1: (lv_name_0_0= ruleName )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5919:3: lv_name_0_0= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExactlyNameAccess().getNameNameParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleExactlyName8893);
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5949:1: entryRuleNameAlias returns [String current=null] : iv_ruleNameAlias= ruleNameAlias EOF ;
    public final String entryRuleNameAlias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameAlias = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5950:2: (iv_ruleNameAlias= ruleNameAlias EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5951:2: iv_ruleNameAlias= ruleNameAlias EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameAliasRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNameAlias_in_entryRuleNameAlias8929);
            iv_ruleNameAlias=ruleNameAlias();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNameAlias.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameAlias8940); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5958:1: ruleNameAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleNameAlias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5963:6: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5964:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5964:1: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5964:6: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameAlias8980); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getNameAliasAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5971:1: (kw= '/' this_ID_2= RULE_ID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==87) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5972:2: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,87,FOLLOW_87_in_ruleNameAlias8999); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getNameAliasAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameAlias9014); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5992:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5993:2: (iv_ruleName= ruleName EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:5994:2: iv_ruleName= ruleName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName9062);
            iv_ruleName=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName9073); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6001:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6006:6: ( ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6007:1: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6007:1: ( (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )* )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6007:2: (kw= 'this' | this_ID_1= RULE_ID ) (kw= '/' this_ID_3= RULE_ID )*
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6007:2: (kw= 'this' | this_ID_1= RULE_ID )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==50) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_ID) ) {
                alt82=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6007:2: (kw= 'this' | this_ID_1= RULE_ID )", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6008:2: kw= 'this'
                    {
                    kw=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleName9112); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNameAccess().getThisKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6014:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName9133); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNameAccess().getIDTerminalRuleCall_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6021:2: (kw= '/' this_ID_3= RULE_ID )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==87) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6022:2: kw= '/' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,87,FOLLOW_87_in_ruleName9153); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getNameAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_3=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName9168); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6044:1: entryRuleReferencesSig returns [EObject current=null] : iv_ruleReferencesSig= ruleReferencesSig EOF ;
    public final EObject entryRuleReferencesSig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferencesSig = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6045:2: (iv_ruleReferencesSig= ruleReferencesSig EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6046:2: iv_ruleReferencesSig= ruleReferencesSig EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReferencesSigRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReferencesSig_in_entryRuleReferencesSig9217);
            iv_ruleReferencesSig=ruleReferencesSig();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReferencesSig; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferencesSig9227); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6053:1: ruleReferencesSig returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) ;
    public final EObject ruleReferencesSig() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6058:6: ( ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6059:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6059:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6059:2: () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6059:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6060:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6073:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            int alt84=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt84=1;
                }
                break;
            case 44:
                {
                alt84=2;
                }
                break;
            case 45:
                {
                alt84=3;
                }
                break;
            case 46:
                {
                alt84=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6073:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6073:3: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6073:3: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6074:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6074:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6075:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferencesSig9287); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getReferencesSigAccess().getNameRefSignatureNameCrossReference_1_0_0(), "nameRef"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6091:7: 'univ'
                    {
                    match(input,44,FOLLOW_44_in_ruleReferencesSig9303); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getUnivKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6096:7: 'Int'
                    {
                    match(input,45,FOLLOW_45_in_ruleReferencesSig9319); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReferencesSigAccess().getIntKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6101:7: 'seq/Int'
                    {
                    match(input,46,FOLLOW_46_in_ruleReferencesSig9335); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6113:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6114:2: (iv_ruleRef= ruleRef EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6115:2: iv_ruleRef= ruleRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef9372);
            iv_ruleRef=ruleRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef9382); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6122:1: ruleRef returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6127:6: ( ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6128:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6128:1: ( () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6128:2: () ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6128:2: ()
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6129:2: 
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

            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6142:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )
            int alt85=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt85=1;
                }
                break;
            case 44:
                {
                alt85=2;
                }
                break;
            case 45:
                {
                alt85=3;
                }
                break;
            case 46:
                {
                alt85=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("6142:2: ( ( ( RULE_ID ) ) | 'univ' | 'Int' | 'seq/Int' )", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6142:3: ( ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6142:3: ( ( RULE_ID ) )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6143:1: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6143:1: ( RULE_ID )
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6144:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef9442); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRefAccess().getNameRefReferencesNameCrossReference_1_0_0(), "nameRef"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6160:7: 'univ'
                    {
                    match(input,44,FOLLOW_44_in_ruleRef9458); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getUnivKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6165:7: 'Int'
                    {
                    match(input,45,FOLLOW_45_in_ruleRef9474); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getIntKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6170:7: 'seq/Int'
                    {
                    match(input,46,FOLLOW_46_in_ruleRef9490); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6182:1: entryRuleLeftCurlyBracket returns [EObject current=null] : iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF ;
    public final EObject entryRuleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftCurlyBracket = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6183:2: (iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6184:2: iv_ruleLeftCurlyBracket= ruleLeftCurlyBracket EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftCurlyBracketRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftCurlyBracket_in_entryRuleLeftCurlyBracket9527);
            iv_ruleLeftCurlyBracket=ruleLeftCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftCurlyBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftCurlyBracket9537); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6191:1: ruleLeftCurlyBracket returns [EObject current=null] : ( (lv_leftCurlyBracket_0_0= '{' ) ) ;
    public final EObject ruleLeftCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_leftCurlyBracket_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6196:6: ( ( (lv_leftCurlyBracket_0_0= '{' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6197:1: ( (lv_leftCurlyBracket_0_0= '{' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6197:1: ( (lv_leftCurlyBracket_0_0= '{' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6198:1: (lv_leftCurlyBracket_0_0= '{' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6198:1: (lv_leftCurlyBracket_0_0= '{' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6199:3: lv_leftCurlyBracket_0_0= '{'
            {
            lv_leftCurlyBracket_0_0=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_ruleLeftCurlyBracket9579); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6226:1: entryRuleRightCurlyBracket returns [EObject current=null] : iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF ;
    public final EObject entryRuleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightCurlyBracket = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6227:2: (iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6228:2: iv_ruleRightCurlyBracket= ruleRightCurlyBracket EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightCurlyBracketRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightCurlyBracket_in_entryRuleRightCurlyBracket9627);
            iv_ruleRightCurlyBracket=ruleRightCurlyBracket();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightCurlyBracket; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightCurlyBracket9637); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6235:1: ruleRightCurlyBracket returns [EObject current=null] : ( (lv_rightCurlyBracket_0_0= '}' ) ) ;
    public final EObject ruleRightCurlyBracket() throws RecognitionException {
        EObject current = null;

        Token lv_rightCurlyBracket_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6240:6: ( ( (lv_rightCurlyBracket_0_0= '}' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6241:1: ( (lv_rightCurlyBracket_0_0= '}' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6241:1: ( (lv_rightCurlyBracket_0_0= '}' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6242:1: (lv_rightCurlyBracket_0_0= '}' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6242:1: (lv_rightCurlyBracket_0_0= '}' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6243:3: lv_rightCurlyBracket_0_0= '}'
            {
            lv_rightCurlyBracket_0_0=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_ruleRightCurlyBracket9679); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6270:1: entryRuleDot returns [EObject current=null] : iv_ruleDot= ruleDot EOF ;
    public final EObject entryRuleDot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDot = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6271:2: (iv_ruleDot= ruleDot EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6272:2: iv_ruleDot= ruleDot EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDotRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDot_in_entryRuleDot9727);
            iv_ruleDot=ruleDot();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDot9737); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6279:1: ruleDot returns [EObject current=null] : ( (lv_dot_0_0= '.' ) ) ;
    public final EObject ruleDot() throws RecognitionException {
        EObject current = null;

        Token lv_dot_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6284:6: ( ( (lv_dot_0_0= '.' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6285:1: ( (lv_dot_0_0= '.' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6285:1: ( (lv_dot_0_0= '.' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6286:1: (lv_dot_0_0= '.' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6286:1: (lv_dot_0_0= '.' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6287:3: lv_dot_0_0= '.'
            {
            lv_dot_0_0=(Token)input.LT(1);
            match(input,88,FOLLOW_88_in_ruleDot9779); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6314:1: entryRuleComma returns [EObject current=null] : iv_ruleComma= ruleComma EOF ;
    public final EObject entryRuleComma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComma = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6315:2: (iv_ruleComma= ruleComma EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6316:2: iv_ruleComma= ruleComma EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommaRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleComma_in_entryRuleComma9827);
            iv_ruleComma=ruleComma();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleComma; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComma9837); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6323:1: ruleComma returns [EObject current=null] : ( (lv_comma_0_0= ',' ) ) ;
    public final EObject ruleComma() throws RecognitionException {
        EObject current = null;

        Token lv_comma_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6328:6: ( ( (lv_comma_0_0= ',' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6329:1: ( (lv_comma_0_0= ',' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6329:1: ( (lv_comma_0_0= ',' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6330:1: (lv_comma_0_0= ',' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6330:1: (lv_comma_0_0= ',' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6331:3: lv_comma_0_0= ','
            {
            lv_comma_0_0=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleComma9879); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6358:1: entryRuleColon returns [EObject current=null] : iv_ruleColon= ruleColon EOF ;
    public final EObject entryRuleColon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColon = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6359:2: (iv_ruleColon= ruleColon EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6360:2: iv_ruleColon= ruleColon EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getColonRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleColon_in_entryRuleColon9927);
            iv_ruleColon=ruleColon();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleColon; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColon9937); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6367:1: ruleColon returns [EObject current=null] : ( (lv_colon_0_0= ':' ) ) ;
    public final EObject ruleColon() throws RecognitionException {
        EObject current = null;

        Token lv_colon_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6372:6: ( ( (lv_colon_0_0= ':' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6373:1: ( (lv_colon_0_0= ':' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6373:1: ( (lv_colon_0_0= ':' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6374:1: (lv_colon_0_0= ':' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6374:1: (lv_colon_0_0= ':' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6375:3: lv_colon_0_0= ':'
            {
            lv_colon_0_0=(Token)input.LT(1);
            match(input,17,FOLLOW_17_in_ruleColon9979); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6402:1: entryRuleLeftParenthesis returns [EObject current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final EObject entryRuleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftParenthesis = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6403:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6404:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftParenthesisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis10027);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftParenthesis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis10037); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6411:1: ruleLeftParenthesis returns [EObject current=null] : ( (lv_leftParenthesis_0_0= '(' ) ) ;
    public final EObject ruleLeftParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_leftParenthesis_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6416:6: ( ( (lv_leftParenthesis_0_0= '(' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6417:1: ( (lv_leftParenthesis_0_0= '(' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6417:1: ( (lv_leftParenthesis_0_0= '(' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6418:1: (lv_leftParenthesis_0_0= '(' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6418:1: (lv_leftParenthesis_0_0= '(' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6419:3: lv_leftParenthesis_0_0= '('
            {
            lv_leftParenthesis_0_0=(Token)input.LT(1);
            match(input,47,FOLLOW_47_in_ruleLeftParenthesis10079); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6446:1: entryRuleRightParenthesis returns [EObject current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final EObject entryRuleRightParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightParenthesis = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6447:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6448:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightParenthesisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis10127);
            iv_ruleRightParenthesis=ruleRightParenthesis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightParenthesis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis10137); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6455:1: ruleRightParenthesis returns [EObject current=null] : ( (lv_rightParenthesis_0_0= ')' ) ) ;
    public final EObject ruleRightParenthesis() throws RecognitionException {
        EObject current = null;

        Token lv_rightParenthesis_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6460:6: ( ( (lv_rightParenthesis_0_0= ')' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6461:1: ( (lv_rightParenthesis_0_0= ')' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6461:1: ( (lv_rightParenthesis_0_0= ')' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6462:1: (lv_rightParenthesis_0_0= ')' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6462:1: (lv_rightParenthesis_0_0= ')' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6463:3: lv_rightParenthesis_0_0= ')'
            {
            lv_rightParenthesis_0_0=(Token)input.LT(1);
            match(input,48,FOLLOW_48_in_ruleRightParenthesis10179); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6490:1: entryRuleLeftSquareBracketKeyword returns [EObject current=null] : iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF ;
    public final EObject entryRuleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftSquareBracketKeyword = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6491:2: (iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6492:2: iv_ruleLeftSquareBracketKeyword= ruleLeftSquareBracketKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLeftSquareBracketKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_entryRuleLeftSquareBracketKeyword10227);
            iv_ruleLeftSquareBracketKeyword=ruleLeftSquareBracketKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLeftSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftSquareBracketKeyword10237); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6499:1: ruleLeftSquareBracketKeyword returns [EObject current=null] : ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) ;
    public final EObject ruleLeftSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_leftSquareBracketKeyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6504:6: ( ( (lv_leftSquareBracketKeyword_0_0= '[' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6505:1: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6505:1: ( (lv_leftSquareBracketKeyword_0_0= '[' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6506:1: (lv_leftSquareBracketKeyword_0_0= '[' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6506:1: (lv_leftSquareBracketKeyword_0_0= '[' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6507:3: lv_leftSquareBracketKeyword_0_0= '['
            {
            lv_leftSquareBracketKeyword_0_0=(Token)input.LT(1);
            match(input,89,FOLLOW_89_in_ruleLeftSquareBracketKeyword10279); if (failed) return current;
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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6534:1: entryRuleRightSquareBracketKeyword returns [EObject current=null] : iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF ;
    public final EObject entryRuleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightSquareBracketKeyword = null;


        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6535:2: (iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6536:2: iv_ruleRightSquareBracketKeyword= ruleRightSquareBracketKeyword EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRightSquareBracketKeywordRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_entryRuleRightSquareBracketKeyword10327);
            iv_ruleRightSquareBracketKeyword=ruleRightSquareBracketKeyword();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRightSquareBracketKeyword; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightSquareBracketKeyword10337); if (failed) return current;

            }

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
    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6543:1: ruleRightSquareBracketKeyword returns [EObject current=null] : ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) ;
    public final EObject ruleRightSquareBracketKeyword() throws RecognitionException {
        EObject current = null;

        Token lv_rightSquareBracketKeyword_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6548:6: ( ( (lv_rightSquareBracketKeyword_0_0= ']' ) ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6549:1: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6549:1: ( (lv_rightSquareBracketKeyword_0_0= ']' ) )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6550:1: (lv_rightSquareBracketKeyword_0_0= ']' )
            {
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6550:1: (lv_rightSquareBracketKeyword_0_0= ']' )
            // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:6551:3: lv_rightSquareBracketKeyword_0_0= ']'
            {
            lv_rightSquareBracketKeyword_0_0=(Token)input.LT(1);
            match(input,90,FOLLOW_90_in_ruleRightSquareBracketKeyword10379); if (failed) return current;
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
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:2: ( ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:2: ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:2: ( ( ( ruleBinOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:3: ( ( ruleBinOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3030:3: ( ( ruleBinOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3031:1: ( ruleBinOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3031:1: ( ruleBinOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3032:3: ruleBinOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBinOpBinOpParserRuleCall_1_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBinOp_in_synpred694277);
        ruleBinOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3054:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3055:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3055:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3056:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred694298);
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
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:6: ( ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:6: ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:6: ( ( ( ruleArrowOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:7: ( ( ruleArrowOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3079:7: ( ( ruleArrowOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3080:1: ( ruleArrowOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3080:1: ( ruleArrowOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3081:3: ruleArrowOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleArrowOp_in_synpred704327);
        ruleArrowOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3103:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3104:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3104:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3105:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred704348);
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
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:6: ( ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:6: ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:6: ( ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:7: ( '!' | 'not' )? ( ( ruleCompareOp ) ) ( ( ruleExpression ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3128:7: ( '!' | 'not' )?
        int alt109=2;
        int LA109_0 = input.LA(1);

        if ( ((LA109_0>=36 && LA109_0<=37)) ) {
            alt109=1;
        }
        switch (alt109) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:
                {
                if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
                    input.consume();
                    errorRecovery=false;failed=false;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    MismatchedSetException mse =
                        new MismatchedSetException(null,input);
                    recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred734365);    throw mse;
                }


                }
                break;

        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3137:3: ( ( ruleCompareOp ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3138:1: ( ruleCompareOp )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3138:1: ( ruleCompareOp )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3139:3: ruleCompareOp
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCmpCompareOpParserRuleCall_1_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareOp_in_synpred734406);
        ruleCompareOp();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3161:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3162:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3162:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3163:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred734427);
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
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3219:4: ( 'else' ( ( ruleExpression ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3219:4: 'else' ( ( ruleExpression ) )
        {
        match(input,40,FOLLOW_40_in_synpred754495); if (failed) return ;
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:1: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3224:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3224:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3225:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred754516);
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
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:6: ( ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:6: ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:6: ( ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )? )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3186:7: ( '=>' | 'implies' ) ( ( ruleExpression ) ) ( 'else' ( ( ruleExpression ) ) )?
        {
        if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred764444);    throw mse;
        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3195:2: ( ( ruleExpression ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3196:1: ( ruleExpression )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3196:1: ( ruleExpression )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3197:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred764484);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3219:2: ( 'else' ( ( ruleExpression ) ) )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( (LA110_0==40) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3219:4: 'else' ( ( ruleExpression ) )
                {
                match(input,40,FOLLOW_40_in_synpred764495); if (failed) return ;
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3223:1: ( ( ruleExpression ) )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3224:1: ( ruleExpression )
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3224:1: ( ruleExpression )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3225:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_3_2_1_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred764516);
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
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:6: ( ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:6: ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:6: ( ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:7: ( ( ruleLeftSquareBracketKeyword ) ) ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )? ( ( ruleRightSquareBracketKeyword ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3248:7: ( ( ruleLeftSquareBracketKeyword ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3249:1: ( ruleLeftSquareBracketKeyword )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3249:1: ( ruleLeftSquareBracketKeyword )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3250:3: ruleLeftSquareBracketKeyword
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLeftLeftSquareBracketKeywordParserRuleCall_1_4_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleLeftSquareBracketKeyword_in_synpred794547);
        ruleLeftSquareBracketKeyword();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3272:2: ( ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )* )?
        int alt113=2;
        int LA113_0 = input.LA(1);

        if ( ((LA113_0>=RULE_INT && LA113_0<=RULE_NEGATIVE_INTEGER)||LA113_0==24||LA113_0==26||(LA113_0>=30 && LA113_0<=32)||(LA113_0>=36 && LA113_0<=37)||(LA113_0>=41 && LA113_0<=47)||(LA113_0>=49 && LA113_0<=50)||(LA113_0>=53 && LA113_0<=54)||(LA113_0>=69 && LA113_0<=74)) ) {
            alt113=1;
        }
        switch (alt113) {
            case 1 :
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3272:3: ( ( ruleExpression ) ) ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )*
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3272:3: ( ( ruleExpression ) )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3273:1: ( ruleExpression )
                {
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3273:1: ( ruleExpression )
                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3274:3: ruleExpression
                {
                if ( backtracking==0 ) {
                   
                  	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_0_0(), currentNode); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred794569);
                ruleExpression();
                _fsp--;
                if (failed) return ;

                }


                }

                // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3296:2: ( ( ( ruleComma ) ) ( ( ruleExpression ) ) )*
                loop112:
                do {
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==27) ) {
                        alt112=1;
                    }


                    switch (alt112) {
                	case 1 :
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3296:3: ( ( ruleComma ) ) ( ( ruleExpression ) )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3296:3: ( ( ruleComma ) )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3297:1: ( ruleComma )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3297:1: ( ruleComma )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3298:3: ruleComma
                	    {
                	    if ( backtracking==0 ) {
                	       
                	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getCommaCommaParserRuleCall_1_4_1_1_0_0(), currentNode); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleComma_in_synpred794591);
                	    ruleComma();
                	    _fsp--;
                	    if (failed) return ;

                	    }


                	    }

                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3320:2: ( ( ruleExpression ) )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3321:1: ( ruleExpression )
                	    {
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3321:1: ( ruleExpression )
                	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3322:3: ruleExpression
                	    {
                	    if ( backtracking==0 ) {
                	       
                	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_4_1_1_1_0(), currentNode); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred794612);
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

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3344:6: ( ( ruleRightSquareBracketKeyword ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3345:1: ( ruleRightSquareBracketKeyword )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3345:1: ( ruleRightSquareBracketKeyword )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3346:3: ruleRightSquareBracketKeyword
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightRightSquareBracketKeywordParserRuleCall_1_4_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRightSquareBracketKeyword_in_synpred794637);
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
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:3: ( ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:3: ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:3: ( ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:4: ( ( ruleDecl ) ) ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )* ( ( ruleBlockOrBar ) )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3759:4: ( ( ruleDecl ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3760:1: ( ruleDecl )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3760:1: ( ruleDecl )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3761:3: ruleDecl
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleDecl_in_synpred865096);
        ruleDecl();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3783:2: ( ( ( ruleComma ) ) ( ( ruleDecl ) ) )*
        loop116:
        do {
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==27) ) {
                alt116=1;
            }


            switch (alt116) {
        	case 1 :
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3783:3: ( ( ruleComma ) ) ( ( ruleDecl ) )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3783:3: ( ( ruleComma ) )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3784:1: ( ruleComma )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3784:1: ( ruleComma )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3785:3: ruleComma
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getCommaCommaParserRuleCall_3_2_0_1_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleComma_in_synpred865118);
        	    ruleComma();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3807:2: ( ( ruleDecl ) )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3808:1: ( ruleDecl )
        	    {
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3808:1: ( ruleDecl )
        	    // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3809:3: ruleDecl
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getDeclDeclParserRuleCall_3_2_0_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleDecl_in_synpred865139);
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

        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3831:4: ( ( ruleBlockOrBar ) )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3832:1: ( ruleBlockOrBar )
        {
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3832:1: ( ruleBlockOrBar )
        // ../fr.univartois.cril.xtext.als/src-gen/fr/univartois/cril/xtext/parser/antlr/internal/InternalAls.g:3833:3: ruleBlockOrBar
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getTerminalExpressionAccess().getBlockOrBarBlockOrBarParserRuleCall_3_2_0_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBlockOrBar_in_synpred865162);
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
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\5\2\uffff\1\15\2\uffff\1\21\4\uffff\1\5\1\22\1\21";
    static final String DFA12_maxS =
        "\1\126\2\uffff\1\40\2\uffff\1\127\4\uffff\1\5\1\23\1\127";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10\3\uffff";
    static final String DFA12_specialS =
        "\16\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\7\uffff\1\3\1\uffff\1\4\1\5\1\uffff\1\7\1\10\5\uffff\1"+
            "\12\3\uffff\4\12\63\uffff\1\1\1\2\1\11",
            "",
            "",
            "\1\12\1\uffff\1\4\1\5\10\uffff\1\12\3\uffff\4\12",
            "",
            "",
            "\1\14\105\uffff\1\13",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\7\1\10",
            "\1\14\105\uffff\1\13"
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
            return "601:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecification91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSpecification137 = new BitSet(new long[]{0x00000001E20DA022L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleOpen_in_ruleSpecification159 = new BitSet(new long[]{0x00000001E20DA022L,0x0000000000780000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleSpecification181 = new BitSet(new long[]{0x00000001E20DA022L,0x0000000000700000L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_ruleModule274 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleModule296 = new BitSet(new long[]{0x0004000000001020L});
    public static final BitSet FOLLOW_12_in_ruleModule314 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleExactlyName_in_ruleModule349 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleModule371 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleModule389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleModule420 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleModule448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpen496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOpen532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpenName_in_ruleOpen555 = new BitSet(new long[]{0x0000000000004002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleOpen577 = new BitSet(new long[]{0x0000700000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen598 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleOpen620 = new BitSet(new long[]{0x0000700000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen641 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleOpen664 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleOpen677 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleExactlyName_in_ruleOpen698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_ruleParagraph796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_ruleParagraph826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_ruleParagraph856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_ruleParagraph886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_ruleParagraph916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_ruleParagraph946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleParagraph976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_ruleParagraph1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_entryRuleFactDecl1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactDecl1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_ruleFactDecl1097 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFactDecl1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertDecl1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionName_in_ruleAssertDecl1210 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAssertDecl1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_entryRuleFunDecl1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunDecl1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFunDecl1313 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunDecl1325 = new BitSet(new long[]{0x0004700000000020L});
    public static final BitSet FOLLOW_ruleRef_in_ruleFunDecl1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_ruleFunDecl1368 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunDecl1391 = new BitSet(new long[]{0x0000800000020000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleFunDecl1414 = new BitSet(new long[]{0x000C000000002020L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1436 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleFunDecl1458 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1479 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleFunDecl1504 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleFunDecl1533 = new BitSet(new long[]{0x000D000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1555 = new BitSet(new long[]{0x0001000008000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleFunDecl1577 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1598 = new BitSet(new long[]{0x0001000008000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleFunDecl1623 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleFunDecl1647 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunDecl1668 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFunDecl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_entryRulePredDecl1725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredDecl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePredDecl1771 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePredDecl1783 = new BitSet(new long[]{0x0004700000000020L});
    public static final BitSet FOLLOW_ruleRef_in_rulePredDecl1805 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleDot_in_rulePredDecl1826 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_rulePredicateName_in_rulePredDecl1849 = new BitSet(new long[]{0x0000800004000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_rulePredDecl1872 = new BitSet(new long[]{0x000C000000002020L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl1894 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_rulePredDecl1916 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl1937 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_rulePredDecl1962 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_rulePredDecl1991 = new BitSet(new long[]{0x000D000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2013 = new BitSet(new long[]{0x0001000008000000L});
    public static final BitSet FOLLOW_ruleComma_in_rulePredDecl2035 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2056 = new BitSet(new long[]{0x0001000008000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_rulePredDecl2081 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePredDecl2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_entryRuleRunDecl2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunDecl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleRunDecl2198 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRunDecl2208 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRunDecl2220 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRunDecl2243 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleRunDecl2270 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleRunDecl2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckDecl2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleCheckDecl2385 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCheckDecl2395 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCheckDecl2407 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckDecl2430 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCheckDecl2457 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleCheckDecl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_entryRuleScope2515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScope2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleScope2573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2582 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleScope2633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2642 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleScope2651 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2672 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleScope2694 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2715 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleScope2769 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2790 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_ruleComma_in_ruleScope2812 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2833 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpectation_in_ruleScope2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpectation_in_entryRuleExpectation2936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpectation2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleExpectation2981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExpectation2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypescope_in_entryRuleTypescope3039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypescope3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTypescope3097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTypescope3108 = new BitSet(new long[]{0x0000000001800020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypescope3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTypescope3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTypescope3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_ruleEnumDecl3257 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleEnumDecl3278 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3299 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleEnumDecl3321 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_ruleEnumDecl3342 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleEnumDecl3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_entryRuleSigDecl3401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigDecl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_ruleSigDecl3462 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSigDecl3473 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleSigDecl3494 = new BitSet(new long[]{0x000000060C000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleSigDecl3516 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleSignatureName_in_ruleSigDecl3537 = new BitSet(new long[]{0x000000060C000000L});
    public static final BitSet FOLLOW_ruleSigExt_in_ruleSigDecl3560 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSigDecl3571 = new BitSet(new long[]{0x000C000010002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl3593 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleSigDecl3612 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl3646 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleSigDecl3660 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSigDecl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_entryRuleSigQual3718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigQual3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSigQual3773 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_30_in_ruleSigQual3802 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_31_in_ruleSigQual3831 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_32_in_ruleSigQual3860 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_13_in_ruleSigQual3889 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_29_in_ruleSigQual3916 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_30_in_ruleSigQual3932 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_31_in_ruleSigQual3948 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_32_in_ruleSigQual3964 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_13_in_ruleSigQual3980 = new BitSet(new long[]{0x00000001E0002002L});
    public static final BitSet FOLLOW_ruleSigExt_in_entryRuleSigExt4018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExt4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSigExt4064 = new BitSet(new long[]{0x0000700000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSigExt4103 = new BitSet(new long[]{0x0000700000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4124 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleSigExt4135 = new BitSet(new long[]{0x0000700000000020L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_ruleSigExt4156 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_ruleExpression4255 = new BitSet(new long[]{0xFF9000FDC0000002L,0x000000000301F83FL});
    public static final BitSet FOLLOW_ruleBinOp_in_ruleExpression4277 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4298 = new BitSet(new long[]{0xFF9000FDC0000002L,0x000000000301F83FL});
    public static final BitSet FOLLOW_ruleArrowOp_in_ruleExpression4327 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4348 = new BitSet(new long[]{0xFF9000FDC0000002L,0x000000000301F83FL});
    public static final BitSet FOLLOW_36_in_ruleExpression4367 = new BitSet(new long[]{0x0010000400000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_37_in_ruleExpression4383 = new BitSet(new long[]{0x0010000400000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleCompareOp_in_ruleExpression4406 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4427 = new BitSet(new long[]{0xFF9000FDC0000002L,0x000000000301F83FL});
    public static final BitSet FOLLOW_38_in_ruleExpression4446 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_39_in_ruleExpression4462 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4484 = new BitSet(new long[]{0xFF9001FDC0000002L,0x000000000301F83FL});
    public static final BitSet FOLLOW_40_in_ruleExpression4495 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4516 = new BitSet(new long[]{0xFF9000FDC0000002L,0x000000000301F83FL});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_ruleExpression4547 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000040007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4569 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleExpression4591 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4612 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_ruleExpression4637 = new BitSet(new long[]{0xFF9000FDC0000002L,0x000000000301F83FL});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression4676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTerminalExpression4742 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpression4776 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression4798 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpression4819 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuant_in_ruleTerminalExpression4883 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression4904 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression4926 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression4947 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOp_in_ruleTerminalExpression5011 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonQuantUnOp_in_ruleTerminalExpression5073 = new BitSet(new long[]{0x006EFE31C5002070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5096 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5118 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5139 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpression5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEGATIVE_INTEGER_in_ruleTerminalExpression5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTerminalExpression5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTerminalExpression5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTerminalExpression5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTerminalExpression5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTerminalExpression5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTerminalExpression5540 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpression5574 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTerminalExpression5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTerminalExpression5636 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpression5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTerminalExpression5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleTerminalExpression5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleTerminalExpression5760 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5781 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleTerminalExpression5803 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpression5824 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpression5847 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleTerminalExpression5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl5905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDecl5951 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_51_in_ruleDecl5964 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleDecl5987 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_ruleComma_in_ruleDecl6009 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleDecl6030 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_ruleColon_in_ruleDecl6053 = new BitSet(new long[]{0x006EFE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_51_in_ruleDecl6064 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDecl6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDecl_in_entryRuleLetDecl6123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDecl6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_ruleLetDecl6179 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleLetDecl6189 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetDecl6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuant_in_entryRuleQuant6247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuant6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleQuant6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleQuant6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_entryRuleBinOp6355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinOp6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBinOp6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBinOp6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBinOp6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBinOp6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBinOp6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBinOp6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBinOp6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBinOp6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBinOp6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleBinOp6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleBinOp6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleBinOp6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_ruleBinOp6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBinOp6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBinOp6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBinOp6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOp_in_entryRuleUnOp6701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOp6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUnOp6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleUnOp6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleUnOp6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUnOp6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleUnOp6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleUnOp6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleUnOp6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUnOp6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonQuantUnOp_in_entryRuleCommonQuantUnOp6986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonQuantUnOp6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCommonQuantUnOp7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCommonQuantUnOp7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCommonQuantUnOp7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCommonQuantUnOp7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOp_in_entryRuleCompareOp7130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOp7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCompareOp7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCompareOp7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCompareOp7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCompareOp7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCompareOp7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleCompareOp7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleCompareOp7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_entryRuleArrowOp7333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowOp7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArrowOp7379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_31_in_ruleArrowOp7395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_30_in_ruleArrowOp7411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_69_in_ruleArrowOp7427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleArrowOp7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock7496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_ruleBlock7552 = new BitSet(new long[]{0x0066FE31D5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlock7573 = new BitSet(new long[]{0x0066FE31D5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_ruleBlock7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar7631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOrBar7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockOrBar7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleBlockOrBar7704 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlockOrBar7725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_entryRuleModuleName7762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleName7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleModuleName7807 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleModuleName7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenName_in_entryRuleOpenName7864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenName7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOpenName7909 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleOpenName7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactName_in_entryRuleFactName7966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactName7976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFactName8023 = new BitSet(new long[]{0x0004000000000022L});
    public static final BitSet FOLLOW_ruleName_in_ruleFactName8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertionName_in_entryRuleAssertionName8081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertionName8091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleAssertionName8138 = new BitSet(new long[]{0x0004000000000022L});
    public static final BitSet FOLLOW_ruleName_in_ruleAssertionName8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName8196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleFunctionName8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateName_in_entryRulePredicateName8286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateName8296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePredicateName8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias8376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameAlias_in_ruleAlias8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumName_in_entryRuleEnumName8466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumName8476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleEnumName8511 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumName8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyName_in_entryRuleEnumPropertyName8568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumPropertyName8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumPropertyName8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignatureName_in_entryRuleSignatureName8658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignatureName8668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleSignatureName8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName8748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyName8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExactlyName_in_entryRuleExactlyName8838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExactlyName8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleExactlyName8893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameAlias_in_entryRuleNameAlias8929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameAlias8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameAlias8980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleNameAlias8999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameAlias9014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName9062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName9073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleName9112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName9133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleName9153 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName9168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleReferencesSig_in_entryRuleReferencesSig9217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferencesSig9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferencesSig9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleReferencesSig9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleReferencesSig9319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleReferencesSig9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef9372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef9382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRef9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRef9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRef9490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftCurlyBracket_in_entryRuleLeftCurlyBracket9527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftCurlyBracket9537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLeftCurlyBracket9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightCurlyBracket_in_entryRuleRightCurlyBracket9627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightCurlyBracket9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRightCurlyBracket9679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDot_in_entryRuleDot9727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDot9737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDot9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComma_in_entryRuleComma9827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComma9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleComma9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColon_in_entryRuleColon9927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColon9937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleColon9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis10027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis10037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLeftParenthesis10079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis10127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis10137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRightParenthesis10179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_entryRuleLeftSquareBracketKeyword10227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftSquareBracketKeyword10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLeftSquareBracketKeyword10279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_entryRuleRightSquareBracketKeyword10327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightSquareBracketKeyword10337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRightSquareBracketKeyword10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_synpred694277 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred694298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_synpred704327 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred704348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred734365 = new BitSet(new long[]{0x0010000400000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleCompareOp_in_synpred734406 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred734427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred754495 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred754516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred764444 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred764484 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_synpred764495 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred764516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftSquareBracketKeyword_in_synpred794547 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000040007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred794569 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleComma_in_synpred794591 = new BitSet(new long[]{0x0066FE31C5000070L,0x00000000000007E0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred794612 = new BitSet(new long[]{0x0000000008000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleRightSquareBracketKeyword_in_synpred794637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_synpred865096 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleComma_in_synpred865118 = new BitSet(new long[]{0x000C000000002020L});
    public static final BitSet FOLLOW_ruleDecl_in_synpred865139 = new BitSet(new long[]{0x000000000C000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_synpred865162 = new BitSet(new long[]{0x0000000000000002L});

}