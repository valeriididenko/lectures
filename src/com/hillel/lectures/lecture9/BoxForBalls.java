package com.hillel.lectures.lecture9;

import java.util.ArrayList;
import java.util.List;

public class BoxForBalls {

    private List<Ball> items = new ArrayList<>();

    public void putItem(Ball item) {
        items.add(item);
    }

    public Ball getItem(int index) {
        return items.get(index);
    }

    public List<Ball> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }

}