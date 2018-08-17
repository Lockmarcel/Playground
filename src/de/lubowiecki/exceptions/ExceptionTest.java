package de.lubowiecki.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author T.Lubowiecki
 */
public class ExceptionTest {
    
    public static void main(String[] args) {
        
        ExceptionTest et = new ExceptionTest();
        try {
            et.getDataFromFile();
        }
        catch(IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        
        int butterInKg = 5;
        
        try {
            if(butterInKg < 6)
                throw new ButterBrotException();
        }
        catch(ButterBrotException ex) {
            butterInKg = 10;
        }
        
    }
    
    private void getDataFromFile() throws FileNotFoundException, IOException {
        
        try(FileInputStream fis = new FileInputStream("data.txt")) {
            
        }
        
    }
}

class ButterBrotException extends RuntimeException {

    public ButterBrotException() {
        super("Nicht genug Butter auf dem Brot!");
    }
}
