package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveFactory implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addView("org.eclipse.ui.navigator.ProjectExplorer", IPageLayout.LEFT, (float) 0.2, editorArea);
		//layout.addView("org.eclipse.jdt.ui.PackageExplorer", IPageLayout.LEFT, (float) 0.2, editorArea);
		layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.RIGHT, (float) 0.75, editorArea);
		IFolderLayout bottom = layout.createFolder("topLeft", IPageLayout.BOTTOM, 0.75f,editorArea);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);		
		bottom.addView("org.eclipse.ui.console.ConsoleView");
		bottom.addView(IPageLayout.ID_PROGRESS_VIEW);
		
		
	}

}



