package fr.univartois.cril.alloyplugin.launch.ui;

import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import fr.univartois.cril.alloyplugin.launch.Activator;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;

/*
 * The content provider class is responsible for
 * providing objects to the view. It can wrap
 * existing objects in adapters or simply return
 * objects as-is. These objects may be sensitive
 * to the current input of the view, or ignore
 * it and always show the same content 
 * (like Task List, for example).
 */


class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
	private static ImageDescriptor elementImage;
	private static ImageDescriptor elementImageGreen;
	private static ImageDescriptor elementImageRed;
	private static ImageDescriptor elementImageBlue;
	//TODO changer ces bouts de codes !!!!!! (faire un registre d'image)
	static {
		URL url = null;
		try {
			url = new URL(Activator.getDefault().getBundle().getEntry("/"),
			"icons/AlloyCommand.gif");
		} catch (MalformedURLException e) {
		}
		elementImage = ImageDescriptor.createFromURL(url);
	}
	static {
		URL url = null;
		try {
			url = new URL(Activator.getDefault().getBundle().getEntry("/"),
			"icons/AlloyCommandGreen.gif");
		} catch (MalformedURLException e) {
		}
		elementImageGreen = ImageDescriptor.createFromURL(url);
	}
	static {
		URL url = null;
		try {
			url = new URL(Activator.getDefault().getBundle().getEntry("/"),
			"icons/AlloyCommandRed.gif");
		} catch (MalformedURLException e) {
		}
		elementImageRed = ImageDescriptor.createFromURL(url);
	}
	static {
		URL url = null;
		try {
			url = new URL(Activator.getDefault().getBundle().getEntry("/"),
			"icons/AlloyCommandBlue.gif");
		} catch (MalformedURLException e) {
		}
		elementImageBlue = ImageDescriptor.createFromURL(url);
	}
	public String getColumnText(Object obj, int index) {
		//AlloyRunCommandAction a=(AlloyRunCommandAction) obj;
		//return a.getCommand().toString();
		ExecutableCommand cmd=(ExecutableCommand) obj;
		return cmd.toString()+" "+cmd.getResult();			
	}
	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}
	public Image getImage(Object obj) {
		ExecutableCommand cmd=(ExecutableCommand) obj;
		if (cmd.getResult().equals(ExecutableCommand.SAT))
			if (cmd.getCommand().check) return elementImageRed.createImage();
			else return elementImageGreen.createImage();
		if (cmd.getResult().equals(ExecutableCommand.UNSAT))
			if (cmd.getCommand().check) return elementImageGreen.createImage();
			else return elementImageRed.createImage();
			
		
		return elementImage.createImage();
		//return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
	}
}
