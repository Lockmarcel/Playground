package de.lubowiecki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T.Lubowiecki
 */
public class SerializeTest {
    
    public static void main(String[] args) {
        
        File file = new File("data.ser");
        
        //Schreiben
//        Zeugs z1 = new Zeugs(10.2, "Hammer");
//        Zeugs z2 = new Zeugs(2.5, "Zange");
//        Zeugs z3 = new Zeugs(1.2, "Brot");
//        
//        ArrayList<Zeugs> zeugs = new ArrayList<>();
//        zeugs.add(z1);
//        zeugs.add(z2);
//        zeugs.add(z3);
//        
//        try {
//            FileOutputStream fos = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(zeugs);
//        } 
//        catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//        catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

        // Lesen
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Zeugs> zList = (ArrayList<Zeugs>) ois.readObject();
            
            for(Zeugs z : zList) {
                System.out.println(z.getName() + ", " + z.getGewicht() + " kg");
            }
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }
}

class Zeugs implements Serializable {
    private final double gewicht;
    private final String name;

    public Zeugs(double gewicht, String name) {
        this.gewicht = gewicht;
        this.name = name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getName() {
        return name;
    }
}
