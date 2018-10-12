package com.caveofprogramming.designpatterns.adapter;

public class Application {
    public static void main(String[] args) {
        // Uses Composition
        Logger logger1 = new Logger(new ConsoleLogWriter());
        logger1.write("Hello Composition");

        // Uses Inheritance
        Logger logger2 = new Logger(new ConsoleLogWriter2());
        logger2.write("Hello Inheritance");
    }
}
