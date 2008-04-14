package fr.univartois.cril.alloyplugin.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.Helper;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		System.out.println("init pref");
		IPreferenceStore store = AlloyPlugin.getDefault().getPreferenceStore();
		store
				.setDefault(PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER,
						false);
		store.setDefault(PreferenceConstants.P_BOOLEAN_SHOW_DEBUG_MESSAGES,
				false);
		store.setDefault(
				PreferenceConstants.P_BOOLEAN_CLEAR_CONSOLE_FOR_EACH_COMMAND,
				true);
		store.setDefault(PreferenceConstants.P_SOLVER_CHOICE,
				PreferenceConstants.V_SOLVER_SAT4J);
		store.setDefault(PreferenceConstants.P_STRING, "Default value");
		store.setDefault(PreferenceConstants.V_GRAPH_CONVERSION, "ps");
		String defaultDir = Helper.alloyHome() + AlloyPlugin.FILE_SEPARATOR
				+ "binary";
		store.setDefault(PreferenceConstants.P_SOLVERS_PATH, defaultDir);
		store.setDefault(PreferenceConstants.P_A4_SAMPLE_MODELS_PATH, Helper
				.alloyHome()
				+ "/models");
		store.setDefault(PreferenceConstants.CLOSE_VIEW_UNSAT, false);
		store.setDefault(PreferenceConstants.WIDTH__GRAPH, 800);
		store.setDefault(PreferenceConstants.RESOLUTION__GRAPH, 300);

	}

}
