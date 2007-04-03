package fr.univartois.cril.alloyplugin.launch;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.mit.csail.sdg.alloy4.Util;

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

	public static final String SIGNATURE_ICON_ID="icons/sig.gif";
	public static final String FACT_ICON_ID="icons/fact.gif";
	public static final String FUNCTION_ICON_ID="icons/function.gif";
	public static final String PREDICATE_ICON_ID="icons/predicate.gif";
	public static final String RUN_ICON_ID="icons/run.gif";
	
	/** The system-specific file separator (forward-slash on UNIX, back-slash on Windows, etc.) */
    private static final String fileSeparator = System.getProperty("file.separator");
	
	
    
	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
			
		//TODO remove this Alloy.jar copyed method
		copyFromJAR();
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
		//TODO dispose image registry???;
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
		if (imageRegistry == null)
			imageRegistry=createImageRegistry();			

		return imageRegistry;		
	}
	
	
	
	public void initializeImageRegistry(ImageRegistry reg){
		//System.out.println("initIR");
		addImage(COMMAND_ID, reg);
		addImage(CHECK_ID, reg);
		addImage(RED_CHECK_ID, reg);
		addImage(GREEN_CHECK_ID, reg);
		addImage(BLUE_CHECK_ID, reg);
		addImage(RUN_ID, reg);
		addImage(RED_RUN_ID, reg);
		addImage(BLUE_RUN_ID, reg);
		addImage(GREEN_RUN_ID, reg);
		addImage(SIGNATURE_ICON_ID, reg);
		addImage(FACT_ICON_ID, reg);
		addImage(FUNCTION_ICON_ID, reg);
		addImage(PREDICATE_ICON_ID, reg);
		addImage(RUN_ICON_ID, reg);
	}

	
	
	public ImageRegistry createImageRegistry(){
		//System.out.println("createIR");
		ImageRegistry reg=new ImageRegistry();	
		initializeImageRegistry(reg);
		return reg;
	}
	
	public Image getImage(String id) {
		return getImageRegistry().get(id);
	}
	
	/**
	 * Add image in image registry. Pour taper moins de code 
	 * la cl� de l'image est aussi le chemin d'acc�s de l'image dans le plugin. 
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
	
	
	
	 private void copyFromJAR() {
	        // Compute the appropriate platform
	        String os = System.getProperty("os.name").toLowerCase().replace(' ','-');
	        
	        if (os.startsWith("mac-"))
	        	os="mac";
	        else if (os.startsWith("windows-"))
	        	os="windows";
	        
	        String arch = System.getProperty("os.arch").toLowerCase().replace(' ','-');
	        
	        if (arch.equals("powerpc"))
	        	arch="ppc-"+os;
	        else
	        	arch=arch.replaceAll("\\Ai[3456]86\\z","x86")+"-"+os;
	        
	        // Find out the appropriate Alloy directory
	        final String platformBinary=Helper.alloyHome()+fileSeparator+"binary";
	        
	        // Copy the platform-dependent binaries
	        Util.copy(true, false, false, platformBinary,
	           arch+"/libminisat.so", arch+"/libminisat.jnilib",
	           arch+"/libminisatprover.so", arch+"/libminisatprover.jnilib",
	           arch+"/libzchaff.so", arch+"/libzchaff.jnilib",
	           arch+"/minisat1", arch+"/berkmin", arch+"/dotbin");
	        Util.copy(false, false, false, platformBinary,
	           arch+"/minisat.dll", arch+"/minisatprover.dll", arch+"/zchaff.dll",
	           arch+"/minisat1.exe", arch+"/berkmin.exe",
	           arch+"/dotbin.exe", arch+"/jpeg.dll", arch+"/libexpat.dll", arch+"/libexpatw.dll",
	           arch+"/zlib1.dll", arch+"/z.dll", arch+"/freetype6.dll", arch+"/png.dll");
	              
	        // Record the locations
	        System.setProperty("alloy.dotbin0", platformBinary+fileSeparator+"dotbin");
	    }
	
		//AlloyLaunching.launchParser(file);
}
