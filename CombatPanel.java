
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.text.DefaultCaret;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dustin Mulligan
 */
public class CombatPanel extends JPanel {
private static int x = 0;
private static int turncount = 1;    
final public JPanel panel = new JPanel();
    CombatPanel(){
    JTextArea textbox = new JTextArea();
    JScrollPane scrollbox = new JScrollPane(textbox);
    textbox.setEditable(false);
    textbox.setBounds(0, 0, 100, 100);
    scrollbox.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    JLabel options = new JLabel(new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\OptionsTester.gif"));
    JLabel pointer = new JLabel(new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\pointer.png"));
    JLabel character = new JLabel(new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\WizardIcon.png"));
    panel.setLayout(null);
    panel.add(character);
    panel.add(pointer);    
    panel.add(options);

    Dimension characterdim = character.getPreferredSize();
    character.setBounds(50,50,characterdim.width,characterdim.height);
    Dimension sizeoptions = options.getPreferredSize();
    options.setBounds(1200-(sizeoptions.width),800-(sizeoptions.height),sizeoptions.width,sizeoptions.height);
    Dimension size = pointer.getPreferredSize();
    pointer.setBounds(1200-(size.width),(20+(x*120)+(800-sizeoptions.height)),size.width,size.height);
    panel.add(scrollbox);
    DefaultCaret crList = (DefaultCaret) textbox.getCaret();
    crList.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    scrollbox.setBounds(0,800-(sizeoptions.height),1200-(sizeoptions.width),(sizeoptions.height)-20);
    panel.addKeyListener(new KeyListener() {
        @Override
            public void keyPressed (KeyEvent e){
    if (e.getKeyCode()==40)
    {   switch(x){
            case 0: x=1;
            break;
            case 1: x=2;
            break;
            case 2: x=0;
            break;}
    pointer.setBounds(1200-(size.width),(20+((Math.abs(x)%3)*120)+(800-sizeoptions.height)),size.width,size.height);
    panel.repaint();
    }
    else if (e.getKeyCode()==38)
    {
            switch(x){
            case 0: x=2;
            break;
            case 1: x=0;
            break;
            case 2: x=1;
            break;}    
    pointer.setBounds(1200-(size.width),(20+((Math.abs(x)%3)*120)+(800-sizeoptions.height)),size.width,size.height);
    panel.repaint();
    }
    else if (e.getKeyCode()==10){
            textbox.append("Turn "+turncount+": ");
            switch(x){
            case 0:            
            textbox.append("You Attack the silly monster!");
            break;
            case 1:           
            textbox.append("Is that a sword in your pocket or are you happy to see me? Wait...its not a sword.....oh...");
            break;
            case 2:             
            textbox.append("Fleeing is for pussies! Get the fuck back in there and die like a man!");
            break;}
    textbox.append(System.lineSeparator());
    textbox.validate();
    panel.repaint();
    turncount++;
            }
            }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    });
    panel.requestFocus();
    }
}

