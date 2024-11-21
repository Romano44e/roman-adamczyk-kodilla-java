package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator(5,3);

        int sum = calculator.add();
        if (sum == 8) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int subtract = calculator.subtract();
        if (subtract == 2) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
