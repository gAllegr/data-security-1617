/*
 * This class perform the freezing of the choosed video
 * Freezing a video means it will be segmented and then these segments are crypted
 */

package freezeOption;

import java.io.*;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        createFrameFile();
        return "Key frames to be forced: Generated!\n\tHere is the list:\n\t" + keyFrames + "\n\tPlease remember it has been saved in frames.txt";
    }
    
    // TO DO -> create a file in the output folder and save the keyframes
    private void createFrameFile() throws IOException {
        String FrameFilePath = outputFolder.getAbsolutePath() + "\\frames.txt";
        
        FileWriter writer;
        writer = new FileWriter(FrameFilePath);
        BufferedWriter buffer;
        buffer = new BufferedWriter(writer);
        buffer.write(keyFrames);
        buffer.flush();
    }
    
    public String segmentVideo() {
        try
            {            
                String command = "ffmpeg -i " + inputVideo.toString() + " -force_key_frames " + keyFrames + " -map 0 -f segment -segment_list " + outputFolder.toString() + "\\out.ffconcat -segment_times " + keyFrames + " -segment_time_delta 0.05 " + outputFolder.toString() + "\\out%03d.mp4";
                Process p = Runtime.getRuntime().exec(command);
                               
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        return "Video segmentation: Successful!";
    }
}
