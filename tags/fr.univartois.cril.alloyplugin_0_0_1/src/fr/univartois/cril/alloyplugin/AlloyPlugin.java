package fr.univartois.cril.alloyplugin;

import java.util.List;
import java.util.ArrayList;

import org.eclipse.core.runtime.*;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.univartois.cril.alloyplugin.editor.ALSCodeScanner;
import fr.univartois.cril.alloyplugin.editor.ALSPartitionScanner;
import fr.univartois.cril.alloyplugin.util.ALSTextAttributeProvider;



public class AlloyPlugin extends AbstractUIPlugin {
	private static AlloyPlugin plugin;
	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.contribution.alloyplugin";
	private static final String listenerId="org.eclipse.contribution.junit.listeners";
	public static final String ALS_PARTITIONING = "__pos_als_partitioning";
	private List<ITestRunListener> listeners;//=new ArrayList();
	private IPartitionTokenScanner fPartitionScanner;
	private ALSTextAttributeProvider fTextAttributeProvider;
	private ALSCodeScanner fCodeScanner;
	
		public AlloyPlugin(){
		super();
		plugin=this;
	}
	
	public List<ITestRunListener> getListeners(){
		if (listeners==null)
			listeners=computeListeners();
		return listeners;	
	}
	private List<ITestRunListener> computeListeners() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint= registry.getExtensionPoint(listenerId);
		IExtension[] extensions = extensionPoint.getExtensions();
		ArrayList<ITestRunListener> results = new ArrayList<ITestRunListener>();
		for(int i = 0 ;i< extensions.length;i++){
			IConfigurationElement[] elements=extensions[i].getConfigurationElements();
			for(int j=0;j<elements.length;j++){
				try{Object listener=elements[j].createExecutableExtension("class");
				if(listener instanceof ITestRunListener)
					results.add((ITestRunListener)listener);
				}catch(CoreException e){
					e.printStackTrace();
				}
				}
			}
		return results;
	}
	public void addTestListener(ITestRunListener listener){
		getListeners().add(listener);
	}
	public void removeTestListener(ITestRunListener listener){
		getListeners().remove(listener);		
	}
	
	
	public void fireTestsStarted(int testCount) {
		// TODO avertit les listeners
	}

	public void fireTestsFinished() {
		// TODO avertit les listeners
	}
	public void fireTestStarted(String klass, String method) {
		// TODO avertit les listeners
	}

	public void fireTestFailed(String klass, String method, String trace) {
		// TODO avertit les listeners
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
		super.stop(context);
	}


	public static AlloyPlugin getDefault(){
		return plugin;
		
	}
	public void run(IType type)
	{
		System.out.println("run run run");
	}
	
	
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
	
}
