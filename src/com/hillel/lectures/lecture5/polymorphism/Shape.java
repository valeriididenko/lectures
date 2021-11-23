package com.hillel.lectures.lecture5.polymorphism;

public abstract class Shape {

    protected String shapeName;
    protected int x;
    protected int y;

    public Shape(String shapeName, int x, int y) {
        this.shapeName = shapeName;
        this.x = x;
        this.y = y;
    }

    protected void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moving " + shapeName + " to location: x=" + this.x + ", y=" + this.y);
    }

    abstract double calculateSquare();

}