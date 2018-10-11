package com.caveofprogramming.designpatterns.factory;

/*
 *  Imagine that this class requires lots of configuration
 *  before use, e.g. via constructor parameters
 */

public class Dog extends AbstractAnimal implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
