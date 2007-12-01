package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.preferences.AlloyPreferencePage;

public class OpenLibraryModelAction implements IObjectActionDelegate {

    private IWorkbenchPart part;
    
    public void setActivePart(IAction arg0, IWorkbenchPart arg1) {
        part = arg1;
    }

    public void run(IAction arg0) {
        
        FileDialog dialog = new FileDialog(part.
                getSite().getShell());
        dialog.setFilterExtensions(new String[] { "*.als" });
        dialog.setFilterPath(AlloyPreferencePage.getA4SampleModelsPath());
        dialog.setText("Select a sample model");
        String result = dialog.open();        
        if (result!=null) {
            final IPath path = new Path(result);
            IFileStore fileStore=  EFS.getLocalFileSystem().getStore(path);
            IWorkbenchPage page = part.getSite().getPage();
            try {
                IDE.openEditorOnFileStore(page,fileStore);
            } catch (PartInitException e) {
                AlloyPlugin.getDefault().logError(e.getMessage());
            }
        }
        
    }

    public void selectionChanged(IAction arg0, ISelection arg1) {
        // TODO Auto-generated method stub

    }

}
