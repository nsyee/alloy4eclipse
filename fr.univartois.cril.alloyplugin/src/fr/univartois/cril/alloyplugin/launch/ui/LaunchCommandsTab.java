package fr.univartois.cril.alloyplugin.launch.ui;

import java.util.ArrayList;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import fr.univartois.cril.alloyplugin.core.ui.ALSFileFactory;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.launch.AlloyLaunching;
import fr.univartois.cril.alloyplugin.launch.ExecutableCommand;

public class LaunchCommandsTab extends AbstractLaunchConfigurationTab {

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

	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout());
		/*container.setLayout(new GridLayout(1, false));
		container.setFont(parent.getFont());
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		//gd.horizontalSpan = hspan;
		container.setLayoutData(gd);
		//((GridLayout)container.getLayout()).verticalSpacing = 0;

		Group container2 = new Group(container, SWT.NONE);
		container2.setText("&Commands:");
		container2.setLayout(new GridLayout(1, false));
		container2.setFont(container.getFont());
		GridData gd2 = new GridData(GridData.FILL_BOTH);
		//gd.horizontalSpan = hspan;
		container2.setLayoutData(gd2);
		//((GridLayout)container2.getLayout()).verticalSpacing = 0;

		//System.out.println("createcontrol:"+System.currentTimeMillis());
		//container = new Composite(parent, SWT.NULL);
		//FillLayout layout = new FillLayout(SWT.VERTICAL);
		//container.setLayout(layout);
		//layout.numColumns = 3;		
		//layout.verticalSpacing = 9;

		label = new Label(container2, SWT.NULL);

		//	label.setText("&Commands from: "+file.getResource().getName());

		label.setText("&From:");*/
		commandsViewer = new CheckboxTableViewer(new Table(container, SWT.H_SCROLL | SWT.V_SCROLL));		
		commandsViewer.setContentProvider(new CommandsContentProvider());
		//System.out.println("createControl:file:"+file);
		//commandsViewer.setInput(file);				
		commandsViewer.setLabelProvider(new CommandsLabelProvider());		

		setControl(container);

	}

	public String getName() {
		//get
		return "Choose Alloy Commands (not finish)";
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
			currentALSFile=null;//updateStatus("No Alloy file selected");
			
		}
		else
		{
			currentALSFile=ALSFileFactory.getALSFile(resource);
			System.out.println("current:"+currentALSFile);
			//provisoire: normalement on demandera de sauvegarder le fichier avant de lancer le launch
			//et le fichier sera donc deja parse. (par le builder dans un thread a part, car ici c'est un thread graphique (il me semble))
			//if (currentALSFile!=null)
				//AlloyLaunching.launchParser(currentALSFile);
		}

	}
/**
 * Refresh the control for this tab.
 * */
	private void initializeTabControls() {
		if(commandsViewer!=null) 
		{
			System.out.println("setinput00045:"+currentALSFile);
			commandsViewer.setInput(currentALSFile);			
		}
		/*if(label!=null&&currentALSFile!=null)label.setText("&From: "+currentALSFile.getResource().getName());
		else label.setText("&From: ");*/
		if(container!=null)container.update();
		
	}

	/**
	 * Check the parameters modifyed by this tab.
	 * */
	private void checkConfig(){
		if (currentResource==null)
		{
			updateStatus("Alloy file not selected.");
			return;
		}
		if (currentALSFile==null)
		{
			updateStatus("The selected file isn't an Alloy file.");
			return;
		}
		if (currentALSFile.getCommand().size()==0)
		{
			updateStatus("The selected Alloy file doesn't contains any commands.");
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

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		checkConfig();
	}
	/**
	 * this method return if this tab authorize running.
	 * */
	public boolean isValid(ILaunchConfiguration launchConfig) {		
		return valid;
	}
	/**
	 * This method is called when a configuration is created.
	 * All informations have to been stored in the configuration, not in this class fields
	 * because this class can be disposed and re-created later.	 
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {


		IResource[] resources=null;
		try {			
			resources = configuration.getMappedResources();

		} catch (CoreException e) {

			e.printStackTrace();
		}
		if (resources==null)		
		{
			IALSFile file=getALSFileFromContext();
			if(file!=null)
			{				
				configuration.rename(file.getResource().getName());
				resources=new IResource[1];
				resources[0]=file.getResource();
				configuration.setMappedResources(resources);

			}
		}
		//ajoute une liste de commandes a la configuration (vide pour l'instant) 
		configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LIST,new ArrayList());

		//IALSFile file = getALSFile();
		//List<IALSFile> list = new ArrayList<IALSFile>();
		//list.add(file.getCommand());

		//file.s
		//configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_MAP, list);
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


}
