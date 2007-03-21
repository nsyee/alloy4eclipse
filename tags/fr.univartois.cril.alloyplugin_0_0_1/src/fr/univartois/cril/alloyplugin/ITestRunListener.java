package fr.univartois.cril.alloyplugin;

public interface ITestRunListener {
	void executionStarted(int testCount);
	void executionFinished();
	void runStarted(String klass,String method);
	void runFailed(String klass,String method,String trace);

}
