package fr.univartois.cril.xtext2.ui.editor.outline;

import java.util.StringTokenizer;

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

import edu.mit.csail.sdg.alloy4.ConstList;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pair;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import edu.mit.csail.sdg.alloy4compiler.ast.Module;
import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import fr.univartois.cril.xtext2.alloyplugin.api.IReporter;
import fr.univartois.cril.xtext2.alloyplugin.core.ALSFile;
import fr.univartois.cril.xtext2.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.xtext2.alloyplugin.core.Reporter;
import fr.univartois.cril.xtext2.preferences.PreferenceConstants;
import fr.univartois.cril.xtext2.ui.activator.AlsActivator;

public class AssertionOutlineNodeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IXtextDocument document;
		XtextEditor editor;
		IResource resource;
		ALSFile file;
		int line, offset;
		Command command = null;
		CompModule world;
		String cmd, assertName, content = null;
		editor = EditorUtils.getActiveXtextEditor(event);
		if (editor == null)
			return null;
		document = XtextDocumentUtil.get(editor);

		if (editor.isSaveOnCloseNeeded())
			return null;
		resource = editor.getResource();

		offset = editor.getHighlightRange().getOffset();
		line = getLine(document, offset) + 1;
		if (line == -1)
			return null;
		try {
			content = editor.getDocument().get(offset,
					editor.getDocument().getLineLength(line));

		} catch (BadLocationException e) {

			e.printStackTrace();
		}

		StringTokenizer tmp = new StringTokenizer(content);
		assertName = tmp.nextToken();
		if ("assert".equals(assertName)) {
			assertName = tmp.nextToken();
		}
		IPreferenceStore store = AlsActivator.getInstance()
				.getPreferenceStore();
		int scope = Integer.parseInt(store
				.getString(PreferenceConstants.DEFAULT_LAUNCH_OPTION));
		// cmd=assertName;
		cmd = assertName;
		IReporter reporter = new Reporter(resource);
		file = new ALSFile(resource);
		String filename = file.getFilename();
		world = getWorld(reporter, filename);

		if (world == null)
			return null;
		
		try {
			world.getAllAssertions();
			Pair<String,Expr> p=findAssertion(world, assertName);
			command = new Command(true, scope, -1, -1, p.b);
		} catch (Err e) {
			e.printStackTrace();
		}
		if (command == null) return null;
		
		cmd = "Check " + cmd ;
		
		System.out.println("Nom assertion : " + cmd) ;
		
		ExecutableCommand ex = new ExecutableCommand(file, command, 0, world, cmd, scope);
		executeCommand(ex, reporter, null);
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
	
	public Pair<String,Expr> findAssertion(Module world,String assertion){
		ConstList<Pair<String,Expr>> l=world.getAllAssertions();
		for(Pair<String,Expr> c:l){
			if(c.a.equals(assertion)){
				return c;
			}
		}
		return null;
	}
}
