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
public abstract class Animal {

    /**
     * @param args the command line arguments
     */
    int age;
    double weight;
    String gender;

    public Animal(int age, double weight, String gender) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("Eating...");

    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();

}
