package fr.univartois.cril.alloyplugin.parser.antlr.internal; 

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
import fr.univartois.cril.alloyplugin.services.BasicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalBasicsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_INTEGER", "RULE_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'['", "'exactly'", "','", "']'", "'private'", "'open'", "'as'", "'fact'", "'assert'", "'fun'", "'.'", "'('", "')'", "':'", "'pred'", "'run'", "'check'", "'for'", "'but'", "'expect'", "'0'", "'1'", "'int'", "'seq'", "'enum'", "'{'", "'}'", "'sig'", "'abstract'", "'lone'", "'one'", "'some'", "'extends'", "'in'", "'+'", "'&'", "'-'", "'||'", "'or'", "'&&'", "'and'", "'<=>'", "'iff'", "'++'", "'<:'", "':>'", "'<<'", "'>>'", "'>>>'", "'!'", "'not'", "'='", "'<'", "'>'", "'<='", "'=>'", "'let'", "'all'", "'sum'", "'set'", "'#'", "'~'", "'*'", "'^'", "'no'", "'none'", "'iden'", "'univ'", "'Int'", "'seq/Int'", "'@'", "'disj'", "'->'", "'|'", "'this'", "'/'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_COMMENT=7;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_INTEGER=6;
    public static final int RULE_ML_COMMENT=9;

        public InternalBasicsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[192+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g"; }


     
     	private BasicsGrammarAccess grammarAccess;
     	
        public InternalBasicsParser(TokenStream input, IAstFactory factory, BasicsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Specification";	
       	} 



    // $ANTLR start entryRuleSpecification
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:73:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:73:55: (iv_ruleSpecification= ruleSpecification EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:74:2: iv_ruleSpecification= ruleSpecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecificationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSpecification_in_entryRuleSpecification79);
            iv_ruleSpecification=ruleSpecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecification89); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:81:1: ruleSpecification returns [EObject current=null] : ( (lv_module_0= ruleModule )? (lv_open_1= ruleOpen )* (lv_paragraph_2= ruleParagraph )* ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_module_0 = null;

        EObject lv_open_1 = null;

        EObject lv_paragraph_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:86:6: ( ( (lv_module_0= ruleModule )? (lv_open_1= ruleOpen )* (lv_paragraph_2= ruleParagraph )* ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:87:1: ( (lv_module_0= ruleModule )? (lv_open_1= ruleOpen )* (lv_paragraph_2= ruleParagraph )* )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:87:1: ( (lv_module_0= ruleModule )? (lv_open_1= ruleOpen )* (lv_paragraph_2= ruleParagraph )* )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:87:2: (lv_module_0= ruleModule )? (lv_open_1= ruleOpen )* (lv_paragraph_2= ruleParagraph )*
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:87:2: (lv_module_0= ruleModule )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:90:6: lv_module_0= ruleModule
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getModuleModuleParserRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModule_in_ruleSpecification148);
                    lv_module_0=ruleModule();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "module", lv_module_0, "Module", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:108:3: (lv_open_1= ruleOpen )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==19) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:111:6: lv_open_1= ruleOpen
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getOpenOpenParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpen_in_ruleSpecification187);
            	    lv_open_1=ruleOpen();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "open", lv_open_1, "Open", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:129:3: (lv_paragraph_2= ruleParagraph )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==18||(LA3_0>=21 && LA3_0<=23)||(LA3_0>=28 && LA3_0<=30)||LA3_0==38||(LA3_0>=41 && LA3_0<=45)||LA3_0==88) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:132:6: lv_paragraph_2= ruleParagraph
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getParagraphParagraphParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParagraph_in_ruleSpecification226);
            	    lv_paragraph_2=ruleParagraph();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "paragraph", lv_paragraph_2, "Paragraph", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:157:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:157:48: (iv_ruleModule= ruleModule EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:158:2: iv_ruleModule= ruleModule EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule264);
            iv_ruleModule=ruleModule();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule274); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:165:1: ruleModule returns [EObject current=null] : ( 'module' (lv_moduleName_1= ruleName ) ( '[' ( 'exactly' )? (lv_suite_4= ruleName ) ( ',' ( 'exactly' )? RULE_INT )* ']' )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject lv_moduleName_1 = null;

        EObject lv_suite_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:170:6: ( ( 'module' (lv_moduleName_1= ruleName ) ( '[' ( 'exactly' )? (lv_suite_4= ruleName ) ( ',' ( 'exactly' )? RULE_INT )* ']' )? ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:171:1: ( 'module' (lv_moduleName_1= ruleName ) ( '[' ( 'exactly' )? (lv_suite_4= ruleName ) ( ',' ( 'exactly' )? RULE_INT )* ']' )? )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:171:1: ( 'module' (lv_moduleName_1= ruleName ) ( '[' ( 'exactly' )? (lv_suite_4= ruleName ) ( ',' ( 'exactly' )? RULE_INT )* ']' )? )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:171:2: 'module' (lv_moduleName_1= ruleName ) ( '[' ( 'exactly' )? (lv_suite_4= ruleName ) ( ',' ( 'exactly' )? RULE_INT )* ']' )?
            {
            match(input,13,FOLLOW_13_in_ruleModule308); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:175:1: (lv_moduleName_1= ruleName )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:178:6: lv_moduleName_1= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getModuleNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleModule342);
            lv_moduleName_1=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "moduleName", lv_moduleName_1, "Name", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:196:2: ( '[' ( 'exactly' )? (lv_suite_4= ruleName ) ( ',' ( 'exactly' )? RULE_INT )* ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:196:3: '[' ( 'exactly' )? (lv_suite_4= ruleName ) ( ',' ( 'exactly' )? RULE_INT )* ']'
                    {
                    match(input,14,FOLLOW_14_in_ruleModule356); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModuleAccess().getLeftSquareBracketKeyword_2_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:200:1: ( 'exactly' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:200:2: 'exactly'
                            {
                            match(input,15,FOLLOW_15_in_ruleModule366); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getModuleAccess().getExactlyKeyword_2_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:204:3: (lv_suite_4= ruleName )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:207:6: lv_suite_4= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getSuiteNameParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleModule402);
                    lv_suite_4=ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "suite", lv_suite_4, "Name", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:225:2: ( ',' ( 'exactly' )? RULE_INT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:225:3: ',' ( 'exactly' )? RULE_INT
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleModule416); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getModuleAccess().getCommaKeyword_2_3_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:229:1: ( 'exactly' )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==15) ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:229:2: 'exactly'
                    	            {
                    	            match(input,15,FOLLOW_15_in_ruleModule426); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getModuleAccess().getExactlyKeyword_2_3_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleModule437); if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	          createLeafNode(grammarAccess.getModuleAccess().getINTTerminalRuleCall_2_3_2(), null); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleModule447); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModuleAccess().getRightSquareBracketKeyword_2_4(), null); 
                          
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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:248:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:248:46: (iv_ruleOpen= ruleOpen EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:249:2: iv_ruleOpen= ruleOpen EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOpenRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOpen_in_entryRuleOpen482);
            iv_ruleOpen=ruleOpen();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOpen; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpen492); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:256:1: ruleOpen returns [EObject current=null] : ( ( 'private' )? 'open' (lv_name_2= ruleName ) ( '[' (lv_ref_4= ruleRef ) ( ',' (lv_ref2_6= ruleRef ) )* ']' )? ( 'as' (lv_name2_9= ruleName ) )? ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_name_2 = null;

        EObject lv_ref_4 = null;

        EObject lv_ref2_6 = null;

        EObject lv_name2_9 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:261:6: ( ( ( 'private' )? 'open' (lv_name_2= ruleName ) ( '[' (lv_ref_4= ruleRef ) ( ',' (lv_ref2_6= ruleRef ) )* ']' )? ( 'as' (lv_name2_9= ruleName ) )? ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:262:1: ( ( 'private' )? 'open' (lv_name_2= ruleName ) ( '[' (lv_ref_4= ruleRef ) ( ',' (lv_ref2_6= ruleRef ) )* ']' )? ( 'as' (lv_name2_9= ruleName ) )? )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:262:1: ( ( 'private' )? 'open' (lv_name_2= ruleName ) ( '[' (lv_ref_4= ruleRef ) ( ',' (lv_ref2_6= ruleRef ) )* ']' )? ( 'as' (lv_name2_9= ruleName ) )? )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:262:2: ( 'private' )? 'open' (lv_name_2= ruleName ) ( '[' (lv_ref_4= ruleRef ) ( ',' (lv_ref2_6= ruleRef ) )* ']' )? ( 'as' (lv_name2_9= ruleName ) )?
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:262:2: ( 'private' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:262:3: 'private'
                    {
                    match(input,18,FOLLOW_18_in_ruleOpen527); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleOpen538); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOpenAccess().getOpenKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:270:1: (lv_name_2= ruleName )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:273:6: lv_name_2= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getNameNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleOpen572);
            lv_name_2=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_2, "Name", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:291:2: ( '[' (lv_ref_4= ruleRef ) ( ',' (lv_ref2_6= ruleRef ) )* ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:291:3: '[' (lv_ref_4= ruleRef ) ( ',' (lv_ref2_6= ruleRef ) )* ']'
                    {
                    match(input,14,FOLLOW_14_in_ruleOpen586); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getLeftSquareBracketKeyword_3_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:295:1: (lv_ref_4= ruleRef )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:298:6: lv_ref_4= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRefRefParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleOpen620);
                    lv_ref_4=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "ref", lv_ref_4, "Ref", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:316:2: ( ',' (lv_ref2_6= ruleRef ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:316:3: ',' (lv_ref2_6= ruleRef )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleOpen634); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOpenAccess().getCommaKeyword_3_2_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:320:1: (lv_ref2_6= ruleRef )
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:323:6: lv_ref2_6= ruleRef
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getRef2RefParserRuleCall_3_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRef_in_ruleOpen668);
                    	    lv_ref2_6=ruleRef();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "ref2", lv_ref2_6, "Ref", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleOpen683); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getRightSquareBracketKeyword_3_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:345:3: ( 'as' (lv_name2_9= ruleName ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:345:4: 'as' (lv_name2_9= ruleName )
                    {
                    match(input,20,FOLLOW_20_in_ruleOpen695); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOpenAccess().getAsKeyword_4_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:349:1: (lv_name2_9= ruleName )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:352:6: lv_name2_9= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOpenAccess().getName2NameParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleOpen729);
                    lv_name2_9=ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOpenRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name2", lv_name2_9, "Name", currentNode);
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
    // $ANTLR end ruleOpen


    // $ANTLR start entryRuleParagraph
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:377:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:377:51: (iv_ruleParagraph= ruleParagraph EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:378:2: iv_ruleParagraph= ruleParagraph EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParagraphRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph768);
            iv_ruleParagraph=ruleParagraph();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParagraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph778); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:385:1: ruleParagraph returns [EObject current=null] : (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl ) ;
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
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:390:6: ( (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:391:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:391:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:392:5: this_FactDecl_0= ruleFactDecl
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFactDeclParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFactDecl_in_ruleParagraph825);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:402:5: this_AssertDecl_1= ruleAssertDecl
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getAssertDeclParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssertDecl_in_ruleParagraph852);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:412:5: this_FunDecl_2= ruleFunDecl
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getFunDeclParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunDecl_in_ruleParagraph879);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:422:5: this_PredDecl_3= rulePredDecl
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getPredDeclParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePredDecl_in_ruleParagraph906);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:432:5: this_RunDecl_4= ruleRunDecl
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getRunDeclParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleRunDecl_in_ruleParagraph933);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:442:5: this_CheckDecl_5= ruleCheckDecl
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getCheckDeclParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckDecl_in_ruleParagraph960);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:452:5: this_EnumDecl_6= ruleEnumDecl
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getEnumDeclParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleParagraph987);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:462:5: this_SigDecl_7= ruleSigDecl
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParagraphAccess().getSigDeclParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSigDecl_in_ruleParagraph1014);
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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:477:1: entryRuleFactDecl returns [EObject current=null] : iv_ruleFactDecl= ruleFactDecl EOF ;
    public final EObject entryRuleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:477:50: (iv_ruleFactDecl= ruleFactDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:478:2: iv_ruleFactDecl= ruleFactDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFactDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFactDecl_in_entryRuleFactDecl1046);
            iv_ruleFactDecl=ruleFactDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFactDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactDecl1056); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:485:1: ruleFactDecl returns [EObject current=null] : ( 'fact' (lv_factName_1= ruleName )? (lv_b_2= ruleBlockBis ) ) ;
    public final EObject ruleFactDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_factName_1 = null;

        EObject lv_b_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:490:6: ( ( 'fact' (lv_factName_1= ruleName )? (lv_b_2= ruleBlockBis ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:491:1: ( 'fact' (lv_factName_1= ruleName )? (lv_b_2= ruleBlockBis ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:491:1: ( 'fact' (lv_factName_1= ruleName )? (lv_b_2= ruleBlockBis ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:491:2: 'fact' (lv_factName_1= ruleName )? (lv_b_2= ruleBlockBis )
            {
            match(input,21,FOLLOW_21_in_ruleFactDecl1090); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFactDeclAccess().getFactKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:495:1: (lv_factName_1= ruleName )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==88) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:498:6: lv_factName_1= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getFactNameNameParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleFactDecl1124);
                    lv_factName_1=ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFactDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "factName", lv_factName_1, "Name", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:516:3: (lv_b_2= ruleBlockBis )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:519:6: lv_b_2= ruleBlockBis
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFactDeclAccess().getBBlockBisParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockBis_in_ruleFactDecl1163);
            lv_b_2=ruleBlockBis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFactDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "b", lv_b_2, "BlockBis", currentNode);
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
    // $ANTLR end ruleFactDecl


    // $ANTLR start entryRuleAssertDecl
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:544:1: entryRuleAssertDecl returns [EObject current=null] : iv_ruleAssertDecl= ruleAssertDecl EOF ;
    public final EObject entryRuleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:544:52: (iv_ruleAssertDecl= ruleAssertDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:545:2: iv_ruleAssertDecl= ruleAssertDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssertDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1200);
            iv_ruleAssertDecl=ruleAssertDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssertDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertDecl1210); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:552:1: ruleAssertDecl returns [EObject current=null] : ( 'assert' (lv_assertName_1= ruleName )? (lv_b_2= ruleBlockBis ) ) ;
    public final EObject ruleAssertDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_assertName_1 = null;

        EObject lv_b_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:557:6: ( ( 'assert' (lv_assertName_1= ruleName )? (lv_b_2= ruleBlockBis ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:558:1: ( 'assert' (lv_assertName_1= ruleName )? (lv_b_2= ruleBlockBis ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:558:1: ( 'assert' (lv_assertName_1= ruleName )? (lv_b_2= ruleBlockBis ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:558:2: 'assert' (lv_assertName_1= ruleName )? (lv_b_2= ruleBlockBis )
            {
            match(input,22,FOLLOW_22_in_ruleAssertDecl1244); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssertDeclAccess().getAssertKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:562:1: (lv_assertName_1= ruleName )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==88) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:565:6: lv_assertName_1= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getAssertNameNameParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleAssertDecl1278);
                    lv_assertName_1=ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssertDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "assertName", lv_assertName_1, "Name", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:583:3: (lv_b_2= ruleBlockBis )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:586:6: lv_b_2= ruleBlockBis
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssertDeclAccess().getBBlockBisParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockBis_in_ruleAssertDecl1317);
            lv_b_2=ruleBlockBis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssertDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "b", lv_b_2, "BlockBis", currentNode);
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
    // $ANTLR end ruleAssertDecl


    // $ANTLR start entryRuleFunDecl
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:611:1: entryRuleFunDecl returns [EObject current=null] : iv_ruleFunDecl= ruleFunDecl EOF ;
    public final EObject entryRuleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:611:49: (iv_ruleFunDecl= ruleFunDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:612:2: iv_ruleFunDecl= ruleFunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFunDecl_in_entryRuleFunDecl1354);
            iv_ruleFunDecl=ruleFunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunDecl1364); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:619:1: ruleFunDecl returns [EObject current=null] : ( ( 'private' )? 'fun' ( (lv_ref_2= ruleRef ) '.' )? (lv_funName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) ) ':' (lv_expr_16= ruleExpression ) (lv_b_17= ruleBlockBis ) ) ;
    public final EObject ruleFunDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_2 = null;

        EObject lv_funName_4 = null;

        EObject lv_decl_6 = null;

        EObject lv_decl2_8 = null;

        EObject lv_decl_11 = null;

        EObject lv_decl2_13 = null;

        EObject lv_expr_16 = null;

        EObject lv_b_17 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:624:6: ( ( ( 'private' )? 'fun' ( (lv_ref_2= ruleRef ) '.' )? (lv_funName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) ) ':' (lv_expr_16= ruleExpression ) (lv_b_17= ruleBlockBis ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:625:1: ( ( 'private' )? 'fun' ( (lv_ref_2= ruleRef ) '.' )? (lv_funName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) ) ':' (lv_expr_16= ruleExpression ) (lv_b_17= ruleBlockBis ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:625:1: ( ( 'private' )? 'fun' ( (lv_ref_2= ruleRef ) '.' )? (lv_funName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) ) ':' (lv_expr_16= ruleExpression ) (lv_b_17= ruleBlockBis ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:625:2: ( 'private' )? 'fun' ( (lv_ref_2= ruleRef ) '.' )? (lv_funName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) ) ':' (lv_expr_16= ruleExpression ) (lv_b_17= ruleBlockBis )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:625:2: ( 'private' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:625:3: 'private'
                    {
                    match(input,18,FOLLOW_18_in_ruleFunDecl1399); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleFunDecl1410); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunDeclAccess().getFunKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:633:1: ( (lv_ref_2= ruleRef ) '.' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==24) ) {
                    alt16=1;
                }
            }
            else if ( ((LA16_0>=81 && LA16_0<=83)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:633:2: (lv_ref_2= ruleRef ) '.'
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:633:2: (lv_ref_2= ruleRef )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:636:6: lv_ref_2= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleFunDecl1445);
                    lv_ref_2=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "ref", lv_ref_2, "Ref", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,24,FOLLOW_24_in_ruleFunDecl1458); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getFullStopKeyword_2_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:658:3: (lv_funName_4= ruleName )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:661:6: lv_funName_4= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getFunNameNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleFunDecl1494);
            lv_funName_4=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "funName", lv_funName_4, "Name", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:679:2: ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            else if ( (LA21_0==25) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("679:2: ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:679:3: ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:679:3: ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:679:4: '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']'
                    {
                    match(input,14,FOLLOW_14_in_ruleFunDecl1509); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getLeftSquareBracketKeyword_4_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:683:1: ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==18||LA18_0==85||LA18_0==88) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:683:2: (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )*
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:683:2: (lv_decl_6= ruleDecl )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:686:6: lv_decl_6= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1544);
                            lv_decl_6=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "decl", lv_decl_6, "Decl", currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }

                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:704:2: ( ',' (lv_decl2_8= ruleDecl ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==16) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:704:3: ',' (lv_decl2_8= ruleDecl )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleFunDecl1558); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getFunDeclAccess().getCommaKeyword_4_0_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:708:1: (lv_decl2_8= ruleDecl )
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:711:6: lv_decl2_8= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDecl2DeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1592);
                            	    lv_decl2_8=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "decl2", lv_decl2_8, "Decl", currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
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

                    match(input,17,FOLLOW_17_in_ruleFunDecl1609); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getRightSquareBracketKeyword_4_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:734:6: ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:734:6: ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:734:7: '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleFunDecl1626); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getLeftParenthesisKeyword_4_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:738:1: ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID||LA20_0==18||LA20_0==85||LA20_0==88) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:738:2: (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )*
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:738:2: (lv_decl_11= ruleDecl )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:741:6: lv_decl_11= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1661);
                            lv_decl_11=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "decl", lv_decl_11, "Decl", currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }

                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:759:2: ( ',' (lv_decl2_13= ruleDecl ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==16) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:759:3: ',' (lv_decl2_13= ruleDecl )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleFunDecl1675); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getFunDeclAccess().getCommaKeyword_4_1_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:763:1: (lv_decl2_13= ruleDecl )
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:766:6: lv_decl2_13= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getDecl2DeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleFunDecl1709);
                            	    lv_decl2_13=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "decl2", lv_decl2_13, "Decl", currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,26,FOLLOW_26_in_ruleFunDecl1726); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunDeclAccess().getRightParenthesisKeyword_4_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_ruleFunDecl1737); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunDeclAccess().getColonKeyword_5(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:792:1: (lv_expr_16= ruleExpression )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:795:6: lv_expr_16= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getExprExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFunDecl1771);
            lv_expr_16=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "expr", lv_expr_16, "Expression", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:813:2: (lv_b_17= ruleBlockBis )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:816:6: lv_b_17= ruleBlockBis
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunDeclAccess().getBBlockBisParserRuleCall_7_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockBis_in_ruleFunDecl1809);
            lv_b_17=ruleBlockBis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "b", lv_b_17, "BlockBis", currentNode);
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
    // $ANTLR end ruleFunDecl


    // $ANTLR start entryRulePredDecl
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:841:1: entryRulePredDecl returns [EObject current=null] : iv_rulePredDecl= rulePredDecl EOF ;
    public final EObject entryRulePredDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:841:50: (iv_rulePredDecl= rulePredDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:842:2: iv_rulePredDecl= rulePredDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPredDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePredDecl_in_entryRulePredDecl1846);
            iv_rulePredDecl=rulePredDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePredDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredDecl1856); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:849:1: rulePredDecl returns [EObject current=null] : ( ( 'private' )? (lv_pred_1= 'pred' ) ( (lv_ref_2= ruleRef ) '.' )? (lv_predName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) )? (lv_b_15= ruleBlockBis ) ) ;
    public final EObject rulePredDecl() throws RecognitionException {
        EObject current = null;

        Token lv_pred_1=null;
        EObject lv_ref_2 = null;

        EObject lv_predName_4 = null;

        EObject lv_decl_6 = null;

        EObject lv_decl2_8 = null;

        EObject lv_decl_11 = null;

        EObject lv_decl2_13 = null;

        EObject lv_b_15 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:854:6: ( ( ( 'private' )? (lv_pred_1= 'pred' ) ( (lv_ref_2= ruleRef ) '.' )? (lv_predName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) )? (lv_b_15= ruleBlockBis ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:855:1: ( ( 'private' )? (lv_pred_1= 'pred' ) ( (lv_ref_2= ruleRef ) '.' )? (lv_predName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) )? (lv_b_15= ruleBlockBis ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:855:1: ( ( 'private' )? (lv_pred_1= 'pred' ) ( (lv_ref_2= ruleRef ) '.' )? (lv_predName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) )? (lv_b_15= ruleBlockBis ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:855:2: ( 'private' )? (lv_pred_1= 'pred' ) ( (lv_ref_2= ruleRef ) '.' )? (lv_predName_4= ruleName ) ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) )? (lv_b_15= ruleBlockBis )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:855:2: ( 'private' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:855:3: 'private'
                    {
                    match(input,18,FOLLOW_18_in_rulePredDecl1891); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:859:3: (lv_pred_1= 'pred' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:861:6: lv_pred_1= 'pred'
            {
            lv_pred_1=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_rulePredDecl1914); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPredDeclAccess().getPredPredKeyword_1_0(), "pred"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "pred", /* lv_pred_1 */ input.LT(-1), "pred", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:880:2: ( (lv_ref_2= ruleRef ) '.' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==24) ) {
                    alt23=1;
                }
            }
            else if ( ((LA23_0>=81 && LA23_0<=83)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:880:3: (lv_ref_2= ruleRef ) '.'
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:880:3: (lv_ref_2= ruleRef )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:883:6: lv_ref_2= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getRefRefParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_rulePredDecl1962);
                    lv_ref_2=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "ref", lv_ref_2, "Ref", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,24,FOLLOW_24_in_rulePredDecl1975); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getFullStopKeyword_2_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:905:3: (lv_predName_4= ruleName )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:908:6: lv_predName_4= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getPredNameNameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_rulePredDecl2011);
            lv_predName_4=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "predName", lv_predName_4, "Name", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:926:2: ( ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' ) | ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' ) )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            else if ( (LA28_0==25) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:926:3: ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:926:3: ( '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']' )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:926:4: '[' ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )? ']'
                    {
                    match(input,14,FOLLOW_14_in_rulePredDecl2026); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getLeftSquareBracketKeyword_4_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:930:1: ( (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID||LA25_0==18||LA25_0==85||LA25_0==88) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:930:2: (lv_decl_6= ruleDecl ) ( ',' (lv_decl2_8= ruleDecl ) )*
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:930:2: (lv_decl_6= ruleDecl )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:933:6: lv_decl_6= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2061);
                            lv_decl_6=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "decl", lv_decl_6, "Decl", currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }

                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:951:2: ( ',' (lv_decl2_8= ruleDecl ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==16) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:951:3: ',' (lv_decl2_8= ruleDecl )
                            	    {
                            	    match(input,16,FOLLOW_16_in_rulePredDecl2075); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getPredDeclAccess().getCommaKeyword_4_0_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:955:1: (lv_decl2_8= ruleDecl )
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:958:6: lv_decl2_8= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDecl2DeclParserRuleCall_4_0_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2109);
                            	    lv_decl2_8=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "decl2", lv_decl2_8, "Decl", currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
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

                    match(input,17,FOLLOW_17_in_rulePredDecl2126); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getRightSquareBracketKeyword_4_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:981:6: ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:981:6: ( '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')' )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:981:7: '(' ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )? ')'
                    {
                    match(input,25,FOLLOW_25_in_rulePredDecl2143); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getLeftParenthesisKeyword_4_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:985:1: ( (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID||LA27_0==18||LA27_0==85||LA27_0==88) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:985:2: (lv_decl_11= ruleDecl ) ( ',' (lv_decl2_13= ruleDecl ) )*
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:985:2: (lv_decl_11= ruleDecl )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:988:6: lv_decl_11= ruleDecl
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDeclDeclParserRuleCall_4_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2178);
                            lv_decl_11=ruleDecl();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "decl", lv_decl_11, "Decl", currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }

                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1006:2: ( ',' (lv_decl2_13= ruleDecl ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==16) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1006:3: ',' (lv_decl2_13= ruleDecl )
                            	    {
                            	    match(input,16,FOLLOW_16_in_rulePredDecl2192); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getPredDeclAccess().getCommaKeyword_4_1_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1010:1: (lv_decl2_13= ruleDecl )
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1013:6: lv_decl2_13= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getDecl2DeclParserRuleCall_4_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_rulePredDecl2226);
                            	    lv_decl2_13=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		add(current, "decl2", lv_decl2_13, "Decl", currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,26,FOLLOW_26_in_rulePredDecl2243); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPredDeclAccess().getRightParenthesisKeyword_4_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1035:4: (lv_b_15= ruleBlockBis )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1038:6: lv_b_15= ruleBlockBis
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPredDeclAccess().getBBlockBisParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBlockBis_in_rulePredDecl2280);
            lv_b_15=ruleBlockBis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPredDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "b", lv_b_15, "BlockBis", currentNode);
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
    // $ANTLR end rulePredDecl


    // $ANTLR start entryRuleRunDecl
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1063:1: entryRuleRunDecl returns [EObject current=null] : iv_ruleRunDecl= ruleRunDecl EOF ;
    public final EObject entryRuleRunDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1063:49: (iv_ruleRunDecl= ruleRunDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1064:2: iv_ruleRunDecl= ruleRunDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRunDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRunDecl_in_entryRuleRunDecl2317);
            iv_ruleRunDecl=ruleRunDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRunDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRunDecl2327); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1071:1: ruleRunDecl returns [EObject current=null] : ( ( (lv_runName_0= ruleName ) ':' )? (lv_run_2= 'run' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope ) ) ;
    public final EObject ruleRunDecl() throws RecognitionException {
        EObject current = null;

        Token lv_run_2=null;
        EObject lv_runName_0 = null;

        EObject lv_b_4 = null;

        EObject lv_scope_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1076:6: ( ( ( (lv_runName_0= ruleName ) ':' )? (lv_run_2= 'run' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1077:1: ( ( (lv_runName_0= ruleName ) ':' )? (lv_run_2= 'run' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1077:1: ( ( (lv_runName_0= ruleName ) ':' )? (lv_run_2= 'run' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1077:2: ( (lv_runName_0= ruleName ) ':' )? (lv_run_2= 'run' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1077:2: ( (lv_runName_0= ruleName ) ':' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==88) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1077:3: (lv_runName_0= ruleName ) ':'
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1077:3: (lv_runName_0= ruleName )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1080:6: lv_runName_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getRunNameNameParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleRunDecl2387);
                    lv_runName_0=ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "runName", lv_runName_0, "Name", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,27,FOLLOW_27_in_ruleRunDecl2400); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRunDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1102:3: (lv_run_2= 'run' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1104:6: lv_run_2= 'run'
            {
            lv_run_2=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_ruleRunDecl2423); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRunDeclAccess().getRunRunKeyword_1_0(), "run"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "run", /* lv_run_2 */ input.LT(-1), "run", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1123:2: ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==39) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1123:2: ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1123:3: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1123:3: ( RULE_ID )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1126:3: RULE_ID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRunDecl2459); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRunDeclAccess().getName2NameCrossReference_2_0_0(), "name2"); 
                      	
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1140:6: (lv_b_4= ruleBlockBis )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1140:6: (lv_b_4= ruleBlockBis )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1143:6: lv_b_4= ruleBlockBis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getBBlockBisParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockBis_in_ruleRunDecl2502);
                    lv_b_4=ruleBlockBis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "b", lv_b_4, "BlockBis", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1161:3: (lv_scope_5= ruleScope )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1164:6: lv_scope_5= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRunDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleRunDecl2541);
            lv_scope_5=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRunDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "scope", lv_scope_5, "Scope", currentNode);
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
    // $ANTLR end ruleRunDecl


    // $ANTLR start entryRuleCheckDecl
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1189:1: entryRuleCheckDecl returns [EObject current=null] : iv_ruleCheckDecl= ruleCheckDecl EOF ;
    public final EObject entryRuleCheckDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1189:51: (iv_ruleCheckDecl= ruleCheckDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1190:2: iv_ruleCheckDecl= ruleCheckDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCheckDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2578);
            iv_ruleCheckDecl=ruleCheckDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCheckDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckDecl2588); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1197:1: ruleCheckDecl returns [EObject current=null] : ( ( (lv_checkName_0= ruleName ) ':' )? (lv_check_2= 'check' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope ) ) ;
    public final EObject ruleCheckDecl() throws RecognitionException {
        EObject current = null;

        Token lv_check_2=null;
        EObject lv_checkName_0 = null;

        EObject lv_b_4 = null;

        EObject lv_scope_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1202:6: ( ( ( (lv_checkName_0= ruleName ) ':' )? (lv_check_2= 'check' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1203:1: ( ( (lv_checkName_0= ruleName ) ':' )? (lv_check_2= 'check' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1203:1: ( ( (lv_checkName_0= ruleName ) ':' )? (lv_check_2= 'check' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1203:2: ( (lv_checkName_0= ruleName ) ':' )? (lv_check_2= 'check' ) ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) ) (lv_scope_5= ruleScope )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1203:2: ( (lv_checkName_0= ruleName ) ':' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==88) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1203:3: (lv_checkName_0= ruleName ) ':'
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1203:3: (lv_checkName_0= ruleName )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1206:6: lv_checkName_0= ruleName
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getCheckNameNameParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleName_in_ruleCheckDecl2648);
                    lv_checkName_0=ruleName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "checkName", lv_checkName_0, "Name", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,27,FOLLOW_27_in_ruleCheckDecl2661); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCheckDeclAccess().getColonKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1228:3: (lv_check_2= 'check' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1230:6: lv_check_2= 'check'
            {
            lv_check_2=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleCheckDecl2684); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getCheckDeclAccess().getCheckCheckKeyword_1_0(), "check"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "check", /* lv_check_2 */ input.LT(-1), "check", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1249:2: ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==39) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1249:2: ( ( RULE_ID ) | (lv_b_4= ruleBlockBis ) )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1249:3: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1249:3: ( RULE_ID )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1252:3: RULE_ID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckDecl2720); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCheckDeclAccess().getName2NameCrossReference_2_0_0(), "name2"); 
                      	
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1266:6: (lv_b_4= ruleBlockBis )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1266:6: (lv_b_4= ruleBlockBis )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1269:6: lv_b_4= ruleBlockBis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getBBlockBisParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockBis_in_ruleCheckDecl2763);
                    lv_b_4=ruleBlockBis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "b", lv_b_4, "BlockBis", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1287:3: (lv_scope_5= ruleScope )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1290:6: lv_scope_5= ruleScope
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCheckDeclAccess().getScopeScopeParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScope_in_ruleCheckDecl2802);
            lv_scope_5=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCheckDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "scope", lv_scope_5, "Scope", currentNode);
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
    // $ANTLR end ruleCheckDecl


    // $ANTLR start entryRuleScope
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1315:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1315:47: (iv_ruleScope= ruleScope EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1316:2: iv_ruleScope= ruleScope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScope_in_entryRuleScope2839);
            iv_ruleScope=ruleScope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScope2849); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1323:1: ruleScope returns [EObject current=null] : ( ( 'for' ( ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? ) | ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* ) )? )? ( 'expect' ( '0' | '1' ) )? ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        EObject lv_typescope_3 = null;

        EObject lv_typescope_5 = null;

        EObject lv_typescope_6 = null;

        EObject lv_typescope_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1328:6: ( ( ( 'for' ( ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? ) | ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* ) )? )? ( 'expect' ( '0' | '1' ) )? ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1329:1: ( ( 'for' ( ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? ) | ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* ) )? )? ( 'expect' ( '0' | '1' ) )? )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1329:1: ( ( 'for' ( ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? ) | ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* ) )? )? ( 'expect' ( '0' | '1' ) )? )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1329:2: ( 'for' ( ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? ) | ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* ) )? )? ( 'expect' ( '0' | '1' ) )?
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1329:2: ( 'for' ( ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? ) | ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* ) )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1329:3: 'for' ( ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? ) | ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* ) )?
                    {
                    match(input,31,FOLLOW_31_in_ruleScope2884); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getForKeyword_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1333:1: ( ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? ) | ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* ) )?
                    int alt36=3;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_INT) ) {
                        switch ( input.LA(2) ) {
                            case EOF:
                            case 18:
                            case 21:
                            case 22:
                            case 23:
                            case 28:
                            case 29:
                            case 30:
                            case 32:
                            case 33:
                            case 38:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 88:
                                {
                                alt36=1;
                                }
                                break;
                            case RULE_ID:
                                {
                                int LA36_5 = input.LA(3);

                                if ( (LA36_5==EOF||LA36_5==RULE_ID||LA36_5==16||LA36_5==18||(LA36_5>=21 && LA36_5<=23)||(LA36_5>=28 && LA36_5<=30)||LA36_5==33||LA36_5==38||(LA36_5>=41 && LA36_5<=45)||LA36_5==88) ) {
                                    alt36=2;
                                }
                                else if ( (LA36_5==27||LA36_5==89) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 36:
                            case 37:
                                {
                                alt36=2;
                                }
                                break;
                        }

                    }
                    else if ( (LA36_0==15) ) {
                        alt36=2;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1333:2: ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? )
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1333:2: ( RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )? )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1333:3: RULE_INT ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )?
                            {
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleScope2895); if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                  createLeafNode(grammarAccess.getScopeAccess().getINTTerminalRuleCall_0_1_0_0(), null); 
                                  
                            }
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1337:1: ( 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )* )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==32) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1337:2: 'but' (lv_typescope_3= ruleTypescope ) ( ',' (lv_typescope_5= ruleTypescope ) )*
                                    {
                                    match(input,32,FOLLOW_32_in_ruleScope2904); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getScopeAccess().getButKeyword_0_1_0_1_0(), null); 
                                          
                                    }
                                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1341:1: (lv_typescope_3= ruleTypescope )
                                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1344:6: lv_typescope_3= ruleTypescope
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_0_1_0_1_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2938);
                                    lv_typescope_3=ruleTypescope();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        
                                      	        try {
                                      	       		set(current, "typescope", lv_typescope_3, "Typescope", currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }

                                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1362:2: ( ',' (lv_typescope_5= ruleTypescope ) )*
                                    loop33:
                                    do {
                                        int alt33=2;
                                        int LA33_0 = input.LA(1);

                                        if ( (LA33_0==16) ) {
                                            alt33=1;
                                        }


                                        switch (alt33) {
                                    	case 1 :
                                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1362:3: ',' (lv_typescope_5= ruleTypescope )
                                    	    {
                                    	    match(input,16,FOLLOW_16_in_ruleScope2952); if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	              createLeafNode(grammarAccess.getScopeAccess().getCommaKeyword_0_1_0_1_2_0(), null); 
                                    	          
                                    	    }
                                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1366:1: (lv_typescope_5= ruleTypescope )
                                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1369:6: lv_typescope_5= ruleTypescope
                                    	    {
                                    	    if ( backtracking==0 ) {
                                    	       
                                    	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_0_1_0_1_2_1_0(), currentNode); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope2986);
                                    	    lv_typescope_5=ruleTypescope();
                                    	    _fsp--;
                                    	    if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                    	      	        }
                                    	      	        
                                    	      	        try {
                                    	      	       		set(current, "typescope", lv_typescope_5, "Typescope", currentNode);
                                    	      	        } catch (ValueConverterException vce) {
                                    	      				handleValueConverterException(vce);
                                    	      	        }
                                    	      	        currentNode = currentNode.getParent();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop33;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1388:6: ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* )
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1388:6: ( (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )* )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1388:7: (lv_typescope_6= ruleTypescope ) ( ',' (lv_typescope_8= ruleTypescope ) )*
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1388:7: (lv_typescope_6= ruleTypescope )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1391:6: lv_typescope_6= ruleTypescope
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_0_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTypescope_in_ruleScope3036);
                            lv_typescope_6=ruleTypescope();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "typescope", lv_typescope_6, "Typescope", currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }

                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1409:2: ( ',' (lv_typescope_8= ruleTypescope ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==16) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1409:3: ',' (lv_typescope_8= ruleTypescope )
                            	    {
                            	    match(input,16,FOLLOW_16_in_ruleScope3050); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getScopeAccess().getCommaKeyword_0_1_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1413:1: (lv_typescope_8= ruleTypescope )
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1416:6: lv_typescope_8= ruleTypescope
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getScopeAccess().getTypescopeTypescopeParserRuleCall_0_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleTypescope_in_ruleScope3084);
                            	    lv_typescope_8=ruleTypescope();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getScopeRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		set(current, "typescope", lv_typescope_8, "Typescope", currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1434:9: ( 'expect' ( '0' | '1' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1434:10: 'expect' ( '0' | '1' )
                    {
                    match(input,33,FOLLOW_33_in_ruleScope3105); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getScopeAccess().getExpectKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1438:1: ( '0' | '1' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==34) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==35) ) {
                        alt38=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1438:1: ( '0' | '1' )", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1438:2: '0'
                            {
                            match(input,34,FOLLOW_34_in_ruleScope3115); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getScopeAccess().getDigitZeroKeyword_1_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1443:6: '1'
                            {
                            match(input,35,FOLLOW_35_in_ruleScope3130); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getScopeAccess().getDigitOneKeyword_1_1_1(), null); 
                                  
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
    // $ANTLR end ruleScope


    // $ANTLR start entryRuleTypescope
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1454:1: entryRuleTypescope returns [EObject current=null] : iv_ruleTypescope= ruleTypescope EOF ;
    public final EObject entryRuleTypescope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypescope = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1454:51: (iv_ruleTypescope= ruleTypescope EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1455:2: iv_ruleTypescope= ruleTypescope EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypescopeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypescope_in_entryRuleTypescope3166);
            iv_ruleTypescope=ruleTypescope();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypescope; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypescope3176); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1462:1: ruleTypescope returns [EObject current=null] : ( ( 'exactly' )? RULE_INT ( ( RULE_ID ) | ( 'int' | 'seq' ) ) ) ;
    public final EObject ruleTypescope() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1467:6: ( ( ( 'exactly' )? RULE_INT ( ( RULE_ID ) | ( 'int' | 'seq' ) ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1468:1: ( ( 'exactly' )? RULE_INT ( ( RULE_ID ) | ( 'int' | 'seq' ) ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1468:1: ( ( 'exactly' )? RULE_INT ( ( RULE_ID ) | ( 'int' | 'seq' ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1468:2: ( 'exactly' )? RULE_INT ( ( RULE_ID ) | ( 'int' | 'seq' ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1468:2: ( 'exactly' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1468:3: 'exactly'
                    {
                    match(input,15,FOLLOW_15_in_ruleTypescope3211); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypescopeAccess().getExactlyKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTypescope3222); if (failed) return current;
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getTypescopeAccess().getINTTerminalRuleCall_1(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1476:1: ( ( RULE_ID ) | ( 'int' | 'seq' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=36 && LA42_0<=37)) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1476:1: ( ( RULE_ID ) | ( 'int' | 'seq' ) )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1476:2: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1476:2: ( RULE_ID )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1479:3: RULE_ID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTypescopeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypescope3244); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTypescopeAccess().getNNameCrossReference_2_0_0(), "n"); 
                      	
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1493:6: ( 'int' | 'seq' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1493:6: ( 'int' | 'seq' )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==36) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==37) ) {
                        alt41=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1493:6: ( 'int' | 'seq' )", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1493:7: 'int'
                            {
                            match(input,36,FOLLOW_36_in_ruleTypescope3263); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypescopeAccess().getIntKeyword_2_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1498:6: 'seq'
                            {
                            match(input,37,FOLLOW_37_in_ruleTypescope3278); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypescopeAccess().getSeqKeyword_2_1_1(), null); 
                                  
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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1509:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1509:50: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1510:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnumDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3313);
            iv_ruleEnumDecl=ruleEnumDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEnumDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl3323); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1517:1: ruleEnumDecl returns [EObject current=null] : ( 'enum' (lv_enumName_1= ruleName ) '{' (lv_name2_3= ruleName ) ( ',' (lv_name3_5= ruleName ) )* '}' ) ;
    public final EObject ruleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_enumName_1 = null;

        EObject lv_name2_3 = null;

        EObject lv_name3_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1522:6: ( ( 'enum' (lv_enumName_1= ruleName ) '{' (lv_name2_3= ruleName ) ( ',' (lv_name3_5= ruleName ) )* '}' ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1523:1: ( 'enum' (lv_enumName_1= ruleName ) '{' (lv_name2_3= ruleName ) ( ',' (lv_name3_5= ruleName ) )* '}' )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1523:1: ( 'enum' (lv_enumName_1= ruleName ) '{' (lv_name2_3= ruleName ) ( ',' (lv_name3_5= ruleName ) )* '}' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1523:2: 'enum' (lv_enumName_1= ruleName ) '{' (lv_name2_3= ruleName ) ( ',' (lv_name3_5= ruleName ) )* '}'
            {
            match(input,38,FOLLOW_38_in_ruleEnumDecl3357); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDeclAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1527:1: (lv_enumName_1= ruleName )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1530:6: lv_enumName_1= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getEnumNameNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumDecl3391);
            lv_enumName_1=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "enumName", lv_enumName_1, "Name", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            match(input,39,FOLLOW_39_in_ruleEnumDecl3404); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1552:1: (lv_name2_3= ruleName )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1555:6: lv_name2_3= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getName2NameParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleEnumDecl3438);
            lv_name2_3=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "name2", lv_name2_3, "Name", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1573:2: ( ',' (lv_name3_5= ruleName ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==16) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1573:3: ',' (lv_name3_5= ruleName )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleEnumDecl3452); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getEnumDeclAccess().getCommaKeyword_4_0(), null); 
            	          
            	    }
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1577:1: (lv_name3_5= ruleName )
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1580:6: lv_name3_5= ruleName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getName3NameParserRuleCall_4_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleName_in_ruleEnumDecl3486);
            	    lv_name3_5=ruleName();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "name3", lv_name3_5, "Name", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            match(input,40,FOLLOW_40_in_ruleEnumDecl3501); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_5(), null); 
                  
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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1609:1: entryRuleSigDecl returns [EObject current=null] : iv_ruleSigDecl= ruleSigDecl EOF ;
    public final EObject entryRuleSigDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1609:49: (iv_ruleSigDecl= ruleSigDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1610:2: iv_ruleSigDecl= ruleSigDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigDecl_in_entryRuleSigDecl3534);
            iv_ruleSigDecl=ruleSigDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigDecl3544); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1617:1: ruleSigDecl returns [EObject current=null] : ( ( ruleSigQual )* 'sig' (lv_sigName_2= ruleName ) ( ',' (lv_name2_4= ruleName ) )* (lv_sigExt_5= ruleSigExt )? '{' ( (lv_decl_7= ruleDecl ) ( ',' (lv_decl2_9= ruleDecl ) )* )? '}' (lv_b_11= ruleBlockBis )? ) ;
    public final EObject ruleSigDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_sigName_2 = null;

        EObject lv_name2_4 = null;

        EObject lv_sigExt_5 = null;

        EObject lv_decl_7 = null;

        EObject lv_decl2_9 = null;

        EObject lv_b_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1622:6: ( ( ( ruleSigQual )* 'sig' (lv_sigName_2= ruleName ) ( ',' (lv_name2_4= ruleName ) )* (lv_sigExt_5= ruleSigExt )? '{' ( (lv_decl_7= ruleDecl ) ( ',' (lv_decl2_9= ruleDecl ) )* )? '}' (lv_b_11= ruleBlockBis )? ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1623:1: ( ( ruleSigQual )* 'sig' (lv_sigName_2= ruleName ) ( ',' (lv_name2_4= ruleName ) )* (lv_sigExt_5= ruleSigExt )? '{' ( (lv_decl_7= ruleDecl ) ( ',' (lv_decl2_9= ruleDecl ) )* )? '}' (lv_b_11= ruleBlockBis )? )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1623:1: ( ( ruleSigQual )* 'sig' (lv_sigName_2= ruleName ) ( ',' (lv_name2_4= ruleName ) )* (lv_sigExt_5= ruleSigExt )? '{' ( (lv_decl_7= ruleDecl ) ( ',' (lv_decl2_9= ruleDecl ) )* )? '}' (lv_b_11= ruleBlockBis )? )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1623:2: ( ruleSigQual )* 'sig' (lv_sigName_2= ruleName ) ( ',' (lv_name2_4= ruleName ) )* (lv_sigExt_5= ruleSigExt )? '{' ( (lv_decl_7= ruleDecl ) ( ',' (lv_decl2_9= ruleDecl ) )* )? '}' (lv_b_11= ruleBlockBis )?
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1623:2: ( ruleSigQual )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==18||(LA44_0>=42 && LA44_0<=45)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1623:3: ruleSigQual
            	    {
            	    pushFollow(FOLLOW_ruleSigQual_in_ruleSigDecl3579);
            	    ruleSigQual();
            	    _fsp--;
            	    if (failed) return current;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            match(input,41,FOLLOW_41_in_ruleSigDecl3582); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getSigKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1627:1: (lv_sigName_2= ruleName )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1630:6: lv_sigName_2= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigNameNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleSigDecl3616);
            lv_sigName_2=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "sigName", lv_sigName_2, "Name", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1648:2: ( ',' (lv_name2_4= ruleName ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==16) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1648:3: ',' (lv_name2_4= ruleName )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleSigDecl3630); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getSigDeclAccess().getCommaKeyword_3_0(), null); 
            	          
            	    }
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1652:1: (lv_name2_4= ruleName )
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1655:6: lv_name2_4= ruleName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getName2NameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleName_in_ruleSigDecl3664);
            	    lv_name2_4=ruleName();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "name2", lv_name2_4, "Name", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1673:4: (lv_sigExt_5= ruleSigExt )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=46 && LA46_0<=47)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1676:6: lv_sigExt_5= ruleSigExt
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getSigExtSigExtParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSigExt_in_ruleSigDecl3704);
                    lv_sigExt_5=ruleSigExt();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sigExt", lv_sigExt_5, "SigExt", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            match(input,39,FOLLOW_39_in_ruleSigDecl3718); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getLeftCurlyBracketKeyword_5(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1698:1: ( (lv_decl_7= ruleDecl ) ( ',' (lv_decl2_9= ruleDecl ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==18||LA48_0==85||LA48_0==88) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1698:2: (lv_decl_7= ruleDecl ) ( ',' (lv_decl2_9= ruleDecl ) )*
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1698:2: (lv_decl_7= ruleDecl )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1701:6: lv_decl_7= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDeclDeclParserRuleCall_6_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl3753);
                    lv_decl_7=ruleDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "decl", lv_decl_7, "Decl", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1719:2: ( ',' (lv_decl2_9= ruleDecl ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==16) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1719:3: ',' (lv_decl2_9= ruleDecl )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleSigDecl3767); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getSigDeclAccess().getCommaKeyword_6_1_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1723:1: (lv_decl2_9= ruleDecl )
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1726:6: lv_decl2_9= ruleDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getDecl2DeclParserRuleCall_6_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDecl_in_ruleSigDecl3801);
                    	    lv_decl2_9=ruleDecl();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "decl2", lv_decl2_9, "Decl", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,40,FOLLOW_40_in_ruleSigDecl3818); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSigDeclAccess().getRightCurlyBracketKeyword_7(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1748:1: (lv_b_11= ruleBlockBis )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1751:6: lv_b_11= ruleBlockBis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigDeclAccess().getBBlockBisParserRuleCall_8_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockBis_in_ruleSigDecl3852);
                    lv_b_11=ruleBlockBis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "b", lv_b_11, "BlockBis", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1776:1: entryRuleSigQual returns [String current=null] : iv_ruleSigQual= ruleSigQual EOF ;
    public final String entryRuleSigQual() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSigQual = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1776:48: (iv_ruleSigQual= ruleSigQual EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1777:2: iv_ruleSigQual= ruleSigQual EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigQualRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigQual_in_entryRuleSigQual3891);
            iv_ruleSigQual=ruleSigQual();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigQual.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigQual3902); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1784:1: ruleSigQual returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abstract' | kw= 'lone' | kw= 'one' | kw= 'some' | kw= 'private' ) ;
    public final AntlrDatatypeRuleToken ruleSigQual() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1790:6: ( (kw= 'abstract' | kw= 'lone' | kw= 'one' | kw= 'some' | kw= 'private' ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1791:1: (kw= 'abstract' | kw= 'lone' | kw= 'one' | kw= 'some' | kw= 'private' )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1791:1: (kw= 'abstract' | kw= 'lone' | kw= 'one' | kw= 'some' | kw= 'private' )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt50=1;
                }
                break;
            case 43:
                {
                alt50=2;
                }
                break;
            case 44:
                {
                alt50=3;
                }
                break;
            case 45:
                {
                alt50=4;
                }
                break;
            case 18:
                {
                alt50=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1791:1: (kw= 'abstract' | kw= 'lone' | kw= 'one' | kw= 'some' | kw= 'private' )", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1792:2: kw= 'abstract'
                    {
                    kw=(Token)input.LT(1);
                    match(input,42,FOLLOW_42_in_ruleSigQual3940); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSigQualAccess().getAbstractKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1799:2: kw= 'lone'
                    {
                    kw=(Token)input.LT(1);
                    match(input,43,FOLLOW_43_in_ruleSigQual3959); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSigQualAccess().getLoneKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1806:2: kw= 'one'
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleSigQual3978); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSigQualAccess().getOneKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1813:2: kw= 'some'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleSigQual3997); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSigQualAccess().getSomeKeyword_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1820:2: kw= 'private'
                    {
                    kw=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleSigQual4016); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getSigQualAccess().getPrivateKeyword_4(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
              	    lastConsumedDatatypeToken = current;
                  
            }
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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1833:1: entryRuleSigExt returns [EObject current=null] : iv_ruleSigExt= ruleSigExt EOF ;
    public final EObject entryRuleSigExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExt = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1833:48: (iv_ruleSigExt= ruleSigExt EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1834:2: iv_ruleSigExt= ruleSigExt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSigExtRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSigExt_in_entryRuleSigExt4054);
            iv_ruleSigExt=ruleSigExt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSigExt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExt4064); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1841:1: ruleSigExt returns [EObject current=null] : ( ( 'extends' (lv_ref_1= ruleRef ) ) | ( 'in' (lv_ref_3= ruleRef ) ( '+' (lv_ref2_5= ruleRef ) )* ) ) ;
    public final EObject ruleSigExt() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_1 = null;

        EObject lv_ref_3 = null;

        EObject lv_ref2_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1846:6: ( ( ( 'extends' (lv_ref_1= ruleRef ) ) | ( 'in' (lv_ref_3= ruleRef ) ( '+' (lv_ref2_5= ruleRef ) )* ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1847:1: ( ( 'extends' (lv_ref_1= ruleRef ) ) | ( 'in' (lv_ref_3= ruleRef ) ( '+' (lv_ref2_5= ruleRef ) )* ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1847:1: ( ( 'extends' (lv_ref_1= ruleRef ) ) | ( 'in' (lv_ref_3= ruleRef ) ( '+' (lv_ref2_5= ruleRef ) )* ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            else if ( (LA52_0==47) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1847:1: ( ( 'extends' (lv_ref_1= ruleRef ) ) | ( 'in' (lv_ref_3= ruleRef ) ( '+' (lv_ref2_5= ruleRef ) )* ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1847:2: ( 'extends' (lv_ref_1= ruleRef ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1847:2: ( 'extends' (lv_ref_1= ruleRef ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1847:3: 'extends' (lv_ref_1= ruleRef )
                    {
                    match(input,46,FOLLOW_46_in_ruleSigExt4099); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getExtendsKeyword_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1851:1: (lv_ref_1= ruleRef )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1854:6: lv_ref_1= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefRefParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleSigExt4133);
                    lv_ref_1=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigExtRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "ref", lv_ref_1, "Ref", currentNode);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1873:6: ( 'in' (lv_ref_3= ruleRef ) ( '+' (lv_ref2_5= ruleRef ) )* )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1873:6: ( 'in' (lv_ref_3= ruleRef ) ( '+' (lv_ref2_5= ruleRef ) )* )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1873:7: 'in' (lv_ref_3= ruleRef ) ( '+' (lv_ref2_5= ruleRef ) )*
                    {
                    match(input,47,FOLLOW_47_in_ruleSigExt4154); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSigExtAccess().getInKeyword_1_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1877:1: (lv_ref_3= ruleRef )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1880:6: lv_ref_3= ruleRef
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRefRefParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRef_in_ruleSigExt4188);
                    lv_ref_3=ruleRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSigExtRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "ref", lv_ref_3, "Ref", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1898:2: ( '+' (lv_ref2_5= ruleRef ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==48) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1898:3: '+' (lv_ref2_5= ruleRef )
                    	    {
                    	    match(input,48,FOLLOW_48_in_ruleSigExt4202); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getSigExtAccess().getPlusSignKeyword_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1902:1: (lv_ref2_5= ruleRef )
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1905:6: lv_ref2_5= ruleRef
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSigExtAccess().getRef2RefParserRuleCall_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRef_in_ruleSigExt4236);
                    	    lv_ref2_5=ruleRef();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSigExtRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "ref2", lv_ref2_5, "Ref", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1930:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1930:52: (iv_ruleExpression= ruleExpression EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1931:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4276);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4286); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1938:1: ruleExpression returns [EObject current=null] : ( (lv_term_0= ruleTerminalExpr ) ( ( '[' (lv_exprT_2= ruleExpression )* ']' ) | ( (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression ) ) | ( ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression ) ) | ( (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression ) ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_4=null;
        Token lv_op_8=null;
        EObject lv_term_0 = null;

        EObject lv_exprT_2 = null;

        EObject lv_right_5 = null;

        EObject lv_right_9 = null;

        EObject lv_arrowOp_10 = null;

        EObject lv_right_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1943:6: ( ( (lv_term_0= ruleTerminalExpr ) ( ( '[' (lv_exprT_2= ruleExpression )* ']' ) | ( (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression ) ) | ( ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression ) ) | ( (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression ) ) )? ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1944:1: ( (lv_term_0= ruleTerminalExpr ) ( ( '[' (lv_exprT_2= ruleExpression )* ']' ) | ( (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression ) ) | ( ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression ) ) | ( (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression ) ) )? )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1944:1: ( (lv_term_0= ruleTerminalExpr ) ( ( '[' (lv_exprT_2= ruleExpression )* ']' ) | ( (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression ) ) | ( ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression ) ) | ( (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression ) ) )? )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1944:2: (lv_term_0= ruleTerminalExpr ) ( ( '[' (lv_exprT_2= ruleExpression )* ']' ) | ( (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression ) ) | ( ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression ) ) | ( (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression ) ) )?
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1944:2: (lv_term_0= ruleTerminalExpr )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1947:6: lv_term_0= ruleTerminalExpr
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getTermTerminalExprParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTerminalExpr_in_ruleExpression4345);
            lv_term_0=ruleTerminalExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "term", lv_term_0, "TerminalExpr", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1965:2: ( ( '[' (lv_exprT_2= ruleExpression )* ']' ) | ( (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression ) ) | ( ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression ) ) | ( (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression ) ) )?
            int alt57=5;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    alt57=1;
                    }
                    break;
                case 24:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                    {
                    alt57=2;
                    }
                    break;
                case 63:
                    {
                    int LA57_3 = input.LA(2);

                    if ( (LA57_3==47||(LA57_3>=65 && LA57_3<=69)) ) {
                        alt57=3;
                    }
                    }
                    break;
                case 64:
                    {
                    int LA57_4 = input.LA(2);

                    if ( (LA57_4==47||(LA57_4>=65 && LA57_4<=69)) ) {
                        alt57=3;
                    }
                    }
                    break;
                case 47:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                    {
                    alt57=3;
                    }
                    break;
                case 45:
                    {
                    int LA57_6 = input.LA(2);

                    if ( (LA57_6==86) ) {
                        alt57=4;
                    }
                    }
                    break;
                case 44:
                    {
                    int LA57_7 = input.LA(2);

                    if ( (LA57_7==86) ) {
                        alt57=4;
                    }
                    }
                    break;
                case 43:
                    {
                    int LA57_8 = input.LA(2);

                    if ( (LA57_8==86) ) {
                        alt57=4;
                    }
                    }
                    break;
                case 73:
                    {
                    int LA57_9 = input.LA(2);

                    if ( (LA57_9==86) ) {
                        alt57=4;
                    }
                    }
                    break;
                case 86:
                    {
                    alt57=4;
                    }
                    break;
            }

            switch (alt57) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1965:3: ( '[' (lv_exprT_2= ruleExpression )* ']' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1965:3: ( '[' (lv_exprT_2= ruleExpression )* ']' )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1965:4: '[' (lv_exprT_2= ruleExpression )* ']'
                    {
                    match(input,14,FOLLOW_14_in_ruleExpression4360); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_0_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1969:1: (lv_exprT_2= ruleExpression )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=RULE_INT && LA53_0<=RULE_INTEGER)||LA53_0==25||LA53_0==37||LA53_0==39||(LA53_0>=43 && LA53_0<=45)||(LA53_0>=63 && LA53_0<=64)||(LA53_0>=70 && LA53_0<=84)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1972:6: lv_exprT_2= ruleExpression
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getExprTExpressionParserRuleCall_1_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4394);
                    	    lv_exprT_2=ruleExpression();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		set(current, "exprT", lv_exprT_2, "Expression", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_ruleExpression4408); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1995:6: ( (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1995:6: ( (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1995:7: (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) ) (lv_right_5= ruleExpression )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1995:7: (lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1997:6: lv_op_4= ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1997:14: ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' )
                    int alt54=16;
                    switch ( input.LA(1) ) {
                    case 48:
                        {
                        alt54=1;
                        }
                        break;
                    case 49:
                        {
                        alt54=2;
                        }
                        break;
                    case 24:
                        {
                        alt54=3;
                        }
                        break;
                    case 50:
                        {
                        alt54=4;
                        }
                        break;
                    case 51:
                        {
                        alt54=5;
                        }
                        break;
                    case 52:
                        {
                        alt54=6;
                        }
                        break;
                    case 53:
                        {
                        alt54=7;
                        }
                        break;
                    case 54:
                        {
                        alt54=8;
                        }
                        break;
                    case 55:
                        {
                        alt54=9;
                        }
                        break;
                    case 56:
                        {
                        alt54=10;
                        }
                        break;
                    case 57:
                        {
                        alt54=11;
                        }
                        break;
                    case 58:
                        {
                        alt54=12;
                        }
                        break;
                    case 59:
                        {
                        alt54=13;
                        }
                        break;
                    case 60:
                        {
                        alt54=14;
                        }
                        break;
                    case 61:
                        {
                        alt54=15;
                        }
                        break;
                    case 62:
                        {
                        alt54=16;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1997:14: ( '+' | '&' | '.' | '-' | '||' | 'or' | '&&' | 'and' | '<=>' | 'iff' | '++' | '<:' | ':>' | '<<' | '>>' | '>>>' )", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:1997:15: '+'
                            {
                            match(input,48,FOLLOW_48_in_ruleExpression4438); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpPlusSignKeyword_1_1_0_0_0(), "op"); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2003:6: '&'
                            {
                            match(input,49,FOLLOW_49_in_ruleExpression4454); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpAmpersandKeyword_1_1_0_0_1(), "op"); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2009:6: '.'
                            {
                            match(input,24,FOLLOW_24_in_ruleExpression4470); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpFullStopKeyword_1_1_0_0_2(), "op"); 
                                  
                            }

                            }
                            break;
                        case 4 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2015:6: '-'
                            {
                            match(input,50,FOLLOW_50_in_ruleExpression4486); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpHyphenMinusKeyword_1_1_0_0_3(), "op"); 
                                  
                            }

                            }
                            break;
                        case 5 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2021:6: '||'
                            {
                            match(input,51,FOLLOW_51_in_ruleExpression4502); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_0_4(), "op"); 
                                  
                            }

                            }
                            break;
                        case 6 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2027:6: 'or'
                            {
                            match(input,52,FOLLOW_52_in_ruleExpression4518); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpOrKeyword_1_1_0_0_5(), "op"); 
                                  
                            }

                            }
                            break;
                        case 7 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2033:6: '&&'
                            {
                            match(input,53,FOLLOW_53_in_ruleExpression4534); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpAmpersandAmpersandKeyword_1_1_0_0_6(), "op"); 
                                  
                            }

                            }
                            break;
                        case 8 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2039:6: 'and'
                            {
                            match(input,54,FOLLOW_54_in_ruleExpression4550); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpAndKeyword_1_1_0_0_7(), "op"); 
                                  
                            }

                            }
                            break;
                        case 9 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2045:6: '<=>'
                            {
                            match(input,55,FOLLOW_55_in_ruleExpression4566); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpLessThanSignEqualsSignGreaterThanSignKeyword_1_1_0_0_8(), "op"); 
                                  
                            }

                            }
                            break;
                        case 10 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2051:6: 'iff'
                            {
                            match(input,56,FOLLOW_56_in_ruleExpression4582); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpIffKeyword_1_1_0_0_9(), "op"); 
                                  
                            }

                            }
                            break;
                        case 11 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2057:6: '++'
                            {
                            match(input,57,FOLLOW_57_in_ruleExpression4598); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpPlusSignPlusSignKeyword_1_1_0_0_10(), "op"); 
                                  
                            }

                            }
                            break;
                        case 12 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2063:6: '<:'
                            {
                            match(input,58,FOLLOW_58_in_ruleExpression4614); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpLessThanSignColonKeyword_1_1_0_0_11(), "op"); 
                                  
                            }

                            }
                            break;
                        case 13 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2069:6: ':>'
                            {
                            match(input,59,FOLLOW_59_in_ruleExpression4630); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpColonGreaterThanSignKeyword_1_1_0_0_12(), "op"); 
                                  
                            }

                            }
                            break;
                        case 14 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2075:6: '<<'
                            {
                            match(input,60,FOLLOW_60_in_ruleExpression4646); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpLessThanSignLessThanSignKeyword_1_1_0_0_13(), "op"); 
                                  
                            }

                            }
                            break;
                        case 15 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2081:6: '>>'
                            {
                            match(input,61,FOLLOW_61_in_ruleExpression4662); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_1_0_0_14(), "op"); 
                                  
                            }

                            }
                            break;
                        case 16 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2087:6: '>>>'
                            {
                            match(input,62,FOLLOW_62_in_ruleExpression4678); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_1_0_0_15(), "op"); 
                                  
                            }

                            }
                            break;

                    }

                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "op", /* lv_op_4 */ input.LT(-1), null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2107:2: (lv_right_5= ruleExpression )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2110:6: lv_right_5= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4727);
                    lv_right_5=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "right", lv_right_5, "Expression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2129:6: ( ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2129:6: ( ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2129:7: ( '!' | 'not' )? (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) ) (lv_right_9= ruleExpression )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2129:7: ( '!' | 'not' )?
                    int alt55=3;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==63) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==64) ) {
                        alt55=2;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2129:8: '!'
                            {
                            match(input,63,FOLLOW_63_in_ruleExpression4749); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getExclamationMarkKeyword_1_2_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2134:6: 'not'
                            {
                            match(input,64,FOLLOW_64_in_ruleExpression4764); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getNotKeyword_1_2_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2138:3: (lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2140:6: lv_op_8= ( '=' | 'in' | '<' | '>' | '<=' | '=>' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2140:14: ( '=' | 'in' | '<' | '>' | '<=' | '=>' )
                    int alt56=6;
                    switch ( input.LA(1) ) {
                    case 65:
                        {
                        alt56=1;
                        }
                        break;
                    case 47:
                        {
                        alt56=2;
                        }
                        break;
                    case 66:
                        {
                        alt56=3;
                        }
                        break;
                    case 67:
                        {
                        alt56=4;
                        }
                        break;
                    case 68:
                        {
                        alt56=5;
                        }
                        break;
                    case 69:
                        {
                        alt56=6;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2140:14: ( '=' | 'in' | '<' | '>' | '<=' | '=>' )", 56, 0, input);

                        throw nvae;
                    }

                    switch (alt56) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2140:15: '='
                            {
                            match(input,65,FOLLOW_65_in_ruleExpression4788); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpEqualsSignKeyword_1_2_1_0_0(), "op"); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2146:6: 'in'
                            {
                            match(input,47,FOLLOW_47_in_ruleExpression4804); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpInKeyword_1_2_1_0_1(), "op"); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2152:6: '<'
                            {
                            match(input,66,FOLLOW_66_in_ruleExpression4820); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpLessThanSignKeyword_1_2_1_0_2(), "op"); 
                                  
                            }

                            }
                            break;
                        case 4 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2158:6: '>'
                            {
                            match(input,67,FOLLOW_67_in_ruleExpression4836); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpGreaterThanSignKeyword_1_2_1_0_3(), "op"); 
                                  
                            }

                            }
                            break;
                        case 5 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2164:6: '<='
                            {
                            match(input,68,FOLLOW_68_in_ruleExpression4852); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_2_1_0_4(), "op"); 
                                  
                            }

                            }
                            break;
                        case 6 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2170:6: '=>'
                            {
                            match(input,69,FOLLOW_69_in_ruleExpression4868); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getExpressionAccess().getOpEqualsSignGreaterThanSignKeyword_1_2_1_0_5(), "op"); 
                                  
                            }

                            }
                            break;

                    }

                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "op", /* lv_op_8 */ input.LT(-1), null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2190:2: (lv_right_9= ruleExpression )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2193:6: lv_right_9= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression4917);
                    lv_right_9=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "right", lv_right_9, "Expression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2212:6: ( (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2212:6: ( (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2212:7: (lv_arrowOp_10= ruleArrowOp ) (lv_right_11= ruleExpression )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2212:7: (lv_arrowOp_10= ruleArrowOp )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2215:6: lv_arrowOp_10= ruleArrowOp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getArrowOpArrowOpParserRuleCall_1_3_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrowOp_in_ruleExpression4963);
                    lv_arrowOp_10=ruleArrowOp();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "arrowOp", lv_arrowOp_10, "ArrowOp", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2233:2: (lv_right_11= ruleExpression )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2236:6: lv_right_11= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_1_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression5001);
                    lv_right_11=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "right", lv_right_11, "Expression", currentNode);
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleTerminalExpr
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2261:1: entryRuleTerminalExpr returns [EObject current=null] : iv_ruleTerminalExpr= ruleTerminalExpr EOF ;
    public final EObject entryRuleTerminalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpr = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2261:54: (iv_ruleTerminalExpr= ruleTerminalExpr EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2262:2: iv_ruleTerminalExpr= ruleTerminalExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTerminalExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTerminalExpr_in_entryRuleTerminalExpr5041);
            iv_ruleTerminalExpr=ruleTerminalExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTerminalExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpr5051); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTerminalExpr


    // $ANTLR start ruleTerminalExpr
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2269:1: ruleTerminalExpr returns [EObject current=null] : ( ( 'let' this_LetDecl_1= ruleLetDecl ( ',' (lv_letDecl_3= ruleLetDecl ) )* (lv_blockOrBarBis_4= ruleBlockOrBarBis ) ) | ( ( 'all' | 'sum' ) (lv_decl_7= ruleDecl ) (lv_b_8= ruleBlockOrBarBis ) ) | ( ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' ) this_TerminalExpr_17= ruleTerminalExpr ) | ( ( 'no' | 'some' | 'lone' | 'one' ) (lv_t_22= ruleTerminalExpr ) ) | RULE_INT | RULE_INTEGER | 'none' | 'iden' | 'univ' | 'Int' | 'seq/Int' | ( '(' (lv_exprT_31= ruleExpression ) ')' ) | ( ( '@' )? ( RULE_ID ) ) | ( '{' (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) ) ) ) ;
    public final EObject ruleTerminalExpr() throws RecognitionException {
        EObject current = null;

        EObject this_LetDecl_1 = null;

        EObject lv_letDecl_3 = null;

        EObject lv_blockOrBarBis_4 = null;

        EObject lv_decl_7 = null;

        EObject lv_b_8 = null;

        EObject this_TerminalExpr_17 = null;

        EObject lv_t_22 = null;

        EObject lv_exprT_31 = null;

        EObject this_Block_36 = null;

        EObject lv_decl_37 = null;

        EObject lv_blockOrBar_39 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2274:6: ( ( ( 'let' this_LetDecl_1= ruleLetDecl ( ',' (lv_letDecl_3= ruleLetDecl ) )* (lv_blockOrBarBis_4= ruleBlockOrBarBis ) ) | ( ( 'all' | 'sum' ) (lv_decl_7= ruleDecl ) (lv_b_8= ruleBlockOrBarBis ) ) | ( ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' ) this_TerminalExpr_17= ruleTerminalExpr ) | ( ( 'no' | 'some' | 'lone' | 'one' ) (lv_t_22= ruleTerminalExpr ) ) | RULE_INT | RULE_INTEGER | 'none' | 'iden' | 'univ' | 'Int' | 'seq/Int' | ( '(' (lv_exprT_31= ruleExpression ) ')' ) | ( ( '@' )? ( RULE_ID ) ) | ( '{' (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) ) ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2275:1: ( ( 'let' this_LetDecl_1= ruleLetDecl ( ',' (lv_letDecl_3= ruleLetDecl ) )* (lv_blockOrBarBis_4= ruleBlockOrBarBis ) ) | ( ( 'all' | 'sum' ) (lv_decl_7= ruleDecl ) (lv_b_8= ruleBlockOrBarBis ) ) | ( ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' ) this_TerminalExpr_17= ruleTerminalExpr ) | ( ( 'no' | 'some' | 'lone' | 'one' ) (lv_t_22= ruleTerminalExpr ) ) | RULE_INT | RULE_INTEGER | 'none' | 'iden' | 'univ' | 'Int' | 'seq/Int' | ( '(' (lv_exprT_31= ruleExpression ) ')' ) | ( ( '@' )? ( RULE_ID ) ) | ( '{' (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) ) ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2275:1: ( ( 'let' this_LetDecl_1= ruleLetDecl ( ',' (lv_letDecl_3= ruleLetDecl ) )* (lv_blockOrBarBis_4= ruleBlockOrBarBis ) ) | ( ( 'all' | 'sum' ) (lv_decl_7= ruleDecl ) (lv_b_8= ruleBlockOrBarBis ) ) | ( ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' ) this_TerminalExpr_17= ruleTerminalExpr ) | ( ( 'no' | 'some' | 'lone' | 'one' ) (lv_t_22= ruleTerminalExpr ) ) | RULE_INT | RULE_INTEGER | 'none' | 'iden' | 'univ' | 'Int' | 'seq/Int' | ( '(' (lv_exprT_31= ruleExpression ) ')' ) | ( ( '@' )? ( RULE_ID ) ) | ( '{' (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) ) ) )
            int alt65=14;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt65=1;
                }
                break;
            case 71:
            case 72:
                {
                alt65=2;
                }
                break;
            case 37:
            case 63:
            case 64:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt65=3;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 78:
                {
                alt65=4;
                }
                break;
            case RULE_INT:
                {
                alt65=5;
                }
                break;
            case RULE_INTEGER:
                {
                alt65=6;
                }
                break;
            case 79:
                {
                alt65=7;
                }
                break;
            case 80:
                {
                alt65=8;
                }
                break;
            case 81:
                {
                alt65=9;
                }
                break;
            case 82:
                {
                alt65=10;
                }
                break;
            case 83:
                {
                alt65=11;
                }
                break;
            case 25:
                {
                alt65=12;
                }
                break;
            case RULE_ID:
            case 84:
                {
                alt65=13;
                }
                break;
            case 39:
                {
                alt65=14;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2275:1: ( ( 'let' this_LetDecl_1= ruleLetDecl ( ',' (lv_letDecl_3= ruleLetDecl ) )* (lv_blockOrBarBis_4= ruleBlockOrBarBis ) ) | ( ( 'all' | 'sum' ) (lv_decl_7= ruleDecl ) (lv_b_8= ruleBlockOrBarBis ) ) | ( ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' ) this_TerminalExpr_17= ruleTerminalExpr ) | ( ( 'no' | 'some' | 'lone' | 'one' ) (lv_t_22= ruleTerminalExpr ) ) | RULE_INT | RULE_INTEGER | 'none' | 'iden' | 'univ' | 'Int' | 'seq/Int' | ( '(' (lv_exprT_31= ruleExpression ) ')' ) | ( ( '@' )? ( RULE_ID ) ) | ( '{' (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) ) ) )", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2275:2: ( 'let' this_LetDecl_1= ruleLetDecl ( ',' (lv_letDecl_3= ruleLetDecl ) )* (lv_blockOrBarBis_4= ruleBlockOrBarBis ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2275:2: ( 'let' this_LetDecl_1= ruleLetDecl ( ',' (lv_letDecl_3= ruleLetDecl ) )* (lv_blockOrBarBis_4= ruleBlockOrBarBis ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2275:3: 'let' this_LetDecl_1= ruleLetDecl ( ',' (lv_letDecl_3= ruleLetDecl ) )* (lv_blockOrBarBis_4= ruleBlockOrBarBis )
                    {
                    match(input,70,FOLLOW_70_in_ruleTerminalExpr5086); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getLetKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getLetDeclParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpr5108);
                    this_LetDecl_1=ruleLetDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LetDecl_1; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2288:1: ( ',' (lv_letDecl_3= ruleLetDecl ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==16) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2288:2: ',' (lv_letDecl_3= ruleLetDecl )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleTerminalExpr5117); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getTerminalExprAccess().getCommaKeyword_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2292:1: (lv_letDecl_3= ruleLetDecl )
                    	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2295:6: lv_letDecl_3= ruleLetDecl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getLetDeclLetDeclParserRuleCall_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLetDecl_in_ruleTerminalExpr5151);
                    	    lv_letDecl_3=ruleLetDecl();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		set(current, "letDecl", lv_letDecl_3, "LetDecl", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2313:4: (lv_blockOrBarBis_4= ruleBlockOrBarBis )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2316:6: lv_blockOrBarBis_4= ruleBlockOrBarBis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getBlockOrBarBisBlockOrBarBisParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBarBis_in_ruleTerminalExpr5191);
                    lv_blockOrBarBis_4=ruleBlockOrBarBis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "blockOrBarBis", lv_blockOrBarBis_4, "BlockOrBarBis", currentNode);
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
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2335:6: ( ( 'all' | 'sum' ) (lv_decl_7= ruleDecl ) (lv_b_8= ruleBlockOrBarBis ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2335:6: ( ( 'all' | 'sum' ) (lv_decl_7= ruleDecl ) (lv_b_8= ruleBlockOrBarBis ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2335:7: ( 'all' | 'sum' ) (lv_decl_7= ruleDecl ) (lv_b_8= ruleBlockOrBarBis )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2335:7: ( 'all' | 'sum' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==71) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==72) ) {
                        alt59=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2335:7: ( 'all' | 'sum' )", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2335:8: 'all'
                            {
                            match(input,71,FOLLOW_71_in_ruleTerminalExpr5213); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getAllKeyword_1_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2340:6: 'sum'
                            {
                            match(input,72,FOLLOW_72_in_ruleTerminalExpr5228); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getSumKeyword_1_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2344:2: (lv_decl_7= ruleDecl )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2347:6: lv_decl_7= ruleDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getDeclDeclParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpr5263);
                    lv_decl_7=ruleDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "decl", lv_decl_7, "Decl", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2365:2: (lv_b_8= ruleBlockOrBarBis )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2368:6: lv_b_8= ruleBlockOrBarBis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getBBlockOrBarBisParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockOrBarBis_in_ruleTerminalExpr5301);
                    lv_b_8=ruleBlockOrBarBis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "b", lv_b_8, "BlockOrBarBis", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2387:6: ( ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' ) this_TerminalExpr_17= ruleTerminalExpr )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2387:6: ( ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' ) this_TerminalExpr_17= ruleTerminalExpr )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2387:7: ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' ) this_TerminalExpr_17= ruleTerminalExpr
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2387:7: ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' )
                    int alt60=8;
                    switch ( input.LA(1) ) {
                    case 63:
                        {
                        alt60=1;
                        }
                        break;
                    case 64:
                        {
                        alt60=2;
                        }
                        break;
                    case 73:
                        {
                        alt60=3;
                        }
                        break;
                    case 37:
                        {
                        alt60=4;
                        }
                        break;
                    case 74:
                        {
                        alt60=5;
                        }
                        break;
                    case 75:
                        {
                        alt60=6;
                        }
                        break;
                    case 76:
                        {
                        alt60=7;
                        }
                        break;
                    case 77:
                        {
                        alt60=8;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2387:7: ( '!' | 'not' | 'set' | 'seq' | '#' | '~' | '*' | '^' )", 60, 0, input);

                        throw nvae;
                    }

                    switch (alt60) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2387:8: '!'
                            {
                            match(input,63,FOLLOW_63_in_ruleTerminalExpr5323); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getExclamationMarkKeyword_2_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2392:6: 'not'
                            {
                            match(input,64,FOLLOW_64_in_ruleTerminalExpr5338); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getNotKeyword_2_0_1(), null); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2397:6: 'set'
                            {
                            match(input,73,FOLLOW_73_in_ruleTerminalExpr5353); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getSetKeyword_2_0_2(), null); 
                                  
                            }

                            }
                            break;
                        case 4 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2402:6: 'seq'
                            {
                            match(input,37,FOLLOW_37_in_ruleTerminalExpr5368); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getSeqKeyword_2_0_3(), null); 
                                  
                            }

                            }
                            break;
                        case 5 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2407:6: '#'
                            {
                            match(input,74,FOLLOW_74_in_ruleTerminalExpr5383); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getNumberSignKeyword_2_0_4(), null); 
                                  
                            }

                            }
                            break;
                        case 6 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2412:6: '~'
                            {
                            match(input,75,FOLLOW_75_in_ruleTerminalExpr5398); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getTildeKeyword_2_0_5(), null); 
                                  
                            }

                            }
                            break;
                        case 7 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2417:6: '*'
                            {
                            match(input,76,FOLLOW_76_in_ruleTerminalExpr5413); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getAsteriskKeyword_2_0_6(), null); 
                                  
                            }

                            }
                            break;
                        case 8 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2422:6: '^'
                            {
                            match(input,77,FOLLOW_77_in_ruleTerminalExpr5428); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getCircumflexAccentKeyword_2_0_7(), null); 
                                  
                            }

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getTerminalExprParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTerminalExpr_in_ruleTerminalExpr5451);
                    this_TerminalExpr_17=ruleTerminalExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TerminalExpr_17; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2436:6: ( ( 'no' | 'some' | 'lone' | 'one' ) (lv_t_22= ruleTerminalExpr ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2436:6: ( ( 'no' | 'some' | 'lone' | 'one' ) (lv_t_22= ruleTerminalExpr ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2436:7: ( 'no' | 'some' | 'lone' | 'one' ) (lv_t_22= ruleTerminalExpr )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2436:7: ( 'no' | 'some' | 'lone' | 'one' )
                    int alt61=4;
                    switch ( input.LA(1) ) {
                    case 78:
                        {
                        alt61=1;
                        }
                        break;
                    case 45:
                        {
                        alt61=2;
                        }
                        break;
                    case 43:
                        {
                        alt61=3;
                        }
                        break;
                    case 44:
                        {
                        alt61=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2436:7: ( 'no' | 'some' | 'lone' | 'one' )", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2436:8: 'no'
                            {
                            match(input,78,FOLLOW_78_in_ruleTerminalExpr5468); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getNoKeyword_3_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2441:6: 'some'
                            {
                            match(input,45,FOLLOW_45_in_ruleTerminalExpr5483); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getSomeKeyword_3_0_1(), null); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2446:6: 'lone'
                            {
                            match(input,43,FOLLOW_43_in_ruleTerminalExpr5498); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getLoneKeyword_3_0_2(), null); 
                                  
                            }

                            }
                            break;
                        case 4 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2451:6: 'one'
                            {
                            match(input,44,FOLLOW_44_in_ruleTerminalExpr5513); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getOneKeyword_3_0_3(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2455:2: (lv_t_22= ruleTerminalExpr )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2458:6: lv_t_22= ruleTerminalExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getTTerminalExprParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTerminalExpr_in_ruleTerminalExpr5548);
                    lv_t_22=ruleTerminalExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "t", lv_t_22, "TerminalExpr", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2477:6: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerminalExpr5568); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExprAccess().getINTTerminalRuleCall_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2482:6: RULE_INTEGER
                    {
                    match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleTerminalExpr5582); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getTerminalExprAccess().getIntegerTerminalRuleCall_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2487:6: 'none'
                    {
                    match(input,79,FOLLOW_79_in_ruleTerminalExpr5596); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getNoneKeyword_6(), null); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2492:6: 'iden'
                    {
                    match(input,80,FOLLOW_80_in_ruleTerminalExpr5611); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getIdenKeyword_7(), null); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2497:6: 'univ'
                    {
                    match(input,81,FOLLOW_81_in_ruleTerminalExpr5626); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getUnivKeyword_8(), null); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2502:6: 'Int'
                    {
                    match(input,82,FOLLOW_82_in_ruleTerminalExpr5641); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getIntKeyword_9(), null); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2507:6: 'seq/Int'
                    {
                    match(input,83,FOLLOW_83_in_ruleTerminalExpr5656); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getSeqIntKeyword_10(), null); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2512:6: ( '(' (lv_exprT_31= ruleExpression ) ')' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2512:6: ( '(' (lv_exprT_31= ruleExpression ) ')' )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2512:7: '(' (lv_exprT_31= ruleExpression ) ')'
                    {
                    match(input,25,FOLLOW_25_in_ruleTerminalExpr5672); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getLeftParenthesisKeyword_11_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2516:1: (lv_exprT_31= ruleExpression )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2519:6: lv_exprT_31= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getExprTExpressionParserRuleCall_11_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTerminalExpr5706);
                    lv_exprT_31=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "exprT", lv_exprT_31, "Expression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,26,FOLLOW_26_in_ruleTerminalExpr5719); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getRightParenthesisKeyword_11_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2542:6: ( ( '@' )? ( RULE_ID ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2542:6: ( ( '@' )? ( RULE_ID ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2542:7: ( '@' )? ( RULE_ID )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2542:7: ( '@' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==84) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2542:8: '@'
                            {
                            match(input,84,FOLLOW_84_in_ruleTerminalExpr5737); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getCommercialAtKeyword_12_0(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2546:3: ( RULE_ID )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2549:3: RULE_ID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminalExpr5761); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTerminalExprAccess().getNameRefNameCrossReference_12_1_0(), "nameRef"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2563:6: ( '{' (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) ) )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2563:6: ( '{' (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) ) )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2563:7: '{' (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) )
                    {
                    match(input,39,FOLLOW_39_in_ruleTerminalExpr5781); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTerminalExprAccess().getLeftCurlyBracketKeyword_13_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2567:1: (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) )
                    int alt64=2;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                    case RULE_INTEGER:
                    case 25:
                    case 37:
                    case 39:
                    case 40:
                    case 43:
                    case 44:
                    case 45:
                    case 63:
                    case 64:
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
                    case 83:
                    case 84:
                        {
                        alt64=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA64_2 = input.LA(2);

                        if ( (LA64_2==16||LA64_2==27||LA64_2==89) ) {
                            alt64=2;
                        }
                        else if ( ((LA64_2>=RULE_INT && LA64_2<=RULE_INTEGER)||LA64_2==14||(LA64_2>=24 && LA64_2<=25)||LA64_2==37||(LA64_2>=39 && LA64_2<=40)||(LA64_2>=43 && LA64_2<=45)||(LA64_2>=47 && LA64_2<=84)||LA64_2==86) ) {
                            alt64=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2567:1: (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) )", 64, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 18:
                    case 85:
                    case 88:
                        {
                        alt64=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2567:1: (this_Block_36= ruleBlock | ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' ) )", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2568:5: this_Block_36= ruleBlock
                            {
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getBlockParserRuleCall_13_1_0(), currentNode); 
                                  
                            }
                            pushFollow(FOLLOW_ruleBlock_in_ruleTerminalExpr5804);
                            this_Block_36=ruleBlock();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                      current = this_Block_36; 
                                      currentNode = currentNode.getParent();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2577:6: ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' )
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2577:6: ( ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}' )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2577:7: ( (lv_decl_37= ruleDecl ) ',' )+ (lv_blockOrBar_39= ruleBlockOrBar ) '}'
                            {
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2577:7: ( (lv_decl_37= ruleDecl ) ',' )+
                            int cnt63=0;
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==RULE_ID||LA63_0==18||LA63_0==85||LA63_0==88) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2577:8: (lv_decl_37= ruleDecl ) ','
                            	    {
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2577:8: (lv_decl_37= ruleDecl )
                            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2580:6: lv_decl_37= ruleDecl
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getDeclDeclParserRuleCall_13_1_1_0_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDecl_in_ruleTerminalExpr5845);
                            	    lv_decl_37=ruleDecl();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        
                            	      	        try {
                            	      	       		set(current, "decl", lv_decl_37, "Decl", currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }

                            	    match(input,16,FOLLOW_16_in_ruleTerminalExpr5858); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getTerminalExprAccess().getCommaKeyword_13_1_1_0_1(), null); 
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt63 >= 1 ) break loop63;
                            	    if (backtracking>0) {failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(63, input);
                                        throw eee;
                                }
                                cnt63++;
                            } while (true);

                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2602:3: (lv_blockOrBar_39= ruleBlockOrBar )
                            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2605:6: lv_blockOrBar_39= ruleBlockOrBar
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTerminalExprAccess().getBlockOrBarBlockOrBarParserRuleCall_13_1_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlockOrBar_in_ruleTerminalExpr5894);
                            lv_blockOrBar_39=ruleBlockOrBar();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTerminalExprRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "blockOrBar", lv_blockOrBar_39, "BlockOrBar", currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }

                            match(input,40,FOLLOW_40_in_ruleTerminalExpr5907); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTerminalExprAccess().getRightCurlyBracketKeyword_13_1_1_2(), null); 
                                  
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
    // $ANTLR end ruleTerminalExpr


    // $ANTLR start entryRuleDecl
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2634:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2634:46: (iv_ruleDecl= ruleDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2635:2: iv_ruleDecl= ruleDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl5943);
            iv_ruleDecl=ruleDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl5953); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2642:1: ruleDecl returns [EObject current=null] : ( ( 'private' )? ( 'disj' )? (lv_name_2= ruleName ) ( ',' (lv_suite_4= ruleName ) )* ':' ( 'disj' )? (lv_exprDecl_7= ruleExpression ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_name_2 = null;

        EObject lv_suite_4 = null;

        EObject lv_exprDecl_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2647:6: ( ( ( 'private' )? ( 'disj' )? (lv_name_2= ruleName ) ( ',' (lv_suite_4= ruleName ) )* ':' ( 'disj' )? (lv_exprDecl_7= ruleExpression ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2648:1: ( ( 'private' )? ( 'disj' )? (lv_name_2= ruleName ) ( ',' (lv_suite_4= ruleName ) )* ':' ( 'disj' )? (lv_exprDecl_7= ruleExpression ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2648:1: ( ( 'private' )? ( 'disj' )? (lv_name_2= ruleName ) ( ',' (lv_suite_4= ruleName ) )* ':' ( 'disj' )? (lv_exprDecl_7= ruleExpression ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2648:2: ( 'private' )? ( 'disj' )? (lv_name_2= ruleName ) ( ',' (lv_suite_4= ruleName ) )* ':' ( 'disj' )? (lv_exprDecl_7= ruleExpression )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2648:2: ( 'private' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==18) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2648:3: 'private'
                    {
                    match(input,18,FOLLOW_18_in_ruleDecl5988); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getPrivateKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2652:3: ( 'disj' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==85) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2652:4: 'disj'
                    {
                    match(input,85,FOLLOW_85_in_ruleDecl6000); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2656:3: (lv_name_2= ruleName )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2659:6: lv_name_2= ruleName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getNameNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleName_in_ruleDecl6036);
            lv_name_2=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_2, "Name", currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2677:2: ( ',' (lv_suite_4= ruleName ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==16) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2677:3: ',' (lv_suite_4= ruleName )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleDecl6050); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getDeclAccess().getCommaKeyword_3_0(), null); 
            	          
            	    }
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2681:1: (lv_suite_4= ruleName )
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2684:6: lv_suite_4= ruleName
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getSuiteNameParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleName_in_ruleDecl6084);
            	    lv_suite_4=ruleName();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "suite", lv_suite_4, "Name", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            match(input,27,FOLLOW_27_in_ruleDecl6099); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeclAccess().getColonKeyword_4(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2706:1: ( 'disj' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==85) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2706:2: 'disj'
                    {
                    match(input,85,FOLLOW_85_in_ruleDecl6109); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclAccess().getDisjKeyword_5(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2710:3: (lv_exprDecl_7= ruleExpression )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2713:6: lv_exprDecl_7= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDeclAccess().getExprDeclExpressionParserRuleCall_6_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDecl6145);
            lv_exprDecl_7=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "exprDecl", lv_exprDecl_7, "Expression", currentNode);
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
    // $ANTLR end ruleDecl


    // $ANTLR start entryRuleLetDecl
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2740:1: entryRuleLetDecl returns [EObject current=null] : iv_ruleLetDecl= ruleLetDecl EOF ;
    public final EObject entryRuleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDecl = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2740:49: (iv_ruleLetDecl= ruleLetDecl EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2741:2: iv_ruleLetDecl= ruleLetDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLetDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLetDecl_in_entryRuleLetDecl6184);
            iv_ruleLetDecl=ruleLetDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLetDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDecl6194); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2748:1: ruleLetDecl returns [EObject current=null] : (this_Name_0= ruleName '=' (lv_exprLet_2= ruleExpression ) ) ;
    public final EObject ruleLetDecl() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject lv_exprLet_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2753:6: ( (this_Name_0= ruleName '=' (lv_exprLet_2= ruleExpression ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2754:1: (this_Name_0= ruleName '=' (lv_exprLet_2= ruleExpression ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2754:1: (this_Name_0= ruleName '=' (lv_exprLet_2= ruleExpression ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2755:5: this_Name_0= ruleName '=' (lv_exprLet_2= ruleExpression )
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getNameParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleName_in_ruleLetDecl6241);
            this_Name_0=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Name_0; 
                      currentNode = currentNode.getParent();
                  
            }
            match(input,65,FOLLOW_65_in_ruleLetDecl6249); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getLetDeclAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2767:1: (lv_exprLet_2= ruleExpression )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2770:6: lv_exprLet_2= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getLetDeclAccess().getExprLetExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetDecl6283);
            lv_exprLet_2=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getLetDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "exprLet", lv_exprLet_2, "Expression", currentNode);
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
    // $ANTLR end ruleLetDecl


    // $ANTLR start entryRuleArrowOp
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2795:1: entryRuleArrowOp returns [EObject current=null] : iv_ruleArrowOp= ruleArrowOp EOF ;
    public final EObject entryRuleArrowOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowOp = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2795:49: (iv_ruleArrowOp= ruleArrowOp EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2796:2: iv_ruleArrowOp= ruleArrowOp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArrowOpRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArrowOp_in_entryRuleArrowOp6320);
            iv_ruleArrowOp=ruleArrowOp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArrowOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowOp6330); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2803:1: ruleArrowOp returns [EObject current=null] : ( ( 'some' | 'one' | 'lone' | 'set' )? (lv_s_4= '->' ) ) ;
    public final EObject ruleArrowOp() throws RecognitionException {
        EObject current = null;

        Token lv_s_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2808:6: ( ( ( 'some' | 'one' | 'lone' | 'set' )? (lv_s_4= '->' ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2809:1: ( ( 'some' | 'one' | 'lone' | 'set' )? (lv_s_4= '->' ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2809:1: ( ( 'some' | 'one' | 'lone' | 'set' )? (lv_s_4= '->' ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2809:2: ( 'some' | 'one' | 'lone' | 'set' )? (lv_s_4= '->' )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2809:2: ( 'some' | 'one' | 'lone' | 'set' )?
            int alt70=5;
            switch ( input.LA(1) ) {
                case 45:
                    {
                    alt70=1;
                    }
                    break;
                case 44:
                    {
                    alt70=2;
                    }
                    break;
                case 43:
                    {
                    alt70=3;
                    }
                    break;
                case 73:
                    {
                    alt70=4;
                    }
                    break;
            }

            switch (alt70) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2809:3: 'some'
                    {
                    match(input,45,FOLLOW_45_in_ruleArrowOp6365); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSomeKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2814:6: 'one'
                    {
                    match(input,44,FOLLOW_44_in_ruleArrowOp6380); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getOneKeyword_0_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2819:6: 'lone'
                    {
                    match(input,43,FOLLOW_43_in_ruleArrowOp6395); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getLoneKeyword_0_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2824:6: 'set'
                    {
                    match(input,73,FOLLOW_73_in_ruleArrowOp6410); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArrowOpAccess().getSetKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2828:3: (lv_s_4= '->' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2830:6: lv_s_4= '->'
            {
            lv_s_4=(Token)input.LT(1);
            match(input,86,FOLLOW_86_in_ruleArrowOp6433); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getArrowOpAccess().getSHyphenMinusGreaterThanSignKeyword_1_0(), "s"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getArrowOpRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "s", /* lv_s_4 */ input.LT(-1), "->", lastConsumedNode);
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
    // $ANTLR end ruleArrowOp


    // $ANTLR start entryRuleBlock
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2856:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2856:47: (iv_ruleBlock= ruleBlock EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2857:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock6479);
            iv_ruleBlock=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock6489); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2864:1: ruleBlock returns [EObject current=null] : ( (lv_expr_0= ruleExpression )* '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2869:6: ( ( (lv_expr_0= ruleExpression )* '}' ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2870:1: ( (lv_expr_0= ruleExpression )* '}' )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2870:1: ( (lv_expr_0= ruleExpression )* '}' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2870:2: (lv_expr_0= ruleExpression )* '}'
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2870:2: (lv_expr_0= ruleExpression )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=RULE_INT && LA71_0<=RULE_INTEGER)||LA71_0==25||LA71_0==37||LA71_0==39||(LA71_0>=43 && LA71_0<=45)||(LA71_0>=63 && LA71_0<=64)||(LA71_0>=70 && LA71_0<=84)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2873:6: lv_expr_0= ruleExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getExprExpressionParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBlock6548);
            	    lv_expr_0=ruleExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "expr", lv_expr_0, "Expression", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            match(input,40,FOLLOW_40_in_ruleBlock6562); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_1(), null); 
                  
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


    // $ANTLR start entryRuleBlockBis
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2902:1: entryRuleBlockBis returns [EObject current=null] : iv_ruleBlockBis= ruleBlockBis EOF ;
    public final EObject entryRuleBlockBis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockBis = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2902:50: (iv_ruleBlockBis= ruleBlockBis EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2903:2: iv_ruleBlockBis= ruleBlockBis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockBisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockBis_in_entryRuleBlockBis6595);
            iv_ruleBlockBis=ruleBlockBis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockBis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockBis6605); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlockBis


    // $ANTLR start ruleBlockBis
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2910:1: ruleBlockBis returns [EObject current=null] : ( '{' this_Block_1= ruleBlock ) ;
    public final EObject ruleBlockBis() throws RecognitionException {
        EObject current = null;

        EObject this_Block_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2915:6: ( ( '{' this_Block_1= ruleBlock ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2916:1: ( '{' this_Block_1= ruleBlock )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2916:1: ( '{' this_Block_1= ruleBlock )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2916:2: '{' this_Block_1= ruleBlock
            {
            match(input,39,FOLLOW_39_in_ruleBlockBis6639); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlockBisAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBlockBisAccess().getBlockParserRuleCall_1(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleBlockBis6661);
            this_Block_1=ruleBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Block_1; 
                      currentNode = currentNode.getParent();
                  
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
    // $ANTLR end ruleBlockBis


    // $ANTLR start entryRuleBlockOrBar
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2936:1: entryRuleBlockOrBar returns [EObject current=null] : iv_ruleBlockOrBar= ruleBlockOrBar EOF ;
    public final EObject entryRuleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockOrBar = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2936:52: (iv_ruleBlockOrBar= ruleBlockOrBar EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2937:2: iv_ruleBlockOrBar= ruleBlockOrBar EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockOrBarRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar6693);
            iv_ruleBlockOrBar=ruleBlockOrBar();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockOrBar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockOrBar6703); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2944:1: ruleBlockOrBar returns [EObject current=null] : (this_BlockBis_0= ruleBlockBis | ( '|' this_Expression_2= ruleExpression ) ) ;
    public final EObject ruleBlockOrBar() throws RecognitionException {
        EObject current = null;

        EObject this_BlockBis_0 = null;

        EObject this_Expression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2949:6: ( (this_BlockBis_0= ruleBlockBis | ( '|' this_Expression_2= ruleExpression ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2950:1: (this_BlockBis_0= ruleBlockBis | ( '|' this_Expression_2= ruleExpression ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2950:1: (this_BlockBis_0= ruleBlockBis | ( '|' this_Expression_2= ruleExpression ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==39) ) {
                alt72=1;
            }
            else if ( (LA72_0==87) ) {
                alt72=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2950:1: (this_BlockBis_0= ruleBlockBis | ( '|' this_Expression_2= ruleExpression ) )", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2951:5: this_BlockBis_0= ruleBlockBis
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getBlockBisParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockBis_in_ruleBlockOrBar6750);
                    this_BlockBis_0=ruleBlockBis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BlockBis_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2960:6: ( '|' this_Expression_2= ruleExpression )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2960:6: ( '|' this_Expression_2= ruleExpression )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2960:7: '|' this_Expression_2= ruleExpression
                    {
                    match(input,87,FOLLOW_87_in_ruleBlockOrBar6765); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockOrBarAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockOrBarAccess().getExpressionParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleBlockOrBar6787);
                    this_Expression_2=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              currentNode = currentNode.getParent();
                          
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


    // $ANTLR start entryRuleBlockOrBarBis
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2980:1: entryRuleBlockOrBarBis returns [EObject current=null] : iv_ruleBlockOrBarBis= ruleBlockOrBarBis EOF ;
    public final EObject entryRuleBlockOrBarBis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockOrBarBis = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2980:55: (iv_ruleBlockOrBarBis= ruleBlockOrBarBis EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2981:2: iv_ruleBlockOrBarBis= ruleBlockOrBarBis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockOrBarBisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBlockOrBarBis_in_entryRuleBlockOrBarBis6820);
            iv_ruleBlockOrBarBis=ruleBlockOrBarBis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBlockOrBarBis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockOrBarBis6830); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlockOrBarBis


    // $ANTLR start ruleBlockOrBarBis
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2988:1: ruleBlockOrBarBis returns [EObject current=null] : (this_BlockBis_0= ruleBlockBis | ( '|' this_TerminalExpr_2= ruleTerminalExpr ) ) ;
    public final EObject ruleBlockOrBarBis() throws RecognitionException {
        EObject current = null;

        EObject this_BlockBis_0 = null;

        EObject this_TerminalExpr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2993:6: ( (this_BlockBis_0= ruleBlockBis | ( '|' this_TerminalExpr_2= ruleTerminalExpr ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2994:1: (this_BlockBis_0= ruleBlockBis | ( '|' this_TerminalExpr_2= ruleTerminalExpr ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2994:1: (this_BlockBis_0= ruleBlockBis | ( '|' this_TerminalExpr_2= ruleTerminalExpr ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==39) ) {
                alt73=1;
            }
            else if ( (LA73_0==87) ) {
                alt73=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2994:1: (this_BlockBis_0= ruleBlockBis | ( '|' this_TerminalExpr_2= ruleTerminalExpr ) )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:2995:5: this_BlockBis_0= ruleBlockBis
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockOrBarBisAccess().getBlockBisParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockBis_in_ruleBlockOrBarBis6877);
                    this_BlockBis_0=ruleBlockBis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BlockBis_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3004:6: ( '|' this_TerminalExpr_2= ruleTerminalExpr )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3004:6: ( '|' this_TerminalExpr_2= ruleTerminalExpr )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3004:7: '|' this_TerminalExpr_2= ruleTerminalExpr
                    {
                    match(input,87,FOLLOW_87_in_ruleBlockOrBarBis6892); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBlockOrBarBisAccess().getVerticalLineKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBlockOrBarBisAccess().getTerminalExprParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTerminalExpr_in_ruleBlockOrBarBis6914);
                    this_TerminalExpr_2=ruleTerminalExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TerminalExpr_2; 
                              currentNode = currentNode.getParent();
                          
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
    // $ANTLR end ruleBlockOrBarBis


    // $ANTLR start entryRuleName
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3024:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3024:46: (iv_ruleName= ruleName EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3025:2: iv_ruleName= ruleName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleName_in_entryRuleName6947);
            iv_ruleName=ruleName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleName6957); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3032:1: ruleName returns [EObject current=null] : ( (lv_this_0= 'this' ) | (lv_name_1= RULE_ID ) | (lv_nameComplete_2= ruleNameBis ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_this_0=null;
        Token lv_name_1=null;
        EObject lv_nameComplete_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3037:6: ( ( (lv_this_0= 'this' ) | (lv_name_1= RULE_ID ) | (lv_nameComplete_2= ruleNameBis ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3038:1: ( (lv_this_0= 'this' ) | (lv_name_1= RULE_ID ) | (lv_nameComplete_2= ruleNameBis ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3038:1: ( (lv_this_0= 'this' ) | (lv_name_1= RULE_ID ) | (lv_nameComplete_2= ruleNameBis ) )
            int alt74=3;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==88) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==EOF||LA74_1==RULE_ID||LA74_1==14||(LA74_1>=16 && LA74_1<=23)||LA74_1==25||(LA74_1>=27 && LA74_1<=30)||(LA74_1>=38 && LA74_1<=47)||LA74_1==65||LA74_1==88) ) {
                    alt74=1;
                }
                else if ( (LA74_1==89) ) {
                    alt74=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3038:1: ( (lv_this_0= 'this' ) | (lv_name_1= RULE_ID ) | (lv_nameComplete_2= ruleNameBis ) )", 74, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA74_0==RULE_ID) ) {
                int LA74_2 = input.LA(2);

                if ( (LA74_2==EOF||LA74_2==RULE_ID||LA74_2==14||(LA74_2>=16 && LA74_2<=23)||LA74_2==25||(LA74_2>=27 && LA74_2<=30)||(LA74_2>=38 && LA74_2<=47)||LA74_2==65||LA74_2==88) ) {
                    alt74=2;
                }
                else if ( (LA74_2==89) ) {
                    alt74=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3038:1: ( (lv_this_0= 'this' ) | (lv_name_1= RULE_ID ) | (lv_nameComplete_2= ruleNameBis ) )", 74, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3038:1: ( (lv_this_0= 'this' ) | (lv_name_1= RULE_ID ) | (lv_nameComplete_2= ruleNameBis ) )", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3038:2: (lv_this_0= 'this' )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3038:2: (lv_this_0= 'this' )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3040:6: lv_this_0= 'this'
                    {
                    lv_this_0=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_ruleName7003); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNameAccess().getThisThisKeyword_0_0(), "this"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNameRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "this", /* lv_this_0 */ input.LT(-1), "this", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3060:6: (lv_name_1= RULE_ID )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3060:6: (lv_name_1= RULE_ID )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3062:6: lv_name_1= RULE_ID
                    {
                    lv_name_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName7044); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNameRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3081:6: (lv_nameComplete_2= ruleNameBis )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3081:6: (lv_nameComplete_2= ruleNameBis )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3084:6: lv_nameComplete_2= ruleNameBis
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNameAccess().getNameCompleteNameBisParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNameBis_in_ruleName7092);
                    lv_nameComplete_2=ruleNameBis();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNameRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "nameComplete", lv_nameComplete_2, "NameBis", currentNode);
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


    // $ANTLR start entryRuleNameBis
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3109:1: entryRuleNameBis returns [EObject current=null] : iv_ruleNameBis= ruleNameBis EOF ;
    public final EObject entryRuleNameBis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameBis = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3109:49: (iv_ruleNameBis= ruleNameBis EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3110:2: iv_ruleNameBis= ruleNameBis EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNameBisRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNameBis_in_entryRuleNameBis7129);
            iv_ruleNameBis=ruleNameBis();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNameBis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameBis7139); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNameBis


    // $ANTLR start ruleNameBis
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3117:1: ruleNameBis returns [EObject current=null] : ( ( 'this' | RULE_ID ) ( '/' (lv_suite_3= RULE_ID ) )+ ) ;
    public final EObject ruleNameBis() throws RecognitionException {
        EObject current = null;

        Token lv_suite_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3122:6: ( ( ( 'this' | RULE_ID ) ( '/' (lv_suite_3= RULE_ID ) )+ ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3123:1: ( ( 'this' | RULE_ID ) ( '/' (lv_suite_3= RULE_ID ) )+ )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3123:1: ( ( 'this' | RULE_ID ) ( '/' (lv_suite_3= RULE_ID ) )+ )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3123:2: ( 'this' | RULE_ID ) ( '/' (lv_suite_3= RULE_ID ) )+
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3123:2: ( 'this' | RULE_ID )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==88) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3123:2: ( 'this' | RULE_ID )", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3123:3: 'this'
                    {
                    match(input,88,FOLLOW_88_in_ruleNameBis7174); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNameBisAccess().getThisKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3128:6: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameBis7189); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNameBisAccess().getIDTerminalRuleCall_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3132:2: ( '/' (lv_suite_3= RULE_ID ) )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==89) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3132:3: '/' (lv_suite_3= RULE_ID )
            	    {
            	    match(input,89,FOLLOW_89_in_ruleNameBis7199); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getNameBisAccess().getSolidusKeyword_1_0(), null); 
            	          
            	    }
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3136:1: (lv_suite_3= RULE_ID )
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3138:6: lv_suite_3= RULE_ID
            	    {
            	    lv_suite_3=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameBis7221); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		createLeafNode(grammarAccess.getNameBisAccess().getSuiteIDTerminalRuleCall_1_1_0(), "suite"); 
            	      	
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getNameBisRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		set(current, "suite", lv_suite_3, "ID", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
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
    // $ANTLR end ruleNameBis


    // $ANTLR start entryRuleRef
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3163:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3163:45: (iv_ruleRef= ruleRef EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3164:2: iv_ruleRef= ruleRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRef_in_entryRuleRef7264);
            iv_ruleRef=ruleRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRef7274); if (failed) return current;

            }

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
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3171:1: ruleRef returns [EObject current=null] : ( ( RULE_ID ) | 'univ' | 'Int' | 'seq/Int' ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3176:6: ( ( ( RULE_ID ) | 'univ' | 'Int' | 'seq/Int' ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3177:1: ( ( RULE_ID ) | 'univ' | 'Int' | 'seq/Int' )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3177:1: ( ( RULE_ID ) | 'univ' | 'Int' | 'seq/Int' )
            int alt77=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt77=1;
                }
                break;
            case 81:
                {
                alt77=2;
                }
                break;
            case 82:
                {
                alt77=3;
                }
                break;
            case 83:
                {
                alt77=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3177:1: ( ( RULE_ID ) | 'univ' | 'Int' | 'seq/Int' )", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3177:2: ( RULE_ID )
                    {
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3177:2: ( RULE_ID )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3180:3: RULE_ID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getRefRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRef7321); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRefAccess().getNameNameCrossReference_0_0(), "name"); 
                      	
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3194:6: 'univ'
                    {
                    match(input,81,FOLLOW_81_in_ruleRef7339); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getUnivKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3199:6: 'Int'
                    {
                    match(input,82,FOLLOW_82_in_ruleRef7354); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getIntKeyword_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:3204:6: 'seq/Int'
                    {
                    match(input,83,FOLLOW_83_in_ruleRef7369); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRefAccess().getSeqIntKeyword_3(), null); 
                          
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
    // $ANTLR end ruleRef


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\17\uffff";
    static final String DFA12_eofS =
        "\17\uffff";
    static final String DFA12_minS =
        "\1\5\2\uffff\1\22\2\uffff\2\33\4\uffff\1\5\1\35\1\33";
    static final String DFA12_maxS =
        "\1\130\2\uffff\1\55\2\uffff\2\131\4\uffff\1\5\1\36\1\131";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\2\uffff\1\5\1\6\1\7\1\10\3\uffff";
    static final String DFA12_specialS =
        "\17\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\7\14\uffff\1\3\2\uffff\1\1\1\2\1\4\4\uffff\1\5\1\10\1\11"+
            "\7\uffff\1\12\2\uffff\5\13\52\uffff\1\6",
            "",
            "",
            "\1\13\4\uffff\1\4\4\uffff\1\5\14\uffff\5\13",
            "",
            "",
            "\1\15\75\uffff\1\14",
            "\1\15\75\uffff\1\14",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\10\1\11",
            "\1\15\75\uffff\1\14"
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
            return "391:1: (this_FactDecl_0= ruleFactDecl | this_AssertDecl_1= ruleAssertDecl | this_FunDecl_2= ruleFunDecl | this_PredDecl_3= rulePredDecl | this_RunDecl_4= ruleRunDecl | this_CheckDecl_5= ruleCheckDecl | this_EnumDecl_6= ruleEnumDecl | this_SigDecl_7= ruleSigDecl )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecification89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleSpecification148 = new BitSet(new long[]{0x00003E4070EC0022L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleOpen_in_ruleSpecification187 = new BitSet(new long[]{0x00003E4070EC0022L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleSpecification226 = new BitSet(new long[]{0x00003E4070E40022L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModule308 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleModule342 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleModule356 = new BitSet(new long[]{0x0000000000008020L,0x0000000001000000L});
    public static final BitSet FOLLOW_15_in_ruleModule366 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleModule402 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleModule416 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleModule426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleModule437 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleModule447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpen_in_entryRuleOpen482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpen492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpen527 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOpen538 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleOpen572 = new BitSet(new long[]{0x0000000000104002L});
    public static final BitSet FOLLOW_14_in_ruleOpen586 = new BitSet(new long[]{0x0000000000000020L,0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen620 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleOpen634 = new BitSet(new long[]{0x0000000000000020L,0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleRef_in_ruleOpen668 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleOpen683 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleOpen695 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleOpen729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_ruleParagraph825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_ruleParagraph852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_ruleParagraph879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_ruleParagraph906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_ruleParagraph933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_ruleParagraph960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleParagraph987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_ruleParagraph1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactDecl_in_entryRuleFactDecl1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactDecl1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFactDecl1090 = new BitSet(new long[]{0x0000008000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleFactDecl1124 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleBlockBis_in_ruleFactDecl1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertDecl_in_entryRuleAssertDecl1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertDecl1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAssertDecl1244 = new BitSet(new long[]{0x0000008000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleAssertDecl1278 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleBlockBis_in_ruleAssertDecl1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunDecl_in_entryRuleFunDecl1354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunDecl1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFunDecl1399 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunDecl1410 = new BitSet(new long[]{0x0000000000000020L,0x00000000010E0000L});
    public static final BitSet FOLLOW_ruleRef_in_ruleFunDecl1445 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFunDecl1458 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleFunDecl1494 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_14_in_ruleFunDecl1509 = new BitSet(new long[]{0x0000000000060020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1544 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleFunDecl1558 = new BitSet(new long[]{0x0000000000040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1592 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleFunDecl1609 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25_in_ruleFunDecl1626 = new BitSet(new long[]{0x0000000004040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1661 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleFunDecl1675 = new BitSet(new long[]{0x0000000000040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleFunDecl1709 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleFunDecl1726 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunDecl1737 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunDecl1771 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleBlockBis_in_ruleFunDecl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredDecl_in_entryRulePredDecl1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredDecl1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePredDecl1891 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePredDecl1914 = new BitSet(new long[]{0x0000000000000020L,0x00000000010E0000L});
    public static final BitSet FOLLOW_ruleRef_in_rulePredDecl1962 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePredDecl1975 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_rulePredDecl2011 = new BitSet(new long[]{0x0000008002004000L});
    public static final BitSet FOLLOW_14_in_rulePredDecl2026 = new BitSet(new long[]{0x0000000000060020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2061 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_rulePredDecl2075 = new BitSet(new long[]{0x0000000000040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2109 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_rulePredDecl2126 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25_in_rulePredDecl2143 = new BitSet(new long[]{0x0000000004040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2178 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_rulePredDecl2192 = new BitSet(new long[]{0x0000000000040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_rulePredDecl2226 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_rulePredDecl2243 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleBlockBis_in_rulePredDecl2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunDecl_in_entryRuleRunDecl2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunDecl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleRunDecl2387 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRunDecl2400 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRunDecl2423 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRunDecl2459 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_ruleBlockBis_in_ruleRunDecl2502 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleRunDecl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckDecl_in_entryRuleCheckDecl2578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckDecl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleCheckDecl2648 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCheckDecl2661 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCheckDecl2684 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckDecl2720 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_ruleBlockBis_in_ruleCheckDecl2763 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_ruleScope_in_ruleCheckDecl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScope_in_entryRuleScope2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScope2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleScope2884 = new BitSet(new long[]{0x0000000200008012L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleScope2895 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32_in_ruleScope2904 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2938 = new BitSet(new long[]{0x0000000200010002L});
    public static final BitSet FOLLOW_16_in_ruleScope2952 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope2986 = new BitSet(new long[]{0x0000000200010002L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope3036 = new BitSet(new long[]{0x0000000200010002L});
    public static final BitSet FOLLOW_16_in_ruleScope3050 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleTypescope_in_ruleScope3084 = new BitSet(new long[]{0x0000000200010002L});
    public static final BitSet FOLLOW_33_in_ruleScope3105 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleScope3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleScope3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypescope_in_entryRuleTypescope3166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypescope3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTypescope3211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTypescope3222 = new BitSet(new long[]{0x0000003000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypescope3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypescope3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypescope3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl3313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEnumDecl3357 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumDecl3391 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEnumDecl3404 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumDecl3438 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumDecl3452 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleEnumDecl3486 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleEnumDecl3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigDecl_in_entryRuleSigDecl3534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigDecl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_ruleSigDecl3579 = new BitSet(new long[]{0x00003E0000040000L});
    public static final BitSet FOLLOW_41_in_ruleSigDecl3582 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleSigDecl3616 = new BitSet(new long[]{0x0000C08000010000L});
    public static final BitSet FOLLOW_16_in_ruleSigDecl3630 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleSigDecl3664 = new BitSet(new long[]{0x0000C08000010000L});
    public static final BitSet FOLLOW_ruleSigExt_in_ruleSigDecl3704 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSigDecl3718 = new BitSet(new long[]{0x0000010000040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl3753 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_16_in_ruleSigDecl3767 = new BitSet(new long[]{0x0000000000040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleSigDecl3801 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_40_in_ruleSigDecl3818 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleBlockBis_in_ruleSigDecl3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigQual_in_entryRuleSigQual3891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigQual3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSigQual3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSigQual3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSigQual3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSigQual3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSigQual4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExt_in_entryRuleSigExt4054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExt4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSigExt4099 = new BitSet(new long[]{0x0000000000000020L,0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleRef_in_ruleSigExt4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSigExt4154 = new BitSet(new long[]{0x0000000000000020L,0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleRef_in_ruleSigExt4188 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSigExt4202 = new BitSet(new long[]{0x0000000000000020L,0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleRef_in_ruleSigExt4236 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpr_in_ruleExpression4345 = new BitSet(new long[]{0xFFFFB80001004002L,0x000000000040023FL});
    public static final BitSet FOLLOW_14_in_ruleExpression4360 = new BitSet(new long[]{0x800038A002020070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4394 = new BitSet(new long[]{0x800038A002020070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_17_in_ruleExpression4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleExpression4438 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_49_in_ruleExpression4454 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_24_in_ruleExpression4470 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_50_in_ruleExpression4486 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_51_in_ruleExpression4502 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_52_in_ruleExpression4518 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_53_in_ruleExpression4534 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_54_in_ruleExpression4550 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_55_in_ruleExpression4566 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_56_in_ruleExpression4582 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_57_in_ruleExpression4598 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_58_in_ruleExpression4614 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_59_in_ruleExpression4630 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_60_in_ruleExpression4646 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_61_in_ruleExpression4662 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_62_in_ruleExpression4678 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleExpression4749 = new BitSet(new long[]{0x0000800000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_64_in_ruleExpression4764 = new BitSet(new long[]{0x0000800000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_65_in_ruleExpression4788 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_47_in_ruleExpression4804 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_66_in_ruleExpression4820 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_67_in_ruleExpression4836 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_68_in_ruleExpression4852 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_69_in_ruleExpression4868 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_ruleExpression4963 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpr_in_entryRuleTerminalExpr5041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpr5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleTerminalExpr5086 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpr5108 = new BitSet(new long[]{0x0000008000010000L,0x0000000000800000L});
    public static final BitSet FOLLOW_16_in_ruleTerminalExpr5117 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleLetDecl_in_ruleTerminalExpr5151 = new BitSet(new long[]{0x0000008000010000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleBlockOrBarBis_in_ruleTerminalExpr5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleTerminalExpr5213 = new BitSet(new long[]{0x0000000000040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_72_in_ruleTerminalExpr5228 = new BitSet(new long[]{0x0000000000040020L,0x0000000001200000L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpr5263 = new BitSet(new long[]{0x0000008000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleBlockOrBarBis_in_ruleTerminalExpr5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleTerminalExpr5323 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_64_in_ruleTerminalExpr5338 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_73_in_ruleTerminalExpr5353 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_37_in_ruleTerminalExpr5368 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_74_in_ruleTerminalExpr5383 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_75_in_ruleTerminalExpr5398 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_76_in_ruleTerminalExpr5413 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_77_in_ruleTerminalExpr5428 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleTerminalExpr_in_ruleTerminalExpr5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTerminalExpr5468 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_45_in_ruleTerminalExpr5483 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_43_in_ruleTerminalExpr5498 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_44_in_ruleTerminalExpr5513 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleTerminalExpr_in_ruleTerminalExpr5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerminalExpr5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleTerminalExpr5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleTerminalExpr5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleTerminalExpr5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleTerminalExpr5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleTerminalExpr5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleTerminalExpr5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTerminalExpr5672 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTerminalExpr5706 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTerminalExpr5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleTerminalExpr5737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminalExpr5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTerminalExpr5781 = new BitSet(new long[]{0x800039A002040070L,0x00000000013FFFC1L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleTerminalExpr5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleTerminalExpr5845 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTerminalExpr5858 = new BitSet(new long[]{0x0000008000040020L,0x0000000001A00000L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_ruleTerminalExpr5894 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTerminalExpr5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl5943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDecl5988 = new BitSet(new long[]{0x0000000000000020L,0x0000000001200000L});
    public static final BitSet FOLLOW_85_in_ruleDecl6000 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleDecl6036 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_16_in_ruleDecl6050 = new BitSet(new long[]{0x0000000000000020L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleName_in_ruleDecl6084 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_27_in_ruleDecl6099 = new BitSet(new long[]{0x800038A002000070L,0x00000000003FFFC1L});
    public static final BitSet FOLLOW_85_in_ruleDecl6109 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDecl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDecl_in_entryRuleLetDecl6184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDecl6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleLetDecl6241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLetDecl6249 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetDecl6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowOp_in_entryRuleArrowOp6320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowOp6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleArrowOp6365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_44_in_ruleArrowOp6380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_43_in_ruleArrowOp6395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_73_in_ruleArrowOp6410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleArrowOp6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock6479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlock6548 = new BitSet(new long[]{0x800039A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_40_in_ruleBlock6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockBis_in_entryRuleBlockBis6595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockBis6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBlockBis6639 = new BitSet(new long[]{0x800039A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBlockBis6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOrBar_in_entryRuleBlockOrBar6693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOrBar6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockBis_in_ruleBlockOrBar6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBlockOrBar6765 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlockOrBar6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockOrBarBis_in_entryRuleBlockOrBarBis6820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockOrBarBis6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockBis_in_ruleBlockOrBarBis6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleBlockOrBarBis6892 = new BitSet(new long[]{0x800038A002000070L,0x00000000001FFFC1L});
    public static final BitSet FOLLOW_ruleTerminalExpr_in_ruleBlockOrBarBis6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName6947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleName7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameBis_in_ruleName7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameBis_in_entryRuleNameBis7129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameBis7139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleNameBis7174 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameBis7189 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleNameBis7199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameBis7221 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleRef_in_entryRuleRef7264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRef7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRef7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleRef7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleRef7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleRef7369 = new BitSet(new long[]{0x0000000000000002L});

}