package fr.univartois.cril.alloyplugin;

import org.eclipse.jface.dialogs.MessageDialog;

public  class Listener implements ICommandListener {

		private boolean passed;

		public void commandsStarted(int commandCount) {
			// TODO Auto-generated method stub

		}

		public void commandsFinished() {
			// TODO Auto-generated method stub
			String message=passed?"Success ": "fail";
			//MessageDialog.openInformation(null,"Results",message);
		}
		public void commandStarted(String klass, String method) {
			// TODO Auto-generated method stub

		}


		public void commandFailed(String klass, String method, String trace) {
			passed=false;

		}
	}