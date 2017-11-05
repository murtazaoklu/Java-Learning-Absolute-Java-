/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author Tosun Pasha
 */
public class Loan {
    private double interestRate;
    private String customer;
    private String lender;
public static Loan createLoan(String lender){
    Loan loan = new Loan();
    loan.lender = lender;
    return loan;
}    
public static Loan createLoan(String lender, double interestRate){
    Loan loan = new Loan();
    loan.lender = lender;
    loan.interestRate = interestRate;
    return loan;
}
    @Override
public String toString(){
    return "This is Loan by Citibank";
}
}
