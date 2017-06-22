/*
 * This class create a file in which are saved the key frames to be forced
 */

package freezeOption;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @authors G. Allegretta, F. Scarangella
 */

public class keyFrameGen {
    
    int max, min;
    int keyFrames[], keyFramesNumber;
    String keyFrameList;
    
    public keyFrameGen(int duration) {
        this.min = 1;
        this.max = duration - 1;
        this.keyFramesNumber = defineKeyFramesNumber();
        this.keyFrames = new int[keyFramesNumber];
        this.keyFrameList = "";
    }
    
    // define a number of key frames to generate, setted between 2 and max
    private int defineKeyFramesNumber() {
        randomGenerator keyNumGen = new randomGenerator(2,max);
        return keyNumGen.getRandomNumber();
    }
    
    // populate key frames array with possible values
    private void generateValues() {
        randomGenerator valueGen = new randomGenerator(1,max);
        for(int i=0;i<keyFramesNumber;i++) {
            keyFrames[i] = valueGen.getRandomNumber();
        }
    }
    
    // sort keyFrames array in a crescent order and remove duplicate
    private void removeDuplicates() {
        Arrays.sort(keyFrames);
               
        // populate the HashSet
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<keyFramesNumber; i++) {
            set.add(keyFrames[i]);
        }
        
        // Convert set into Integer array
        Integer[] temp = set.toArray(new Integer[0]);
        // Convert Integer array into int one        
        int intValues[] = new int[temp.length];
        for(int i=0; i<temp.length; i++) {
            intValues[i] = temp[i];
        } 
        // copy the array without duplicates into keyFrames array
        keyFrames = Arrays.copyOf(intValues, intValues.length);
        
        // sum of array values must be lesser than video time length
        int sum=0, pos=0;
        for(int i=0; i<keyFrames.length; i++) {
            sum += keyFrames[i];
            if(sum < max){
                sum += keyFrames[i];  
                pos++;
            }
            else {
                break;
            }
        }
        keyFrames = Arrays.copyOfRange(keyFrames, 0, pos);
    }
    
    // create a string with the generated key frames
    private void createFramesString() {
        for (int i=0; i<keyFrames.length;i++){
            keyFrameList = keyFrameList.concat(Integer.toString(keyFrames[i]));
            if(i != (keyFrames.length-1))
                keyFrameList = keyFrameList.concat(",");
        }
    }
    
    // call all the previous methods and return the generated key frames
    public String getKeyFrames() {
        generateValues();
        removeDuplicates();
        createFramesString();
        return keyFrameList;
    }
}
