/**
 * 
 */
package fr.univartois.cril.alloyplugin.editor;

import java.util.Iterator;

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
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import edu.mit.csail.sdg.alloy4.Pos;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.api.IALSCommand;
import fr.univartois.cril.alloyplugin.api.IALSTreeDecorated;
import fr.univartois.cril.alloyplugin.core.UnsatCorePos;
import fr.univartois.cril.alloyplugin.launch.ui.DisplayCommandAnswerAction;
import fr.univartois.cril.alloyplugin.launch.ui.LaunchCommandAction;
import fr.univartois.cril.alloyplugin.preferences.PreferenceConstants;

/**
 * 
 * 
 */
public class AlloyContentOutlinePage extends ContentOutlinePage {

    // private static final Logger log = Logger.getLogger("alloy");

    private final ALSEditor            editor;

    private LaunchCommandAction        launchCommandAction;
    private DisplayCommandAnswerAction displayCommandAnswerAction;

    private TreeViewer                 viewer;

    public AlloyContentOutlinePage(ALSEditor editor) {
        this.editor = editor;
    }

    public void createControl(Composite parent) {
        super.createControl(parent);
        // log.info("Creating Outline Page");
        viewer = getTreeViewer();
        // log.info("Adding label provider");
        viewer.setLabelProvider(new AlloyTreeLabelProvider());
        // log.info("Adding content provider");
        viewer.setContentProvider(new AlloyTreeContentProvider());
        // IEditorInput input = editor.getEditorInput();
        this.addSelectionChangedListener(new MySelectionListener());
        setViewerInput();
        viewer.expandAll();
        viewer.refresh();

        // pour le menu

        makeActions();
        hookContextMenu();
        hookDoubleClickAction();
        contributeToActionBars();

        // log.info("Creation look OK");
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
        getSite().registerContextMenu(null, menuMgr, viewer);
    }

    private void contributeToActionBars() {
        IActionBars bars = getSite().getActionBars();
        fillLocalPullDown(bars.getMenuManager());
        fillLocalToolBar(bars.getToolBarManager());
    }

    private void fillLocalPullDown(IMenuManager manager) {
        manager.add(launchCommandAction);
        // manager.add(new Separator());
        manager.add(displayCommandAnswerAction);
        manager.add(new Separator());

    }

    private void hookDoubleClickAction() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {

            public void doubleClick(DoubleClickEvent event) {
                Object selection = ((TreeSelection) event.getSelection())
                        .getFirstElement();

                if (selection instanceof IALSTreeDecorated) {
                    launchCommandAction.run();
                    // log.info("Selection mis � null");
                    // viewer.setSelection(null, true);
                }

                if (selection instanceof RootContent) {
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
        // manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
        manager.add(displayCommandAnswerAction);
        // Other plug-ins can contribute there actions here
        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    }

    private void fillLocalToolBar(IToolBarManager manager) {
        manager.add(launchCommandAction);
        manager.add(displayCommandAnswerAction);
    }

    private void makeActions() {
        launchCommandAction = new LaunchCommandAction(viewer);
        displayCommandAnswerAction = new DisplayCommandAnswerAction(viewer);

    }

    public void setFocus() {
        this.getControl().setFocus();
    }

    class MySelectionListener implements ISelectionChangedListener {

        public void selectionChanged(SelectionChangedEvent event) {

            Object selection = ((TreeSelection) event.getSelection())
                    .getFirstElement();
            IDocumentProvider provider = editor.getDocumentProvider();
            IDocument document = provider.getDocument(editor.getEditorInput());

            int start = 0, end = 0;

            if (selection instanceof IALSCommand) {
                IALSCommand command = (IALSCommand) selection;
                boolean canShowCore = PreferenceConstants.V_SOLVER_MiniSatProverUnsatCore
                        .equals(AlloyPlugin.getDefault().getPreferenceStore()
                                .getString(PreferenceConstants.P_SOLVER_CHOICE));

                // If the chosen solver is MinisatProver Unsat Core and the
                // result is UNSAT
                if (canShowCore && command.shouldShowUnsatCore()) {
                    // show the core
                    Iterator<Pos> it = command.getCore().iterator();
                    int temp = 0, x = 0, x2 = 0;
                    Pos pos;
                    if (it.hasNext()) {
                        pos = it.next();
                        try {
                            start = document.getLineOffset(pos.y);
                            x = pos.x;
                            x2 = pos.x2;
                            end = start;
                        } catch (BadLocationException e) {
                            e.printStackTrace();
                        }
                    }
                    while (it.hasNext()) {
                        pos = it.next();
                        try {
                            temp = document.getLineOffset(pos.y);
                            if (temp <= start) {
                                start = temp;
                                if (pos.x < x) {
                                    x = pos.x;
                                }
                                if (pos.x2 > x2) {
                                    x2 = pos.x2;
                                }
                            } else if (temp > end)
                                end = temp;
                        } catch (BadLocationException e) {
                            e.printStackTrace();
                        }
                    }
                    editor.selectAndReveal(start - (x2 - x - 2), end - start
                            + (x2 - x - 3));
                    return;
                }

            }

            if (selection instanceof IALSTreeDecorated) {
                IALSTreeDecorated elem = (IALSTreeDecorated) selection;

                if (selection instanceof UnsatCorePos) {
                    UnsatCorePos ucp = (UnsatCorePos) selection;
                    try {
                        start = document.getLineOffset(elem.getBeginLine() - 1);
                        editor.selectAndReveal(start + ucp.getX() - 1, ucp
                                .getX2()
                                - ucp.getX() + 1);
                    } catch (BadLocationException x) {
                        // ignore
                    }
                    return;
                }

                try {
                    start = document.getLineOffset(elem.getBeginLine() - 1);
                    editor.selectAndReveal(start, 0);
                } catch (BadLocationException x) {
                    // ignore
                }
            }
        }
    }

}
