package com.hillel.lectures.lecture9;

public class Mirror extends FragileObject implements Cloneable {

    private int width;
    private int height;

    public Mirror(int width, int height) {
        this.width = width;
        this.height = height;
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

    @Override
    public String toString() {
        return "Mirror{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void moveCarefully() {
        System.out.println("Moving Mirror carefully");
    }

    @Override
    public Mirror clone() {
        try {
            Mirror clone = (Mirror) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
