/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.inheritance;

/**
 *
 * @author T.Lubowiecki
 */
public class VererbungTest4 {
    
    public static void main(String[] args) {
        new Child();
    }
    
}


class Parent {
    
    static {
        System.out.println("Parent: static ini");
    }
    
    {
        System.out.println("Parent: instance ini");
    }
    
    Parent() {
        System.out.println("Parent: instance const");
    }
}

class Child extends Parent {
    
    static {
        System.out.println("Child: static ini");
    }
    
    {
        System.out.println("Child: instance ini");
    }
    
    Child() {
        System.out.println("Child: instance const");
    }
}