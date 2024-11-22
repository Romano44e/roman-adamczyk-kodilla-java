package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test Case: end");
    }

    @DisplayName("checking whether the method works when the argument is an empty list")
    @Test
    void testOddNumbersExterminatoryEmptyList() {
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(list);
        List<Integer> expected = List.of();
        //Then
        Assertions.assertEquals(expected, result);
    }

    @DisplayName("checking whether the method works when the argument is a list of odd and even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        OddNumbersExterminator oddNumbersExterminator1 = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator1.exterminate(numbers);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        //Then
        Assertions.assertEquals(expected, result);
    }
}
