package fr.univartois.cril.xtext.ui.editor.outline;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import fr.univartois.cril.xtext.alloyplugin.api.IReporter;
import fr.univartois.cril.xtext.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.xtext.alloyplugin.console.Console;
import fr.univartois.cril.xtext.alloyplugin.core.ALSFile;
import fr.univartois.cril.xtext.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.xtext.alloyplugin.core.Reporter;

public class CommandOutlineNodeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IXtextDocument document;
		XtextEditor editor;
		IResource resource;
		ALSFile file;
		int line, offset;
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
		List<Command> list = getList(resource);
		command = retrieveCommand(list, line);
		
		file = new ALSFile(resource);
		CompModule world;
		String filename = file.getFilename();
		IReporter reporter = new Reporter(resource);
		world = getWorld(reporter, filename);

		if (world == null)
			return null;
		int index = retrieveIndexOfCommand(world.getAllCommands(), command);
		if (index == -1)
			return null;
		ExecutableCommand ex = new ExecutableCommand(file, command, index,
				world);
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

	private List<Command> getList(IResource resource) {
		List<Command> list = null;
		try {
			list = CompUtil.parseOneModule_fromFile(resource.getLocation()
					.toString());
		} catch (Err e) {
			// displayErrorInProblemView(resource, e);
		}
		return list;
	}

	private Command retrieveCommand(List<Command> list, int line) {
		if (list == null)
			return null;
		for (Command command : list) {
			int lineCommand = command.pos().y;
			if (line == lineCommand)
				return command;
		}
		return null;
	}

	private int retrieveIndexOfCommand(List<Command> commands, Command command) {
		int index = 0;
		for (Command cm : commands) {
			if (cm.pos().y ==command.pos().y)
				return index;
			index++;
		}
		return -1;
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
