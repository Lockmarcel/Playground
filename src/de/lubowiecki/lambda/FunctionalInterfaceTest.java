package de.lubowiecki.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author T.Lubowiecki
 */
public class FunctionalInterfaceTest {
    
    public static void main(String[] args) {
        
        Consumer<String> plain = (s) -> System.out.println(s);
        Consumer<String> h1 = s -> System.out.println("<h1>" + s + "</h1>");
        Consumer<String> p = s -> System.out.println("<p>" + s + "</p>");
        
        List<String> list = Arrays.asList("Peter", "Bruce", "Clark");
        list.forEach(p);
        
        System.out.println("---------------");
        
        Function<Integer, String> f1 = (z) -> z + "...";
        System.out.println(f1.apply(122));
        
        System.out.println("---------------");
        
        BiFunction<Integer, Integer, String> f2 = (z1, z2) -> z1 + "..." + z2;
        System.out.println(f2.apply(0, 100));
        
        System.out.println("---------------");
        
        Supplier<Integer> dice = () -> new Random().nextInt(6) + 1;
        System.out.println(dice.get());
        //System.out.println(dice.getClass().getSimpleName());
        
        System.out.println("---------------");
        
        Predicate<String> pred = (s) -> s.startsWith("B");
        
        List<String> nameList = Arrays.asList("Peter", "Bruce", "Clark", "Bob", "Anna", "Xenia");
        nameList.stream()
                .filter(pred)
                .forEach(plain);
        
        
        
    }
}
