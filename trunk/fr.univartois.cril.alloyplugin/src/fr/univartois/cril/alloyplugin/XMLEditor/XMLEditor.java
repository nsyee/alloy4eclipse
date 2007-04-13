package fr.univartois.cril.alloyplugin.XMLEditor;

import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;

import edu.mit.csail.sdg.alloy4viz.VizGUI;
import fr.univartois.cril.alloyplugin.launch.util.Util;

public class XMLEditor extends TextEditor {

	private ColorManager colorManager;
	private IEditorInput XMLinput;
	
	public XMLEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		XMLinput=input;
		// TODO Auto-generated method stub

		//VizGUI viz = new VizGUI(false,"",null);
		//viz.run(VizGUI.evs_loadInstanceForcefully, Util.getFileLocation((IResource)input.getAdapter(IResource.class)));
		

	}
	
	public IEditorInput getXMLinput(){
		return XMLinput;
	}
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
