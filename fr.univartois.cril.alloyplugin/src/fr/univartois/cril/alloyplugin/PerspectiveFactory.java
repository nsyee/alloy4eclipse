package fr.univartois.cril.alloyplugin;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class PerspectiveFactory implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.addView("org.eclipse.ui.navigator.ProjectExplorer", IPageLayout.LEFT, (float) 0.2, layout.getEditorArea());
		layout.addView("org.eclipse.ui.console.ConsoleView", IPageLayout.BOTTOM, (float) 0.8, layout.getEditorArea());
		layout.addView("fr.univartois.cril.alloyplugin.launch.views.AlloyCommandView", IPageLayout.RIGHT, (float) 0.8, layout.getEditorArea());
		
	}

}
