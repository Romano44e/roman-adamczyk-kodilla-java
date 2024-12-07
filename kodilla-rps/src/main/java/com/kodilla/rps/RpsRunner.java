package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! This is the RPS game!");

        EnterName enterName = new EnterName();
        EnterRounds enterRounds = new EnterRounds();
        enterName.enterName();
        enterRounds.enterRoundsNumber();



//        System.out.println("Please enter count of rounds to win the game: ");
//        int rounds = scanner.nextInt();
//        Round round = new Round(rounds);
//
//        System.out.println("Excellent! The game will end when one player win " + round.getRounds() + " rounds.");

//        System.out.println("Please, enter your name: ");
//        String playerName = scanner.nextLine();
//        Player player1 = new Player(playerName);
//
//        System.out.println("Welcome to the RPS game " + player1.getName() + "!");


//
//        System.out.println("Choose option: ");
//        String opcja = scanner.nextLine();
//
//        System.out.println("You have selected an option " + opcja);

    }
}