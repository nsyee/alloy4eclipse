package fr.univartois.cril.alloyplugin.launch.ui;


import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;


public class LaunchConfigurationTabGroups extends
		AbstractLaunchConfigurationTabGroup {

	public LaunchConfigurationTabGroups() {
		
	}

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		//TODO make a tab launch configuration (for choosing commands to be executed, solver etc...)				 
		CommonTab c=new CommonTab();
		
		LaunchConfigurationTab tabPerso=new LaunchConfigurationTab();
		ILaunchConfigurationTab[] tabs = {c,tabPerso};
		//tab[0]=c;
		setTabs(tabs);
	}

}
