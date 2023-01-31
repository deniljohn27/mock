package com.example.mock;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;
    public String orderPizza(String name,String pizza) {
        return repository.orderPizza(name,pizza);
    }
}
