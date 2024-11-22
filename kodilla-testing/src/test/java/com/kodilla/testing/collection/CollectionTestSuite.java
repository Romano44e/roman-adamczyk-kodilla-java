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
        List<Integer> list = new ArrayList<>();
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
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        OddNumbersExterminator oddNumbersExterminator1 = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator1.exterminate(numbers);
        List<Integer> expected = List.of(2, 4);
        //Then
        Assertions.assertEquals(expected, result);
    }
}
