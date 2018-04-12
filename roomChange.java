package contemporyproject;

/**
 * Movement Room Change
 * @author Colton
 */
public class roomChange {
    private int roomX = 0;
    private int roomY = 0;
    
    public void changeRoom(int xChange, int yChange){
        if (roomX > 0 && roomX < 11 && roomY > 0 && roomY < 7){
            roomX += xChange;
            roomY += yChange;
        }
        return;
    }
    
    public int getRoomX(){
        return roomX;
    }
    
    public int getRoomY(){
        return roomY;
    }
    
    public void setRoomX(int x){
        roomX = x;
    }
    
    public void setRoomY(int y){
        roomY = y;
    } 
}
