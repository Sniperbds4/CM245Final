package finalProject;

/**
 * Random Encounter Creator
 * @author Colton
 */
import java.util.Random;

public class rEncounter{
    private int encStr = 1;
    private int index = 0;
    
    public boolean ranEncounter(){
        Random rand = new Random;
        index = rand.nextInt(10) + 1;
        
        if (index >= encStr)
            encStr++;
            return;
        else{
            //create enemy
        }
    }
 }
