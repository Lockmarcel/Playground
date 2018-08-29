/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.game;

/**
 *
 * @author T.Lubowiecki
 */
public enum Farbe {
    
    Karo(9), Herz(10), Pik(11), Kreuz(12);

    private final int value;
    
    private Farbe(int wert) {
        this.value = wert;
    }

    public int getValue() {
        return value;
    }
}
