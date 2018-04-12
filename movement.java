package contemporyproject;

/**
 * Movement Engine
 * @author Colton Martin
 */
public class movement {
    private int areaNumber = 0;
    private int roomNumber = 0;
    private int xCoord = 1;
    private int yCoord = 1;
    //Coords go from 1-5 for positioning reasons.
    
    public void moveUp(){
        if (xCoord == 3){
            
        }
            
        if (yCoord > 4)
            return;
        else
            yCoord++;
    }
    
    public void moveDown(){
        if (yCoord < 2)
            return;
        else
            yCoord--;
    }
    
    public void moveRight(){
        if (xCoord > 4)
            return;
        else
            xCoord++;
    }
    
    public void moveLeft(){
        if (xCoord < 2)
            return;
        else
            xCoord--;
    }
    
    public int getX(){
        return xCoord;
    }
    
    public int getY(){
        return yCoord;
    }
    
    public void setX(int x){
        xCoord = x;
    }
    
    public void setY(int y){
        yCoord = y;
    }
}
