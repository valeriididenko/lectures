package com.hillel.lectures.lecture9;

public class Glass extends FragileObject {

    private int width;
    private int height;
    private int depth;

    public Glass(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Mirror{" +
                "width=" + width +
                ", height=" + height +
                ", tolshina=" + depth +
                '}';
    }

    @Override
    public void moveCarefully() {
        System.out.println("Moving Glass carefully");
    }
}
