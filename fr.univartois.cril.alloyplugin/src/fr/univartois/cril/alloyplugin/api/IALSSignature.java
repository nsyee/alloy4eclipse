package fr.univartois.cril.alloyplugin.api;

/**
 * Interface for an Alloy signature. Others plugins which wants to use Alloy
 * signatures can use this interface..
 */
public interface IALSSignature extends IALSTreeDecorated, Identifiable {

	public String[] getFieldsName();

}
