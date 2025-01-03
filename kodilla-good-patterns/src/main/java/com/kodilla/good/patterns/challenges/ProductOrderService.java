package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean orderProduct(Supplier supplier, User user) {
        System.out.println("Ordering person: " + user.getName() + " \n"
                + "Ordering from: " + supplier.getName() + " \n"
                + "product: " + supplier.getProduct() + " \n"
                + "quantity: " + supplier.getQuantity());

        return true;
    }

}
