package fr.univartois.cril.alloyplugin.launch.ui;


import org.eclipse.core.resources.IResource;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;

import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import fr.univartois.cril.alloyplugin.ui.IALSFile;

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

	

	public void launched(ILaunch launch) {
		// TODO Auto-generated method stub
		
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}
*/
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			System.out.print("trucbidul:"+configuration.getMappedResources());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		//IResource res=CommandsView.getCurrentALSFile().getResource();
		
	//	co//nfiguration.rename(res.getName()); //setAttribute(attributeName, value)
		
		
		//IResource[] resources={res};
		//configuration.setMappedResources(resources);
		
	}

}
