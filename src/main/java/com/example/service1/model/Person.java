package com.example.service1.model;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private int age;
    private Map<String, String> info = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    public void addInfo(String key, String value) {
        this.info.put(key, value);
    }
}