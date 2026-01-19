package com.example.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Inventory {
    private static final Logger logger = Logger.getLogger(Inventory.class.getName());
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, int quantity, double price) {
        products.add(new Product(name, quantity, price));
        logger.info("Product added.");
    }

    public void printInventory() {
        for (Product product : products) {
            logger.info(product.toString());
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Laptop", 5, 1000.0);
        inventory.printInventory();
    }
}
