package fr.univartois.cril.alloyplugin.editor;

import java.util.List;
import java.util.logging.Logger;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import fr.univartois.cril.alloyplugin.core.ALSFile;
import fr.univartois.cril.alloyplugin.ui.IALSFile;
import fr.univartois.cril.alloyplugin.ui.IALSFileListener;

public class AlloyTreeContentProvider implements ITreeContentProvider, IALSFileListener {

	private static final String FUNCTIONS = "Functions";
	private static final String SIGNATURES = "Signatures";

	private static final String PREDICATES = "Predicates";
	private static final String COMMANDS = "Commands";
	private	ALSEditor editor;	
	private ALSFile af;
	private Viewer viewer;
//	private static final Logger log = Logger.getLogger("alloy");
	private static final Object[] EMPTY_TAB = new Object[0];



	public void dispose() {
	//	log.info("Dispose");

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer=viewer;
		//log.info("Changed"+newInput);		
		//if (newInput!=null)
		//input=(IEditorInput) newInput;
		if (newInput != null) {
			ALSEditor editor=(ALSEditor) newInput;
			af=editor.getALSFile();
			if(af!=null)
				af.addListener(this);			
		}
		//IDocument document= fDocumentProvider.getDocument(newInput);
		//if (document != null) {
		//document.addPositionCategory(SEGMENTS);
		//document.addPositionUpdater(fPositionUpdater);
		//parse(document);
		//}
		//}
	}

	public Object[] getChildren(Object parentElement) {
	//	log.info("Get children for "+parentElement);

		System.out.println("input children="+editor);

		if(af==null) return EMPTY_TAB;

		List list =  af.getCommand();
		Object[] tab=list.toArray();

		if (parentElement.equals(SIGNATURES))
			return EMPTY_TAB;//new Object[] {"tata"};
		if (parentElement.equals(FUNCTIONS))
			return EMPTY_TAB;//Object[] {"toto"};
		if (parentElement.equals(PREDICATES))
			return EMPTY_TAB;//new Object[] {"titi"};
		if (parentElement.equals(COMMANDS))
			return tab;
		return EMPTY_TAB;
	}

	public Object getParent(Object element) {
	//	log.info("Get parent for "+element);
		return null;
	}

	public boolean hasChildren(Object element) {
		//log.info("has children? "+element);
		if (element.equals(COMMANDS)) return true;
		return false;
	}

	public Object[] getElements(Object inputElement) {
	//	log.info("get elements for "+inputElement);
		System.out.println("get elements for :"+inputElement);
		return new String[] {SIGNATURES,FUNCTIONS,PREDICATES,COMMANDS};
	}

	public void changed(IALSFile file) {		
		Display display = PlatformUI.getWorkbench().getDisplay();		
		if (display!=null)
			display.syncExec(
					new Runnable() {
						public void run(){
							viewer.refresh();					
						}
					});


	}

}
