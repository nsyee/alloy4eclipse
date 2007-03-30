package fr.univartois.cril.alloyplugin.launch.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import fr.univartois.cril.alloyplugin.core.ui.ALSFileFactory;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.ui.IALSFile;

public class LaunchConfigurationTab extends AbstractLaunchConfigurationTab {

	private TableViewer commandsViewer;
	private IALSFile file;

	public void createControl(Composite parent) {	

		Composite container = new Composite(parent, SWT.NULL);
		RowLayout layout = new RowLayout(SWT.VERTICAL);
		container.setLayout(layout);
		//layout.numColumns = 3;		
		//layout.verticalSpacing = 9;

		Label label = new Label(container, SWT.NULL);
		label.setText("&Commands:");		
		commandsViewer = new TableViewer(container, SWT.H_SCROLL | SWT.V_SCROLL);
		commandsViewer.setContentProvider(new CommandsProvider());
		System.out.println("createControl:"+file);
		commandsViewer.setInput(file);				
		commandsViewer.setLabelProvider(new CommandsLabelProvider());		
		
		setControl(container);

	}

	public String getName() {
		//get
		return "Choose Alloy Commands (not finish)";
	}


	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		System.out.println("initialize from");

	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		System.out.println("perform apply:file:"+file);
	}


	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		//if (file==null) file=getALSFileFromContext();
		System.out.println("set default");		
		IResource[] resources=null;
		try {			
			resources = configuration.getMappedResources();

		} catch (CoreException e) {

			e.printStackTrace();
		}
		if (resources==null)		
		{
			System.out.println("resource null");
			file=getALSFileFromContext();
			if(file!=null)
			{			
				System.out.println("set default : viewer:"+commandsViewer);
				System.out.println("set default: file:"+file);
				resources=new IResource[1];
				resources[0]=file.getResource();
				configuration.setMappedResources(resources);

			}
		}
		//configuration.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_MAIN_FILE, (List)null);
		// TODO Auto-generated method stub
		//IALSFile file = getALSFile();
		//List<IALSFile> list = new ArrayList<IALSFile>();
		//list.add(file);

		//file.s
		//configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_MAP, list);
	}

	

	private IALSFile getALSFileFromContext() {

		IWorkbenchPage page =
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		if (page != null) {
			ISelection selection = page.getSelection();			
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection ss = (IStructuredSelection)selection;
				if (!ss.isEmpty()) {
					Object obj = ss.getFirstElement();
					if (obj instanceof IALSFile) {
						return (IALSFile)obj;
					}
					if (obj instanceof ExecutableCommand) {
						//TODO stores all the selected commands from selection
						IResource res = ((ExecutableCommand)obj).getResource();
						IALSFile file=ALSFileFactory.getALSFile(res);
						if(file!=null) return file;						
					}
					if (obj instanceof IResource) {
						IALSFile file= ALSFileFactory.getALSFile((IResource) obj);
						if (file == null) {
							//IProject pro = ((IResource)obj).getProject();
							//je = JavaCore.create(pro);
						}
						if (file != null) {
							return file;
						}
					}
				}
			}
			IEditorPart part = page.getActiveEditor();
			if (part != null) {
				IEditorInput input = part.getEditorInput();
				IResource res=(IResource) input.getAdapter(IResource.class);
				IALSFile file=ALSFileFactory.getALSFile(res);
				if(file!=null) return file;
			}
		}
		return null;
	}


}
