
package fr.univartois.cril.alloyplugin.editor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

import fr.univartois.cril.alloyplugin.api.IALSFile;
import fr.univartois.cril.alloyplugin.api.IALSSignature;


/**
 * Class for completion. This is loaded by ALSSourceViewerConfiguration. 
 */
public class ALSCompletionProcessor implements IContentAssistProcessor {

    private ALSEditor editor;
    
    public ALSCompletionProcessor(ALSEditor editor) {
        this.editor = editor;
    }
    
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
	    IALSFile alsFile = editor.getALSFile();
	    List<CompletionProposal> props = new ArrayList<CompletionProposal>();
        try {
            String prefix = getPrefix(viewer,offset);
            List<String> keywords = new ArrayList<String>();
            keywords.addAll(Arrays.asList(AlloySyntaxConstants.keywords));
            if (alsFile!=null) {
                for (IALSSignature sig : alsFile.getSignatures()) {
                    keywords.add(sig.getId());
                }
            }
            
            for(String keyword : keywords)
            {
            	if (keyword.startsWith(prefix))
            	    props.add(new CompletionProposal(keyword,offset-prefix.length(),prefix.length(),keyword.length()));	
            }
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
		CompletionProposal [] tab = new CompletionProposal[props.size()];
		return props.toArray(tab);
	}

	
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null; // new char[] {  '(' };
	}
	

	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	public String getErrorMessage() {
		return null;
	}
	
	 /**
     * @see http://dev.eclipse.org/newslists/news.eclipse.modeling.gmf/msg01324.html
     * @param viewer
     * @param offset
     * @return the text input by the user
     * @throws BadLocationException
     */
    private String getPrefix(ITextViewer viewer, int offset) throws BadLocationException {
        IDocument doc= viewer.getDocument();
        if (doc == null || offset > doc.getLength())
            return null;
        
        int length= 0;
        while (--offset >= 0 && Character.isJavaIdentifierPart(doc.getChar(offset)))
            length++;
        
        return doc.get(offset + 1, length);
    }
    
    

}
