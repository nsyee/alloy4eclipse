/*
 * Created on 13 nov. 07
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package fr.univartois.cril.xtext.alloyplugin.api;

import org.eclipse.jface.viewers.ITreeContentProvider;

public interface IAlloyTreeContentProvider extends ITreeContentProvider {

    IALSCommand [] getAllCommands();
    
    Object getCommandsRootContent();
}
