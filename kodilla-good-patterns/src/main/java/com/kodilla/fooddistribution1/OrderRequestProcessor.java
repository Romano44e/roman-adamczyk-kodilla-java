package com.kodilla.fooddistribution1;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class OrderRequestProcessor {

    public boolean processOrder(OrderRequestRetriever orderRequestRetriever) {

        Map<String, List<Supplier>> productsMap = Warehouse.getProductsMap();

        boolean isProductInStock = productsMap.containsKey(orderRequestRetriever.getOrderProductName());

        if (isProductInStock) {
            System.out.println("Product found with name " + orderRequestRetriever.getOrderProductName()
                    + ".\nverification of the product availibility in progress...\n");
            for (Map.Entry<String, List<Supplier>> entry : productsMap.entrySet()) {
                if (entry.getKey().equals(orderRequestRetriever.getOrderProductName())) {
                    List<Supplier> value = entry.getValue();
                        for (Supplier supplier1 : value) {
                            int suppliersQuantity = supplier1.getQuantity();
                            String supplierName = supplier1.getSupplierName();
                            System.out.println(supplierName + ": " + suppliersQuantity);
                    }
                    System.out.println();
                    System.out.println("Choose store and quantity to process your order \n");
                    // normalnie metoda scanner ale w tym przykładzie korzystam w OrderRequest Retrievera
                    String storeName = orderRequestRetriever.getStoreName();
                    int quantity = orderRequestRetriever.getQuantity();
                    Supplier supplier = new Supplier(storeName, quantity);
                    supplier.process();
                }
            }

            return true;
        } else {
            System.out.println("No product found with name " + orderRequestRetriever.getOrderProductName());
            return false;
        }
    }
}
