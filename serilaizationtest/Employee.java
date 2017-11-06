/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilaizationtest;

/**
 *
 * @author Tosun Pasha
 */
public class Employee implements java.io.Serializable{
    private String name, address;
    private transient int SSN;
    private long ID;
    
public Employee(String name, String address, int SSN, long ID){
    this.name = name;
    this.address = address;
    this.SSN = SSN;
    this.ID = ID;
}    
public String toString(){
    return "Employee{" + "Name: " + name + ", Address: " + address + ", SSN: " + SSN + ", ID: "+ ID + '}';

}    
public long getID(){
    return ID;
}
public int getSSN(){
    return SSN;
    
}
public String getName(){
    return name;
}
public String getAddress(){
    return address;
}
}
