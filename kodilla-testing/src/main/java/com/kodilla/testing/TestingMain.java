package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {
        OddNumbersExterminator oddNumbersExterminator1 = new OddNumbersExterminator();
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        //When
        List<Integer> result1 = oddNumbersExterminator1.exterminate(numbers1);

        System.out.println(result1.size());
    }
}
