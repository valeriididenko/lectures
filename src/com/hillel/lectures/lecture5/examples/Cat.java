package com.hillel.lectures.lecture5.examples;

public class Cat extends Animal {

    String name;
    Person owner;

    public Cat(String name, Person owner) {
        super(234234);
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "asdasd=" + asdasd +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }

}