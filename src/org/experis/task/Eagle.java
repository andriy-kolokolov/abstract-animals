package org.experis.task;

public class Eagle extends Animal implements Flyable {
    @Override
    void makeSound() {
        System.out.println("Screech!");
    }

    @Override
    void eat() {
        System.out.println("Eating small mammals");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying high!");
    }
}
