package com.hillel.lectures.lecture9;

public class Ball {

    private String model;

    public Ball(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "model='" + model + '\'' +
                '}';
    }

}
