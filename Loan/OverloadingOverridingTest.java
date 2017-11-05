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
public class OverloadingOverridingTest {
public static void main(String[] args){
    
    Loan cheapLoan = Loan.createLoan("HSBC");
    Loan veryCheapLoan = Loan.createLoan("Citibank", 8.6);
    
    System.out.println(cheapLoan);
    System.out.println(veryCheapLoan);
    
    PersonalLoan pLoan = new PersonalLoan();
    System.out.println(pLoan);
}    
}
