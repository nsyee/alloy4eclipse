package fr.univartois.cril.alloyplugin.launch;




import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;

import org.eclipse.ui.IEditorPart;


import org.eclipse.core.resources.IResource;

import edu.mit.csail.sdg.alloy4.Err;
import fr.univartois.cril.alloyplugin.console.Console;

public class LaunchShortcut implements ILaunchShortcut {

	public void launch(ISelection selection, String mode) {
		// TODO Auto-generated method stub
		MessageDialog.openInformation(null,null,"Run Alloy1...");	
	}

	public void launch(IEditorPart editor, String mode) {		
		Console.revealConsoleView(editor.getSite().getPage(),getFileLocation(getResource(editor)));
		//IWorkbenchPage page
		try {			
			LaunchCompiler.command(getFileLocation(getResource(editor)));
		} catch (Err e) {e.printStackTrace();}		
	}


	private IResource getResource(IEditorPart editor) {
		// TODO Auto-generated method stub
		IResource ir=(IResource)editor.getEditorInput().getAdapter(IResource.class);
		if(ir==null)throw new RuntimeException();
		else return ir;
	}

	private String getFileLocation(IResource ir) {
		IPath ip=ir.getLocation();		
		if (ip!=null) return ""+ip;
		else throw new RuntimeException();
	}
}
