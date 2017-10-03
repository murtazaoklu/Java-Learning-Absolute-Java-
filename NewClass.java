/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUSA
 */
import java.util.Scanner;
public class NewClass {
    public static final double RATE = 150.00;
    private int hours;
    private int minute;
    private double fee;
    public void inputTimeWorked(){
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter hours");
        hours = keyboard.nextInt();
        System.out.println("number of minutes");
        minute = keyboard.nextInt();
    }
    private double computeFee(int hoursWorked, int minuteWorked){
        minuteWorked = hoursWorked * 60 + minuteWorked;
        int quarterHours = minuteWorked / 15;
        return quarterHours * RATE;
    }
    public void updateFee(){
        fee = computeFee(hours, minute);
    }
    public void outputBill(){
        System.out.println("Time worked: ");
        System.out.println(hours + " hoursn and " + minute + "minute");
        System.out.println("Rate: $" + RATE + "per quarter hour.");
        System.out.println("Amount due: $" + fee);
    }
    
}
