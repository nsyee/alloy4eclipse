package fr.univartois.cril.alloyplugin;

public interface ICommandListener {
	void commandsStarted(int commandCount);
	void commandsFinished();
	void commandStarted(String klass,String method);
	void commandFailed(String klass,String method,String trace);
}
