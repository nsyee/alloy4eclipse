package fr.univartois.cril.xtext2.ui.outline;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class MyAction implements IObjectActionDelegate {

	private IWorkbenchPart part;
	
	@Override
	public void run(IAction arg0) {
			      MessageDialog.openInformation(
			         this.part.getSite().getShell(),
			         "Readme Example",
			         "Popup Menu Action executed");
			   }	

	@Override
	public void selectionChanged(IAction arg0, ISelection arg1) {
		System.out.println("Changed");
	}

	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
		this.part = arg1;
	}

}
