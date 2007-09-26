package fr.univartois.cril.alloyplugin.editor;



import java.io.IOException;
import java.io.InputStream;
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
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ContentAssistAction;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.osgi.framework.Bundle;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;

/**
 * Class for Alloy editor. 
 */

public class ALSEditor extends TextEditor {
	

	private AlloyContentOutlinePage fOutlinePage=null;
	
	
	/**
	 * Method called at editor initialization.
	 * Set the SourceViewer.
	 * @see org.eclipse.ui.editors.text.TextEditor#initializeEditor()
	 */
	protected void initializeEditor() {
		super.initializeEditor();
		// Attache la configuration
		setSourceViewerConfiguration(new ALSSourceViewerConfiguration());
	}
	
	
	/**
	 * Used for content outline
	 * */

	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required)) {	
			
			if (fOutlinePage == null) {
			
				fOutlinePage= new AlloyContentOutlinePage(this);
			}
			
			return fOutlinePage;
		}
		return super.getAdapter(required);		
	}
	
	@Override
	protected void createActions() {
		super.createActions();
		ResourceBundle aResourceBundle=null;
		try {
			aResourceBundle = ResourceBundle.getBundle("messages");
		} catch (MissingResourceException exception1) {
			Bundle alloyBundle = AlloyPlugin.getDefault().getBundle();
			try {
				InputStream messageStream = FileLocator.openStream(
						alloyBundle, new Path("$ln$/messages.properties"), true);
				aResourceBundle = new PropertyResourceBundle(messageStream);
			} catch (IOException exception2) {
				MultiStatus ms = new MultiStatus(alloyBundle.getSymbolicName(), IStatus.ERROR, "Cannot load A4E 'messages' properties resource.", exception2);
				ms.add(new Status(IStatus.ERROR, alloyBundle.getSymbolicName(), IStatus.ERROR, exception1.getMessage(), exception1));
				AlloyPlugin.getDefault().getLog().log(ms);
				return;
			}
		}
		
		IAction action=	new ContentAssistAction(aResourceBundle, "ContentAssistProposal.", this); //$NON-NLS-1$
		action.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction("actionId", action); //$NON-NLS-1$
		markAsStateDependentAction("actionId", true); //$NON-NLS-1$
		PlatformUI.getWorkbench().getHelpSystem().setHelp(action, "helpContextId");
		
	}

	/**
	 * Try to return an IResource from IEditorInput.
	 * Returns null if no such object can be found.  
	 */
	public IResource getResource(IEditorInput input) {				
		IResource ir=(IResource)input.getAdapter(IResource.class);		
		return ir;		
	}
	
	/**
	 * Return an IALSFile from the editor.
	 *   
	 */
	protected IALSFile getALSFile() {
		return AlloyPlugin.getDefault().getALSFile(getResource(getEditorInput()));		
	}


	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {		
		super.doSetInput(input);
		if(fOutlinePage!=null) fOutlinePage.setViewerInput();
	}
	
	
}
