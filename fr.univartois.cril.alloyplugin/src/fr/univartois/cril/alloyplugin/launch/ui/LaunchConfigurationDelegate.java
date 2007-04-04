package fr.univartois.cril.alloyplugin.launch.ui;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import fr.univartois.cril.alloyplugin.core.ui.ALSFileFactory;
import fr.univartois.cril.alloyplugin.core.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;

public class LaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate {

	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		IALSFile file=null;
		try {
			IResource[] res = configuration.getMappedResources();
			
			if(res!=null&&res.length>0)
			{
				file=ALSFileFactory.getALSFile(res[0]);				
			}			 
			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		if (file==null) return;
		
		
		List <IALSCommand> list =  file.getCommand();
		// execute alls command from file
		// TODO try to memorize commands to be execute in configuration
		monitor.setTaskName("Running Alloy command");
		try {
			monitor.beginTask("Starting", list.size());
			for (IALSCommand command : list) {
				if (monitor.isCanceled()) break;
				monitor.subTask(command.toString());
				AlloyLaunching.ExecCommand((ExecutableCommand) command);
				CommandsView.setCurrent(file);
				monitor.worked(1);
			}
		} finally {
			monitor.done();
		}
	}

}
