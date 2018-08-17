package de.lubowiecki.datatype;

import java.util.Arrays;

/**
 *
 * @author T.Lubowiecki
 */
public class ArrayTest {

    public ArrayTest() {
        //super();
    }
    
    public ArrayTest(int i) {
        //super();
    }
    
    public static void main(String[] args) {
        
        ArrayTest at = new ArrayTest();
        
        Object o = new int[10];
        Object o2 = 1; //Autoboxing von int zu Integer
        
        byte b = 10;
        short s = 20;
        b = (byte)(b + b);
        
        System.out.println("-----------");
        machWas();
        System.out.println("-----------");
        machWas(10, 15);
        System.out.println("-----------");
        machWas(0,7,33,44,97,23);
    }
    
    static void machWas(int... zahlen) {
//        for(int i : zahlen)
//            System.out.println(i);
//        
//        for(int i = 0; i < zahlen.length; i++)
//            System.out.println(zahlen[i]);
        
        Arrays.stream(zahlen).forEach(System.out::println);
    }
}
