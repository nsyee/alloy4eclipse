package fr.univartois.cril.alloyplugin.core;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4.Pos;
import fr.univartois.cril.alloyplugin.api.IALSTreeDecorated;

public class UnsatCorePos implements IALSTreeDecorated {

	private final Pos pos;

	public UnsatCorePos(Pos pos) {
		this.pos = pos;
	}

	@Override
	public int getBeginLine() {
		return pos.y;
	}

	@Override
	public int getEndLine() {
		return pos.y2;
	}

	public int getX() {
		return pos.x;
	}

	public int getX2() {
		return pos.x2;
	}

	@Override
	public boolean isPrivate() {
		return false;
	}

	@Override
	public Image getIcon() {
		return null;
	}

	public String toString() {
		return "Unsat core member: line  " + pos.y + " Columns  " + pos.x + "|"
				+ pos.x2;
	}
}
