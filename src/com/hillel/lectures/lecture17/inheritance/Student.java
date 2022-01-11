package com.hillel.lectures.lecture17.inheritance;

import com.hillel.lectures.lecture17.Person;

public class Student extends Person {

    private String university;

    public Student(String name, String surname, int age, String password, String university) {
        super(name, surname, age, password);
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student{" +
                "university='" + university + '\'' +
                '}';
    }

}