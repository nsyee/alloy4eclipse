/**
 * 
 */
package fr.univartois.cril.alloyplugin.editor;

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
public class AlloyContentOutlinePage extends ContentOutlinePage implements IContentOutlinePage{

	IEditorInput fInput;
	
	public AlloyContentOutlinePage(IDocumentProvider documentProvider, ALSEditor editor) {
		
	}

	public void createControl(Composite parent) {
		//super.createControl(parent);

		
		//TreeViewer viewer= getTreeViewer();
		//viewer.setContentProvider(new AlloySolutionContentProvider());
		//viewer.setLabelProvider(new AlloySolutionLabelProvider());
		//viewer.addSelectionChangedListener(this);
		//viewer.expandAll();

		//if (fInput != null)
		//	viewer.setInput(fInput);
	}

	

	public void dispose() {
		
		
	}

	public Control getControl() {
		
		return null;
	}

	public void setActionBars(IActionBars actionBars) {
		 
		
	}

	public void setFocus() {
		
		
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		
		
	}

	public ISelection getSelection() {
		
		return null;
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		
		
	}

	public void setSelection(ISelection selection) {
		
		
	}

	public void setInput(IEditorInput editorInput) {
		
		
	}

}
