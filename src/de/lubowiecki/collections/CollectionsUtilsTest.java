package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author T.Lubowiecki
 */
public class CollectionsUtilsTest {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> ints = IntStream.range(0, 1000)
                .boxed()
                .parallel()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        
        //Collections.sort(ints);
        Collections.shuffle(ints);
        ints.remove(273);
        
        System.out.println(Collections.binarySearch(ints, 273));
        
        Collections.addAll(ints, 1, 16, 22, 67, 90);
        
        
        
    }
    
}
