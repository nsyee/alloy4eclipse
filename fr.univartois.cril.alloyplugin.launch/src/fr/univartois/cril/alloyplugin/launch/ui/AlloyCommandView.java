package fr.univartois.cril.alloyplugin.launch.ui;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.jface.action.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;


;
/**
 * This view displays Alloy commands to be executed.
 * The view uses a content provider and a label provider to define how model
 * objects should be presented. 
 * 
 */

public class AlloyCommandView extends ViewPart{
	protected static AlloyCommandView defaultAlloyCommandView;
	protected  static ViewContentProvider viewContentProvider;
	private TableViewer commandsViewer;
	private Action commandAction;
	private ListViewer resultsViewer;
	private StringBuilder result=null;

	private static String viewTitle="";
	

	
	class ResultLabelProvider extends LabelProvider {		
		public String getText(Object obj) {
			//return("dd\nttt\nttt");
			return super.getText(obj);
				}
		public Image getImage(Object obj) {		
			return null;
				}
		 
		}
	/**
	 * The constructor.
	 */
	public AlloyCommandView() {
		defaultAlloyCommandView=this;
//		affiche les view presentes:
		
/*		for (IViewDescriptor viewDescriptor:
			PlatformUI.getWorkbench().getViewRegistry().getViews()){
			System.out.println(viewDescriptor.getId());			
		}*/
		 
	}
	public void dispose(){
		//TODO implements this dispose method
		defaultAlloyCommandView=null;
	}

	/**
	 * Returns commands view or null if not created yet. 
	 */
	public static AlloyCommandView getDefault(){
		return defaultAlloyCommandView;

	}


	public void createPartControl(Composite parent) {		

		FillLayout layout = new FillLayout();
		layout.type=SWT.VERTICAL;
		parent.setLayout(layout);
		commandsViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		commandsViewer.setContentProvider(getContentProvider());		
		commandsViewer.setLabelProvider(new ViewLabelProvider());		
		commandsViewer.setInput(getViewSite());
		//Sash sash=new Sash(parent, SWT.HORIZONTAL);
		//sash.
		resultsViewer=new ListViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);		
		//resultsViewer.setLabelProvider(new ResultLabelProvider());
		resultsViewer.add(getResult());
		
		setTitle("["+viewTitle+"]");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();		

	};

	private static ViewContentProvider getContentProvider() {
		if (viewContentProvider==null) viewContentProvider=new ViewContentProvider();
		return viewContentProvider;
	}
	private void hookContextMenu() {		
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {				
				AlloyCommandView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(commandsViewer.getControl());
		commandsViewer.getControl().setMenu(menu);		
		getSite().registerContextMenu(menuMgr, commandsViewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());		
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(commandAction);
		manager.add(new Separator());

	}

	private void fillContextMenu(IMenuManager manager) {		
		manager.add(commandAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(commandAction);

	}

	private void makeActions() {
		commandAction = new CommandAction(commandsViewer);
		//new CommandActionListener();
		/*
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
		 */
	}

	private void hookDoubleClickAction() {		
		commandsViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				commandAction.run();
			}
		});
	}

	/*private void showMessage(String message) {	

		MessageDialog.openInformation(
				viewer.getControl().getShell(),
				"Alloy commands",
				message);
	}
	 */
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		commandsViewer.getControl().setFocus();
	}

	/**
	 * Try to show Commands view in the active workbench window.
	 * Returns the command view or null if can't be show.
	 */
	public static AlloyCommandView showCommandView(){
		try {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();			
			if (window!=null) 
			{//System.out.println("ici");
				IWorkbenchPage page=window.getActivePage();				
				if (page!=null)
					return (AlloyCommandView) page.showView("fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView");
				//else System.out.println("page null");
			}
		} catch (PartInitException e) {
			// TODO display error message?
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * returns viewer; 
	 */
	private StructuredViewer getViewer() {		
		return commandsViewer;
	}
	/**
	 * Sets commands from a file to the ContentProvider.
	 * */
	public static void setCommands(IResource res,ExecutableCommand[] exec_cmds) {		
		((ViewContentProvider) getContentProvider()).addElements(exec_cmds,res);
	}
	
	/**
	 * Displays the commands of a file.
	 * (if setCommand() has been called before with the same file)	 
	 */
	public static void displayCommands(IResource resource) {
		
		if(resource.equals(getContentProvider().getCurrent()))
			return;
		forceDisplayCommands(resource);

	}
	private static void setViewTitle(String name) {
		viewTitle=name;

	}
	public static void forceDisplayCommands(IResource resource) {
		getContentProvider().setCurrent(resource);
		setViewTitle(resource.getName());
		AlloyCommandView view = getDefault();		
		if (view==null) return;
		StructuredViewer viewer2=view.getViewer();
		if(viewer2!=null)			
			viewer2.refresh();			
		
		view.setTitle("["+viewTitle+"]");
		//this doesn't do the same. Bien que la doc dise qu'il faille
		//utiliser за а la place c'est vrai :-/ .
		//
//		view.setPartName("["+viewTitle+"]");

	}
	/**
	 * Print in the resultview. 
	 */
	public static void printResult(String string) {
		AlloyCommandView view = getDefault();
		
		StringBuilder sb;
		if (view!=null) {
			
			view.refreshResult(string);
			}
		
		
		//view2.r
	}
	private void refreshResult(String string) {
		StringBuilder sb = getResult();
		sb.replace(0,sb.length(), string);
		ListViewer view2 = null;
		view2=getResultViewer();
		if (view2==null)return;
		
		view2.update(result, null);
		
	}
	private StringBuilder getResult() {
		if (result==null) result=new StringBuilder("No result at this time.");
		return result;	
		
	}
	/**
	 * return the results viewer or null if not created yet. 
	 */
	private ListViewer getResultViewer() {		
		return resultsViewer;
	}
	public static void refresh() {
		AlloyCommandView view = getDefault();
		if(view!=null)
			view.getViewer().refresh();		
	}
}