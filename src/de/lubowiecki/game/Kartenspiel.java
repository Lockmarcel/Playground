package de.lubowiecki.game;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T.Lubowiecki
 */
public class Kartenspiel {
    
    public static final Comparator<Karte> FARBE_WERT_SORT;
    public static final Comparator<Karte> WERT_FARBE_SORT;
    
    static {
        FARBE_WERT_SORT = (a, b) -> {
            int i = a.getFarbe().getValue() - b.getFarbe().getValue();
            if(i == 0)
                return a.getWert().getValue() - b.getWert().getValue();
            
            return i;
        };
        WERT_FARBE_SORT = (a, b) -> {
            int i = a.getWert().getValue() - b.getWert().getValue();
            if(i == 0)
                return a.getFarbe().getValue() - b.getFarbe().getValue();
            
            return i;
        };
    }
    
    private static final Queue<Karte> karten = create();
    
    public static void main(String[] args) {
        
        Collections.shuffle((List<Karte>)karten);
        
        Collections.sort((List<Karte>)karten, WERT_FARBE_SORT);
        
        while(!karten.isEmpty()) {
            System.out.println(karten.poll());
        }
    }
    
    private static Queue<Karte> create() {
        
        Queue<Karte> karten = new LinkedList<>();
        
        for(Farbe f : Farbe.values()) {
            for(Wert w : Wert.values()) {
                karten.offer(new Karte(f, w));
            }
        }
        
        return karten;
    }
}
