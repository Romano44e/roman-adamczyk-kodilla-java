package com.kodilla.rps;

import java.util.Scanner;

public class EnterName {

    Scanner scanner = new Scanner(System.in);

    public String enterPlayerName() {
        System.out.println("Please, enter your name: ");
        String playerName = scanner.nextLine();


        System.out.println("Welcome to the RPS game " + playerName + "!");
        return playerName;
    }
}
