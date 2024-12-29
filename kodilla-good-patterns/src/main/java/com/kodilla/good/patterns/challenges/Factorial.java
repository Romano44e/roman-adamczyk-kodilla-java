package com.kodilla.good.patterns.challenges;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę: ");
        int number = scanner.nextInt();

        int factorial = factorial(number);
        System.out.println("Silnia z " + number + " wynosi " + factorial);

    }

    public static int factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
