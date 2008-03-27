package fr.univartois.cril.alloyplugin.core;
import org.eclipse.core.resources.IFile;import org.eclipse.core.resources.IResource;import org.eclipse.core.runtime.CoreException;import edu.mit.csail.sdg.alloy4.ErrorWarning;import edu.mit.csail.sdg.alloy4compiler.ast.Command;import fr.univartois.cril.alloyplugin.AlloyPlugin;import fr.univartois.cril.alloyplugin.api.IALSCommand;import fr.univartois.cril.alloyplugin.api.IReporter;import fr.univartois.cril.alloyplugin.api.Util;import fr.univartois.cril.alloyplugin.console.AlloyMessageConsole;import fr.univartois.cril.alloyplugin.console.Console;
/**
 * Allow to display within the Eclipse framework events reported by Alloy4 compiler.
 * It implements the Map interface in order to get notified of included AlloySpecification file
 * through the method put(String key,String value) where key is the absolute filename of the included file.
 * 
 * @author leberre
 *
 */
public final class Reporter extends IReporter{
	private int warningCount=0;
	private String filename;
	private IResource resource;
	private IALSCommand execCommand;	private long startTranslation;	private long startSolving;	
	/**
	 * Create a reporter which is associated with one resource. 
	 */
	public Reporter(IResource res){
		this.filename=res.getLocation().toOSString();
		this.resource = res;
	}
	@Override public void warning(final ErrorWarning e) {
		warningCount++;
		// the location is in "e.pos"
		printInfo("Warning #"+warningCount);
		printInfo(e.msg.trim());
		AlloyLaunching.displayWarningInProblemView(resource,e);
	}
	@Override public void translate
	(String solver, int bitwidth,
			int maxseq, int skolemDepth, int symmetry) {
		print("Solver="+solver
				+" Bitwidth="+bitwidth
				+" MaxSeq="+maxseq
				+(skolemDepth==0?"":" SkolemDepth="+skolemDepth)
				+" Symmetry="+(symmetry>0 ? (""+symmetry) : "OFF")
				+"\nGenerating CNF...\n"
		);		startTranslation = System.currentTimeMillis();
	}
	@Override public void solve
	(int primaryVars, int totalVars, int clauses) {	    startSolving = System.currentTimeMillis();	    print("CNF translation time:"+(startSolving-startTranslation)+" ms");
		print("Var="+totalVars
				+" PrimaryVars="+primaryVars
				+" Clauses="+clauses
				+"\nSolving...\n"
		);
	}
	@Override public void resultCNF(final String filename) {
		printInfo("CNF file written to "+filename+"\n");
	}
	@Override public void resultSAT
	(Object command, long solvingTime, Object solution) {
		Command cmd = (Command)command;
		StringBuilder sb = new StringBuilder("");
		if (cmd.check) {
			sb.append("Counterexample found. \nAssertion is invalid");
		} else {
			sb.append("Instance found. \nPredicate is consistent");
		}
		if (cmd.expects==0) sb.append(", contrary to expectation");
		else if (cmd.expects==1) sb.append(", as expected.");
		sb.append(" "+(System.currentTimeMillis()-startSolving)+" ms.");
		print(sb.toString());
		updateExecCommand(true,sb.toString());
	}
	@Override public void resultUNSAT
	(Object command, long solvingTime, Object solution) {    	
		Command cmd = (Command)command;
		StringBuilder sb = new StringBuilder("");
		if (cmd.check) {
			sb.append("No counterexample found.\nAssertion may be valid");
		} else {
			sb.append("No instance found.\nPredicate may be inconsistent");
		}
		if (cmd.expects==1) sb.append(", contrary to expectation");
		else if (cmd.expects==0) sb.append(", as expected.");
		sb.append(" "+(System.currentTimeMillis()-startSolving)+" ms.");
		print(sb.toString());
		updateExecCommand(false,sb.toString());		
	}
	/**
	 * update associated command if there is one.  
	 */
	private void updateExecCommand(boolean sat,String resultMessage){   
		if(execCommand!=null) {
			execCommand.setSat(sat);        
			execCommand.setStringResult(resultMessage);
		}
	}
	private void printInfo(String string) {		
		//System.out.println("reporting:"+string);
		AlloyMessageConsole console = Console.findAlloyInfoConsole("");
		console.print(string);
	}
	private void print(String string) {		
		//System.out.println("reporting:"+string);
		AlloyMessageConsole console = Console.findAlloyConsole(filename);
		console.print(string);
	}
	/** This method is called by the parser to report parser events. */
	public void parse(String msg) {
		printInfo(msg);
	}
	/** This method is called by the typechecker to report the type for each field/function/predicate/assertion, etc. */
	public void typecheck(String msg) {
		printInfo(msg);
	}
	/** This method is called by the ScopeComputer to report the scope chosen for each sig. */
	public void scope(String msg) {
		//print("scope:"+msg);
	}
	/** This method is called by the BoundsComputer to report the bounds chosen for each sig and each field. */
	public void bound(String msg) {
//		print("bound:"+msg);
	}
	/**
	 * Set the ExecutableCommand to the reporter.
	 * */
	public void setExecCommand(IALSCommand cmd) {
		this.execCommand=cmd;
	}
    /**
     * Method called when a new file 
     */	@Override
    public String put(String key, String value) {
		String result = super.put(key, value);
        IFile res = Util.getFileForLocation(key);
        if(res!=null&&res.exists())
            try {
                res.deleteMarkers(Util.ALLOYPROBLEM, false,0);
            } catch (CoreException e) {
            	AlloyPlugin.getDefault().log(e);
            }                   
        return result;
    }
}