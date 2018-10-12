package com.caveofprogramming.designpatterns.adapter;

// Adapter Pattern using Composition

public class ConsoleLogWriter implements LogWriter{

    private ConsoleWriter consoleWriter = new ConsoleWriter();

    @Override
    public void out(String text) {
        consoleWriter.writeConsole(text);
    }
}
