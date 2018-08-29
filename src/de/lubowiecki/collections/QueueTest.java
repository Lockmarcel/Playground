package de.lubowiecki.collections;

import java.time.LocalDate;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author T.Lubowiecki
 */
public class QueueTest {
    
    private static final Queue<String> q = new LinkedList<>();
    private static final Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String input = "";
        
//        while(true) {
//            
//            while(!input.equals("exit")) {
//                input = s.next();
//                q.offer(input);
//            }
//            input = "";
//            
//            System.out.println("AUSGABE:");
//            String str = null;
//            while((str = q.poll()) != null)
//                System.out.println(str);
//        }
        
        Deque<String> dq1 = new LinkedList<>();
        dq1.addFirst("Peter");
        dq1.addFirst("Max");
        dq1.addLast("Bruce");

        while(!dq1.isEmpty())
            System.out.println(dq1.pollFirst());
        
        //dq1.forEach(System.out::println);
        
        System.out.println("--------------");
        
        PriorityQueue<LocalDate> pq1 = new PriorityQueue<>();
        
        pq1.offer(LocalDate.of(2000, 10, 1));
        pq1.offer(LocalDate.of(1988, 2, 10));
        pq1.offer(LocalDate.of(1977, 5, 15));
        pq1.offer(LocalDate.of(1999, 10, 15));
        pq1.offer(LocalDate.of(2222, 2, 16));
        
        while(!pq1.isEmpty())
            System.out.println(pq1.poll());
        
        
    }
    
}
