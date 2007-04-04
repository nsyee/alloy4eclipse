package fr.univartois.cril.alloyplugin.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;

import fr.univartois.cril.alloyplugin.core.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.core.ui.IALSFact;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.core.ui.IALSFileListener;
import fr.univartois.cril.alloyplugin.core.ui.IALSFunction;
import fr.univartois.cril.alloyplugin.core.ui.IALSPredicate;
import fr.univartois.cril.alloyplugin.core.ui.IALSSignature;
/**
 * This class represents an als file.  
 * This plugin implements IALSFile.
 *  
 */
public class ALSFile implements IALSFile {

	private List <IALSFileListener>listeners;
	private IResource resource;
	private  List<IALSCommand> cmds=new ArrayList<IALSCommand>();
	private List <IALSPredicate> pred=new ArrayList<IALSPredicate>();
    private List <IALSFact> fact=new ArrayList<IALSFact>();
	private List <IALSFunction> func=new ArrayList<IALSFunction>();
	private List <IALSSignature> sig=new ArrayList<IALSSignature>();
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
	public void fireChange(){
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
	public List<IALSPredicate> getPredicates() {		
		return pred;
	}
	public List<IALSSignature> getSignatures() {
		return sig;
	}
    
    public List<IALSFact> getFacts() {
        return fact;
    }
    
	public void setFunctions(List<IALSFunction> func) {
		this.func=func;

	}
	public void setFacts(List<IALSFact> fact) {
		this.fact=fact;

	}
	public void setSignatures(List<IALSSignature> sig) {
		this.sig=sig;		
	};
	public void setCommand(List <IALSCommand> cmds) {
		assert(cmds!=null);
		this.cmds=cmds;		
	}
    
    public void setPredicates(List<IALSPredicate> pred) {
        this.pred = pred;
    }
    
	public String toString(){return getResource().getName()+"@"+hashCode();
		
	}
}
