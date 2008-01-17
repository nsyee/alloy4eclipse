package fr.univartois.cril.alloyplugin.api;


public interface IALSTreeDecorated extends Iconable {

	int getBeginLine();
	
	int getEndLine();
	
	boolean isPrivate();
}
