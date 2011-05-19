package fr.univartois.cril.xtext.alloyplugin.editor;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ContentAssistAction;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.osgi.framework.Bundle;

import fr.univartois.cril.xtext.ui.activator.AlsActivator;
import fr.univartois.cril.xtext.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext.alloyplugin.core.ALSFileFactory;

/**
 * Class for Alloy editor.
 */

public class ALSEditor extends TextEditor {

		private ProjectionSupport projectionSupport;
	private ProjectionAnnotationModel annotationModel;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();

		projectionSupport = new ProjectionSupport(viewer,
				getAnnotationAccess(), getSharedColors());
		projectionSupport.install();

		// turn projection mode on
		viewer.doOperation(ProjectionViewer.TOGGLE);

		annotationModel = viewer.getProjectionAnnotationModel();

		parent.addDisposeListener(new MyCloseListener());
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent,
			IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new ProjectionViewer(parent, ruler,
				getOverviewRuler(), isOverviewRulerVisible(), styles);

		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);

		return viewer;
	}

	/**
	 * Method called at editor initialization. Set the SourceViewer.
	 * 
	 * @see org.eclipse.ui.editors.text.TextEditor#initializeEditor()
	 */
	protected void initializeEditor() {
		super.initializeEditor();
		// Attache la configuration
		setSourceViewerConfiguration(new ALSSourceViewerConfiguration(this));
	}

	/**
	 * Used for content outline
	 */

	@SuppressWarnings("unchecked")
    public Object getAdapter(Class required) {

		return super.getAdapter(required);
	}

	@Override
	protected void createActions() {
		super.createActions();
		ResourceBundle aResourceBundle = null;
		try {
			aResourceBundle = ResourceBundle.getBundle("messages");
		} catch (MissingResourceException exception1) {
			Bundle alloyBundle = AlsActivator.getDefault().getBundle();
			try {
				InputStream messageStream = FileLocator.openStream(alloyBundle,
						new Path("$ln$/messages.properties"), true);
				aResourceBundle = new PropertyResourceBundle(messageStream);
			} catch (IOException exception2) {
				MultiStatus ms = new MultiStatus(alloyBundle.getSymbolicName(),
						IStatus.ERROR,
						"Cannot load A4E 'messages' properties resource.",
						exception2);
				ms.add(new Status(IStatus.ERROR, alloyBundle.getSymbolicName(),
						IStatus.ERROR, exception1.getMessage(), exception1));
				AlsActivator.getDefault().getLog().log(ms);
				return;
			}
		}

		IAction action = new ContentAssistAction(aResourceBundle,
				"ContentAssistProposal.", this); //$NON-NLS-1$
		action
				.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction("actionId", action); //$NON-NLS-1$
		markAsStateDependentAction("actionId", true); //$NON-NLS-1$
		PlatformUI.getWorkbench().getHelpSystem().setHelp(action,
				"helpContextId");

	}

	/**
	 * Try to return an IResource from IEditorInput. Returns null if no such
	 * object can be found.
	 */
	public IResource getResource(IEditorInput input) {
		if (input == null)
			return null;
		IResource ir = (IResource) input.getAdapter(IResource.class);
		return ir;
	}

	/**
	 * Return an IALSFile from the editor.
	 */
	protected IALSFile getALSFile() {
		return ALSFileFactory.instance().getALSFile(
				getResource(getEditorInput()));
	}

	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		super.doSetInput(input);
;
	}

	private Annotation[] oldAnnotations;

	public void updateFoldingStructure(ArrayList<Position> positions) {
		Annotation[] annotations = new Annotation[positions.size()];

		// this will hold the new annotations along
		// with their corresponding positions
		HashMap<ProjectionAnnotation, Position> newAnnotations = new HashMap<ProjectionAnnotation, Position>();

		for (int i = 0; i < positions.size(); i++) {
			ProjectionAnnotation annotation = new ProjectionAnnotation();

			newAnnotations.put(annotation, positions.get(i));

			annotations[i] = annotation;
		}

		annotationModel.modifyAnnotations(oldAnnotations, newAnnotations, null);

		oldAnnotations = annotations;
	}

	/**
	 * 
	 * @author romuald druelle
	 * 
	 */
	class MyCloseListener implements DisposeListener {

		public void widgetDisposed(DisposeEvent event) {
			IALSFile file = getALSFile();
			if (file != null) {
				List<IALSCommand> commandes = file.getCommand();
				for (IALSCommand c : commandes) {
					c.closeYourView();
				}
			}
		}

	}

}
