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
public class GreetingProducer {
    private String greeting;
    private static final int REPETITIONS = 10;
    private static final int DELAY = 100;
public GreetingProducer(String aGreeting){
    greeting = aGreeting;
}
public  void run(){
    try{
        for(int i = 1; i <= REPETITIONS; i++){
            System.out.println(i + ": " + greeting);
            Thread.sleep(DELAY);
        }}
        catch(InterruptedException exception){
                
                }
    
}
}
