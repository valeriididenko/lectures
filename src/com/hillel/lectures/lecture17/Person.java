package com.hillel.lectures.lecture17;

import java.io.Serializable;

public class Person implements Serializable {

    public static String eyes = "two";

    private String name;
    private String surname;
    private int age;
    private transient String password;

    public Person(String name, String surname, int age, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

}