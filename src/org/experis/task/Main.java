package org.experis.task;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Dolphin dolphin = new Dolphin();

        dog.sleep();
        dog.makeSound();
        dog.eat();

        sparrow.fly();
        eagle.fly();
        dolphin.swim();

        makeFly(sparrow);
        makeFly(eagle);
        makeSwim(dolphin);
    }

    public static void makeFly(Flyable flyingAnimal) {
        flyingAnimal.fly();
    }

    public static void makeSwim(Swimmable swimmingAnimal) {
        swimmingAnimal.swim();
    }
}
