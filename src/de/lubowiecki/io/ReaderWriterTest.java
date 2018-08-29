package de.lubowiecki.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author T.Lubowiecki
 */
public class ReaderWriterTest {
    
    public static void main(String[] args) {
        
        Instant start = Instant.now();
        
        try(Reader r = new FileReader("test/subdir/test1.txt");
                BufferedReader br = new BufferedReader(r);
                Writer w = new FileWriter("test/subdir/test2.txt");
                BufferedWriter bw = new BufferedWriter(w)) {
            
            String data;
            while((data = br.readLine()) != null) {
                bw.write(data);
            }
            
            bw.flush();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).getNano());
    }
}
