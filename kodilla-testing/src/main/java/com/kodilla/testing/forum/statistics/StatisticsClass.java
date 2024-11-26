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
        if (usersCount == 0) {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        } else {
            averagePostsPerUser = postsCount / usersCount;
            averageCommentsPerUser = commentsCount / usersCount;
        }
        if (postsCount == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = commentsCount / postsCount;
        }
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
