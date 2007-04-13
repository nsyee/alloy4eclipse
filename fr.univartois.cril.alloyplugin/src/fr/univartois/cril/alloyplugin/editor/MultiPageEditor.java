package fr.univartois.cril.alloyplugin.editor;


import javax.swing.JPanel;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.*;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.ide.IDE;
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

	public static final String EDITOR_ID = "fr.univartois.cril.alloyplugin.editors.MultiPageEditor";

	/** The text editor used in page 0. */
	private XMLEditor editor;
	
	
	public MultiPageEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		
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
	 */
	void createPage2() {
		
				IEditorInput input;
				input=editor.getEditorInput();
				
			    Composite swtAwtComponent = new Composite(getContainer(), SWT.EMBEDDED);
				java.awt.Frame frame = SWT_AWT.new_Frame(swtAwtComponent );
				
				javax.swing.JPanel panel = new JPanel();
				
				MyVizGUI viz = new MyVizGUI();
				viz.run(MyVizGUI.evs_loadInstanceForcefully, Util.getFileLocation((IResource)input.getAdapter(IResource.class)));
	
				panel=viz.getGraphPanel();
				if (panel!=null)
					frame.add(panel);	
				
				FillLayout layout = new FillLayout();
				swtAwtComponent.setLayout(layout);

				int index = addPage(swtAwtComponent);
				setPageText(index, "graph");
		
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
