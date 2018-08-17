package de.lubowiecki.datatype;

/**
 *
 * @author T.Lubowiecki
 */
public class SchachTest {
    
    public static void main(String[] args) {
        
        int fields[][] = new int[8][8];
        
        for(int i = 0; i < fields.length; i++) {
            
            for(int j = 0; j < fields[i].length; j++) {
                System.out.print(fields[i][j]);
            }
            System.out.println();
        }
    }
}
