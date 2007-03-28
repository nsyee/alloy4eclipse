/**
 * 
 */
package fr.univartois.cril.alloyplugin.editor;

import java.util.logging.Logger;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * 
 * 
 */
public class AlloyContentOutlinePage extends ContentOutlinePage {

	private static final Logger log = Logger.getLogger("alloy");
	private final ALSEditor editor;
	
	public AlloyContentOutlinePage(ALSEditor editor) {
		this.editor = editor;
	}

	public void createControl(Composite parent) {
		super.createControl(parent);
		log.info("Creating Outline Page");
		TreeViewer viewer = getTreeViewer();
		log.info("Adding label provider");
		viewer.setLabelProvider(new AlloySolutionLabelProvider());
		log.info("Adding content provider");
		viewer.setContentProvider(new AlloyTreeContentProvider());
		Object input = editor.getEditorInput();
		if (input!=null)
			viewer.setInput(input);
		viewer.expandAll();
		log.info("Creation look OK");
	}

}
