package fr.univartois.cril.alloyplugin.launch.ui;

import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import fr.univartois.cril.alloyplugin.launch.Activator;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;

/*
 * The content provider class is responsible for
 * providing objects to the view. It can wrap
 * existing objects in adapters or simply return
 * objects as-is. These objects may be sensitive
 * to the current input of the view, or ignore
 * it and always show the same content 
 * (like Task List, for example).
 */


class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
	
	
	public String getColumnText(Object obj, int index) {
		//AlloyRunCommandAction a=(AlloyRunCommandAction) obj;
		//return a.getCommand().toString();
		ExecutableCommand cmd=(ExecutableCommand) obj;
		return cmd.toString()+" "+cmd.getResult();			
	}
	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}
	public Image getImage(Object obj) {
		
		ExecutableCommand cmd=(ExecutableCommand) obj;
		ImageRegistry reg = Activator.getDefault().getImageRegistry();
		if (cmd.getResult().equals(ExecutableCommand.SAT))
			if (cmd.getCommand().check) {
				if(cmd.getCommand().expects==0)
					return reg.get(Activator.RED_CHECK_ID);// not expected sat check command
				else
					return reg.get(Activator.BLUE_CHECK_ID);// expected sat check command
			}
			else return reg.get(Activator.GREEN_RUN_ID);;//Sat Run command 
		if (cmd.getResult().equals(ExecutableCommand.UNSAT))
			if (cmd.getCommand().check) return reg.get(Activator.GREEN_CHECK_ID);//OK
			else {
				if(cmd.getCommand().expects==0)
					return reg.get(Activator.BLUE_RUN_ID);
				else
					return reg.get(Activator.RED_RUN_ID);
			}


		return reg.get(Activator.COMMAND_ID);
		//return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
	}
	private Object getImageRegistry() {
		// TODO Auto-generated method stub
		return null;
	}
}
