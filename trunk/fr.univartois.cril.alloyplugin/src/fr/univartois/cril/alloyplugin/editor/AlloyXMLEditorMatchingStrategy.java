package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;

public class AlloyXMLEditorMatchingStrategy implements IEditorMatchingStrategy {
	
	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		try {
			if (!(input instanceof IFileEditorInput)) return false;
			
			final IFileEditorInput fileEditorInput = (IFileEditorInput) input;
			assert fileEditorInput != null;
			
			final IFile fileInput = fileEditorInput.getFile();
			if (null == fileInput) return false;
			
			final IEditorInput editorRefInput = editorRef.getEditorInput();
			if (!(editorRefInput instanceof IFileEditorInput)) return false;
			
			final IFileEditorInput fileEditorRefInput = (IFileEditorInput) editorRefInput;
			final IFile fileRefInput = fileEditorRefInput.getFile();
			
			return (fileInput.equals(fileRefInput));
		} catch (CoreException e) {
		} catch (NullPointerException e) {
		} 
		return false;
	}

}
