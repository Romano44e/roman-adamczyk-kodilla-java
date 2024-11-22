package com.kodilla.testing.collection;

import java.util.List;

public class OddNumbersExterminator {

    private List<Integer> numbers;

    public OddNumbersExterminator() {}

    public List<Integer> exterminate(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                numbers.remove(number);
            }
        }
        return numbers;
    }
}
