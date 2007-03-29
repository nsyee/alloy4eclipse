package fr.univartois.cril.alloyplugin.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import fr.univartois.cril.alloyplugin.ProjectNature;

public class AlloyProjectWizard extends Wizard implements INewWizard,IExecutableExtension {
	private AlloyProjectWizardPage page;
	private ISelection selection;
	private IConfigurationElement configElement;
	public AlloyProjectWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean performFinish() {
//		final String containerName = page.getContainerName();
		final String fileName = page.getProjectName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}

		BasicNewProjectResourceWizard.updatePerspective(configElement);
		
		//selectAndReveal(fSecondPage.getJavaProject().getProject());

		return true;
	}


	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;

	}


	public void addPages() {
		page = new AlloyProjectWizardPage(selection);
		addPage(page);
	}

	private void createProject(String projectName, IProgressMonitor monitor) throws CoreException
	{

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		IProject project = root.getProject(projectName);
		IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
		//TODO create a Alloy nature which works
		description.setNatureIds(new String[] {ProjectNature.NATURE_ID});
		/*ICommand command = description.newCommand();
		//TODO create a Alloy builder	      
		// command.setBuilderName("Alloy builder");
		description.setBuildSpec(new ICommand[] { command });*/

		project.create(monitor);//description,monitor);
		project.open(monitor);
		project.setDescription(description, null);
		
	}
	private void doFinish(
			//String containerName,
			String fileName,
			IProgressMonitor monitor)
	throws CoreException {

		createProject(fileName,monitor);
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		 configElement=config;		 
	}


}
