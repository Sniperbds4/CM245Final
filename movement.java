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
        if (xCoord == 3 && yCoord == 1){
            changeRoom(0, 1);
            return;
        }
            
        if (yCoord > 4)
            return;
        else
            yCoord++;
    }
    
    public void moveDown(){
        if (xCoord == 3 && yCoord == 5){
            changeRoom(0, -1);
            return;
        }
        
        if (yCoord < 2)
            return;
        else
            yCoord--;
    }
    
    public void moveRight(){
        if (xCoord == 1 && yCoord == 3){
            changeRoom(1, 0);
            return;
        }
        
        if (xCoord > 4)
            return;
        else
            xCoord++;
    }
    
    public void moveLeft(){
        if (xCoord == 5 && yCoord == 3){
            changeRoom(-1, 0);
            return;
        }
        
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
