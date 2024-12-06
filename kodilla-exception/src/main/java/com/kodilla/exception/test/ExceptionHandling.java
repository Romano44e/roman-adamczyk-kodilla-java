package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
        secondChallenge.probablyIWillThrowException(1.5, 1);
        } catch (Exception e) {
            System.out.println("There is an exception: " + e);
        } finally {
            System.out.println("The second challenge has been handled.");
        }
    }
}
