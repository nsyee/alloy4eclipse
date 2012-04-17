package fr.univartois.cril.xtext2.preferences;

import java.io.File;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;



import fr.univartois.cril.xtext2.alloyplugin.*;
import fr.univartois.cril.xtext2.ui.activator.AlsActivator;


/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		
		IPreferenceStore store = AlsActivator.getInstance().getPreferenceStore();
	
		store.setDefault(PreferenceConstants.P_BOOLEAN_EXECUTE_TASKS_LOCALLY,true);
		store.setDefault(PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER,true);
		store.setDefault(PreferenceConstants.P_BOOLEAN_SHOW_DEBUG_MESSAGES,false);
		store.setDefault(PreferenceConstants.P_BOOLEAN_CLEAR_CONSOLE_FOR_EACH_COMMAND,true);
		store.setDefault(PreferenceConstants.P_SOLVER_CHOICE,PreferenceConstants.V_SOLVER_SAT4J);
		store.setDefault(PreferenceConstants.P_STRING, "Default value");
		store.setDefault(PreferenceConstants.V_GRAPH_CONVERSION, "ps");
		String defaultDir = Helper.alloyHome() + AlsActivator.FILE_SEPARATOR+ "binary";
		File dir = new File(defaultDir);
		if (dir.exists()) {
			store.setDefault(PreferenceConstants.P_SOLVERS_PATH, defaultDir);
		}
		dir = new File(Helper.alloyHome() + AlsActivator.FILE_SEPARATOR + "/models");
		
		if (dir.exists()) {
			
			store.setDefault(PreferenceConstants.P_A4_SAMPLE_MODELS_PATH,
					Helper.alloyHome() + "/models");
		}
		store.setDefault(PreferenceConstants.CLOSE_VIEW_UNSAT, false);
		store.setDefault(PreferenceConstants.WIDTH__GRAPH, 800);
		store.setDefault(PreferenceConstants.RESOLUTION__GRAPH, 300);
		store.setDefault(PreferenceConstants.MAX_HEAP_SIZE, 1024);
		store.setDefault(PreferenceConstants.MAX_STACK_SIZE, 65536);
		store.setDefault(PreferenceConstants.DEFAULT_LAUNCH_OPTION,"10");
		
	}

}
