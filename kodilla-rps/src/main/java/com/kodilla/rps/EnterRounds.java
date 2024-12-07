package com.kodilla.rps;

import java.util.Scanner;

public class EnterRounds {

    Scanner scanner = new Scanner(System.in);

    public void enterRoundsNumber() {
        System.out.println("Please enter count of rounds to win the game: ");
        int rounds = scanner.nextInt();
        Round round = new Round(rounds);

        System.out.println("Excellent! The game will end when one player win " + round.getRounds() + " rounds.");
    }
}
