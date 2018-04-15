
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author Dustin Mulligan
 */
public class CombatPanel extends JPanel {
private static int x = 0;
private static int turncount = 1;    
final public JPanel panel = new JPanel();
    CombatPanel(){
    //Declarations
    JTextArea textbox = new JTextArea();
    JScrollPane scrollbox = new JScrollPane(textbox);
    JLabel options = new JLabel(new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\OptionsTester.gif"));
    JLabel pointer = new JLabel(new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\pointer.png"));
    JLabel character = new JLabel(new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\WizardIcon.png"));
    //remove default layout as a requirement to manually set locations
    panel.setLayout(null);
    //add components
    panel.add(character);
    panel.add(pointer);    
    panel.add(options);
    panel.add(scrollbox);
    //get dimensions to set relative locations
    Dimension characterdim = character.getPreferredSize();
    character.setBounds(50,50,characterdim.width,characterdim.height);
    Dimension sizeoptions = options.getPreferredSize();
    options.setBounds(1200-(sizeoptions.width),800-(sizeoptions.height),sizeoptions.width,sizeoptions.height);
    Dimension size = pointer.getPreferredSize();
    pointer.setBounds(1200-(size.width),(20+(x*120)+(800-sizeoptions.height)),size.width,size.height);
    //sets up textbox to scroll automatically, not allow manual scrolling, and sets boundaries of textbox and scrollbox
    textbox.setEditable(false);
    textbox.setBounds(0, 0, 100, 100);
    DefaultCaret crList = (DefaultCaret) textbox.getCaret();
    crList.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    scrollbox.setBounds(0,800-(sizeoptions.height),1200-(sizeoptions.width),(sizeoptions.height)-20);
    scrollbox.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    
    //adds the keylistener to the panel so that while it is focused every keystroke triggers the event
    panel.addKeyListener(new KeyListener() {
        @Override
            public void keyPressed (KeyEvent e){
    switch(e.getKeyCode()){ //outer switch statement checks key pressed vs keycodes
        
        case 40: // Up Arrow Key
            switch(x){ // inner switch sets selection based on previous selection and key pressed
                case 0: x=1;
                break;
                case 1: x=2;
                break;
                case 2: x=0;
                break;}
    //moves the pointer to reflect the change in x value        
    pointer.setBounds(1200-(size.width),(20+((Math.abs(x)%3)*120)+(800-sizeoptions.height)),size.width,size.height);
    panel.repaint();
    break;
    
        case 38: // Down Arrow Key
            switch(x){
                case 0: x=2;
                break;
                case 1: x=0;
                break;
                case 2: x=1;
                break;}
            
    pointer.setBounds(1200-(size.width),(20+((Math.abs(x)%3)*120)+(800-sizeoptions.height)),size.width,size.height);
    panel.repaint();
    break;
    
        case 10://Enter Key
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
    //Newline character between text outputs
    textbox.append(System.lineSeparator());
    //check for the content of the textbox before repaint is called
    textbox.validate();
    panel.repaint();
    //incrememnts turn counter (probably optional, but looked perty
    turncount++;
    break;
            }
            }

    @Override // unimplemented, fairly pointless for us to worry about for this.
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    });
    panel.requestFocus();
    }
}

