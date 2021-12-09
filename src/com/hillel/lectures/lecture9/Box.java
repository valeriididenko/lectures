package com.hillel.lectures.lecture9;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> items = new ArrayList<>();

    public void putItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public List<T> getItems() {
        return items;
    }

//    public void move() {
//        for (T item : items) {
//            item.moveCarefully();
//        }
//    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }

}