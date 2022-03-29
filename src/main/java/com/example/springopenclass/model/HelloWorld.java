package com.example.springopenclass.model;

public class HelloWorld {
    String value = "HelloWorld!";
    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
