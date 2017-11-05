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
public class Client {
    private String firstName, lastName, address;
    private long SSN;
    private Account account;
public Client(String firstName, String lastName, String address, long SSN){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.SSN = SSN;
}    
public Account getAccount(){
    return account;
}
public long getSSN(){
    return SSN;
}
public String getFirstName(){
    return firstName;
}
public String getLastName(){
    return lastName;
}
public String getAddress(){
    return address;
}
}
