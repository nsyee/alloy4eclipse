package fr.univartois.cril.alloyplugin.editor;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import edu.mit.csail.sdg.alloy4.ErrorFatal;
import edu.mit.csail.sdg.alloy4.ErrorSyntax;
import edu.mit.csail.sdg.alloy4viz.AlloyInstance;
import edu.mit.csail.sdg.alloy4viz.StaticGraphMaker;
import edu.mit.csail.sdg.alloy4viz.StaticInstanceReader;
import edu.mit.csail.sdg.alloy4viz.StaticThemeReaderWriter;
import edu.mit.csail.sdg.alloy4viz.VizState;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.XMLEditor.XMLEditor;
import fr.univartois.cril.alloyplugin.launch.ui.MyVizGUI;
import fr.univartois.cril.alloyplugin.launch.util.Util;
import fr.univartois.cril.alloyplugin.preferences.AlloyPreferencePage;

/**
 * An example showing how to create a multi-page editor.
 * This example has 3 pages:
 * <ul>
 * <li>page 0 contains a nested text editor.
 * <li>page 1 allows you to change the font used in page 2
 * <li>page 2 shows the words in page 0 in sorted order
 * </ul>
 */
public class MultiPageEditor extends MultiPageEditorPart implements IResourceChangeListener{

	/**
	 * @author Nicolas.Rouquette@jpl.nasa.gov
	 * @per Reducing Flicker
	 * @see http://www.eclipse.org/articles/article.php?file=Article-Swing-SWT-Integration/index.html
	 */
	static {
		if (Platform.OS_WIN32.equals(Platform.getOS())) {
			System.setProperty("sun.awt.noerasebackground", "true");
		}
	}
	
	public static final String EDITOR_ID = "fr.univartois.cril.alloyplugin.editors.MultiPageEditor";

	/** The text editor used in page 0. */
	private XMLEditor editor;
	
	private Map<String,MyVizGUI> vizMap = new HashMap<String, MyVizGUI>();
	private Map<Integer,MyVizGUI> vizTable = new HashMap<Integer, MyVizGUI>();
	private Map<Integer,URL> thmTable = new HashMap<Integer, URL>();
	
	public MyVizGUI getVizGUI(final String pageName) {
		return vizMap.get(pageName);
	}
	
	public String getCurrentVizGUIName() {
		final MyVizGUI viz = getCurrentVizGUI();
		for (Map.Entry<String, MyVizGUI> entry : vizMap.entrySet()) {
			if (viz.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return "<NULL>";
	}
	
	public int getCurrentVizGUIIndex() {
		return getActivePage();
	}
	
	public MyVizGUI getCurrentVizGUI() {
		return vizTable.get(getActivePage());
	}
	
	public MultiPageEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.ctor()");
	}
	
	/**
	 * @return The MultiPageEditorContributor where we can add, for example, additional actions.
	 */
	public MultiPageEditorContributor getMultiPageEditorContributor() {
		final IEditorActionBarContributor contributor = getEditorSite().getActionBarContributor();
		if (contributor != null && contributor instanceof MultiPageEditorContributor) {
			return (MultiPageEditorContributor) contributor;
		}
		return null;
	}
	
	@Override
	protected void pageChange(int newPageIndex) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.pageChange(newPageIndex="+newPageIndex+").begin");
		MultiPageEditorContributor contributor = getMultiPageEditorContributor();
		if (null != contributor) {
			contributor.setMultiPageEditor(this);
		}
		super.pageChange(newPageIndex);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.pageChange(newPageIndex="+newPageIndex+").end");
	}
	
	public MyVizGUI applyAlloyVisualizationToCurrentPage(final URL alloyVisualizationTheme) {
		int index = getCurrentVizGUIIndex();
		MyVizGUI viz = getCurrentVizGUI();
		viz.run(MyVizGUI.evs_loadTheme, alloyVisualizationTheme.getFile());
		thmTable.put(index, alloyVisualizationTheme);
		return viz;
	}
		
