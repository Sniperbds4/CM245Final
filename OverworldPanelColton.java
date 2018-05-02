package cm245.master;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OverworldPanel extends JPanel {
    private boolean nExit, sExit, eExit, wExit;
    private int characterXMod, characterYMod;
    private JLabel background;
    private JLabel walls;
    private JLabel object;
    private ImageIcon backDrop;
    private ImageIcon wallLayout;
    private JPanel panel;
    OverworldPanel(int xcoord, int ycoord){
    this.panel = new JPanel();
    this.panel.setBounds(0, 0, 672, 672);
    //This is the thing
    this.wallLayout = new ImageIcon("\\resources\\rooms\\"+xcoord+", "+ycoord+".png");
    //This is the thing
    this.panel.setLayout(null);
    this.backDrop = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\rooms\\"+xcoord+", "+ycoord+".png");
    this.walls = new JLabel(wallLayout);
    this.background = new JLabel(backDrop);
    this.panel.add(walls);
    this.panel.add(background);
    this.walls.setBounds(0,0,672,672);
    this.background.setBounds(0,0,672,672);
    }
    public JPanel getpanel(){
        return this.panel;
    }
    public boolean getNExit(){
        return true;
    }
    public boolean getEExit(){
        return true;
    }
    public boolean getSExit(){
        return true;
    }
    public boolean getWExit(){
        return true;
    }
}