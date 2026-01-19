package com.example.orders;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class OrderManager {
    private static final Logger logger = Logger.getLogger(OrderManager.class.getName());
    private List<CustomerOrder> orders = new ArrayList<>();

    public void addOrder(String customer, String order) {
        orders.add(new CustomerOrder(customer, order));
        logger.info("Order added for " + customer);
    }

    public void listOrders() {
        for (CustomerOrder co : orders) {
            logger.info(co.toString());
        }
    }

    public static void main(String[] args) {
        OrderManager om = new OrderManager();
        om.addOrder("Alice", "Laptop");
        om.addOrder("Bob", "Phone");
        om.listOrders();
    }
}
