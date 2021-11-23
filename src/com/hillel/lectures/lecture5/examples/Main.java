package com.hillel.lectures.lecture5.examples;

public class Main {

    public static void main(String[] args) {
        Person mike = new Person("Mike", 23);
        Cat barsik = new Cat("Barsik", mike);

        System.out.println(barsik);
    }

}