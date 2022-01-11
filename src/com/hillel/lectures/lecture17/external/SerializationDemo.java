package com.hillel.lectures.lecture17.external;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static final String FILE_NAME = "external.txt";

    public static void main(String[] args) {
        User user = new User("Alex", 23);
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            user.writeExternal(objectOutputStream);
            System.out.println("Write object finished");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

}
