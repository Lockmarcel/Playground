package de.lubowiecki.collections;

import de.lubowiecki.game.Farbe;
import de.lubowiecki.game.Karte;
import de.lubowiecki.game.Wert;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author T.Lubowiecki
 */
public class MapTest {
    public static void main(String[] args) {
        
        Map<String, Integer> user = new HashMap<>();
        user.put("Peter", 25);
        user.put("Bruce", 32);
        user.put("Clark", 54);
        user.put("Clark", 45);
        
        System.out.println(user);
        System.out.println(user.get("Bruce"));
        
        Map<Integer, String> user2 = new HashMap<>();
        Map<Object, String> user3 = new HashMap<>();
        Map<Karte, String> info = new HashMap<>();
        
        user.forEach((k, v) -> System.out.println(k + ": " + v));
        
        System.out.println("--------------");
        
        for(Integer i :user.values()) {
            System.out.println(i);
        }
        
        System.out.println("--------------");
        
        for(String s : user.keySet()) {
            System.out.println(s);
            System.out.println(user.get(s));
        }
        
        System.out.println("--------------");
        
        for(Map.Entry<String, Integer> e : user.entrySet()) {
            System.out.print(e.getValue());
            System.out.println(" " + e.getKey());
        }
        
        System.out.println("--------------");
        
        Map<Karte, String> karten = new TreeMap<>();
        karten.put(new Karte(Farbe.Pik, Wert.Zehn), "Das ist ja was...");
        karten.put(new Karte(Farbe.Pik, Wert.Sieben), "Das ist ja was...anderes");
        karten.put(new Karte(Farbe.Karo, Wert.Bube), "Grr....");
        
        karten.forEach((k, v) -> System.out.println(k + ": " + v));
        
    }
}
