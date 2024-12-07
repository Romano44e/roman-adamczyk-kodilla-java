package com.kodilla.rps;

import java.util.Scanner;

public class EnterName {

    Scanner scanner = new Scanner(System.in);

    public String enterName() {
        System.out.println("Please, enter your name: ");
        String playerName = scanner.nextLine();
        Player player1 = new Player(playerName);

        System.out.println("Welcome to the RPS game " + player1.getName() + "!");
        return player1.getName();
    }
}
