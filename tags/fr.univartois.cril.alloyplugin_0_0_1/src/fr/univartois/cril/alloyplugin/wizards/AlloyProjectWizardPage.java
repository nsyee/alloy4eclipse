package fr.univartois.cril.alloyplugin.wizards;


import org.eclipse.jface.viewers.ISelection;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class AlloyProjectWizardPage extends WizardPage {


	private Text projectText;

	@SuppressWarnings("unused")
	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public AlloyProjectWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Alloy Project");
		setDescription("This wizard creates a new Alloy project.");
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Project name:");

		projectText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		projectText.setLayoutData(gd);
		projectText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		initialize();
		dialogChanged();
		
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		
			
		
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	//private void handleBrowse() {	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
	//IResource container = ResourcesPlugin.getWorkspace().getRoot()
		//		.findMember(new Path(getContainerName()));
		String projectName = getProjectName();

		/*if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}*/
		if (projectName.length() == 0) {
			updateStatus("Project name must be specified");
			return;
		}
		if (projectName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("Project name must be valid");
			return;
		}/*
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("als") == false) {
				updateStatus("File extension must be \"als\"");
				return;
			}
		}*/
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	

	public String getProjectName() {
		return projectText.getText();
	}
}