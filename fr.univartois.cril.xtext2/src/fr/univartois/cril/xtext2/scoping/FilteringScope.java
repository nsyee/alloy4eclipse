package fr.univartois.cril.xtext2.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class FilteringScope implements IScope {
	
	private IScope delegate;
    private Predicate<IEObjectDescription> filter;
    
    public FilteringScope(IScope delegate, Predicate<IEObjectDescription> filter) {
        this.delegate = delegate;
        this.filter = filter;
    }
    
    /*
    public IScope getOuterScope() {
        return new FilteringScope(delegate.getOuterScope(), filter);
    }
    */

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		return filter(delegate.getSingleElement(name)) ;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		return filter(delegate.getElements(name));
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {
		return filter(delegate.getSingleElement(object)) ;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		return filter(delegate.getElements(object));
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		return filter(delegate.getAllElements()) ;
	}
	
	protected Iterable<IEObjectDescription> filter(Iterable<IEObjectDescription> unfiltered) {
	    return Iterables.filter(unfiltered, filter);
	}
	
	protected IEObjectDescription filter(IEObjectDescription contentByEObject) {
        if (!filter.apply(contentByEObject)) return null;
        return contentByEObject;
    }
}

