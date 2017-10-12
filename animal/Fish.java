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
public class Fish extends Animal {

    public Fish(int age, double weight, String gender) {
        super(age, weight, gender);
    }
    
    public void swim(){
        System.out.println("Swimming...");
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming");
    }
    
}
