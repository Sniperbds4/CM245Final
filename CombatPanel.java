package cm245.master;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.text.DefaultCaret;

/* To do list:
1. Setup relevant getters and setters
2. Setup constructor paramenters involving passing in enemy class and monster class
2.5 Item selection panel pop up on selection then calls relevant getters and setters
3. Write actual combat handling rather than pointless textbox output (This one depends on if randall has a seperate class or not)
4. Healthbar graphics
5. Decide better layout
6. Replace placeholder graphics with real graphics
 */
public class CombatPanel {

    public static int x = 0;
    public static int turncount = 1;
    public static int dmg;
    final public JPanel panel = new JPanel();
    ImageIcon goblin = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\goblyBoiFight.png");
    ImageIcon zombie = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\zombroFight.png");
    ImageIcon skeleton = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\skelebroFight.png");
    ImageIcon babar = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\babar.png");

    CombatPanel() {
        //Declarations
        JTextArea textbox = new JTextArea();
        JScrollPane scrollbox = new JScrollPane(textbox);
        JLabel options = new JLabel(new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\Options.png"));
        JLabel pointer = new JLabel(new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\pointer.png"));
        JLabel enemy = new JLabel(babar);
        JLabel character = new JLabel(new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\characterFight.png"));
        int xT = CombatandoverworldTester.movetest.getRoomX();
        int yT = CombatandoverworldTester.movetest.getRoomY();
        Combat bat = new Combat(CombatandoverworldTester.c, xT, yT);
        if (xT > 0 && xT < 4 && yT > 0 && yT < 4) {
            enemy.setIcon(goblin);
        }
        if (xT > 6 && xT < 10 && yT > 0 && yT < 4) {
            enemy.setIcon(skeleton);
        }
        if (xT > 3 && xT < 7 && yT > 3 && yT < 7) {
            enemy.setIcon(zombie);
        }
        enemy.validate();
        //remove default layout as a requirement to manually set locations
        panel.setLayout(null);
        //add components
        panel.add(enemy);
        panel.add(character);
        panel.add(pointer);
        panel.add(options);
        panel.add(scrollbox);
        //get dimensions to set relative locations
        panel.setBounds(0, 0, 1250, 850);
        Dimension enemyDim = enemy.getPreferredSize();
        enemy.setBounds(600, 10, enemyDim.width, enemyDim.height);
        Dimension charDim = character.getPreferredSize();
        character.setBounds(10, 10, charDim.width, charDim.height);
        Dimension sizeoptions = options.getPreferredSize();
        options.setBounds(1200 - (sizeoptions.width), 800 - (sizeoptions.height), sizeoptions.width, sizeoptions.height);
        Dimension size = pointer.getPreferredSize();
        pointer.setBounds(1100 - (size.width), (860 - sizeoptions.height), size.width, size.height);
        //sets up textbox to scroll automatically, not allow manual scrolling, and sets boundaries of textbox and scrollbox
        textbox.setEditable(false);
        textbox.setBounds(0, 0, 100, 100);
        DefaultCaret crList = (DefaultCaret) textbox.getCaret();
        crList.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        scrollbox.setBounds(0, 800 - (sizeoptions.height), 1207 - (sizeoptions.width), (sizeoptions.height));
        scrollbox.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        //adds the keylistener to the panel so that while it is focused every keystroke triggers the event
        panel.validate();
        panel.repaint();
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) { //outer switch statement checks key pressed vs keycodes

                    case 40: // Up Arrow Key
                        switch (x) { // inner switch sets selection based on previous selection and key pressed
                            case 0:
                                x = 1;
                                break;
                            case 1:
                                x = 2;
                                break;
                            case 2:
                                x = 0;
                                break;
                        }
                        //moves the pointer to reflect the change in x value        
                        pointer.setBounds(1100 - (size.width), (20 + ((Math.abs(x) % 3) * 80) + (860 - sizeoptions.height)), size.width, size.height);
                        panel.repaint();
                        break;

                    case 38: // Down Arrow Key
                        switch (x) {
                            case 0:
                                x = 2;
                                break;
                            case 1:
                                x = 0;
                                break;
                            case 2:
                                x = 1;
                                break;
                        }

                        pointer.setBounds(1100 - (size.width), (20 + ((Math.abs(x) % 3) * 80) + (860 - sizeoptions.height)), size.width, size.height);
                        panel.repaint();
                        break;

                    case 10://Enter Key
                        textbox.append("Turn " + turncount + ": ");
                        switch (x) {
                            case 0:
                                dmg=bat.pAttack();
                                if(dmg<0){
                                    turncount = 0;
                                    panel.setVisible(false);
                                    endPanel();
                                }
                                textbox.append("You Attack the silly monster for "+dmg+"!");
                                dmg=bat.eAttack();
                                if(dmg<0){
                                    String[] yes = new String[2];
                                    DeathTester.main(yes);
                                }
                                textbox.append("\n  You were attacked for "+dmg+"!");
                                break;
                            case 1:
                                textbox.append("Your pockets are empty!");
                                textbox.append("\n  You were attacked for _!");
                                break;
                            case 2:
                                textbox.append("Fleeing isnt allowed!");
                                turncount = 0;
                                panel.setVisible(false);
                                endPanel();
                                break;
                        }
                        //Newline enemy between text outputs
                        textbox.append(System.lineSeparator());
                        //check for the content of the textbox before repaint is called
                        textbox.validate();
                        panel.repaint();
                        //incrememnts turn counter (probably optional, but looked perty
                        turncount++;
                        break;
                }
            }

            public void endPanel() {
                CombatPanelTester.close();
            }

            @Override // unimplemented, fairly pointless for us to worry about for this.
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        panel.requestFocus();
        panel.validate();
    }
}
