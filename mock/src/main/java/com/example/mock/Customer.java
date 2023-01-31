package com.example.mock;

public class Customer {
    private String custName;
    private  int phoneNumber;
    private String address;
    private String favPizza;

    public Customer() {
    }

    public Customer(String custName, int phoneNumber, String address, String favPizza) {
        this.custName = custName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.favPizza = favPizza;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFavPizza() {
        return favPizza;
    }

    public void setFavPizza(String favPizza) {
        this.favPizza = favPizza;
    }
}
