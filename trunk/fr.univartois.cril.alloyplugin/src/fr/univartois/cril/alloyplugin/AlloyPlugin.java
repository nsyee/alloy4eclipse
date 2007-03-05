package fr.univartois.cril.alloyplugin;

import java.util.List;
import java.util.ArrayList;

import org.eclipse.core.runtime.*;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.univartois.cril.alloyplugin.editor.ALSCodeScanner;
import fr.univartois.cril.alloyplugin.editor.ALSPartitionScanner;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
import fr.univartois.cril.alloyplugin.util.ALSTextAttributeProvider;

public class AlloyPlugin extends AbstractUIPlugin {
	/** instance of the plugin*/
	private static AlloyPlugin plugin;
	/** The plug-in ID*/
	public static final String PLUGIN_ID = "fr.univartois.cril.alloyplugin";
	/** extension command listener ID*/
	private static final String listenerId="fr.univartois.cril.alloyplugin.listeners";
	/** extension editor listener ID*/
	private static final String editorListenerId="fr.univartois.cril.alloyplugin.editorlisteners";
	/***/
	public static final String ALS_PARTITIONING = "__pos_als_partitioning";
	/** listeners for commands */
	private List<ICommandListener> commandListeners;
	private List<IAlloyEditorListener> editorListeners;
	private IPartitionTokenScanner fPartitionScanner;
	private ALSTextAttributeProvider fTextAttributeProvider;
	private ALSCodeScanner fCodeScanner;

	public AlloyPlugin(){
		super();
		plugin=this;
	}
	/**
	 * Returns command listeners.
	 * */	
	public List<ICommandListener> getCommandListeners(){
		if (commandListeners==null)
			commandListeners=computeListeners();
		return commandListeners;	
	}

	/**
	 * Returns command listeners.
	 * */	
	public List<IAlloyEditorListener> getEditorListeners(){
		if (editorListeners==null)
			editorListeners=computeEditorListeners();
		return editorListeners;	
	}
	/**
	 * Adds commands listeners from existing extension points to the plugin.
	 * */
	private List<ICommandListener> computeListeners() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint= registry.getExtensionPoint(listenerId);
		IExtension[] extensions = extensionPoint.getExtensions();
		ArrayList<ICommandListener> results = new ArrayList<ICommandListener>();
		for(int i = 0 ;i< extensions.length;i++){
			IConfigurationElement[] elements=extensions[i].getConfigurationElements();
			for(int j=0;j<elements.length;j++){
				try{Object listener=elements[j].createExecutableExtension("class");
				if(listener instanceof ICommandListener)
					results.add((ICommandListener)listener);
				}catch(CoreException e){
					e.printStackTrace();
				}
			}
		}
		return results;
	}
	/**
	 * Adds editor listeners from existing extension points to the plugin.
	 * */
	private List<IAlloyEditorListener> computeEditorListeners() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint= registry.getExtensionPoint(editorListenerId);
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


	public void fireFileLoaded(String fileLocation){
		for(IAlloyEditorListener listener: getEditorListeners()){
			listener.fileLoaded(fileLocation);
		}
	}	
	public void fireFileSaved(String fileLocation){
		for(IAlloyEditorListener listener: getEditorListeners()){
			listener.fileSaved(fileLocation);
		}
	}	
	public void fireFileChanged(String fileLocation){
		for(IAlloyEditorListener listener: getEditorListeners()){
			listener.fileSaved(fileLocation);
		}		
	}
	public void fireSetFocus(String fileLocation) {
		for(IAlloyEditorListener listener: getEditorListeners()){
			listener.fileSetFocus(fileLocation);
		}		
	}
	/**
	 * Adds command listener to the plugin.
	 * */
	public void addCommandListener(ICommandListener listener){
		getCommandListeners().add(listener);
	}
	/**
	 * Remove command listener from the plugin.
	 * */
	public void removeCommandListener(ICommandListener listener){
		getCommandListeners().remove(listener);		
	}


	public void fireCommandsStarted(int testCount) {
		// TODO avertir les listeners
	}

	public void fireCommandsFinished() {
		// TODO avertir les listeners
	}
	public void fireCommandStarted(String klass, String method) {
		// TODO avertir les listeners
	}

	public void fireCommandFailed(String klass, String method, String trace) {
		// TODO avertir les listeners
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
	

}
