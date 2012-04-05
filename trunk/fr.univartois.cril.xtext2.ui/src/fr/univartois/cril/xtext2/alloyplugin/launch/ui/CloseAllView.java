package fr.univartois.cril.xtext2.alloyplugin.launch.ui;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.actions.SelectionProviderAction;

import fr.univartois.cril.xtext2.alloyplugin.api.ALSImageRegistry;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext2.alloyplugin.api.IAlloyTreeContentProvider;

/**
 * 
 * @author romuald druelle
 * @author lionel desruelles
 * 
 */
public class CloseAllView extends SelectionProviderAction {

	private static final ImageDescriptor iconclose = ALSImageRegistry
			.getImageDescriptor(ALSImageRegistry.CLOSE_GRAPH_ICON_ID);
	private static final String ACTION_ID = "fr.univartois.cril.alloyplugin.launch.closeallview";

	private static final String TEXT_CLOSE_ALL_VIEWS = "Close All Views";

	private static final String TEXT_CLOSE_ONE_VIEW = "Close Associated View";

	private IALSFile file;

	private TreeViewer viewer;

	private boolean commandRootSelected;

	private IALSCommand ialsc;

	public CloseAllView(TreeViewer provider, IALSFile file) {
		super(provider, TEXT_CLOSE_ALL_VIEWS);
		viewer = provider;
		this.file = file;
		this.setEnabled(true);
		setImageDescriptor(iconclose);
		setToolTipText(TEXT_CLOSE_ALL_VIEWS);
		setActionDefinitionId(ACTION_ID);
	}

	public IALSFile getFile() {
		return this.file;
	}

    public void selectionChanged(IStructuredSelection selection) {
		commandRootSelected = false;
		if (selection.isEmpty())
			commandRootSelected = true;
		else {
			for (Iterator iter = selection.iterator(); iter.hasNext();) {
				Object o = iter.next();
				IAlloyTreeContentProvider contentProvider = (IAlloyTreeContentProvider) viewer
						.getContentProvider();
				if (o == contentProvider.getCommandsRootContent()) {

					if (contentProvider.getChildren(o).length >= 1) {
						this.setEnabled(true);
						commandRootSelected = true;
						setText(TEXT_CLOSE_ALL_VIEWS);
						setToolTipText(TEXT_CLOSE_ALL_VIEWS);
						return;
					}
				} else if (o instanceof IALSCommand) {
					setText(TEXT_CLOSE_ONE_VIEW);
					setToolTipText(TEXT_CLOSE_ONE_VIEW);
					ialsc = (IALSCommand) o;
					this.setEnabled(true);
					return;
				}

			}

		}
		setText(TEXT_CLOSE_ALL_VIEWS);
		setToolTipText(TEXT_CLOSE_ALL_VIEWS);
		commandRootSelected = true;
	}

	public void run() {
		List<IALSCommand> commandes = getFile().getCommand();
		if (commandRootSelected) {
			for (IALSCommand c : commandes) {
				c.closeYourView();
			}
		} else {
			for (IALSCommand c : commandes) {
				if (ialsc.equals(c)) {
					c.closeYourView();
				}
			}
		}

	}

}
