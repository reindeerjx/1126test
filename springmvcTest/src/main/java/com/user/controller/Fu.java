package com.user.controller;

public class Fu {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fu() {
        System.out.println("这是父类无参构造");
    }

    public Fu(String name) {
        this.name = name;
        System.out.println("这是父类有参构造"+name);
    }
}
