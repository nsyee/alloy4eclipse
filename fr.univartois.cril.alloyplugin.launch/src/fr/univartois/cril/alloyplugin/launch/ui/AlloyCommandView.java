package fr.univartois.cril.alloyplugin.launch.ui;




import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;

import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.IViewDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;

import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import fr.univartois.cril.alloyplugin.launch.Activator;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.ui.IAlloyEditorListener;
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
//		affiche les view présentes:
		/*
		for (IViewDescriptor viewDescriptor:PlatformUI.getWorkbench().getViewRegistry().getViews()){
			System.out.println(viewDescriptor.getId());			
		}*/
		System.out.println("init");
	}
	public void dispose(){
		System.out.println("dispose");
		defaultAlloyCommandView=null;
	}
	public static AlloyCommandView getDefault(){
		if(defaultAlloyCommandView==null){
			try {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();			
				if (window!=null) 
				{System.out.println("ici");
					IWorkbenchPage page=window.getActivePage();				
					if (page!=null)
						return (AlloyCommandView) page.showView("fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView");
					else System.out.println("page null");
				}
			} catch (PartInitException e) {
				// TODO display error message?
				e.printStackTrace();
			}
		}
		return defaultAlloyCommandView;

	}
	
	public void createPartControl(Composite parent) {
		System.out.println("create");
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(getContentProvider());		
		viewer.setLabelProvider(new ViewLabelProvider());		
		viewer.setInput(getViewSite());

		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		/*IPropertyListener l = ;
		};*/
		/*
		this.addPropertyListener(new IPropertyListener(){
			public void propertyChanged(Object source,int propId){
				System.out.println("coucou");}
		}
		);*/

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
	 * Set elements to the ContentProvider and display them.
	 * */
	public static void setElements(ExecutableCommand[] elements) {
		System.out.println("set elements");
		
		((ViewContentProvider) getContentProvider()).setElements(elements);		
		AlloyCommandView view = getDefault();
		StructuredViewer viewer2 = null;
		if(view!=null)
			viewer2=view.getViewer();
		if(viewer2!=null)
			viewer2.refresh();		
	}
	/**
	 * returns viewer; 
	 */
	private StructuredViewer getViewer() {		
		return viewer;
	}
}