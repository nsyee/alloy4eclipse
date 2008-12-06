package fr.univartois.cril.alloyplugin.core;

import java.io.Serializable;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import edu.mit.csail.sdg.alloy4compiler.parser.Module;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options.SatSolver;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.alloyplugin.api.IALSCommand;
import fr.univartois.cril.alloyplugin.api.IALSFile;
import fr.univartois.cril.alloyplugin.preferences.PreferenceConstants;

public abstract class AbstractCommand implements IALSCommand, INextable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final Image iconrun = ALSImageRegistry
			.getImage(ALSImageRegistry.RUN_ICON_ID);
	public static final Image iconcheck = ALSImageRegistry
			.getImage(ALSImageRegistry.CHECK_ICON_ID);
	/**
	 * The Command's world .
	 */
	protected final Module world;
	/**
	 * The ALS file which has provided the command.
	 */
	protected final IALSFile file;
	/**
	 * result can be executable.SAT executable.UNSAT or executable.UNKNOWN.
	 */
	protected int result;
	/**
	 * 
	 * 
	 * 
	 */
	protected String stringResult;
	protected A4Solution ans;
	protected IViewPart[] viewPart = new IViewPart[1];

	public AbstractCommand(IALSFile file, Module world) {
		this.file = file;
		this.world = world;
		this.result = IALSCommand.UNKNOW;
		this.viewPart[0] = null;
	}

	/**
	 * Get the option.
	 */
	public A4Options getOptions() {
		A4Options options = new A4Options();
		SatSolver solver;// =A4Options.SatSolver.SAT4J;
		String defaultSolver = AlloyPlugin.getDefault().getPreferenceStore()
				.getString(PreferenceConstants.P_SOLVER_CHOICE);
		if (PreferenceConstants.V_SOLVER_BERKMIN.equals(defaultSolver)) {
			solver = A4Options.SatSolver.BerkMinPIPE;
		} else if (PreferenceConstants.V_SOLVER_ZChaffJNI.equals(defaultSolver)) {
			solver = A4Options.SatSolver.ZChaffJNI;
		} else if (PreferenceConstants.V_SOLVER_MiniSatProverJNI
				.equals(defaultSolver)) {
			solver = A4Options.SatSolver.MiniSatProverJNI;
		} else if (PreferenceConstants.V_SOLVER_MiniSatProverUnsatCore
				.equals(defaultSolver)) {
			solver = A4Options.SatSolver.MiniSatProverJNI;
		} else {
			solver = A4Options.SatSolver.SAT4J;
		}

		// solver = A4Options.SatSolver.MiniSatProverJNI;

		options.solver = solver;
		options.solverDirectory = AlloyPlugin.getDefault().getPreferenceStore()
				.getString(PreferenceConstants.P_SOLVERS_PATH);
		options.originalFilename = getFilename();
		return options;
	}

	/**
	 * Get the resource which this command is from.
	 */
	public IResource getResource() {
		return file.getResource();
	}

	/**
	 * Get the location of the file where this command is located.
	 */
	public String getFilename() {
		return file.getFilename();
	}

	public IViewPart getViewPart() {
		return viewPart[0];
	}

	/**
	 * return the world.
	 */
	public Module getWorld() {
		return world;
	}

	/**
	 * Return the result.
	 */

	protected int getResult() {
		return result;
	}

	/**
	 * Get the string result of this command.
	 */

	public String getStringResult() {
		return stringResult;
	}

	/**
	 * Get answer folder.
	 */

	protected IFolder getAnswerFolder(String folderName) {
		IFolder outputFolder = getResource().getParent().getFolder(
				new Path(folderName));
		if (!outputFolder.exists()) {
			try {
				outputFolder.create(false, true, null);
			} catch (CoreException e) {
				AlloyPlugin.getDefault().log(e);
				return null;
			}
		}

		return outputFolder;
	}

	/**
	 * Set this command sat.
	 */

	public void setSat(boolean sat) {
		if (sat)
			result = IALSCommand.SAT;
		else
			result = IALSCommand.UNSAT;
		file.fireChange();
	}

	/**
	 * Set the string result for this command.
	 */

	public void setStringResult(String s) {
		stringResult = s;
	}

	public boolean isPrivate() {
		return false;
	}

	public void closeYourView() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench != null) {
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			if (window != null) {
				IWorkbenchPage page = window.getActivePage();
				if (page != null) {
					page.hideView(getViewPart());
				}
			}
		}
	}

}
