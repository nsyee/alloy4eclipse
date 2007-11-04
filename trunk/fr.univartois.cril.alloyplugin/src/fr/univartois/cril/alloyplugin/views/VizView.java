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
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;
import org.xml.sax.InputSource;

import edu.mit.csail.sdg.alloy4.Computer;
import edu.mit.csail.sdg.alloy4.ErrorFatal;
import edu.mit.csail.sdg.alloy4.ErrorSyntax;
import edu.mit.csail.sdg.alloy4.MultiRunner.MultiRunnable;
import edu.mit.csail.sdg.alloy4graph.VizViewer;
import edu.mit.csail.sdg.alloy4viz.AlloyInstance;
import edu.mit.csail.sdg.alloy4viz.StaticGraphMaker;
import edu.mit.csail.sdg.alloy4viz.StaticInstanceReader;
import edu.mit.csail.sdg.alloy4viz.StaticThemeReaderWriter;
import edu.mit.csail.sdg.alloy4viz.VizGUI;
import edu.mit.csail.sdg.alloy4viz.VizState;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ui.ICommandListener;
import fr.univartois.cril.alloyplugin.editor.MultiPageEditorContributor;
import fr.univartois.cril.alloyplugin.preferences.AlloyPreferencePage;

public class VizView extends ViewPart implements ICommandListener {

    private VizGUI[] viz = new VizGUI[1];
    private Action   editorAction1;
    private IAction  saveAsTheme;
    private IAction  editorAction5;
    private IAction  editorAction4;
    private IAction  editorAction3;
    private IAction  editorAction2;

    private String   filename;

