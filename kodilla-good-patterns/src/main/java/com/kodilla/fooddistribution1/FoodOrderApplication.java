package com.kodilla.fooddistribution1;

import java.util.ArrayDeque;
import java.util.Deque;

public class FoodOrderApplication {

    public static void main(String[] args) {


        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever("honey", "HealthyShop", 50);
        OrderRequestProcessor orderRequestProcessor = new OrderRequestProcessor();
        orderRequestProcessor.processOrder(orderRequestRetriever);

    }
}