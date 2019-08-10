package com.dmitryg.rockpaperscissors;

import java.io.IOError;
import java.util.Scanner;

class Main {

    private static Game game;

    public static void main(String[] args) {

        Computer bot = new Computer();
        Player player = new Player();
        game = new Game(player, bot);

        Menu();
    }

    private static void Menu() {
        System.out.println("Rock-Paper-Scissors!");
        System.out.println("Game Menu");
        System.out.print(" 1. Play\n 2. Scores\n 3. Exit\n");

        int choice = GetMenuChoice();
        if(choice == 1)
            game.Play();
        else if(choice == 2)
            game.ShowScores();
        else
            return;

        Menu();
    }


    private static int GetMenuChoice() {
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        int choice = -1;

        while(!correct) {
            try {
                choice = sc.nextInt();
                correct = true;
            } catch (IOError error) {
                System.out.println("Incorrect input. Please try again.");
            }
        }
        return choice;
    }
}
