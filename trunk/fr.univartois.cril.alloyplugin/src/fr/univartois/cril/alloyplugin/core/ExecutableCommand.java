package fr.univartois.cril.alloyplugin.core;




import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException ;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.World;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options ;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options.SatSolver;
import edu.mit.csail.sdg.alloy4viz.VizGUI;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ui.IALSCommand;
import fr.univartois.cril.alloyplugin.editor.MultiPageEditor;
import fr.univartois.cril.alloyplugin.launch.util.Util;
import fr.univartois.cril.alloyplugin.preferences.PreferenceConstants;

/**
 * A command with its world and its resource.
 * Can be executed.
 */
public class ExecutableCommand implements IALSCommand {
    public static final int SAT = 1;
    public static final int UNSAT = 2;
    public static final int UNKNOW = 0;

    public static final Image iconrun = AlloyPlugin.getDefault().getImage(AlloyPlugin.RUN_ICON_ID );
    public static final Image iconcheck = AlloyPlugin.getDefault().getImage(AlloyPlugin.CHECK_ICON_ID);

    /**
     * The Command's world .
     */
    private final World world;

    /**
     * The command itself.
     */
    private final Command command;

    /**
     * The ALS file which has provided the command.
     */
    private final ALSFile file;

    /**
     * An Options for execution.
     */
    private final A4Options options;

    /**
     * result can be executable.SAT executable.UNSAT or executable.UNKNOWN.
     */
    private int result;

    /**
     *
     */
    private String stringResult;
    private A4Solution ans;



    /**
     * Constructor.
     */
    private ExecutableCommand(ALSFile file,Command command, World world,A4Options options) {        
        if(options==null){
            this.options = new A4Options();
            SatSolver solver;//=A4Options.SatSolver.SAT4J;
            String defaultSolver=AlloyPlugin.getDefault().getPreferenceStore().getString( PreferenceConstants.P_SOLVER_CHOICE);
            if(PreferenceConstants.V_SOLVER_MINISAT_PIPE.equals(defaultSolver)) {            
                solver = A4Options.SatSolver.MiniSatPIPE;
            }
            else {            
                solver = A4Options.SatSolver.SAT4J;
            }

            solver = A4Options.SatSolver.SAT4J;
            this.options.solver=solver;
        }
        else
            this.options=options ;

        assert(file!=null);
        assert(command!=null);
        assert(world!=null);

        this.file = file;
        this.world    = world;
        this.command  = command;
        this.result    = UNKNOW;
    }



    /**
     * Constructor.
     */
    public ExecutableCommand(ALSFile file,Command command, World world) {
        this(file,command,world,null);                
    }



    /**
     * Get the option.
     * */
    public A4Options getOptions(A4Reporter rep) {
        options.setReporter(rep);
        return options;
    }

    /**
     * Get the resource which this command is from.
     */
    public IResource getResource() {
        return file.getResource();
    }    


    /**
     *  Get the location of the file where this command is located.
     */
    public String getFilename() {        
        return Util.getFileLocation(file.getResource());        
    }    

    /**
     * return the world.
     */
    public World getWorld() {
        return world;
    }



    /**
     * return the command.
     */
    public Command getCommand() {
        return command;
    }



    /**
     * Return the result.
     */
    public int getResult() {

        return result;        
    }



    /**
     * Execute this command whith te given reporter.
     * */
    protected A4Solution execute(Reporter rep) throws Err {
        rep.setExecCommand(this);
        A4Solution ans = TranslateAlloyToKodkod.execute_command(world,command,getOptions(rep), null, null);
        this.ans=ans;
        
        if(AlloyPlugin.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER))
        {
         
            Display display = PlatformUI.getWorkbench().getDisplay();        
            if (display!=null)
                display.asyncExec(
                        new Runnable() {
                            public void run(){
                                try {
                                    ExecutableCommand.this.displayAns();
                                } catch (Err e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }                    
                            }
                        });

        }
        return ans;
    }

    public A4Solution getAns(){return ans;}

    /**
     * Set this command sat.
     */
    public void setSat(boolean sat) {
        if (sat) result=SAT;
        else result=UNSAT;        
        file.fireChange();
    }



    /**
     * Set the string result for this command.
     */
    public void setStringResult(String s) {
        stringResult=s;
    }



    /**
     * Get the string result of this command.
     */
    public String getStringResult() {
        return stringResult;
    }


    public Image getIcon() {
        //return command.check ?iconcheck:iconrun;

        ImageRegistry reg = AlloyPlugin.getDefault().getImageRegistry();

        if (getResult()==ExecutableCommand.SAT)
            if (getCommand().check) {
                if(getCommand().expects==1)
                    return reg.get(AlloyPlugin.BLUE_CHECK_ID);// not expected sat check command
                else
                    return reg.get(AlloyPlugin.RED_CHECK_ID);// expected sat check command
            }
            else return reg.get(AlloyPlugin.GREEN_RUN_ID);;//Sat Run command
            if (getResult()==ExecutableCommand.UNSAT)
                if (getCommand().check) return reg.get(AlloyPlugin.GREEN_CHECK_ID );//OK
                else {
                    if(getCommand().expects==0)
                        return reg.get(AlloyPlugin.BLUE_RUN_ID);
                    else
                        return reg.get (AlloyPlugin.RED_RUN_ID);
                }
            if (getCommand().check)
                return reg.get(AlloyPlugin.CHECK_ID);
            else
                return reg.get(AlloyPlugin.RUN_ID);

            //return reg.get(AlloyPlugin.COMMAND_ID);

    }



    public int getLine() {
        return command.pos.y;
    }



    public String getName() {
        return command.toString();

    }
    
    
    public String toString(){        
        if (this.getResult()==ExecutableCommand.UNKNOW)
            return command.toString();
        if (this.getResult()!=ExecutableCommand.SAT)
            return command.toString()+" [UNSAT]";
        else return command.toString()+" [SAT]";    

    }
    /**
     * Display answer.
     *
     * */
    public  void displayAns() throws Err {
        
        if (ans.satisfiable()){
            IFolder outputFolder=getResource().getParent().getFolder(new Path("output"));//=getResource().getProject().getFolder(path);
            if(!outputFolder.exists())
            {
                try {

                    outputFolder.create(false,true, null);// create(new ByteArrayInputStream(new byte[0]), true, null);
                } catch (CoreException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return;
                }
            }
            
            IFile outputFile=outputFolder.getFile(getName()+".xml");

            if(!outputFile.exists())
            {
                try {
                    outputFile.create(null/*new byte[0]*/, false, null);
                } catch (CoreException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            ans.writeXML(Util.getFileLocation(outputFile), false);            
            IEditorInput editorInput = new FileEditorInput(outputFile);
            IWorkbenchWindow window=PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            IWorkbenchPage page = window.getActivePage();            
            try {
				page.openEditor(editorInput, MultiPageEditor.EDITOR_ID);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }


    }


    public boolean isCheck() {
        return command.check;
    }





}