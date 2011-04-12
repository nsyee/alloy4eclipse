package fr.univartois.cril.xtext.alloyplugin;



import org.eclipse.core.internal.preferences.OSGiPreferencesServiceImpl;
import org.eclipse.core.internal.preferences.OSGiPreferencesServiceManager;
import org.eclipse.core.internal.registry.osgi.OSGIUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.mit.csail.sdg.alloy4.Util;
import fr.univartois.cril.xtext.alloyplugin.preferences.PreferenceConstants;

public class AlloyPlugin extends AbstractUIPlugin {
	/** instance of the plugin */
	private static AlloyPlugin plugin;
	/**
	 * The plug-in ID.
	 */
	public static final String PLUGIN_ID = "fr.univartois.cril.alloyplugin";

	/***/
	public static final String ALS_PARTITIONING = "__pos_als_partitioning";

	//
	public static final String COMMAND_VIEW_ID = "fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView";

	/**
	 * The system-specific file separator (forward-slash on UNIX, back-slash on
	 * Windows, etc.)
	 */
	public static final String FILE_SEPARATOR = System
			.getProperty("file.separator");

	private BundleContext context;
	
	public AlloyPlugin() {
		super();
		plugin = this;

		copyFromJAR();
		
		

	
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		this.context = context;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static AlloyPlugin getDefault() {
		return plugin;

	}

	public BundleContext getBundleContext() {
		return context;
	}
	
	/*
	 * public void run(IType type) { System.out.println("run run run"); }
	 */

	private void copyFromJAR() {
		// Compute the appropriate platform
		String os = System.getProperty("os.name").toLowerCase().replace(' ',
				'-');

		if (os.startsWith("mac-"))
			os = "mac";
		else if (os.startsWith("windows-"))
			os = "windows";

		String arch = System.getProperty("os.arch").toLowerCase().replace(' ',
				'-');

		if (arch.equals("powerpc"))
			arch = "ppc-" + os;
		else
			arch = "x86-" + os;

		// Find out the appropriate Alloy directory
		final String platformBinary = Helper.alloyHome() + FILE_SEPARATOR
				+ "binary";

		// Copy the platform-dependent binaries
		Util.copy(true, false, platformBinary, arch + "/libminisat.so", arch
				+ "/libminisat.jnilib", arch + "/libminisatprover.so", arch
				+ "/libminisatprover.jnilib", arch + "/libzchaff.so", arch
				+ "/libzchaff.jnilib", arch + "/minisat1", arch + "/berkmin",
				arch + "/dotbin");
		Util.copy(false, false, platformBinary, arch + "/minisat.dll", arch
				+ "/minisatprover.dll", arch + "/zchaff.dll", arch
				+ "/minisat1.exe", arch + "/berkmin.exe", arch + "/dotbin.exe",
				arch + "/jpeg.dll", arch + "/libexpat.dll", arch
						+ "/libexpatw.dll", arch + "/zlib1.dll", arch
						+ "/z.dll", arch + "/freetype6.dll", arch + "/png.dll");

		// Copy the model files
        Util.copy(false, true, Helper.alloyHome(),
           "models/book/appendixA/addressBook1.als", "models/book/appendixA/addressBook2.als", "models/book/appendixA/barbers.als",
           "models/book/appendixA/closure.als", "models/book/appendixA/distribution.als", "models/book/appendixA/phones.als",
           "models/book/appendixA/prison.als", "models/book/appendixA/properties.als", "models/book/appendixA/ring.als",
           "models/book/appendixA/spanning.als", "models/book/appendixA/tree.als", "models/book/appendixA/tube.als", "models/book/appendixA/undirected.als",
           "models/book/appendixE/hotel.thm", "models/book/appendixE/p300-hotel.als", "models/book/appendixE/p303-hotel.als", "models/book/appendixE/p306-hotel.als",
           "models/book/chapter2/addressBook1a.als", "models/book/chapter2/addressBook1b.als", "models/book/chapter2/addressBook1c.als",
           "models/book/chapter2/addressBook1d.als", "models/book/chapter2/addressBook1e.als", "models/book/chapter2/addressBook1f.als",
           "models/book/chapter2/addressBook1g.als", "models/book/chapter2/addressBook1h.als", "models/book/chapter2/addressBook2a.als",
           "models/book/chapter2/addressBook2b.als", "models/book/chapter2/addressBook2c.als", "models/book/chapter2/addressBook2d.als",
           "models/book/chapter2/addressBook2e.als", "models/book/chapter2/addressBook3a.als", "models/book/chapter2/addressBook3b.als",
           "models/book/chapter2/addressBook3c.als", "models/book/chapter2/addressBook3d.als", "models/book/chapter2/theme.thm",
           "models/book/chapter4/filesystem.als", "models/book/chapter4/grandpa1.als",
           "models/book/chapter4/grandpa2.als", "models/book/chapter4/grandpa3.als", "models/book/chapter4/lights.als",
           "models/book/chapter5/addressBook.als", "models/book/chapter5/lists.als", "models/book/chapter5/sets1.als", "models/book/chapter5/sets2.als",
           "models/book/chapter6/hotel.thm", "models/book/chapter6/hotel1.als", "models/book/chapter6/hotel2.als",
           "models/book/chapter6/hotel3.als", "models/book/chapter6/hotel4.als", "models/book/chapter6/mediaAssets.als",
           "models/book/chapter6/memory/abstractMemory.als", "models/book/chapter6/memory/cacheMemory.als",
           "models/book/chapter6/memory/checkCache.als", "models/book/chapter6/memory/checkFixedSize.als",
           "models/book/chapter6/memory/fixedSizeMemory.als", "models/book/chapter6/memory/fixedSizeMemory_H.als",
           "models/book/chapter6/ringElection.thm", "models/book/chapter6/ringElection1.als", "models/book/chapter6/ringElection2.als",
           "models/examples/algorithms/dijkstra.als", "models/examples/algorithms/dijkstra.thm",
           "models/examples/algorithms/messaging.als", "models/examples/algorithms/messaging.thm",
           "models/examples/algorithms/opt_spantree.als", "models/examples/algorithms/opt_spantree.thm",
           "models/examples/algorithms/peterson.als",
           "models/examples/algorithms/ringlead.als", "models/examples/algorithms/ringlead.thm",
           "models/examples/algorithms/s_ringlead.als",
           "models/examples/algorithms/stable_mutex_ring.als", "models/examples/algorithms/stable_mutex_ring.thm",
           "models/examples/algorithms/stable_orient_ring.als", "models/examples/algorithms/stable_orient_ring.thm",
           "models/examples/algorithms/stable_ringlead.als", "models/examples/algorithms/stable_ringlead.thm",
           "models/examples/case_studies/INSLabel.als", "models/examples/case_studies/chord.als",
           "models/examples/case_studies/chord2.als", "models/examples/case_studies/chordbugmodel.als",
           "models/examples/case_studies/com.als", "models/examples/case_studies/firewire.als", "models/examples/case_studies/firewire.thm",
           "models/examples/case_studies/ins.als", "models/examples/case_studies/iolus.als",
           "models/examples/case_studies/sync.als", "models/examples/case_studies/syncimpl.als",
           "models/examples/puzzles/farmer.als", "models/examples/puzzles/farmer.thm",
           "models/examples/puzzles/handshake.als", "models/examples/puzzles/handshake.thm",
           "models/examples/puzzles/hanoi.als", "models/examples/puzzles/hanoi.thm",
           "models/examples/systems/file_system.als", "models/examples/systems/file_system.thm",
           "models/examples/systems/javatypes_soundness.als",
           "models/examples/systems/lists.als", "models/examples/systems/lists.thm",
           "models/examples/systems/marksweepgc.als", "models/examples/systems/views.als",
           "models/examples/toys/birthday.als", "models/examples/toys/birthday.thm",
           "models/examples/toys/ceilingsAndFloors.als", "models/examples/toys/ceilingsAndFloors.thm",
           "models/examples/toys/genealogy.als", "models/examples/toys/genealogy.thm",
           "models/examples/toys/grandpa.als", "models/examples/toys/grandpa.thm",
           "models/examples/toys/javatypes.als", "models/examples/toys/life.als", "models/examples/toys/life.thm",
           "models/examples/toys/numbering.als", "models/examples/toys/railway.als", "models/examples/toys/railway.thm",
           "models/examples/toys/trivial.als",
           "models/examples/tutorial/farmer.als",
           "models/util/boolean.als", "models/util/graph.als", "models/util/integer.als", "models/util/natural.als",
           "models/util/ordering.als", "models/util/relation.als", "models/util/seqrel.als", "models/util/sequence.als",
           "models/util/sequniv.als", "models/util/ternary.als", "models/util/time.als"
           );
        
     
		// Record the locations
		// System.setProperty("alloy.dotbin0",
		// AlloyPlugin.getDefault().getPreferenceStore()
		// .getString(PreferenceConstants.P_DOT_PATH));
	}

	public IStatus createStatus(int severity, int code, String message,
			Throwable throwable) {
		return new Status(severity, getBundle().getSymbolicName(), code,
				message, throwable);
	}

	public IStatus createError(int code, Throwable throwable) {
		String message = throwable.getMessage();
		if (message == null) {
			message = throwable.getClass().getName();
		}
		return createStatus(IStatus.ERROR, code, message, throwable);
	}

	public void logInfo(String message) {
		getLog().log(createStatus(IStatus.INFO, IStatus.INFO, message, null));
	}

	public void logWarning(String message) {
		getLog()
				.log(createStatus(IStatus.WARNING, IStatus.INFO, message, null));
	}

	public void logError(String message) {
		getLog().log(createStatus(IStatus.ERROR, IStatus.ERROR, message, null));
	}

	public void log(Throwable t) {
		getLog().log(createError(IStatus.ERROR, t));
	}

	/**
	 * @author romuald druelle
	 * @return
	 */
	public static String getPluginId() {
		return getDefault().getBundle().getSymbolicName();
	}

}
