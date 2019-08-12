package com.dmitryg.rockpaperscissors;

import java.io.IOError;
import java.util.Scanner;

class Game {

    private int playerWins = 0;
    private int computerWins = 0;
    private final Player pl;
    private final Computer bot;

    Game(Player player, Computer computer) {
        pl = player;
        bot = computer;

        Menu();
    }

    private void Play() {
        int playerChoice = pl.Turn();
        int botChoice = bot.Turn();

        DecideWinner(playerChoice, botChoice);
    }

    private void ShowScores() {
        System.out.println("Player " + playerWins + ":" + computerWins + " Computer\n");
    }


    private void DecideWinner(int playerChoice, int botChoice) {
        if(playerChoice == botChoice)
            System.out.println("Draw!");
        //0 - Камень
        //1 - Бумага
        //2 - Ножницы
        else if(playerChoice == 0 && botChoice == 2) {
            System.out.println("Player Wins!");
            playerWins++;
        }
        else if(playerChoice == 0 && botChoice == 1) {
            System.out.println("Computer Wins!");
            computerWins++;
        }
        else if(playerChoice == 1 && botChoice == 0) {
            System.out.println("Player Wins!");
            playerWins++;
        }
        else if(playerChoice == 1 && botChoice == 2) {
            System.out.println("Computer Wins!");
            computerWins++;
        }
        else if(playerChoice == 2 && botChoice == 1) {
            System.out.println("Player Wins!");
            playerWins++;
        }
        else if(playerChoice == 2 && botChoice == 0) {
            System.out.println("Computer Wins!");
            computerWins++;
        }
        System.out.println();
    }


    private void Menu() {
        System.out.println("Rock-Paper-Scissors!");
        System.out.println("Game Menu");
        System.out.print(" 1. Play\n 2. Scores\n 3. Exit\n");

        int choice = GetMenuChoice();
        if(choice == 1)
            Play();
        else if(choice == 2)
            ShowScores();
        else
            return;

        Menu();
    }


    private int GetMenuChoice() {
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
