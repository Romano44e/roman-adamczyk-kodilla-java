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


    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averagePostsPerUser = postsCount / usersCount;
        averageCommentsPerUser = commentsCount / usersCount;
        averageCommentsPerPost = commentsCount / postsCount;
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
