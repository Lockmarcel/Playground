/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.lubowiecki.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T.Lubowiecki
 */
public class NotifyTest {
    
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2(t1);
        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread {

    boolean meeting = false;
    
    @Override
    public void run() {
        while(!meeting) {
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            startMeeting();
        }
    }
    
    synchronized void startMeeting() {
        meeting = true;
        notify();
    }
}

class MyThread2 extends Thread {
    
    MyThread1 t1;

    public MyThread2(MyThread1 t1) {
        this.t1 = t1;
    }
    
    @Override
    public void run() {
        System.out.println("Meeting? " + t1.meeting);
        
        synchronized(t1) {
            try {
                t1.wait();
            }
            catch(InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Meeting? " + t1.meeting);
    }
}
