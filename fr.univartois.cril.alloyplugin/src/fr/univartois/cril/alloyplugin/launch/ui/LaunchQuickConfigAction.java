package fr.univartois.cril.alloyplugin.launch.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.SelectionProviderAction;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.alloyplugin.launch.util.Util;



/**
 * This listens a selectionProvider and can execute selected ExecutableCommand from it.  
 * This action use eclipse launching mechanism.
 */
public class LaunchQuickConfigAction extends SelectionProviderAction {
	private static final String ACTION_ID = "fr.univartois.cril.alloyplugin.launch.runalloycommand";
	 
	private static ImageDescriptor enableImage=AlloyPlugin.getDefault().getImageRegistry().getDescriptor(AlloyPlugin.EXECUTE_ICON_ID);
	private static ImageDescriptor disableImage=AlloyPlugin.getDefault().getImageRegistry().getDescriptor(AlloyPlugin.DISABLE_EXECUTE_ICON_ID);


	/**
	 * the selection which is associated.
	 */
	private IStructuredSelection selection;

	//private Object[] lastCommands;	

	/**
	 * Constructor. 
	 * */
	public LaunchQuickConfigAction(ISelectionProvider sp) {
		super(sp,"Launch Command(s)");
		this.setEnabled(false);
		setImageDescriptor(enableImage);
		setDisabledImageDescriptor(disableImage);
		setToolTipText("Launch Alloy command(s) in quick launch configuration");
		setActionDefinitionId(ACTION_ID);
	}




	public void selectionChanged(IStructuredSelection selection)
	{	
		this.selection=selection;
		if (selection.isEmpty()) this.setEnabled(false);
		else {
			for (Iterator iter=selection.iterator();iter.hasNext();){
				Object o=iter.next();
				if (!(o instanceof ExecutableCommand)){
					this.setEnabled(false);
					return;
				}
			}
		}
		setEnabled(true);
	}



	/**
	 * Create and run a quick launch configuration with all ExecutableCommand from selection.
	 * */

	public void run() {
		List<ExecutableCommand> commandsList = getExecutableCommandFromSelection(selection);
		if (!commandsList.isEmpty())
		{
			deleteQuickLaunchConfiguration(commandsList.get(0).getResource());	
			ILaunchConfiguration config =  createQuickConfiguration(commandsList);
			if (config != null) {

				DebugUITools.launch(config, LaunchConfigurationConstants.RUN_MODE);
			}
		}
	}

	private ILaunchConfiguration createQuickConfiguration(List<ExecutableCommand> commandsList) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			LaunchCommandsTab tab = new LaunchCommandsTab();

			if (!commandsList.isEmpty())
			{

				wc = configType.newInstance(null, getLaunchManager().generateUniqueLaunchConfigurationNameFrom("QuickConfig_"+commandsList.get(0).getResource().getName()));				
				tab.setdefaultsAttributes(commandsList, wc);

				wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_QUICK_CONFIG,"true");
				config = wc.doSave();

			}
		} catch (CoreException e) {
//			TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return config;
	}




	private ILaunchManager getLaunchManager() {
		// 
		return DebugPlugin.getDefault().getLaunchManager();
	}

	private ILaunchConfigurationType getConfigurationType() {
		return DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurationType(LaunchConfigurationConstants.LAUNCH_CONFIGURATION_TYPE);

	}


	/**
	 * Delete quick launch configuration previously created with this resource.	
	 */
	private void deleteQuickLaunchConfiguration(IResource resource) {

		try {
			ILaunchConfiguration[] configs = getLaunchManager().getLaunchConfigurations(getConfigurationType());

			for (int i = 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				if (config.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_QUICK_CONFIG,"").equals("true")) {
					if (config.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME,"").equals(Util.getFileLocation(resource))) {

						config.delete();					

					}	
				}

			}			
		} catch (CoreException e) {
//			TODO Auto-generated catch block
			e.printStackTrace();						
		}

	}
	/**
	 * Return executable a list of command from selection. can be empty.
	 * */
	public List<ExecutableCommand> getExecutableCommandFromSelection( IStructuredSelection selection) {
		ArrayList<ExecutableCommand> list =new ArrayList<ExecutableCommand>();
		if (!selection.isEmpty()) {
			for ( Iterator iterator = selection.iterator();iterator.hasNext();) {
				Object obj=iterator.next();
				if (obj instanceof ExecutableCommand) {


					list.add((ExecutableCommand) obj);											
				}
			}
		}
		return list;
	}
}
