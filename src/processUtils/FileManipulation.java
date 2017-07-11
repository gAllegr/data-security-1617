/*
 * Class that implements all kind of file manipulation needed
 */

package processUtils;

import java.io.File;

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
    
    public void deleteFile(String path) {
        File f = new File(path);
        f.delete();
    }
}
