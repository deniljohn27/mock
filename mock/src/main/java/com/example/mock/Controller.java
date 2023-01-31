package com.example.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Service service;

    @PostMapping("/order")
    public String orderPizza(@RequestParam("name") String name,
                             @RequestParam("number") int number,
                             @RequestParam("address") String address,
                             @RequestParam("pizza") String pizza ){
        return service.orderPizza(name,pizza);
    }

}
