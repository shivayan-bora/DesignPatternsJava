package com.caveofprogramming.designpatterns.factory;

/*
 *  Factory Pattern:
 *  Want to create lots of objects that implement the same interface
 *  or derive from the same parent.
 *  Creating an object is complex.
 *  e.g. lots of constructor parameters
 *  Possible to simplify choice of objects
 */

public class Application {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.createAnimal(AnimalFactory.CAT);
        animal1.speak();

        Animal animal2 = AnimalFactory.createAnimal(AnimalFactory.DOG);
        animal2.eat();
    }
}
