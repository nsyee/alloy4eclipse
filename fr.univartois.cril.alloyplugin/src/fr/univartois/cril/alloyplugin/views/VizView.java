package fr.univartois.cril.alloyplugin.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;
import org.xml.sax.InputSource;

import edu.mit.csail.sdg.alloy4.Computer;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4graph.VizViewer;
import edu.mit.csail.sdg.alloy4viz.AlloyInstance;
import edu.mit.csail.sdg.alloy4viz.StaticGraphMaker;
import edu.mit.csail.sdg.alloy4viz.StaticInstanceReader;
import edu.mit.csail.sdg.alloy4viz.StaticThemeReaderWriter;
import edu.mit.csail.sdg.alloy4viz.VizGUI;
import edu.mit.csail.sdg.alloy4viz.VizState;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.alloyplugin.api.ICommandListener;
import fr.univartois.cril.alloyplugin.api.Util;
import fr.univartois.cril.alloyplugin.console.AlloyEvaluatorConsole;
import fr.univartois.cril.alloyplugin.console.Console;
import fr.univartois.cril.alloyplugin.core.INextable;
import fr.univartois.cril.alloyplugin.editor.ALSEditor;
import fr.univartois.cril.alloyplugin.preferences.AlloyPreferencePage;

public class VizView extends ViewPart implements ICommandListener {

	private VizGUI[] viz = new VizGUI[1];
	private Action editorAction1;
	private IAction saveAsTheme;

	/* Action linked to the button next */
	private IAction editorAction6;

	private IAction editorAction7;

	private IAction editorAction5;
	private IAction editorAction4;
	private IAction editorAction3;
	private IAction editorAction2;

	private String filename;
	private String titlename;
	private IMemento memento;

	/*
	 * ExecutableCommand which will allow access to the object A4Solution who is
	 * in ExecutableCommand
	 */
	public INextable execCmd;
	
