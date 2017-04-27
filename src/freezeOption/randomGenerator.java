/*
 * This class generates an integer number between a minumum and a maximum value
 */

package freezeOption;

import java.util.Random;

/**
 * @authors G. Allegretta, F. Scarangella
 */

public class randomGenerator {
    private int min, max, n;
    
    public randomGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    // generate an integer number
    private void numGen() {
        Random rand = new Random();
        n = min + rand.nextInt(max - min + 1);
    }
    
    public int getRandomNumber() {
        numGen();
        return n;
    }
    
    
}
