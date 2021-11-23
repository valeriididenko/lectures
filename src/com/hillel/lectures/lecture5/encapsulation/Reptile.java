package com.hillel.lectures.lecture5.encapsulation;

public abstract class Reptile extends Animal {

    public Reptile(int weight, String name) {
        super(weight, name);
    }

    @Override
    void eat() {
        System.out.println(name + " is crunching");
    }

    void crawl() {
        System.out.println(name + " am crawling to the friend");
    }

}