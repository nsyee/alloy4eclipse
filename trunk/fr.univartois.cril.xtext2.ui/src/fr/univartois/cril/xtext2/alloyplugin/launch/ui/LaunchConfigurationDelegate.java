package fr.univartois.cril.xtext2.alloyplugin.launch.ui;


import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import edu.mit.csail.sdg.alloy4.Err;
import fr.univartois.cril.xtext2.alloyplugin.api.IReporter;
import fr.univartois.cril.xtext2.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.xtext2.alloyplugin.console.Console;
import fr.univartois.cril.xtext2.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.xtext2.preferences.AlloyPreferencePage;


public class LaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {

		List<?> commandIdList=configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST, (List<?>)null);
		ExecutableCommand command = (ExecutableCommand)commandIdList.get(0);
		IReporter rep = (IReporter)commandIdList.get(1);
		monitor.setTaskName("Running Alloy command");
		AlloyMessageConsole console = Console.findAlloyConsole(command.getResource().getName());
		
		if (AlloyPreferencePage.getClearConsoleForEachCommand()) {
		    console.clear();
		}
		
		// System.out.println("list:"+commandIdList);
		if(command!=null)		
			try {		
				monitor.beginTask("Starting", commandIdList.size());

				for (Object object : commandIdList) {
					String commandId=(String) object;
					if (monitor.isCanceled()) break;
					monitor.subTask(commandId);
					command.execute(rep, monitor);
					monitor.worked(1);
				}
			} catch (Err e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				monitor.done();
			}
	}
}
