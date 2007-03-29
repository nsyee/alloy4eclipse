package fr.univartois.cril.alloyplugin.launch.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
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
		System.out.println("layout:"+parent.getLayout());
		Label label = new Label(container, SWT.NULL);
		label.setText("&Commands:");		
		commandsViewer = new TableViewer(container, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		//commandsViewer.setContentProvider(CommandsFromALSFileProvider.getContentProvider());
		
		ExecutableCommand[] exec_cmds = ViewContentProvider.getContentProvider().getCommands(getALSFile());
		if(exec_cmds==null){
			exec_cmds=AlloyLaunching.launchParser(getALSFile());
		}
		
		
		//commandsViewer.add();
		commandsViewer.setLabelProvider(new ViewLabelProvider());		
		//commandsViewer.setInput(this);
		setControl(container);

	}

	public String getName() {
		//get
		return "Choose Alloy Commands (not finish)";
	}


	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub


	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub

	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		//IALSFile file = getALSFile();
		//List<IALSFile> list = new ArrayList<IALSFile>();
		//list.add(file);
		
		//file.s
		//configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_MAP, list);
	}
	
	private IALSFile getALSFile() {
		if (file==null) file=getALSFileFromContext();
		return file;
	}

	protected IALSFile getALSFileFromContext() {

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
					/*if (obj instanceof IResource) {
						IJavaElement je = JavaCore.create((IResource)obj);
						if (je == null) {
							IProject pro = ((IResource)obj).getProject();
							je = JavaCore.create(pro);
						}
						if (je != null) {
							return je;
						}
					}*/
				}
			}
			IEditorPart part = page.getActiveEditor();
			if (part != null) {
				IEditorInput input = part.getEditorInput();
				return (IALSFile) input.getAdapter(IALSFile.class);
			}
		}
		return null;
	}


}
