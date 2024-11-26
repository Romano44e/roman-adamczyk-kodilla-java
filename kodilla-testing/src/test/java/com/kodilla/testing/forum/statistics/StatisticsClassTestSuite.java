package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsClassTestSuite {

    private static int testCounter = 0;

    @Mock
    private Statistics statisticsMock;

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
    void testCalculateAdvStatistics0Posts() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        int size = statisticsMock.usersNames().size();
        size = 2;
        int commentsCount = statisticsMock.commentsCount();
        commentsCount = 8;
        int postsCount = statisticsMock.postsCount();
        postsCount = 4;
        List<Double> ListOfStatistics = new ArrayList<Double>();
        ListOfStatistics.add(0, 2.0);
        ListOfStatistics.add(1, 4.0);
        ListOfStatistics.add(2, 8.0);
        ListOfStatistics.add(3, 2.0);
        ListOfStatistics.add(4, 4.0);
        ListOfStatistics.add(5, 2.0);
        when(statisticsClass.calculateAdvStatistics(statisticsMock)).thenReturn(ListOfStatistics);
        //When
        List<Double> result = statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertArrayEquals(ListOfStatistics.toArray(), result.toArray());
    }
}
