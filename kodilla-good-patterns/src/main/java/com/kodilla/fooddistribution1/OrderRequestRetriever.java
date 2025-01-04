package com.kodilla.fooddistribution1;

public class OrderRequestRetriever {

    public Supplier retrieveSupplierAndQuantityOrderRequest() {
        Supplier supplier = new Supplier("ExtraFoodShop", 5);
        return supplier;
    }

    public String retrieveProductOrderRequest() {
        String product = "Honey";
        return product;
    }
}
