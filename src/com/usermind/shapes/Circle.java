package com.usermind.shapes;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return r * r * Math.PI;
    }
}
