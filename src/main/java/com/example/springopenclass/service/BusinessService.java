package com.example.springopenclass.service;

import com.example.springopenclass.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }

}
