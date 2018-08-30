package de.lubowiecki.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author T.Lubowiecki
 */
public class StreamTest1 {
    
    public static void main(String[] args) {
        
        Stream<String> s1 = Stream.of("Peter", "Bruce", "Clark", "David");
        
        IntStream is1 = IntStream.of(1,2,3,7,8,10,22,1,10);
        IntStream is2 = IntStream.range(1,100);
        
        Stream<String> s2 = Arrays.stream(new String[]{"Peter", "Bruce", "Clark", "David"});
        
        IntStream is3 = "Hallo Welt".chars();
        
        Stream<String> s3 = Arrays.asList("Peter", "Bruce", "Clark", "David").stream();
        
        Stream<String> s4 = Arrays.asList("Peter", "Bruce", "Clark", "David").stream();
        
//        Stream.generate(() -> {
//            try {
//                Thread.sleep(1000);
//            }
//            catch(InterruptedException ex) {
//                System.out.println(ex.getMessage());
//            }
//            System.out.println("Moin"); 
//            return Math.floor(Math.random() * 100) + 1;
//        }).forEach((i) -> System.out.println(i));

//        long c = s1.filter(e -> !e.startsWith("B")).count();
//        System.out.println(c);
        
        s1
            //.parallel()
            //.peek(System.out::println)
            .filter(e -> !e.startsWith("B"))
            .limit(2)
            //.map((e) -> e.length())
            //.map((e) -> e.concat("..."))
            .map((e) -> new Person(e))
            //.sequential()
            .forEach(e -> System.out.println(e));
        
        System.out.println("---------------");
        
        System.out.println(s2.mapToInt((e) -> e.length()).min().orElse(-1));
        
        System.out.println("---------------");
        
        String newStr = s3.distinct()
                //.parallel()
                .sorted()
                .reduce("x", (a, b) -> a + "," + b);
        
        System.out.println(newStr);
        
        HashSet<String> newList = s4.distinct()
                .sorted()
                .collect(HashSet::new, HashSet::add, HashSet::addAll);
        
        System.out.println(newList);
        
        System.out.println("----------------");
        
        Stream<Integer> is6 = IntStream.range(10, 50).boxed();
        
        Map<Boolean, List<Integer>> myMap = is6.collect(Collectors.partitioningBy((z) -> z > 20));
        
        System.out.println(myMap);
        
    }
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
