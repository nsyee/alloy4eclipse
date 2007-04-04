package fr.univartois.cril.alloyplugin;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import org.eclipse.core.resources.IProjectNatureDescriptor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.mit.csail.sdg.alloy4.Util;
import fr.univartois.cril.alloyplugin.core.ALSFile;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.core.ui.IAlloyEditorListener;
import fr.univartois.cril.alloyplugin.editor.ALSCodeScanner;
import fr.univartois.cril.alloyplugin.editor.ALSPartitionScanner;
import fr.univartois.cril.alloyplugin.Helper;

import fr.univartois.cril.alloyplugin.ui.ALSTextAttributeProvider;

public class AlloyPlugin extends AbstractUIPlugin {
	/** instance of the plugin*/
	private static AlloyPlugin plugin;
	/**
	 *  The plug-in ID.
	 */
	public static final String PLUGIN_ID = "fr.univartois.cril.alloyplugin";
	/**
	 *  extension listenerID (for commands view temporary) 
	 */
	
	private static final String listenerId="fr.univartois.cril.alloyplugin.editorlistener";
	/***/
	public static final String ALS_PARTITIONING = "__pos_als_partitioning";


	/** listeners for commands views */	
	private List<IAlloyEditorListener> editorListeners;


	private IPartitionTokenScanner fPartitionScanner;
	private ALSTextAttributeProvider fTextAttributeProvider;
	private ALSCodeScanner fCodeScanner;
	


	public AlloyPlugin(){
		super();
		plugin=this;
				
		copyFromJAR();

	}

	/**
	 * Returns command listeners.
	 * */	
	public List<IAlloyEditorListener> getEditorListeners(){
		if (editorListeners==null)
			editorListeners=computeListeners();
		return editorListeners;	
	}
	
	/**
	 * Adds commands listeners from existing extension points to the plugin.
	 * */
	private List<IAlloyEditorListener> computeListeners() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint= registry.getExtensionPoint(listenerId);
		IExtension[] extensions = extensionPoint.getExtensions();
		ArrayList<IAlloyEditorListener> results = new ArrayList<IAlloyEditorListener>();
		for(int i = 0 ;i< extensions.length;i++){
			IConfigurationElement[] elements=extensions[i].getConfigurationElements();
			for(int j=0;j<elements.length;j++){
				try{Object listener=elements[j].createExecutableExtension("class");
				if(listener instanceof IAlloyEditorListener)
					results.add((IAlloyEditorListener)listener);
				}catch(CoreException e){
					e.printStackTrace();
				}
			}
		}
		return results;
	}


	public void fireSetFocus(IALSFile file) {
		for(IAlloyEditorListener listener: getEditorListeners()){
			listener.fileSetFocus(file);
		}		
	}
	public void fireFileClosed(IALSFile file) {
for(IAlloyEditorListener listener: getEditorListeners()){
			
			listener.fileClosed(file);
		}	
	}
	public void fireFileOpen(ALSFile file) {
		for(IAlloyEditorListener listener: getEditorListeners()){
			
			listener.fileOpened(file);
		}		

		
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
	/**
	 * add a editor listener.
	 * */
	public static void addEditorListener(IAlloyEditorListener alsEditorListener) {
		getDefault().getEditorListeners().add(alsEditorListener);

	}

	//
	public static final String COMMAND_VIEW_ID = "fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView";

	
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
	public static final String CHECK_ICON_ID="icons/check.gif";
	
	/** The system-specific file separator (forward-slash on UNIX, back-slash on Windows, etc.) */
    private static final String fileSeparator = System.getProperty("file.separator");
	
	
    	
	
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
		addImage(CHECK_ICON_ID, reg);
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