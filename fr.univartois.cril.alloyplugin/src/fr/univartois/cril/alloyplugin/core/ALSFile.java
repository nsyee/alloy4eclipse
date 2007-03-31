package fr.univartois.cril.alloyplugin.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.ui.IALSFileListener;
import fr.univartois.cril.alloyplugin.ui.IALSFunction;
import fr.univartois.cril.alloyplugin.ui.IALSFact;
import fr.univartois.cril.alloyplugin.ui.IALSSignature;
/**
 * This class represents an als file.  
 * This plugin implements IALSFile.
 *  
 */
public class ALSFile implements IALSFile {

	private List <IALSFileListener>listeners;
	private IResource resource;
	private  List<IALSCommand> cmds;
	private List <IALSFact> pred;
	private List <IALSFunction> func;
	private List <IALSSignature> sig;
	public ALSFile(IResource resource) {
		this.resource=resource;
	}
	public void dispose(){}
	public IResource getResource() {
		return resource;
	}
	public void addListener(IALSFileListener listener) {
		if (listener!=null)
			getListeners().add(listener);
	}
	public void removeListener(IALSFileListener listener) {		
		if(listeners!=null)listeners.remove(listener);
	}
	private List<IALSFileListener> getListeners() {
		if (listeners==null) listeners=new ArrayList<IALSFileListener>();
		return listeners;

	}
	public void fireChanged(){
		for (IALSFileListener listener : getListeners()) {
			listener.changed(this);
		}
	} 
	/**
	 * return a list of commands.
	 * */
	public List <IALSCommand> getCommand() {
		assert(cmds!=null);
		return cmds;	
	}	

	public List<IALSFunction> getFunctions() {		
		return func;
	}
	public List<IALSFact> getPredicates() {		
		return pred;
	}
	public List<IALSSignature> getSignatures() {

		return sig;
	}
	public void setFunctions(List<IALSFunction> func) {
		this.func=func;

	}
	public void setFacts(List<IALSFact> pred) {
		this.pred=pred;

	}
	public void setSignatures(List<IALSSignature> sig) {
		this.sig=sig;		
	};
	public void setCommand(List <IALSCommand> cmds) {
		this.cmds=cmds;		
	}
}
