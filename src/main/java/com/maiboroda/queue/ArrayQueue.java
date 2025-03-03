package com.maiboroda.queue;

public class ArrayQueue implements Queue{
    private Object array[];
    private int size;

    public ArrayQueue(){
        array = new Object[10];
    }

    @Override
    public void engueue(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public Object dequeue() {
        if(size==0){
            throw new IllegalStateException("Queue is empty");
        }
        Object value = array[0];
        for(int i = 0; i < size; i++){
            array[i] = array[i+1];
        }
        size--;
        return value;
    }

    @Override
    public Object peek() {
        return array[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object value) {
        for(int i = 0; i < size; i++){
            Object valueInEqueu = array[i];
            if(value.equals(valueInEqueu)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size=0;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        String result = "[";
        for(int i = 0; i < size; i++){
            result += array[i];
            if (i < size - 1){
                result += ", ";
            }
        }
        return result +"]";
    }
}
