package de.lubowiecki.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author T.Lubowiecki
 */
public class SetTest {
    public static void main(String[] args) {
        
        Set<String> s1 = new HashSet<>();
        s1.add("Peter");
        s1.add("David");
        s1.add("Bob");
        s1.add("Zippo");
        
        if(!s1.add("Bob"))
            System.out.println("nicht hinzugefügt");
        
        s1.forEach(s -> System.out.println(s + ", " + s.hashCode()));
        String[] arr = s1.toArray(new String[0]);
        
        System.out.println(s1.contains("Bob"));
        
        System.out.println("------------------");
        
        Set<Thing> things = new HashSet<>();
        things.add(new Thing("Hammer"));
        things.add(new Thing("Zange"));
        things.add(new Thing("Hammer"));
        
        System.out.println(things.contains(new Thing("Zange")));
        
        things.forEach(t -> System.out.println(t.getName() + " " + t.hashCode()));
        
        
        System.out.println("---------------");
        
        List<Thing> list1 = new ArrayList<>();
        list1.add(new Thing("Hammer"));
        list1.add(new Thing("Zange"));
        
        List<Thing> list2 = (List<Thing>) ((ArrayList)list1).clone();
        
        list2.get(1).setName("Schraubendreher");
        
        list1.forEach(s -> System.out.println(s.getName()));
        
        System.out.println("--------------------");
        
        System.out.println("TREESET");
        
        Set<Integer> s2 = new TreeSet<>();
        s2.add(7);
        s2.add(22);
        s2.add(1);
        s2.add(5);
        s2.add(1);
        
        s2.forEach(s -> System.out.println(s));
        
        System.out.println("----------------");
        
        Set<String> s3 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        s3.add("123");
        s3.add("#45Abc");
        s3.add("max");
        s3.add("Max");
        s3.add("Macks");
        
        s3.forEach(s -> System.out.println(s));
        
        System.out.println("----------------");
        
        //Set<Thing> s4 = new TreeSet<>(new MyStringComparator());
        Set<Thing> s4 = new TreeSet<>();
        s4.add(new Thing("Hammer"));
        s4.add(new Thing("Zange"));
        s4.add(new Thing("Schraubendreher"));
        s4.add(new Thing("Bob"));
        
        s4.forEach(s -> System.out.println(s.getName()));
        
        
        System.out.println("---------------------");
        
        LinkedHashSet<Integer> ints = new LinkedHashSet<>();
        ints.add(7);
        ints.add(10);
        ints.add(1);
        ints.add(15);
        ints.add(3);
        
        ints.forEach(i -> System.out.println(i));
        
        //TreeSet<?> s6 = new TreeSet<Object>();
        
        NavigableSet<LocalDate> s6 = new TreeSet<>();
        s6.add(LocalDate.of(2000, 10, 5));
        s6.add(LocalDate.of(2022, 7, 23));
        s6.add(LocalDate.of(1972, 5, 15));
        s6.add(LocalDate.of(1988, 12, 23));
        s6.add(LocalDate.of(1999, 10, 7));
        
        System.out.println(s6.lower(LocalDate.of(1999, 10, 7)));
        
        System.out.println(s6.higher(LocalDate.of(1999, 10, 7)));
        
        System.out.println(s6.floor(LocalDate.of(1999, 10, 7)));
        
        System.out.println(s6.ceiling(LocalDate.of(1999, 10, 7)));
        
        System.out.println("-------------");
        
        LocalDate d;
        while((d = s6.pollLast()) != null) {
            System.out.println(d);
        }
        
        System.out.println(s6.size());
        
        System.out.println("-------------------------");
        
        EnumSet<Wochentag> es1, es2, es3, es4;
        
    }
}

// Implementierung EnumSet checken

enum Wochentag {
    MO, DI, MI, DO, FR, SA, SO;
}

class MyStringComparator implements Comparator<Thing> {

    @Override
    public int compare(Thing o1, Thing o2) {
        return o1.getName().length() - o2.getName().length();
    }
}

class Thing implements Comparable<Thing>{

    private String name;

    public Thing(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Thing)
            return name.equals(((Thing)obj).getName());
        
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Thing o) {
       // return (name.length() - o.name.length());
       return name.toLowerCase().compareTo(o.name.toLowerCase());
    }
}
