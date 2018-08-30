/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.exceptions;

import java.io.IOException;

/**
 *
 * @author T.Lubowiecki
 */
public class ExceptionTest2 {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        new ExceptionTest2().machWas();
        
        Number n = new Byte("1");
        Integer i = (Integer) n;
        
        
    }
    
    void machWas() throws ClassNotFoundException {
        throw new SecurityException();
    }
}
