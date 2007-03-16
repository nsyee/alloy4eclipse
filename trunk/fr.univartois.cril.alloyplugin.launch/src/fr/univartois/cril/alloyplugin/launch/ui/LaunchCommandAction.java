package fr.univartois.cril.alloyplugin.launch.ui;

import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.SelectionProviderAction;
import fr.univartois.cril.alloyplugin.launch.Activator;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;



/**
 * This listens a selectionProvider and can execute selected ExecutableCommand from it.  
 */
public class LaunchCommandAction extends SelectionProviderAction {
	private static ImageDescriptor enableImage;
	private static ImageDescriptor disableImage;
	static {
		URL url = null;
		try {
			url = new URL(Activator.getDefault().getBundle().getEntry("/"),
			"icons/icon.gif");
		} catch (MalformedURLException e) {
		}
		enableImage = ImageDescriptor.createFromURL(url);
	}
	static {
		URL url = null;
		try {
			url = new URL(Activator.getDefault().getBundle().getEntry("/"),
			"icons/DisableAlloyLaunch.gif");
		} catch (MalformedURLException e) {
		}
		disableImage = ImageDescriptor.createFromURL(url);
	}

	/**
	 * the selection which is associated.
	 */
	private IStructuredSelection selection;
	private ICommandActionListener listener=null;
	//private Object[] lastCommands;	


	public LaunchCommandAction(ISelectionProvider sp) {
		super(sp,"Execute command");		
		this.setEnabled(false);
		setImageDescriptor(enableImage);
		setDisabledImageDescriptor(disableImage);
		setToolTipText("Execute an Alloy command");
		this.setActionDefinitionId("fr.univartois.cril.alloyplugin.launch.runalloycommand");

	}
	public void selectionChanged(IStructuredSelection selection)
	{	
		this.selection=selection;
		if (selection.isEmpty()) this.setEnabled(false);
		else this.setEnabled(true);
	}
	/**
	 * this method execute all ExecutableCommand present in selection.
	 * */
	public void run(){		
		ExecutableCommand[] commands = createCommands(selection.toArray());

		for(int i=0;i<commands.length;i++){
			AlloyLaunching.ExecCommand((ExecutableCommand) commands[i]);
			AlloyCommandView.refresh();
		}
		changeLastCommands(commands);
	}
	/**
	 * Avertit l'eventuel listener enregistré sur l'execution de commandes.  
	 */
	private void changeLastCommands(ExecutableCommand[] commands) {		
		if (listener!=null)listener.commandsExecuted(commands);
	}
	/**
	 * create commands from selection.
	 */
	private ExecutableCommand[] createCommands(Object[] commands) {
		ExecutableCommand[] cmds = new ExecutableCommand[commands.length];
		for(int i=0;i<commands.length;i++){
			cmds[i]=(ExecutableCommand) commands[i];			
		}
		return cmds;	
	}
	/**
	 * add a listener qui sera prévenu d'e l'execution de commandes.
	 */
	public void addListener(ICommandActionListener listener){
		this.listener=listener;		
	}
	
}
