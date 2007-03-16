package fr.univartois.cril.alloyplugin.launch.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class LaunchConfigurationTabGroups extends
		AbstractLaunchConfigurationTabGroup {

	public LaunchConfigurationTabGroups() {
		// TODO Auto-generated constructor stub
		System.out.println("youpi");
	}

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		// TODO Auto-generated method stub
		//dialog.
		//dialog.
		System.out.println("yeah");
		 
		CommonTab c=new CommonTab();
		ILaunchConfigurationTab[] tab = new ILaunchConfigurationTab[1];
		tab[0]=c;
		setTabs(tab);

	}

}
