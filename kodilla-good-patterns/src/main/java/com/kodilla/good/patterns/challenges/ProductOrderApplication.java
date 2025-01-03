package com.kodilla.good.patterns.challenges;

public class ProductOrderApplication {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieveOrderRequest();

        OrderProcessor ProductOrderProcessor = new OrderProcessor(new ProductOrderService(), new SupplierInformationService());
        ProductOrderProcessor.process(orderRequest);
    }
}
