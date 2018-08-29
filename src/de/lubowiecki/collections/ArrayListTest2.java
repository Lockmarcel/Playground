/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.collections;

import java.util.ArrayList;

/**
 *
 * @author T.Lubowiecki
 */
public class ArrayListTest2 {
    
    public static void main(String[] args) {
        
        ArrayList<String> seasons = new ArrayList<>();
        seasons.add(1, "Spring");
        seasons.add(2, "Summer");
        seasons.add(3, "Autumn"); 
        seasons.add(4, "Winter");
        seasons.remove(2);
        
        for (String s : seasons)
            System.out.print(s + ", ");
        
    }
    
}