	public MyVizGUI addAlloyVisualizationPage(final String pageName, final URL alloyVisualizationTheme) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.addAlloyVisualizationPage(page="+pageName+",url="+alloyVisualizationTheme+")");
		final IEditorInput input=editor.getEditorInput();
		
		Composite swtAwtComponent = new Composite(getContainer(), SWT.EMBEDDED | SWT.NO_BACKGROUND);
		java.awt.Frame frame = SWT_AWT.new_Frame(swtAwtComponent );
		
		/**
		 * @per Creating a Root Pane Container
		 * @see http://www.eclipse.org/articles/article.php?file=Article-Swing-SWT-Integration/index.html
		 */
		javax.swing.JApplet applet = new javax.swing.JApplet();
		frame.add(applet);
		
		MyVizGUI viz = new MyVizGUI();
		viz.run(MyVizGUI.evs_loadInstanceForcefully, Util.getFileLocation((IResource)input.getAdapter(IResource.class)));
		if (alloyVisualizationTheme != null) {
			viz.run(MyVizGUI.evs_loadTheme, alloyVisualizationTheme.getFile());
		}
		
		final JPanel panel=viz.getGraphPanel();
		if (panel!=null)
			applet.add(panel);	
		
		final FillLayout layout = new FillLayout();
		swtAwtComponent.setLayout(layout);

		int index = addPage(swtAwtComponent);
		if (pageName != null) {
			setPageText(index, pageName);
		}
		
