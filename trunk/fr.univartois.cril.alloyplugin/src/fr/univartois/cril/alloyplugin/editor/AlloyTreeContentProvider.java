package fr.univartois.cril.alloyplugin.editor;

import java.util.logging.Logger;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import fr.univartois.cril.alloyplugin.core.ALSFile;

public class AlloyTreeContentProvider implements ITreeContentProvider {

	private static final String FUNCTIONS = "Functions";
	private static final String SIGNATURES = "Signatures";

	private static final String PREDICATES = "Predicates";
	private static final String COMMANDS = "Commands";
	private	ALSEditor editor;	
	private ALSFile af;
	private static final Logger log = Logger.getLogger("alloy");


	
	public void dispose() {
		log.info("Dispose");

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

		log.info("Changed"+newInput);
		editor=(ALSEditor) newInput;
		//if (newInput!=null)
			//input=(IEditorInput) newInput;
		System.out.println("input="+newInput);

		//if (newInput != null) {
			//IDocument document= fDocumentProvider.getDocument(newInput);
			//if (document != null) {
				//document.addPositionCategory(SEGMENTS);
				//document.addPositionUpdater(fPositionUpdater);
				//parse(document);
			//}
		//}
	}

	public Object[] getChildren(Object parentElement) {
		log.info("Get children for "+parentElement);
		
		System.out.println("input children="+editor);
		
		af=editor.getALSFile();
		
		Object[] tab =  af.getCommand();
		
		
		if (parentElement.equals(SIGNATURES)){
			return new Object[] {"tata"};}
		if (parentElement.equals(FUNCTIONS)){
			return new Object[] {"toto"};}
		if (parentElement.equals(PREDICATES)){
			return new Object[] {"titi"};}
		if (parentElement.equals(COMMANDS)){
			return tab;}
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
		return new String[] {SIGNATURES,FUNCTIONS,PREDICATES,COMMANDS};
	}

}
