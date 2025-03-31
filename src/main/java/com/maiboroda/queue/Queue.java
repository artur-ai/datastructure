package com.maiboroda.queue;

public interface Queue<E> {
    void engueue(E value);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();
    boolean contains(E value);
    void clear();

    String toString();
}
