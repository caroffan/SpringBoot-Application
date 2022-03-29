package com.example.springopenclass;

import com.example.springopenclass.model.HelloWorld;
import com.example.springopenclass.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringOpenClassApplicationTests {
    @Autowired
    private BusinessService bs;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetHelloWorld() {

        HelloWorld hw = bs.getHelloWorld();
        assertEquals("HelloWorld!", hw.getValue());

    }

}
