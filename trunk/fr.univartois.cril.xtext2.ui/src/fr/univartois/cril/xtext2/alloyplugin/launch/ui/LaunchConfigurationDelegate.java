package fr.univartois.cril.xtext2.alloyplugin.launch.ui;


import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import fr.univartois.cril.xtext2.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext2.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.xtext2.alloyplugin.console.Console;
import fr.univartois.cril.xtext2.alloyplugin.core.ALSFileFactory;
import fr.univartois.cril.xtext2.alloyplugin.core.AlloyLaunching;
import fr.univartois.cril.xtext2.preferences.*;


public class LaunchConfigurationDelegate implements
ILaunchConfigurationDelegate {

    public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		IALSFile file=null;
		try {
			IResource[] res = configuration.getMappedResources();

			if(res!=null&&res.length>0)
			{
				file=ALSFileFactory.instance().getALSFile(res[0]);				
			}			 

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		if (file==null) return;
		
		List commandIdList=configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST, (List)null);
		
		monitor.setTaskName("Running Alloy command");
		AlloyMessageConsole console = Console.findAlloyConsole(file.getFilename());
		
		if (AlloyPreferencePage.getClearConsoleForEachCommand()) {
		    console.clear();
		}
		
		// System.out.println("list:"+commandIdList);
		if(commandIdList!=null)		
			try {		
				monitor.beginTask("Starting", commandIdList.size());

				for (Object object : commandIdList) {
					String commandId=(String) object;
					if (monitor.isCanceled()) break;
					monitor.subTask(commandId);
					IALSCommand cmd = (IALSCommand) file.getCommand(commandId);
					if(cmd!=null)
					{
						AlloyLaunching.execCommand(cmd,monitor);						
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
