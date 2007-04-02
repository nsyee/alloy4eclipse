package fr.univartois.cril.alloyplugin.launch;

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

import fr.univartois.cril.alloyplugin.core.ui.ALSFileFactory;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.launch.ui.CommandsView;
import fr.univartois.cril.alloyplugin.launch.ui.CommandsContentProvider;





public class ProjectBuilder extends
IncrementalProjectBuilder {

	public ProjectBuilder() {
		
	}

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
	protected void fullBuild(final IProgressMonitor monitor)
	throws CoreException {

		try {
			getProject().accept(new SampleResourceVisitor());
		} catch (CoreException e) {
		}
	}
	class SampleResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkALSFile(resource);
			//return true to continue visiting children.
			return true;
		}
	}
	/**	 
	 * Check the resource if it's a file and ends by ".als" . 
	 */
	private void checkALSFile(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {			
			IALSFile file=ALSFileFactory.getALSFile(resource);
			if(file!=null)AlloyLaunching.launchParserOneFile(file.getResource());						
		}
	}
	/**	 
	 * Evaluate et modifie the .
	 */
	private void parseALSFile(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".als")) {			
			IALSFile file=ALSFileFactory.getALSFile(resource);
			if(file!=null)AlloyLaunching.launchParser(file);						
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new SampleDeltaVisitor());
	}
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
				parseALSFile(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource

				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				parseALSFile(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}


	}
}
