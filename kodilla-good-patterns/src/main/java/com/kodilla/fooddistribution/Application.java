package com.kodilla.fooddistribution;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieveOrderRequest();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderService());
        orderProcessor.process(orderRequest);
    }
}
