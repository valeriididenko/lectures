package com.hillel.lectures.lecture9;

import java.util.ArrayList;
import java.util.List;

public class BoxForMirrors {

    private List<Mirror> items = new ArrayList<>();

    public void putItem(Mirror item) {
        items.add(item);
    }

    public Mirror getItem(int index) {
        return items.get(index);
    }

    public List<Mirror> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }

}