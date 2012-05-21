package fr.univartois.cril.xtext2.ui.editor.outline;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import fr.univartois.cril.xtext2.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.xtext2.alloyplugin.launch.ui.LaunchConfigurationConstants;
import fr.univartois.cril.xtext2.alloyplugin.launch.ui.LaunchQuickConfigFactory;

public class CommandOutlineNodeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
		if (editor == null) return null;
		if (editor.isSaveOnCloseNeeded()) return null;
		
		IXtextDocument document = XtextDocumentUtil.get(editor);
    	int offset = editor.getHighlightRange().getOffset();
		int line = getLine(document, offset) + 1;
		if (line == -1) return null;
		
		IResource resource = editor.getResource();
        
		ALSImageRegistry.getImageRegistry();
		DebugUITools.launch(LaunchQuickConfigFactory.getInstance().createCommand(resource, "" + line), LaunchConfigurationConstants.RUN_MODE);
		return null;
	}
	
	private int getLine(IXtextDocument document, int offset) {
        int line = -1;
        try {
			line = document.getLineOfOffset(offset);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
        return line;
    }
}
