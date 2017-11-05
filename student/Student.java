/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Tosun Pasha
 */
public class Student {
    private String name;
    private double gpa;
public Student(String name, double gpa){
    this.name = name;
    this.gpa = gpa;
}
public int compareTo(Object o){
    if(((Student)o).gpa < gpa){
        return 1;
    } else if (((Student) o).gpa > gpa){
        return -1;
    }else{
        return 0;
    }
}   
public double getGpa(){
    return gpa;
}
public String getName(){
    return name;
}
}
