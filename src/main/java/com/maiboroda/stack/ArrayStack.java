package com.maiboroda.stack;

public class ArrayStack implements Stack {
    private Object[] array;
    private int size;

    public ArrayStack() {
        array = new Object[10];
    }
    public ArrayStack(int initialCapacity) {
        array = new Object[initialCapacity];
    }


    @Override
    public void push(Object value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }

    @Override
    public Object pop() {
        if(size == 0){
            throw new IllegalStateException("Stack is empty");
        }
       Object result = array[size-1];
        size--;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size==0;

    }

    @Override
    public Object peek() {
        return array[size -1];
    }

    @Override
    public boolean contains(Object value) {
       for(int i = 0; i < size; i++){
           Object valueInStack = array[i];
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
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
}


