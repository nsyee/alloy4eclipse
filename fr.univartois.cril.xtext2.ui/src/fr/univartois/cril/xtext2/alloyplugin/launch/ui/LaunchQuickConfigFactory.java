package fr.univartois.cril.xtext2.alloyplugin.launch.ui;


import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;

import fr.univartois.cril.xtext2.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext2.alloyplugin.api.Util;




public class LaunchQuickConfigFactory  {




	private static LaunchQuickConfigFactory instance;


	private LaunchQuickConfigFactory() {	

	}

	public static LaunchQuickConfigFactory getInstance() { 
		if(instance==null) instance=new LaunchQuickConfigFactory();
		return instance; 
	}

	/**
	 * Delete previous quick launch configuration associated with same file
	 * then create and return a new one with all IALSCommand from commandsList or null if list is empty.
	 * @return 
	 * */

	public ILaunchConfiguration create(List<IALSCommand> commandsList) {
		//List<IALSCommand> commandsList = getIALSCommandFromSelection(selection);
		if (!commandsList.isEmpty())
		{
			deleteQuickLaunchConfiguration(commandsList.get(0).getResource());	
			return createQuickConfiguration(commandsList);

		}
		return null;
	}


	private ILaunchConfiguration createQuickConfiguration(List<IALSCommand> commandsList) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			LaunchCommandsTab tab = new LaunchCommandsTab();

			if (!commandsList.isEmpty())
			{

				wc = configType.newInstance(null, getLaunchManager().generateUniqueLaunchConfigurationNameFrom("QuickConfig_"+commandsList.get(0).getResource().getName()));				
				tab.setdefaultsAttributes(commandsList, wc);
				wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME,Util.getFileLocation(commandsList.get(0).getResource()));
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
	
}
