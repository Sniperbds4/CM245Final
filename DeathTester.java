/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm245.master;

import javax.swing.JFrame;

/**
 *
 * @author Capiton
 */
public class DeathTester {
    private static JFrame frame = new JFrame();
    public static void main(String args[]){
    DeathPanel test=new DeathPanel();
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
