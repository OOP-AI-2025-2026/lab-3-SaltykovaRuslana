package org.example.task2;

import java.util.EmptyStackException;

public class IntStack {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntStack() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void push(int element) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return  elements[--size];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
         }
        return elements[size - 1];
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public void clear() {
        this.size = 0;
    }

    private void grow() {
        int newCapacity = elements.length * 2;
        int[] newElements = new int[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
}
