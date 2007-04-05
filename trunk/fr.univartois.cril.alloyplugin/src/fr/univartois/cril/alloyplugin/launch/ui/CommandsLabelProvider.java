package fr.univartois.cril.alloyplugin.launch.ui;


import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import fr.univartois.cril.alloyplugin.AlloyPlugin;

import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;

/**
 * This class is used by AlloyCommandView for display its elements.
 */


class CommandsLabelProvider extends LabelProvider implements ITableLabelProvider {
	
	
	public String getColumnText(Object obj, int index) {		
		ExecutableCommand cmd=(ExecutableCommand) obj;
		if (cmd.getResult()==ExecutableCommand.UNKNOW)
			return cmd.toString();
		if (cmd.getResult()!=ExecutableCommand.SAT)
			return cmd.toString()+" [UNSAT]";
		else return cmd.toString()+" [SAT]";			
	}
	
	
	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}
	
	
	
	public Image getImage(Object obj) {		
		ExecutableCommand cmd=(ExecutableCommand) obj;
		ImageRegistry reg = AlloyPlugin.getDefault().getImageRegistry();
		if (cmd.getResult()==ExecutableCommand.SAT)
			if (cmd.getCommand().check) {
				if(cmd.getCommand().expects==1)
					return reg.get(AlloyPlugin.BLUE_CHECK_ID);// not expected sat check command
				else
					return reg.get(AlloyPlugin.RED_CHECK_ID);// expected sat check command
			}
			else return reg.get(AlloyPlugin.GREEN_RUN_ID);;//Sat Run command 
		if (cmd.getResult()==ExecutableCommand.UNSAT)
			if (cmd.getCommand().check) return reg.get(AlloyPlugin.GREEN_CHECK_ID);//OK
			else {
				if(cmd.getCommand().expects==0)
					return reg.get(AlloyPlugin.BLUE_RUN_ID);
				else
					return reg.get(AlloyPlugin.RED_RUN_ID);
			}
		return reg.get(AlloyPlugin.COMMAND_ID);
		
	}
	
}
