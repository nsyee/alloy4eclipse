package fr.univartois.cril.alloyplugin.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import edu.mit.csail.sdg.alloy4.A4Reporter;

public abstract class IReporter extends A4Reporter implements Map <String,String>{
	private Map<String,String> contents = new HashMap<String,String>();
	 
	public boolean containsKey(Object key) {
		return contents.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return contents.containsValue(value);
	}

	public Set<java.util.Map.Entry<String, String>> entrySet() {
        return contents.entrySet();
    }

    public String get(Object key) {
        return contents.get(key);
    }
    
    public boolean isEmpty() {
        return contents.isEmpty();
    }
    
    public Set<String> keySet() {
        return contents.keySet();
    }

    public String put(String key, String value) {
    	return contents.put(key, value);
    }
    
    public void putAll(Map<? extends String, ? extends String> m) {
        contents.putAll(m);
    }

    public String remove(Object key) {
        return contents.remove(key);
    }

    public int size() {
        return contents.size();
    }

    public Collection<String> values() {
         return contents.values();
    }
    
    public void clear() {
		contents.clear();		
	}

	abstract public void setExecCommand(IALSCommand command);

	abstract public void resultSAT
	(int expects, boolean check,long solvingTime);
	
	abstract public void resultUNSAT
	(int expects, boolean check,long solvingTime);
}
