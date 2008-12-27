package fr.univartois.cril.alloyplugin.editor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * Conteneur des attributs de texte des différentes entités de l'éditeur.
 *
 */
public class ALSTextAttributeProvider {
	public static final String KEYWORD_ATTRIBUTE = "__pos_als_keyword_attribute";
	public static final String QUANTIFIER_ATTRIBUTE = "__pos_als_quantifier_attribute";
	public static final String COMMAND_ATTRIBUTE = "__pos_als_command_attribute";
	public static final String DIRECTIVE_ATTRIBUTE = "__pos_als_directive_attribute";
	public static final String COMMENT_ATTRIBUTE = "__pos_als_comment_attribute";
    public static final String COMMENT_ANDREW_ATTRIBUTE = "__pos_als_comment_andrew_attribute";
	public static final String DEFAULT_ATTRIBUTE = "__pos_als_default_attribute";

	public static final String DECIMAL_NUMBER_ATTRIBUTE = "__pos_als_decimal_number_attribute";
	
	public static final String STRING_ATTRIBUTE = "__pos_als_string_attribute";	
    public static final String SIGNATURE_ATTRIBUTE = "__pos_als_signature_attribute";
	
	private Map<String, TextAttribute> fAttributes = new HashMap<String, TextAttribute>();

	private ALSTextAttributeProvider() {
		//  motclés
		fAttributes.put(KEYWORD_ATTRIBUTE,
				new TextAttribute(new Color(Display.getCurrent(), 
									new RGB(127, 0, 85)), null, SWT.BOLD));
        //	quantifiers
		fAttributes.put(QUANTIFIER_ATTRIBUTE,
				new TextAttribute(new Color(Display.getCurrent(), 
									new RGB(127, 0, 85)), null, SWT.BOLD | SWT.ITALIC));
		//	commandes
		fAttributes.put(COMMAND_ATTRIBUTE,
				new TextAttribute(new Color(Display.getCurrent(), 
									new RGB(0, 32, 127)), null, SWT.BOLD));
		//		directives
		fAttributes.put(DIRECTIVE_ATTRIBUTE,
				new TextAttribute(new Color(Display.getCurrent(), 
									new RGB(127, 32, 240)), null, SWT.ITALIC));
		// Les commentaires
		fAttributes.put(COMMENT_ATTRIBUTE,
				new TextAttribute(new Color(Display.getCurrent(), 
									new RGB(63, 127, 95))));
        
        // Andrew's specific comments ////
        fAttributes.put(COMMENT_ANDREW_ATTRIBUTE,
                new TextAttribute(new Color(Display.getCurrent(), 
                                    new RGB(224, 224, 224))));
		// Par défaut
		fAttributes.put(DEFAULT_ATTRIBUTE,
				new TextAttribute(new Color(Display.getCurrent(), 
									new RGB(0, 0, 0))));
		
		// Nombres décimaux
		fAttributes.put(DECIMAL_NUMBER_ATTRIBUTE,
				new TextAttribute(new Color(Display.getCurrent(),
									new RGB(127, 0, 0)), null, SWT.BOLD));
		
		// Chaines
		fAttributes.put(STRING_ATTRIBUTE, 
				new TextAttribute(new Color(Display.getCurrent(),
									new RGB(0, 0, 255))));
        
        fAttributes.put(SIGNATURE_ATTRIBUTE, 
                new TextAttribute(new Color(Display.getCurrent(),
                                    new RGB(0, 0, 127)),null,SWT.ITALIC));

	}
	
	public TextAttribute getAttribute(String type) {
		TextAttribute attr = fAttributes.get(type);
		if(attr == null) {
			attr = fAttributes.get(DEFAULT_ATTRIBUTE);
		}
		return attr;
	}
	
	private static ALSTextAttributeProvider instance;
	
	public static synchronized ALSTextAttributeProvider instance() {
	    if (instance==null) {
	        instance = new ALSTextAttributeProvider();
	    }
	    return instance;
	}
}
