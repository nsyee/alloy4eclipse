package fr.univartois.cril.xtext2.uri;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class AlsConverters extends DefaultTerminalConverters {

	@ValueConverter(rule = "Name")
	public IValueConverter<String> Name() {
		return new IValueConverter<String>() {

			@Override
			public String toValue(String string, INode node) throws ValueConverterException {
				return string;
			}

			public String toString(String value) throws ValueConverterException {
				if (value.contains(".")) {
					throw new ValueConverterException("'.' not allowed in Name", null, null);
				}
				return value;
			}
		};
	}

}