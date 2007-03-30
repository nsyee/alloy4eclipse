package fr.univartois.cril.alloyplugin;


import java.util.List;
import java.util.ArrayList;
import org.eclipse.core.resources.IProjectNatureDescriptor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.univartois.cril.alloyplugin.core.ALSFile;
import fr.univartois.cril.alloyplugin.editor.ALSCodeScanner;
import fr.univartois.cril.alloyplugin.editor.ALSPartitionScanner;

import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
import fr.univartois.cril.alloyplugin.util.ALSTextAttributeProvider;

public class AlloyPlugin extends AbstractUIPlugin {
	/** instance of the plugin*/
	private static AlloyPlugin plugin;
	/**
	 *  The plug-in ID.
	 */
	public static final String PLUGIN_ID = "fr.univartois.cril.alloyplugin";
	/**
	 *  extension project builders ID
	 */
	private static final String projectBuildersExtensionId="fr.univartois.cril.alloyplugin.projectbuilderscontribution";
	private static final String listenerId="fr.univartois.cril.alloyplugin.editorlistener";
	/***/
	public static final String ALS_PARTITIONING = "__pos_als_partitioning";
	/**
	 * Default project builder Id.  
	 */
	private static final String PROJECT_BUILDER_ID = "fr.univartois.cril.alloyplugin.builder";

	/** listeners for commands */	
	private List<IAlloyEditorListener> editorListeners;
	/**
	 * project builders.
	 */
	private String[] projectBuildersID;


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
			editorListeners=computeListeners();
		return editorListeners;	
	}
	/**
	 * Returns project builders listeners.
	 * */	
	public String[] getProjectBuildersID(){

		if (projectBuildersID==null)
		{
			List<String> projectBuildersIDList= new ArrayList<String>();
			projectBuildersIDList.add(PROJECT_BUILDER_ID);
			computeProjectNaturesID(projectBuildersIDList);
			projectBuildersID=new String[projectBuildersIDList.size()];
			int i=0;
			for (String id : projectBuildersIDList) {
				projectBuildersID[i++]=id;
			}
		}
		return projectBuildersID;	
	}
	/**
	 *  get the project builders contribution from plugins which declare fr.univartois.cril.alloyplugin.projectbuilderscontribution extension.
	 */
	private void computeProjectNaturesID(List<String> projectBuildersIDList) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint= registry.getExtensionPoint(projectBuildersExtensionId);
		IExtension[] extensions = extensionPoint.getExtensions();

		for(int i = 0 ;i< extensions.length;i++){
			IConfigurationElement[] elements=extensions[i].getConfigurationElements();
			for(int j=0;j<elements.length;j++){
				//try{
				String s=elements[j].getAttribute("projectBuilderId");					
				if(s!=null&&!projectBuildersIDList.contains(s))
				{System.out.println("ajoutebuilderIDExtensionFound:"+s);
				projectBuildersIDList.add(s);
				}
			}
		}

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

	




}
