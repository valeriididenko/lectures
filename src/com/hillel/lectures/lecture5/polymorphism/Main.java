package com.hillel.lectures.lecture5.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        Circle circle = new Circle("circle", 0, 0, 12);
        Rectangle rectangle = new Rectangle("rectangle", 0, 0, 14, 3);
        shapes[0] = circle;
        shapes[1] = rectangle;

        drawData(rectangle);
        printShapes(shapes);

//        circle.getRadius();
//
//        Shape circleShape = circle;
//        circleShape.calculateSquare();
//        circleShape.moveTo(10, 2);
//
//        Serialize circleSerialize = circle;
//        circleSerialize.serialize();


//        Rectangle rectangle = new Rectangle("rectangle", 0, 0, 14, 3);
//
//        Shape circle2 = new Circle("circle 2", 0, 0,12);
//        Shape rectangle2 = new Rectangle("rectangle 2", 0, 0, 14, 3);
//
//        shapes[0] = circle;
//        shapes[1] = rectangle;
//
//        printShapes(shapes);
    }

    public static void drawData(Drawable drawable) {
        drawable.draw();
    }

    public static void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.moveTo(12, 3);
            shape.calculateSquare();
            System.out.println();
        }

    }

}