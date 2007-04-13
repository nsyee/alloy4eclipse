package fr.univartois.cril.alloyplugin.launch.ui;


import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.actions.SelectionProviderAction;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4viz.VizGUI;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.alloyplugin.console.Console;
import fr.univartois.cril.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.alloyplugin.editor.MultiPageEditor;



/**
 * This listens a selectionProvider and can execute selected ExecutableCommand from it.  
 * This action don't use eclipse launching mechanism so it will be replaced/deleted soon. (i hope)
 */
public class DisplayCommandAnswerAction extends SelectionProviderAction {
	public static final ImageDescriptor iconrun = AlloyPlugin.getDefault().getImageRegistry().getDescriptor(AlloyPlugin.GRAPH_ICON_ID);
	private static final String ACTION_ID = "fr.univartois.cril.alloyplugin.launch.displayalloycommandanswer";

	/**
	 * the selection which is associated.
	 */
	private IStructuredSelection selection;

	//private Object[] lastCommands;	

	/**
	 * Constructor. 
	 * */
	public DisplayCommandAnswerAction(ISelectionProvider sp) {	
		super(sp,"Display Answer");
		this.setEnabled(false);
		setImageDescriptor(iconrun);			
		setToolTipText("Display an answer");
		setActionDefinitionId(ACTION_ID);
		
	}


	public void selectionChanged(IStructuredSelection selection)
	{	
		A4Solution ans;
		
		this.selection=selection;
		if (selection.isEmpty()) {
			this.setEnabled(false);
			return;
		}
		//else this.setEnabled(true);
		Object[] tab=selection.toArray();
		if (tab.length>1)
			this.setText("Show answer");
		//TODO : make constants 
		for (int i=0;i<tab.length;i++){
			if (tab[i] instanceof ExecutableCommand){
				if (((ExecutableCommand) tab[i]).isCheck())
					this.setText("Show Counter example");
				else
					this.setText("Show model");
				ans = ((ExecutableCommand) tab[i]).getAns();
				if (ans!=null){
				this.setEnabled(true);
				}else{
					this.setEnabled(false);
				}
			}
			else {this.setEnabled(false);
			break;
			}
		}

	}


	/**
	 * this method display the commands answer
	 * */
	public void run(){		
		ExecutableCommand[] commands = createCommands(selection.toArray());

		A4Solution ans;
		for(int i=0;i<commands.length;i++){

			ans=commands[i].getAns();

			AlloyMessageConsole alloyConsole=Console.findAlloyConsole(commands[i].getFilename());
			alloyConsole.reveal();
			if (ans!=null)
				alloyConsole.printInfo("============ Answer ============");
			else
				alloyConsole.printInfo("No answer yet");
			if (ans!=null)
			alloyConsole.print(ans.toString());
			try {
				if (!(ans.satisfiable()))
					alloyConsole.printInfo("Cannot display graph : Answer not satisfiable");
				else{
				commands[i].displayAns();
				}
			} catch (Err e) {
				e.printStackTrace();
				}
			
		}

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

}
