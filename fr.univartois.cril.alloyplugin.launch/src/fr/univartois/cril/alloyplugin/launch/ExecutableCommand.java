package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.resources.IResource;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.World;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;

/**
 * A command with its world and its filename. 
 * Can be executed.
 */
public class ExecutableCommand {

	private World world;
	private Command command;
	private IResource resource;
	
	
	
	public ExecutableCommand(IResource res,Command command, World world) {
		assert(res!=null);
		assert(command!=null);
		assert(world!=null);
		this.resource=res;
		this.world=world;
		this.command=command;		
	}

	public A4Solution execute(A4Reporter rep) throws Err {
		return TranslateAlloyToKodkod.execute_command(world, command, getOptions(rep), null, null);
	}

	public static A4Options getOptions(A4Reporter rep) {
//		 Choose some default options for how you want to execute the commands		
		A4Options options = new A4Options();
		
		options.solver = A4Options.SatSolver.SAT4J;
		options.setReporter(rep);
		
        
		return options;
	}
	public String toString(){
		return command.toString();
	}

    public IResource getRes() {
        return resource;
    }
    
	public String getFilename() {
		
		
		return resource.getLocation().toString();
	}
	
}
