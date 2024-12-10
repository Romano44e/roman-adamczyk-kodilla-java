package com.kodilla.rps;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
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
        int playerPoints = 0;
        int computerPoints = 0;

        while (!end) {
            String playermove = realPlayerMove.move();
            System.out.println();

            if (playermove.equals("exit")) {
                break;
            }

            if (playermove.equals("start")) {
                Game game = new Game();
                game.startGame();
            }

            computerPlayerMove.move();
            System.out.println();

            PossibleResults possibleResults = new PossibleResults();
            Map<PlayersMove, String> results = possibleResults.getResults();

            String result = results.get(new PlayersMove(realPlayerMove.move(), computerPlayerMove.move()));

            if (result.equals("You loose this round!")) {
                System.out.println("You loose this round!");
                computerPoints++;
            } else if (result.equals("You win this round!")) {
                System.out.println("You win this round!");
                playerPoints++;
            }

//            if ((playermove.equals("rock") && computerMove.equals("paper"))
//                    || (playermove.equals("scissors") && computerMove.equals("rock"))
//                    || (playermove.equals("paper") && computerMove.equals("scissors"))) {
//                System.out.println("You loose this round!");
//                computerPoints++;
//            } else if ((playermove.equals("paper") && computerMove.equals("rock"))
//                    || (playermove.equals("rock") && computerMove.equals("scissors"))
//                    || (playermove.equals("scissors") && computerMove.equals("paper"))) {
//                System.out.println("You win this round!");
//                playerPoints++;
//            } else if (playermove.equals(computerMove)) {
//                System.out.println("It's a draw!");
//            }

            System.out.println("The current result is: " + "\n"
                    + "you: " + playerPoints + "\n"
                    + "computer: " + computerPoints + "\n");

            if (playerPoints == roundsNumber) {
                System.out.println("Congratulations " + player1 + "! You win the game!");
                RealPlayerMove realPlayerMove1 = new RealPlayerMove();
                playerPoints = 0;
                computerPoints = 0;
                end = realPlayerMove1.endGameMove();
            }

            if (computerPoints == roundsNumber) {
                System.out.println("I'm sorry " + player1 + " , but you lost the game!");
                RealPlayerMove realPlayerMove1 = new RealPlayerMove();
                playerPoints = 0;
                computerPoints = 0;
                end = realPlayerMove1.endGameMove();
            }
        }
    }
}
