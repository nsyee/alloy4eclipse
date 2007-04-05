package fr.univartois.cril.alloyplugin.core.ui;
/**
 * Interface for an Alloy command.
 * Others plugins which wants to use Alloy commands can use this interface..
 * */
public interface IALSCommand extends IALSTreeDecorated {
public String toString();

public String getName();

}
