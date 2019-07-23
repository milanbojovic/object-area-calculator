package com.usermind;

import com.usermind.shapes.Circle;
import com.usermind.shapes.Square;
import com.usermind.shapes.Triangle;
import com.usermind.thread.Worker;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Program should be executed with exactly one arg");
            System.exit(1);
        }
        int x = Integer.parseInt(args[0]);

        ExecutorService service = Executors.newFixedThreadPool(3);

        Future<Double> f1 = service.submit(new Worker(new Circle(x)));
        Future<Double> f2 = service.submit(new Worker(new Square(x)));
        Future<Double> f3 = service.submit(new Worker(new Triangle(x)));

        try {
            System.out.printf("%.2f,%.2f,%.2f,%.2f", f1.get(), f2.get(), f3.get(), f1.get() + f2.get() + f3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }
}
