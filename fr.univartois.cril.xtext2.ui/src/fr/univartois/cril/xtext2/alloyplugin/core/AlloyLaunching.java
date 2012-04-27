package fr.univartois.cril.xtext2.alloyplugin.core;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

// import edu.mit.csail.sdg.alloy4.ConstList;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Pair;
import edu.mit.csail.sdg.alloy4.Pos;
// import edu.mit.csail.sdg.alloy4.SafeList;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4viz.VizGUI;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext2.alloyplugin.api.IReporter;
import fr.univartois.cril.xtext2.alloyplugin.api.Util;
import fr.univartois.cril.xtext2.alloyplugin.console.AlloyMessageConsole;
import fr.univartois.cril.xtext2.alloyplugin.console.Console;
import fr.univartois.cril.xtext2.preferences.PreferenceConstants;
import fr.univartois.cril.xtext2.ui.activator.AlsActivator;

/**
 * Static methods to launch Alloy parser or execute a command.
 */
public class AlloyLaunching {

	private AlloyLaunching() {

	}

	/**
	 * Execute an ExecutableCommand previously created after a parsing.
	 * @param monitor 
	 */
	public static final void execCommand(IALSCommand command, IProgressMonitor monitor) {
		assert (command != null);
		IReporter rep = new Reporter(command.getResource());
		execCommand(command, rep,monitor);
	}

