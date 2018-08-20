package de.lubowiecki.lambda;

/**
 *
 * @author T.Lubowiecki
 */
public class LambdaTest {
    
    public static void main(String[] args) {
        
        MyInterface i1 = () -> System.out.println("Moin");
        i1.machWas();
        
        i1 = () -> System.out.println("Hallo Welt");
        i1.machWas();
        
        //Object o = i1;
        
        MyOtherInterface oi1 = (s1, s2) -> s1 + ", " + s2;
        System.out.println(oi1.machWasAnderes("a", "b"));
    }
}

//SAM
@FunctionalInterface
interface MyInterface {
    
    void machWas();
    
}

@FunctionalInterface
interface MyOtherInterface {
    
    String machWasAnderes(String a, String b);
    
}
