package fr.univartois.cril.alloyplugin.core;import org.eclipse.core.resources.IFile;import org.eclipse.core.resources.IFolder;import org.eclipse.core.resources.IResource;import org.eclipse.core.runtime.CoreException;import org.eclipse.core.runtime.Path;import org.eclipse.jface.resource.ImageRegistry;import org.eclipse.swt.graphics.Image;import org.eclipse.swt.widgets.Display;import org.eclipse.ui.IViewPart;import org.eclipse.ui.IWorkbenchPage;import org.eclipse.ui.IWorkbenchWindow;import org.eclipse.ui.PlatformUI;import edu.mit.csail.sdg.alloy4.Err;import edu.mit.csail.sdg.alloy4.Pair;import edu.mit.csail.sdg.alloy4compiler.ast.Command;import edu.mit.csail.sdg.alloy4compiler.ast.Expr;import edu.mit.csail.sdg.alloy4compiler.ast.Sig;import edu.mit.csail.sdg.alloy4compiler.parser.Module;import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;import edu.mit.csail.sdg.alloy4compiler.translator.A4Options.SatSolver;import fr.univartois.cril.alloyplugin.AlloyPlugin;import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;import fr.univartois.cril.alloyplugin.api.IALSCommand;import fr.univartois.cril.alloyplugin.api.IALSFile;import fr.univartois.cril.alloyplugin.api.IReporter;import fr.univartois.cril.alloyplugin.api.Util;import fr.univartois.cril.alloyplugin.preferences.PreferenceConstants;import fr.univartois.cril.alloyplugin.views.VizView;/** * An Alloy command with its world and its resources. Can be executed. */public class ExecutableCommand implements IALSCommand {    public static final Image iconrun   = ALSImageRegistry.getImage(            ALSImageRegistry.RUN_ICON_ID);    public static final Image iconcheck = ALSImageRegistry.getImage(            ALSImageRegistry.CHECK_ICON_ID);    /**     * The Command's world .     */    private final Module      world;    /**     * The command itself.     */    private final Command     command;    /**     * The formula associated with the command.     */    private final Expr        formula;    /**     * The ALS file which has provided the command.     */    private final IALSFile     file;    /**     * result can be executable.SAT executable.UNSAT or executable.UNKNOWN.     */    private int               result;    /**     *      *      *      */    private String            stringResult;    private A4Solution        ans;    private IViewPart		  viewPart;        /**     * Constructor.     */    public ExecutableCommand(IALSFile file2, Command command, Expr formula,            Module world) {        assert (file2 != null);        assert (command != null);        assert (formula != null);        assert (world != null);        this.file = file2;        this.world = world;        this.command = command;        this.formula = formula;        this.result = IALSCommand.UNKNOW;        this.viewPart = null;    }    /**     * Get the option.     */    public A4Options getOptions() {        A4Options options;        options = new A4Options();        SatSolver solver;// =A4Options.SatSolver.SAT4J;        String defaultSolver = AlloyPlugin.getDefault().getPreferenceStore()                .getString(PreferenceConstants.P_SOLVER_CHOICE);        if (PreferenceConstants.V_SOLVER_BERKMIN.equals(defaultSolver)) {            solver = A4Options.SatSolver.BerkMinPIPE;        } else if (PreferenceConstants.V_SOLVER_ZChaffJNI.equals(defaultSolver)) {            solver = A4Options.SatSolver.ZChaffJNI;        } else if (PreferenceConstants.V_SOLVER_MiniSatProverJNI                .equals(defaultSolver)) {            solver = A4Options.SatSolver.MiniSatProverJNI;        } else if (PreferenceConstants.V_SOLVER_MiniSatProverUnsatCore                .equals(defaultSolver)) {            solver = A4Options.SatSolver.MiniSatProverJNI;        } else {            solver = A4Options.SatSolver.SAT4J;        }        // solver = A4Options.SatSolver.MiniSatProverJNI;        options.solver = solver;        options.solverDirectory = AlloyPlugin.getDefault().getPreferenceStore()                .getString(PreferenceConstants.P_SOLVERS_PATH);        options.originalFilename = getFilename();        return options;    }    /**     * Get the resource which this command is from.     */    public IResource getResource() {        return file.getResource();    }    /**     * Get the location of the file where this command is located.     */    public String getFilename() {        return Util.getFileLocation(file.getResource());    }    public IViewPart getViewPart() { return viewPart; }        /**     * return the world.     */    public Module getWorld() {        return world;    }    /**     * return the command.     */    public Command getCommand() {        return command;    }    /**     * Return the result.     */    private int getResult() {        return result;    }    /**     * Execute this command with te given reporter.     */    public Pair<A4Solution,Boolean> execute(IReporter rep) throws Err {        rep.setExecCommand(this);        Iterable<Sig> sigs = world.getAllReachableSigs();        Expr fact = formula;        for (Module m : world.getAllReachableModules())            for (Pair<String, Expr> e : m.getAllFacts())                fact = fact.and(e.b);        A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, sigs,                fact, command, getOptions());        this.ans = ans;        file.fireChange();        // if preference "show answer after execution" is enable, display answer        // in a Graphic thread:        if (AlloyPlugin.getDefault().getPreferenceStore().getBoolean(                PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER))        {            displayAnsSafe();        }        return new Pair<A4Solution,Boolean>(ans, null!=ans);    }    public Pair<A4Solution, Boolean> getAns() {        return new Pair<A4Solution, Boolean>(ans, null!=ans);    }    /**     * Set this command sat.     */    public void setSat(boolean sat) {        if (sat)            result = IALSCommand.SAT;        else            result = IALSCommand.UNSAT;        file.fireChange();    }    /**     * Set the string result for this command.     */    public void setStringResult(String s) {        stringResult = s;    }    /**     * Get the string result of this command.     */    public String getStringResult() {        return stringResult;    }    public Image getIcon() {        // return command.check ?iconcheck:iconrun;        ImageRegistry reg = ALSImageRegistry.getImageRegistry();        if (getResult() == ExecutableCommand.SAT) {            if (isCheck()) {                if (isExpect())// expected sat check command                    return reg.get(ALSImageRegistry.BLUE_CHECK_ID);                // not expected                // sat check                // command                return reg.get(ALSImageRegistry.RED_CHECK_ID);            }            // Sat Run command            return reg.get(ALSImageRegistry.GREEN_RUN_ID);        }        if (getResult() == ExecutableCommand.UNSAT) {            if (isCheck())                return reg.get(ALSImageRegistry.GREEN_CHECK_ID);// OK            if (getCommand().expects == 0)                return reg.get(ALSImageRegistry.BLUE_RUN_ID);            return reg.get(ALSImageRegistry.RED_RUN_ID);        }        if (isCheck())            return reg.get(ALSImageRegistry.CHECK_ID);        return reg.get(ALSImageRegistry.RUN_ID);    }    public int getBeginLine() {        return command.pos.y;    }        public int getEndLine() {        return command.pos.y2;    }    public String getName() {        return command.toString();    }    public String toString() {        if (this.getResult() == IALSCommand.UNKNOW)            return command.toString();        if (this.getResult() != IALSCommand.SAT)            return command.toString() + " [UNSAT]";        return command.toString() + " [SAT]";    }    /**     * Display answer.     */    private void displayAns() throws Err {        if (ans.satisfiable()) {            IFolder outputFolder = getAnswerFolder("output");            if (outputFolder == null)                return;            IFile outputFile = outputFolder.getFile(getName() + ".xml");            if (!outputFile.exists())            {                try {                    outputFile.create(null/* new byte[0] */, false, null);                } catch (CoreException e) {                	AlloyPlugin.getDefault().log(e);                }            }            String filename = Util.getFileLocation(outputFile);            ans.writeXML(filename);            try {            	Util.refreshProjectManager(outputFile.getLocation());            } catch (CoreException e1) {                // TODO Auto-generated catch block                e1.printStackTrace();            }            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();            IWorkbenchPage page = window.getActivePage();            String titlename = getName() + ", " + AlloyLaunching.getResourcePartName(getResource());                        this.viewPart = VizView.showAlloyVisualizationView(            		page, getResource().getLocation(), titlename);        }    }    /**     * Get answer folder.     */    private IFolder getAnswerFolder(String folderName)    {        IFolder outputFolder = getResource().getParent().getFolder(                new Path(folderName));        if (!outputFolder.exists())        {            try {                outputFolder.create(false, true, null);            } catch (CoreException e) {            	AlloyPlugin.getDefault().log(e);                return null;            }        }        return outputFolder;    }    /*     * (non-Javadoc)     * @see fr.univartois.cril.alloyplugin.api.IALSCommand#displayAnsSafe()     */    public void displayAnsSafe() {        Display display = PlatformUI.getWorkbench().getDisplay();        if (display != null) {            display.asyncExec(            new Runnable() {                public void run() {                    try {                        ExecutableCommand.this.displayAns();                        synchronized(ExecutableCommand.this) {                         	ExecutableCommand.this.notifyAll();                        }                                            } catch (Err e) {                    	AlloyPlugin.getDefault().log(e);                    }                }            });                        try {            	synchronized(this) { this.wait(); }            } catch (InterruptedException e) {            	AlloyPlugin.getDefault().log(e);            }        }    }    public boolean isCheck() {        return command.check;    }    public boolean isExpect() {        return (command.expects >= 1);    }}