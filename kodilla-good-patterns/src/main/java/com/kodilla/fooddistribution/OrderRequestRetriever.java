package com.kodilla.fooddistribution;

import java.util.Scanner;

public class OrderRequestRetriever {

    public OrderRequest retrieveOrderRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        System.out.println("Wpisz dostawcę: ");
        String supplier = scanner.nextLine();
        System.out.println("Wpisz produkt: ");
        String product = scanner.nextLine();
        System.out.println("Wpisz ilość: ");
        int quantity = scanner.nextInt();
        Supplier supplier1 = new Supplier(supplier, product, quantity);

        return new OrderRequest(user, supplier1);
    }
}
