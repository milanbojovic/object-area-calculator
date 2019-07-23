package com.usermind.thread;

import com.usermind.shapes.Shape;

import java.util.concurrent.Callable;

public class Worker implements Callable<Double> {

    private Shape shape;

    public Worker(Shape shape) {
        this.shape = shape;
    }

    @Override
    public Double call() {
        return shape.calculateArea();
    }
}
