package org.experis.task;

public class Sparrow extends Animal implements Flyable {

    @Override
    void makeSound() {
        System.out.println("Chirp Chirp");
    }

    @Override
    void eat() {
        System.out.println("Eating seeds");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
