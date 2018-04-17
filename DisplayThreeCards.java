import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Colton
 */
public class DisplayThreeCards {


    public static void main(String[] args) {
        JFrame thisFrame = new JFrame("Card Shuffle");
        JPanel display = new JPanel();
        JLabel first = new JLabel();
        JLabel second = new JLabel();
        JLabel third = new JLabel();    
        String name1;
        
        int xCoord = 5;
        int yCoord = 2;
        String filename = "";
        
        filename += Integer.toString(xCoord);
        filename += ", ";
        filename += Integer.toString(yCoord);
        filename += ".png";
        
        System.out.println(filename);
        
        name1 = ("C:\\Users\\Colton\\Desktop\\Sprites\\fullRooms672\\"+filename);
        first.setIcon(new ImageIcon (name1));
        
        thisFrame.add(display);
        
        display.add(first);
        display.add(second);
        display.add(third);
        
        display.setVisible(true);
        thisFrame.setVisible(true);
        thisFrame.pack();
        thisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisFrame.setLocationRelativeTo(null);
    }
    
}
