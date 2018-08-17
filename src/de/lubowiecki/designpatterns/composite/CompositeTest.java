package de.lubowiecki.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T.Lubowiecki
 */
public class CompositeTest {
    
    public static void main(String[] args) {
        
        BowMan b = new BowMan("Peter", 10, 5);
        HorseMan h = new HorseMan("Bruce", 2, 7);
        
        Group g1 = new Group();
        g1.add(b);
        g1.add(h);
        
        g1.move(20, 20);
        
    }
}

interface Moveable {
    void move(int x, int y);
}

class Group implements Moveable {
    
    List<Moveable> list = new ArrayList<>();
    
    void add(Moveable m) {
        list.add(m);
    }

    @Override
    public void move(int x, int y) {
        
        for(Moveable m : list)
            m.move(x, y);
    }
}

abstract class Unit {
    
    private String name = "Ohne Namen";
    private int x;
    private int y;

    public Unit() {
    }
    
    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Unit(String name, int x, int y) {
        this(x, y);
        this.name = name;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }
    
    boolean checkXAndChange(int to, int speed) {
        
        if(to == x) {
            return true;
        }
        
        try {
            Thread.sleep(1000 / speed);
        }
        catch(InterruptedException ex) {
        }
        
        if(to > x)
            x++;
        
        if(to < x)
            x--;
        
        System.out.println(getName() + ": Bewegung nach x " + x);
        return false;
    }
    
    boolean checkYAndChange(int to, int speed) {
        
        if(to == y)
            return true;
        
        try {
            Thread.sleep(speed * 1000);
        }
        catch(InterruptedException ex) {
        }
        
        if(to > y)
            y++;
        
        if(to < y)
            y--;
        
        System.out.println(getName() + ": Bewegung nach y " + y);
        return false;
    }
}

class BowMan extends Unit implements Moveable {

    public BowMan(String name, int x, int y) {
        super(name, x, y);
    }
    
    @Override
    public void move(int x, int y) {
        
        Runnable r = () -> {
            while(true) {
                if(checkXAndChange(x, 1) & checkYAndChange(y, 1)) {
                    System.out.println("Ziel erreicht");
                    break;
                }
            }
        };
        new Thread(r).start();
    }
}

class HorseMan extends Unit implements Moveable {
    
    public HorseMan(String name, int x, int y) {
        super(name, x, y);
    }
    
    @Override
    public void move(int x, int y) {
        
        Runnable r = () -> {
            while(true) {
                if(checkXAndChange(x, 2) & checkYAndChange(y, 2)) {
                    System.out.println("Ziel erreicht");
                    break;
                }
            }
        };
        new Thread(r).start();
    }
}