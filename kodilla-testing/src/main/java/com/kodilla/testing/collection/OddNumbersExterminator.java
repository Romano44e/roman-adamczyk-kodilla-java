package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private List<Integer> numbers;
    List<Integer> evenNumbers = new ArrayList<>();
    public OddNumbersExterminator() {}

    public List<Integer> exterminate(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
