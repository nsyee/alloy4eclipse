/**
 * 
 */
package fr.univartois.cril.alloyplugin.editor;

import java.util.logging.Logger;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;


/**
 * 
 * 
 */
public class AlloyContentOutlinePage extends ContentOutlinePage {

	private static final Logger log = Logger.getLogger("alloy");
	private final ALSEditor editor;	
	private TreeViewer viewer;
	
	public AlloyContentOutlinePage(ALSEditor editor) {
		this.editor = editor;
	}

	public void createControl(Composite parent) {
		super.createControl(parent);
		log.info("Creating Outline Page");
		viewer = getTreeViewer();
		log.info("Adding label provider");
		viewer.setLabelProvider(new AlloyTreeLabelProvider());
		log.info("Adding content provider");
		viewer.setContentProvider(new AlloyTreeContentProvider());
		//IEditorInput input = editor.getEditorInput();
		
		setViewerInput();		
		viewer.expandAll();
		viewer.refresh();
		log.info("Creation look OK");
	}

	/**
	 * Set newInput to the viewer. The input is updated from editor.
	 * It's used when input changes in editor. (when an opened file in editor is renamed for example)
	 * */
	public void setViewerInput() {
		if (editor!=null)
			{			
			if(viewer!=null)
				viewer.setInput(editor);
			}
		
	}
	
	

}
