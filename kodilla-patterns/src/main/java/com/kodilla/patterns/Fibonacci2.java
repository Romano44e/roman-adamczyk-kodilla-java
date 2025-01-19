package com.kodilla.patterns;

import java.util.Scanner;

public class Fibonacci2 {

    public static void main(String[] args) {

        System.out.println(fibonacci(11));

    }

    public static int fibonacci (int n){
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
