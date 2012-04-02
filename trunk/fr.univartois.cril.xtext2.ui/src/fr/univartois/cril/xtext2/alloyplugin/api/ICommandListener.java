package fr.univartois.cril.xtext2.alloyplugin.api;

import java.net.URL;

public interface ICommandListener {

    void onXmlSolutionFileCreation(
    		String filename);

    void onXmlSolutionFileCreation(
    		String filename, 
    		String titlename);
    
    void onXmlSolutionFileCreation(
    		String filename, 
    		URL alloyVisualizationTheme);

    void onXmlSolutionFileCreation(
    		String filename, 
    		String titlename,
            URL alloyVisualizationTheme);
}
