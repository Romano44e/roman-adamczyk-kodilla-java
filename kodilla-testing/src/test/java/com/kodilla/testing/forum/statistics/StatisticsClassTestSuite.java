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
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = statisticsClass.averagePostsPerUser;
        double avCommentsPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommentsPerPost = statisticsClass.averageCommentsPerPost;
        //Then
        Assertions.assertEquals(0, avPostsPerUser);
        Assertions.assertEquals(4, avCommentsPerUser);
        Assertions.assertEquals(0, averageCommentsPerPost);
    }

    @Test
    void testCalculateAdvStatistics1000Posts() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsers = generateListOfUsers(500);
        int postsCountMock = 1000;
        int commentsCountMock = 2000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(postsCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = statisticsClass.averagePostsPerUser;
        double avCommentsPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommentsPerPost = statisticsClass.averageCommentsPerPost;
        //Then
        Assertions.assertEquals(2, avPostsPerUser);
        Assertions.assertEquals(4, avCommentsPerUser);
        Assertions.assertEquals(2, averageCommentsPerPost);
    }

    @Test
    void testCalculateAdvStatistics0Comments() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsers = generateListOfUsers(500);
        int postsCountMock = 1000;
        int commentsCountMock = 0;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(postsCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = statisticsClass.averagePostsPerUser;
        double avCommentsPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommentsPerPost = statisticsClass.averageCommentsPerPost;
        //Then
        Assertions.assertEquals(2, avPostsPerUser);
        Assertions.assertEquals(0, avCommentsPerUser);
        Assertions.assertEquals(0, averageCommentsPerPost);
    }

    @Test
    void testCalculateAdvStatisticsCommentsLessThanPosts() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsers = generateListOfUsers(500);
        int postsCountMock = 1000;
        int commentsCountMock = 500;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(postsCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = statisticsClass.averagePostsPerUser;
        double avCommentsPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommentsPerPost = statisticsClass.averageCommentsPerPost;
        //Then
        Assertions.assertEquals(2, avPostsPerUser);
        Assertions.assertEquals(1, avCommentsPerUser);
        Assertions.assertEquals(0.5, averageCommentsPerPost);
    }

    @Test
    void testCalculateAdvStatisticsCommentsMoreThanPosts() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsers = generateListOfUsers(500);
        int postsCountMock = 1000;
        int commentsCountMock = 2000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(postsCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = statisticsClass.averagePostsPerUser;
        double avCommentsPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommentsPerPost = statisticsClass.averageCommentsPerPost;
        //Then
        Assertions.assertEquals(2, avPostsPerUser);
        Assertions.assertEquals(4, avCommentsPerUser);
        Assertions.assertEquals(2, averageCommentsPerPost);
    }

    @Test
    void testCalculateAdvStatistics0Users() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsers = generateListOfUsers(0);
        int postsCountMock = 1000;
        int commentsCountMock = 2000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(postsCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = statisticsClass.averagePostsPerUser;
        double avCommentsPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommentsPerPost = statisticsClass.averageCommentsPerPost;
        //Then
        Assertions.assertEquals(0, avPostsPerUser);
        Assertions.assertEquals(0, avCommentsPerUser);
        Assertions.assertEquals(2, averageCommentsPerPost);
    }

    @Test
    void testCalculateAdvStatistics100Users() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass(statisticsMock);
        List<String> listOfUsers = generateListOfUsers(100);
        int postsCountMock = 1000;
        int commentsCountMock = 2000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(postsCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double avPostsPerUser = statisticsClass.averagePostsPerUser;
        double avCommentsPerUser = statisticsClass.averageCommentsPerUser;
        double averageCommentsPerPost = statisticsClass.averageCommentsPerPost;
        //Then
        Assertions.assertEquals(10, avPostsPerUser);
        Assertions.assertEquals(20, avCommentsPerUser);
        Assertions.assertEquals(2, averageCommentsPerPost);
    }
}
