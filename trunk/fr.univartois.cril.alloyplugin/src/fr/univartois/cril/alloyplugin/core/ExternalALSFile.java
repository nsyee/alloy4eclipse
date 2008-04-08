package fr.univartois.cril.alloyplugin.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import fr.univartois.cril.alloyplugin.api.IALSAssert;
import fr.univartois.cril.alloyplugin.api.IALSCommand;
import fr.univartois.cril.alloyplugin.api.IALSFact;
import fr.univartois.cril.alloyplugin.api.IALSFile;
import fr.univartois.cril.alloyplugin.api.IALSFileListener;
import fr.univartois.cril.alloyplugin.api.IALSFunction;
import fr.univartois.cril.alloyplugin.api.IALSPredicate;
import fr.univartois.cril.alloyplugin.api.IALSSignature;
import fr.univartois.cril.alloyplugin.api.IALSTreeDecorated;
import fr.univartois.cril.alloyplugin.api.Util;
/**
 * This class represents an als file.  
 * This plugin implements IALSFile.
 *  
 */

public class ExternalALSFile implements IALSFile {

	public Map<String, IALSCommand> commandsMap=new HashMap<String,IALSCommand>();
	private List <IALSFileListener>listeners;
	private IPath resourceLocation;
	private String resourceName;
	public  List<IALSCommand> cmds=new ArrayList<IALSCommand>();
	public List <IALSPredicate> pred=new ArrayList<IALSPredicate>();
    public List <IALSFact> fact=new ArrayList<IALSFact>();
	public List <IALSFunction> func=new ArrayList<IALSFunction>();
	public List <IALSSignature> sig=new ArrayList<IALSSignature>();
	public List <IALSAssert> assertions = new ArrayList<IALSAssert>();
	
	public ExternalALSFile(IPath resourceLocation) {
		org.eclipse.core.runtime.Assert.isNotNull(resourceLocation);
		this.resourceLocation = resourceLocation;
		this.resourceName = resourceLocation.lastSegment();
	}
	
	public boolean isResourceFile() {
		return false;
	}
	
	public void dispose(){}
	
	public IPath getResourceLocation() {
		return resourceLocation;
	}
	
	public IResource getResource() {
		return null;
	}
	
	public String getFilename() {
		return Util.getFileLocation(resourceLocation);
	}
	
	public String getName() {
		return resourceName;
	}
	
	public void addListener(IALSFileListener listener) {
		if (listener!=null)
			getListeners().add(listener);
	}
	public void removeListener(IALSFileListener listener) {		
		if(listeners!=null)listeners.remove(listener);
	}
	public List<IALSFileListener> getListeners() {
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
		commandsMap.clear();
		for (IALSCommand command : cmds) {
			commandsMap.put(command.getName(), command);	
		}		
		this.cmds=cmds;		
	}
    
    public void setPredicates(List<IALSPredicate> pred) {
        this.pred = pred;
    }
    
	public String toString(){
		return getName()+"@"+hashCode();
	}
	/**
	 * Get a command from his label. 
	 *   
	 * */
	public IALSCommand getCommand(String commandLabel) {		
		return commandsMap.get(commandLabel);
	}
	
	public List<IALSTreeDecorated> getAllAlloyObjects() {
	    List<IALSTreeDecorated> list = new ArrayList<IALSTreeDecorated>();
	    list.addAll(sig);
	    list.addAll(fact);
	    list.addAll(assertions);
	    list.addAll(pred);
	    list.addAll(func);
	    list.addAll(cmds);
	    return list;
	}
	
    public List<IALSAssert> getAssertions() {
         return assertions;
    }
    public void setAssertions(List<IALSAssert> assertions) {
        this.assertions = assertions;
        
    }
	
}
