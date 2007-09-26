package fr.univartois.cril.alloyplugin.editor;


import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
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

import fr.univartois.cril.alloyplugin.XMLEditor.XMLEditor;
import fr.univartois.cril.alloyplugin.launch.ui.MyVizGUI;
import fr.univartois.cril.alloyplugin.launch.util.Util;

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
		MultiPageEditorContributor contributor = getMultiPageEditorContributor();
		if (null != contributor) {
			contributor.setMultiPageEditor(this);
		}
		super.pageChange(newPageIndex);
	}
	
	public MyVizGUI addAlloyVisualizationPage(final String pageName, final URL alloyVisualizationTheme) {
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
			viz.run(203 /* VizGUI.evs_loadTheme */, alloyVisualizationTheme.getFile());
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
		return viz;
	}
	
	public void setActivePage(final String activePageName) {
		int c = getPageCount();
		for (int i = 0; i<c; i++) {
			final String pageName = getPageText(i);
			if (activePageName.equals(pageName)) {
				setActivePage(i);
			}
		}
	}
	
	/**
	 * Creates page 1 of the multi-page editor,
	 * which contains a text editor.
	 */
	
	
	void createPage1() {
		try {
			editor = new XMLEditor();
			int index = addPage(editor, getEditorInput());
			setPageText(index, editor.getTitle());
		} catch (PartInitException e) {
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating nested text editor",
				null,
				e.getStatus());
		}
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
		
	}
	
	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPage1();
		createPage2();
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
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
		setPartName(editorInput.getName());
		IResource resource = (IResource) editorInput.getAdapter(IResource.class);
		setContentDescription(resource.getProjectRelativePath().toPortableString());
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
	}
	
}
