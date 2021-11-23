package com.hillel.lectures.lecture5.polymorphism;

public class Rectangle extends Shape implements Drawable {

    private double length;
    private double width;

    public Rectangle(String objectName, int x, int y, double length, double width) {
        super(objectName, x, y);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateSquare() {
        double square = length * width;
        System.out.println(shapeName + " square is " + square);
        return square;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + shapeName + " at location: x=" + x + ", y=" + y);
    }

}