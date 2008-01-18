package fr.univartois.cril.alloyplugin.core;

import org.eclipse.core.resources.IFile;

/**
 * 
 * @author desruelles lionel
 *
 */


public class RenameAlsInfo {
	// the offset of the word to be renamed in the file
	private int offset;
	// the new name 
	private String newName;
	// the old name (as selected by the user)
	private String oldName;
	// the file that contains the word to be renamed
	private IFile sourceFile;
	// whether the refactoring should also change the name of the word
	// in corresponding Alloy files in the same bundle (i.e. which start
	// with the same name)
	private boolean updateBundle;
	// whether the refactoring should also update Alloy files in other
	// projects than the current one
	private boolean allProjects;

	public int getOffset() {
		return offset;
	}

	public void setOffset(final int offset) {
		this.offset = offset;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(final String newName) {
		this.newName = newName;
	}

	public String getOldName() {
		return oldName;
	}

	public void setOldName(final String oldName) {
		this.oldName = oldName;
	}

	public IFile getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(final IFile sourceFile) {
		this.sourceFile = sourceFile;
	}

	public boolean isAllProjects() {
		return allProjects;
	}

	public void setAllProjects(final boolean allProjects) {
		this.allProjects = allProjects;
	}

	public boolean isUpdateBundle() {
		return updateBundle;
	}

	public void setUpdateBundle(final boolean updateBundle) {
		this.updateBundle = updateBundle;
	}

}
