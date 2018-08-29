package de.lubowiecki.arbeitsblatt5;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author T.Lubowiecki
 */
public class BuchVerkauf {
    
    private static KindleEdition[] buecher = new KindleEdition[4];
    
    private static final NumberFormat NF = NumberFormat.getCurrencyInstance();
    
    public static void main(String[] args) {
        
        String[] titelArray = {
                "Java 7 Übungsbuch Band I",
                "Java 7 Übungsbuch Band II", 
                "Android 4 Übungsbuch",
                "Servlets und JavaServer Pages"
        };
        
        Double[] preisArray = {29.95, 29.95, 24.95, 16.95};
        
        Integer[] seitenArray = {806, 796, 454, 748};
        
        for(int i=0; i < buecher.length; i++) {
            buecher[i] = new KindleEdition();
            buecher[i].setTitle(titelArray[i]);
            buecher[i].setPrice(preisArray[i]);
            buecher[i].setPages(seitenArray[i]);
        }
        
        Consumer<String> consumer1 = titel ->
            System.out.println("Titel: " + titel);
        
        Consumer<Double> consumer2 = price ->
            System.out.println("Preis: " + NF.format(price));
        
        Consumer<KindleEdition> bookConsumer = book -> {
            System.out.println("Titel: " + book.getTitle());
            System.out.println("Preis: " + NF.format(book.getPrice()));
            System.out.println("Seiten: " + book.getPages());
        };
        
        Predicate<KindleEdition> predicate1 = (KindleEdition buch) ->
            buch.getPages() < 750;
        
        Predicate<KindleEdition> predicate2 = (KindleEdition buch) ->
            buch.getPages()>= 750;
        
        Consumer<KindleEdition> consumer3 = (KindleEdition buch) ->
            buch.setPrice(buch.getPrice() - buch.getPrice() * 9/100);
        
        Consumer<KindleEdition> consumer4 = (KindleEdition buch) ->
            buch.setPrice(buch.getPrice() - buch.getPrice() * 12/100);
        
        for(KindleEdition k : buecher) {
//            berechnePreisKindleEdition(k, predicate1, consumer3);
//            berechnePreisKindleEdition(k, predicate2, consumer4);
            berechnePreisKindleEdition(k, predicate2, consumer3, consumer4);
        }
        
        List<KindleEdition> list = Arrays.asList(buecher);
        //anzeigeAttributemitConsumer(list, consumer1, consumer2);
        anzeigeAttributemitConsumer(list, bookConsumer);
    }
    
    static void berechnePreisKindleEdition (KindleEdition buch,
            Predicate<KindleEdition> predicate, Consumer<KindleEdition> consumer) {
        
        if(predicate.test(buch)) {
            consumer.accept(buch);
        }
    }
    
    static void berechnePreisKindleEdition (KindleEdition buch,
            Predicate<KindleEdition> predicate, 
            Consumer<KindleEdition> consumer1,
            Consumer<KindleEdition> consumer2) {
        
        if(predicate.test(buch)) {
            consumer1.accept(buch);
        }
        else {
            consumer2.accept(buch);
        }
    }
    
    static void anzeigeAttributemitConsumer(List<KindleEdition> liste,
            Consumer<String> consumer1, Consumer<Double> consumer2) {
        
        for(KindleEdition k : liste) {
            consumer1.accept(k.getTitle());
            consumer2.accept(k.getPrice());
        }
        
    }
    
    static void anzeigeAttributemitConsumer(List<KindleEdition> liste,
            Consumer<KindleEdition> cons) {
        
        for(KindleEdition k : liste) {
            cons.accept(k);
        }
    }
}
