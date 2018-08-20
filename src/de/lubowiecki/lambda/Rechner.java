package de.lubowiecki.lambda;

/**
 *
 * @author T.Lubowiecki
 */
public class Rechner {
    
    public static void main(String[] args) {
        
    }
}

@FunctionalInterface
interface MathOperation {
    
    int start(int a, int b);
    
}
