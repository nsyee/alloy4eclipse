package fr.univartois.cril.xtext.ui.outline;

import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import fr.univartois.cril.xtext.alloyplugin.core.ExecutableCommand;
import fr.univartois.cril.xtext.als.Paragraph;

public class CommandOutlineNode {
	
	
	private ExecutableCommand cmd;
	private ContentOutlineNode ct;
	public CommandOutlineNode (ContentOutlineNode node){
		ct=node;
	}

	public ContentOutlineNode getCt(){
		return ct;
	}
	public void setCommand(ExecutableCommand cmd){
		this.cmd=cmd;
	}
	
	public ExecutableCommand getCommand(){
		return cmd;
	}
}
