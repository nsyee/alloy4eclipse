package fr.univartois.cril.alloyplugin.launch;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.univartois.cril.alloyplugin.launch";
	//
	public static final String COMMAND_VIEW_ID = "fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView";



	// The shared instance
	private static Activator plugin;
	/**
	 * An image registry which store create and dispose images.
	 */
	public static ImageRegistry imageRegistry;
	public static final String COMMAND_ID = "icons/AlloyCommand.gif";
	public static final String CHECK_ID = "icons/CheckCommand.gif";
	public static final String RED_CHECK_ID = "icons/CheckCommandRed.gif";
	public static final String GREEN_CHECK_ID = "icons/CheckCommandGreen.gif";
	public static final String BLUE_CHECK_ID = "icons/CheckCommandBlue.gif";
	public static final String RUN_ID = "icons/RunCommand.gif";
	public static final String RED_RUN_ID ="icons/RunCommandRed.gif";
	public static final String BLUE_RUN_ID = "icons/RunCommandBlue.gif";
	public static final String GREEN_RUN_ID = "icons/RunCommandGreen.gif";

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		//TODO dispose image registry;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public ImageRegistry getImageRegistry(){
		if (imageRegistry == null) {
			imageRegistry=createImageRegistry();			
		}
		return imageRegistry;		
	}
	public void initializeImageRegistry(ImageRegistry reg){
		System.out.println("initIR");
		addImage(COMMAND_ID, reg);
		addImage(CHECK_ID, reg);
		addImage(RED_CHECK_ID, reg);
		addImage(GREEN_CHECK_ID, reg);
		addImage(BLUE_CHECK_ID, reg);
		addImage(RUN_ID, reg);
		addImage(RED_RUN_ID, reg);
		addImage(BLUE_RUN_ID, reg);
		addImage(GREEN_RUN_ID, reg);
	}

	public ImageRegistry createImageRegistry(){
		System.out.println("createIR");
		ImageRegistry reg=new ImageRegistry();	
		initializeImageRegistry(reg);
		return reg;
	}
	/**
	 * Add image in image registry. Pour taper moins de code 
	 * la clé de l'image est aussi le chemin d'accès de l'image dans le plugin. 
	 * @param reg 
	 */
		
	private void addImage(String localPathKey, ImageRegistry reg) {
		URL url = null;
		try {
			url = new URL(Activator.getDefault().getBundle().getEntry("/"),
					localPathKey);
		} catch (MalformedURLException e) {
		}
		ImageDescriptor des = ImageDescriptor.createFromURL(url);		
		reg.put(localPathKey,des);
	}
}
