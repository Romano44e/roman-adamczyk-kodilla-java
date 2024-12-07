package com.kodilla.rps;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Scanner;

@ExtendWith(MockitoExtension.class)
public class RpsGameTestSuite {

    Scanner scanner = new Scanner(System.in);

    private static int testCounter = 0;

    @Mock
    private EnterName enterNameMock;

    @BeforeAll
    public static void init() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of tests.");
    }

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Executing test number " + testCounter);
    }

    @Test
    void testEnterName() {
        //Given
//        EnterName enterName = new EnterName();
        Player player = new Player("Roman");
        String name = player.getName();
        when(enterNameMock.enterName()).thenReturn(name);
//        String playerName = "Roman";
        //When
        String playerName = enterNameMock.enterName();
//        Player player = new Player(playerName);
        //Then
        assertEquals("Roman", playerName);
    }

    @Test
    void testEnterNumberOfRounds() {
        //Given
        int numberOfRounds = 3;
        //When
        Round round = new Round(numberOfRounds);
        //Then
        assertEquals(3, round.getRounds());
    }
}
