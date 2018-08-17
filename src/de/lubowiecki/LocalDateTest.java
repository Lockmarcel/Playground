package de.lubowiecki;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author T.Lubowiecki
 */
public class LocalDateTest {
    public static void main(String[] args) {
        
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        
        System.out.println("-------------");
        
        LocalDate d1 = LocalDate.of(1993, 12, 30);
        System.out.println(d1.hashCode());
        
        LocalDate d2 = LocalDate.of(1993, 12, 30);
        System.out.println(d2.hashCode());
        
        System.out.println("-------------");
        
        String s1 = "Moin";
        String s2 = new String("Moin");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        System.out.println("-------------");
        
        Integer i1 = 1;
        Byte b1 = 1;
        System.out.println(i1.hashCode());
        System.out.println(b1.hashCode());
        
    }
}
