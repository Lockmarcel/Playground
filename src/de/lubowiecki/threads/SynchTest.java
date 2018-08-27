package de.lubowiecki.threads;

/**
 *
 * @author T.Lubowiecki
 */
public class SynchTest {
    
    public static void main(String[] args) {
        
        new ThreadThing("Peter").start();
        new ThreadThing("Bruce").start();
        
    }
}

class ThreadThing extends Thread {
    
    static int i = 0;
    
    static final Object LOCK = new Object();

    public ThreadThing(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        countStatic();
    }
    
    void count() {
        synchronized(LOCK) {
            for(int j = 0; j < 1000; j++) {
                System.out.println(getName() + " " + ++i);
            }
        }
    }
    
    static synchronized void countStatic() {
        for(int j = 0; j < 1000; j++) {
            System.out.println(Thread.currentThread().getName() + " " + ++i);
        }
    }
}
