package fr.univartois.cril.xtext2.ui.editor.outline;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import fr.univartois.cril.xtext2.alloyplugin.api.IReporter;
import fr.univartois.cril.xtext2.alloyplugin.core.ALSFile;
import fr.univartois.cril.xtext2.alloyplugin.core.MetamodelCommand;
import fr.univartois.cril.xtext2.alloyplugin.core.Reporter;

public class ModuleOutlineNodeHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		ALSFile file;
		IResource resource;
		XtextEditor editor;
		CompModule world;			
		

		editor = EditorUtils.getActiveXtextEditor(event);
		resource = editor.getResource();
		file = new ALSFile(resource);
		IReporter reporter = new Reporter(resource);
		
		world = getWorld(reporter, file.getFilename());

		
		MetamodelCommand cmd=new MetamodelCommand(file, world);
		try {
			cmd.execute(reporter, null);
		} catch (Err e) {
			
			e.printStackTrace();
		}
		return null;
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
	
}
