package fr.univartois.cril.alloyplugin.launch.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;


public class GraphView extends ViewPart {

	public Composite parent;

	public static GraphView defaut;

	public GraphView() {
		defaut = this;
	}

	@Override

	public void createPartControl(Composite parent) {
		Composite c=new Composite(parent, SWT.EMBEDDED);
		java.awt.Frame frame = SWT_AWT.new_Frame(c);
		JPanel panel = new JPanel();
		panel.add(new JLabel("coucou"));
		frame.add(panel);	
	}

	public void afficheResult(){	
	}



	@Override
	public void setFocus() {


	}

	public static void Visualize(A4Solution ans) throws Err {

		ans.writeXML("output.xml", false);
		//
		// You can then visualize the XML file by calling this:
		if (defaut==null) return;
		//java.awt.Frame frame = SWT_AWT.new_Frame(defaut.parent);
		JFrame jFrame=new JFrame();
		//frame.add(jFrame);
		//MyVizGUI viz = new MyVizGUI(jFrame,false,"",null);
		//viz.run(VizGUI.evs_loadInstanceForcefully, "output.xml");


	}

}
