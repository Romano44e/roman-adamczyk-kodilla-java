package com.kodilla.fooddistribution1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class FoodOrderApplication {

    public static void main(String[] args) {

        Supplier supplier1 = new Supplier("HealthyShop", 10);
        Supplier supplier2 = new Supplier("GlutenFreeShop", 20);
        Supplier supplier3 = new Supplier("ExtraFoodShop", 15);

        Deque<Supplier> supplierList = new ArrayDeque<>();
        supplierList.add(supplier1);
        supplierList.add(supplier2);
        supplierList.add(supplier3);

        HoneyWarehouse honeyWarehouse = new HoneyWarehouse(new Product("Honey", supplierList));

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        Supplier supplier = orderRequestRetriever.retrieveSupplierAndQuantityOrderRequest();
        String orderingProduct = orderRequestRetriever.retrieveProductOrderRequest();

        if (orderingProduct.equals("Honey")) {
            boolean supplierProductAvailibility = honeyWarehouse.isSupplierProductAvailable(supplier.getSupplierName(), supplier.getQuantity());
            if (supplierProductAvailibility) {
                supplier.process();
                System.out.println("Product has been ordered in quantity of " + supplier.getQuantity());
            } else {
                boolean productAvailibility = honeyWarehouse.isProductAvailable(supplier.getSupplierName(), supplier.getQuantity());
                if (productAvailibility) {
                    System.out.println("product is available considering all suppliers");
                    for (Supplier suppliers : supplierList) {
                        suppliers.process();
                    }
                    System.out.println("Product has been ordered in quantity of " + supplier.getQuantity());
                } else {
                    System.out.println("product is not available considering all suppliers");
                }
            }
        } else {
            System.out.println("We do not sell this product, enter the name of another product");
        }
    }
}