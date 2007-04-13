package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import fr.univartois.cril.alloyplugin.core.ui.IALSFile;
import fr.univartois.cril.alloyplugin.core.ui.IALSFileListener;

public class AlloyTreeContentProvider implements ITreeContentProvider, IALSFileListener {

	public static final String FUNCTIONS = "Functions";
	public static final String SIGNATURES = "Signatures";
    public static final String FACTS = "Facts";
	public static final String PREDICATES = "Predicates";
	public static final String COMMANDS = "Commands";
	private	ALSEditor editor;	
	private IALSFile af;
	private Viewer viewer;
//	private static final Logger log = Logger.getLogger("alloy");
	private static final Object[] EMPTY_TAB = new Object[0];



	public AlloyTreeContentProvider() {
		super();
		
	}

	public void dispose() {
		//	log.info("Dispose");
		
		//removeListeningALSFile();
		
		
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		System.out.println("input changed: new Input"+newInput);
		this.viewer=viewer;
		
		if (oldInput != null)
			{						
			removeListeningALSFile();
			}
		editor=(ALSEditor) newInput;
		if (newInput != null)
		{			
			addListeningALSFile();
		}
		//IDocument document= fDocumentProvider.getDocument(newInput);
		//if (document != null) {
		//document.addPositionCategory(SEGMENTS);
		//document.addPositionUpdater(fPositionUpdater);
		//parse(document);
		//}
		//}
	}

	/**
	 * Make this class listens changes on ALSFile from editor.
	 */	
	private void addListeningALSFile() {		
		af=editor.getALSFile();
		
		if(af!=null)
			af.addListener(this);
	}
	/**
	 * Make this class doesn't listen the ALSFile anymore.	 
	 */
	private void removeListeningALSFile() 
	{			
		if(af!=null)
		{
			af.removeListener(this);
			af=null;
		}
	}


	public Object[] getChildren(Object parentElement) {
		//	log.info("Get children for "+parentElement);
		if(af==null) return EMPTY_TAB;		

		if (parentElement.equals(SIGNATURES))
			return af.getSignatures().toArray(); //EMPTY_TAB;//new Object[] {"tata"};
        if (parentElement.equals(FACTS))
            return af.getFacts().toArray();
		if (parentElement.equals(FUNCTIONS))
			return af.getFunctions().toArray(); // EMPTY_TAB;//Object[] {"toto"};
		if (parentElement.equals(PREDICATES))
			return af.getPredicates().toArray();//new Object[] {"titi"};
		if (parentElement.equals(COMMANDS))
			return af.getCommand().toArray();
		return EMPTY_TAB;
	}
	

	public Object getParent(Object element) {
		//	log.info("Get parent for "+element);
		return null;
	}

	public boolean hasChildren(Object element) {
		//log.info("has children? "+element);
		return element.equals(COMMANDS)|| element.equals(SIGNATURES)|| element.equals(FUNCTIONS) || element.equals(PREDICATES)|| element.equals(FACTS);
	}

	public Object[] getElements(Object inputElement) {
		//	log.info("get elements for "+inputElement);
		System.out.println("get elements for :"+inputElement);
		return new String[] {SIGNATURES,FACTS,FUNCTIONS,PREDICATES,COMMANDS};
	}

	
	/**
	 * This method is called when changes are made on the ALSFile.
	 * The viewer is refresh for displaying changes.
	 * It's done in a SWT thread. 
	 */
	public void changed(IALSFile file) {	
		Display display = PlatformUI.getWorkbench().getDisplay();		
		if (display!=null)
			display.asyncExec(
					new Runnable() {
						public void run(){
							viewer.refresh();					
						}
					});
	}
	
	

}
