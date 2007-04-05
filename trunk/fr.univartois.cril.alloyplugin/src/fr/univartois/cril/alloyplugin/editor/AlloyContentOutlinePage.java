/**
 * 
 */
package fr.univartois.cril.alloyplugin.editor;

import java.util.logging.Logger;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import fr.univartois.cril.alloyplugin.core.ui.IALSTreeDecorated;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;


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
		// IEditorInput input = editor.getEditorInput();
		this.addSelectionChangedListener(new MySelectionListener());
		viewer.addDoubleClickListener(new MyDoubleClickListener());
		setViewerInput();
		viewer.expandAll();
		viewer.refresh();
		log.info("Creation look OK");
	}

	/**
	 * Set newInput to the viewer. The input is updated from editor. It's used
	 * when input changes in editor. (when an opened file in editor is renamed
	 * for example)
	 */
	public void setViewerInput() {
		if (editor != null) {
			if (viewer != null)
				viewer.setInput(editor);
		}

	}

	class MySelectionListener implements ISelectionChangedListener {

		public void selectionChanged(SelectionChangedEvent event) {

			Object selection = ((TreeSelection) event.getSelection())
					.getFirstElement();
			if (selection instanceof IALSTreeDecorated) {
				IALSTreeDecorated elem = (IALSTreeDecorated) selection;
				IDocumentProvider provider = editor.getDocumentProvider();
				IDocument document = provider.getDocument(editor
						.getEditorInput());
				try {
					int start = document.getLineOffset(elem.getLine() - 1);
					editor.selectAndReveal(start, 0);
				} catch (BadLocationException x) {
					// ignore
				}
			}
		}
	}

	class MyDoubleClickListener implements IDoubleClickListener{

		public void doubleClick(DoubleClickEvent event) {
			Object selection = ((TreeSelection) event.getSelection()).getFirstElement();
			if (selection instanceof IALSTreeDecorated) {
				IALSTreeDecorated elem = (IALSTreeDecorated) selection;
				if (elem instanceof ExecutableCommand){
				AlloyLaunching.ExecCommand((ExecutableCommand) elem);
				viewer.refresh();		
				}
			}	
		}
	}
	
}
