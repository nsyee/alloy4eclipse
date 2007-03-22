package fr.univartois.cril.alloyplugin.launch;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
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

	/** The system-specific file separator (forward-slash on UNIX, back-slash on Windows, etc.) */
    private static final String fs = System.getProperty("file.separator");
    
	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;		
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
	 private void copyFromJAR() {
	        // Compute the appropriate platform
	        String os = System.getProperty("os.name").toLowerCase().replace(' ','-');
	        if (os.startsWith("mac-")) os="mac"; else if (os.startsWith("windows-")) os="windows";
	        String arch = System.getProperty("os.arch").toLowerCase().replace(' ','-');
	        if (arch.equals("powerpc")) arch="ppc-"+os; else arch=arch.replaceAll("\\Ai[3456]86\\z","x86")+"-"+os;
	        // Find out the appropriate Alloy directory
	        final String platformBinary=Helper.alloyHome()+fs+"binary";
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
	        // Copy the model files
	        Util.copy(false, true, false, Helper.alloyHome(),
	           "models/examples/algorithms/dijkstra.als", "models/examples/algorithms/messaging.als",
	           "models/examples/algorithms/opt_spantree.als", "models/examples/algorithms/peterson.als",
	           "models/examples/algorithms/ringlead.als", "models/examples/algorithms/s_ringlead.als",
	           "models/examples/algorithms/stable_mutex_ring.als",
	           "models/examples/algorithms/stable_orient_ring.als",
	           "models/examples/algorithms/stable_ringlead.als", "models/examples/case_studies/INSLabel.als",
	           "models/examples/case_studies/chord.als", "models/examples/case_studies/chord2.als",
	           "models/examples/case_studies/chordbugmodel.als", "models/examples/case_studies/com.als",
	           "models/examples/case_studies/firewire.als", "models/examples/case_studies/ins.als",
	           "models/examples/case_studies/iolus.als", "models/examples/case_studies/sync.als",
	           "models/examples/case_studies/syncimpl.als", "models/examples/puzzles/farmer.als",
	           "models/examples/puzzles/handshake.als", "models/examples/puzzles/hanoi.als",
	           "models/examples/systems/file_system.als", "models/examples/systems/javatypes_soundness.als",
	           "models/examples/systems/lists.als", "models/examples/systems/marksweepgc.als",
	           "models/examples/systems/views.als", "models/examples/toys/birthday.als",
	           "models/examples/toys/ceilingsAndFloors.als", "models/examples/toys/genealogy.als",
	           "models/examples/toys/grandpa.als", "models/examples/toys/javatypes.als",
	           "models/examples/toys/life.als", "models/examples/toys/numbering.als",
	           "models/examples/toys/railway.als", "models/examples/toys/trivial.als",
	           "models/examples/tutorial/farmer.als",
	           "models/util/boolean.als", "models/util/graph.als", "models/util/integer.als",
	           "models/util/natural.als", "models/util/ordering.als", "models/util/relation.als",
	           "models/util/seqrel.als", "models/util/sequniv.als", "models/util/sequence.als",
	           "models/util/ternary.als",
	           "models/book/chapter2/addressBook1a.als", "models/book/chapter2/addressBook1b.als", "models/book/chapter2/addressBook1c.als",
	           "models/book/chapter2/addressBook1d.als", "models/book/chapter2/addressBook1e.als", "models/book/chapter2/addressBook1f.als",
	           "models/book/chapter2/addressBook1g.als", "models/book/chapter2/addressBook1h.als", "models/book/chapter2/addressBook2a.als",
	           "models/book/chapter2/addressBook2b.als", "models/book/chapter2/addressBook2c.als", "models/book/chapter2/addressBook2d.als",
	           "models/book/chapter2/addressBook2e.als", "models/book/chapter2/addressBook3a.als", "models/book/chapter2/addressBook3b.als",
	           "models/book/chapter2/addressBook3c.als", "models/book/chapter2/addressBook3d.als", "models/book/chapter2/theme.thm",
	           "models/book/chapter4/filesystem.als", "models/book/chapter4/grandpa1.als", "models/book/chapter4/grandpa2.als",
	           "models/book/chapter4/grandpa3.als", "models/book/chapter4/lights.als",
	           "models/book/chapter5/addressBook.als", "models/book/chapter5/lists.als",
	           "models/book/chapter5/sets1.als", "models/book/chapter5/sets2.als",
	           "models/book/chapter6/hotel.thm",
	           "models/book/chapter6/hotel1.als", "models/book/chapter6/hotel2.als",
	           "models/book/chapter6/hotel3.als", "models/book/chapter6/hotel4.als", "models/book/chapter6/mediaAssets.als",
	           "models/book/chapter6/memory/abstractMemory.als", "models/book/chapter6/memory/cacheMemory.als",
	           "models/book/chapter6/memory/checkCache.als", "models/book/chapter6/memory/checkFixedSize.als",
	           "models/book/chapter6/memory/fixedSizeMemory.als", "models/book/chapter6/memory/fixedSizeMemory_H.als",
	           "models/book/chapter6/ringElection.thm", "models/book/chapter6/ringElection1.als", "models/book/chapter6/ringElection2.als",
	           "models/book/appendixA/addressBook1.als", "models/book/appendixA/addressBook2.als", "models/book/appendixA/barbers.als",
	           "models/book/appendixA/closure.als", "models/book/appendixA/distribution.als", "models/book/appendixA/phones.als",
	           "models/book/appendixA/prison.als", "models/book/appendixA/properties.als", "models/book/appendixA/ring.als",
	           "models/book/appendixA/spanning.als", "models/book/appendixA/tree.als", "models/book/appendixA/tube.als",
	           "models/book/appendixA/undirected.als",
	           "models/book/appendixE/hotel.thm",
	           "models/book/appendixE/p300-hotel.als", "models/book/appendixE/p303-hotel.als", "models/book/appendixE/p306-hotel.als"
	           );
	        // Record the locations
	        System.setProperty("alloy.dotbin0", platformBinary+fs+"dotbin");
	    }
}
