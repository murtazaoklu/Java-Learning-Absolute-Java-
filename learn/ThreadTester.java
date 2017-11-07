/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author Tosun Pasha
 */
public class ThreadTester {
    public static void main (String[] args){
        Runnable r1 = (Runnable) new GreetingProducer("Hello");
        Runnable r2 = (Runnable) new GreetingProducer("Goodbye");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
