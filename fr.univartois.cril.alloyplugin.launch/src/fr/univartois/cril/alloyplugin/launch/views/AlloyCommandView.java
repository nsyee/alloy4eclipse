package fr.univartois.cril.alloyplugin.launch.views;




import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;

import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;

import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import fr.univartois.cril.alloyplugin.launch.Activator;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.launch.CommandAction;


/**
 * 
 * The view uses a label provider to define how model
 * objects should be presented in the view. 
 * 
 */

public class AlloyCommandView extends ViewPart {
	protected static AlloyCommandView defaultAlloyCommandView;
	private TableViewer viewer;
	private Action action1;
	
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

	class ViewContentProvider implements IStructuredContentProvider {
		ExecutableCommand[] elements={};
		
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		
		}			
		public void dispose() {
			System.out.println("dispose");
		}
		public void setElements(ExecutableCommand []elements){
			this.elements=elements;				
		}
		public ExecutableCommand[] getElements(Object parent) {		
			return elements;					
		}
		
	}
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
		/*
		for (IViewDescriptor viewDescriptor:PlatformUI.getWorkbench().getViewRegistry().getViews()){
			System.out.println(viewDescriptor.getId());			
		}
		*/
	}
	public void dispose(){
		defaultAlloyCommandView=null;
	}
	public static AlloyCommandView getDefault(){
		/*IViewDescriptor vd = PlatformUI.getWorkbench().getViewRegistry().find("fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView");
		if (vd!=null)
			try {
				return (AlloyCommandView) vd.createView();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView");				
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
				
		return defaultAlloyCommandView;

	}
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());		
		viewer.setLabelProvider(new ViewLabelProvider());		
		viewer.setInput(getViewSite());
		
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
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
		manager.add(action1);
		manager.add(new Separator());
		
	}

	private void fillContextMenu(IMenuManager manager) {		
		manager.add(action1);
		
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		
	}

	private void makeActions() {
		action1 = new CommandAction(viewer);
		
		
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
				action1.run();
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
	public ContentViewer getViewer(){
		return viewer;
	}
	private ViewContentProvider getContentProvider(){
		return (ViewContentProvider) viewer.getContentProvider();
	}
	public void setElements(ExecutableCommand[] elements) {
		getContentProvider().setElements(elements);	
		viewer.refresh();		
			}
}