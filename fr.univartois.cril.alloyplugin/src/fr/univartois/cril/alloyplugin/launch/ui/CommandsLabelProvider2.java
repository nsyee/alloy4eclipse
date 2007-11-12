package fr.univartois.cril.alloyplugin.launch.ui;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import fr.univartois.cril.alloyplugin.api.IALSTreeDecorated;

/**
 * This class is used for display Alloy commands.
 */

class CommandsLabelProvider2 extends LabelProvider implements ITableLabelProvider {
	
	
	public String getColumnText(Object obj, int index) {		
			return obj.toString();					
	}
	
	
	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}
		
	public Image getImage(Object obj) {		
		if(obj instanceof IALSTreeDecorated)
			return ((IALSTreeDecorated)obj).getIcon();
		return null;
	}
	
}
