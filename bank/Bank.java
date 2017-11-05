/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
/**
 *
 * @author Tosun Pasha
 */
public class Bank {
    public static double transactionFees = 10;
    Client[] clients;
public Bank(int nClients){
    clients = new Client[nClients];
}    
public static double getTransactionFees(){
    return transactionFees;
}
}