	private A4Solution ans;
	
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter == VizView.class)
			return this;
		if (adapter == VizGUI.class)
			return viz[0];
		if (adapter == VizViewer.class) {
			return viz[0] == null ? null : viz[0].getViewer();
		}
		if (adapter == VizState.class) {
			return viz[0] == null ? null : viz[0].getVizState();
		}
		return super.getAdapter(adapter);
	}

	@Override
	public void createPartControl(Composite arg0) {
		swingintegration.example.Platform
				.createComposite(
						arg0,
						this.getSite().getShell().getDisplay(),
						new swingintegration.example.SwingComponentConstructor() {
							public JComponent createSwingComponent() {
								/*
								 * The VizGUI constructor has several formal
								 * parameters. For clarity purposes, we use the
								 * formal parameter names to distinguish the
								 * role of each actual parameter since the
								 * values are indistinguishable
								 */
								boolean standalone = false;
								String xmlFileName = "";
								JMenu windowmenu = null;
								Computer enumerator = null;
								Computer evaluator = null;
								boolean makeWindow = false;

								viz[0] = new VizGUI(standalone, xmlFileName,
										windowmenu, enumerator, evaluator,
										makeWindow);

								return viz[0].getPanel();
							}
						});
		restoreState();
		if (filename != null) {
			fillWithVizPanel(filename, titlename,
					lookForDefaultThemeFile(filename));
		}
		createActions();
		contributeToMenu(getA4EMenu());
		contributeToToolBar(getToolBarManager());
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public void onXmlSolutionFileCreation(String filename) {
		onXmlSolutionFileCreation(filename, filename);
	}

	public void onXmlSolutionFileCreation(String filename, String titlename) {
		onXmlSolutionFileCreation(filename, titlename,
				lookForDefaultThemeFile(filename));
	}

	public void onXmlSolutionFileCreation(String filename,
			URL alloyVisualizationTheme) {
		onXmlSolutionFileCreation(filename, filename, alloyVisualizationTheme);
	}

	public void onXmlSolutionFileCreation(String filename, String titlename,
			URL alloyVisualizationTheme) {
		this.filename = filename;
		this.titlename = titlename;
		fillWithVizPanel(filename, titlename, alloyVisualizationTheme);
	}

	private void fillWithVizPanel(String filename, String name,
			URL alloyVisualizationTheme) {
		setPartName(name);
		viz[0].loadXML(filename, true);

		if (alloyVisualizationTheme != null) {
			viz[0].loadThemeFile(alloyVisualizationTheme.getFile());
		}
		/**
		 * A simple A4E menu action that we add to the A4 VizViewer popup menu.
		 */
		final JMenuItem a4eInfo = new JMenuItem("A4E info...");
		final VizViewer viewer = viz[0].getViewer();
		viewer.pop.add(a4eInfo);
		ActionListener act = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* hop from AWT over to SWT ... */
				final Object highlighted = viewer
						.alloyGetHighlightedAnnotation();
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						AlloyPlugin.getDefault().logInfo(
								"selection: " + highlighted);
					}
				});
			}
		};
		a4eInfo.addActionListener(act);
	}

	private void createActions() {
		editorAction1 = new Action() {
			public void run() {
				try {
					FileDialog dialog = new FileDialog(VizView.this
							.getViewSite().getShell());
					dialog.setFilterExtensions(new String[] { "*.thm" });
					dialog.setText("Select a visualization theme");
					String result = dialog.open();
					if (result != null) {
						final IPath path = new Path(result);
						fillWithVizPanel(filename, titlename, path.toFile()
								.toURI().toURL());
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
		editorAction1.setText("Apply Visualization Theme");
		editorAction1.setToolTipText("Alloy4Eclipse Visualization Theme");
		editorAction1.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.THEME_IMPORT_ICON_ID));

		editorAction2 = new Action() {
			public void run() {
				try {
					Shell shell = VizView.this.getViewSite().getShell();
					FileDialog fdialog = new FileDialog(shell);
					fdialog.setFilterExtensions(new String[] { "*.thm" });
					fdialog.setText("Select a visualization theme");
					String result = fdialog.open();
					if (result != null) {
						final IPath path = new Path(result);
						InputDialog ndialog = new InputDialog(shell,
								"New Alloy4 visualization page name:",
								"Enter a string", null, null);
						ndialog.open();

						showAlloyVisualizationView(execCmd, VizView.this
								.getSite().getPage(), path, ndialog.getValue());
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
		editorAction2.setText("Add Another Visualization Page");
		editorAction2.setToolTipText("New Alloy4Eclipse Visualization Page");
		editorAction2.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.THEME_IMPORT_ADD_ICON_ID));

		editorAction3 = new Action() {
			public void run() {
				try {
					Shell shell = VizView.this.getViewSite().getShell();
					FileDialog fdialog = new FileDialog(shell);
					fdialog.setFilterExtensions(new String[] { "*.thm" });
					fdialog.setText("Select a visualization theme");
					String result = fdialog.open();

					VizGUI viz = new VizGUI(false, "", null);
					viz.loadXML(filename, true);
					if (result != null) {
						final IPath path = new Path(result);
						try {
							final URL themeUrl = FileLocator.toFileURL(path
									.toFile().toURI().toURL());
							viz.loadThemeFile(themeUrl.getFile());
						} catch (MalformedURLException e) {
							AlloyPlugin.getDefault().log(e);
						} catch (IOException e) {
							AlloyPlugin.getDefault().log(e);
						}
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};

		editorAction3.setText("Open with Alloy4 Visualizer");
		editorAction3
				.setToolTipText("Open an Alloy4 visualizer on this instance");
		editorAction3.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.LAUNCH_A4_ICON_ID));

		/**
		 * Adapted from a suggestion by Felix Chang.
		 * 
		 * @link http://groups.yahoo.com/group/alloy-discuss/message/1122
		 * @author Nicolas.Rouquette@jpl.nasa.gov
		 */
		editorAction4 = new Action() {
			public void run() {
				try {
					saveCurrentVisualizationAsDOTFile();
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
		editorAction4.setText("Save Alloy4 visualization DOT file");
		editorAction4
				.setToolTipText("Save the current Alloy4 instance visualization as a DOT file");
		editorAction4.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.THEME_EXPORT_DOT_ICON_ID));

		editorAction5 = new Action() {
			public void run() {
				try {
					saveCurrentVisualizationAsImageFile();
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}
		};
		editorAction5.setText("Save Alloy4 visualization converted image file");
		editorAction5
				.setToolTipText("Save the current Alloy4 instance visualization as a dot-converted image file");
		editorAction5.setImageDescriptor(PlatformUI.getWorkbench()
				.getSharedImages().getImageDescriptor(
						IDE.SharedImages.IMG_OBJS_TASK_TSK));

		/* Button next */
		/*
		 * @author romuald druelle
		 */
		editorAction6 = new Action() {
			public void run() {
				execCmd.showNextA4Solution();
			}
		};

		editorAction6.setText("Show the next solution");
		editorAction6.setToolTipText("Show the next solution");
		editorAction6.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.NEXT_A4SOLUTION_ICON_ID));

		/* Button evaluator */
		/*
		 * @author lionel desruelles
		 * @author romuald druelle
		 */
		editorAction7 = new Action() {
			public void run() {
				AlloyEvaluatorConsole evaluator = Console.findAlloyEvaluatorConsole(filename);
				evaluator.activate();
				evaluator.clear();
				evaluator.showHeader();
				ans=execCmd.accessAns();
				evaluator.readConsole(execCmd.getWorld(),ans);
			}
		};
		editorAction7.setText("Open the Alloy evaluator");
		editorAction7.setToolTipText("Open the Alloy evaluator");
		editorAction7.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.EVALUATOR_ICON_ID));

		saveAsTheme = new Action() {
			public void run() {
				try {
					FileDialog dialog = new FileDialog(VizView.this
							.getViewSite().getShell(), SWT.SAVE);
					dialog.setFilterExtensions(new String[] { "*.thm" });
					dialog
							.setText("Where do you want to save your theme file?");
					String result = dialog.open();
					if (result != null) {
						IPath path = new Path(result);
						final String extension = path.getFileExtension();
						if (extension == null) {
							path = path.addFileExtension("thm");
						} else {
							if (!"thm".equals(extension)) {
								path = path.removeFileExtension()
										.addFileExtension("thm");
							}
						}
						doSaveAsTheme(path);
					}
				} catch (Exception e) {
					AlloyPlugin.getDefault().log(e);
				}
			}

		};
		saveAsTheme.setText("Save theme in a new file");
		saveAsTheme
				.setToolTipText("Save the current theme settings in a new file");
		saveAsTheme.setImageDescriptor(ALSImageRegistry
				.getImageDescriptor(ALSImageRegistry.THEME_EXPORT_ICON_ID));
	}

	public static String A4E_MENU_ID = ALSEditor.class.getPackage().getName()
			+ ".a4e.menu"; //$NON-NLS-1$

	public IToolBarManager getToolBarManager() {
		IActionBars actionBar = getViewSite().getActionBars();
		if (null == actionBar)
			return null;

		return actionBar.getToolBarManager();
	}

	public IMenuManager getA4EMenu() {
		return getViewSite().getActionBars().getMenuManager();
	}

	public void contributeToMenu(IMenuManager manager) {
		manager.add(editorAction1);
		manager.add(editorAction2);
		manager.add(editorAction3);
		manager.add(editorAction4);
		manager.add(editorAction5);
		manager.add(editorAction6);
		manager.add(editorAction7);
		manager.add(saveAsTheme);
	}

	public void contributeToToolBar(IToolBarManager manager) {
		manager.add(editorAction1);
		manager.add(editorAction2);
		manager.add(editorAction3);
		manager.add(editorAction4);
		manager.add(editorAction5);
		manager.add(editorAction6);
		manager.add(editorAction7);
		manager.add(saveAsTheme);
	}

	/**
	 * Look for a default theme file. For the moment, the theme file must be the
	 * same as the als file launching the command.
	 * 
	 * @author leberre@cril.univ-artois.fr
	 */
	private static URL lookForDefaultThemeFile(String aFilename) {
		try {
			XPathFactory fabrique = XPathFactory.newInstance();
			XPath environnement = fabrique.newXPath();
			URL url = new URL("file:" + aFilename);
			InputSource source = new InputSource(url.openStream());

			XPathExpression expression;
			expression = environnement.compile("/alloy/instance/@filename");
			String resultat = expression.evaluate(source);
			AlloyPlugin.getDefault()
					.logInfo("Solution coming from " + resultat);
			IPath path = new Path(resultat);
			IPath themePath = path.removeFileExtension()
					.addFileExtension("thm");
			File themeFile = themePath.toFile();
			if (themeFile.exists()) {
				AlloyPlugin.getDefault().logInfo(
						"Found default theme " + themeFile);
				return themeFile.toURI().toURL();
			}
		} catch (MalformedURLException e) {
			AlloyPlugin.getDefault().log(e);
		} catch (IOException e) {
			AlloyPlugin.getDefault().log(e);
		} catch (XPathExpressionException e) {
			AlloyPlugin.getDefault().log(e);
		}
		return null;
	}

	public static final String VIZ_VIEW_ID = "fr.univartois.cril.alloyplugin.views.vizview";

	public static IViewPart createView(final INextable execCmd,
			final IWorkbenchPage page, final IPath filepath,
			final String secondaryId) {

		try {
			Util.refreshProjectManager(filepath);
		} catch (CoreException e) {
			AlloyPlugin.getDefault().log(e);
		}

		try {
			IViewPart vizView = page.showView(VIZ_VIEW_ID, secondaryId,
					IWorkbenchPage.VIEW_ACTIVATE);
			((VizView) vizView).setCommand(execCmd);
			return vizView;

		} catch (CoreException e) {
			AlloyPlugin.getDefault().log(e);
		}
		return null;
	}

	private void setCommand(INextable execCmd2) {
		this.execCmd = execCmd2;
	}

	public static IViewPart createView(final INextable execCmd,
			final IWorkbenchPage page, final IPath filepath) {
		String secondaryId = filepath.toString().replace(' ', '_').replace(':',
				'_');
		return createView(execCmd, page, filepath, secondaryId);
	}

	public static IViewPart createView(final INextable execCmd,
			final IWorkbenchPage page, final IFile outputFile,
			final String secondaryId) {
		return createView(execCmd, page, outputFile.getFullPath(), secondaryId);
	}

	public static IViewPart createView(final INextable execCmd,
			final IWorkbenchPage page, final IFile outputFile) {
		String secondaryId = outputFile.toString().replace(' ', '_').replace(
				':', '_');
		return createView(execCmd, page, outputFile, secondaryId);
	}

	public static IViewPart showAlloyVisualizationView(final INextable execCmd,
			final IWorkbenchPage page, final IPath filepath,
			final String titleName, final String secondaryId) {
		IViewPart vizView = createView(execCmd, page, filepath, secondaryId);
		ICommandListener commandListener = (ICommandListener) vizView;
		commandListener.onXmlSolutionFileCreation(filepath.toOSString(),
				titleName);
		return vizView;
	}

	public static IViewPart showAlloyVisualizationView(final INextable execCmd,
			final IWorkbenchPage page, final IPath filepath,
			final String titleName) {
		String secondaryId = filepath.toString().replace(' ', '_').replace(':',
				'_');
		return showAlloyVisualizationView(execCmd, page, filepath, titleName,
				secondaryId);
	}

	public static IViewPart showAlloyVisualizationView(final INextable execCmd,
			final IWorkbenchPage page, final IFile outputFile,
			final String titleName, final String secondaryId) {
		return showAlloyVisualizationView(execCmd, page, outputFile
				.getLocation(), titleName, secondaryId);
	}

	public static IViewPart showAlloyVisualizationView(final INextable execCmd,
			final IWorkbenchPage page, final IFile outputFile,
			final String titleName) {
		String secondaryId = outputFile.toString().replace(' ', '_').replace(
				':', '_');
		return showAlloyVisualizationView(execCmd, page, outputFile, titleName,
				secondaryId);
	}

	public static IViewPart showAlloyVisualizationView(final INextable execCmd,
			final IWorkbenchPage page, final IPath filepath,
			final String titleName, final String secondaryId,
			final URL alloyVisualizationTheme) {
		IViewPart vizView = createView(execCmd, page, filepath, secondaryId);
		ICommandListener commandListener = (ICommandListener) vizView;
		commandListener.onXmlSolutionFileCreation(filepath.toOSString(),
				titleName, alloyVisualizationTheme);
		return vizView;
	}

	public static IViewPart showAlloyVisualizationView(final INextable execCmd,
			final IWorkbenchPage page, final IPath filepath,
			final String titleName, final URL alloyVisualizationTheme) {
		String secondaryId = filepath.toString().replace(' ', '_').replace(':',
				'_');
		return showAlloyVisualizationView(execCmd, page, filepath, titleName,
				secondaryId, alloyVisualizationTheme);
	}

	public static IViewPart showAlloyVisualizationView(final INextable execCmd,
			final IWorkbenchPage page, final IFile outputFile,
			final String titleName, final String secondaryId,
			final URL alloyVisualizationTheme) {
		return showAlloyVisualizationView(execCmd, page, outputFile
				.getLocation(), titleName, secondaryId, alloyVisualizationTheme);
	}

	public static IViewPart showAlloyVisualizationView(final INextable execCmd,
			final IWorkbenchPage page, final IFile outputFile,
			final String titleName, final URL alloyVisualizationTheme) {
		return showAlloyVisualizationView(execCmd, page, outputFile
				.getLocation(), titleName, alloyVisualizationTheme);
	}

	public void doSaveAsTheme(IPath path) throws CoreException {
		viz[0].saveThemeFile(path.toString());
		refreshProjectManager(path);

	}

	private boolean refreshProjectManager(IPath path) throws CoreException {
		IWorkspaceRoot wksroot = ResourcesPlugin.getWorkspace().getRoot();
		IResource dotResource = wksroot.getContainerForLocation(path);
		if (null != dotResource && dotResource.getProject().isAccessible()) {
			IContainer dotFolder = dotResource.getParent();
			dotFolder.refreshLocal(IResource.DEPTH_ONE, null);
			return true;
		}
		return false;

	}

	public IPath saveCurrentVisualizationAsImageFile() throws IOException,
			CoreException, Err {
		IPath dotFile = produceDotFile(viz[0]);

		IWorkspaceRoot wksroot = ResourcesPlugin.getWorkspace().getRoot();
		IResource dotResource = wksroot.getContainerForLocation(dotFile);
		if (null != dotResource && dotResource.getProject().isAccessible()) {
			IContainer dotFolder = dotResource.getParent();
			dotFolder.refreshLocal(IResource.DEPTH_ONE, null);
			AlloyPlugin.getDefault()
					.logInfo(
							"DOT workspace file saved as: "
									+ dotResource.getFullPath());
		} else {
			AlloyPlugin.getDefault().logInfo(
					"DOT external file saved as: " + dotFile);
		}

		String conversion = AlloyPreferencePage
				.getShowDOTConversionMessagesPreference();
		IPath imageFile = dotConvert(dotFile, conversion);
		if (null != imageFile) {
			AlloyPlugin.getDefault().logInfo(
					"DOT 2 " + conversion + " succeeded.");
		}

		return dotFile;
	}

	private IPath produceDotFile(VizGUI viz) throws IOException, Err {
		AlloyInstance instance = StaticInstanceReader.parseInstance(new File(
				viz.getXMLfilename()));
		VizState theme = new VizState(instance);
		String themeFilename = viz.getThemeFilename();
		File themeFile = new File(themeFilename);
		if (themeFile.canRead()) {
			StaticThemeReaderWriter.readAlloy(themeFilename, theme);
		}
		String dot = StaticGraphMaker.produceGraph(instance, theme, null)
				.write();
		IPath dotFile = new Path(viz.getXMLfilename()).removeFileExtension()
				.addFileExtension("dot");
		File f = dotFile.toFile();
		if (f.exists()) {
			f.delete();
		}
		f = null;
		FileWriter fw = new FileWriter(dotFile.toString());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(dot);
		bw.flush();
		bw.close();
		return dotFile;
	}

	public IPath dotConvert(IPath dotFile, String conversion)
			throws IOException, CoreException {
		IPath outFile = dotFile.removeFileExtension().addFileExtension(
				conversion);
		String[] command = new String[] {
				AlloyPreferencePage.getDotBinaryPath(), "-T" + conversion,
				"-o", outFile.toString(), dotFile.toString() };

		Process proc = Runtime.getRuntime().exec(command);
		BufferedReader procOutput = new BufferedReader(new InputStreamReader(
				proc.getErrorStream()));
		try {
			proc.waitFor();
			String line;
			while ((line = procOutput.readLine()) != null) {
				AlloyPlugin.getDefault().logInfo(line);
			}
			if (0 != proc.exitValue()) {
				AlloyPlugin.getDefault().logInfo(
						"DOT to " + conversion + " conversion command failed: "
								+ String.valueOf(command));
				return null;
			}
		} catch (InterruptedException e) {
			AlloyPlugin.getDefault().log(e);
			return null;
		} finally {
		    procOutput.close();
		}

		IWorkspaceRoot wksroot = ResourcesPlugin.getWorkspace().getRoot();
		IResource outResource = wksroot.getContainerForLocation(outFile);
		if (null != outResource && outResource.getProject().isAccessible()) {
			IContainer dotFolder = outResource.getParent();
			dotFolder.refreshLocal(IResource.DEPTH_ONE, null);
			AlloyPlugin.getDefault().logInfo(
					conversion + " workspace file saved as: "
							+ outResource.getFullPath());
		} else {
			AlloyPlugin.getDefault().logInfo(
					conversion + " external file saved as: " + outFile);
		}

		return outFile;
	}

	public IPath saveCurrentVisualizationAsDOTFile() throws IOException,
			CoreException, Err {

		IPath dotFile = produceDotFile(viz[0]);

		if (refreshProjectManager(dotFile)) {
			AlloyPlugin.getDefault().logInfo(
					"DOT workspace file saved as: " + dotFile);
		} else {
			AlloyPlugin.getDefault().logInfo(
					"DOT external file saved as: " + dotFile);
		}

		return dotFile;
	}

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException { // TODO
		// Auto-generated
		// method
		// stub
		super.init(site, memento);
		this.memento = memento;
	}

	@Override
	public void saveState(IMemento memento) {
		super.saveState(memento);
		memento.putString("filename", filename);
		memento.putString("titlename", titlename);
	}

	private void restoreState() {
		if (memento != null) {
			filename = memento.getString("filename");
			titlename = memento.getString("titlename");
		}
	}

}
