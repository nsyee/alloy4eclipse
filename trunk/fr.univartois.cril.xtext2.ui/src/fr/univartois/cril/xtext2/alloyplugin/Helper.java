package fr.univartois.cril.xtext2.alloyplugin;

import java.io.File;
import java.util.Date;
import java.util.Random;

import edu.mit.csail.sdg.alloy4.OurDialog;
import edu.mit.csail.sdg.alloy4.Util;

public final class Helper {
    /** Constructor is private, since this utility class never needs to be instantiated. */
    private Helper() { }

    /** This variable caches the result of alloyHome() function call. */
    private static String alloyHome=null;

    /** Find a temporary directory to store Alloy files; it's guaranteed to be a canonical absolute path. */
    public static synchronized String alloyHome() {
        if (alloyHome == null){
	        String temp=System.getProperty("java.io.tmpdir");
        
    	    if (temp==null || temp.length()==0)
        	    OurDialog.fatal("Error. JVM need to specify a temporary directory using java.io.tmpdir property.");
        
        	String username=System.getProperty("user.name");
	        File tempfile=new File(temp+File.separatorChar+"alloy4tmp19-"+(username==null?"":username));
    	    tempfile.mkdirs();
        	String ans=Util.canon(tempfile.getPath());
        
	        if (!tempfile.isDirectory())
    	        OurDialog.fatal("Error. Cannot create the temporary directory "+ans);
        
        	if (!Util.onWindows()) {
            	String[] args={"chmod", "700", ans};
	            try {Runtime.getRuntime().exec(args).waitFor();}
    	        catch (Exception ex) {} // We only intend to make the best effort.
        	}
        
        	alloyHome = ans;
        }
        
        return alloyHome;
    }

    
    
    /**
     * Create an empty temporary directory for use, designate it "deleteOnExit", then return it.
     * It is guaranteed to be a canonical absolute path.
     */
    public static String maketemp() {
        Random r=new Random(new Date().getTime());
        while(true) {
            int i=r.nextInt(1000000);
            String dest = alloyHome()+File.separatorChar+"tmp"+File.separatorChar+i;
            File f=new File(dest);
            if (f.mkdirs()) {
                f.deleteOnExit();
                return Util.canon(dest);
            }
        }
    }

    
    
    /** Return the number of bytes used by the Temporary Directory (or return -1 if the answer exceeds "long") */
    public static long computeTemporarySpaceUsed() {
        long ans = iterateTemp(null,false);
        
        if (ans<0)
        	return -1;
        return ans;
    }

    
    
    /** Delete every file in the Temporary Directory. */
    public static void clearTemporarySpace() {
    	iterateTemp(null,true);
    }

    
    
    private static long iterateTemp(String filename, boolean delete) {
        long ans=0;
        
        if (filename==null)
        	filename = alloyHome()+File.separatorChar+"tmp";
        
        File x = new File(filename);
        
        if (x.isDirectory()) {
            for(String subfile:x.list()) {
                long tmp=iterateTemp(filename+File.separatorChar+subfile, delete);
                if (ans>=0)
                	ans = ans+tmp;
            }
            if (delete)
            	x.delete();
        }
        else if (x.isFile()) {
            long tmp=x.length();
            if (ans>=0)
            	ans = ans+tmp;
            
            if (delete)
            	x.delete();
        }
        
        return ans;
    }
}
