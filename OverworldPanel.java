package FinalProject;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OverworldPanel extends JPanel {
    private boolean nExit, sExit, eExit, wExit;
    private int characterXMod, characterYMod;
    private JLabel background;
    private JLabel walls;
    private ImageIcon backDrop;
    private ImageIcon wallLayout;
    private JPanel panel;
    OverworldPanel(int xcoord, int ycoord){
    this.panel = new JPanel();
    this.panel.setBounds(0, 0, 672, 672);
    switch (xcoord){
        case 0:{
            switch (ycoord){
                case 2:{//This room will contain the West section Boss
                    this.eExit = true;
                    this.nExit = this.sExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsE.png");                
                    break;
                }
            }
            break;
        }
        case 1:{
            switch (ycoord){
                case 1:{//this room is a key room
                    this.sExit = true;
                    this.nExit = this.eExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsS.png");
                    break;
                }
                case 2:{
                    this.nExit = this.sExit = this.wExit = true;
                    this.eExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNSW.png");
                    break;
                }
                case 3:{
                    this.nExit = this.eExit = true;
                    this.sExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNE.png");
                    break;
                }       
            }
            break;
        }
        case 2:{
            switch (ycoord){
                case 1:{
                    this.eExit = this.sExit = true;
                    this.nExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsSE.png");
                    break;
                }
                case 2:{
                    this.nExit = this.sExit = true;
                    this.eExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNS.png");
                    break;
                }
                case 3:{
                    this.nExit = this.eExit = this.wExit = true;
                    this.sExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNEW.png");
                    break;
                }       
            }
            break;
        }
        case 3:{
            switch (ycoord){
                case 1:{
                    this.sExit = this.wExit = true;
                    this.nExit = this.eExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsSW.png");
                    break;
                }
                case 2:{
                    this.nExit = this.eExit = true;
                    this.sExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNE.png");
                    break;
                }
                case 3:{//this room is a chest room
                    this.wExit = true;
                    this.nExit = this.eExit = this.sExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsW.png");
                    break;
                }       
            }
            break;
        }
        case 4:{
            switch (ycoord){
                case 2:{
                    this.nExit = this.sExit = false;
                    this.eExit = this.wExit = true;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsEW.png");
                    break;
                }
                case 4:{
                    this.eExit = true;
                    this.nExit = this.sExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsE.png");
                    break;
                }
                case 5:{
                    this.eExit = this.sExit = true;
                    this.nExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsSE.png");
                    break;
                }
                case 6:{
                    this.nExit = true;
                    this.eExit = this.sExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsN.png");
                    break;
                }       
            }
            break;
        }
        case 5:{
            switch (ycoord){
                case 0:{
                    this.sExit = true;
                    this.nExit = this.eExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsS.png");
                    break;
                }
                case 1:{
                    this.nExit = this.sExit = true;
                    this.eExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNS.png");

                    break;
                }
                case 2:{
                    this.nExit = this.eExit = this.wExit = this.sExit = true;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNSEW.png");
                    break;
                }
                case 3:{
                    this.nExit = this.sExit = true;
                    this.eExit = this.wExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNS.png");
                    break;
                }
                case 4:{                    
                    this.nExit = this.sExit = this.wExit = true;
                    this.eExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNSW.png");
                    break;
                }
                case 5:{                    
                    this.nExit = this.sExit = this.wExit = true;
                    this.eExit = false;
                    this.wallLayout = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\RoomWallsNS.png");
                    break;
                }
                case 6:{
                    break;
                }
                case 7:{
                    break;
                }       
            }
            break;
        }
        case 6:{
            switch (ycoord){
                case 2:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
            }
            break;
        }
        case 7:{
            switch (ycoord){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
            }
            break;
        }
        case 8:{
            switch (ycoord){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
            }
            break;
        }
        case 9:{
            switch (ycoord){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
            }
            break;
        }
        case 10:{
            switch (ycoord){
                case 2:{                    
                    this.wExit = true;
                    this.eExit = this.sExit = this.nExit = false;
                    this.wallLayout = new ImageIcon("10, 2.png");
                    break;
                }       
            }
            break;
        }
    }
    this.panel.setLayout(null);
    this.backDrop = new ImageIcon("C:\\Users\\Dustin Mulligan\\Documents\\NetBeansProjects\\CM245_S18\\resources\\image\\TileBackdrop.png");
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
        return this.nExit;
    }
    public boolean getEExit(){
        return this.eExit;
    }
    public boolean getSExit(){
        return this.sExit;
    }
    public boolean getWExit(){
        return this.wExit;
    }
}