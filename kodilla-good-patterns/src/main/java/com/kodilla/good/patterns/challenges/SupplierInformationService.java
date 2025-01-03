package com.kodilla.good.patterns.challenges;

public class SupplierInformationService implements InformationService {

    @Override
    public void informAboutOrder(Supplier supplier, User user) {
        System.out.println("Informing about order for " + supplier.getName()  + "\n"
                + " customer " + user.getName() + " has ordered: " + supplier.getQuantity() + " " + supplier.getProduct());
    }
}
