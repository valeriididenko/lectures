package com.hillel.lectures.lecture7;

public class AwesomeLinkedList {

    private int size = 0;
    private Node first;
    private Node last;

    public Object get(int index) {
        Node current = first;
        Object object = null;
        for (int i = 0; i < size / 2; i++) {
            if (index == i) {
                object = current.item;
                break;
            } else {
                current = current.next;
            }
        }
        return object;
    }

    private static class Node {
        Object item;
        Node prev;
        Node next;

        public Node(Object item, Node prev, Node next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

}