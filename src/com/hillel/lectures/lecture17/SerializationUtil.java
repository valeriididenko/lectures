package com.hillel.lectures.lecture17;

import java.io.*;

public class SerializationUtil {

    public static void writeObject(Object object, String fileName) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(object);
            System.out.println("Object serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readObject(String filename) {
        try (
                FileInputStream fileInputStream = new FileInputStream(filename);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}