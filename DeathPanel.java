/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm245.master;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Capiton
 */
public class DeathPanel {

    final public JPanel panel = new JPanel();

    DeathPanel() {
        JLabel clippy = new JLabel(new ImageIcon(""));
        panel.setLayout(null);
        //add components
        panel.add(clippy);
        panel.setBounds(0, 0, 1250, 850);
        Dimension clippyDim = clippy.getPreferredSize();
        clippy.setBounds(600, 10, clippyDim.width, clippyDim.height);
        panel.validate();
        panel.repaint();
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 10:
                        System.exit(0);
                    default:
                        break;
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
