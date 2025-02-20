package main.com.maiboroda.stack;

public interface Stack {
    void push(Object value);
    Object pop();
    boolean isEmpty();
    Object peek();
    boolean contains(Object value);
    int size();
    void clear();
}
