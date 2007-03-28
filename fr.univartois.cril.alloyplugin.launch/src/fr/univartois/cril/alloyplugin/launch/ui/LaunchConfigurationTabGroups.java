package fr.univartois.cril.alloyplugin.launch.ui;


import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.ILaunchConfigurationTabGroup;

import fr.univartois.cril.alloyplugin.launch.util.Util;


public class LaunchConfigurationTabGroups extends
		AbstractLaunchConfigurationTabGroup {

	

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {		
		//TODO make a tab launch configuration (for choosing commands to be executed, solver etc...)				 
		CommonTab c=new CommonTab();		
		LaunchConfigurationTab tabPerso=new LaunchConfigurationTab();
		ILaunchConfigurationTab[] tabs = {c,tabPerso};
		//tab[0]=c;
		setTabs(tabs);
	}

	/*public void dispose() {	}

	public ILaunchConfigurationTab[] getTabs() {
		// TODO Auto-generated method stub
		return null;
	}

	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		
	}

	public void launched(ILaunch launch) {
		// TODO Auto-generated method stub
		
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}
*/
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		IResource res=AlloyCommandView.getCurrentALSFile().getResource();
		
		configuration.rename(res.getName()); //setAttribute(attributeName, value)
		
		
		IResource[] resources={res};
		configuration.setMappedResources(resources);
	}

}
