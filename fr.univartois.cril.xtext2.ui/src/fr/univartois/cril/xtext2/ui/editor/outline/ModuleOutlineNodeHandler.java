package fr.univartois.cril.xtext2.ui.editor.outline;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import fr.univartois.cril.xtext2.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.xtext2.alloyplugin.launch.ui.LaunchConfigurationConstants;
import fr.univartois.cril.xtext2.alloyplugin.launch.ui.LaunchQuickConfigFactory;

public class ModuleOutlineNodeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
		if (editor == null) return null;
		if (editor.isSaveOnCloseNeeded()) return null;
		IResource resource = editor.getResource();
		
		ALSImageRegistry.getImageRegistry();
		DebugUITools.launch(LaunchQuickConfigFactory.getInstance().createModule(resource, ""), LaunchConfigurationConstants.RUN_MODE);
		return null;
	}	
}
