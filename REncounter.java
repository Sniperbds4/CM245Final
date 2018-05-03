package finalProject;

/**
 * Random Encounter Creator
 *
 * @author Colton
 */
import java.util.Random;

public class REncounter {

    private int encStr = 1;
    private int index = 0;
    public REncounter(){
        
    }

    public boolean ranEncounter(int x, int y) {
        Random rand = new Random();
        index = rand.nextInt(10) + 1;

        if (x > 3 && x < 7 && y < 4) {
            return false;
        } else if (x < 1) {
            return false;
        } else if (x > 9) {
            return false;
        } else if (y < 1) {
            return false;
        } else if (index >= encStr && x > 0 && x < 4) {
            encStr++;
            return false;
        } else if (index >= encStr && x > 10 && x < 6) {
            encStr++;
            return false;
        } else if (index >= encStr && y > 3 && y < 7) {
            encStr++;
            return false;
        } else {
            encStr=1;
            return true;
        }

    }
}
