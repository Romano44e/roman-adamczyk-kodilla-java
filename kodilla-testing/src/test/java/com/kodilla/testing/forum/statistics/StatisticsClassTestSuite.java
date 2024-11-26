package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsClassTestSuite {


    private List<String> generateListOfUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 0; n < usersQuantity; n++) {
            String userName = "user" + n;
            resultList.add(userName);
        }
        return resultList;
    }

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
        List<String> listOfUsers = generateListOfUsers(2);
        int postsCountMock = 0;
        int commentsCountMock = 8;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(postsCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        double avPostsPerUser = statisticsClass.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, avPostsPerUser);
    }
}