	/**
	 * Parse a als file.
	 * 
	 * @return an array (can be empty if there is no command in the file.)
	 */
	public void launchParser(IALSFile file) {
		if (file == null)
			return;
		IResource res = file.getResource();
		if (res == null || !res.exists())
			return;
		try {
			res.deleteMarkers(Util.ALLOYPROBLEM, false, 0);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		Reporter rep = new Reporter(res);

		try {
			AlloyLaunching.parse(file, rep);
		} catch (Err e) {
			displayErrorInProblemView(res, e);
		}
	}

	/**
	 * Parse one file.(not its subfiles) Don't update associated ALSFile.
	 */
	public List<Command> parseOneFile(IResource resource) {
		if (!resource.exists())
			return null;
		try {
			resource.deleteMarkers(Util.ALLOYPROBLEM, false, 0);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		List<Command> list = null;
		try {
			list = CompUtil.parseOneModule_fromFile(resource.getLocation()
					.toString());
		} catch (Err e) {
			displayErrorInProblemView(resource, e);
		}
		return list;

	}

	/**
	 * Displays an Err exception in problem view, except if it starts with
	 * "Solver fatal exception".
	 */
	public static void displayErrInProblemView(IResource res, Err e,
			int severity) {
		if (e.msg.startsWith("Solver fatal exception")) {
			displaySolverFatalError();
		} else {

			res = getResourceFromErr(res, e);
			try {
				IMarker marker = res.createMarker(Util.ALLOYPROBLEM);
				marker.setAttribute(IMarker.SEVERITY, severity);
				marker.setAttribute(IMarker.LINE_NUMBER, e.pos.y);
				marker.setAttribute(IMarker.MESSAGE, e.msg);
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * Display a solver fatal error in a SWT thread.
	 */
	private static void displaySolverFatalError() {
		Display display = PlatformUI.getWorkbench().getDisplay();
		if (display != null)
			display.asyncExec(new Runnable() {
				public void run() {
					String solverName = AlsActivator.getDefault()
							.getPreferenceStore().getString(
									PreferenceConstants.P_SOLVER_CHOICE);
					Shell shell = new Shell();
					MessageDialog.openInformation(shell, "Alloy Plug-in",
							"\nSolver fatal exception: " + solverName
									+ " maybe not found.");
				}
			});
	}

	public static void displayErrorInProblemView(IResource res, Err e) {
		displayErrInProblemView(res, e, IMarker.SEVERITY_ERROR);
	}

	public static void displayWarningInProblemView(IResource res, Err e) {
		displayErrInProblemView(res, e, IMarker.SEVERITY_WARNING);
	}

	/**
	 * Get the ressource where the Err is located.
	 */
	private static IResource getResourceFromErr(IResource res, Err e) {
		if (e.pos != Pos.UNKNOWN) {
			if (!e.pos.filename.equals(Util.getFileLocation(res))) {
				return Util.getFileForLocation(e.pos.filename);
			}
		}
		return res;
	}

	/**
	 * Parse a .als file. The ALSfile fields are modidied.
	 * 
	 * @throws Err
	 */
	private static void parse(IALSFile file, IReporter rep) throws Err {
		String filename = file.getFilename();
		AlloyMessageConsole alloyParserConsole = Console
				.findAlloyInfoConsole(filename);
		alloyParserConsole.clear();
		alloyParserConsole.printInfo("=========== Parsing \"" + filename
				+ "\" =============");
		// CompModule world = ...
		CompUtil.parseEverything_fromFile(rep, null, filename);
		alloyParserConsole.printInfo("=========== End Parsing \"" + filename
				+ "\" =============");
		// if (world != null)
		//	updateALSFile(world, file);
	}

	/**
	 * Set the fields of an alsFile. (commands, signatures..) fire changed() on
	 * the als file for listeners.
	 */
	/*private static void updateALSFile(CompModule world, IALSFile file) throws Err {
		// convert all commands in ExecutableCommand[]
		List<IALSCommand> exec_cmds = new ArrayList<IALSCommand>();// new
		// ExecutableCommand[list.size()];
		int index = 0;
		for (Command command : world.getAllCommands()) {			
			exec_cmds.add(new ExecutableCommand(file, command,index++, world,null,0));
		}
		exec_cmds.add(new MetamodelCommand(file, world));
		file.setCommand(exec_cmds);
		
		file.fireChange();
	}*/

	/**
	 * Execute a command. The command is modified. Some informations can be show
	 * to console.
	 * @param monitor 
	 */
	private static final void execCommand(IALSCommand command, IReporter rep, IProgressMonitor monitor) {
		AlloyMessageConsole alloyConsole = Console.findAlloyConsole(command
				.getFilename());
		alloyConsole.activate();
		try {
			long beginTime = System.currentTimeMillis();
			alloyConsole.printInfo("============ Command " + command
					+ ": ============");
			command.execute(rep,monitor);
			long endTime = System.currentTimeMillis();
			alloyConsole.printInfo("============ Total time: "
					+ (endTime - beginTime) + " (ms) ===========");
			if (AlsActivator
					.getDefault()
					.getPreferenceStore()
					.getBoolean(PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER))
				showAnswer(command);

		} catch (Err e) {
			displayErrorInProblemView(command.getResource(), e);
		}

	}

	public static void showAnswer(IALSCommand command) {
		Pair<A4Solution, Boolean> ans = command.getAns();

		AlloyMessageConsole alloyConsole = Console.findAlloyConsole(command
				.getFilename());
		alloyConsole.activate();

		if (ans != null) {
			alloyConsole.printInfo("============ Answer ============");
			if (ans.a != null)
				alloyConsole.print(ans.a.toString());

			if (!AlloyLaunching.hasSuccessfulAnswer(ans)) {

				// @author lionel desruelles
				if (AlsActivator
						.getDefault()
						.getPreferenceStore()
						.getBoolean(PreferenceConstants.CLOSE_VIEW_UNSAT))
					command.closeOldVizView();

				alloyConsole
						.printInfo("Cannot display graph : Answer not satisfiable");
			} else {
				command.displayAnsSafe();
			}
		} else
			alloyConsole.printInfo("No answer yet");

	}

	/**
	 * Old method for saving the answer in a temporary file and visualize it.
	 * 
	 * @param ans
	 * @throws Err
	 */
	@Deprecated
	public static void displayAns(A4Solution ans) throws Err {
		// GraphView.Visualize(ans);
		ans.writeXML("output.xml");
		//
		// You can then visualize the XML file by calling this:
		VizGUI viz = new VizGUI(false, "", null);
		viz.loadXML("output.xml", true);
	}

	public static boolean hasSuccessfulAnswer(Pair<A4Solution, Boolean> ans) {
		if (null == ans)
			return false;
		if (null == ans.a)
			return ans.b;
		return ans.a.satisfiable();
	}

	public static String getResourcePartName(IResource res) {
		if (null == res)
			return "";
		IPath rpath = res.getFullPath();
		String[] segments = rpath.segments();
		StringBuffer partNameBuffer = new StringBuffer();
		partNameBuffer.append(rpath.lastSegment());
		for (int i = segments.length - 2; i > 0; --i) {
			partNameBuffer.append('<');
			partNameBuffer.append(segments[i]);
		}
		partNameBuffer.append('|');
		return partNameBuffer.toString();
	}

	private static AlloyLaunching instance;

	public static synchronized AlloyLaunching instance() {
		if (instance == null) {
			instance = new AlloyLaunching();
		}
		return instance;
	}

	/**
	 * Check the resource if it's a file and ends by ".als" .
	 */
	public void parseALSFile(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {

			parseOneFile(resource);
		}
	}

	/**
	 * Evaluate et modifie the .
	 */
	public void parseALSFileFull(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {
			IALSFile file = ALSFileFactory.instance().getIALSFile(resource);
			if (file != null)
				launchParser(file);
		}
	}

	/**
	 * when a .als file is removed.
	 */
	public void removeALSFile(IResource resource) {
		ALSFileFactory.instance().remove(resource);

	}
}
