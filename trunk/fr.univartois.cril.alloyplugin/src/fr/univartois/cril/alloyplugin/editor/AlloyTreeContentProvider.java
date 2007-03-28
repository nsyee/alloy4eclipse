package fr.univartois.cril.alloyplugin.editor;

import java.util.logging.Logger;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class AlloyTreeContentProvider implements ITreeContentProvider {

	private static final String FUNCTIONS = "Functions";
	private static final String SIGNATURES = "Signatures";
	private static final Logger log = Logger.getLogger("alloy");
	
	public void dispose() {
		log.info("Dispose");

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		log.info("Changed");
		// TODO Auto-generated method stub
		//if (newInput != null) {
			//IDocument document= fDocumentProvider.getDocument(newInput);
			//if (document != null) {
			//	document.addPositionCategory(SEGMENTS);
			//	document.addPositionUpdater(fPositionUpdater);
			//	parse(document);
			//}
		//}
	}

	public Object[] getChildren(Object parentElement) {
		log.info("Get children for "+parentElement);
		return new Object[0];
	}

	public Object getParent(Object element) {
		log.info("Get parent for "+element);
		return null;
	}

	public boolean hasChildren(Object element) {
		log.info("has children? "+element);
		return false;
	}

	public Object[] getElements(Object inputElement) {
		log.info("get elements for "+inputElement);
		return new String[] {SIGNATURES,FUNCTIONS,"Predicates","Commands"};
	}

}
