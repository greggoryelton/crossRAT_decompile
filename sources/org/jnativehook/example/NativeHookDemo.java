package org.jnativehook.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import org.jnativehook.GlobalScreen;
import org.jnativehook.b.d;
import org.jnativehook.c;
import org.jnativehook.e;

/* loaded from: hmar6.jar:org/jnativehook/example/NativeHookDemo.class */
public class NativeHookDemo extends JFrame implements ActionListener, ItemListener, WindowListener, org.jnativehook.a.a, org.jnativehook.b.a, d {

    /* renamed from: a  reason: collision with root package name */
    private JMenu f53a;

    /* renamed from: b  reason: collision with root package name */
    private JMenuItem f54b;
    private JMenuItem c;
    private JCheckBoxMenuItem d;
    private JCheckBoxMenuItem e;
    private JCheckBoxMenuItem f;
    private JCheckBoxMenuItem g;
    private JCheckBoxMenuItem h;
    private JTextArea i;
    private static final Logger j = Logger.getLogger(GlobalScreen.class.getPackage().getName());

    public NativeHookDemo() {
        setTitle("JNativeHook Demo");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(2);
        setSize(600, 300);
        addWindowListener(this);
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("File");
        jMenu.setMnemonic(70);
        jMenuBar.add(jMenu);
        this.f54b = new JMenuItem("Quit", 81);
        this.f54b.addActionListener(this);
        this.f54b.setAccelerator(KeyStroke.getKeyStroke(115, 8));
        this.f54b.getAccessibleContext().setAccessibleDescription("Exit the program");
        jMenu.add(this.f54b);
        JMenu jMenu2 = new JMenu("View");
        jMenu2.setMnemonic(86);
        jMenuBar.add(jMenu2);
        this.c = new JMenuItem("Clear", 67);
        this.c.addActionListener(this);
        this.c.setAccelerator(KeyStroke.getKeyStroke(67, 3));
        this.c.getAccessibleContext().setAccessibleDescription("Clear the screen");
        jMenu2.add(this.c);
        jMenu2.addSeparator();
        this.d = new JCheckBoxMenuItem("Enable Native Hook");
        this.d.addItemListener(this);
        this.d.setMnemonic(72);
        this.d.setAccelerator(KeyStroke.getKeyStroke(72, 3));
        jMenu2.add(this.d);
        this.f53a = new JMenu("Listeners");
        this.f53a.setMnemonic(76);
        jMenu2.add(this.f53a);
        this.e = new JCheckBoxMenuItem("Keyboard Events");
        this.e.addItemListener(this);
        this.e.setMnemonic(75);
        this.e.setAccelerator(KeyStroke.getKeyStroke(75, 3));
        this.f53a.add(this.e);
        this.f = new JCheckBoxMenuItem("Button Events");
        this.f.addItemListener(this);
        this.f.setMnemonic(66);
        this.f.setAccelerator(KeyStroke.getKeyStroke(66, 3));
        this.f53a.add(this.f);
        this.g = new JCheckBoxMenuItem("Motion Events");
        this.g.addItemListener(this);
        this.g.setMnemonic(77);
        this.g.setAccelerator(KeyStroke.getKeyStroke(77, 3));
        this.f53a.add(this.g);
        this.h = new JCheckBoxMenuItem("Wheel Events");
        this.h.addItemListener(this);
        this.h.setMnemonic(87);
        this.h.setAccelerator(KeyStroke.getKeyStroke(87, 3));
        this.f53a.add(this.h);
        setJMenuBar(jMenuBar);
        this.i = new JTextArea();
        this.i.setEditable(false);
        this.i.setBackground(new Color(255, 255, 255));
        this.i.setForeground(new Color(0, 0, 0));
        this.i.setText("");
        JScrollPane jScrollPane = new JScrollPane(this.i);
        jScrollPane.setPreferredSize(new Dimension(375, 125));
        add(jScrollPane, "Center");
        j.setUseParentHandlers(false);
        j.setLevel(Level.ALL);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new b(this, (byte) 0));
        consoleHandler.setLevel(Level.WARNING);
        j.addHandler(consoleHandler);
        GlobalScreen.a(new e());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.f54b) {
            dispose();
        } else if (actionEvent.getSource() != this.c) {
        } else {
            this.i.setText("");
        }
    }

    public void itemStateChanged(ItemEvent itemEvent) {
        JCheckBoxMenuItem itemSelectable = itemEvent.getItemSelectable();
        if (itemSelectable == this.d) {
            try {
                if (itemEvent.getStateChange() == 1) {
                    GlobalScreen.a();
                } else {
                    GlobalScreen.b();
                }
            } catch (c e) {
                this.i.append("Error: " + e.getMessage() + "\n");
            }
            this.d.setState(GlobalScreen.c());
            this.f53a.setEnabled(this.d.getState());
        } else if (itemSelectable == this.e) {
            if (itemEvent.getStateChange() == 1) {
                GlobalScreen.a((org.jnativehook.a.a) this);
            } else {
                GlobalScreen.b((org.jnativehook.a.a) this);
            }
        } else if (itemSelectable == this.f) {
            if (itemEvent.getStateChange() == 1) {
                GlobalScreen.a((org.jnativehook.b.b) this);
            } else {
                GlobalScreen.b((org.jnativehook.b.b) this);
            }
        } else if (itemSelectable == this.g) {
            if (itemEvent.getStateChange() == 1) {
                GlobalScreen.a((org.jnativehook.b.c) this);
            } else {
                GlobalScreen.b((org.jnativehook.b.c) this);
            }
        } else if (itemSelectable != this.h) {
        } else {
            if (itemEvent.getStateChange() == 1) {
                GlobalScreen.a((d) this);
            } else {
                GlobalScreen.b((d) this);
            }
        }
    }

    public void windowActivated(WindowEvent windowEvent) {
    }

    public void windowClosing(WindowEvent windowEvent) {
    }

    public void windowDeactivated(WindowEvent windowEvent) {
    }

    public void windowDeiconified(WindowEvent windowEvent) {
    }

    public void windowIconified(WindowEvent windowEvent) {
    }

    public void windowOpened(WindowEvent windowEvent) {
        requestFocusInWindow();
        this.d.setSelected(true);
        this.i.append("JNativeHook Version " + System.getProperty("jnativehook.lib.version"));
        this.i.append("\nAuto Repeat Rate: " + System.getProperty("jnativehook.key.repeat.rate"));
        this.i.append("\nAuto Repeat Delay: " + System.getProperty("jnativehook.key.repeat.delay"));
        this.i.append("\nDouble Click Time: " + System.getProperty("jnativehook.button.multiclick.iterval"));
        this.i.append("\nPointer Sensitivity: " + System.getProperty("jnativehook.pointer.sensitivity"));
        this.i.append("\nPointer Acceleration Multiplier: " + System.getProperty("jnativehook.pointer.acceleration.multiplier"));
        this.i.append("\nPointer Acceleration Threshold: " + System.getProperty("jnativehook.pointer.acceleration.threshold"));
        try {
            this.i.setCaretPosition(this.i.getLineStartOffset(this.i.getLineCount() - 1));
        } catch (BadLocationException unused) {
            this.i.setCaretPosition(this.i.getDocument().getLength());
        }
        this.e.setSelected(true);
        this.f.setSelected(true);
        this.g.setSelected(true);
        this.h.setSelected(true);
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0008: INVOKE  (r0 I:org.jnativehook.c) type: VIRTUAL call: org.jnativehook.c.printStackTrace():void, block:B:4:0x0007 */
    public void windowClosed(WindowEvent windowEvent) {
        c printStackTrace;
        try {
            GlobalScreen.b();
        } catch (c e) {
            printStackTrace.printStackTrace();
        }
        System.runFinalization();
        System.exit(0);
    }

    public static void main(String[] strArr) {
        System.out.println(new StringBuffer("\nJNativeHook: Global keyboard and mouse hooking for Java.\n").append("Copyright (C) 2006-2015 Alexander Barker.  All Rights Received.\nhttps://github.com/kwhat/jnativehook/\n").append("\nJNativeHook is free software: you can redistribute it and/or modify\n").append("it under the terms of the GNU Lesser General Public License as published\nby the Free Software Foundation, either version 3 of the License, or\n").append("(at your option) any later version.\n\n").append("JNativeHook is distributed in the hope that it will be useful,\nbut WITHOUT ANY WARRANTY; without even the implied warranty of\n").append("MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\nGNU General Public License for more details.\n").append("\nYou should have received a copy of the GNU Lesser General Public License\n").append("along with this program.  If not, see <http://www.gnu.org/licenses/>.\n"));
        SwingUtilities.invokeLater(new a());
    }
}
