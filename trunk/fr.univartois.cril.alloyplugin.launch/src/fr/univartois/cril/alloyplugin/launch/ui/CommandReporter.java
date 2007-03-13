package fr.univartois.cril.alloyplugin.launch.ui;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.ErrorWarning;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import fr.univartois.cril.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.alloyplugin.console.Console;

public final class CommandReporter extends A4Reporter {

    private int warningCount=0;
	private String filename;
	public CommandReporter(String filename){this.filename=filename;}

    @Override public void warning(final ErrorWarning e) {
        warningCount++;
        // the location is in "e.pos"
        printInfo("Warning #"+warningCount);
        printInfo(e.msg.trim());
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
        );
    }

    @Override public void solve
    (int primaryVars, int totalVars, int clauses) {
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
    (Object command, long solvingTime, String filename) {
        Command cmd = (Command)command;
        StringBuilder sb = new StringBuilder("");
        if (cmd.check) {
        	sb.append("Counterexample found. \nAssertion is invalid");
        } else {
        	sb.append("Instance found. \nPredicate is consistent");
        }
        if (cmd.expects==0) sb.append(", contrary to expectation");
        else if (cmd.expects==1) sb.append(", as expected.");
        //sb.append(""+solvingTime+"ms.");
        print(sb.toString());
        AlloyCommandView.printResult(sb.toString());
    }

    @Override public void resultUNSAT
    (Object command, long solvingTime, String filename) {
        Command cmd = (Command)command;
        StringBuilder sb = new StringBuilder("");
        if (cmd.check) {
            sb.append("No counterexample found.\nAssertion may be valid");
        } else {
        	sb.append("No instance found.\nPredicate may be inconsistent");
        }
        if (cmd.expects==1) sb.append(", contrary to expectation");
        else if (cmd.expects==0) sb.append(", as expected.");
        //sb.append(""+solvingTime+"ms.\n");
        print(sb.toString());
        AlloyCommandView.printResult(sb.toString());        
    }

	private void printInfo(String string) {		
		AlloyMessageConsole console = Console.findAlloyInfoConsole("");
		console.print(string);
	}
	private void print(String string) {		
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
//    	print("bound:"+msg);
    }

  


}