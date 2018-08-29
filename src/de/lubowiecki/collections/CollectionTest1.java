package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 *
 * @author T.Lubowiecki
 */
public class CollectionTest1 {
    
    public static void main(String[] args) {
        
        List<String> l1 = new ArrayList<>();
        l1.add("Clark");
        l1.add("David");
        
        //List<String> l2 = Arrays.asList("Peter", "Bruce");
        Set<String> s1 = new HashSet<>();
        s1.add("Peter");
        s1.add("Bruce");
        
        //l1.addAll(1, l2);
        l1.addAll(1, s1);
        
        l1.forEach(System.out::println);
        //l1.forEach(s -> System.out.println(s));
        
        System.out.println("---------------------");
        
        System.out.println(l1.contains("Peter"));
        l1.remove("Peter");
        
        System.out.println(l1.containsAll(s1));
        
        System.out.println("---------------------");
        
        for(int i = 0; i < l1.size(); i++)
            System.out.println(l1.get(i));
        
        System.out.println("---------------------");
        
        Iterator<String> itr = l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //ListIterator<String> litr = l1.listIterator();
        
        System.out.println("--------------------");
        
        l1.sort(String.CASE_INSENSITIVE_ORDER);
        l1.forEach(System.out::println);
        
        System.out.println("---------------------");
        
//        for(int i = 0; i < l1.size(); i++) {
//            String s = l1.get(i);
//            System.out.println(s);
//            if(s.equals("Bruce"))
//                l1.remove(s);
//        }

        System.out.println("---------------------");
        
        List<Integer> l3 = new ArrayList();
        l3.add(1);
        l3.add(3);
        l3.add(172);
        
        List<Integer> l4 = new ArrayList();
        l4.add(1);
        l4.add(3);
        l4.add(172);
        
        System.out.println("gleich? " + l3.equals(l4));
        
//        Integer i1 = 128;
//        Integer i2 = 127;
//        System.out.println(i1 == i2);
        

    }
}
