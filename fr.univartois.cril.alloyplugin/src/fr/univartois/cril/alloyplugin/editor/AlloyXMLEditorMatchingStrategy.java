package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;

import fr.univartois.cril.alloyplugin.ProjectNature;

public class AlloyXMLEditorMatchingStrategy implements IEditorMatchingStrategy {

	private static String XML_ID = "org.eclipse.core.runtime.xml";
	
	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		try {
			final IFileEditorInput fileEditorInput = (IFileEditorInput) input;
			final IFile fileInput = fileEditorInput.getFile();
			final IProject project = fileInput.getProject();
			if (project.hasNature(ProjectNature.NATURE_ID)) {
				final IContentDescription desc = fileInput.getContentDescription();
				final String id = desc.getContentType().getId();
				if (XML_ID.equals(id)) return true;
			}
		} catch (CoreException e) {
		} catch (NullPointerException e) {
		} 
		return false;
	}

}
