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

public class AssertionOutlineNodeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		String assertName, content = null;
		
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

		StringTokenizer tmp = new StringTokenizer(content);
		assertName = tmp.nextToken();
		if ("assert".equals(assertName)) {
			assertName = tmp.nextToken();
		}
		// Fix for NPE during initialization. Need a better way to fic this in the future.
		ALSImageRegistry.getImageRegistry();
		DebugUITools.launch(LaunchQuickConfigFactory.getInstance().create(resource, assertName), LaunchConfigurationConstants.RUN_MODE);
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
