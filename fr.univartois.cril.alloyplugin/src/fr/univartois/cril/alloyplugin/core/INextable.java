package fr.univartois.cril.alloyplugin.core;

import edu.mit.csail.sdg.alloy4compiler.parser.Module;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;

/**
 * 
 * @author romuald druelle
 *
 */

public interface INextable {

	/**
	 * Show the new A4Solution
	 */

	void showNextA4Solution();
	
    Module getWorld();

	A4Solution accessAns();
    

}