package fr.univartois.cril.alloyplugin.launch.ui;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import fr.univartois.cril.alloyplugin.core.ui.ALSFileFactory;
import fr.univartois.cril.alloyplugin.core.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;
import fr.univartois.cril.alloyplugin.launch.util.Util;

public class LaunchCommandsTab extends AbstractLaunchConfigurationTab implements ICheckStateListener {

	private CheckboxTableViewer commandsViewer;
	private Label label;
	private IALSFile currentALSFile;
	Composite container;
	/**
	 * Config being modified
	 */
	private ILaunchConfiguration launchConfig;
	private IResource currentResource;
	private boolean valid;


	public LaunchCommandsTab() {
		super();

		System.out.println("construct:"+System.currentTimeMillis());
	}

	public boolean canSave(){
		return true;

	}


	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.CHECK);
		FillLayout layout = new FillLayout();
		layout.spacing=10;
		layout.marginHeight=10;
		layout.marginWidth=10;
		container.setLayout(layout);
		Group group = new Group(container, SWT.NONE);
		group.setText("&Commands:");
		group.setLayout(new FillLayout());
		group.setFont(container.getFont());		
		label = new Label(group, SWT.NULL);
		label.setText("&From:");
		commandsViewer = new CheckboxTableViewer(new Table(group, SWT.CHECK|SWT.H_SCROLL | SWT.V_SCROLL));
		commandsViewer.addCheckStateListener(this);
		commandsViewer.setContentProvider(new CommandsContentProvider2());
		//System.out.println("createControl:file:"+file);
		commandsViewer.setLabelProvider(new CommandsLabelProvider2());
		setControl(container);

	}

	public String getName() {		
		return "Choose Alloy Commands";
	}


	public void initializeFrom(ILaunchConfiguration configuration) {
		this.launchConfig=configuration;
		IResource resource=null;
		try {
			IResource[] res = configuration.getMappedResources();			
			if(res!=null&&res.length>0)
			{
				resource=res[0];
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		initializeTabFields(resource);
		initializeTabControls();
		checkConfig();
	}

	/**
	 * update tab fields. 
	 */
	private void initializeTabFields(IResource resource) {
		System.out.println("resource:"+resource);
		valid=false;
		currentResource=resource;
		if (resource==null)
		{
			currentALSFile=null;

		}
		else
		{
			currentALSFile=ALSFileFactory.getALSFile(resource);						
		}

	}
	/**
	 * Refresh the control for this tab.
	 * 
	 * */
	private void initializeTabControls()  {
		if(commandsViewer!=null) 
		{			
			commandsViewer.setInput(currentALSFile);
			if(currentALSFile!=null){
				List commandLabelList;
				try {
					commandLabelList = launchConfig.getAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST, new ArrayList());

					for (Object object : commandLabelList) {
						String commandLabel=(String)object;
						IALSCommand cmd = currentALSFile.getCommand(commandLabel);
						if(cmd!=null)commandsViewer.setChecked(cmd, true);
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if(label!=null&&currentALSFile!=null)label.setText("&From: "+currentALSFile.getResource().getName());
		else label.setText("&From: ");
		if(container!=null)container.update();

	}

	/**
	 * Check the parameters modifyed by this tab. set if valid or not.
	 * */
	private void checkConfig(){

		if (currentResource==null)
		{
			updateStatus("Alloy file not selected.");
			return;
		}
		if (currentALSFile==null)
		{
			updateStatus("Selected file isn't an Alloy file.");
			return;
		}
		if (currentALSFile.getCommand().size()==0)
		{
			updateStatus("Selected Alloy file doesn't contains any commands.");
			return;
		}
		if (commandsViewer.getCheckedElements().length==0)
		{

			updateStatus("Choose one commands please.");
			return;
		}

		updateStatus(null);

	}
	/**
	 * Update Status. Display an error message.
	 * If the message is null the tab is declared valid. 
	 */
	private void updateStatus(String message) {

		setErrorMessage(message);
		valid=(message==null);

	}

	/*
	 * save changes in configuration.
	 * */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {		
		List<String> list=new ArrayList<String>();
		Object[] selectedCommands = commandsViewer.getCheckedElements();
		System.out.println("perform aplly:");
		for (Object object : selectedCommands) {
			list.add(((ExecutableCommand)object).getName());
			System.out.println("add:"+((ExecutableCommand)object).getName());
		}
		configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST,list);

	}
	/**
	 * this method return if this tab authorize running.
	 * */
	public boolean isValid(ILaunchConfiguration launchConfig) {		
		return valid;
	}
	/**
	 * This method is called when a configuration is created.
	 * All default attributes are stored in the configuration.
	 * Informations are taken from context.
	 * 	 
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {

		setdefaultsAttributes(getALSFileFromContext(),configuration);


	}


	/**
	 * This method set all Alloy commands launching defaults attributes to a launch configuration.
	 * All informations are taken from the als file. 
	 * Clients can use this method to configure their own launch configuration.
	 */
	public void setdefaultsAttributes(IALSFile file,ILaunchConfigurationWorkingCopy configuration) {
		IResource[] resources=null;		
		if(file!=null)
		{				
			String name = DebugPlugin.getDefault().getLaunchManager().generateUniqueLaunchConfigurationNameFrom(file.getResource().getName());
			configuration.rename(name);
			resources=new IResource[1];
			resources[0]=file.getResource();			
			configuration.setMappedResources(resources);			
			configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME,Util.getFileLocation(file.getResource()));
			configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST,new ArrayList<String>());
			List<String> list=new ArrayList<String>();			
			for (IALSCommand cmd : file.getCommand()) {
				list.add(cmd.getName());				
			}
			configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST,list);
		}

	}

	private IALSFile getALSFileFromContext() {

		IWorkbenchPage page =
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		System.out.println("getcontext");
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
						//TODO stores all the selected commands from context
						//for selecting them by default
						//in LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LIST;
						IResource res = ((ExecutableCommand)obj).getResource();
						IALSFile file=ALSFileFactory.getALSFile(res);
						if(file!=null) return file;						
					}
					if (obj instanceof IResource) {
						System.out.println("resource selected");
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

	public void checkStateChanged(CheckStateChangedEvent event) {		
		checkConfig();
		this.updateLaunchConfigurationDialog();	 
	}


}
