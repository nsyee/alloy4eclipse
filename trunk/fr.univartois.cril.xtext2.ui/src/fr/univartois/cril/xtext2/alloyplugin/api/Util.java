package fr.univartois.cril.xtext2.alloyplugin.api;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import fr.univartois.cril.xtext2.ui.activator.AlsActivator;

public class Util {

    public static final String ALLOYPROBLEM = "fr.univartois.cril.alloyplugin.AlloyProblem";
    
    public static boolean refreshProjectManager(IPath path) throws CoreException {
        IWorkspaceRoot wksroot = ResourcesPlugin.getWorkspace().getRoot();
        IResource dotResource = wksroot.getContainerForLocation(path);
        if (null != dotResource && dotResource.getProject().isAccessible()) {
            IContainer dotFolder = dotResource.getParent();
            dotFolder.refreshLocal(IResource.DEPTH_ONE, null);
            return true;
        }
        return false;
    }
    
	/**
	 * Try to get the absolute path of the resource. 
	 * Returns the file location or null;
	 * @param resource 
	 */

	public static String getFileLocation(IResource resource){		
		assert(resource!=null);
		return getFileLocation(resource.getLocation());
		
	}
	
	public static String getFileLocation(IPath resourceLoc){		
		if(resourceLoc!=null)
			return resourceLoc.toOSString();
		return null;
	}
	
	/**
	 * Get a file from a absolute location. 
	 */
	public static IFile getFileForLocation(String filename){
		return ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filename));
	}
	
	/**
	 * Get a file from a workspace location. 
	 */
	public static IFile getFile(String filename){
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filename));
	}

	/**
	 * Get the url.
	 * */
	public static URL getUrl(String localPathKey){	
		URL url = null;
		try {
			url = new URL(AlsActivator.getDefault().getBundle().getEntry("/"),
					localPathKey);
		} catch (MalformedURLException e) {
		}
		return url;
	}
	
	/**
	 * ID of the ALS Editor
	 */
	public static final String ALS_EDITOR_ID = "fr.univartois.cril.alloyplugin.editor.ALSEditor";//$NON-NLS-1$
	
	public static IEditorPart openALSEditor(final IWorkbenchPage page, final IFile file) throws PartInitException {
		final IEditorInput editorInput = new FileEditorInput(file);
		final IEditorPart editor = page.openEditor(editorInput,ALS_EDITOR_ID);
		return editor;
	}
	
	public static IEditorPart openALSEditor(final IFile file) throws PartInitException {
		final IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final IWorkbenchPage page = window.getActivePage();       
		return openALSEditor(page, file);
	}
}
