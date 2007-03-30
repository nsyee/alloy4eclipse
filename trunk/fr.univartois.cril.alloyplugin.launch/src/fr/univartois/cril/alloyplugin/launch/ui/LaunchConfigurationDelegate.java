package fr.univartois.cril.alloyplugin.launch.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public class LaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate {

	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

	/*	ExecutableCommand[] tab = CommandsView.getCurrentCommands();
		// execute alls command from current file
		// TODO try to memorize commands to be execute in configuration
		monitor.setTaskName("Running Alloy command");
		try {
			monitor.beginTask("Starting", tab.length);
			for (ExecutableCommand command : tab) {
				if (monitor.isCanceled()) break;
				monitor.subTask(command.toString());
				AlloyLaunching.ExecCommand(command);
				CommandsView.refresh();
				monitor.worked(1);
			}
		} finally {
			monitor.done();
		}
	*/}

}
