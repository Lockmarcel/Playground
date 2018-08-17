package de.lubowiecki;

/**
 *
 * @author T.Lubowiecki
 */
public class Start {
    
    public int zahl1 = 10;
    public String name = "Peter";

    public Start() {
    }
    
    public Start(int z, String n) {
        zahl1 = z;
        name = n;
    }

    public static void main(String[] args) {
        
        System.out.println("Das ist ein Haus von Nikigraus!");
        java.util.Date d = new java.util.Date();
        System.out.println(d);
        
        System.out.println("-----------------");
        
//        Start s = new Start(25, "Bruce");
        Start s = new Start();
        System.out.println(s.zahl1);
        System.out.println(s.name);
        s.machWas();
        
//        System.out.println(args[0]);
//        System.out.println(args[1]);
    }
    
    
    public void machWas() {
        System.out.println("Moin machWas!");
    }
}

class Date {
    
}

class Thing {
    
}
