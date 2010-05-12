package fr.univartois.cril.alloyplugin;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class SemanticHighlightingConfiguration implements
		ISemanticHighlightingConfiguration {

	public final static String signatureName = "SignatureName";
	public final static String proprityName = "proprityName";
	public final static String referenceName = "referenceName";
	

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(signatureName, "Signature name", signatureNameStyle());
		acceptor.acceptDefaultHighlighting(proprityName, "Proprity name", proprityNameStyle());
		acceptor.acceptDefaultHighlighting(referenceName, "Reference Name", referenceNameStyle());
	}

	public TextStyle signatureNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(34, 232, 123));
		textStyle.setStyle(SWT.BOLD);
		return textStyle; 
	}

	
	public TextStyle proprityNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(244, 232, 13));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	public TextStyle referenceNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(24, 22, 13));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
