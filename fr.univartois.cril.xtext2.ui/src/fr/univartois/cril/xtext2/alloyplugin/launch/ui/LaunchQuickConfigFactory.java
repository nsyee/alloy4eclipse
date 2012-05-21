package fr.univartois.cril.xtext2.alloyplugin.launch.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;

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

	public ILaunchConfiguration create(IResource resource, String command) {
		if (command !=null){
			deleteQuickLaunchConfiguration(resource);	
			return createQuickConfiguration(resource, command);
		}
		return null;
	}
	
	public ILaunchConfiguration createAssertion(IResource resource, String command) {
		if (command !=null){
			deleteQuickLaunchConfiguration(resource);	
			return createQuickConfigurationAssertion(resource, command);
		}
		return null;
	}
	
	public ILaunchConfiguration createPredicate(IResource resource, String command) {
		if (command !=null){
			deleteQuickLaunchConfiguration(resource);	
			return createQuickConfigurationPredicate(resource, command);
		}
		return null;
	}
	
	public ILaunchConfiguration createCommand(IResource resource, String command) {
		deleteQuickLaunchConfiguration(resource);	
		return createQuickConfigurationCommand(resource, command);
	}
	
	public ILaunchConfiguration createModule(IResource resource, String command) {
		deleteQuickLaunchConfiguration(resource);	
		return createQuickConfigurationModule(resource, command);
	}

	private ILaunchConfiguration createQuickConfiguration(IResource resource, String command) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			LaunchCommandsTab tab = new LaunchCommandsTab();

			if(command != null){
				wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName(command+"_"+ resource.getName()));				
				tab.setdefaultsAttributes(resource, command, wc);
				wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_QUICK_CONFIG,"true");
				config = wc.doSave();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return config;
	}
	
	private ILaunchConfiguration createQuickConfigurationAssertion(IResource resource, String command) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			LaunchCommandsTab tab = new LaunchCommandsTab();

			if(command != null){
				wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName(command+"_"+ resource.getName()));				
				tab.setdefaultsAttributes(resource, command, wc);
				wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_QUICK_CONFIG, "true");
				wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_HANDLER, "assertion");
				config = wc.doSave();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return config;
	}
	
	private ILaunchConfiguration createQuickConfigurationPredicate(IResource resource, String command) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			LaunchCommandsTab tab = new LaunchCommandsTab();

			if(command != null){
				wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName(command+"_"+ resource.getName()));				
				tab.setdefaultsAttributes(resource, command, wc);
				wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_QUICK_CONFIG, "true");
				wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_HANDLER, "predicate");
				config = wc.doSave();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return config;
	}
	
	private ILaunchConfiguration createQuickConfigurationCommand(IResource resource, String command) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			LaunchCommandsTab tab = new LaunchCommandsTab();

			wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName(command + "_" + resource.getName()));				
			tab.setdefaultsAttributes(resource, command, wc);
			wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_QUICK_CONFIG, "true");
			wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_HANDLER, "command");
			config = wc.doSave();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return config;
	}
	
	private ILaunchConfiguration createQuickConfigurationModule(IResource resource, String command) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			LaunchCommandsTab tab = new LaunchCommandsTab();

			wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName(command + "_" + resource.getName()));				
			tab.setdefaultsAttributes(resource, command, wc);
			wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_QUICK_CONFIG, "true");
			wc.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_HANDLER, "module");
			config = wc.doSave();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return config;
	}

	private ILaunchManager getLaunchManager() {
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
			e.printStackTrace();						
		}

	}
	
}
