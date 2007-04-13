package fr.univartois.cril.alloyplugin.launch.ui;



import java.io.File;

import javax.swing.JPanel;

import org.eclipse.jface.dialogs.MessageDialog;

import edu.mit.csail.sdg.alloy4.Util;
import edu.mit.csail.sdg.alloy4viz.AlloyInstance;
import edu.mit.csail.sdg.alloy4viz.StaticInstanceReader;
import edu.mit.csail.sdg.alloy4viz.VizGraphPanel;
import edu.mit.csail.sdg.alloy4viz.VizState;

/**
 * GUI main window for the visualizer.
 *
 * <p><b>Thread Safety:</b>  Can be called only by the AWT event thread.
 */

public final class MyVizGUI {

	
	/** The current instance and visualization settings; null if none is loaded. */
	private VizState myState=null;


	/** The graphical panel, null if it is not yet loaded. */
	private VizGraphPanel myGraphPanel=null;


	/** The current XML file; "" if there is no XML file loaded. */
	private String xmlFileName="";

	/** Returns the current XML filename; "" if no file is currently loaded. */
	public String getXMLfilename() { return xmlFileName; }

	
	public MyVizGUI() {

	}
	private JPanel updateDisplay() {
		if (myGraphPanel==null) myGraphPanel=new VizGraphPanel(myState,false);
		//else {myGraphPanel.seeDot(currentMode==VisualizerMode.DOT); myGraphPanel.remakeAll();}
		return myGraphPanel;
	}


	/** This event loads a new XML instance file if it's not the current file. */
	public static final int evs_loadInstance = 102;

	/** This event loads a new XML instance file (reloading it from disk even if the filename equals the current filename) */
	public static final int evs_loadInstanceForcefully = 103;





	/** Performs the function given by "key" on the argument "arg"; returns true if it succeeds. */
	public boolean run(final int key, final String arg) {

		if (key==evs_loadInstance || key==evs_loadInstanceForcefully) 
		{
			String xmlFileName=Util.canon(arg);
			File f=new File(xmlFileName);
			if (key==evs_loadInstanceForcefully || !xmlFileName.equals(this.xmlFileName)) {
				AlloyInstance myInstance ;
				try {
					myInstance = StaticInstanceReader.parseInstance(f);
				} catch (Exception e) {
					
					MessageDialog.openError(null, "XML error", "File "+xmlFileName+"\nis not a valid Alloy XML output:\n"+e.getMessage());
					return true;
				}


				if (myState==null) myState=new VizState(myInstance); 
				else myState.loadInstance(myInstance);

				this.xmlFileName = xmlFileName;
			}
			
			updateDisplay();
		}

		return true;
	}

	public JPanel getGraphPanel(){return myGraphPanel;}
}
