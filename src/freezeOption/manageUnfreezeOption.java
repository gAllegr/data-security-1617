/*
 * This class perform the unfreezing of the choosed video
 * Freezing a video means it will be segmented and then these segments are crypted
 */

package freezeOption;

import java.io.*;
import processUtils.Cryptography;
import processUtils.FileManipulation;
import processUtils.Segmenter;

/**
 * @authors G. Allegretta, F. Scarangella
 */

public class manageUnfreezeOption {
    
    File sourceFolder;
    File destinationFolder;
    String keyFrames;
        
    // constructor
    public manageUnfreezeOption(File source, File destination) {
        this.sourceFolder = source;
        this.destinationFolder = destination;
    }
    
    public String decryptVideo() throws Exception {
        readFrameFile();
        String key;
        Cryptography cr = new Cryptography();
        // Generate key from key frames list
        key = cr.generatesKey(keyFrames);
        // Get list of encrypted segments path
        FileManipulation f = new FileManipulation();
        String[] segmentList = (f.getSegmentsPath(sourceFolder,".enc")).split(";");
        // For each encrypted segment in the folder, decrypt it
        for(String path : segmentList) {
            cr.decrypt(path, key);
            f.deleteFile(path);
        }    
        return "Video Decryption: Completed!";
    }
    
    // read a file in the source folder and save the keyframes in a string
    private void readFrameFile() throws IOException {
        keyFrames = "";
        try {
            String FrameFilePath = sourceFolder.getAbsolutePath() + "\\frames.txt";
            FileReader reader = new FileReader(FrameFilePath);
            BufferedReader buffer = new BufferedReader(reader);
            String line = null;
                while ((line = buffer.readLine()) != null)
                    keyFrames += line;
            buffer.close();
            reader.close();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }    
    }
    
    public String concatVideo() {
        Segmenter segment = new Segmenter(sourceFolder,destinationFolder,keyFrames);
        segment.startConcatenation();
        FileManipulation f = new FileManipulation();
        f.deleteDirectory(sourceFolder);
        return "Video concatenation: Completed!";
    }
}
