package com.maiboroda.stack;

public class ArrayStack<E> implements Stack<E> {
    private E[] array;
    private int size;

    public ArrayStack() {
        array = (E[]) new Object[10];
    }
    public ArrayStack(int initialCapacity) {
        array = (E[]) new Object[initialCapacity];
    }


    @Override
    public void push(E value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }

    @Override
    public E pop() {
        if(size == 0){
            throw new IllegalStateException("Stack is empty");
        }
       E result = array[size-1];
        size--;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size==0;

    }

    @Override
    public E peek() {
        return array[size -1];
    }

    @Override
    public boolean contains(E value) {
       for(int i = 0; i < size; i++){
           E valueInStack = array[i];
           if(value.equals(valueInStack)){
               return true;
           }
       }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    private void ensureCapacity() {
        if(size == array.length) {
            E[] newArray = (E[])new Object[array.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
}


