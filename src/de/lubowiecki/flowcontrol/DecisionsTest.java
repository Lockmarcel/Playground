package de.lubowiecki.flowcontrol;

import java.util.function.Predicate;

/**
 *
 * @author T.Lubowiecki
 */
public class DecisionsTest {
    public static void main(String[] args) {
        
        if(true) {
        }
        else {
            System.out.println("ABC");
        }
        
        if(true) {
        }
        else if(true) {
        }
        else {
            
        }
        
        if(true)
            System.out.println("ABC");
            //System.out.println("ABC");
        else
            if(true)
                if(true)
                    System.out.println("");
                else
                    System.out.println("");
        
        int y = 10;
        String s = (y > 10) ? "OK" : "ERROR";
        
        
        Wochentag w = Wochentag.DI;
        
        int id = 10;
        switch(id) {
            default: System.out.println("default");
            case 1: System.out.println("1");
                break;
            case 2: System.out.println("2");
            case 7: System.out.println("7");
        }
        
        byte b = 10;
        switch(b) {
            case 10: System.out.println("10");
            case 100: System.out.println("100");
            case (byte)1000: System.out.println("1000");
            default: System.out.println("default");
        }
        
        switch(w) {
            case MO: System.out.println("MO");
            case DI: System.out.println("DI");
            case MI: System.out.println("MI");
            //case SO: System.out.println("SO");
            default: System.out.println("default");
        }
        
        final int c1 = 10;
        final int c2 = 11;
        final int c3 = 12;
        
        int input = 4;
        
        switch(input) {
            case c1: System.out.println("c1");
            case c2: System.out.println("c2");
            case c3: System.out.println("c3");
            default: System.out.println("default");
        }
        
        for(int i = 0; i < 10; System.out.println(++i + "Moin"));
        
        for(int i : new int[]{1,2,3,4,5}) {
            System.out.println("");
        }
        
        f1: for(int i = 0; i < 10; i++) {
            f2: for(int j = 0; j < 10; j++) {
                if(j == 2)
                    break f1;
            }
        }
        
        while(true) {
            break;
            //continue;
        }
        
        do {
            
        } while(true);
    }
    
    void machWas(int i) {
        //i = 10;
        Predicate<Integer> p = e -> e == i;
    }
}

enum Wochentag {
    
    MO, DI, MI, DO, FR;
    
}