package com.kodilla.rps;

import java.util.Scanner;

public class EnterRounds {

    Scanner scanner = new Scanner(System.in);

    public int enterRoundsNumber() {
        System.out.println("Please enter number of rounds to win the game: ");
        int rounds = scanner.nextInt();

        System.out.println("Excellent! The game will end when one player win " + rounds + " rounds.");

        return rounds;
    }
}
