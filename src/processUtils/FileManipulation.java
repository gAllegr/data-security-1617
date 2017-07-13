/*
 * Class that implements all kind of file manipulation needed
 */

package processUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @authors G. Allegretta, F. Scarangella
 */

public class FileManipulation {
    
    // Default constructor
    public FileManipulation() { }
    
    public String getSegmentsPath(File folder, String extension) {
        String list = "";
        File[] listOfFiles = folder.listFiles();

        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String name = listOfFile.getName();
                if(name.endsWith(extension)) {
                    list = list.concat(listOfFile.toString());
                    list = list.concat(";");
                }                
            }
        }
        list = list.substring(0, list.length()-1);
        return list;
    }  
    
    // create a file in the folder and save text in it
    public void createFrameFile(File folder, String text) throws IOException {
        String FrameFilePath = folder.getAbsolutePath() + "\\frames.txt";
        
        FileWriter writer;
        writer = new FileWriter(FrameFilePath);
        BufferedWriter buffer;
        buffer = new BufferedWriter(writer);
        buffer.write(text);
        buffer.flush();
        buffer.close();
        writer.close();
    }
    
    public void deleteFile(String path) {
        File f = new File(path);
        f.delete();
    }
    
    public void deleteDirectory(File path) {
             if(path.exists()) {
              File[] files = path.listFiles();
                 for (File file : files) {
                     if (file.isDirectory()) {
                         deleteDirectory(file);
                     } else {
                         file.delete();
                     }
                 }
      }
      path.delete();
    }
}
