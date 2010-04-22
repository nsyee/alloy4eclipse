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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'type'", "'entity'", "'extends'", "'{'", "'}'", "'property'", "':'", "'[]'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalBasicsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[18+1];
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
        	return "Model";	
       	} 



    // $ANTLR start entryRuleModel
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:73:47: (iv_ruleModel= ruleModel EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:74:2: iv_ruleModel= ruleModel EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel79);
            iv_ruleModel=ruleModel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel89); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:81:1: ruleModel returns [EObject current=null] : ( (lv_imports_0= ruleImport )* (lv_elements_1= ruleType )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0 = null;

        EObject lv_elements_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:86:6: ( ( (lv_imports_0= ruleImport )* (lv_elements_1= ruleType )* ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:87:1: ( (lv_imports_0= ruleImport )* (lv_elements_1= ruleType )* )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:87:1: ( (lv_imports_0= ruleImport )* (lv_elements_1= ruleType )* )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:87:2: (lv_imports_0= ruleImport )* (lv_elements_1= ruleType )*
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:87:2: (lv_imports_0= ruleImport )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:90:6: lv_imports_0= ruleImport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel148);
            	    lv_imports_0=ruleImport();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "imports", lv_imports_0, "Import", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:108:3: (lv_elements_1= ruleType )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:111:6: lv_elements_1= ruleType
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleModel187);
            	    lv_elements_1=ruleType();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "elements", lv_elements_1, "Type", currentNode);
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleImport
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:136:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:136:48: (iv_ruleImport= ruleImport EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:137:2: iv_ruleImport= ruleImport EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport225);
            iv_ruleImport=ruleImport();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport235); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:144:1: ruleImport returns [EObject current=null] : ( 'import' (lv_importURI_1= RULE_STRING ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:149:6: ( ( 'import' (lv_importURI_1= RULE_STRING ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:150:1: ( 'import' (lv_importURI_1= RULE_STRING ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:150:1: ( 'import' (lv_importURI_1= RULE_STRING ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:150:2: 'import' (lv_importURI_1= RULE_STRING )
            {
            match(input,11,FOLLOW_11_in_ruleImport269); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:154:1: (lv_importURI_1= RULE_STRING )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:156:6: lv_importURI_1= RULE_STRING
            {
            lv_importURI_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport291); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "importURI", lv_importURI_1, "STRING", lastConsumedNode);
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleType
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:181:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:181:46: (iv_ruleType= ruleType EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:182:2: iv_ruleType= ruleType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType332);
            iv_ruleType=ruleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType342); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:189:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:194:6: ( (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:195:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:195:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("195:1: (this_SimpleType_0= ruleSimpleType | this_Entity_1= ruleEntity )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:196:5: this_SimpleType_0= ruleSimpleType
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType389);
                    this_SimpleType_0=ruleSimpleType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SimpleType_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:206:5: this_Entity_1= ruleEntity
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntity_in_ruleType416);
                    this_Entity_1=ruleEntity();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Entity_1; 
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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleSimpleType
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:221:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:221:52: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:222:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType448);
            iv_ruleSimpleType=ruleSimpleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSimpleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType458); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSimpleType


    // $ANTLR start ruleSimpleType
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:229:1: ruleSimpleType returns [EObject current=null] : ( 'type' (lv_name_1= RULE_ID ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:234:6: ( ( 'type' (lv_name_1= RULE_ID ) ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:235:1: ( 'type' (lv_name_1= RULE_ID ) )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:235:1: ( 'type' (lv_name_1= RULE_ID ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:235:2: 'type' (lv_name_1= RULE_ID )
            {
            match(input,12,FOLLOW_12_in_ruleSimpleType492); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:239:1: (lv_name_1= RULE_ID )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:241:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleType514); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSimpleTypeRule().getType().getClassifier());
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
    // $ANTLR end ruleSimpleType


    // $ANTLR start entryRuleEntity
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:266:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:266:48: (iv_ruleEntity= ruleEntity EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:267:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity555);
            iv_ruleEntity=ruleEntity();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity565); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:274:1: ruleEntity returns [EObject current=null] : ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_properties_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:279:6: ( ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}' ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:280:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}' )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:280:1: ( 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}' )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:280:2: 'entity' (lv_name_1= RULE_ID ) ( 'extends' ( RULE_ID ) )? '{' (lv_properties_5= ruleProperty )* '}'
            {
            match(input,13,FOLLOW_13_in_ruleEntity599); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:284:1: (lv_name_1= RULE_ID )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:286:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity621); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:304:2: ( 'extends' ( RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:304:3: 'extends' ( RULE_ID )
                    {
                    match(input,14,FOLLOW_14_in_ruleEntity639); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                          
                    }
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:308:1: ( RULE_ID )
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:311:3: RULE_ID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity661); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getEntityAccess().getExtendsEntityCrossReference_2_1_0(), "extends"); 
                      	
                    }

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleEntity675); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:328:1: (lv_properties_5= ruleProperty )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:331:6: lv_properties_5= ruleProperty
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity709);
            	    lv_properties_5=ruleProperty();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "properties", lv_properties_5, "Property", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleEntity723); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5(), null); 
                  
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
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleProperty
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:360:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:360:50: (iv_ruleProperty= ruleProperty EOF )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:361:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPropertyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty756);
            iv_ruleProperty=ruleProperty();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty766); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProperty


    // $ANTLR start ruleProperty
    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:368:1: ruleProperty returns [EObject current=null] : ( 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_many_4=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:373:6: ( ( 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )? ) )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:374:1: ( 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )? )
            {
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:374:1: ( 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )? )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:374:2: 'property' (lv_name_1= RULE_ID ) ':' ( RULE_ID ) (lv_many_4= '[]' )?
            {
            match(input,17,FOLLOW_17_in_ruleProperty800); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPropertyAccess().getPropertyKeyword_0(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:378:1: (lv_name_1= RULE_ID )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:380:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty822); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            match(input,18,FOLLOW_18_in_ruleProperty839); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPropertyAccess().getColonKeyword_2(), null); 
                  
            }
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:402:1: ( RULE_ID )
            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:405:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty861); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_3_0(), "type"); 
              	
            }

            }

            // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:418:2: (lv_many_4= '[]' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.univartois.cril.alloyplugin.basics/src-gen/fr/univartois/cril/alloyplugin/parser/antlr/internal/InternalBasics.g:420:6: lv_many_4= '[]'
                    {
                    lv_many_4=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleProperty885); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPropertyAccess().getManyLeftSquareBracketRightSquareBracketKeyword_4_0(), "many"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPropertyRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "many", true, "[]", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
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
    // $ANTLR end ruleProperty


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel148 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel187 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSimpleType492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEntity599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity621 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleEntity639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity661 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity675 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity709 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleEntity723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleProperty800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty822 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleProperty839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty861 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleProperty885 = new BitSet(new long[]{0x0000000000000002L});

}