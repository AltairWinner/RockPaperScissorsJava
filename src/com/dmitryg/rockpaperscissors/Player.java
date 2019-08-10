package com.dmitryg.rockpaperscissors;

import java.io.IOError;
import java.util.Scanner;

class Player {

    int Turn() {
        return GetTurnFromPlayer();
    }

    private int GetTurnFromPlayer() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        boolean correct = false;
        while (!correct) {
            System.out.println("Awaiting player choice\n1 - Rock\n2 - Paper\n3 - Scissors");

            try {
                choice = sc.nextInt();
                correct = true;
            }
            catch (IOError error) {
                System.out.println("Incorrect input. Please try again.");
            }
        }

        choice--;

        System.out.print("Player choice is ");
        if(choice == 0)
            System.out.println("Rock");
        else if(choice == 1)
            System.out.println("Paper");
        else
            System.out.println("Scissors");

        return (choice);
    }
}
