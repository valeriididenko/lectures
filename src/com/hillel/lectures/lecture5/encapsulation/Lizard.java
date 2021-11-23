package com.hillel.lectures.lecture5.encapsulation;

public class Lizard extends Reptile {

    boolean isWaterfowl;

    public Lizard(int weight, String name, boolean isWaterfowl) {
        super(weight, name);
        this.isWaterfowl = isWaterfowl;
    }

    void swim() {
        System.out.println(name + " is swimming");
    }

}
