package com.example.demo;

public class Market {
    private String name;
    private String code;

    public Market() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Object2{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
