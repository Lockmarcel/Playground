package de.lubowiecki.generics;

/**
 *
 * @author T.Lubowiecki
 */
public class GenericTest {
    
    public static void main(String[] args) {
        
        Box<Integer> b = new Box<>();
        b.put(1234);
        //...
        System.out.println(b.get());
        
        // Aufruf Generic Method
        machWas(12345);
    }
    
    // Generic Method
    static <T> T machWas(T t) {
        return t;
    }
}

class Box<T> {
    
    private T element;
    
    public void put(T e) {
        element = e;
    }
    
    public T get() {
        return element;
    }
}
