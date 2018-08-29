package de.lubowiecki.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 *
 * @author T.Lubowiecki
 */
public class IOTest1 {
    
    public static void main(String[] args) {
        
        File d = new File("test/subdir");
        File f = new File(d, "test1.txt");
        
        try {
            if(!d.exists()) {
                d.mkdirs();
                System.out.println("Dir Fertig");
            }
            
            if(!f.exists()) {
                f.createNewFile();
                System.out.println("File Fertig");
            }
            
            InputStream fis = new FileInputStream(f);
            
            System.out.println(fis.available() + " bytes");
            
            int data;
            while((data = fis.read()) != -1) {
                System.out.print((char)data);
            }
            
            if(fis != null)
                fis.close();
            
            
            FileOutputStream fos = new FileOutputStream(f, true);
            
            String s = "Hallo Welt";
            fos.write(s.getBytes());
            
            
            
            
//            System.out.println(f.getAbsolutePath());
//            
//            f.delete();
//            // Verz nur löschbar, wenn kein Inhalt
//            // new File("test").delete();
//            d.delete();
//            Arrays.stream(new File("src/de/lubowiecki").list())
//                    .filter(s -> s.endsWith(".java"))
//                    .forEach(System.out::println);
            
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
