/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 *
 * @author T.Lubowiecki
 */
public class InputStreamWriterTest {
    
    public static void main(String[] args) {
        
        //Charset.availableCharsets().forEach((a, b) -> System.out.println(a + ": " + b));
        
        
        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("test/subdir/test1.txt"), "UTF-8")
        )) {
            
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
