package com.maiboroda.queue;

public interface Queue {
    void engueue(Object value);
    Object dequeue();
    Object peek();
    int size();
    boolean isEmpty();
    boolean contains(Object value);
    void clear();

    String toString();
}
