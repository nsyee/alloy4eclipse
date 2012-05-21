package fr.univartois.cril.xtext2.alloyplugin.launch.ui;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;

import edu.mit.csail.sdg.alloy4.ConstList;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pair;
import edu.mit.csail.sdg.alloy4.SafeList;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.Decl;
import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import edu.mit.csail.sdg.alloy4compiler.ast.Func;
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
import fr.univartois.cril.xtext2.alloyplugin.core.MetamodelCommand;
import fr.univartois.cril.xtext2.alloyplugin.core.Reporter;
import fr.univartois.cril.xtext2.preferences.AlloyPreferencePage;
import fr.univartois.cril.xtext2.preferences.PreferenceConstants;
import fr.univartois.cril.xtext2.ui.activator.AlsActivator;

public class LaunchConfigurationDelegate implements ILaunchConfigurationDelegate {
	
    public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {    	
    	String handler = configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_HANDLER, (String)null) ;
    	List<?> commandIdList=configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST, (List<?>)null);
    	
    	String name = (String)commandIdList.get(0);
		String filename = configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME, (String)null);
		String path = configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_PATH, (String)null);
		
		IResource resource = Util.getFile(path);
		IReporter reporter = new Reporter(resource);
		
		ExecutableCommand ex = null;
		MetamodelCommand exM = null ;
		
		CompModule world = getWorld(reporter, filename);
		if (world == null) return;
		
		IPreferenceStore store = AlsActivator.getInstance().getPreferenceStore();
		int scope = Integer.parseInt(store.getString(PreferenceConstants.DEFAULT_LAUNCH_OPTION));
		
		IALSFile file = new ALSFile(resource);
		
		if(handler.equals("assertion"))
			ex = createExecutableAssertion(resource, file, world, name, scope) ;
		else if(handler.equals("predicate"))
			ex = createExecutablePredicate(resource, file, world, name, scope) ;
		else if(handler.equals("command"))
			ex = createExecutableCommand(resource, file, world, name, scope) ;
		else if(handler.equals("module")){
			exM = new MetamodelCommand(file, world) ;
		}

		try {
			if(handler.equals("module"))
				exM.execute(reporter, null);
			else
				ex.execute(reporter, null);
		} catch (Err e) {
			e.printStackTrace();
		}
		monitor.setTaskName("Running Alloy command");
		AlloyMessageConsole console = Console.findAlloyConsole(filename);
		
		if (AlloyPreferencePage.getClearConsoleForEachCommand())
		    console.clear();
		
		if(ex.getCommand() != null)		
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
    
    public ExecutableCommand createExecutableAssertion(IResource resource, IALSFile file, CompModule world, String name, int scope){
    	String cmd = "" ;
    	Command command = null;
    	
    	try {
			Pair<String,Expr> p = findAssertion(world, name);
			command = new Command(true, scope, -1, -1, p.b);
			cmd = "Check " + name;
		} catch (Err e) {
			e.printStackTrace();
		}

		if (command == null) return null ;
			
		return new ExecutableCommand(file, command, 0, world, cmd, scope) ;
    }
    
    public ExecutableCommand createExecutablePredicate(IResource resource, IALSFile file, CompModule world, String name, int scope){
    	String cmd = "" ;
    	Command command = null;
    	
    	try {
    		Func f = findPredicate(world, name);
			if (f.decls.isEmpty()) {
				command = new Command(false, scope, -1, -1, f.call());
			} else {
				int lg=0;
				for (Decl decl : f.decls) {					
					lg+=decl.names.size();
				}
				Expr [] params = new Expr[lg];
				int i=0;
				for (Decl decl : f.decls) {
					for(int j=0;j<decl.names.size();j++){
						params[i++]=decl.expr;
					}
				}
				command = new Command(false, scope, -1, -1, f.call(params));
			}
			cmd = "Run "+ name ;
		} catch (Err e) {
			e.printStackTrace();
		}

		if (command == null) return null ;

		return new ExecutableCommand(file, command, 0, world, cmd, scope) ;
    }
    
    public ExecutableCommand createExecutableCommand(IResource resource, IALSFile file, CompModule world, String name, int scope){
    	IXtextDocument document = XtextDocumentUtil.get(editor);
    	int offset = editor.getHighlightRange().getOffset();
		int line = getLine(document, offset) + 1;
		if (line == -1) return null;
        
        List<Command> list = getList(resource);
        Command command = retrieveCommand(list, line);
       
        int index = retrieveIndexOfCommand(world.getAllCommands(), command);
        if (index == -1) return null ;
        
        ExecutableCommand ex = new ExecutableCommand(file, command, index, world, null, 0);
    }
    
    private int getLine(IXtextDocument document, int offset) {
        int line = -1;
        try {
			line = document.getLineOfOffset(offset);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
        return line;
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
		ConstList<Pair<String,Expr>> l = world.getAllAssertions();
		for(Pair<String,Expr> c : l){
			if(c.a.equals(assertion)){
				return c;
			}
		}
		return null;
	}
	
	public Func findPredicate(Module world,String predicate){
        SafeList<Func> l = world.getAllFunc();
        for(Func c : l){
        	if(c.toString().contains(predicate)){
        		return c;
            }
        }
        return null;
	}
	
	private List<Command> getList(IResource resource) {
		List<Command> list = null;
		try {
			list = CompUtil.parseOneModule_fromFile(resource.getLocation().toString());
		} catch (Err e) {
		}
		return list;
	}
	
	private Command retrieveCommand(List<Command> list, int line) {
		if (list == null)
			return null;
		for (Command command : list) {
			int lineCommand = command.pos().y;
			if (line == lineCommand)
				return command;
		}
		return null;
	}
	
	private int retrieveIndexOfCommand(List<Command> commands, Command command) {
		int index = 0;
		for (Command cm : commands) {
			if (cm.pos().y ==command.pos().y)
				return index;
			index++;
		}
		return -1;
	}
}
