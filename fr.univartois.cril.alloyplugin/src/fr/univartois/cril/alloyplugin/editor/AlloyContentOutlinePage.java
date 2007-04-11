/**
 * 
 */
package fr.univartois.cril.alloyplugin.editor;

import java.util.logging.Logger;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.AlloyLaunching;
import fr.univartois.cril.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.core.ui.IALSTreeDecorated;
import fr.univartois.cril.alloyplugin.launch.ui.DisplayCommandAnswerAction;
import fr.univartois.cril.alloyplugin.launch.ui.LaunchQuickConfigAction;
import fr.univartois.cril.alloyplugin.launch.ui.LaunchShortcut;


/**
 * 
 * 
 */
public class AlloyContentOutlinePage extends ContentOutlinePage {

	private static final Logger log = Logger.getLogger("alloy");

	private final ALSEditor editor;

	private LaunchQuickConfigAction launchCommandAction;	
	private DisplayCommandAnswerAction displayCommandAnswerAction;	

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
		setViewerInput();
		viewer.expandAll();
		viewer.refresh();

//		pour le menu



		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();


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

	private void hookContextMenu() {		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {

			public void menuAboutToShow(IMenuManager manager) {				
				AlloyContentOutlinePage.this.fillContextMenu(manager);
			}


		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(null, menuMgr,viewer);
	}


	private void contributeToActionBars() {
		IActionBars bars = getSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());		
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(launchCommandAction);		
		//manager.add(new Separator());
		manager.add(displayCommandAnswerAction);		
		manager.add(new Separator());

	}

	private void hookDoubleClickAction() {		
		viewer.addDoubleClickListener(new IDoubleClickListener(){

			public void doubleClick(DoubleClickEvent event) {
				Object selection = ((TreeSelection) event.getSelection()).getFirstElement();
				
				if (selection instanceof IALSTreeDecorated) {
					launchCommandAction.run();
				}

				if (AlloyTreeContentProvider.SIGNATURES.equals(selection)
						||AlloyTreeContentProvider.FACTS.equals(selection)
						||AlloyTreeContentProvider.FUNCTIONS.equals(selection)
						||AlloyTreeContentProvider.PREDICATES.equals(selection)
						||AlloyTreeContentProvider.COMMANDS.equals(selection)){
					if (viewer.getExpandedState(selection))
						viewer.collapseToLevel(selection, -1);
					else
						viewer.expandToLevel(selection, 1);
				} 


			}
		});

	}

		
	

	private void fillContextMenu(IMenuManager manager) {		
		manager.add(launchCommandAction);
		// Other plug-ins can contribute there actions here
		//manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		manager.add(displayCommandAnswerAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}


	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(launchCommandAction);		
		manager.add(displayCommandAnswerAction);	
	}


	private void makeActions() {
		launchCommandAction = new LaunchQuickConfigAction(viewer);
		displayCommandAnswerAction = new DisplayCommandAnswerAction(viewer);
	}

	public void setFocus() {
		this.getControl().setFocus();
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

	
}
