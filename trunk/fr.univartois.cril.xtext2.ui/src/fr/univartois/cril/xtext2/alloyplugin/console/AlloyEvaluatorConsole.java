package fr.univartois.cril.xtext2.alloyplugin.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.Version;
import edu.mit.csail.sdg.alloy4compiler.ast.Expr;
import edu.mit.csail.sdg.alloy4compiler.ast.ExprVar;
import edu.mit.csail.sdg.alloy4compiler.parser.CompModule;
import edu.mit.csail.sdg.alloy4compiler.parser.CompUtil;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;

/**
 * 
 * @author lionel desruelles
 * @author romuald druelle
 */

public class AlloyEvaluatorConsole extends IOConsole {

	// private BufferedReader reader;

	protected IOConsoleOutputStream outputStream = null;
	protected IOConsoleInputStream inputStream = null;
	private Job readKeyBoardJob;

	public AlloyEvaluatorConsole(String name) {
		super(name, null);
	}

	public void showHeader() {
		printInfo("[Alloy " + Version.version() + " build number "
				+ Version.buildNumber() + " on " + Version.buildDate()
				+ " Evaluator Console]\n\n");
		print("The ");
		printInfo("Alloy Evaluator ");
		print("allows you to type\nin Alloy expressions and see their values.\nFor example, ");
		printInfo("univ ");
		print("shows the list of all atoms.\n");
		print("Type ");
		printInfo("quit ");
		print("to exit the evaluator.\n");
	}

	/*
	 * protected void printMessage(String message) { try { outputStream =
	 * newOutputStream(); outputStream.write(message); outputStream.close(); }
	 * catch (IOException e) { e.printStackTrace(); } }
	 */

	/*
	 * public void print(final String message) { Display display =
	 * PlatformUI.getWorkbench().getDisplay(); if (display != null)
	 * display.asyncExec(new Runnable() { public void run() {
	 * printMessage(message); } }); }
	 */

	public void showPrompt() {
		print("\n> ");
	}

	public void print(final String message) {
		print(message, new Color(null, 0, 0, 0), SWT.DEFAULT);
	}

	public void printEval(final String message) {
		print(message, new Color(null, 0, 0, 255), SWT.DEFAULT);
	}

	public void printInfo(String message) {
		print(message, new Color(null, 0, 0, 0), SWT.BOLD);
	}

	public void printErr(String message) {
		print(message, new Color(null, 255, 0, 0), SWT.DEFAULT);
	}

	/**
	 * Print message in the console.
	 */
	protected void print(final String message, final Color c, final int style) {
		Display display = PlatformUI.getWorkbench().getDisplay();
		if (display != null)
			display.asyncExec(new Runnable() {
				public void run() {
					printMessage(message, c, style);
				}
			});

	}

	protected void printMessage(String message, Color c, int style) {
		outputStream = newOutputStream();
		outputStream.setColor(c);
		outputStream.setFontStyle(style);
		try {
			outputStream.write(message);
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readConsole(final CompModule world, final A4Solution ans) {
		final BufferedReader stream;
		inputStream = getInputStream();
		stream = new BufferedReader(new InputStreamReader(inputStream));
		// preparing world to evaluate correctly the expressions
		for (ExprVar a : ans.getAllAtoms())
			world.addGlobal(a.label, a);
		for (ExprVar a : ans.getAllSkolems())
			world.addGlobal(a.label, a);
		if (readKeyBoardJob != null) {
			readKeyBoardJob.cancel();
		}
		readKeyBoardJob = new Job("Alloy 4 Evaluator") {
			public IStatus run(IProgressMonitor pm) {
				try {

					String currentInputLine;
					showPrompt();
					while (!pm.isCanceled()
							&& ((currentInputLine = stream.readLine()) != null)
							&& !("quit".compareToIgnoreCase(currentInputLine) == 0)) {
						try {
							Expr ex = CompUtil.parseOneExpression_fromString(
									world, currentInputLine);
							Object o = ans.eval(ex);
							printEval(o.toString());
							showPrompt();
						} catch (Err e) {
							printErr(e.toString());
							showPrompt();
						}
					}
					Console.removeConsole(AlloyEvaluatorConsole.this);
				} catch (IOException e) {
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		readKeyBoardJob.schedule();

	}

	/**
	 * Clear console content.
	 */
	public void clear() {
		Display display = PlatformUI.getWorkbench().getDisplay();

		if (display != null)

			display.syncExec(new Runnable() {
				public void run() {
					AlloyEvaluatorConsole.this.getDocument().set("");
				}
			});

	}

}