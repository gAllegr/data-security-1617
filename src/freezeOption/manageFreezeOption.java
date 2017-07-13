/*
 * This class perform the freezing of the choosed video
 * Freezing a video means it will be segmented and then these segments are crypted
 */

package freezeOption;

import processUtils.keyFrameGen;
import java.io.*;
import processUtils.Segmenter;
import processUtils.Cryptography;
import processUtils.FileManipulation;

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
    public String generateKeyFrames() throws IOException {
        keyFrameGen gen = new keyFrameGen(durationVideo);
        keyFrames = gen.getKeyFrames();
        FileManipulation f = new FileManipulation();
        f.createFrameFile(outputFolder,keyFrames);
        return "Key frames to be forced: Generated!\n\tHere is the list:\n\t" + keyFrames + "\n\tPlease remember it has been saved in frames.txt";
    }
    
    public String segmentVideo() {
        Segmenter segment = new Segmenter(inputVideo,outputFolder,keyFrames);
        segment.startSegmentation();
        return "Video segmentation: Completed!";
    }
    
    public String encryptVideo() throws Exception {
        String key;
        Cryptography cr = new Cryptography();
        // Generate key from key frames list
        key = cr.generatesKey(keyFrames);
        // Get list of segments path
        FileManipulation f = new FileManipulation();
        String[] segmentList = (f.getSegmentsPath(outputFolder,".mp4")).split(";");
        // For each nut file in the folder, encrypt it
        for(String path : segmentList) {
            cr.encrypt(path, key);
            f.deleteFile(path);
        }    
        return "Video Encryption: Completed!";
    }
}
