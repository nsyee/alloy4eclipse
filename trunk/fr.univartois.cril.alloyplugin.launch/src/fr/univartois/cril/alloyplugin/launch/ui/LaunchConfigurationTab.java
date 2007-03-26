package fr.univartois.cril.alloyplugin.launch.ui;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class LaunchConfigurationTab extends AbstractLaunchConfigurationTab {

	private TableViewer commandsViewer;

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
		commandsViewer.setContentProvider(AlloyCommandView.getContentProvider());		
		commandsViewer.setLabelProvider(new ViewLabelProvider());		
		commandsViewer.setInput(this);
		setControl(container);
	}

	public String getName() {
		
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

	}

}
