package fr.univartois.cril.alloyplugin;


import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.mit.csail.sdg.alloy4.Util;
import fr.univartois.cril.alloyplugin.api.IALSFactory;
import fr.univartois.cril.alloyplugin.api.IALSFile;
import fr.univartois.cril.alloyplugin.core.ALSFileFactory;
import fr.univartois.cril.alloyplugin.core.AlloyLaunching;
import fr.univartois.cril.alloyplugin.editor.ALSCodeScanner;
import fr.univartois.cril.alloyplugin.editor.ALSPartitionScanner;
import fr.univartois.cril.alloyplugin.ui.ALSTextAttributeProvider;

public class AlloyPlugin extends AbstractUIPlugin {
	/** instance of the plugin*/
	private static AlloyPlugin plugin;
	/**
	 *  The plug-in ID.
	 */
	public static final String PLUGIN_ID = "fr.univartois.cril.alloyplugin";


	/***/
	public static final String ALS_PARTITIONING = "__pos_als_partitioning";



	private AlloyLaunching parser = null;
	private IALSFactory ALSFileFactory = null;

	private IPartitionTokenScanner fPartitionScanner;
	private ALSTextAttributeProvider fTextAttributeProvider;
	private ALSCodeScanner fCodeScanner;

	//
	public static final String COMMAND_VIEW_ID = "fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView";


	/**
	 * An image registry which store create and dispose images.
	 */
	private ImageRegistry imageRegistry;

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
	public static final String ASSERT_ICON_ID="icons/assert.gif";
	public static final String FUNCTION_ICON_ID="icons/function.gif";
	public static final String PREDICATE_ICON_ID="icons/predicate.gif";
	public static final String RUN_ICON_ID="icons/run.gif";
	public static final String CHECK_ICON_ID="icons/check.gif";
	public static final String GRAPH_ICON_ID = "icons/graph.gif";
	public static final String EXECUTE_ICON_ID = "icons/execute.gif";
	public static final String DISABLE_EXECUTE_ICON_ID = "icons/DisableAlloyLaunch.gif";
	
	public static final String THEME_ICON_ID = "icons/theme.gif";
	public static final String THEME_IMPORT_ICON_ID = "icons/theme-import.gif";
	public static final String THEME_IMPORT_ADD_ICON_ID = "icons/theme-import-plus.gif";
	public static final String THEME_EXPORT_ICON_ID = "icons/theme-export.gif";
	public static final String THEME_EXPORT_DOT_ICON_ID = "icons/dot.gif";
	
	public static final String LAUNCH_A4_ICON_ID = "icons/a4.gif";
	
	/** The system-specific file separator (forward-slash on UNIX, back-slash on Windows, etc.) */
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	




	public AlloyPlugin(){
		super();
		plugin=this;

		copyFromJAR();

	}




