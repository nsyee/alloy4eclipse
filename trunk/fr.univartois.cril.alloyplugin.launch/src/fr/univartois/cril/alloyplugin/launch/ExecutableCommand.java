package fr.univartois.cril.alloyplugin.launch;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Log;
import edu.mit.csail.sdg.alloy4.Pref;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.World;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;

public class ExecutableCommand {

	private World world;
	private Command command;
	private String filename;
	
	
	
	public ExecutableCommand(String filename,Command command, World world) {
		assert(filename!=null);
		assert(command!=null);
		assert(world!=null);
		this.filename=filename;
		this.world=world;
		this.command=command;		
	}

	public A4Solution execute(Log log) throws Err {
		return TranslateAlloyToKodkod.execute_command(world, command, getOptions(log), null, null);
	}

	public static A4Options getOptions(Log log) {
//		 Choose some default options for how you want to execute the commands		
		A4Options options = new A4Options(log);
		options.solver = Pref.SatSolver.SAT4J;
		options.verbosity = 2;
		return options;
	}
	public String toString(){
		return command.toString();
	}

	public String getFilename() {
		
		
		return filename;
	}
	
}
