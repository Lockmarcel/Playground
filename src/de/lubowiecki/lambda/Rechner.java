package de.lubowiecki.lambda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author T.Lubowiecki
 */
public class Rechner {
    
    public static final MathOperation ADD = (a, b) -> a + b;
    public static final MathOperation SUBSTR = (a, b) -> a - b;
    public static final MathOperation MULTI = (a, b) -> a * b;
    public static final MathOperation DIV = (a, b) -> a / b;
    static int rand = new Random().nextInt(100);
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("A: ");
        int a = input.nextInt();
        
        System.out.print("B: ");
        int b = input.nextInt();
        
        System.out.print("OP: ");
        String op = input.next();
        System.out.println();
        
        //final int rand = new Random().nextInt(100);
        
        switch(op) {
            case "+": startOperation(ADD, a, b); break;
            case "-": startOperation(SUBSTR, a, b); break;
            case "*": startOperation(MULTI, a, b); break;
            case "/": startOperation(DIV, a, b); break;
            case "%": startOperation((w1, w2) -> w1 % w2, a, b); break;
            case "#": startOperation((w1, w2) -> w1 * w2 * rand, a, b); break;
        }
        
    }
    
    static void startOperation(MathOperation op, int a, int b) {
        MathOperation.printStatic(op.start(a, b));
    }
}

@FunctionalInterface
interface MathOperation {
    
    int start(int a, int b);

    default void print(int i) {
        System.out.println(i);
    }
    
    static void printStatic(int i) {
        System.out.println(i);
    }
}
