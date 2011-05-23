package fr.univartois.cril.xtext.ui.editor.outline;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import com.ibm.icu.util.StringTokenizer;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import fr.univartois.cril.xtext.alloyplugin.api.IReporter;
import fr.univartois.cril.xtext.alloyplugin.core.ALSFile;
import fr.univartois.cril.xtext.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.xtext.alloyplugin.core.Reporter;
import fr.univartois.cril.xtext.preferences.PreferenceConstants;
import fr.univartois.cril.xtext.ui.activator.AlsActivator;

public class PredicateOutlineNodeHandler extends AbstractHandler{

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IXtextDocument document;
		XtextEditor editor;
		IResource resource;
		ALSFile file;
		int line, offset;
		String cmd,content=null,predName;
		Command command;
		
		editor = EditorUtils.getActiveXtextEditor(event);
		if (editor == null)
			return null;
		
		document = XtextDocumentUtil.get(editor);
		
		if(editor.isSaveOnCloseNeeded()) return null;
		resource = editor.getResource();
		
		offset = editor.getHighlightRange().getOffset();
		line = getLine(document, offset) + 1;
		if (line == -1)
			return null;
		try {
			content=editor.getDocument().get(offset, editor.getDocument().getLineLength(line));

		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringTokenizer tmp=new StringTokenizer(content);
		predName=tmp.nextToken();
		while("pred".equals(predName)||"private".equals(predName)){ 
			predName=tmp.nextToken();
		}
		IPreferenceStore store=AlsActivator.getInstance().getPreferenceStore();
		cmd="run "+predName+" "+store.getString(PreferenceConstants.DEFAULT_LAUNCH_OPTION);
		file = new ALSFile(resource);
		CompModule world;
		String filename = file.getFilename();
		IReporter reporter = new Reporter(resource);
		world = getWorld(reporter, filename);

		if (world == null)
			return null;

		//ExecutableCommand ex = new ExecutableCommand(file, command, index,
		//		world);
		//executeCommand(ex, reporter, null);
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
	
	private CompModule getWorld(IReporter reporter, String filename) {
		CompModule world;
		try {
			world = CompUtil.parseEverything_fromFile(reporter, null, filename);
		} catch (Err e) {
			return null;
		}
		return world;
	}
	
	private void executeCommand(ExecutableCommand executableCommand,
			IReporter reporter, IProgressMonitor monitor) {
		try {
			executableCommand.execute(reporter, monitor);
		} catch (Err e) {
			// TODO Auto-generated catch block
		}
	}
}
