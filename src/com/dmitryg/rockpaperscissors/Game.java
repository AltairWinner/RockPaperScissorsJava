package com.dmitryg.rockpaperscissors;

class Game {

    private int playerWins = 0;
    private int computerWins = 0;
    private final Player pl;
    private final Computer bot;

    Game(Player player, Computer computer) {
        pl = player;
        bot = computer;
    }

    void Play() {
        int playerChoice = pl.Turn();
        int botChoice = bot.Turn();

        DecideWinner(playerChoice, botChoice);
    }

    void ShowScores() {
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
}
