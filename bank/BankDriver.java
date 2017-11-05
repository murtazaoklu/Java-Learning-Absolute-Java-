/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tosun Pasha
 */
public class BankDriver {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nClients = 100;
        Bank bank = new Bank(nClients);
        
        while(true){
            System.out.println("Please enter your choice: ");
            System.out.println("1: Add Customer");
            System.out.println("2: Deposit Money");
            System.out.println("3: Withdraw Money");
            System.out.println("4: Check Balance");
            System.out.println("5: Calculate Interest");
            System.out.println("6: Exit");
            try{
                int choice = Integer.parseInt(bufferedReader.readLine());
            }
            catch  (IOException ex){
                Logger.getLogger(BankDriver.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
