package fr.univartois.cril.xtext.alloyplugin.api;


/**
 * Interface for an Alloy assertion.
 * Others plugins which wants to use Alloy assertions can use this interface..
 * */
public interface IALSAssert extends IALSTreeDecorated,Identifiable {
	public String toString();
}