	public void start(BundleContext context) throws Exception {
		super.start(context);
	}


	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}


	public static AlloyPlugin getDefault(){
		return plugin;

	}
	/*	public void run(IType type)
	{
		System.out.println("run run run");
	}
	 */	

	public IPartitionTokenScanner getALSPartitionScanner() {		
		if(fPartitionScanner == null) {
			fPartitionScanner = new ALSPartitionScanner();
		}
		return fPartitionScanner;
	}
	public ALSTextAttributeProvider getTextAttributeProvider() {
		if(fTextAttributeProvider == null) {
			fTextAttributeProvider = new ALSTextAttributeProvider();
		}
		return fTextAttributeProvider;

	}
	public ITokenScanner getALSCodeScanner() {
		if(fCodeScanner == null) {
			fCodeScanner = new ALSCodeScanner(getTextAttributeProvider());
		}
		return fCodeScanner;
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
		addImage(ASSERT_ICON_ID, reg);
		addImage(FUNCTION_ICON_ID, reg);
		addImage(PREDICATE_ICON_ID, reg);
		addImage(RUN_ICON_ID, reg);
		addImage(CHECK_ICON_ID, reg);
		addImage(GRAPH_ICON_ID, reg);
		addImage(EXECUTE_ICON_ID, reg);
		addImage(DISABLE_EXECUTE_ICON_ID, reg);
		addImage(THEME_ICON_ID, reg);
		addImage(THEME_IMPORT_ICON_ID, reg);
		addImage(THEME_EXPORT_ICON_ID, reg);
		addImage(THEME_IMPORT_ADD_ICON_ID, reg);
		addImage(THEME_EXPORT_DOT_ICON_ID, reg);
		addImage(LAUNCH_A4_ICON_ID, reg);
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
	
	public ImageDescriptor getImageDescriptor(String id) {
	    return getImageRegistry().getDescriptor(id);
	}

	/**
	 * Add image in image registry. Pour taper moins de code 
	 * la cl� de l'image est aussi le chemin d'acc�s de l'image dans le plugin. 
	 * @param reg 
	 */
	private void addImage(String localPathKey, ImageRegistry reg) {
		URL url = null;
		try {
			url = new URL(getDefault().getBundle().getEntry("/"),
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
			arch="x86-"+os;

		// Find out the appropriate Alloy directory
		final String platformBinary=Helper.alloyHome()+FILE_SEPARATOR+"binary";

		// Copy the platform-dependent binaries
		Util.copy(true, false, platformBinary,
				arch+"/libminisat.so", arch+"/libminisat.jnilib",
				arch+"/libminisatprover.so", arch+"/libminisatprover.jnilib",
				arch+"/libzchaff.so", arch+"/libzchaff.jnilib",
				arch+"/minisat1", arch+"/berkmin", arch+"/dotbin");
		Util.copy(false, false, platformBinary,
				arch+"/minisat.dll", arch+"/minisatprover.dll", arch+"/zchaff.dll",
				arch+"/minisat1.exe", arch+"/berkmin.exe",
				arch+"/dotbin.exe", arch+"/jpeg.dll", arch+"/libexpat.dll", arch+"/libexpatw.dll",
				arch+"/zlib1.dll", arch+"/z.dll", arch+"/freetype6.dll", arch+"/png.dll");

		// Record the locations
		// System.setProperty("alloy.dotbin0", AlloyPlugin.getDefault().getPreferenceStore()
        //        .getString(PreferenceConstants.P_DOT_PATH));
	}



	/**
	 * Return parser used by plugin. 
	 */
	public  AlloyLaunching getParser() {
		if (parser==null) parser=new AlloyLaunching();
		return parser;
	}


	/**
	 * Return the ALSFile associated with the resource.
	 * */

	public IALSFile getALSFile(IResource resource) {
		return getALSFileFactory().getIALSFile(resource);
	}

	/**
	 * Return ALSFileFactory used by plugin. 
	 * */
	protected IALSFactory getALSFileFactory() {
		if (ALSFileFactory==null) ALSFileFactory=new ALSFileFactory();
		return ALSFileFactory;
	}
	
	public IStatus createStatus(int severity, int code, String message, Throwable throwable) {
		return new Status(severity, getBundle().getSymbolicName(), code, message, throwable);
	}

	public IStatus createError(int code, Throwable throwable) {
		String message= throwable.getMessage();
		if (message == null) {
			message= throwable.getClass().getName();
		}
		return createStatus(IStatus.ERROR, code, message, throwable);
	}
	
	public void logInfo(String message) {
		getLog().log(createStatus(IStatus.INFO, IStatus.INFO, message, null));
	}

	public void logWarning(String message) {
		getLog().log(createStatus(IStatus.WARNING, IStatus.INFO, message, null));
	}	
	
	public void logError(String message) {
		getLog().log(createStatus(IStatus.ERROR, IStatus.ERROR, message, null));
	}	

	public void log(Throwable t) {
		getLog().log(createError(IStatus.ERROR, t));
	}	

}
