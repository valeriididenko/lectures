package com.hillel.lectures.lecture6;

public interface MyStack {

    /**
     * adds element on top of the stack
     *
     * @param o - element to add
     */
    void push(Object o);

    /**
     * removes element from top of the stack
     *
     * @return removed element
     */
    Object pop();

    /**
     * check the top element of the stack
     *
     * @return element on top of the stack
     */
    Object peek();

    /**
     * checks if the stack is empty
     *
     * @return return true if stack is empty
     */
    boolean isEmpty();

}
