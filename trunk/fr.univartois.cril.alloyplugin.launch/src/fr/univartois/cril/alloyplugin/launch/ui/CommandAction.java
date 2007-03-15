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
 * */
public class CommandAction extends SelectionProviderAction {
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
	private IStructuredSelection selection;	
	
	
	public CommandAction(ISelectionProvider sp) {
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
	public void run(){		
		Object[] list =  selection.toArray();
		//ExecutableCommand [] exec_cmds=new ExecutableCommand[list.length];		
		for(int i=0;i<list.length;i++){
			AlloyLaunching.ExecCommand((ExecutableCommand) list[i]);
			AlloyCommandView.refresh();
		}
		
		//AlloyCommandView.setCommands(resource,exec_cmds);
		//AlloyCommandView.forceDisplayCommands(resource);
	}

}
