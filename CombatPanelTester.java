import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dustin Mulligan
 */
public class CombatPanelTester {
    public static void main(String args[]){
    JPanel panel = new JPanel();
    CombatPanel test = new CombatPanel();
    JFrame frame = new JFrame();
    frame.add(test.panel);
    frame.setSize(1200,800);
    frame.setVisible(true);
    frame.setResizable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    test.panel.requestFocus();
    }
    
}
