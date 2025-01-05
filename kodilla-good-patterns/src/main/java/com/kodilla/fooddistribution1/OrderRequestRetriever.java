package com.kodilla.fooddistribution1;

public class OrderRequestRetriever {

    String orderProductName;
    String storeName;
    int quantity;

    public OrderRequestRetriever(String productName, String storeName, int quantity) {
        this.orderProductName = productName;
        this.storeName = storeName;
        this.quantity = quantity;
    }

    public String getOrderProductName() {
        return orderProductName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStoreName() {
        return storeName;
    }
}
