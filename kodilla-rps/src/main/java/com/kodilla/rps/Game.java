package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    public void startGame() {

        System.out.println("Hello! This is the RPS game!");
        System.out.println();

        EnterName enterName = new EnterName();
        EnterRounds enterRounds = new EnterRounds();
        KeyOperation keyOperation = new KeyOperation();
        RealPlayerMove realPlayerMove = new RealPlayerMove();
        ComputerPlayerMove computerPlayerMove = new ComputerPlayerMove();

        String player1 = enterName.enterPlayerName();
        System.out.println();

        int roundsNumber = enterRounds.enterRoundsNumber();
        System.out.println();

        keyOperation.showKeyInformation();
        System.out.println();

        boolean end = false;
        int playerPoints = 0;
        int computerPoints = 0;
        while (!end) {

            String playermove = realPlayerMove.move();
            System.out.println();

            String computerMove = computerPlayerMove.move();
            System.out.println();

            if (playermove.equals("rock") && computerMove.equals("paper") ) {
                System.out.println("You loose this round!");
                computerPoints++;
            } else if (playermove.equals("paper") && computerMove.equals("rock") ) {
                System.out.println("You win this round!");
                playerPoints++;
            }


            if (playermove.equals("rock") && computerMove.equals("scissors") ) {
                System.out.println("You win this round!");
                playerPoints++;
            } else if (playermove.equals("scissors") && computerMove.equals("rock") ) {
                System.out.println("You lose this round!");
                computerPoints++;
            }


            if (playermove.equals("paper") && computerMove.equals("scissors") ) {
                System.out.println("You loose this round!");
                computerPoints++;
            } else if (playermove.equals("scissors") && computerMove.equals("paper") ) {
                System.out.println("You win this round!");
                playerPoints++;
            }

            System.out.println("The current result is: " + "\n"
                    + "you: " + playerPoints + "\n"
                    + "computer: " + computerPoints + "\n");

            if (playerPoints == roundsNumber) {
                System.out.println("Congratulations " + player1 + "! You win the game!");
                end = true;
            }

            if (computerPoints == roundsNumber) {
                System.out.println("I'm sorry " + player1 + " , but you lost the game!");
                end = true;
            }
        }
    }
}
