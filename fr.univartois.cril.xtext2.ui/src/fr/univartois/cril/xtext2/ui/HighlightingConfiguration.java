package fr.univartois.cril.xtext2.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class HighlightingConfiguration extends DefaultHighlightingConfiguration {

	public final static String signatureName = "SignatureName";
	public final static String propertyName = "propertyName";
	public final static String referenceName = "referenceName";
	public final static String predicateName = "predicateName";
	public final static String assertionName = "assertionName";
	public final static String factName = "factName";
	public final static String functionName = "functionName";
	public final static String enumName = "enumName";
	public final static String enumPropertyName = "enumPropertyName";
	public final static String opName = "opName";
	public final static String quantifier = "quantifier";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(signatureName, "Signature name",
				signatureNameStyle());
		acceptor.acceptDefaultHighlighting(propertyName, "Property name",
				propertyNameStyle());
		acceptor.acceptDefaultHighlighting(referenceName, "Reference Name",
				referenceNameStyle());
		acceptor.acceptDefaultHighlighting(predicateName, "Predicate Name",
				predicateNameStyle());
		acceptor.acceptDefaultHighlighting(assertionName, "Assertion Name",
				assertionNameStyle());
		acceptor.acceptDefaultHighlighting(factName, "Fact Name",
				factNameStyle());
		acceptor.acceptDefaultHighlighting(functionName, "Function Name",
				functionNameStyle());
		acceptor.acceptDefaultHighlighting(enumName, "Enum Name",
				enumNameStyle());
		acceptor.acceptDefaultHighlighting(enumPropertyName,
				"Enum Property Name", enumPropertyNameStyle());
		acceptor.acceptDefaultHighlighting(opName, "Operation Name",
				opNameStyle());
		acceptor.acceptDefaultHighlighting(quantifier, "Quantifier",
				quantifierStyle());
	}

	public TextStyle quantifierStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(12, 105, 225));

		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle assertionNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(34, 122, 243));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle factNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(1, 132, 43));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle functionNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(72, 127, 98));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle enumNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(234, 1, 13));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle enumPropertyNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 1, 243));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle predicateNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(44, 83, 164));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	public TextStyle signatureNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(205, 127, 50));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle propertyNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(148, 17, 255));
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

	public TextStyle opNameStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(105, 105, 105));
		textStyle.setStyle(SWT.ITALIC);
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
}
