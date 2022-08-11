package com.ex.user.model.decorator;

public class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape decoratedShape) {
        shape = decoratedShape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
