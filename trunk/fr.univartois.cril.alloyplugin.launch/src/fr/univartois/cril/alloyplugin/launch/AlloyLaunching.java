package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.SafeList;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.World;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import fr.univartois.cril.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.alloyplugin.console.Console;

/**
 * Static methods to launch Alloy parser or command.
 * 
 * */
public class AlloyLaunching {

	/**
	 * Execute every command in a file.
	 * This method parses the file, then execute every command.
	 * If there are syntax or type errors, it display them in console.
	 * They may contain filename/line/column information.
	 */
	public static final void command(String filename) {		
		A4Reporter rep=new Reporter(filename); 
		
		command(filename,rep); 
	}

	/** 
	 * Execute ExecutableCommands previously created.
	 */
	public static final void ExecCommand(ExecutableCommand[] executablesCommands){
		if(executablesCommands.length==0) return;
		
		A4Reporter rep=new Reporter(executablesCommands[0].getFilename());
		ExecCommand(executablesCommands,rep);
	}

	/**
	 * Parse a file (can be used by external package).
	 * For the moment display Syntax error in console. 	  
	 * This method update the AlloyCommandView.
	 * @return 
	 */

	public static ExecutableCommand[] launchParser(IResource res) {	
        String filename = res.getLocation().toString();
        try {
            res.deleteMarkers(IMarker.PROBLEM, false,0);
        } catch (CoreException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }
		A4Reporter rep=new Reporter(filename);		
				
		ExecutableCommand[] exec_cmds;
		try {
			exec_cmds = AlloyLaunching.parse(filename,rep);
		} catch (Err e) {			
			Console.printErr(e);
            
            try {
                IMarker marker = res.createMarker(IMarker.PROBLEM);
                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
                marker.setAttribute(IMarker.LINE_NUMBER, e.pos.y);
                marker.setAttribute(IMarker.MESSAGE, e.getMessage());
            } catch (CoreException e1) {
                e1.printStackTrace();
            }
			exec_cmds=new ExecutableCommand[0];			
		}
		
		//AlloyCommandView acw = AlloyCommandView.getDefault();
		/*if(acw!=null) {			
			acw.setElements(exec_cmds);
			}*/
		return exec_cmds;
	}

	/**
	 * Parse a .als file. Returns executable commands which can be executed later.
	 * @throws Err 
	 * */
	protected static ExecutableCommand[] parse(String filename,A4Reporter rep) throws Err 
	{

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
			exec_cmds[i]=new ExecutableCommand(filename,list.get(i),world);
			
		}
		return exec_cmds;
	}


/**
 * Executes all commands from a file.
 * */

	private static final void command(String filename,A4Reporter rep) {
		ExecutableCommand[] exec_cmds;
		try {
			exec_cmds = parse(filename,rep);
		} catch (Err e) {
			
			Console.printErr(e);
			return;
		}
		// Load the visualizer (You only need to do this if you plan to visualize an Alloy solution)
		// VizGUI viz = new VizGUI(false, "", null);
		//		 Parse the model
		//Console.clearConsole(filename);
		//AlloyMessageConsole amc=Console.findAlloyConsole(filename);
		
		// Execute the command
		ExecCommand(exec_cmds,rep);				

	}
/**
 * Executes commands.
 * 
 */
	private static final void ExecCommand(ExecutableCommand[] exec_cmds,A4Reporter rep)  {
		if (exec_cmds.length==0) return;

		for (ExecutableCommand cmd:exec_cmds) {
			AlloyMessageConsole alloyConsole=Console.findAlloyConsole(cmd.getFilename());
			alloyConsole.reveal();
			try {
				alloyConsole.printInfo("============ Command "+cmd+": ============");
				A4Solution ans;		

				ans = cmd.execute(rep);		
				
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
				Console.printErr(e);
			}
		}//for all command

	}



}


