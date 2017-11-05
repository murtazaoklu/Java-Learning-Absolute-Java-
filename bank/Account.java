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
public class Account {
    private double balance;
    private long accountNo;

public Account(double balance, long  accountNo){
    this.balance = balance;
    this.accountNo = accountNo;
}    
public boolean  withdraw(double amount){
    if(balance <= amount){
        System.out.println("No  enough balance to withdraw");
        return false;
    }
    else 
        balance -= amount;
        return true;
}
public boolean deposit(double amount){
    balance += amount;
    return true;
}
public long  getAccountNo(){
    return accountNo;
}
public double getBalance(){
    return balance;
}
}
