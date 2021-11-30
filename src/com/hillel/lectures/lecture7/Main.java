package com.hillel.lectures.lecture7;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int x = 10;
        int numberIndex = random.nextInt(6);
        int[] numbers = new int[2];
        numbers[0] = 0;
        numbers[1] = 2;

        System.out.println("x=" + x + ", numberIndex=" + numberIndex);

        try {
            double result = divide(x, numbers[numberIndex]);
            System.out.println(x + " / " + numbers[numberIndex] + " = " + result);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Hello from finally");
        }

        System.out.println("Goodbye!");


        try {
            readFromFile();
        } catch (MyCustomException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println();

        LinkedList<String> list = new LinkedList<>();
        list.add("User");
        list.add("Name");
        System.out.println(list);
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static void readFromFile() throws MyCustomException {
        System.out.println("read");
        throw new MyCustomException("it happens");
    }

}