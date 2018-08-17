package de.lubowiecki.datatype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T.Lubowiecki
 */
public class GCTest {
    
    private int i = 100;
    
    public static void main(String[] args) {
        
        GCTest gct = new GCTest();
        gct = null;
        System.gc();
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("asta la basta baby!");
    }
}
