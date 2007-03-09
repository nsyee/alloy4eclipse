package fr.univartois.cril.alloyplugin.launch.ui;





import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IActionBars;


import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.IViewDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TableViewer;
//import org.eclipse.jface.viewers.*;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.jface.action.*;
import org.eclipse.swt.widgets.Menu;

import org.eclipse.swt.SWT;
import fr.univartois.cril.alloyplugin.launch.Activator;
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
	protected static ViewContentProvider viewContentProvider;
	private TableViewer viewer;
	private Action commandAction;


	private static ImageDescriptor elementImage;
	static {
		URL url = null;
		try {
			url = new URL(Activator.getDefault().getBundle().getEntry("/"),
			"icons/AlloyCommand.gif");
		} catch (MalformedURLException e) {
		}
		elementImage = ImageDescriptor.createFromURL(url);
	}

	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */


	class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			//AlloyRunCommandAction a=(AlloyRunCommandAction) obj;
			//return a.getCommand().toString();
			return getText(obj);
		}
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		public Image getImage(Object obj) {
			//Action a=(Action) obj;
			//if(a==null) {System.out.println("null");return null;}
			//System.out.println("actionID:"+a.getActionDefinitionId());
			//if (a.getImageDescriptor()==null) {System.out.println("null elements");return null;}
			return elementImage.createImage();
			//return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);

		}
		
	}

	/**
	 * The constructor.
	 */
	public AlloyCommandView() {
		defaultAlloyCommandView=this;
//		affiche les view presentes:
/*		
		for (IViewDescriptor viewDescriptor:
			PlatformUI.getWorkbench().getViewRegistry().getViews()){
			System.out.println(viewDescriptor.getId());			
		}
		System.out.println("init");*/
	}
	public void dispose(){
//		System.out.println("dispose");
		defaultAlloyCommandView=null;
	}

	/**
	 * Returns commands view or null. 
	 */
	public static AlloyCommandView getDefault(){

		return defaultAlloyCommandView;

	}

	
	public void createPartControl(Composite parent) {
	//	System.out.println("create");		
		//System.out.println(parent.getLayout());
		//parent.
		//getLayout().
	//	parent.
		//Control control = new Control(null,null){
			//sss(){}
			
	
		//	};// omposite(parent, parent.getStyle());
		/*RowLayout rowLayout = new RowLayout();
 		rowLayout.wrap = true;
 		rowLayout.fill = true;
 		rowLayout.pack = false;
 		rowLayout.justify = false;
 		rowLayout.type = SWT.VERTICAL; 		
 		rowLayout.spacing = 10;
		parent.setLayout(rowLayout);*/
		/*GridLayout gd=new GridLayout(1, false);		
		gd.horizontalSpacing=0;
		gd.marginBottom=0;
		gd.marginRight=0;
		gd.marginTop=1;
		gd.verticalSpacing=1;		
		gd.marginWidth=1;	
		gd.marginHeight=1;
		gd.marginLeft=0;*/
		//parent.setLayout(gd);
		//Composite container = new Composite(parent, SWT.NULL);
		//container.setLayout(new RowLayout());		
		//Composite container2 = new Composite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		//container2.setLayout(new RowLayout());
		//Label label = new Label(container, SWT.NULL);		
		//Color color = new Color(null, 255,255,255);
		//label.setBackground(color);
		//label.setText("[File name]");
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);		
		//System.out.println("layout:"+viewer.getTable().getLayout());
		
		viewer.setContentProvider(getContentProvider());		
		viewer.setLabelProvider(new ViewLabelProvider());		
		viewer.setInput(getViewSite());
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();		

	};

	private static  ViewContentProvider getContentProvider() {
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
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);		
		getSite().registerContextMenu(menuMgr, viewer);
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
		commandAction = new CommandAction(viewer);
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
		viewer.addDoubleClickListener(new IDoubleClickListener() {
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
		viewer.getControl().setFocus();
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
		return viewer;
	}
	/**
	 * Sets commands from a file to the ContentProvider.
	 * */
	public static void setCommands(ExecutableCommand[] elements,String filename) {		
		((ViewContentProvider) getContentProvider()).setElements(filename,elements);		
		
	}
	
	/**
	 * Displays the commands of a file.
	 * (if setCommand() has been called before with the same file)	 
	 */
	public static void displayCommands(String fileLocation) {
		getContentProvider().setCurrentId(fileLocation);
		AlloyCommandView view = getDefault();
		if(view!=null)
		{
			StructuredViewer viewer2=view.getViewer();
			if(viewer2!=null)
				viewer2.refresh();
		}
	}
}