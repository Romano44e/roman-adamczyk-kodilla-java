package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayAverage implements ArrayOperations {


    @Override
    public double getAverage(int[] numbers) {

        IntStream.range(numbers[0], 21)
                .forEach(System.out::println);

        OptionalDouble average = IntStream.range(numbers[0], 21)
                .average();

        double asDouble = average.getAsDouble();
        return asDouble;
    }
}
