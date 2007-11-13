package fr.univartois.cril.alloyplugin.launch.ui;


import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.SelectionProviderAction;

import edu.mit.csail.sdg.alloy4.Pair;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.alloyplugin.api.IALSCommand;
import fr.univartois.cril.alloyplugin.core.AlloyLaunching;



/**
 * This listens a selectionProvider and can execute selected IALSCommand from it.  
 * This action don't use eclipse launching mechanism so it will be replaced/deleted soon. (i hope)
 */
public class DisplayCommandAnswerAction extends SelectionProviderAction {
	public static final ImageDescriptor iconrun = ALSImageRegistry.getImageDescriptor(ALSImageRegistry.GRAPH_ICON_ID);
	private static final String ACTION_ID = "fr.univartois.cril.alloyplugin.launch.displayalloycommandanswer";
	public static final String MODEL = "Show Model";
	public static final String ANSWER = "Show Answer";
	public static final String COUNTER_EXAMPLE = "Show Counter Example";

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
		Pair<A4Solution, Boolean> ans;
		
		this.selection=selection;
		if (selection.isEmpty()) {
			this.setEnabled(false);
			return;
		}
		//else this.setEnabled(true);
		Object[] tab=selection.toArray();
		if (tab.length>1)
			this.setText(ANSWER);
		for (int i=0;i<tab.length;i++){
			if (tab[i] instanceof IALSCommand){
				if (((IALSCommand) tab[i]).isCheck())
					this.setText(COUNTER_EXAMPLE);
				else
					this.setText(MODEL);
				ans = ((IALSCommand) tab[i]).getAns();
				if (AlloyLaunching.hasSuccessfulAnswer(ans)) {
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
		IALSCommand[] commands = createCommands(selection.toArray());
		for(int i=0;i<commands.length;i++){
			AlloyLaunching.showAnswer(commands[i]);
		}
	}

	/**
	 * create commands from selection.
	 */
	private IALSCommand[] createCommands(Object[] commands) {
		IALSCommand[] cmds = new IALSCommand[commands.length];
		for(int i=0;i<commands.length;i++){
			cmds[i]=(IALSCommand) commands[i];			
		}
		return cmds;	
	}

    public static boolean hasSuccessfulAnswer(Pair<A4Solution, Boolean> ans) {
        if (null == ans)
            return false;
        if (null == ans.a)
            return ans.b;
        return ans.a.satisfiable();
    }
}
