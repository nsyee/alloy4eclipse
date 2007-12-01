package fr.univartois.cril.alloyplugin.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import fr.univartois.cril.alloyplugin.AlloyPlugin;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>,
 * we can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class AlloyPreferencePage extends FieldEditorPreferencePage implements
        IWorkbenchPreferencePage {

    public AlloyPreferencePage() {
        super(GRID);
        setPreferenceStore(AlloyPlugin.getDefault().getPreferenceStore());
        setDescription("You can set up your Alloy preferences here:");
    }

    /**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     */
    public void createFieldEditors() {
        /*
         * addField(new DirectoryFieldEditor(PreferenceConstants.P_OUTPUT_PATH,
         * "&Output.xml directory:", getFieldEditorParent()));
         */
        addField(new BooleanFieldEditor(
                PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER,
                "Automatically &Show graphical view of models or counter examples after command execution",
                getFieldEditorParent()));
        addField(new BooleanFieldEditor(
                PreferenceConstants.P_BOOLEAN_CLEAR_CONSOLE_FOR_EACH_COMMAND,
                "Clear console output before launching a command",
                getFieldEditorParent()));
        addField(new RadioGroupFieldEditor(
                PreferenceConstants.P_SOLVER_CHOICE,
                "Choose solver for commands:",
                1,
                new String[][] {
                        { "&SAT4J", PreferenceConstants.V_SOLVER_SAT4J },
                        { "&Berkmin",
                                PreferenceConstants.V_SOLVER_BERKMIN },
                        { "MiniSatProver &JNI",
                                PreferenceConstants.V_SOLVER_MiniSatProverJNI },
                        {
                                "MiniSatProver &Unsat Core",
                                PreferenceConstants.V_SOLVER_MiniSatProverUnsatCore },
                        { "&ZChaffJNI", PreferenceConstants.V_SOLVER_ZChaffJNI } },
                getFieldEditorParent()));

        addField(new BooleanFieldEditor(
                PreferenceConstants.P_BOOLEAN_SHOW_DEBUG_MESSAGES,
                "Show &Debug Messages", getFieldEditorParent()));

        addField(new RadioGroupFieldEditor(
                PreferenceConstants.V_DOT_CONVERSION,
                "Choose dot conversion:",
                1,
                new String[][] { { "ps", "ps" }, {"pdf", "pdf"}, { "png", "png" },
                        { "dia", "dia" }, { "jpeg", "jpeg" }, { "gif", "gif" } },
                getFieldEditorParent()));

        addField(new StringFieldEditor(PreferenceConstants.P_DOT_PATH,
                "Path to dot binary:", getFieldEditorParent()));

        addField(new StringFieldEditor(PreferenceConstants.P_SOLVERS_PATH,
                "Path to SAT solvers binaries:", getFieldEditorParent()));

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
    }

    public static boolean getShowDebugMessagesPreference() {
        return AlloyPlugin.getDefault().getPreferenceStore().getBoolean(
                PreferenceConstants.P_BOOLEAN_SHOW_DEBUG_MESSAGES);
    }

    public static String getShowDOTConversionMessagesPreference() {
        return AlloyPlugin.getDefault().getPreferenceStore().getString(
                PreferenceConstants.V_DOT_CONVERSION);
    }
    public static String getDotBinaryPath() {
        return AlloyPlugin.getDefault().getPluginPreferences().getString(PreferenceConstants.P_DOT_PATH);
    }
    public static boolean getClearConsoleForEachCommand() {
        return AlloyPlugin.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_BOOLEAN_CLEAR_CONSOLE_FOR_EACH_COMMAND);
    }
}