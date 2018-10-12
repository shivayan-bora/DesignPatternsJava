package com.caveofprogramming.designpatterns.notadapterpattern;

/*
 *  Not the adapter pattern !!!
 */

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Using a WindowAdapter instead of a WindowListener as we don't
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened!");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed!");
            }
        });
    }
}
