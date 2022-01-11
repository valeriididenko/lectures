package com.hillel.lectures.lecture17.external;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static final String FILE_NAME = "external.txt";

    public static void main(String[] args) {
        try (
                FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            User user = new User();
            user.readExternal(objectInputStream);
            System.out.println(user);
            System.out.println("read object finished");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