		vizMap.put(pageName, viz);
		vizTable.put(index, viz);
		thmTable.put(index, alloyVisualizationTheme);
		return viz;
	}
	
	public void setActivePage(final String activePageName) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.setActivePage(activePageName="+activePageName+").begin");
		int c = getPageCount();
		for (int i = 0; i<c; i++) {
			final String pageName = getPageText(i);
			if (activePageName.equals(pageName)) {
				setActivePage(i);
			}
		}

		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.setActivePage(activePageName="+activePageName+").end");
	}
	
	/**
	 * Creates page 1 of the multi-page editor,
	 * which contains a text editor.
	 */
	
	
	void createPage1() {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.createPage1().begin");
		try {
			editor = new XMLEditor();
			int index = addPage(editor, getEditorInput());
			setPageText(index, editor.getTitle());
		} catch (PartInitException e) {
			AlloyPlugin.getDefault().log(e);
		}
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.createPage1().end");
	}
	/**
	 * Creates page 2 of the multi-page editor,
	 * which contains a frame with the graph.
	 * 
	 * @author Nicolas.Rouquette@jpl.nasa.gov
	 * @per Using the SWT/AWT Bridge
	 * @see http://www.eclipse.org/articles/article.php?file=Article-Swing-SWT-Integration/index.html
	 */
	void createPage2() {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.createPage2().begin");
		IEditorInput input;
		input=editor.getEditorInput();

		Composite swtAwtComponent = new Composite(getContainer(), SWT.EMBEDDED | SWT.NO_BACKGROUND);
		java.awt.Frame frame = SWT_AWT.new_Frame(swtAwtComponent );

		/**
		 * @per Creating a Root Pane Container
		 * @see http://www.eclipse.org/articles/article.php?file=Article-Swing-SWT-Integration/index.html
		 */
		javax.swing.JApplet applet = new javax.swing.JApplet();
		frame.add(applet);

		MyVizGUI viz = new MyVizGUI();
		viz.run(MyVizGUI.evs_loadInstanceForcefully, Util.getFileLocation((IResource)input.getAdapter(IResource.class)));

		JPanel panel=viz.getGraphPanel();
		if (panel!=null)
			applet.add(panel);	

		FillLayout layout = new FillLayout();
		swtAwtComponent.setLayout(layout);

		int index = addPage(swtAwtComponent);
		String page = "graph";
		setPageText(index, page);
		vizMap.put(page, viz);
		vizTable.put(index, viz);
		thmTable.put(index, null);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.createPage2().end");
	}
	
	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.createPages().begin");
		createPage1();
		createPage2();
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.createPages().end");
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}
	
	public IPath saveCurrentVisualizationAsDOTFile() throws IOException, ErrorFatal, ErrorSyntax {
		MyVizGUI viz = getCurrentVizGUI();
		if (null == viz) return null;
		AlloyInstance instance = StaticInstanceReader.parseInstance(new File(viz.getXMLfilename()));
		VizState theme = new VizState(instance);
		String themeFilename = viz.getThemefilename();
		File themeFile = new File(themeFilename);
		if (themeFile.canRead()) {
			StaticThemeReaderWriter.readAlloy(themeFilename, theme);
		}
		String dot = StaticGraphMaker.produceGraph(instance, theme, null).write();
		IPath dotFile = new Path(viz.getXMLfilename()).removeFileExtension().addFileExtension("dot");
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
		AlloyPlugin.getDefault().logInfo("DOT file saved as: " + dotFile);
		return dotFile;
	}
	
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.init(site="+site+",editorInput="+editorInput+").begin");
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
		setPartName(editorInput.getName());
		IResource resource = (IResource) editorInput.getAdapter(IResource.class);
		setContentDescription(resource.getProjectRelativePath().toPortableString());
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.init(site="+site+",editorInput="+editorInput+").end");
		
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.resourceChanged(event="+event+").begin");
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.resourceChanged(event="+event+").end");
		
	}

	@Override
	public int addPage(Control control) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.addPage(control="+control+").begin");
		try {
			return super.addPage(control);
		} finally {
			if (AlloyPreferencePage.getShowDebugMessagesPreference())
				AlloyPlugin.getDefault().logInfo("MultiPageEditor.addPage(control="+control+").end");
			
		}
	}

	@Override
	public int addPage(IEditorPart editor, IEditorInput input) throws PartInitException {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.addPage(editor="+editor+", input="+input+").begin");
		try {
			return super.addPage(editor, input);
		} finally {
			if (AlloyPreferencePage.getShowDebugMessagesPreference())
				AlloyPlugin.getDefault().logInfo("MultiPageEditor.addPage(editor="+editor+", input="+input+").end");
			
		}
	}

	@Override
	public void addPage(int index, Control control) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.addPage(index="+index+",control="+control+ ").begin");
		super.addPage(index, control);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.addPage(index="+index+",control="+control+ ").end");
		
	}

	@Override
	public void addPage(int index, IEditorPart editor, IEditorInput input) throws PartInitException {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.addPage(index="+index+",editor="+editor+", input="+input+").begin");
		super.addPage(index, editor, input);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.addPage(index="+index+",editor="+editor+", input="+input+").end");
		
	}

	@Override
	protected Composite createPageContainer(Composite parent) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.createPageContainer(parent=" +parent+").begin");
		try {
			return super.createPageContainer(parent);
		} finally {
			if (AlloyPreferencePage.getShowDebugMessagesPreference())
				AlloyPlugin.getDefault().logInfo("MultiPageEditor.createPageContainer(parent=" +parent+").end");
		}
	}

	@Override
	protected IEditorSite createSite(IEditorPart editor) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.createSite(editor="+editor+").begin");
		try {
			return super.createSite(editor);
		} finally {
			if (AlloyPreferencePage.getShowDebugMessagesPreference())
				AlloyPlugin.getDefault().logInfo("MultiPageEditor.createSite(editor="+editor+").end");
		}
	}

	@Override
	protected void setControl(int pageIndex, Control control) {
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.setControl(pageIndex="+pageIndex+",control="+control+").begin");
		super.setControl(pageIndex, control);
		if (AlloyPreferencePage.getShowDebugMessagesPreference())
			AlloyPlugin.getDefault().logInfo("MultiPageEditor.setControl(pageIndex="+pageIndex+",control="+control+").end");
		
	}
	
}
