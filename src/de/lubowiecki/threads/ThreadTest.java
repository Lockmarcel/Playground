package de.lubowiecki.threads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T.Lubowiecki
 */
public class ThreadTest {
    
    public static void main(String[] args) {
        System.out.println("START " + Thread.currentThread().getName());
        
//        Runnable job = () -> {
//            while(true) {
//                System.out.println("Hey Babe.... baby, baby! Hey!");
//                try {
//                    Thread.currentThread().sleep(500);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(MyTask.class.getName()).log(Level.WARNING, null, ex);
//                }
//            }
//        };
        
//        Runnable andererJob = new Runnable() {
//            @Override
//            public void run() {
//                while(true) {
//                    System.out.println("Hey Babe.... baby, baby! Hey!");
//                    try {
//                        Thread.currentThread().sleep(500);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(MyTask.class.getName()).log(Level.WARNING, null, ex);
//                    }
//                }
//            }
//        };
//        
//        Thread t = new Thread(andererJob);
        
//        t.setPriority(10);
//        System.out.println(t.getId());
//        System.out.println(t.getName());
//        t.setDaemon(true);
//        t.start();
        
//        Object o = new Object();
//        o.notify();

        new MyTask("Peter").start();
        new MyTask("Bruce").start();
        MyTask c = new MyTask("Clark");
        c.start();
        new MyTask("David").start();
        
        System.out.println("C lebt? " + c.isAlive());
        
        try {
//            Thread.sleep(500);
//            c.interrupt();
            c.join();
            System.out.println("C lebt? " + c.isAlive());
        }
        catch(InterruptedException ex) {
            System.out.println(ex);
        }
        
        System.out.println("END " + Thread.currentThread().getName());
    }
}

class MyTask extends Thread {

    public MyTask(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        
        Random r = new Random();
        
        for(int i = 0; i < 10; i++) {
            System.out.println(getName() + (r.nextInt(100) + 1));
            
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("UGHHHH.... ich sterbe!");
                break;
            }
        }
        
    }
}