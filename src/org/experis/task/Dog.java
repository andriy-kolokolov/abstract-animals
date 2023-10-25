package org.experis.task;

public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    void eat() {
        System.out.println("Eating meat");
    }
}
