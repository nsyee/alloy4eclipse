package fr.univartois.cril.alloyplugin;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


import org.eclipse.core.resources.IProjectNatureDescriptor;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import fr.univartois.cril.alloyplugin.editor.ALSCodeScanner;
import fr.univartois.cril.alloyplugin.editor.ALSPartitionScanner;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
import fr.univartois.cril.alloyplugin.util.ALSTextAttributeProvider;

public class AlloyPlugin extends AbstractUIPlugin {
	/** instance of the plugin*/
	private static AlloyPlugin plugin;
	/** The plug-in ID*/
	public static final String PLUGIN_ID = "fr.univartois.cril.alloyplugin";
	
	
	/** extension editor listener ID*/
	private static final String editorListenerExtensionId="fr.univartois.cril.alloyplugin.editorlisteners";
	/** extension project builders ID*/
	private static final String projectBuildersExtensionId="fr.univartois.cril.alloyplugin.projectbuilderscontribution";
	/***/
	public static final String ALS_PARTITIONING = "__pos_als_partitioning";
	
	/** listeners for commands */	
	private List<IAlloyEditorListener> editorListeners;
	
	private List<String> projectBuildersID;
	private IPartitionTokenScanner fPartitionScanner;
	private ALSTextAttributeProvider fTextAttributeProvider;
	private ALSCodeScanner fCodeScanner;

	public AlloyPlugin(){
		super();
		plugin=this;
		//Workspace workspace=PlatformUI.getWorkbench().ge;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProjectNatureDescriptor descriptor = workspace.getNatureDescriptor(ProjectNature.NATURE_ID);
		
			System.out.println("truc:"+descriptor);	
		
		
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
	 * Returns command listeners.
	 * */	
	public String[] getProjectBuildersID(){
		if (projectBuildersID==null)
			projectBuildersID=computeProjectNaturesID();
		String[] projectNaturesIDTab=new String[projectBuildersID.size()];
		int i=0;
		for (String id : projectBuildersID) {
			projectNaturesIDTab[i++]=id;
		}
		
		return projectNaturesIDTab;	
	}
	
	private List<String> computeProjectNaturesID() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint= registry.getExtensionPoint(projectBuildersExtensionId);
		IExtension[] extensions = extensionPoint.getExtensions();
		ArrayList<String> results = new ArrayList<String>();
		for(int i = 0 ;i< extensions.length;i++){
			IConfigurationElement[] elements=extensions[i].getConfigurationElements();
			for(int j=0;j<elements.length;j++){
				//try{
					String s=elements[j].getAttribute("projectBuilderId");					
				if(s!=null&&!results.contains(s))
					{System.out.println("ajoutebuilderIDExtensionFound:"+s);
					results.add(s);
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
		IExtensionPoint extensionPoint= registry.getExtensionPoint(editorListenerExtensionId);
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


	public void fireFileLoaded(IALSFile file){
		for(IAlloyEditorListener listener: getEditorListeners()){
			listener.fileLoaded(file);
		}
	}	
	public void fireFileSaved(IALSFile file){
		for(IAlloyEditorListener listener: getEditorListeners()){
			listener.fileSaved(file);
		}
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
