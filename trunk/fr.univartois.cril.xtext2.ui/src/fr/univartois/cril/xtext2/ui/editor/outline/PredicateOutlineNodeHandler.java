package fr.univartois.cril.xtext2.ui.editor.outline;

import java.util.StringTokenizer;

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

public class PredicateOutlineNodeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		String  predName, content = null;
		
		XtextEditor editor = EditorUtils.getActiveXtextEditor(event);
		if (editor == null) return null;
		if (editor.isSaveOnCloseNeeded()) return null;
		
		IXtextDocument document = XtextDocumentUtil.get(editor);
		IResource resource = editor.getResource();
		
		int offset = editor.getHighlightRange().getOffset();
		int line = getLine(document, offset) + 1;
		if (line == -1) return null;
		
		try {
			content = editor.getDocument().get(offset, editor.getDocument().getLineLength(line));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		
		StringTokenizer tmp = new StringTokenizer(content, " [{");
		predName = tmp.nextToken();
		while ("pred".equals(predName) || "private".equals(predName)) {
			predName = tmp.nextToken();
		}
		if(predName.contains(".")) 
			predName = predName.substring(predName.indexOf(".") + 1);
				
		ALSImageRegistry.getImageRegistry();
		DebugUITools.launch(LaunchQuickConfigFactory.getInstance().createPredicate(resource, predName), LaunchConfigurationConstants.RUN_MODE);
		return null;
	}

	private int getLine(IXtextDocument document, int offset) {
		int line = -1;
		try {
			line = document.getLineOfOffset(offset);
		} catch (BadLocationException e) {
			return -1;
		}
		return line;
	}
}
