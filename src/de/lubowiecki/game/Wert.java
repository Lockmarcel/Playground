package de.lubowiecki.game;

/**
 *
 * @author T.Lubowiecki
 */
public enum Wert {
    Sieben(7), Acht(8), Neun(9), Zehn(10), Bube(2), Dame(3), König(4), Ass(11); 
    
    private final int value;

    private Wert(int wert) {
        this.value = wert;
    }

    public int getValue() {
        return value;
    }
}
