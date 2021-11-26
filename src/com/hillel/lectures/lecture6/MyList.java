package com.hillel.lectures.lecture6;

public interface MyList {

    /**
     * @return the number of elements in this list
     */
    int size();

    /**
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Returns true if this list contains the specified element.
     *
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    boolean contains(Object o);

    /**
     * Appends the specified element to the end of this list including null references.
     *
     * @param o element to be appended to this list
     * @return true if this list changed as a result of the call
     */
    boolean add(Object o);

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If this list does not contain
     *
     * @param o element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
    boolean remove(Object o);

    /**
     * Removes the element at the specified position in this list
     * Shifts any subsequent elements to the left (subtracts one
     * from their indices).  Returns the element that was removed from the
     * list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    Object remove(int index);

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the original order.
     *
     * @param list collection containing elements to be added to this list
     * @return true if this list changed as a result of the call
     */
    boolean addAll(MyList list);

    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call.
     */
    void clear();

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    Object get(int index);

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param o     element to be placed at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    Object set(int index, Object o);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param o     element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    void add(int index, Object o);

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element
     */
    int indexOf(Object o);

    /**
     * Returns a portion of this list between the specified
     * fromIndex, inclusive, and to the end of this list.  (If
     * fromIndex is equal to size of this list,
     * the returned list is empty.)
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @return a portion of the specified range within this list
     * @throws IndexOutOfBoundsException for an illegal endpoint index value
     */
    MyList subList(int fromIndex);

    /**
     * Returns a portion of this list between the specified
     * fromIndex, inclusive, and toIndex, exclusive.  (If
     * fromIndex and toIndex are equal, the returned list is
     * empty.)
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex   high endpoint (exclusive) of the subList
     * @return a portion of the specified range within this list
     * @throws IndexOutOfBoundsException for an illegal endpoint index value
     */
    MyList subList(int fromIndex, int toIndex);

    /**
     * Trim collection if the actual size of the collection is less than
     * capacity more than two times
     */
    void trimToSize();

}