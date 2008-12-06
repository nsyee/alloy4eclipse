package fr.univartois.cril.alloyplugin.core;import java.io.File;import java.io.IOException;import java.util.ArrayList;import java.util.Arrays;import java.util.Comparator;import java.util.Set;import fr.univartois.cril.alloyplugin.launch.Activator;import org.eclipse.core.resources.IFile;import org.eclipse.core.resources.IFolder;import org.eclipse.core.runtime.CoreException;import org.eclipse.core.runtime.FileLocator;import org.eclipse.core.runtime.IProgressMonitor;import org.eclipse.jface.resource.ImageRegistry;import org.eclipse.swt.graphics.Image;import org.eclipse.swt.widgets.Display;import org.eclipse.ui.IWorkbenchPage;import org.eclipse.ui.IWorkbenchWindow;import org.eclipse.ui.PlatformUI;import edu.mit.csail.sdg.alloy4.ConstSet;import edu.mit.csail.sdg.alloy4.Err;import edu.mit.csail.sdg.alloy4.Pair;import edu.mit.csail.sdg.alloy4.Pos;import edu.mit.csail.sdg.alloy4.WorkerEngine;import edu.mit.csail.sdg.alloy4.XMLNode;import edu.mit.csail.sdg.alloy4.WorkerEngine.WorkerCallback;import edu.mit.csail.sdg.alloy4compiler.ast.Command;import edu.mit.csail.sdg.alloy4compiler.ast.Sig;import edu.mit.csail.sdg.alloy4compiler.parser.Module;import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;import edu.mit.csail.sdg.alloy4compiler.translator.A4SolutionReader;import fr.univartois.cril.alloyplugin.AlloyPlugin;import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;import fr.univartois.cril.alloyplugin.api.IALSCommand;import fr.univartois.cril.alloyplugin.api.IALSFile;import fr.univartois.cril.alloyplugin.api.IReporter;import fr.univartois.cril.alloyplugin.api.NodeWithChildren;import fr.univartois.cril.alloyplugin.api.Util;import fr.univartois.cril.alloyplugin.preferences.PreferenceConstants;import fr.univartois.cril.alloyplugin.views.VizView;/** * An Alloy command with its world and its resources. Can be executed. */public class ExecutableCommand extends AbstractCommand implements		NodeWithChildren {	/**	 * The command itself.	 */	protected final Command command;	protected final int commandNumber;	protected boolean answer;	protected boolean completed;	/**	 * Constructor.	 */	public ExecutableCommand(IALSFile file2, Command command,			int commandNumber, Module world) {		super(file2, world);		assert (file2 != null);		assert (command != null);		assert (world != null);		this.command = command;		this.commandNumber = commandNumber;	}	/**	 * return the command.	 */	public Command getCommand() {		return command;	}	/**	 * Execute this command with the given reporter.	 */	public Pair<A4Solution, Boolean> execute(final IReporter rep,			IProgressMonitor monitor) throws Err {		rep.setExecCommand(this);		completed = false;		IFile outputFile = getOutputFileName();		String outputfilename = Util.getFileLocation(outputFile);		MyTask task = new MyTask(getFilename(), outputfilename, commandNumber,				getOptions()); // We should have first		// parsed the model to		// confirm there really is a		// command number 0.		WorkerCallback cb = new WorkerCallback() {			public void callback(Object msg) {				String message = msg.toString();				String[] values = message.split(":");				if (message.startsWith("Translating")) {					rep.translate(values[1], Integer.valueOf(values[2]),							Integer.valueOf(values[3]), Integer									.valueOf(values[4]), Integer									.valueOf(values[5]));				} else if (message.startsWith("Solving")) {					rep.solve(Integer.valueOf(values[1]), Integer							.valueOf(values[2]), Integer.valueOf(values[3]));				} else if (message.startsWith("Satisfiable")) {					answer = true;					rep.resultSAT(Integer.valueOf(values[1]), Boolean							.valueOf(values[2]), Long.valueOf(values[3]));				} else if ("Unsatisfiable!".equals(msg)) {					answer = false;					rep.resultUNSAT(Integer.valueOf(values[1]), Boolean							.valueOf(values[2]), Long.valueOf(values[3]));				} else if (msg instanceof Exception) {					((Exception) msg).printStackTrace();				} else {					System.out.println(message);					System.out.flush();				}			}			public void done() {				completed = true;			}			public void fail() {				System.err.println("Fatal error DLB.");			}		};		try {						StringBuffer classPath = new StringBuffer();			classPath.append(FileLocator.toFileURL(					Activator.getDefault().getBundleContext().getBundle()							.getEntry("/alloy4.jar")).getFile());			classPath.append(System.getProperty("path.separator"));			classPath.append(FileLocator.toFileURL(							AlloyPlugin.getDefault().getBundleContext()									.getBundle().getEntry("/")).getFile());			classPath.append(System.getProperty("path.separator"));			classPath.append(FileLocator.toFileURL(							AlloyPlugin.getDefault().getBundleContext()									.getBundle().getEntry("/bin")).getFile());			WorkerEngine.run(task, 1024, 65536, "", classPath.toString(), cb);			// WorkerEngine.runLocally(task,cb);			while (WorkerEngine.isBusy()) {				if (monitor.isCanceled()) {					WorkerEngine.stop();				}			}		} catch (IOException e) {			System.out.println(e);		} catch (Exception e) {			// TODO Auto-generated catch block			e.printStackTrace();		}		if (completed) {			try {				ans = A4SolutionReader.read(new ArrayList<Sig>(), new XMLNode(						new File(outputfilename)));			} catch (IOException e) {				e.printStackTrace();			}		}		file.fireChange();		// if preference "show answer after execution" is enable, display answer		// in a Graphic thread:		if (AlloyPlugin.getDefault().getPreferenceStore().getBoolean(				PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER)) {			displayAnsSafe();		}		return new Pair<A4Solution, Boolean>(ans, Boolean.TRUE);	}	public Pair<A4Solution, Boolean> getAns() {		return new Pair<A4Solution, Boolean>(ans, Boolean.TRUE);	}	public Image getIcon() {		// return command.check ?iconcheck:iconrun;		ImageRegistry reg = ALSImageRegistry.getImageRegistry();		if (getResult() == ExecutableCommand.SAT) {			if (isCheck()) {				if (isExpect())// expected sat check command					return reg.get(ALSImageRegistry.BLUE_CHECK_ID);				// not expected				// sat check				// command				return reg.get(ALSImageRegistry.RED_CHECK_ID);			}			// Sat Run command			return reg.get(ALSImageRegistry.GREEN_RUN_ID);		}		if (getResult() == ExecutableCommand.UNSAT) {			if (isCheck())				return reg.get(ALSImageRegistry.GREEN_CHECK_ID);// OK			if (getCommand().expects == 0)				return reg.get(ALSImageRegistry.BLUE_RUN_ID);			return reg.get(ALSImageRegistry.RED_RUN_ID);		}		if (isCheck())			return reg.get(ALSImageRegistry.CHECK_ID);		return reg.get(ALSImageRegistry.RUN_ID);	}	public int getBeginLine() {		return command.pos.y;	}	public int getEndLine() {		return command.pos.y2;	}	public String getName() {		return command.toString();	}	public String toString() {		if (this.getResult() == IALSCommand.UNKNOW)			return command.toString();		if (this.getResult() != IALSCommand.SAT)			return command.toString() + " [UNSAT]";		return command.toString() + " [SAT]";	}	/**	 * Display answer.	 */	private void displayAns() throws Err {		if (completed && answer) {			IFile outputFile = getOutputFileName();			IWorkbenchWindow window = PlatformUI.getWorkbench()					.getActiveWorkbenchWindow();			IWorkbenchPage page = window.getActivePage();			String titlename = getName() + ", "					+ AlloyLaunching.getResourcePartName(getResource());			this.viewPart[0] = VizView.showAlloyVisualizationView(this, page,					outputFile, titlename);		}	}	private IFile getOutputFileName() {		IFolder outputFolder = getAnswerFolder("output");		if (outputFolder == null)			return null;		IFile outputFile = outputFolder.getFile(getName() + ".xml");		if (!outputFile.exists()) {			try {				outputFile.create(null/* new byte[0] */, false, null);			} catch (CoreException e) {				AlloyPlugin.getDefault().log(e);			}		}		return outputFile;	}	// @author lionel desruelles	public void closeOldView() {		IFolder outputFolder = getAnswerFolder("output");		if (outputFolder == null)			return;		IFile outputFile = outputFolder.getFile(getName() + ".xml");		if (!outputFile.exists()) {			return;		} else {			IWorkbenchWindow window = PlatformUI.getWorkbench()					.getActiveWorkbenchWindow();			IWorkbenchPage page = window.getActivePage();			String titlename = getName() + ", "					+ AlloyLaunching.getResourcePartName(getResource());			this.viewPart[0] = VizView.showAlloyVisualizationView(this, page,					outputFile, titlename);			closeYourView();		}	}	/*	 * (non-Javadoc)	 * 	 * @see fr.univartois.cril.alloyplugin.api.IALSCommand#displayAnsSafe()	 */	public void displayAnsSafe() {		Display display = PlatformUI.getWorkbench().getDisplay();		if (display != null) {			display.asyncExec(new Runnable() {				public void run() {					try {						ExecutableCommand.this.displayAns();					} catch (Err e) {						AlloyPlugin.getDefault().log(e);					}				}			});		}	}	public boolean isCheck() {		return command.check;	}	public boolean isExpect() {		return (command.expects >= 1);	}	/*	 * (non-Javadoc)	 * 	 * @see fr.univartois.cril.alloyplugin.core.INextable#showNextA4Solution()	 */	// @author druelle romuald	public void showNextA4Solution() {		try {			ans = ans.next();		} catch (Err e) {			// TODO Auto-generated catch block			e.printStackTrace();		}		file.fireChange();		// if preference "show answer after execution" is enable, display answer		// in a Graphic thread:		if (AlloyPlugin.getDefault().getPreferenceStore().getBoolean(				PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER)) {			displayAnsSafe();		}	}	public A4Solution accessAns() {		return ans;	}	public boolean shouldShowUnsatCore() {		return getResult() == ExecutableCommand.UNSAT;	}	public Set<Pos> getCore() {		if (null == ans) {			return ConstSet.make();		} else {			return ans.lowLevelCore();		}	}	public Object[] children() {		Set<Pos> poses = getCore();		UnsatCorePos[] children = new UnsatCorePos[poses.size()];		int i = 0;		for (Pos pos : poses) {			children[i++] = new UnsatCorePos(pos);		}		Arrays.sort(children, new Comparator<UnsatCorePos>() {			public int compare(UnsatCorePos o1, UnsatCorePos o2) {				return o1.getBeginLine() - o2.getBeginLine();			}		});		return children;	}	public boolean hasChildren() {		return shouldShowUnsatCore() && !getCore().isEmpty();	}	// @author lionel desruelles	public void closeOldVizView() {		Display display = PlatformUI.getWorkbench().getDisplay();		if (display != null) {			display.asyncExec(new Runnable() {				public void run() {					ExecutableCommand.this.closeOldView();				}			});		}	}}