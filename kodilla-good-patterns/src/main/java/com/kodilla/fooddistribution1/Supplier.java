package com.kodilla.fooddistribution1;

public class Supplier implements OrderService{

    private String supplierName;
    private int quantity;

    public Supplier(String supplierName, int quantity) {
        this.supplierName = supplierName;
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void process() {
        System.out.println("The product has been ordered from " + supplierName);
    }
}
