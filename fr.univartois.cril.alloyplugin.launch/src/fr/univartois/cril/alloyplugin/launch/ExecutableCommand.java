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
 * A command with its world and its resource. 
 * Can be executed.
 */
public class ExecutableCommand {
	
	public static final String SAT = "[SAT]";
	public static final String UNSAT = "[UNSAT]";
	private World world;
	private Command command;
	private IResource resource;
	private A4Options options;
	private String result;
	
	
	public ExecutableCommand(IResource res,Command command, World world,A4Options options) {		
		if(options==null){
			this.options = new A4Options();		
			this.options.solver = A4Options.SatSolver.SAT4J;
		}
		else this.options=options;
		assert(res!=null);
		assert(command!=null);
		assert(world!=null);

		this.resource=res;
			
		this.world=world;
		this.command=command;
		result="";
	}


	public ExecutableCommand(IResource res,Command command, World world) {
		this(res,command,world,null);				
	}


	public A4Options getOptions(A4Reporter rep) {
		options.setReporter(rep);
		return options;
	}
	public String toString(){
		return command.toString();
	}
	public IResource getRes() {
		return resource;
	}    
/**
 *  
 */
	public String getFilename() {
		//TODO can be null: use safe method
		return resource.getLocation().toString();
	}

	public World getWorld() {
		return world;
	}

	public Command getCommand() {
		return command;
	}

	public String getResult() {		
		return result;		
	}

	public A4Solution execute(Reporter rep) throws Err {
		rep.setExecCommand(this);
		A4Solution ans = TranslateAlloyToKodkod.execute_command(getWorld(),getCommand(),getOptions(rep), null, null); 
		return ans;
	}


	public void setSat(boolean sat) {
		if (sat) result=SAT;
		else result=UNSAT;
		
	}

}
