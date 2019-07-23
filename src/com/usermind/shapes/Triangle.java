package com.usermind.shapes;

public class Triangle implements Shape {

    private double a;

    public Triangle(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return ((a * a) * (Math.sqrt(3))) / 4;
    }
}
