package de.lubowiecki.basics;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author T.Lubowiecki
 */
public class ResourceBundleTest {
    
    public static void main(String[] args) {
        
        Locale loc;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("1: DE, 2: EN");
        
        Locale langArr[] = {new Locale("de"), new Locale("en")};
        while(true) {
            try {
                loc = langArr[Integer.parseInt(input.nextLine()) - 1];
                break;
            }
            catch(Exception ex) {
                System.out.println("Müll! Noch mal!");
            }
        }
        
        ResourceBundle bundle = ResourceBundle.getBundle("de.lubowiecki.basics.texte", loc);
        
        System.out.println(bundle.getString("text1"));
        System.out.println(bundle.getString("text2"));
        System.out.println(bundle.getString("text3"));
        
        
    }
}
