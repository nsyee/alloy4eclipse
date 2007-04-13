package fr.univartois.cril.alloyplugin.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import fr.univartois.cril.alloyplugin.AlloyPlugin;

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
		IPreferenceStore store = AlloyPlugin.getDefault()
				.getPreferenceStore();
		store.setDefault(PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER, false);
		store.setDefault(PreferenceConstants.P_SOLVER_CHOICE, PreferenceConstants.V_SOLVER_SAT4J);
		store.setDefault(PreferenceConstants.P_STRING,
				"Default value");
	}

}
