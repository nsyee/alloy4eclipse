package fr.univartois.cril.alloyplugin.launch;

import java.util.ArrayList;
import java.util.List;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.ErrorWarning;
import edu.mit.csail.sdg.alloy4.Log;
import edu.mit.csail.sdg.alloy4.LogToStringBuilder;
import edu.mit.csail.sdg.alloy4.SafeList;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.World;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import fr.univartois.cril.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.alloyplugin.console.Console;
import fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView;

public class AlloyLaunching {

	/**
	 * Execute every command in a file.
	 * This method parses the file, then execute every command.
	 * If there are syntax or type errors, it display them in console.
	 * They may contain filename/line/column information.
	 */
	public static final void command(String filename) {
		Log log = new LogToStringBuilder();

		command(filename,log); 
	}

	/** 
	 * Execute ExecutableCommands previously created.
	 */
	public static final void ExecCommand(ExecutableCommand[] executablesCommands){
		Log log = new LogToStringBuilder();
		ExecCommand(executablesCommands,log);
	}

	/**
	 * Parse a file (can be used by external package).
	 * For the moment display Syntax error in console. 	  
	 * This method update the AlloyCommandView.
	 */

	public static void launchParser(String filename) {		
//		This log records diagnostic messages
		Log log = new LogToStringBuilder();		
		ExecutableCommand[] exec_cmds;
		try {
			exec_cmds = AlloyLaunching.parse(filename,log);
		} catch (Err e) {			
			Console.printErr(e);
			exec_cmds=new ExecutableCommand[0];			
		}
		
		AlloyCommandView acw = AlloyCommandView.getDefault();
		if(acw!=null) acw.setElements(exec_cmds);
		
	}

	/**
	 * Parse a .als file. Returns executable commands which can be executed later.
	 * @throws Err 
	 * */
	protected static ExecutableCommand[] parse(String filename,Log log) throws Err 
	{

		AlloyMessageConsole alloyParserConsole=Console.findAlloyErrorConsole(filename);		
		alloyParserConsole.printInfo("=========== Parsing \""+filename+"\" =============");

		World world;
		
			world = CompUtil.parseEverything_fromFile(null, null, filename, log);		

			// Now, "world" is the root of the the abstract syntax tree.

			// Typecheck the model, and print out all the warnings.
			List<ErrorWarning> warnings = new ArrayList<ErrorWarning>();
			world.typecheck(log, warnings);
			for(Err e:warnings) {
				alloyParserConsole.printInfo("============ Relevance Warning: ============\n");
				alloyParserConsole.printInfo(e+"\n");
			}

			// Now, you can call getType() on each node in world to find out its type.

			//Let's display all the messages so far
			alloyParserConsole.print(log.toString());
			alloyParserConsole.printInfo("=========== End Parsing \""+filename+"\" =============");
			log.setLength(0);
		

		//	stores all command in ExecutableCommand
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

	private static final void command(String filename,Log log) {
		ExecutableCommand[] exec_cmds;
		try {
			exec_cmds = parse(filename,log);
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
		ExecCommand(exec_cmds,log);				

	}
/**
 * Executes commands.
 * 
 */
	private static final void ExecCommand(ExecutableCommand[] exec_cmds,Log log)  {
		if (exec_cmds.length==0) return;

		for (ExecutableCommand cmd:exec_cmds) {
			AlloyMessageConsole alloyConsole=Console.findAlloyConsole(cmd.getFilename());
			alloyConsole.reveal();
			try {
				alloyConsole.printInfo("============ Command "+cmd+": ============");
				A4Solution ans;		

				ans = cmd.execute(log);

				// Print all the diagnostic messages		
				alloyConsole.print(log.toString());
				log.setLength(0);
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


