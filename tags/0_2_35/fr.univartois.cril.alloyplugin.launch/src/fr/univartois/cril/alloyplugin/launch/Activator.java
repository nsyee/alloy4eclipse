package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	private BundleContext context;
	private static Activator activator;
	
	public Activator() {
		activator = this;
	}
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		this.context = context;
	}
	
	public BundleContext getBundleContext() {
		return context;
	}

	public static Activator getDefault() {
		return activator;
	}
}
