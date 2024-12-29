package com.kodilla.fooddistribution;

public class OrderService {

    public boolean orderFood(Supplier supplier, User user) {
        System.out.println("Ordering person: " + user.getName() + " \n"
                + "Ordering from: " + supplier.getName() + " \n"
                + "product: " + supplier.getProduct() + " \n"
                + "quantity: " + supplier.getQuantity());

        return true;
    }
}
