
package fr.univartois.cril.alloyplugin.editor;

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
		CompletionProposal[] tab=new CompletionProposal[AlloySyntaxConstants.keywords.length];
		for(int i=0;i<AlloySyntaxConstants.keywords.length;i++)
		{
			tab[i]=new CompletionProposal(AlloySyntaxConstants.keywords[i],offset,0,0);	
		}
		
		return tab;
	}

	
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] {  '(' };
	}
	

	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
