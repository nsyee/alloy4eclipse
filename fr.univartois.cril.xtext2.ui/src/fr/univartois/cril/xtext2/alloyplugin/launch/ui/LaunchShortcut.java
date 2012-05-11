package fr.univartois.cril.xtext2.alloyplugin.launch.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import fr.univartois.cril.xtext2.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext2.alloyplugin.api.Util;
import fr.univartois.cril.xtext2.alloyplugin.core.ALSFileFactory;

public class LaunchShortcut implements ILaunchShortcut {
	/**launch from selection*/
	public void launch(ISelection selection, String mode) {
		StructuredSelection sel;
		if (selection instanceof StructuredSelection)
		{   
			sel=(StructuredSelection)selection;
			launch(getResource(sel));
		}
	}

	/**launch from editor*/
	public void launch(IEditorPart editor, String mode) {		
		launch(getResource(editor));
	}

	/**
	 * Launches a configuration for the given resource.
	 */
	protected void launch(IResource resource) {
		ILaunchConfiguration config = findLaunchConfiguration(resource);
		if (config != null) {
			DebugUITools.launch(config, LaunchConfigurationConstants.RUN_MODE);
		}			
	}
	
	/**
	 * Create a default configuration from an resource.
	 * */
	protected ILaunchConfiguration createConfiguration(IResource resource) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		ILaunchConfigurationType configType = getConfigurationType();

		LaunchCommandsTab tab = new LaunchCommandsTab();
		IALSFile file = ALSFileFactory.instance().getALSFile(resource);
		if(file!=null){
			wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName(file.getName()));				
			tab.setdefaultsAttributes(file, wc) ;
			config = wc.doSave();
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
	 *
	 * Locate a configuration to relaunch.If one cannot be found, create one.
	 * 
	 * @return a re-usable config or <code>null</code> if none
	 */
	protected ILaunchConfiguration findLaunchConfiguration(IResource resource) {
		List<ILaunchConfiguration> candidateConfigs=null;

		try {		
			ILaunchConfiguration[] configs = getLaunchManager().getLaunchConfigurations(getConfigurationType());
			candidateConfigs = new ArrayList<ILaunchConfiguration>(configs.length);
			for (int i = 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				if (config.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME, "").equals(Util.getFileLocation(resource))) {					
					candidateConfigs.add(config);
				}
			}			
		} catch (CoreException e) {
//			TODO Auto-generated catch block
			e.printStackTrace();						
		}

		// If there are no existing configs associated with the Resource, create one.
		// If there is exactly one config associated, return it.
		// Otherwise, if there is more than one config associated, prompt the
		// user to choose one.
		if(candidateConfigs==null) return createConfiguration(resource);
		int candidateCount = candidateConfigs.size();
		if (candidateCount < 1) {
			return createConfiguration(resource);
		} else if (candidateCount == 1) {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		} else {
			// Prompt the user to choose a config.  A null result means the user
			// canceled the dialog, in which case this method returns null,
			// since canceling the dialog should also cancel launching anything.
			ILaunchConfiguration config = chooseConfiguration(candidateConfigs);
			return config;
		}
	}

	public static Shell getShell() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				return windows[0].getShell();
			}
		} 
		else {
			return window.getShell();
		}
		return null;
	}	
	
	/**
	 * Show a selection dialog that allows the user to choose one of the specified
	 * launch configurations.  Return the chosen config, or <code>null</code> if the
	 * user canceled the dialog.
	 */
    protected ILaunchConfiguration chooseConfiguration(List<?> configList) {
		IDebugModelPresentation labelProvider = DebugUITools.newDebugModelPresentation();
		ElementListSelectionDialog dialog= new ElementListSelectionDialog(getShell(), labelProvider);
		dialog.setElements(configList.toArray());
		dialog.setTitle(LaunchConfigurationConstants.CHOOSE_CONFIGURATION_TITLE);  
		dialog.setMessage(LaunchConfigurationConstants.CHOOSE_CONFIGURATION_MESSAGE);
		dialog.setMultipleSelection(false);
		int result = dialog.open();
		labelProvider.dispose();
		if (result == Window.OK) {
			return (ILaunchConfiguration) dialog.getFirstResult();
		}
		return null;		
	}

	/**
	 * Try to return an IResource object from a IEditorPart. Returns null if no such object can be found.  
	 */
	private IResource getResource(IEditorPart editor) {		
		return (IResource)editor.getEditorInput().getAdapter(IResource.class);
	}

	/**
	 * Try to return an IResource object from a StructuredSelection. Returns null if no such object can be found.	  
	 */
	private IResource getResource(StructuredSelection sel) {		
		return (IResource) ((IAdaptable)sel.getFirstElement()).getAdapter(IResource.class);
	}
}
