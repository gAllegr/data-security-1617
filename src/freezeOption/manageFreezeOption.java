/*
 * This class perform the freezing of the choosed video
 * Freezing a video means it will be segmented and then these segments are crypted
 */

package freezeOption;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JTextArea;

/**
 * @authors G. Allegretta, F. Scarangella
 */

public class manageFreezeOption {
    
    File inputVideo;
    File outputFolder;
    int durationVideo;
    String keyFrames;
        
    // constructor
    public manageFreezeOption(File video, File folder) {
        this.inputVideo = video;
        this.outputFolder = folder;
        this.durationVideo = takeDuration(video);
    }
    
    // this method is used to retrieve the duration (in seconds) from the video
    private int takeDuration(File input) {
        String line, t=null;
        
        try {
            Process duration = Runtime.getRuntime().exec("ffprobe -i " + inputVideo.toString() + " -show_entries format=duration -v quiet -of csv=\"p=0\"");            
            BufferedReader br = new BufferedReader(new InputStreamReader(duration.getInputStream()));
            while ((line = br.readLine()) != null)
                t = line;   
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        Double temp = Double.parseDouble(t);
        return temp.intValue();
    }
    
    // create key frames and save them on a file
    public String generateKeyFrames() {
        keyFrameGen gen = new keyFrameGen(durationVideo);
        keyFrames = gen.getKeyFrames();
        createFrameFile();
        return "Key frames to be forced: Generated!\n\tHere is the list:\n\t" + keyFrames + "\n\tPlease remember it has been saved in frames.txt";
    }
    
    // TO DO -> create a file in the output folder and save the keyframes
    private void createFrameFile() {
        
    }
}
