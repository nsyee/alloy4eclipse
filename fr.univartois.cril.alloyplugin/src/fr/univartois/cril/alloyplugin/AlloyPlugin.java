package fr.univartois.cril.alloyplugin;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.mit.csail.sdg.alloy4.Util;

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

	public AlloyPlugin() {
		super();
		plugin = this;

		copyFromJAR();

	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static AlloyPlugin getDefault() {
		return plugin;

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
