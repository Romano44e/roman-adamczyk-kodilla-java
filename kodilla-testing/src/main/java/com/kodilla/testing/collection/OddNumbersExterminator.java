package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private ArrayList<Integer> numbers;

    public OddNumbersExterminator() {}

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
        return numbers;
    }
}
