package com.hillel.lectures.lecture9;

public class Pair<T, E> {

    private T first;
    private E last;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public E getLast() {
        return last;
    }

    public void setLast(E last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

}
