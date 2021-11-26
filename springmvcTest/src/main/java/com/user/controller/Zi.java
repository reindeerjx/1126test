package com.user.controller;

public class Zi extends Fu{
    public String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zi() {

        System.out.println("子类无参构造");
    }

    public Zi(String name) {
        super("lisi");
        this.name = name;
        System.out.println("子类有参构造");
    }
}
