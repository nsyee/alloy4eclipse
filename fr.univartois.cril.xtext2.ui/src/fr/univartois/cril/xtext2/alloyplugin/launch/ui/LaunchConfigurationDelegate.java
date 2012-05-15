package fr.univartois.cril.xtext2.alloyplugin.launch.ui;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jface.preference.IPreferenceStore;

import edu.mit.csail.sdg.alloy4.ConstList;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pair;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import edu.mit.csail.sdg.alloy4compiler.ast.Module;
import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext2.alloyplugin.api.IReporter;
import fr.univartois.cril.xtext2.alloyplugin.api.Util;
import fr.univartois.cril.xtext2.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.xtext2.alloyplugin.console.Console;
import fr.univartois.cril.xtext2.alloyplugin.core.ALSFile;
import fr.univartois.cril.xtext2.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.xtext2.alloyplugin.core.Reporter;
import fr.univartois.cril.xtext2.preferences.AlloyPreferencePage;
import fr.univartois.cril.xtext2.preferences.PreferenceConstants;
import fr.univartois.cril.xtext2.ui.activator.AlsActivator;

public class LaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
    	System.out.println("Launch");
    	List<?> commandIdList=configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST, (List<?>)null);
		String assertName = (String)commandIdList.get(0);
		String filename = configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME, (String)null);
		String path = configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_PATH, (String)null);
		IResource resource = Util.getFile(path);
		// IResource resource = EditorUtils.getActiveXtextEditor().getResource();
		IReporter reporter = new Reporter(resource);
		
		CompModule world = getWorld(reporter, filename);
		if (world == null) return;
		
		IPreferenceStore store = AlsActivator.getInstance().getPreferenceStore();
		int scope = Integer.parseInt(store.getString(PreferenceConstants.DEFAULT_LAUNCH_OPTION));

		Command command = null;
		try {
			Pair<String,Expr> p=findAssertion(world, assertName);
			command = new Command(true, scope, -1, -1, p.b);
		} catch (Err e) {
			e.printStackTrace();
		}
		
		if (command == null) return;
		
		String cmd = "Check " + assertName;
		IALSFile file = new ALSFile(resource);
		ExecutableCommand ex = new ExecutableCommand(file, command, 0, world, cmd, scope);
		try {
			ex.execute(reporter, null);
		} catch (Err e) {
			e.printStackTrace();
		}
		monitor.setTaskName("Running Alloy command");
		AlloyMessageConsole console = Console.findAlloyConsole(filename);
		
		if (AlloyPreferencePage.getClearConsoleForEachCommand())
		    console.clear();
		
		if(command!=null)		
			try {		
				monitor.beginTask("Starting", commandIdList.size());

				for (Object object : commandIdList) {
					String commandId=(String) object;
					if (monitor.isCanceled()) break;
					monitor.subTask(commandId);
					ex.execute(reporter, monitor);
					monitor.worked(1);
				}
			} catch (Err e) {
				e.printStackTrace();
			} finally {
				monitor.done();
			}
	}
    
	private CompModule getWorld(IReporter reporter, String filename) {
		CompModule world;
		try {
			world = CompUtil.parseEverything_fromFile(reporter, null, filename);
		} catch (Err e) {
			return null;
		}
		return world;
	}
	
	public Pair<String,Expr> findAssertion(Module world,String assertion){
		ConstList<Pair<String,Expr>> l=world.getAllAssertions();
		for(Pair<String,Expr> c:l){
			if(c.a.equals(assertion)){
				return c;
			}
		}
		return null;
	}
}
