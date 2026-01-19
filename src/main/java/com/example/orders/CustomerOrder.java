package com.example.orders;

public class CustomerOrder {
    private String customer;
    private String order;

    public CustomerOrder(String customer, String order) {
        this.customer = customer;
        this.order = order;
    }

    public String getCustomer() { return customer; }
    public String getOrder() { return order; }

    @Override
    public String toString() {
        return "Customer: " + customer + ", Order: " + order;
    }
}
