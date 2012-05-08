package fr.univartois.cril.xtext2.ui.documentation;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import fr.univartois.cril.xtext2.als.EnumDecl;
import fr.univartois.cril.xtext2.als.EnumName;
import fr.univartois.cril.xtext2.als.Fact;
import fr.univartois.cril.xtext2.als.FactName;
import fr.univartois.cril.xtext2.als.Function;
import fr.univartois.cril.xtext2.als.FunctionName;
import fr.univartois.cril.xtext2.als.FunctionNamewParam;
import fr.univartois.cril.xtext2.als.Let;
import fr.univartois.cril.xtext2.als.LetName;
import fr.univartois.cril.xtext2.als.Predicate;
import fr.univartois.cril.xtext2.als.PredicateName;
import fr.univartois.cril.xtext2.als.Signature;
import fr.univartois.cril.xtext2.als.SignatureName;

public class AlsEObjectDocumentationProvider implements IEObjectDocumentationProvider {
	
	    public String getDocumentation(EObject o) {
	    	
	    	String comment = new String() ;
	    		
	    	if (o instanceof EnumName){
	    		EnumDecl enu = (EnumDecl) o.eContainer() ;
	    		if(!enu.getDocumentation().isEmpty()){
	    			TagElement tag = (TagElement) getJavaDoc(o, enu.getDocumentation().get(0)).tags().get(0) ;
	    			for (int i = 0; i < tag.fragments().size() ; i++)
	    				comment = comment + tag.fragments().get(i).toString() + "<br/>" ;
	    			return comment ;
	    		}
	    	}
	        if (o instanceof FactName){
	        	Fact fact = (Fact) o.eContainer() ;
	    		if(!fact.getDocumentation().isEmpty()){
	    			TagElement tag = (TagElement) getJavaDoc(o, fact.getDocumentation().get(0)).tags().get(0) ;
	    			for (int i = 0; i < tag.fragments().size() ; i++)
	    				comment = comment + tag.fragments().get(i).toString() + "<br/>" ;
	    			return comment ;
	    		}
	        }
	        if (o instanceof FunctionName || o instanceof FunctionNamewParam){
	        	Function fun = (Function) o.eContainer() ;
	    		if(!fun.getDocumentation().isEmpty()){
	    			TagElement tag = (TagElement) getJavaDoc(o, fun.getDocumentation().get(0)).tags().get(0) ;
	    			for (int i = 0; i < tag.fragments().size() ; i++)
	    				comment = comment + tag.fragments().get(i).toString() + "<br/>" ;
	    			return comment ;
	    		}
	        }
	        if (o instanceof LetName){
	        	Let let = (Let) o.eContainer() ;
	    		if(!let.getDocumentation().isEmpty()){
	    			TagElement tag = (TagElement) getJavaDoc(o, let.getDocumentation().get(0)).tags().get(0) ;
	    			for (int i = 0; i < tag.fragments().size() ; i++)
	    				comment = comment + tag.fragments().get(i).toString() + "<br/>" ;
	    			return comment ;
	    		}
	        }
	        if (o instanceof PredicateName) {
	    		Predicate pred = (Predicate) o.eContainer() ;
	    		if(!pred.getDocumentation().isEmpty()){
	    			TagElement tag = (TagElement) getJavaDoc(o, pred.getDocumentation().get(0)).tags().get(0) ;
	    			for (int i = 0; i < tag.fragments().size() ; i++)
	    				comment = comment + tag.fragments().get(i).toString() + "<br/>" ;
	    			return comment ;
	    		}
	        }
	        if (o instanceof SignatureName) {
	    		Signature sig = (Signature) o.eContainer() ;
	    		if(!sig.getDocumentation().isEmpty()){
	    			TagElement tag = (TagElement) getJavaDoc(o, sig.getDocumentation().get(0)).tags().get(0) ;
	    			for (int i = 0; i < tag.fragments().size() ; i++)
	    				comment = comment + tag.fragments().get(i).toString() + "<br/>" ;
	    			return comment ;
	    		}
	        }
	        return null;
	    }
	    
	    public Javadoc getJavaDoc(EObject context, String rawJavaDoc) {
			if (context == null)
				return null;
			
			IWorkspaceRoot user = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = user.getProject("MyProject");
			IJavaProject classpathURIContext = JavaCore.create(project);
			
			if (classpathURIContext instanceof IJavaProject) {
				IJavaProject javaProject = (IJavaProject) classpathURIContext;
				ASTParser parser = ASTParser.newParser(AST.JLS3);
				parser.setProject(javaProject);
				@SuppressWarnings("unchecked")
				Map<String, String> options = javaProject.getOptions(true);
				options.put(JavaCore.COMPILER_DOC_COMMENT_SUPPORT, JavaCore.ENABLED);
				parser.setCompilerOptions(options);
				String source = rawJavaDoc + "class C{}";
				parser.setSource(source.toCharArray());
				CompilationUnit root = (CompilationUnit) parser.createAST(null);
				if (root == null)
					return null;
				@SuppressWarnings("unchecked")
				List<AbstractTypeDeclaration> types = root.types();
				if (types.size() != 1)
					return null;
				AbstractTypeDeclaration type = types.get(0);
				return type.getJavadoc();
			}
			return null;
		}
}

