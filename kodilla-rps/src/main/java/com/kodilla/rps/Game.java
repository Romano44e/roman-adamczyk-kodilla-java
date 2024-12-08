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

        keyOperation.showStartKeyInformation();
        System.out.println();

        boolean end = false;
        boolean end1 = false;
        boolean endGame = false;
        int playerPoints = 0;
        int computerPoints = 0;

        while (!end1) {

            String playermove = realPlayerMove.move();
            System.out.println();

            if (playermove.equals("You exit the game. Thank you for using RPS!")) {
//                end1 = true;
                break;
            }

            if (playermove.equals("The game has started again!")) {
                Game game = new Game();
                game.startGame();
            }

            String computerMove = computerPlayerMove.move();
            System.out.println();

            if (playermove.equals("rock") && computerMove.equals("paper")) {
                System.out.println("You loose this round!");
                computerPoints++;
            } else if (playermove.equals("paper") && computerMove.equals("rock")) {
                System.out.println("You win this round!");
                playerPoints++;
            }


            if (playermove.equals("rock") && computerMove.equals("scissors")) {
                System.out.println("You win this round!");
                playerPoints++;
            } else if (playermove.equals("scissors") && computerMove.equals("rock")) {
                System.out.println("You lose this round!");
                computerPoints++;
            }


            if (playermove.equals("paper") && computerMove.equals("scissors")) {
                System.out.println("You loose this round!");
                computerPoints++;
            } else if (playermove.equals("scissors") && computerMove.equals("paper")) {
                System.out.println("You win this round!");
                playerPoints++;
            }


            System.out.println("The current result is: " + "\n"
                    + "you: " + playerPoints + "\n"
                    + "computer: " + computerPoints + "\n");


            if (playerPoints == roundsNumber) {
                System.out.println("Congratulations " + player1 + "! You win the game!");
                RealPlayerMove realPlayerMove1 = new RealPlayerMove();
                endGame = realPlayerMove1.endGameMove();
                playerPoints = 0;
                computerPoints = 0;
                end1 = endGame;
            }


            if (computerPoints == roundsNumber) {
                System.out.println("I'm sorry " + player1 + " , but you lost the game!");
                RealPlayerMove realPlayerMove1 = new RealPlayerMove();
                endGame = realPlayerMove1.endGameMove();
                playerPoints = 0;
                computerPoints = 0;
                end1 = endGame;
            }
        }
    }
}
