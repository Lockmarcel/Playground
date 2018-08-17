package de.lubowiecki.inheritance;

/**
 *
 * @author T.Lubowiecki
 */
public class PolyTest1 {

    public static void main(String[] args) {
        
        PolyTest1 obj = new PolyTest1();
        obj.machWas(new Food());
        
        System.out.println("-------------");
        obj.machWas(new Tool());
        
    }
    
    public void machWas(Thing t) {
        t.use();
    }
}

abstract class Thing {
    public abstract void use();
}

class Tool extends Thing {

    @Override
    public void use() {
        System.out.println("Benutze Werkzeug.");
    }
}

class Food extends Thing {

    @Override
    public void use() {
        System.out.println("Esse Mittagessen.");
    }
}




