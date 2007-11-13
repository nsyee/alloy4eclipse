package fr.univartois.cril.alloyplugin;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.univartois.cril.alloyplugin.api.IALSFile;
import fr.univartois.cril.alloyplugin.core.ALSFileFactory;
import fr.univartois.cril.alloyplugin.core.AlloyLaunching;


/**
 *  This project builder is the default builder for the plugin.
 *  It does nothing for the moment.  
 *  Others builders can be added to the project nature with the fr.univartois.cril.alloyplugin.projectbuildercontribution extension. (temporary)
 * */
public class ProjectBuilder extends
 IncrementalProjectBuilder {
	/**
	 * Default project builder Id.  
	 */
	public static final String PROJECT_BUILDER_ID = "fr.univartois.cril.alloyplugin.builder";


	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
	throws CoreException {
		
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}
	/**
	 * active a full build.
	 * */
	protected void fullBuild(final IProgressMonitor monitor)
	throws CoreException {
		
		try {
			getProject().accept(new ResourceVisitor());
		} catch (CoreException e) {
		}
	}
	/**
	 * Resource Visitor for full build.
	 * */
	class ResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			parseALSFile(resource);
			//return true to continue visiting children.
			return true;
		}
	}
	
	/**	 
	 * Check the resource if it's a file and ends by ".als" . 
	 */
	private void parseALSFile(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {		
			
				getParser().parseOneFile(resource);						
		}
	}
	/**	 
	 * Evaluate et modifie the .
	 */
	private void parseALSFileFull(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {			
			IALSFile file= ALSFileFactory.instance().getIALSFile(resource);
			if(file!=null)getParser().launchParser(file);			
		}
	}
	private AlloyLaunching getParser() {
		return AlloyPlugin.getDefault().getParser();
		
	}
	/**
	 * when a .als file is removed.
	 */
	private void removeALSFile(IResource resource) {
	    ALSFileFactory.instance().remove(resource);
		
	}	

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new SampleDeltaVisitor());
	}
	
	/**
	 * This object will be used for visiting resource delta in the workspace.
	 * */
	class SampleDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				parseALSFileFull(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				removeALSFile(resource);
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				parseALSFileFull(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}

		
	}
}
