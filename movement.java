package FinalProject;

/**
 * Movement Engine
 * @author Colton Martin
 */
public class movement {
    private int xCoord = 1;
    private int yCoord = 1;
    private int roomX = 0;
    private int roomY = 0;
    //Coords go from 1-5 for positioning reasons.
    
    movement(int x, int y, int rx, int ry){
    xCoord = x;
    yCoord = y;
    roomX = rx;
    roomY = ry;
    }
    public void moveUp(boolean check){
        if (xCoord == 3 && yCoord == 1 && check){
            changeRoom(0, -1);
            yCoord = 5; //should be required to make the character enter at the bottom of the room
            return;
        }
            
        if (yCoord < 2)
            return;
        else
            yCoord--;
    }//Do this on the keylistener in the overworld panel class.
    
    public void moveDown(boolean check){
        if (xCoord == 3 && yCoord == 5 && check){
            changeRoom(0, 1);
            yCoord = 1;//same as above
            return;
        }
        
        if (yCoord > 4)
            return;
        else
            yCoord++;
    }//Do this on the keylistener in the overworld panel class.
    
    public void moveRight(boolean check){
        if (xCoord == 5 && yCoord == 3 && check){
            changeRoom(1, 0);
            xCoord = 1; //same as above
            return;
        }
        
        if (xCoord > 4)
            return;
        else
            xCoord++;
    }//Do this on the keylistener in the overworld panel class.
    
    public void moveLeft(boolean check){
        if (xCoord == 1 && yCoord == 3 && check){//same as above
            changeRoom(-1, 0);
            xCoord = 5;//same as above
            return;
        }
        
        if (xCoord < 2)
            return;
        else
            xCoord--;
    }//Do this on the keylistener in the overworld panel class.
    
    public int getX(){
        return xCoord;
    }//Call in the overworld panel class to get character location correct
    
    public int getY(){
        return yCoord;
    }//Call in the overworld panel class to get character location correct
    
    public void setX(int x){
        xCoord = x;
    }//shouldnt be needed
    
    public void setY(int y){
        yCoord = y;
    }//shouldnt be needed
    
    public void changeRoom(int xChange, int yChange){
        if (roomX >= 0 && roomX <= 11 && roomY >= 0 && roomY <= 7){
            roomX += xChange;
            roomY += yChange;
        }
        return;
    }//requirement for the move up/down/left/right to work properly
    
    public int getRoomX(){
        return this.roomX;
    }//use to pass into the array to load the right map square
    
    public int getRoomY(){
        return this.roomY;
    }//use to pass into the array to load the right map square
    
    public void setRoomX(int x){
        roomX = x;
    }//shouldnt be needed
    
    public void setRoomY(int y){
        roomY = y;
    } //shouldnt be needed
}