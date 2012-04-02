package fr.univartois.cril.xtext2.alloyplugin.core;

import java.io.File;

import org.eclipse.core.resources.IContainer;
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

import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options.SatSolver;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import fr.univartois.cril.xtext2.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext2.preferences.PreferenceConstants;
import fr.univartois.cril.xtext2.ui.activator.AlsActivator;

public abstract class AbstractCommand implements IALSCommand, INextable {

	public static final Image iconrun = ALSImageRegistry
			.getImage(ALSImageRegistry.RUN_ICON_ID);
	public static final Image iconcheck = ALSImageRegistry
			.getImage(ALSImageRegistry.CHECK_ICON_ID);
	/**
	 * The Command's world .
	 */
	protected final CompModule world;
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

	public AbstractCommand(IALSFile file, CompModule world) {
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
		String defaultSolver = AlsActivator.getDefault().getPreferenceStore()
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
		options.solverDirectory = AlsActivator.getDefault()
				.getPreferenceStore()
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
	public CompModule getWorld() {
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

		IContainer tmp = getResource().getParent();

		while (tmp != null
				&& !tmp.getFullPath().toOSString()
						.equals(File.separator + getResource().getFullPath().segment(0))) {
			tmp = tmp.getParent();

		}
		IFolder outputFolder = tmp.getFolder(new Path(folderName));

		if (!outputFolder.exists()) {

			try {
				outputFolder.create(false, true, null);
			} catch (CoreException e) {

				AlsActivator.getDefault().log(e);

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
