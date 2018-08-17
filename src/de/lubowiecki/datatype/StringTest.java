package de.lubowiecki.datatype;

/**
 *
 * @author T.Lubowiecki
 */
public class StringTest {
    
    public static void main(String[] args) {
        
        String s1 = "Moin " + "Welt";
        String s2 = "Moin ".concat("Welt");
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        String s3 = new String("Moin");
        String s4 = new String("Moin");
        
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        
    }
}
