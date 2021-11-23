package com.hillel.lectures.lecture5.encapsulation;

public abstract class Animal {

    protected int weightInKg;
    protected String name;

    public Animal(int weightInKg, String name) {
        this.weightInKg = weightInKg;
        this.name = name;
    }

    abstract void eat();

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

}