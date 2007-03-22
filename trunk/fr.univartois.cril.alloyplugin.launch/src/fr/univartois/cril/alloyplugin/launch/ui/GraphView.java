package fr.univartois.cril.alloyplugin.launch.ui;

import java.awt.Component;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;


public class GraphView extends ViewPart {


	
	public Composite c;
	public java.awt.Frame frame;
	public JPanel panel;
	public static GraphView defaut;

	public GraphView() {
		defaut = this;
	}

	@Override

	public void createPartControl(Composite parent) {
		 // c = new Composite(parent, SWT.SCROLL_PAGE| SWT.EMBEDDED);
		frame = SWT_AWT.new_Frame(parent);
		//JPanel panel = new JPanel();
		//panel.add(new JLabel("coucou"));
		frame.add(getPanel());	
	}

	private JPanel getPanel() {		
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
		MyVizGUI viz = new MyVizGUI(false,"",null);
		viz.run(MyVizGUI.evs_loadInstanceForcefully, "output.xml");
		
		if (defaut==null) return;		
		defaut.getPanel().add(viz.getGraphPanel());
		
		


	}

}
