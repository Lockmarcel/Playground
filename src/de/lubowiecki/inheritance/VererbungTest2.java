package de.lubowiecki.inheritance;

/**
 *
 * @author T.Lubowiecki
 */
public class VererbungTest2 {
    
    public static void main(String[] args) {
        
        A a = new B();
        System.out.println(a.wert);
        a.machWas(10);
        
        System.out.println(a.staticWert);
        a.machWasStatic();
    }
}

class A {
    
    public String wert = "A";
    public static String staticWert = "A static";
    
    public void machWas() {
        System.out.println("A machWas: " + wert);
    }
    
    public static void machWasStatic() {
        System.out.println("A machWasStatic");
    }
    
    public Number machWas(int i) {
        System.out.println("A machWas: " + wert);
        return 10;
    }
}

class B extends A {
    
    public String wert = "B";
    public static String staticWert = "B static";
    
    @Override
    public void machWas() {
        System.out.println("B machWas: " + wert);
    }
    
    public static void machWasStatic() {
        System.out.println("B machWasStatic");
    }
    
    public Byte machWas(int i) {
        System.out.println("A machWas: " + wert);
        return new Byte("10");
    }
}
