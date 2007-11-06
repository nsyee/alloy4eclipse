package fr.univartois.cril.alloyplugin.core.ui;

import org.eclipse.core.resources.IResource;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pair;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import fr.univartois.cril.alloyplugin.core.Reporter;

/**
 * Interface for an Alloy command.
 * Others plugins which wants to use Alloy commands can use this interface..
 * */
public interface IALSCommand extends IALSTreeDecorated {
	public static final int   SAT       = 1;
	public static final int   UNSAT     = 2;
	public static final int   UNKNOW    = 0;

	public String toString();
	public boolean isCheck();
	public boolean isExpect();
	public String getName();
	public String getFilename();
	public IResource getResource();
	public Pair<A4Solution, Boolean> execute(Reporter rep) throws Err;
	public Pair<A4Solution, Boolean> getAns();
	public void setSat(boolean sat);
	public void setStringResult(String resultMessage);
	public String getStringResult();
	
    /**
     * Display Answer in an SWT thread.
     */
	public void displayAnsSafe();
}
