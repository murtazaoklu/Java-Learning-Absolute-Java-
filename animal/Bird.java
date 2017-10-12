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
public class Bird extends Animal{

    public Bird(int age, double weight, String gender) {
        super(age, weight, gender);
    }

    @Override
    public void move() {
        System.out.println("Bird is flapping...");
    }
    
    
}