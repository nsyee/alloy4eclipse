package fr.univartois.cril.alloyplugin.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.api.IALSFile;
import fr.univartois.cril.alloyplugin.api.IALSFileListener;
import fr.univartois.cril.alloyplugin.api.IALSTreeDecorated;

public class AlloyTreeContentProvider implements ITreeContentProvider,
        IALSFileListener {

    public  final RootContent    FUNCTIONS  = new RootContent("Functions",AlloyPlugin.getDefault().getImage(AlloyPlugin.FUNCTION_ICON_ID));
    public  final RootContent    SIGNATURES = new RootContent("Signatures",AlloyPlugin.getDefault().getImage(AlloyPlugin.SIGNATURE_ICON_ID));
    public  final RootContent    FACTS      = new RootContent("Facts",AlloyPlugin.getDefault().getImage(AlloyPlugin.FACT_ICON_ID));
    public  final RootContent    ASSERT     = new RootContent("Assertions",AlloyPlugin.getDefault().getImage(AlloyPlugin.ASSERT_ICON_ID));
    public  final RootContent    PREDICATES = new RootContent("Predicates",AlloyPlugin.getDefault().getImage(AlloyPlugin.PREDICATE_ICON_ID));
    public  final RootContent    COMMANDS   = new RootContent("Commands",AlloyPlugin.getDefault().getImage(AlloyPlugin.COMMAND_ID));
    
    private ALSEditor             editor;
    private IALSFile              af;
    private Viewer                viewer;
    // private static final Logger log = Logger.getLogger("alloy");
    private static final Object[] EMPTY_TAB  = new Object[0];

    public AlloyTreeContentProvider() {
        super();

    }

    public void dispose() {
        // log.info("Dispose");

        // removeListeningALSFile();

    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        //System.out.println("input changed: new Input" + newInput);
        this.viewer = viewer;

        if (oldInput != null) {
            removeListeningALSFile();
        }
        editor = (ALSEditor) newInput;
        if (newInput != null) {
            addListeningALSFile();
            feedAnnotations();
            editor.updateFoldingStructure(positions);
        }

        // IDocument document= fDocumentProvider.getDocument(newInput);
        // if (document != null) {
        // document.addPositionCategory(SEGMENTS);
        // document.addPositionUpdater(fPositionUpdater);
        // parse(document);
        // }
        // }
    }

    /**
     * Make this class listens changes on ALSFile from editor.
     */
    private void addListeningALSFile() {
        af = editor.getALSFile();

        if (af != null) {
            af.addListener(this);
            SIGNATURES.setChildren(af.getSignatures());
            FACTS.setChildren(af.getFacts());
            FUNCTIONS.setChildren(af.getFunctions());
            ASSERT.setChildren(af.getAssertions());
            PREDICATES.setChildren(af.getPredicates());
            COMMANDS.setChildren(af.getCommand());
        }
    }

    /**
     * Make this class doesn't listen the ALSFile anymore.
     */
    private void removeListeningALSFile() {
        if (af != null) {
            af.removeListener(this);
            af = null;
        }
    }

    public Object[] getChildren(Object parentElement) {
        // log.info("Get children for "+parentElement);
        if (af == null)
            return EMPTY_TAB;

        if (parentElement instanceof RootContent) {
            return ((RootContent)parentElement).children();
        }
        return EMPTY_TAB;
    }

    public Object getParent(Object element) {
        // log.info("Get parent for "+element);
        return null;
    }

    public boolean hasChildren(Object element) {
        if (element instanceof RootContent) {
            return ((RootContent)element).hasChildren();
        }
       return false;
    }

    public Object[] getElements(Object inputElement) {
        // log.info("get elements for "+inputElement);
        System.out.println("get elements for :" + inputElement);
        return new RootContent[] { SIGNATURES, FACTS, ASSERT, FUNCTIONS, PREDICATES,
                COMMANDS };
    }

    private ArrayList<Position> positions = new ArrayList<Position>();

    private void feedAnnotations() {
        positions.clear();
        IDocument document = editor.getDocumentProvider().getDocument(
                editor.getEditorInput());
        List<IALSTreeDecorated> alloyobjects = af.getAllAlloyObjects();
        int nol = document.getNumberOfLines();
        for (IALSTreeDecorated ao : alloyobjects) {
            try {
                int offset = document.getLineOffset(ao.getBeginLine()-1);
                int eol = ao.getEndLine();
                int endOffset = (eol == nol) ? document.getLength() : document.getLineOffset(eol);
                assert offset <endOffset : ao.toString()+":"+offset+"<"+endOffset;
                // System.out.println(ao.toString()+":"+offset+"<"+endOffset);
                positions.add(new Position(offset, endOffset - offset));
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * This method is called when changes are made on the ALSFile. The viewer is
     * refresh for displaying changes. It's done in a SWT thread.
     */
    public void changed(IALSFile file) {
        feedAnnotations();
        Display display = PlatformUI.getWorkbench().getDisplay();
        if (display != null)
            display.asyncExec(new Runnable() {
                public void run() {
                    ((TreeViewer)viewer).expandAll();
                    viewer.refresh();
                    editor.updateFoldingStructure(positions);
                }
            });
    }

}
