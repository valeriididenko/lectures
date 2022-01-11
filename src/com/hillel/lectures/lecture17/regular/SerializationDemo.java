package com.hillel.lectures.lecture17.regular;

import com.hillel.lectures.lecture17.Person;
import com.hillel.lectures.lecture17.SerializationUtil;

public class SerializationDemo {

    public static final String FILE_NAME = "person.txt";

    public static void main(String[] args) {
        Person alex = new Person("Alex", "Clark", 23, "asdasdasd");
        SerializationUtil.writeObject(alex, FILE_NAME);
    }

}
