package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.PlatformUI;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pos;
import edu.mit.csail.sdg.alloy4.SafeList;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.World;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;
import fr.univartois.cril.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.alloyplugin.console.Console;
import fr.univartois.cril.alloyplugin.launch.ui.CommandReporter;
import fr.univartois.cril.alloyplugin.launch.util.Util;

/**
 * Static methods to launch Alloy parser or command.
 * 
 * */
public class AlloyLaunching {

	/** 
	 * Execute an ExecutableCommand previously created after a parsing.
	 */
	public static final void ExecCommand(ExecutableCommand command){
		assert(command!=null);
		Reporter rep=new Reporter(command.getRes());
		execCommand(command,rep);
	}

	/**
	 * Parse a file (can be used by external package).
	 * For the moment display Syntax error in console. 	  
	 * This method update the AlloyCommandView.
	 * @return 
	 */


	public static ExecutableCommand[] launchParser(IResource res) {	
		try {
			res.deleteMarkers(IMarker.PROBLEM, false,0);
		} catch (CoreException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		A4Reporter rep=new Reporter(res);		

		ExecutableCommand[] exec_cmds;
		try {
			exec_cmds = AlloyLaunching.parse(res,rep);
		} catch (Err e) {			
			displayErrorInProblemView(res, e);
			exec_cmds=new ExecutableCommand[0];			
		}

		//AlloyCommandView acw = AlloyCommandView.getDefault();
		/*if(acw!=null) {			
			acw.setElements(exec_cmds);
			}*/
		return exec_cmds;
	}
/**
 * Displays an Err execption in problem view.
 */
	private static void displayErrorInProblemView(IResource res, Err e) {	
		res= getResourceFromErr(res, e);
		try {
			IMarker marker = res.createMarker(IMarker.PROBLEM);
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			marker.setAttribute(IMarker.LINE_NUMBER, e.pos.y);
			marker.setAttribute(IMarker.MESSAGE, e.msg);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
	}
	/**
	 * Get the ressource where the Err is located. 
	 */
	private  static IResource getResourceFromErr(IResource res,Err e)
	{
		if(e.pos!=Pos.UNKNOWN)
		{
			if(!e.pos.filename.equals(Util.getFileLocation(res)))
			{
				return Util.getFileForLocation(e.pos.filename);
			}
		}
		return res;
	}

	/**
	 * Parse a .als file. Returns executable commands which can be executed later.
	 * @throws Err 
	 * */
	protected static ExecutableCommand[] parse(IResource res,A4Reporter rep) throws Err 
	{
		String filename = res.getLocation().toString();
		AlloyMessageConsole alloyParserConsole=Console.findAlloyInfoConsole(filename);
		alloyParserConsole.clear();
		alloyParserConsole.printInfo("=========== Parsing \""+filename+"\" =============");
		World world;		
		world = CompUtil.parseEverything_fromFile(null, null, filename, rep);		

		// Now, "world" is the root of the the abstract syntax tree.
		// Typecheck the model, and print out all the warnings.			
		world.typecheck(rep);			

		// Now, you can call getType() on each node in world to find out its type.
		//Let's display all the messages so far			
		alloyParserConsole.printInfo("=========== End Parsing \""+filename+"\" =============");
		//	convert all commands in ExecutableCommand[]
		SafeList<Command> list = world.getRootModule().getAllCommands();
		ExecutableCommand [] exec_cmds=new ExecutableCommand[list.size()];		
		for(int i=0;i<exec_cmds.length;i++){
			exec_cmds[i]=new ExecutableCommand(res,list.get(i),world);

		}
		return exec_cmds;
	}


	/**
	 * Execute every command in a file.
	 * This method parse the file, then execute every command.
	 * If there are syntax or type errors, it display them.
	 * They may contain filename/line/column information.
	 */
	public static final void execAllCommandsfromAFile(IResource res) {
		Reporter rep=new Reporter(res);
		ExecutableCommand[] exec_cmds;
		try {
			exec_cmds = parse(res,rep);
		} catch (Err e) {
			displayErrorInProblemView(res,e);
			return;
		}
		for(ExecutableCommand cmd:exec_cmds){
			execCommand(cmd,rep);				
		}
	}
	/**
	 * Execute a command.
	 * 
	 */
	private static final void execCommand(ExecutableCommand command,Reporter rep)  {
		AlloyMessageConsole alloyConsole=Console.findAlloyConsole(command.getFilename());
		alloyConsole.reveal();
		try {
			alloyConsole.printInfo("============ Command "+command+": ============");
			A4Solution ans;
			//ans = cmd.execute(rep);
			ans=command.execute(rep);
			// Print the outcome
			alloyConsole.printInfo("============ Answer ============");
			alloyConsole.print(ans.toString());
			// If satisfiable...
			if (ans.satisfiable()) {				
				// You can query "ans" to find out the values of each set or type.
				// This can be useful for debugging.
				//
				// You can also write the outcome to an XML file
				// ans.writeXML("output.xml", false);
				//
				// You can then visualize the XML file by calling this:
				// viz.run(VizGUI.evs_loadInstanceForcefully, "output.xml");
			}
		} catch (Err e) {				
			displayErrorInProblemView(command.getRes(), e);
		}


	}



}


