package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double add = calculator.add(1, 2);
        double sub = calculator.sub(1, 2);
        double mul = calculator.mul(1, 2);
        double div = calculator.div(1, 2);
        //Then
        assertEquals(3, add);
        assertEquals(-1, sub);
        assertEquals(2, mul);
        assertEquals(0.5, div, 0.001);
    }

}
