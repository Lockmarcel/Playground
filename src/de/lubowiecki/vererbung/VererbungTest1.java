package de.lubowiecki.vererbung;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author T.Lubowiecki
 */
public class VererbungTest1 {
    
}

class SuperClass {

    public SuperClass() {
    }
    
    public SuperClass(int i) {
        System.out.println(SubClass.class.getName());
    }
}

class SubClass extends SuperClass {

    public SubClass() {
        System.out.println(SubClass.class.getName());
    }
}

interface IKommunikativ extends Serializable{
    
    void machWas();
    
}

class SehrKommunikativeKlasse implements IKommunikativ {

    @Override
    public void machWas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
