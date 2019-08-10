package com.dmitryg.rockpaperscissors;

import java.util.Random;

class Computer {

    int Turn() {
        Random random = new Random();
        int choice = random.nextInt(3);
        System.out.print("Computer choice is ");
        if(choice == 0)
            System.out.println("Rock");
        else if(choice == 1)
            System.out.println("Paper");
        else
            System.out.println("Scissors");

        return choice;
    }
}
