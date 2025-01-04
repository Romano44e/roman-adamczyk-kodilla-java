package com.kodilla.fooddistribution1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Product {

    private String productName;
    Deque<Supplier> supplierList = new ArrayDeque<>();

    public Product(String productName, Deque<Supplier> supplierList) {
        this.productName = productName;
        this.supplierList = supplierList;
    }

    public String getProductName() {
        return productName;
    }

    public Deque<Supplier> getSupplierList() {
        return supplierList;
    }
}
