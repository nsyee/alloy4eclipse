package fr.univartois.cril.xtext2.alloyplugin.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.univartois.cril.xtext2.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSFileListener;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSTreeDecorated;

public abstract class AbstractALSFile implements IALSFile {

    private Map<String, IALSCommand> commandsMap = new HashMap<String,IALSCommand>();
    private List <IALSFileListener> listeners;
    private List<IALSCommand> cmds = new ArrayList<IALSCommand>();
  
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

   

    public void setCommand(List <IALSCommand> cmds) {
    	assert(cmds!=null);		
    	commandsMap.clear();
    	for (IALSCommand command : cmds) {
    		commandsMap.put(command.getName(), command);	
    	}		
    	this.cmds=cmds;		
    }

    

    public List<IALSTreeDecorated> getAllAlloyObjects() {
        List<IALSTreeDecorated> list = new ArrayList<IALSTreeDecorated>();
      
        list.addAll(cmds);
        return list;
    }

   

    

    /**
     * Get a command from his label. 
     *   
     * */
    public IALSCommand getCommand(String commandLabel) {        
        return commandsMap.get(commandLabel);
    }
}
