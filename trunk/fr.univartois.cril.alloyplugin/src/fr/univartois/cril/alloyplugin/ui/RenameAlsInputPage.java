package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ltk.ui.refactoring.UserInputWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.RenameAlsInfo;


/**
 * 
 * @author desruelles lionel
 *
 */
public class RenameAlsInputPage extends UserInputWizardPage {

	private static final String DS_KEY = RenameAlsInputPage.class.getName();
	private static final String DS_UPDATE_BUNDLE = "UPDATE_BUNDLE"; //$NON-NLS-1$
	private static final String DS_ALL_PROJECTS = "ALL_PROJECTS"; //$NON-NLS-1$

	private final RenameAlsInfo info;

	private IDialogSettings dialogSettings;
	private Text txtNewName;
	private Button cbUpdateBundle;
	private Button cbAllProjects;

	public RenameAlsInputPage(final RenameAlsInfo info) {
		super(RenameAlsInputPage.class.getName());
		this.info = info;
		initDialogSettings();
	}

	public void createControl(final Composite parent) {
		Composite composite = createRootComposite(parent);
		setControl(composite);

		createLblNewName(composite);
		createTxtNewName(composite);
		createCbUpdateBundle(composite);
		createCbAllProjects(composite);

		validate();
	}

	private Composite createRootComposite(final Composite parent) {
		Composite result = new Composite(parent, SWT.NONE);
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginWidth = 10;
		gridLayout.marginHeight = 10;
		result.setLayout(gridLayout);
		initializeDialogUnits(result);
		Dialog.applyDialogFont(result);
		return result;
	}

	private void createLblNewName(final Composite composite) {
		Label lblNewName = new Label(composite, SWT.NONE);
		lblNewName.setText("New name :");
	}

	private void createTxtNewName(Composite composite) {
		txtNewName = new Text(composite, SWT.BORDER);
		txtNewName.setText(info.getOldName());
		txtNewName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtNewName.selectAll();
		txtNewName.addKeyListener(new KeyAdapter() {
			public void keyReleased(final KeyEvent e) {
				info.setNewName(txtNewName.getText());
				validate();
			}
		});
	}

	private void createCbUpdateBundle(final Composite composite) {
		String texts = "Update all Alloy files in the same bundle";
		cbUpdateBundle = createCheckbox(composite, texts);
		cbUpdateBundle.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent event) {
				boolean selected = cbUpdateBundle.getSelection();
				dialogSettings.put(DS_UPDATE_BUNDLE, selected);
				info.setUpdateBundle(selected);
			}
		});
		initUpdateBundleOption();
	}

	private void createCbAllProjects(final Composite composite) {
		String text = "Update all projects in the workspace (forces preview)";
		cbAllProjects = createCheckbox(composite, text);
		cbAllProjects.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(final SelectionEvent event) {
				boolean selected = cbAllProjects.getSelection();
				dialogSettings.put(DS_ALL_PROJECTS, selected);
				info.setAllProjects(selected);
				getRefactoringWizard().setForcePreviewReview(selected);
			}
		});
		initAllProjectsOption();
	}

	private Button createCheckbox(final Composite composite, final String text) {
		Button result = new Button(composite, SWT.CHECK);
		result.setText(text);

		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = 2;
		result.setLayoutData(gridData);

		return result;
	}

	private void initDialogSettings() {
		IDialogSettings ds = AlloyPlugin.getDefault().getDialogSettings();
		dialogSettings = ds.getSection(DS_KEY);
		if (dialogSettings == null) {
			dialogSettings = ds.addNewSection(DS_KEY);
			//modif
			dialogSettings.put(DS_UPDATE_BUNDLE, false);
			dialogSettings.put(DS_ALL_PROJECTS, false);
		}
	}

	private void validate() {
		String txt = txtNewName.getText();
		setPageComplete(txt.length() > 0 && !txt.equals(info.getOldName()));
	}

	private void initUpdateBundleOption() {
		boolean updateRefs = dialogSettings.getBoolean(DS_UPDATE_BUNDLE);
		cbUpdateBundle.setSelection(updateRefs);
		info.setUpdateBundle(updateRefs);
	}

	private void initAllProjectsOption() {
		boolean allProjects = dialogSettings.getBoolean(DS_ALL_PROJECTS);
		cbAllProjects.setSelection(allProjects);
		info.setAllProjects(allProjects);
	}

}
