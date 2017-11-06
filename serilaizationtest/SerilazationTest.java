/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilaizationtest;
import java.io.*;
/**
 *
 * @author Tosun Pasha
 */
public class SerilazationTest {
    public static void main(String[] args){
        Employee e = new Employee("muzaffer", "HOUSTON", 123213, 1);
        SerializeEmployee(e);
        Employee loadEmp = null;
        DeserializeEmployee(loadEmp);
        
        Employee[] empArr = new Employee[2];
        empArr[0] = e;
        e = new Employee("dasdas", " houston", 123213, 2);
        empArr[1] = e;
        e = new Employee("ddaww", "stafford", 213244, 3);
        SerializeEmployeeArray(empArr);
        Employee[] toLoadEmpArr = null;
        DeserializeEmployeeArray(toLoadEmpArr);
    }
    public static void SerializeEmployee(Employee e){
        try{
        FileOutputStream  fileOut = new FileOutputStream("employee.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(e);
        out.close();
        fileOut.close();
        System.out.println("Serialized data is saved in employee.ser");
        
    }catch(IOException i){
        i.printStackTrace();
    }
    }
    public static void DeserializeEmployee(Employee toLoadEmp){
        try{
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            toLoadEmp = (Employee)in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Employee class not found");
            return;
        }
            System.out.println("Deserialized Employe...");
            System.out.println(toLoadEmp.toString());
        }
    
        public static void SerializeEmployeeArray(Employee[] empArr){
            try{
                FileOutputStream  fileOut = new FileOutputStream("employeesArray.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(empArr);
        out.close();
        fileOut.close();
        System.out.println("Serialized data is saved in employeesArray.ser");
        
    }catch(IOException i){
        i.printStackTrace();
    }
            }
        public static void DeserializeEmployeeArray(Employee[] toLoadEmpArr){
            try{
            FileInputStream fileIn = new FileInputStream("employeesArray.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            toLoadEmpArr = (Employee[])in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i){
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
            System.out.println("Deserialized Employe...");
            for(Employee e: toLoadEmpArr)
            System.out.println(e.toString());
        }
        
    
}
