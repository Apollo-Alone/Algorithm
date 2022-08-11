package com.ex.user.model.decorator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("out Rectangle");
    }
}
