package de.lubowiecki.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

/**
 *
 * @author T.Lubowiecki
 */
public class ObserverTest {
    
    public static void main(String[] args) {
        
        MessageBoard board = new MessageBoard();
        
        board.addObserver(new JobNews());
        board.addObserver(new PolitikNews());
        board.addObserver(new WirtschaftsNews());
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            System.out.print("Typ: ");
            String typ = scanner.nextLine();
            System.out.println();
            
            if(typ.equalsIgnoreCase("exit"))
                break;
            
            System.out.print("Nachricht: ");
            String message = scanner.nextLine();
            System.out.println();
            
            board.setMessage(typ, message);
            
        }
    }
}

class MessageBoard extends Observable {
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message, String messageBody) {
        this.message = message;
        setChanged();
        notifyObservers(messageBody);
    }
}

class WirtschaftsNews implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        
        String msg = ((MessageBoard) o).getMessage();
        
        switch(msg.toLowerCase()) {
            case "wirtschaft":
                System.out.println("WN: " + arg);
                break;
            default:
                System.out.println("WN: interessiert uns nicht!");
        }
    }
}

class PolitikNews implements Observer {

    private int exitCount = 0;
    
    @Override
    public void update(Observable o, Object arg) {
        String msg = ((MessageBoard) o).getMessage();
        
        switch(msg.toLowerCase()) {
            case "politik":
                System.out.println("P: " + arg);
                break;
            default:
                System.out.println("P: interessiert uns nicht!");
                exitCount++;
        }
        
        if(exitCount == 3) {
            o.deleteObserver(this);
        }
    }
}

class JobNews implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        
        String msg = ((MessageBoard) o).getMessage();
        
        switch(msg.toLowerCase()) {
            case "job":
                System.out.println("J: " + arg);
                break;
            
            case "freelance":
                System.out.println("F: " + arg);
                break;
                
            default:
                System.out.println("J: interessiert uns nicht!");
        }
        
    }
}
