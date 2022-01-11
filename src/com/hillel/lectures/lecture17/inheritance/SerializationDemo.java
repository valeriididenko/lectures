package com.hillel.lectures.lecture17.inheritance;

import com.hillel.lectures.lecture17.SerializationUtil;

public class SerializationDemo {

    public static final String FILE_NAME = "student.txt";

    public static void main(String[] args) {
        Student student = new Student("Nick", "Mick", 44, "ccc", "ONPU");
        SerializationUtil.writeObject(student, FILE_NAME);
    }

}
