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
                break;
            }

            String computerMove = computerPlayerMove.move();
            System.out.println();

            String move = playermove + " & " + computerMove;

            PossibleResults possibleResults = new PossibleResults();
            Map<String, String> results = possibleResults.getResults();

            String result = results.get(move);

            switch (result) {
                case "loose" -> {
                    System.out.println("You loose this round!");
                    computerPoints++;
                }
                case "win" -> {
                    System.out.println("You win this round!");
                    playerPoints++;
                }
                case "tie" -> System.out.println("It's a draw!");
            }

            System.out.println("The current result is: " + "\n"
                    + "you: " + playerPoints + "\n"
                    + "computer: " + computerPoints + "\n");

            if (playerPoints == roundsNumber) {
                System.out.println("Congratulations " + player1 + "! You win the game!");
                RealPlayerMove realPlayerMove1 = new RealPlayerMove();
                playerPoints = 0;
                computerPoints = 0;
                end = realPlayerMove1.endGameMove();
                break;
            }

            if (computerPoints == roundsNumber) {
                System.out.println("I'm sorry " + player1 + " , but you lost the game!");
                RealPlayerMove realPlayerMove1 = new RealPlayerMove();
                playerPoints = 0;
                computerPoints = 0;
                end = realPlayerMove1.endGameMove();
                break;
            }
        }
    }
}
