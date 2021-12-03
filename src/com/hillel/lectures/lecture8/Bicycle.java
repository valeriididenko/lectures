package com.hillel.lectures.lecture8;

public class Bicycle {

    private String model;

    public Bicycle(String model) {
        this.model = model;
    }

    public class HandleBar {

        private int width;

        public HandleBar(int width) {
            this.width = width;
        }

        public void turnRight() {
            System.out.println("Turning right for " + model);
        }

        public void turnLeft() {
            System.out.println("Turning left for " + model);
        }

        public int getWidth() {
            return width;
        }

        public void info() {
            System.out.println("Handle bar for bicycle: " + model);
        }

    }

    public class Seat {

        private int height;

        public Seat(int height) {
            this.height = height;
        }

        public void seatUp() {
            height += 10;
            System.out.println("New height is " + height);
        }

        public void seatDown() {
            height -= 10;
            System.out.println("New height is " + height);
        }

        public int getHeight() {
            return height;
        }

    }

    public void ride() {
        System.out.println("Riding forward");
    }

    public String getModel() {
        return model;
    }

}