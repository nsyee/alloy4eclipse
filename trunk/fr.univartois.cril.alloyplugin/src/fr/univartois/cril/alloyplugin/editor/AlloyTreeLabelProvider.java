package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;

public class AlloyTreeLabelProvider implements ILabelProvider {

	public Image getImage(Object element) {
		
	    //Image i = new Image( null,"../../../../../../icons/AlloyFile.gif");
		//return i;
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
