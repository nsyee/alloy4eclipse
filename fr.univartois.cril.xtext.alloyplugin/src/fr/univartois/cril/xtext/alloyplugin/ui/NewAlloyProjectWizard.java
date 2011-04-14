package fr.univartois.cril.xtext.alloyplugin.ui;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import fr.univartois.cril.xtext.alloyplugin.ProjectNature;
import fr.univartois.cril.xtext.alloyplugin.preferences.AlloyPreferencePage;

/**
 * New Alloy project wizard.
 * */
public class NewAlloyProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {
	private NewAlloyProjectWizardPage page;
	private ISelection selection;
	private IConfigurationElement configElement;

	@Override
	public boolean performFinish() {
		// final String containerName = page.getContainerName();
		final String fileName = page.getProjectName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
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
			MessageDialog.openError(getShell(), "Error",
					realException.getMessage());
			return false;
		}

		BasicNewProjectResourceWizard.updatePerspective(configElement);

		// selectAndReveal(fSecondPage.getJavaProject().getProject());

		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	public void addPages() {
		page = new NewAlloyProjectWizardPage(selection);
		addPage(page);
	}

	private void doFinish(
	// String containerName,
			String fileName, IProgressMonitor monitor) throws CoreException {
		createProject(fileName, monitor);
	}

	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		configElement = config;
	}

	/**
	 * Create the Alloy project with specified name.
	 * */
	private void createProject(String projectName, IProgressMonitor monitor)
			throws CoreException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		IProjectDescription description = ResourcesPlugin.getWorkspace()
				.newProjectDescription(project.getName());
		description.setNatureIds(new String[] { ProjectNature.NATURE_ID });
		project.create(monitor);// description,monitor);
		project.open(monitor);
		
		IPath to=new Path(AlloyPreferencePage
				.getA4SampleModelsPath());
		
		
		File models=new File(to.toOSString());
		for(File f :models.listFiles()){
			IFolder file = project.getFolder(f.getName());
			
			try {
				
				file.createLink(Path.fromOSString(f.getCanonicalPath()),IResource.NONE,monitor);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		project.setDescription(description, monitor);

		
		
	}

}
