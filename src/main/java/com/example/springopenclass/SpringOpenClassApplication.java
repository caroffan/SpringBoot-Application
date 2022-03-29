package com.example.springopenclass;

import com.example.springopenclass.model.HelloWorld;
import com.example.springopenclass.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOpenClassApplication implements CommandLineRunner {

    @Autowired
    private BusinessService bs;

    public static void main(String[] args) {

        SpringApplication.run(SpringOpenClassApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        HelloWorld hw = bs.getHelloWorld();
        System.out.println(hw);
    }
}
