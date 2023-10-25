package org.experis.task;

public class Dolphin extends Animal implements Swimmable {
    @Override
    void makeSound() {
        System.out.println("Click Click");
    }

    @Override
    void eat() {
        System.out.println("Eating fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
}
