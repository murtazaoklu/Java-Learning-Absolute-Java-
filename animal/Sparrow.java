/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author MUSA
 */
public class Sparrow extends Bird implements Flyable {

    public Sparrow(int age, double weight, String gender) {
        super(age, weight, gender);
    }
    public void fly(){
        System.out.println("Sparrow can fly...");
    }
   
    
}
