package com.caveofprogramming.designpatterns.facade;

public class Application {
    public static void main(String[] args) {

        Game game = new Game();

        // Game
        while(true) {
            game.update();
        }
    }
}
