package com.hillel.lectures.lecture9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static final Random random = new Random();

    public static void main(String[] args) {
//        List<Integer> integers = new ArrayList<>();
//        integers.add(12);
//        addRandomIntToList(integers);
//        System.out.println(integers);

//        Mirror mirror = new Mirror(2, 3);
//        Mirror mirror2 = new Mirror(23, 34);
//        Ball ball = new Ball("Adidas");
//
//        Box<Mirror> mirrorBox = new Box<>();
//        mirrorBox.putItem(mirror);
//        mirrorBox.putItem(mirror2);
//        mirrorBox.move();

//        Box<Ball> ballBox = new Box<>();
//        ballBox.putItem(ball);
//
//
//        BoxForMirrors boxForMirrors = new BoxForMirrors();
//        boxForMirrors.putItem(mirror);
//
//        System.out.println(mirrorBox);
//        System.out.println(ball);

//        Integer[] intArray = {1, 2, 3, 5};
//        String[] strings = {"User", "zxc"};
//
//        int x = printArray(intArray, "Hello");
//        System.out.println();
//        System.out.println(x);
//        System.out.println();

//        System.out.println();
//        printArray(strings, 2);
//        Mirror[] mirrors = new Mirror[2];
//        mirrors[0] = new Mirror(2,3);
//        System.out.println();
//        Mirror testMirror = printArray(mirrors, new Ball("czx"));
//        System.out.println(testMirror);

//        Pair<Mirror, Ball> pair = new Pair<>();
//        pair.setFirst(new Mirror(2, 5));
//        pair.setLast(new Ball("Nike"));
//        System.out.println(pair);


//        Object o = new String("asd");
//
//        List<String> strings = new ArrayList<>();
//        List<Object> objects = strings;


//        List<FragileObject> fragileObjects = new ArrayList<>();
//        fragileObjects.add(new Mirror(23, 4));
//        fragileObjects.add(new Glass(2, 3,4));
//        printFragileObjects(fragileObjects);
//
//        List<Mirror> mirrors = new ArrayList<>();
//        mirrors.add(new Mirror(1,1));
//        printFragileObjects(mirrors);
//
//        List<Glass> glasses = new ArrayList<>();
//        glasses.add(new Glass(2,3, 4));
//
//        List<Object> objects = new ArrayList<>();
//
//        printAnotherFragileObjects(mirrors);
//        printAnotherFragileObjects(fragileObjects);
//        printAnotherFragileObjects(objects);

//        Box<Number> numberBox = new Box<>();
//        System.out.println(numberBox);

        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        List<Long> longs = new ArrayList<>();
        longs.add(3L);
        addNumber(integers);
        addNumber(longs);

        List<Number> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4L);
        addAnotherNumber(numbers);
        List<Object> objects = new ArrayList<>();
        objects.add("sadasd");
        addAnotherNumber(objects);
    }

    private static void addRandomIntToList(List<Integer> list) {
        list.add(random.nextInt());
    }

    private static <T, E> T printArray(T[] array, E element) {
        System.out.println(element);
        for (T t : array) {
            System.out.print(t + " ");
        }
        return array[0];
    }

    private static void printFragileObjects(List<? extends FragileObject> fragileObjects) {
        for (FragileObject fragileObject : fragileObjects) {
            fragileObject.moveCarefully();
        }
    }

    private static void printAnotherFragileObjects(List<? super Mirror> fragileObjects) {
        for (Object fragileObject : fragileObjects) {
            System.out.println(fragileObject);
        }
    }

    private static void addNumber(List<? extends Number> numbers) {
        numbers.add(null);
    }

    private static void addAnotherNumber(List<? super Number> numbers) {
        numbers.add(random.nextInt());
        numbers.add(random.nextFloat());
        numbers.add(random.nextDouble());
    }

}