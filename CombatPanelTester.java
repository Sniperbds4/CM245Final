package cm245.master;
import java.awt.event.WindowEvent;
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
    private static JFrame frame = new JFrame();
    public static void main(String args[]){
    CombatPanel test= new CombatPanel();
    frame.add(test.panel);
    frame.setSize(1216,838);
    frame.setVisible(true);
    frame.setResizable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    test.panel.requestFocus();
    
    }
    public static void close(){
    frame.dispose();
        
        
    }
}
