package fr.univartois.cril.alloyplugin.launch.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import edu.mit.csail.sdg.alloy4.Err;
import fr.univartois.cril.alloyplugin.launch.Activator;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.launch.Reporter;

/**
 * This listens a selectionProvider and can execute selected ExecutableCommand from it.  
 * */
public class LaunchLastCommandAction extends Action implements ICommandActionListener{


	private ExecutableCommand[] lastExecutableCommands;

	public LaunchLastCommandAction() {
		super("Execute last command(s)");
		System.out.println("coucou0");
		this.setEnabled(false);	
		setToolTipText("Execute last command(s)");
		this.setActionDefinitionId("fr.univartois.cril.alloyplugin.launch.runlastalloycommands");

	}

	public void run(){
		System.out.println("coucou2");
		for (int i = 0; i < lastExecutableCommands.length; i++) {
			ExecutableCommand cmd = (ExecutableCommand) lastExecutableCommands[i];
			try {
				cmd.execute(new Reporter(cmd.getRes()));
			} catch (Err e) {
				AlloyLaunching.displayErrorInProblemView(cmd.getRes(), e);
			}
		}
	}

	public void commandsExecuted(ExecutableCommand[] exec_cmds) {
		this.lastExecutableCommands=exec_cmds;
		System.out.println("coucou");
		this.setEnabled(lastExecutableCommands.length!=0);

	}

}
