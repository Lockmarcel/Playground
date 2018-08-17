package de.lubowiecki.collections;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author T.Lubowiecki
 */
public class ArrayListTest {
    
    public static void main(String[] args) {
        
        ArrayList al1 = new ArrayList();
        ArrayList<LocalDate> al2 = new ArrayList<>();
        
        Object o1 = new Object();
        Object o2 = new Object();
        
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        
    }
}
