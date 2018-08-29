package de.lubowiecki.game;

/**
 *
 * @author T.Lubowiecki
 */
public class Karte implements Comparable<Karte>{
    
    private final Farbe farbe;
    private final Wert wert;

    public Karte(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    @Override
    public String toString() {
        return farbe + " " + wert + " " + (wert.getValue() * farbe.getValue());
    }

    @Override
    public int compareTo(Karte o) {
        return (wert.getValue() * farbe.getValue()) - (o.wert.getValue() * o.farbe.getValue());
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public Wert getWert() {
        return wert;
    }
}
