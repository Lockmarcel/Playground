package de.lubowiecki.basics;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author T.Lubowiecki
 */
public class ResourceBundleTest {
    
    public static void main(String[] args) {
        
        //long start = System.currentTimeMillis();
        Instant i1 = Instant.now();
        
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.instant());
        
        
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
        
        //long end = System.currentTimeMillis();
        Instant i2 = Instant.now();
        
        //System.out.println(end - start);
        Duration d = Duration.between(i1, i2);
        System.out.println(d.toMillis());
        
        System.out.println(c.instant());
    }
}
