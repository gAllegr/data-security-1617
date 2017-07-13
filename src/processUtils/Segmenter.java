/*
 * Class that implements methods for segment and concatenate video
 */

package processUtils;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @authors G. Allegretta, F. Scarangella
 */

public class Segmenter {
    String myFile;
    String myDirectory;
    String frames;
    
    public Segmenter(File media, File directory, String list){
            this.myFile = media.getAbsolutePath();
            this.myDirectory = directory.getAbsolutePath();
            this.frames = list;
    }
    public void startSegmentation(){
        try{   
            final ProcessBuilder pb = new ProcessBuilder(   "ffmpeg","-i",myFile,
                                                            "-force_key_frames", frames,                    
                                                            "-map", "0",
                                                            "-f", "segment",
                                                            "-segment_list", myDirectory+"/out.ffconcat",
                                                            "-segment_times", frames,
                                                            "-segment_time_delta", "0.05",
                                                            myDirectory+"/out%03d.mp4"
            );
            
            final Process p = pb.start();
            
            StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), "ERROR");
            StreamGobbler outputGobbler = new StreamGobbler(p.getInputStream(), "OUTPUT");
            
            outputGobbler.start();
            errorGobbler.start();

            //Wait to get exit value
            int exitValue = p.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void startConcatenation(){
        try{
            final ProcessBuilder pb = new ProcessBuilder(   "ffmpeg",
                                                            "-f", "concat",
                                                            "-i", myFile+"/out.ffconcat",
                                                            "-c", "copy",
                                                            myDirectory+"/videofinale.mp4"
            );
        
            final Process p = pb.start();

            StreamGobbler errorGobbler = new StreamGobbler(p.getErrorStream(), "ERROR");
            StreamGobbler outputGobbler = new StreamGobbler(p.getInputStream(), "OUTPUT");

            outputGobbler.start();
            errorGobbler.start();

            int exitValue = p.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}