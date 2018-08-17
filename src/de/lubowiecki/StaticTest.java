package de.lubowiecki;

/**
 *
 * @author T.Lubowiecki
 */
public class StaticTest {
    
    public static void main(String[] args) {
        
        StaticTestImpl sti1 = new StaticTestImpl();
        StaticTestImpl sti2 = new StaticTestImpl();
        
        System.out.println("----------- STATIC -----------");
        sti1.zahl = 100;
        System.out.println(sti1.zahl);
        System.out.println(sti2.zahl);
        
        System.out.println("----------- INSTANCE -----------");
        
        sti1.instanceZahl = 200;
        System.out.println(sti1.instanceZahl);
        System.out.println(sti2.instanceZahl);
        
        System.out.println("-----------------");
        
        //StaticTestImpl.machWasStatic();
        
        new StaticTestImpl("Peter", "Parker");
        
    }
}

class StaticTestImpl {
    
    public static int zahl;
    
    public int instanceZahl;

    public StaticTestImpl() {
        //super()
        System.out.println("0 Param");
    }
    
    public StaticTestImpl(String text) {
        this();
        System.out.println("1 Param");
    }
    
    public StaticTestImpl(String text1, String text2) {
        this(text1);
        System.out.println("2 Param");
    }
    
    static void machWasStatic() {
        System.out.println(zahl);
//        System.out.println(instanceZahl);
    }
    
    void machWasInstance() {
        System.out.println(zahl);
        System.out.println(instanceZahl);
    }
}
