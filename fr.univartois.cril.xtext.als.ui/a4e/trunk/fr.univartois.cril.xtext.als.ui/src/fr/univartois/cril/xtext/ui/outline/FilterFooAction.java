package fr.univartois.cril.xtext.ui.outline;

import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.xtext.ui.editor.outline.XtextContentOutlinePage;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterAction;

public class FilterFooAction extends AbstractFilterAction  {

	  public FilterFooAction(XtextContentOutlinePage outlinePage) {
	    super("", outlinePage);
	    
	   
	  }

	  @Override
	  protected String getToggleId() {
	    return "";
	  }

	  @Override
	  protected ViewerFilter createFilter() {
	    return new FooOutlineFilter();
	  }

	}
