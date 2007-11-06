package fr.univartois.cril.alloyplugin.launch.ui;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.actions.SelectionProviderAction;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.editor.AlloyTreeContentProvider;

/**
 * This listens a selectionProvider and can execute selected IALSCommand from it.
 *   
 * This action use eclipse launching mechanism.
 */
public class LaunchCommandAction extends SelectionProviderAction {
	private static final String ACTION_ID = "fr.univartois.cril.alloyplugin.launch.runalloycommand";

	private static final String TEXT_DEFAULT = "Launch command(s)";	
	private static final String TEXT_ALL_COMMAND = "Launch all";

	private static ImageDescriptor enableImage=AlloyPlugin.getDefault().getImageRegistry().getDescriptor(AlloyPlugin.EXECUTE_ICON_ID);
	private static ImageDescriptor disableImage=AlloyPlugin.getDefault().getImageRegistry().getDescriptor(AlloyPlugin.DISABLE_EXECUTE_ICON_ID);


	/**
	 * the selection which is associated.
	 */
	private IStructuredSelection selection;

	private TreeViewer viewer;

	
	
	private boolean commandRootSelected;

	//

	/**
	 * Constructor. 
	 * */
	public LaunchCommandAction(TreeViewer treeViewerWithAnAlloyTreeContentProvider) {

		super(treeViewerWithAnAlloyTreeContentProvider,TEXT_DEFAULT);
		this.viewer=treeViewerWithAnAlloyTreeContentProvider;
		this.setEnabled(false);
		commandRootSelected=false;
		setImageDescriptor(enableImage);
		setDisabledImageDescriptor(disableImage);
		setToolTipText("Launch Alloy command(s) in quick launch configuration");
		setActionDefinitionId(ACTION_ID);
	}




	public void selectionChanged(IStructuredSelection selection)
	{	
		commandRootSelected=false;
		this.selection=selection;
		if (selection.isEmpty()) this.setEnabled(false);
		else {
			for (Iterator iter=selection.iterator();iter.hasNext();){
				Object o=iter.next();
				if(o==AlloyTreeContentProvider.COMMANDS)
				{

					AlloyTreeContentProvider contentProvider = (AlloyTreeContentProvider) viewer.getContentProvider();
					//commands=contentProvider.getChildren(o);
					if (contentProvider.getChildren(o).length>=1)
					{
						this.setEnabled(true);
						commandRootSelected=true;
							setText(TEXT_ALL_COMMAND);
						
						return;
					}
				}
				else
					if (o instanceof IALSCommand){
						setText(TEXT_DEFAULT);
						
						this.setEnabled(true);
						return;
					}

			}

		}
		setText(TEXT_DEFAULT);
		setEnabled(false);
	}



	/**
	 * Create and run a quick launch configuration with all IALSCommand from selection.
	 * */

	public void run() {
		List<IALSCommand> commandsList = null;
		if (commandRootSelected){
			commandsList=new ArrayList<IALSCommand>();
			AlloyTreeContentProvider contentProvider = (AlloyTreeContentProvider) viewer.getContentProvider();
			Object[] commands = contentProvider.getChildren(AlloyTreeContentProvider.COMMANDS);
			for (int i = 0; i < commands.length; i++) {
				commandsList.add((IALSCommand) commands[i]);
			}

		}
		else
			commandsList= getIALSCommandFromSelection(selection);

		if (!commandsList.isEmpty())
		{			
			launch(LaunchQuickConfigFactory.getInstance().create(commandsList));
		}
	}

	private void launch(ILaunchConfiguration config){	
		if (config != null) {

			DebugUITools.launch(config, LaunchConfigurationConstants.RUN_MODE);
			viewer.setSelection(null,true);
		}
	}

	/**
	 * Return executable a list of command from selection. can be empty.
	 * */
	public List<IALSCommand> getIALSCommandFromSelection( IStructuredSelection selection) {
		ArrayList<IALSCommand> list =new ArrayList<IALSCommand>();
		if (!selection.isEmpty()) {
			for ( Iterator iterator = selection.iterator();iterator.hasNext();) {
				Object obj=iterator.next();
				if (obj instanceof IALSCommand) {
					list.add((IALSCommand) obj);											
				}
			}
		}
		return list;
	}
}
