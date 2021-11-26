package com.hillel.lectures.lecture6;

import java.util.Arrays;

public class AwesomeStack implements MyStack {

    private Object[] objects;
    private int capacity = 10;
    private int pointer = -1;
    private static final int RAISE_FACTOR = 2;

    public AwesomeStack() {
        this.objects = new Object[capacity];
    }

    public AwesomeStack(int capacity) {
        this.capacity = capacity;
        this.objects = new Object[capacity];
    }

    public AwesomeStack(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public void push(Object o) {
        pointer++;
        increaseCapacityIfNeeded();
        objects[pointer] = o;
    }

    private void increaseCapacityIfNeeded() {
        if (pointer > objects.length - 1) {
            int newLength = capacity * RAISE_FACTOR;
            Object[] newArray = new Object[newLength];
            System.arraycopy(objects, 0, newArray, 0, objects.length);
            objects = newArray;
            capacity = newLength;
        }
    }

    @Override
    public Object pop() {
        Object removedObject = objects[pointer];
        objects[pointer] = null;
        pointer--;
        return removedObject;
    }

    @Override
    public Object peek() {
        return objects[pointer];
    }

    @Override
    public boolean isEmpty() {
        return pointer == -1;
    }

    @Override
    public String toString() {
        return "AwesomeStack{" +
                "objects=" + Arrays.toString(objects) +
                ", capacity=" + capacity +
                '}';
    }

}
