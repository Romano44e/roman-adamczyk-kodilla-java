package com.kodilla.rps;

public class KeyOperation {

    public void showStartKeyInformation() {
        System.out.println("There is a list of keys and their description: " + "\n"
        + "key 1 - playing rock" + "\n"
        + "key 2 - playing paper" + "\n"
        + "key 3 - playing scissors" + "\n"
        + "key x - end game" + "\n"
        + "key n - start again" + "\n");
    }

    public void showEndKeyInformation() {
        System.out.println("\n"
                + "Please, select action: " + "\n"
                + "key x - end game" + "\n"
                + "key n - start game");
    }
}
