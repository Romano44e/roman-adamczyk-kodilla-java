package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private Supplier supplier;

    public OrderRequest(User user, Supplier supplier) {
        this.user = user;
        this.supplier = supplier;
    }

    public User getUser() {
        return user;
    }

    public Supplier getSupplier() {
        return supplier;
    }

}
