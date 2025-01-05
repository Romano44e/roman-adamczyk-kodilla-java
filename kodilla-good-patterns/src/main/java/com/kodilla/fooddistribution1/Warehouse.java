package com.kodilla.fooddistribution1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {

    String product;
    int quantityToOrder;

    public Warehouse(String product) {
        this.product = product;
    }

    public static List<Supplier> getHoneySuppliers() {

        Supplier honeySupplier1 = new Supplier("ExtraFoodShop", 50);
        Supplier honeySupplier2 = new Supplier("HealthyShop", 150);
        Supplier honeySupplier3 = new Supplier("GlutenFreeShop", 100);

        List<Supplier> suppliers = new ArrayList<>();
        suppliers.add(honeySupplier1);
        suppliers.add(honeySupplier2);
        suppliers.add(honeySupplier3);

        return suppliers;
    }

    public static List<Supplier> getEggsSuppliers() {

        Supplier eggSupplier1 = new Supplier("ExtraFoodShop", 200);
        Supplier eggSupplier2 = new Supplier("HealthyShop", 300);
        Supplier eggSupplier3 = new Supplier("GlutenFreeShop", 400);

        List<Supplier> suppliers = new ArrayList<>();
        suppliers.add(eggSupplier1);
        suppliers.add(eggSupplier2);
        suppliers.add(eggSupplier3);

        return suppliers;
    }


    public static Map<String, List<Supplier>> getProductsMap() {

        Map<String, List<Supplier>> productsMap = new HashMap<>();
        productsMap.put("honey", getHoneySuppliers());
        productsMap.put("eggs", getEggsSuppliers());

        return productsMap;
    }

}
