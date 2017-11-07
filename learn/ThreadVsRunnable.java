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
class ImplementsRunnable implements Runnable {
    private int counter = 0;
public void run (){
    counter++;
    System.out.println("ImplementsRunnable : Counter : " + counter);
}    

}

class ExtendsThread extends Thread{
    private int counter = 0;
    public void run(){
        counter ++;
        System.out.println("ExtendsThread : Counter : " + counter);
    }
}
public class ThreadVsRunnable{
    public static void main(System[] args) throws Exception{
        ImplementsRunnable rc = new ImplementsRunnable();
        Thread t1 = new Thread(rc);
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(rc);
        t2.start();
        Thread.sleep(1000);
        Thread t3 = new Thread(rc);
        t3.start();
        
        ExtendsThread tc1 = new ExtendsThread();
        tc1.start();
        Thread.sleep(1000);
        ExtendsThread tc2 = new ExtendsThread();
        tc2.start();
        Thread.sleep(1000);
        ExtendsThread tc3 = new ExtendsThread();
        tc3.start();
        
    }
}