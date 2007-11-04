package fr.univartois.cril.alloyplugin.core.ui;

import java.net.URL;

public interface ICommandListener {

    void onXmlSolutionFileCreation(String filename);

    void onXmlSolutionFileCreation(String filename, URL alloyVisualizationTheme);

    void onXmlSolutionFileCreation(String filename, String name,
            URL alloyVisualizationTheme);
}
