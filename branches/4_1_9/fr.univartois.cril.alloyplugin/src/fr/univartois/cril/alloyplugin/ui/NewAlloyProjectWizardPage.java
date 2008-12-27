package fr.univartois.cril.alloyplugin.ui;


import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
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

import fr.univartois.cril.alloyplugin.AlloyPlugin;


/**
 * New Alloy project wizard Page.
 * */
public class NewAlloyProjectWizardPage extends WizardPage {


	private static ImageDescriptor wizardImage;
	private Text projectText;
	static {
		URL url = null;
		try {
			url = new URL(AlloyPlugin.getDefault().getBundle().getEntry("/"),
			"icons/AlloyLogo.gif");
		} catch (MalformedURLException e) {
		}
		wizardImage = ImageDescriptor.createFromURL(url);
	}
	
	

	/**
	 * Constructor for New Project Wizard Page.
	 * 
	 * @param pageName
	 */
	public NewAlloyProjectWizardPage(ISelection selection) {
		//super();
		super("wizardPage","Alloy Project", wizardImage	);
		
		setDescription("This wizard creates a new Alloy project.");
		
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