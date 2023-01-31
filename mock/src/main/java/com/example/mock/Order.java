package com.example.mock;

public class Order {
    private String customerName;
    private String pizza;

    public Order() {

    }

    public Order(String customerName, String pizza) {
        this.customerName = customerName;
        this.pizza = pizza;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }
}
