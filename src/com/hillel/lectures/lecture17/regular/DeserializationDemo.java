package com.hillel.lectures.lecture17.regular;

import com.hillel.lectures.lecture17.Person;
import com.hillel.lectures.lecture17.SerializationUtil;

public class DeserializationDemo {

    public static final String FILE_NAME = "person.txt";

    public static void main(String[] args) {
        Person person = (Person) SerializationUtil.readObject(FILE_NAME);
        System.out.println(person);
    }

}
