package fr.univartois.cril.xtext.alloyplugin.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.univartois.cril.xtext.alloyplugin.api.IALSAssert;
import fr.univartois.cril.xtext.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext.alloyplugin.api.IALSFact;
import fr.univartois.cril.xtext.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext.alloyplugin.api.IALSFileListener;
import fr.univartois.cril.xtext.alloyplugin.api.IALSFunction;
import fr.univartois.cril.xtext.alloyplugin.api.IALSPredicate;
import fr.univartois.cril.xtext.alloyplugin.api.IALSSignature;
import fr.univartois.cril.xtext.alloyplugin.api.IALSTreeDecorated;

public abstract class AbstractALSFile implements IALSFile {

    private Map<String, IALSCommand> commandsMap = new HashMap<String,IALSCommand>();
    private List <IALSFileListener> listeners;
    private List<IALSCommand> cmds = new ArrayList<IALSCommand>();
    private List <IALSPredicate> pred = new ArrayList<IALSPredicate>();
    private List <IALSFact> fact = new ArrayList<IALSFact>();
    private List <IALSFunction> func = new ArrayList<IALSFunction>();
    private List <IALSSignature> sig = new ArrayList<IALSSignature>();
    private List <IALSAssert> assertions = new ArrayList<IALSAssert>();

    public void dispose() {}

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

    public void fireChange() {
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
    }

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

    /**
     * Get a command from his label. 
     *   
     * */
    public IALSCommand getCommand(String commandLabel) {        
        return commandsMap.get(commandLabel);
    }
}
