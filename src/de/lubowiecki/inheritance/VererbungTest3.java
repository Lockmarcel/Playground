package de.lubowiecki.inheritance;

import static de.lubowiecki.inheritance.AA.i;

/**
 *
 * @author T.Lubowiecki
 */
public class VererbungTest3 {
    public static void main(String[] args) {
        new CC().machWasAnderes();
        //BB.machWasAnderes();
    }
}

interface AA {
    
    int i = 100;
    
    default void machWasAnderes() {
        System.out.println(i);
    }
    
}

interface BB {
    
    int i = 200;
    
    static void machWasAnderes() {
        System.out.println(i);
    }
}

class CC implements AA, BB{
    
    int i = 300;
    
    void machWas() {
        //System.out.println(i);
        //System.out.println("...");
    }
}
