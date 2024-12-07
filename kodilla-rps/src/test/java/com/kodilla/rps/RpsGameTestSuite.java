package com.kodilla.rps;


import org.junit.jupiter.api.*;
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

    @Mock
    private RealPlayerMove playerMoveMock;

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
        String name = "Roman";
        when(enterNameMock.enterPlayerName()).thenReturn(name);
//        String playerName = "Roman";
        //When
        String playerName = enterNameMock.enterPlayerName();
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

    @Nested
    @DisplayName("Tests for player move")
    class PlayerMove {
        @Test
        void testPlayerMoveRock() {
            //Given
            String option = "rock";
            when(playerMoveMock.move()).thenReturn(option);
            //When
            String move = playerMoveMock.move();
            //Then
            assertEquals("rock", move);
        }

        @Test
        void testPlayerMovePaper() {
            //Given
            String option = "paper";
            when(playerMoveMock.move()).thenReturn(option);
            //When
            String move = playerMoveMock.move();
            //Then
            assertEquals("paper", move);
        }

        @Test
        void testplayerMoveScissors() {
            //Given
            String option = "scissors";
            when(playerMoveMock.move()).thenReturn(option);
            //When
            String move = playerMoveMock.move();
            //Then
            assertEquals("scissors", move);
        }
    }
}
