package fr.univartois.cril.alloyplugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class runAlloyAction implements IObjectActionDelegate {
	private  ISelection selection;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

	public void run(IAction action) {
		// TODO Auto-generated method stub
		//selection
		MessageDialog.openInformation(null,null,"Fonction spéciale");
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection=selection;

	}
}

