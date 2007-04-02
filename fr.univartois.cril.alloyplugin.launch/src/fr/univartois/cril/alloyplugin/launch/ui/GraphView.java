package fr.univartois.cril.alloyplugin.launch.ui;

import javax.swing.JPanel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;

//TODO create graph view
public class GraphView extends ViewPart {
	public Composite c;
	public java.awt.Frame frame;
	static JPanel panel;
	static GraphView defaut;
	private static MyVizGUI viz;

	public GraphView() {
		defaut = this;
	}

	@Override

	public void createPartControl(Composite parent) {
		c = new Composite(parent, SWT.SCROLL_PAGE| SWT.EMBEDDED);
		frame = SWT_AWT.new_Frame(c);
		//JPanel panel = new JPanel();
		//panel.add(new JLabel("coucou"));
		if(viz!=null) getPanel().add(viz.getGraphPanel());
		frame.add(getPanel());
		
	}

	private static JPanel getPanel() {		
		if (panel==null) panel = new JPanel();
		return panel;
	}

	public void afficheResult(){	
	}
	@Override
	
	public void setFocus() {
		c.setFocus();
	}


	public static void Visualize(A4Solution ans) throws Err {
		ans.writeXML("output.xml", false);
		//
		// You can then visualize the XML file by calling this:
		viz = new MyVizGUI(false,"",null);
		viz.run(MyVizGUI.evs_loadInstanceForcefully, "output.xml");
				
		getPanel().removeAll();		
		getPanel().add(viz.getGraphPanel());
	}
	

}
