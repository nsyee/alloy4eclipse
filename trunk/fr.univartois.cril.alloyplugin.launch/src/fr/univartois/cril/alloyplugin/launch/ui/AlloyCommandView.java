package fr.univartois.cril.alloyplugin.launch.ui;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.jface.action.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.ui.IALSFile;


;
/**
 * This view displays Alloy commands to be executed.
 * The view uses a content provider and a label provider to define how model
 * objects should be presented. 
 * 
 */

public class AlloyCommandView extends ViewPart{
	private static final String DEFAULT_CONTENT_DESCRIPTION = "no file opened.";

	/**
	 * the Alloy command view. 
	 */
	protected static AlloyCommandView defaultAlloyCommandView;

	private static String viewContentDescription=DEFAULT_CONTENT_DESCRIPTION;
	/**
	 * viewer used for commands display. 
	 */
	private TableViewer commandsViewer;
	/**
	 * viewer used for results display. 
	 */
	private ListViewer resultsViewer;
	/**
	 * this action is added in the view for launching selected commands. 
	 */
	private LaunchCommandAction commandAction;	
	/**
	 * the result to be displayed. 
	 */
	private myString result=null;

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
		//TODO implements this dispose method?
		defaultAlloyCommandView=null;
	}

	/**
	 * Returns commands view or null if not created yet. 
	 */
	public static AlloyCommandView getDefault(){
		return defaultAlloyCommandView;

	}

	/**
	 * Creates the SWT controls for this workbench part.
	 * the workbench calls this method when it needs to.
	 * Create one or more controls within the parent. 
	 * Set the parent layout as needed. 
	 * Register any global actions with the site's IActionBars. 
	 * Register any context menus with the site. 
	 * 
	 */
	public void createPartControl(Composite parent) {		

		FillLayout layout = new FillLayout();
		layout.type=SWT.VERTICAL;
		parent.setLayout(layout);
		commandsViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		commandsViewer.setContentProvider(ViewContentProvider.getContentProvider());		
		commandsViewer.setLabelProvider(new ViewLabelProvider());		
		commandsViewer.setInput(this);
		//setViewTitle(viewTitle);
		setContentDescription("["+viewContentDescription+"]");
		resultsViewer=new ListViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);		
		/*commandsViewer.addSelectionChangedListener(new ISelectionChangedListener(){
			public void selectionChanged(SelectionChangedEvent event) {
				//if (event.getSelection().isEmpty()) AlloyCommandView.this.refreshResult(string);

			}});*/
		resultsViewer.add(getResult());		
		//setPartName("["+viewTitle+"]");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();		

	};


	/**
	 * create popup menu. 
	 */
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
	/**
	 * contribute to action bars.
	 * */
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
		commandAction = new LaunchCommandAction(commandsViewer);		
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
	 * NOT USED AT THIS TIME
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
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * returns Commands viewer; 
	 */
	private StructuredViewer getCommandsViewer() {		
		return commandsViewer;
	}


	/**
	 * 
	 * Remove Commands of a resource.
	 * */
	public static void removeCommandsFromDisplay(IALSFile file) {
		ViewContentProvider.getContentProvider().removeElements(file);
		//getContentProvider().setCurrent(null);		
		refreshCommands();
	}

	/**
	 * update Description of the view.
	 */

	protected static void setViewContentDescription(IALSFile newFile) {
		if( newFile==null) viewContentDescription=DEFAULT_CONTENT_DESCRIPTION;
		else
			viewContentDescription=newFile.getResource().getName();
	}
	/**
	 * Refresh Commands. If commands have been changed (setSat) since last refresh, 
	 * the changes will be displayed.	  
	 */
	public static void refreshCommands() {
		Display display = PlatformUI.getWorkbench().getDisplay();		
		if (display!=null)//demande a display d'executer le update (dans un thread graphique)
			display.syncExec(
					new Runnable() {
						public void run(){
							AlloyCommandView view = getDefault();		
							if (view==null) return;		
							view.setContentDescription("["+viewContentDescription+"]");
							StructuredViewer viewer2=view.getCommandsViewer();
							if(viewer2!=null)			
							{
								viewer2.refresh();
							}						
						}
					});
					
	}
	/**
	 * Print in the resultview.
	 * @deprecated : resultView will be deleted soon (or moved in another view part), RIP.
	 */
	public static void printResult(String string) {
		AlloyCommandView view = getDefault();		
		if (view!=null) {			
			view.refreshResult(string);
		}		
		//view2.r
	}
	/**@deprecated*/
	private void refreshResult(final String string) {
		myString res = getResult();
		res.update(string);
		//sb.replace(0,sb.length(), string);

		Display display = PlatformUI.getWorkbench().getDisplay();		
		if (display!=null)//demande a display d'executer le update (dans un thread graphique)
			display.syncExec(
					new Runnable() {
						public void run(){
							ListViewer view2 = null;
							view2=getResultViewer();
							if (view2==null)return;							
							view2.refresh(result);						
						}
					});


	}
	/**@deprecated*/
	private myString getResult() {
		if (result==null) result=new myString("No result at this time.");
		return result;	

	}
	/**
	 * return the results viewer or null if not created yet. 
	 */
	/**@deprecated*/
	private ListViewer getResultViewer() {		
		return resultsViewer;
	}
	/**
	 * refresh AlloyCommandview.
	 */
	public static void refresh() {
		// SWT THREAD PROBLEM FIX
		Display display = PlatformUI.getWorkbench().getDisplay();		
		if (display!=null)//demande a display d'executer le update (dans un thread graphique)
			display.syncExec(
					new Runnable() {
						public void run(){
							AlloyCommandView view = getDefault();
							if(view==null) return;
							view.getCommandsViewer().refresh();
						}
					});


	}







}