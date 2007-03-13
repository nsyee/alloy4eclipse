package fr.univartois.cril.alloyplugin.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
//import org.eclipse.ui.IViewLayout;

public class PerspectiveFactory implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {

		layout.addView("org.eclipse.ui.navigator.ProjectExplorer", IPageLayout.LEFT, (float) 0.2, layout.getEditorArea());
		layout.addView("org.eclipse.ui.views.ContentOutline", IPageLayout.RIGHT, (float) 0.75, layout.getEditorArea());
		layout.addView("org.eclipse.ui.console.ConsoleView", IPageLayout.BOTTOM, (float) 0.75, layout.getEditorArea());
		
		
		
	}

}



