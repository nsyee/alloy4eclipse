
package fr.univartois.cril.alloyplugin.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;


/**
 * Class for completion. This is loaded by ALSSourceViewerConfiguration. 
 */
public class ALSCompletionProcessor implements IContentAssistProcessor {

	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {

	    List<CompletionProposal> props = new ArrayList<CompletionProposal>();
        try {
            String prefix = getPrefix(viewer,offset);
            for(String keyword : AlloySyntaxConstants.keywords)
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
		return new char[] {  '(' };
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