    @Override
    public void createPartControl(Composite arg0) {
        final Composite a4Component = swingintegration.example.Platform
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
                                MultiRunnable enumerator = null;
                                Computer evaluator = null;
                                boolean makeWindow = false;

                                viz[0] = new VizGUI(standalone, xmlFileName,
                                        windowmenu, enumerator, evaluator,
                                        makeWindow);

                                return viz[0].getPanel();
                            }
                        });
        if (filename != null) {
            fillWithVizPanel(filename,filename,lookForDefaultThemeFile());
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
        this.filename = filename;
        fillWithVizPanel(filename,filename,lookForDefaultThemeFile());

    }

    public void onXmlSolutionFileCreation(String filename,
            URL alloyVisualizationTheme) {
        this.filename = filename;
        fillWithVizPanel(filename, filename,alloyVisualizationTheme);
    }

    public void onXmlSolutionFileCreation(String filename, String name,
            URL alloyVisualizationTheme) {
        this.filename = filename;
        fillWithVizPanel(filename, name,alloyVisualizationTheme);
    }

    private void fillWithVizPanel(String filename, String name, URL alloyVisualizationTheme) {
        setPartName(name);
        viz[0].run(VizGUI.EVS_LOAD_INSTANCE_FORCEFULLY, filename);

        if (alloyVisualizationTheme != null) {
            viz[0]
                    .run(VizGUI.EVS_LOAD_THEME, alloyVisualizationTheme
                            .getFile());
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
                    dialog.open();
                    final IPath dir = new Path(dialog.getFilterPath());
                    final IPath path = dir.addTrailingSeparator().append(
                            dialog.getFileName());
                    fillWithVizPanel(filename, filename,path.toFile().toURI().toURL());

                } catch (Exception e) {
                    AlloyPlugin.getDefault().log(e);
                }
            }
        };
        editorAction1.setText("Apply Visualization Theme");
        editorAction1.setToolTipText("Alloy4Eclipse Visualization Theme");
        editorAction1.setImageDescriptor(AlloyPlugin.getDefault()
                .getImageDescriptor(AlloyPlugin.THEME_IMPORT_ICON_ID));

        editorAction2 = new Action() {
            public void run() {
                try {
                    Shell shell = VizView.this.getViewSite().getShell();
                    FileDialog fdialog = new FileDialog(shell);
                    fdialog.setFilterExtensions(new String[] { "*.thm" });
                    fdialog.setText("Select a visualization theme");
                    fdialog.open();
                    final IPath dir = new Path(fdialog.getFilterPath());
                    final String filename = fdialog.getFileName();

                    final IPath path = dir.addTrailingSeparator().append(
                            filename);
                    InputDialog ndialog = new InputDialog(shell,
                            "New Alloy4 visualization page name:",
                            "Enter a string", null, null);
                    ndialog.open();
                    URL url = null;
                    if (!"".equals(filename)) {
                        url = path.toFile().toURI().toURL();
                    }
                    addAlloyVisualizationView(url, ndialog.getValue());
                } catch (Exception e) {
                    AlloyPlugin.getDefault().log(e);
                }
            }
        };
        editorAction2.setText("Add Another Visualization Page");
        editorAction2.setToolTipText("New Alloy4Eclipse Visualization Page");
        editorAction2.setImageDescriptor(AlloyPlugin.getDefault()
                .getImageDescriptor(AlloyPlugin.THEME_IMPORT_ADD_ICON_ID));

        editorAction3 = new Action() {
            public void run() {
                try {
                    Shell shell = VizView.this.getViewSite().getShell();
                    FileDialog fdialog = new FileDialog(shell);
                    fdialog.setFilterExtensions(new String[] { "*.thm" });
                    fdialog.setText("Select a visualization theme");
                    fdialog.open();
                    final IPath dir = new Path(fdialog.getFilterPath());
                    final String themeFilename = fdialog.getFileName();
                    final IPath path = dir.addTrailingSeparator().append(
                            themeFilename);
                    VizGUI viz = new VizGUI(false, "", null);
                    viz.run(VizGUI.EVS_LOAD_INSTANCE_FORCEFULLY, filename);
                    if (!"".equals(themeFilename)) {
                        try {
                            final URL themeUrl = FileLocator.toFileURL(path
                                    .toFile().toURI().toURL());
                            viz.run(VizGUI.EVS_LOAD_THEME, themeUrl.getFile());
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
        editorAction3.setImageDescriptor(AlloyPlugin.getDefault()
                .getImageDescriptor(AlloyPlugin.LAUNCH_A4_ICON_ID));

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
        editorAction4.setImageDescriptor(AlloyPlugin.getDefault()
                .getImageDescriptor(AlloyPlugin.THEME_EXPORT_DOT_ICON_ID));

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

        saveAsTheme = new Action() {
            public void run() {
                try {
                    FileDialog dialog = new FileDialog(VizView.this
                            .getViewSite().getShell(), SWT.SAVE);
                    dialog.setFilterExtensions(new String[] { "*.thm" });
                    dialog
                            .setText("Where do you want to save your theme file?");
                    dialog.open();
                    final IPath dir = new Path(dialog.getFilterPath());
                    final String filename = dialog.getFileName();
                    if (filename != null && !"".equals(filename)) {
                        IPath path = dir.addTrailingSeparator()
                                .append(filename);
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
        saveAsTheme.setImageDescriptor(AlloyPlugin.getDefault()
                .getImageDescriptor(AlloyPlugin.THEME_EXPORT_ICON_ID));
    }

    public static String A4E_MENU_ID = MultiPageEditorContributor.class
                                             .getPackage().getName()
                                             + ".a4e.menu"; //$NON-NLS-1$

    public IToolBarManager getToolBarManager() {
        if (AlloyPreferencePage.getShowDebugMessagesPreference())
            AlloyPlugin.getDefault().logInfo(
                    "MultiPageEditorContributor.getToolBarManager()");
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
        manager.add(saveAsTheme);
    }

    public void contributeToToolBar(IToolBarManager manager) {
        manager.add(editorAction1);
        manager.add(editorAction2);
        manager.add(editorAction3);
        manager.add(editorAction4);
        manager.add(editorAction5);
        manager.add(saveAsTheme);
    }

    /**
     * Look for a default theme file. For the moment, the theme file must be the
     * same as the als file launching the command.
     * 
     * @author leberre@cril.univ-artois.fr
     */
    private URL lookForDefaultThemeFile() {
        try {
            XPathFactory fabrique = XPathFactory.newInstance();
            XPath environnement = fabrique.newXPath();
            URL url = new URL("file:" + filename);
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public void addAlloyVisualizationView(final URL alloyVisualizationTheme,
            String name) {
        IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        ICommandListener commandListener;
        try {
            IViewPart vizView = window.getActivePage().showView(
                    "fr.univartois.cril.alloyplugin.views.vizview", name,
                    IWorkbenchPage.VIEW_ACTIVATE);
            commandListener = (ICommandListener) vizView;

            commandListener.onXmlSolutionFileCreation(filename,name,
                    alloyVisualizationTheme);

        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    public void doSaveAsTheme(IPath path) throws CoreException {
        viz[0].run(VizGUI.EV_SAVE_THEME_AS_TS, path.toString());
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
            ErrorFatal, ErrorSyntax, CoreException {
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

    private IPath produceDotFile(VizGUI viz) throws ErrorFatal, ErrorSyntax,
            IOException {
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
                                + command);
                return null;
            }
        } catch (InterruptedException e) {
            AlloyPlugin.getDefault().log(e);
            return null;
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
            ErrorFatal, ErrorSyntax, CoreException {

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
}
