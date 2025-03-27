package com.maiboroda.stack;

public interface Stack<E> {
    void push(E value);
    E pop();
    boolean isEmpty();
    E peek();
    boolean contains(E value);
    int size();

    void clear();
}
