package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User adam = new ZGeneration("Adam");
        User piotr = new YGeneration("Piotr");
        User pawel = new Millenials("Pawel");

        //When
        String adamSharePost = adam.sharePost();
        System.out.println("Adam has shared post on " + adamSharePost);
        String piotrSharePost = piotr.sharePost();
        System.out.println("Piotr has shared post on " + piotrSharePost);
        String pawelSharePost = pawel.sharePost();
        System.out.println("Pawel has shared post on " + pawelSharePost);

        //Then
        assertEquals("Snapchat", adamSharePost);
        assertEquals("Facebook", piotrSharePost);
        assertEquals("Twitter", pawelSharePost);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User adam = new ZGeneration("Adam");

        //When
        String adamSharePost = adam.sharePost();
        System.out.println("Adam has shared post on " + adamSharePost);
        adam.setSocialPublisher(new TwitterPublisher());
        adamSharePost = adam.sharePost();
        System.out.println("Adam has shared post on " + adamSharePost);

        //Then
        assertEquals("Twitter", adamSharePost);

    }

}
