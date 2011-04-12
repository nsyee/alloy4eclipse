package fr.univartois.cril.xtext.alloyplugin.ui;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.ide.IDE;

import fr.univartois.cril.xtext.alloyplugin.AlloyPlugin;
import fr.univartois.cril.xtext.alloyplugin.preferences.AlloyPreferencePage;

public class OpenLibraryModelAction implements IObjectActionDelegate {

    private IWorkbenchPart part;
    private ISelection     selection;

    public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
        part = arg1;
    }

    public void run(IAction arg0) {

        FileDialog dialog = new FileDialog(part.getSite().getShell());
        dialog.setFilterExtensions(new String[] { "*.als" });
        dialog.setFilterPath(AlloyPreferencePage.getA4SampleModelsPath());
        dialog.setText("Select a sample model");
        String result = dialog.open();
        if (result != null) {
            final IPath path = new Path(result);
            IProject project = getProject();
            // System.out.println(project);
            IFile file = project.getFile(path.lastSegment());
            try {
                file.createLink(path, IResource.NONE, null);
                IWorkbenchPage page = part.getSite().getPage();
                IDE.openEditor(page, file);
            } catch (CoreException e) {
                AlloyPlugin.getDefault().logError(e.getMessage());
            } 
        }

    }

    @SuppressWarnings("unchecked")
    private IProject getProject() {
        if (selection instanceof IStructuredSelection) {
            for (Iterator it = ((IStructuredSelection) selection).iterator(); it
                    .hasNext();) {
                Object element = it.next();
               
                if (element instanceof IProject) {
                   return (IProject) element;
                } else if (element instanceof IAdaptable) {
                    return (IProject) ((IAdaptable) element)
                            .getAdapter(IProject.class);
                }
            }
            
        }
        return null;
    }

    public void selectionChanged(IAction arg0, ISelection arg1) {
        this.selection = arg1;
    }

}
