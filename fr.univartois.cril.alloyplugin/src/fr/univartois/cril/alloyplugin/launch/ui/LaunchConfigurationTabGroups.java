package fr.univartois.cril.alloyplugin.launch.ui;




import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class LaunchConfigurationTabGroups extends
		AbstractLaunchConfigurationTabGroup {

	

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {						 
		CommonTab c=new CommonTab();	
		
		LaunchCommandsTab tabPerso=new LaunchCommandsTab();
		ILaunchConfigurationTab[] tabs = {c,tabPerso};
		//tab[0]=c;
		setTabs(tabs);
		
	}


}
