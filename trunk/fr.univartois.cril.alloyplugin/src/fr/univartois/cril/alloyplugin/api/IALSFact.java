package fr.univartois.cril.alloyplugin.api;


/**
 * Interface for an Alloy Fact.
 * Others plugins which wants to use Alloy Facts can use this interface..
 * */
public interface IALSFact extends IALSTreeDecorated {
	public String toString();
}
