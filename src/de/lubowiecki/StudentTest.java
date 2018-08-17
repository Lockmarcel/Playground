package de.lubowiecki;

/**
 *
 * @author T.Lubowiecki
 */
public class StudentTest {
    
    public static void main(String[] args) {
        
        Student st1 = new JuraStudent();
        
    }
    
}

class JuraStudent extends Student {

    @Override
    public String getIrgendwas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
