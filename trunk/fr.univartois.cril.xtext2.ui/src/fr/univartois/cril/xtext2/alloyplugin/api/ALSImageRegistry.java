/*
 * Created on 13 nov. 07
 * 
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package fr.univartois.cril.xtext2.alloyplugin.api;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

public class ALSImageRegistry {

	public static ImageRegistry getImageRegistry() {
		if (imageRegistry == null)
			imageRegistry = createImageRegistry();

		return imageRegistry;
	}

	private ALSImageRegistry() {

	}

	private static void initializeImageRegistry(ImageRegistry reg) {
		addImage(COMMAND_ID, reg);
		addImage(CHECK_ID, reg);
		addImage(RED_CHECK_ID, reg);
		addImage(GREEN_CHECK_ID, reg);
		addImage(BLUE_CHECK_ID, reg);
		addImage(RUN_ID, reg);
		addImage(RED_RUN_ID, reg);
		addImage(BLUE_RUN_ID, reg);
		addImage(GREEN_RUN_ID, reg);
		addImage(SIGNATURE_ICON_ID, reg);
		addImage(FACT_ICON_ID, reg);
		addImage(ASSERT_ICON_ID, reg);
		addImage(FUNCTION_ICON_ID, reg);
		addImage(PREDICATE_ICON_ID, reg);
		addImage(RUN_ICON_ID, reg);
		addImage(CHECK_ICON_ID, reg);
		addImage(GRAPH_ICON_ID, reg);
		addImage(CLOSE_GRAPH_ICON_ID, reg);
		addImage(EXECUTE_ICON_ID, reg);
		addImage(DISABLE_EXECUTE_ICON_ID, reg);
		addImage(THEME_ICON_ID, reg);
		addImage(THEME_IMPORT_ICON_ID, reg);
		addImage(THEME_EXPORT_ICON_ID, reg);
		addImage(THEME_IMPORT_ADD_ICON_ID, reg);
		addImage(THEME_EXPORT_DOT_ICON_ID, reg);
		addImage(LAUNCH_A4_ICON_ID, reg);
		/* Adding to the image of the button next */
		addImage(NEXT_A4SOLUTION_ICON_ID, reg);
		addImage(EVALUATOR_ICON_ID, reg);
		addImage(PRIVATE_ICON_ID, reg);
	}

	private static ImageRegistry createImageRegistry() {
		ImageRegistry reg = new ImageRegistry();
		initializeImageRegistry(reg);
		return reg;
	}

	public static Image getImage(String id) {

		return getImageRegistry().get(id);
	}

	public static ImageDescriptor getImageDescriptor(String id) {
		return getImageRegistry().getDescriptor(id);
	}

	/**
	 * Add image in image registry. Pour taper moins de code la cl� de l'image
	 * est aussi le chemin d'acc�s de l'image dans le plugin.
	 * 
	 * @param reg
	 */
	private static void addImage(String localPathKey, ImageRegistry reg) {
		URL url = Util.getUrl(localPathKey);
		ImageDescriptor des = ImageDescriptor.createFromURL(url);
		reg.put(localPathKey, des);
	}

	/**
	 * An image registry which store create and dispose images.
	 */
	private static ImageRegistry imageRegistry;

	public static final String COMMAND_ID = "icons/AlloyCommand.gif";

	public static final String CHECK_ID = "icons/CheckCommand.gif";

	public static final String RED_CHECK_ID = "icons/CheckCommandRed.gif";

	public static final String GREEN_CHECK_ID = "icons/CheckCommandGreen.gif";

	public static final String BLUE_CHECK_ID = "icons/CheckCommandBlue.gif";

	public static final String RUN_ID = "icons/RunCommand.gif";

	public static final String RED_RUN_ID = "icons/RunCommandRed.gif";

	public static final String BLUE_RUN_ID = "icons/RunCommandBlue.gif";

	public static final String GREEN_RUN_ID = "icons/RunCommandGreen.gif";

	public static final String SIGNATURE_ICON_ID = "icons/sig.gif";

	public static final String FACT_ICON_ID = "icons/fact.gif";

	public static final String ASSERT_ICON_ID = "icons/assert.gif";

	public static final String FUNCTION_ICON_ID = "icons/function.gif";

	public static final String PREDICATE_ICON_ID = "icons/predicate.gif";

	public static final String RUN_ICON_ID = "icons/run.gif";

	public static final String CHECK_ICON_ID = "icons/check.gif";

	public static final String GRAPH_ICON_ID = "icons/graph.gif";
	
	public static final String CLOSE_GRAPH_ICON_ID = "icons/close_graph.gif";

	public static final String EXECUTE_ICON_ID = "icons/execute.gif";

	public static final String DISABLE_EXECUTE_ICON_ID = "icons/DisableAlloyLaunch.gif";

	public static final String THEME_ICON_ID = "icons/theme.gif";

	public static final String THEME_IMPORT_ICON_ID = "icons/theme-import.gif";

	public static final String THEME_IMPORT_ADD_ICON_ID = "icons/theme-import-plus.gif";

	public static final String THEME_EXPORT_ICON_ID = "icons/theme-export.gif";

	public static final String THEME_EXPORT_DOT_ICON_ID = "icons/dot.gif";

	public static final String LAUNCH_A4_ICON_ID = "icons/a4.gif";

	public static final String NEXT_A4SOLUTION_ICON_ID = "icons/next2.gif";

	public static final String EVALUATOR_ICON_ID = "icons/eval.gif";

	public static final String PRIVATE_ICON_ID = " icons/private.gif";
}
