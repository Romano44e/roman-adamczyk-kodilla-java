package com.kodilla.hibernate;

import org.springframework.boot.SpringApplication;

public class AdditionaTask {

    public static void main(String[] args) {

        int number1 = 17868;
        int reversedNumber1 = reverseNumber(number1);
        System.out.println("Odwrócona liczba: " + reversedNumber1);

        int number = 17868;
        int reversedNumber = reverse(number);
        System.out.println(reversedNumber);

    }

    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }




    public static int reverse(int x) {

        String a = "" + x;
        String c = "";

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(a.length() - 1 - i);
            c = c + b;
        }

        return Integer.parseInt(c);
    }
}
