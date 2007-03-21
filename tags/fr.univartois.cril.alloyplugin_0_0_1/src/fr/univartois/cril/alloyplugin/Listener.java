package fr.univartois.cril.alloyplugin;

import org.eclipse.jface.dialogs.MessageDialog;

public  class Listener implements ITestRunListener {

		private boolean passed;

		public void executionStarted(int testCount) {
			// TODO Auto-generated method stub

		}

		public void executionFinished() {
			// TODO Auto-generated method stub
			String message=passed?"Success ": "fail";
			MessageDialog.openInformation(null,"Résultats de test",message);
		}
		public void runStarted(String klass, String method) {
			// TODO Auto-generated method stub

		}


		public void runFailed(String klass, String method, String trace) {
			passed=false;

		}
	}