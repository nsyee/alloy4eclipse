/*******************************************************************************
 * Copyright (c) 2007 SAS Institute. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: SAS Institute - initial API and implementation
 ******************************************************************************/
package swingintegration.example;

import java.awt.Frame;

import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class Platform {
    private static String platformString = SWT.getPlatform();

    static {
        try {
            if (isGtk()) {
                UIManager.setLookAndFeel(new MetalLookAndFeel());
                System.out.println("Using Java L&F");
            } else {
                UIManager.setLookAndFeel(UIManager
                        .getSystemLookAndFeelClassName());
                System.out.println("Using System L&F");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // prevent instantiation
    private Platform() {
    }

    public static boolean isWin32() {
        return "win32".equals(platformString); //$NON-NLS-1$
    }

    public static boolean isGtk() {
        return "gtk".equals(platformString); //$NON-NLS-1$
    }
    
    private static boolean isSunJava6() {
        return System.getProperty("java.version").startsWith("1.6")&& System.getProperty("java.vendor").startsWith("Sun ");
    }

    public static Composite createComposite(final Composite container,
            final Display display, final JComponent swingComponent) {
        if (!isSunJava6()||!isGtk()) {
            System.out.println("Creating an embedded composite");
            return createEmbeddedComposite(container, display, swingComponent);
        }
        System.out.println("Creating a normal composite");
        return createBasicComposite(container, display, swingComponent);

    }

    public static Composite createBasicComposite(final Composite container,
            Display display, JComponent swingComponent) {
        Composite composite = new Composite(container, SWT.EMBEDDED
                | SWT.NO_BACKGROUND);
        composite.setLayout(new FillLayout());
        Frame frame = SWT_AWT.new_Frame(composite);
        JApplet applet = new JApplet();
        applet.add(swingComponent);
        frame.add(applet);
        return composite;
    }

    public static Composite createEmbeddedComposite(final Composite container,
            final Display display, final JComponent swingComponent) {
        final EmbeddedSwingComposite a4Component = new EmbeddedSwingComposite(
                container, SWT.NONE) {

            @Override
            protected JComponent createSwingComponent() {
                return swingComponent;
            }
        };

        try {
            display.syncExec(new Runnable() {
                public void run() {
                    a4Component.populate();
                }
            });
        } catch (SWTException e) {
            e.printStackTrace();
        }
        return a4Component;
    }
}
