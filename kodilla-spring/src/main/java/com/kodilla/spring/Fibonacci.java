package com.kodilla.spring;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę: ");
        int number = scanner.nextInt();

        int fibonacciNumber = getFibonacciElement(number);
        System.out.println(number + " element ciągi Fibonacciego wynosi " + fibonacciNumber);

    }

    public static int getFibonacciElement(int number) {
        int fibonacci0 = 0;
        int fibonacci1 = 1;
        int fibonacci2 = 0;

        for (int i = 1; i < number - 1; i++) {
            fibonacci2 = fibonacci0 + fibonacci1;
            fibonacci0 = fibonacci1;
            fibonacci1 = fibonacci2;
        }
        return fibonacci2;
    }
}
