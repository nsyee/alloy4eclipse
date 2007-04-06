package fr.univartois.cril.alloyplugin.launch.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import fr.univartois.cril.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.alloyplugin.console.Console;
import fr.univartois.cril.alloyplugin.core.AlloyLaunching;
import fr.univartois.cril.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.alloyplugin.core.ui.ALSFileFactory;
import fr.univartois.cril.alloyplugin.core.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.launch.util.Util;


public class LaunchConfigurationDelegate implements
ILaunchConfigurationDelegate {

	private List<IALSCommand> currentCommandsList;

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
		System.out.println("coucocu");
		List commandIdList=configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST, (List)null);
		currentCommandsList =  file.getCommand();		
		monitor.setTaskName("Running Alloy command");
		AlloyMessageConsole console = Console.findAlloyConsole(Util.getFileLocation(file.getResource()));
		console.clear();
		System.out.println("list:"+commandIdList);
		if(commandIdList!=null)		
			try {
				System.out.println("size:"+commandIdList.size());
				monitor.beginTask("Starting", commandIdList.size());

				for (Object object : commandIdList) {
					String commandId=(String) object;
					if (monitor.isCanceled()) break;
					monitor.subTask(commandId);
					ExecutableCommand cmd = (ExecutableCommand) file.getCommand(commandId);
					if(cmd!=null)
					{
						AlloyLaunching.ExecCommand(cmd);
						System.out.println("cmd:"+cmd);
					}
					else
					{
						console.printErr("Error: "+commandId+" not found.");}
					//CommandsView.setCurrent(file);
					monitor.worked(1);
				}
			} finally {
				monitor.done();
			}
	}



}
