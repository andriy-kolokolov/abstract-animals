package org.experis.task;

abstract class Animal {
    void sleep() {
        System.out.println("Zzz");
    }

    abstract void makeSound();

    abstract void eat();
}
