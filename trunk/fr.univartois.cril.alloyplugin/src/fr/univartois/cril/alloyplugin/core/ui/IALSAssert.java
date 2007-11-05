package fr.univartois.cril.alloyplugin.core.ui;


/**
 * Interface for an Alloy assertion.
 * Others plugins which wants to use Alloy assertions can use this interface..
 * */
public interface IALSAssert extends IALSTreeDecorated {
	public String toString();
}
