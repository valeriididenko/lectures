package com.hillel.lectures.lecture17.inheritance;

import com.hillel.lectures.lecture17.SerializationUtil;

public class DeserializationDemo {

    public static final String FILE_NAME = "student.txt";

    public static void main(String[] args) {
        Student student = (Student) SerializationUtil.readObject(FILE_NAME);
        System.out.println(student);
    }

}
