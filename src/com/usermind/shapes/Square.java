package com.usermind.shapes;

public class Square implements Shape {

    private double x;

    public Square(double x) {
        this.x = x;
    }

    @Override
    public double calculateArea() {
        return x * x;
    }

}
