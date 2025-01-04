package com.kodilla.fooddistribution1;

public class HoneyWarehouse {

    Product product;
    int quantityToOrder;

    public HoneyWarehouse(Product product) {
        this.product = product;
    }

    public boolean isSupplierProductAvailable(String supplierName, int quantityToOrder) {
        int quantityInWarehouse = 0;
        for (Supplier supplier : product.getSupplierList()) {
            if (supplier.getSupplierName().equals(supplierName)) {
                int SupplierProductQuantity = supplier.getQuantity();
                quantityInWarehouse += SupplierProductQuantity;
            }
        }
        if (quantityToOrder > quantityInWarehouse) {
            System.out.println("supplier " + supplierName + " does not have in stock " + quantityToOrder
                    + " pieces of the product.");
            return false;
        } else {
            System.out.println("supplier " + supplierName + " has in stock " + quantityToOrder
                    + " pieces of the product.");
            return true;
        }
    }

    public boolean isProductAvailable(String supplierName, int quantityToOrder) {
        int quantityInWarehouse = 0;
        for (Supplier supplier : product.getSupplierList()) {
                int SupplierProductQuantity = supplier.getQuantity();
                quantityInWarehouse += SupplierProductQuantity;
        }
        if (quantityToOrder > quantityInWarehouse) {
            return false;
        } else {
            return true;
        }
    }

    public Product getProduct() {
        return product;
    }
}
