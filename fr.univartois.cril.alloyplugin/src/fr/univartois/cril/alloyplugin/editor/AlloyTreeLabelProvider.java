package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import fr.univartois.cril.alloyplugin.core.ui.IALSTreeDecorated;

public class AlloyTreeLabelProvider implements ILabelProvider {

	public Image getImage(Object element) {
		if (element instanceof IALSTreeDecorated) {
			return ((IALSTreeDecorated)element).getIcon();
		}
		return null;
	}

	public String getText(Object element) {
		return element.toString();
	}

	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	public static IBaseLabelProvider getDefault() {
		// TODO Auto-generated method stub
		return null;
	}

}
