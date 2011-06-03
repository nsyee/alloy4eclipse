package fr.univartois.cril.xtext.alloyplugin.core;

import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
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
	
	CompModule getWorld();

	A4Solution accessAns();
    

}