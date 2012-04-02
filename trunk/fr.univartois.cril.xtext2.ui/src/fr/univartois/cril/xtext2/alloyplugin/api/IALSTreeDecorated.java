package fr.univartois.cril.xtext2.alloyplugin.api;


public interface IALSTreeDecorated extends Iconable {

	public int getBeginLine();
	
	public int getEndLine();
	
	public boolean isPrivate();
}
