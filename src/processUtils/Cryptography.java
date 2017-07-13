/*
 * Class that implements AES Cryptography
 */

package processUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @authors G. Allegretta, F. Scarangella
 */

public class Cryptography {
    
    // Default constructor
    public Cryptography() { }
    
    /*
     * generatesKey method: generates a 16 characters key
     */
    public String generatesKey(String text) {
        // get all frames values in sequence
        String[] value = text.split(",");
        String key = "";
        for (String val : value) {
            key = key.concat(val);
        }
        // check if key length is 16
        if(key.length()>16) {
            key = key.substring(0, 15);
        }
        if(key.length()<16) {
            String zeroString = "";
            int n = 16 - key.length();
            // generate a string of zeros
            for(int i=0;i<n;i++) {
                zeroString = zeroString.concat("0");
            }
            // add zeros to key
            key = key.concat(zeroString);
        }
        return key;
    }
    
    /*
     * Encrypt method: receives the segment to be encrypted and the key and returns the encrypted file
     */    
    public void encrypt(String path, String key){
        
        try{
            //generating key
            byte[] byteKey = key.getBytes();
            Key k = new SecretKeySpec(byteKey, "AES");
            //creating and initialising cipher and cipher streams
            Cipher c =  Cipher.getInstance("AES");
            c.init(Cipher.ENCRYPT_MODE, k);
            //opening streams
            String pathEnc = path.substring(0, path.length()-4);
            FileOutputStream fos = new FileOutputStream(pathEnc+".enc");
            try(FileInputStream fis = new FileInputStream(path)){
                try(CipherOutputStream cout = new CipherOutputStream(fos, c)){
                    copy(fis,cout);
                } catch (Exception ex) {
                    Logger.getLogger(Cryptography.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Cryptography.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | FileNotFoundException ex) {
        Logger.getLogger(Cryptography.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
     * Decrypt method: receives the encrypted file and the key and returns the original segment
     */    
    public void decrypt(String path, String key){
        try{
            //generating same key
            byte[] byteKey = key.getBytes();
            Key k = new SecretKeySpec(byteKey,"AES");
            //creating and initialising cipher and cipher streams
            Cipher c =  Cipher.getInstance("AES");
            c.init(Cipher.DECRYPT_MODE, k);
            //opening streams
            FileInputStream fis = new FileInputStream(path);
            try(CipherInputStream cin= new CipherInputStream(fis, c)){
                String pathDec = path.substring(0, path.length()-4);               
                try(FileOutputStream fos = new FileOutputStream(pathDec+".mp4")){
                    copy(cin,fos);
                } catch (Exception ex) {
                    Logger.getLogger(Cryptography.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(Cryptography.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | FileNotFoundException ex) {
        Logger.getLogger(Cryptography.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void copy(InputStream is,OutputStream os) throws Exception{
        byte buf[] = new byte[4096];  //4K buffer set
        int read = 0;
        while((read = is.read(buf)) != -1)  //reading
           os.write(buf,0,read);  //writing
    }
}
