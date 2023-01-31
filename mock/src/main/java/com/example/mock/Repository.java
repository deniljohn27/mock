package com.example.mock;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Repository
public class Repository {

    Map<Integer,Customer> customerMap=new HashMap<>();
    Map<String,String> map=new HashMap<>();

        public String orderPizza(String name,int phone,String address,String pizza){
            Customer cust=new Customer(name,phone,address,pizza);
            if(!customerMap.containsKey(cust.getPhoneNumber())){
                customerMap.put(cust.getPhoneNumber(),cust);
            }
            map.put(name, pizza);

            return "Request placed";
        }

}
