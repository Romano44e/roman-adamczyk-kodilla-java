package com.kodilla.rps;

import java.util.Scanner;

public class RealPlayerMove implements PlayerMove {

    Scanner scanner = new Scanner(System.in);

    @Override
    public String move() {
        System.out.println("please select option: ");
        String choice = "";
        String option = scanner.nextLine();
        switch (option) {
            case "1" -> {
                choice = "rock";
                System.out.println("You have selected: ");
            }
            case "2" -> {
                choice = "paper";
                System.out.println("You have selected: ");
            }
            case "3" -> {
                choice = "scissors";
                System.out.println("You have selected: ");
            }
            case "x" -> {
                choice = "end game. Are you sure you want to exit? Please enter yes or no";
                System.out.println("You have selected " + choice);
                String yesOrNo = scanner.nextLine();
                if (yesOrNo.equals("yes")) {
                    choice = "You exit the game. Thank you for using RPS!";
                } else if (yesOrNo.equals("no")) {
                    choice = "Please select option!";
                }
            }
            case "n" -> {
                option = "start again. Are you sure you want to start the game again? Please enter yes or no";
                System.out.println("You have selected " + option);
                String yesOrNo = scanner.nextLine();
                if (yesOrNo.equals("yes")) {
                    choice = "The game has started again! Please select option!";
                } else if (yesOrNo.equals("no")) {
                    choice = "Please select option!";
                }
            }
        }
        System.out.println(choice);
        return choice;
    }
}
