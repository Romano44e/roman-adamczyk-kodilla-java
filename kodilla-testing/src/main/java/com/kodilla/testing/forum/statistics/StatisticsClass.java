package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsClass {

    private Statistics statistics;

    public StatisticsClass(Statistics statistics) {
        this.statistics = statistics;
    }

    double usersCount;
    double postsCount;
    double commentsCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


    public List<Double> calculateAdvStatistics(Statistics statistics) {
        List<Double> statisticsList = new ArrayList<Double>();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averagePostsPerUser = postsCount / (double) usersCount;
        averageCommentsPerUser = commentsCount / (double) usersCount;
        averageCommentsPerPost = commentsCount / (double) postsCount;
        statisticsList.add(0, usersCount);
        statisticsList.add(1, postsCount);
        statisticsList.add(2, commentsCount);
        statisticsList.add(3, averagePostsPerUser);
        statisticsList.add(4, averageCommentsPerUser);
        statisticsList.add(5, averageCommentsPerPost);
        return statisticsList;
    }

    public String showStatistics(Statistics statistics) {
        return "liczba użytkowników to : " + usersCount + ". " +
                "liczba postów to : " + postsCount + ". " +
                "liczba komentarzy to : " + commentsCount + ". " +
                "średnia liczba postów na użytkownika to : " + averagePostsPerUser + ". " +
                "średnia liczba komentarzy na użytkownika to : " + averageCommentsPerUser + ". " +
                "średnia liczba komentarzy na post to : " + averageCommentsPerPost + ".";
    }
}
