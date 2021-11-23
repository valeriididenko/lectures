package com.hillel.lectures.lecture5.polymorphism;

public class Circle extends Shape implements Serialize {

    private double radius;

    public Circle(String objectName, int x, int y, double radius) {
        super(objectName, x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateSquare() {
        double square = Math.PI * Math.sqrt(radius);
        System.out.println(shapeName + " square is " + square);
        return square;
    }

    @Override
    public void serialize() {
        System.out.println("Serializing " + shapeName);
    }

}